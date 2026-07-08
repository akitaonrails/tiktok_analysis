package X;

import android.content.Context;
import android.os.Build;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0Hea, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C446180Hea extends FrameLayout implements C16FG {
    public final List<InterfaceC446190Heb> LL;
    public boolean LLILLJJLI;
    public final C1390410mHn LLILLL;
    public int LLILZ;
    public final C01GW LLILZIL;
    public int LLILZLL;

    private final C1351210lGZ getVibrationHelper() {
        return (C1351210lGZ) this.LLILZIL.getValue();
    }

    @Override // X.C16FG
    public int getActualHeight() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
    }

    public final int getPullThreshold() {
        return this.LLILZLL;
    }

    public C446180Hea(Context context) {
        super(context, null, 0);
        this.LL = new ArrayList();
        C1390410mHn c1390410mHn = new C1390410mHn(context, null, 6);
        this.LLILLL = c1390410mHn;
        this.LLILZIL = C452501pT.LIZIZ(new AwS550S0100000_6(context, 10));
        setClipChildren(false);
        addView(c1390410mHn, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), 17));
    }

    @Override // X.C16FG
    public final void LIZIZ(boolean z) {
        this.LLILLJJLI = z;
        if (z) {
            this.LLILLL.LIZJ();
        } else {
            this.LLILLL.LIZLLL();
        }
    }

    @Override // X.C16FG
    public final void onHiddenChanged(boolean z) {
        if (z) {
            int visibility = getVisibility();
            setVisibility(4);
            C1602160rnK.LIZIZ(visibility, 4, this);
            this.LLILLL.LIZLLL();
            Iterator it2 = ((ArrayList) this.LL).iterator();
            while (it2.hasNext()) {
                ((InterfaceC446190Heb) it2.next()).onHide();
            }
            return;
        }
        int visibility2 = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility2, 0, this);
        if (this.LLILLJJLI) {
            this.LLILLL.LIZJ();
        }
        Iterator it3 = ((ArrayList) this.LL).iterator();
        while (it3.hasNext()) {
            ((InterfaceC446190Heb) it3.next()).onShow();
        }
    }

    public final void setBallTranslationY(float f) {
        C1390410mHn c1390410mHn = this.LLILLL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1390410mHn);
        c1390410mHn.setTranslationY(f);
    }

    public final void setPullThreshold(int i) {
        this.LLILZLL = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        C786410Ut5.LLLZZIL(this.LLILLL, i);
    }

    @Override // X.C16FG
    public final void LIZ(int i, boolean z) {
        boolean z2;
        if (!this.LLILLJJLI) {
            if (Math.abs(i) < this.LLILZLL) {
                C786410Ut5.LLLZZIL(this.LLILLL, 4);
                this.LLILZ = i;
                return;
            }
            C786410Ut5.LLLZZIL(this.LLILLL, 0);
            float fLIZIZ = i / C418440Gaw.LIZIZ(44);
            int i2 = (int) fLIZIZ;
            C1390410mHn c1390410mHn = this.LLILLL;
            float fAbs = Math.abs(fLIZIZ - i2);
            if ((i2 & 1) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            c1390410mHn.LIZIZ(fAbs, z2);
            int iMin = Math.min(i, this.LLILZ);
            int iMax = Math.max(i, this.LLILZ);
            int i3 = -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
            if (iMin <= i3 && i3 <= iMax && !z) {
                if (Build.VERSION.SDK_INT >= 29) {
                    getVibrationHelper().LIZ();
                } else {
                    new C1351210lGZ(getContext()).LIZIZ(85, 61);
                }
            }
        }
        this.LLILZ = i;
    }
}
