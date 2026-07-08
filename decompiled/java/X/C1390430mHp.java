package X;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0mHp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1390430mHp extends FrameLayout implements C16FG {
    public boolean LL;
    public final C1390410mHn LLILLJJLI;
    public int LLILLL;
    public final C01GW LLILZ;
    public final ViewTreeObserverOnScrollChangedListenerC1390440mHq LLILZIL;

    private final C1351210lGZ getVibrationHelper() {
        return (C1351210lGZ) this.LLILZ.getValue();
    }

    @Override // X.C16FG
    public int getActualHeight() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
    }

    public final void LIZJ() {
        Object parent = getParent();
        View view = parent instanceof View ? (View) parent : null;
        int i = 0;
        boolean z = view != null && view.getScrollY() < getActualHeight();
        if (!this.LL && !z) {
            i = 4;
        }
        if (getVisibility() != i) {
            int visibility = getVisibility();
            setVisibility(i);
            C1602160rnK.LIZIZ(visibility, i, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C786410Ut5.z3(getViewTreeObserver(), this.LLILZIL);
        LIZJ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C786410Ut5.E3(getViewTreeObserver(), this.LLILZIL);
        super.onDetachedFromWindow();
    }

    @Override // X.C16FG
    public final void LIZIZ(boolean z) {
        this.LL = z;
        if (z) {
            this.LLILLJJLI.LIZJ();
        } else {
            this.LLILLJJLI.LIZLLL();
        }
        LIZJ();
    }

    @Override // X.C16FG
    public final void onHiddenChanged(boolean z) {
        if (z) {
            this.LLILLJJLI.LIZLLL();
        } else if (this.LL) {
            this.LLILLJJLI.LIZJ();
        }
        LIZJ();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        C786410Ut5.LLLZZIL(this.LLILLJJLI, i);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0mHq] */
    public C1390430mHp(Context context, int i) {
        super(context);
        C1390410mHn c1390410mHn = new C1390410mHn(context, null, 6);
        this.LLILLJJLI = c1390410mHn;
        this.LLILZ = C452501pT.LIZIZ(new AwS565S0100000_21(context, 1314));
        this.LLILZIL = new ViewTreeObserver.OnScrollChangedListener() { // from class: X.0mHq
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.LL.LIZJ();
            }
        };
        setClipChildren(false);
        setClipToPadding(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), 17);
        layoutParams.topMargin = i;
        addView(c1390410mHn, layoutParams);
        int visibility = getVisibility();
        setVisibility(4);
        C1602160rnK.LIZIZ(visibility, 4, this);
    }

    @Override // X.C16FG
    public final void LIZ(int i, boolean z) {
        boolean z2;
        if (!this.LL) {
            float fLIZIZ = i / C418440Gaw.LIZIZ(44);
            int i2 = (int) fLIZIZ;
            C1390410mHn c1390410mHn = this.LLILLJJLI;
            float fAbs = Math.abs(fLIZIZ - i2);
            if ((i2 & 1) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            c1390410mHn.LIZIZ(fAbs, z2);
            int iMin = Math.min(i, this.LLILLL);
            int iMax = Math.max(i, this.LLILLL);
            int i3 = -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
            if (iMin <= i3 && i3 <= iMax && !z) {
                if (Build.VERSION.SDK_INT >= 29) {
                    getVibrationHelper().LIZ();
                } else {
                    new C1351210lGZ(getContext()).LIZIZ(85, 61);
                }
            }
        }
        this.LLILLL = i;
        LIZJ();
    }
}
