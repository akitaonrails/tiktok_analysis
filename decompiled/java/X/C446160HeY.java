package X;

import android.content.Context;
import android.os.Build;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0HeY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C446160HeY extends FrameLayout implements C16FG {
    public boolean LL;
    public final C1390410mHn LLILLJJLI;
    public int LLILLL;
    public final C01GW LLILZ;

    private final C1351210lGZ getVibrationHelper() {
        return (C1351210lGZ) this.LLILZ.getValue();
    }

    @Override // X.C16FG
    public int getActualHeight() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
    }

    public C446160HeY(Context context) {
        super(context, null, 0);
        C1390410mHn c1390410mHn = new C1390410mHn(context, null, 6);
        this.LLILLJJLI = c1390410mHn;
        this.LLILZ = C452501pT.LIZIZ(new C446170HeZ(context));
        addView(c1390410mHn, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), 17));
    }

    @Override // X.C16FG
    public final void LIZIZ(boolean z) {
        this.LL = z;
        if (z) {
            this.LLILLJJLI.LIZJ();
        } else {
            this.LLILLJJLI.LIZLLL();
        }
    }

    @Override // X.C16FG
    public final void onHiddenChanged(boolean z) {
        if (z) {
            int visibility = getVisibility();
            setVisibility(4);
            C1602160rnK.LIZIZ(visibility, 4, this);
            this.LLILLJJLI.LIZLLL();
            return;
        }
        int visibility2 = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility2, 0, this);
        if (this.LL) {
            this.LLILLJJLI.LIZJ();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        C786410Ut5.LLLZZIL(this.LLILLJJLI, i);
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
    }
}
