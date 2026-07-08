package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DNo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2254901DNo implements C1DLB {
    public final C2254911DNp LIZ;
    public FrameLayout LIZIZ;
    public FrameLayout LIZJ;
    public FrameLayout LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(new AwS579S0100000_35(this, 418));

    @Override // X.C1DLB
    public final int LIZIZ() {
        return ((C1DL5) this.LJ.getValue()).getPreviewView().getHeight();
    }

    @Override // X.C1DLB
    public final int LIZJ() {
        return ((C1DL5) this.LJ.getValue()).getPreviewView().getWidth();
    }

    @Override // X.C1DLB
    public final C2254911DNp getView() {
        return this.LIZ;
    }

    public C2254901DNo(C2254911DNp c2254911DNp) {
        this.LIZ = c2254911DNp;
    }

    @Override // X.C1DLB
    public final void addView(View view) {
        FrameLayout frameLayout = this.LIZJ;
        if (frameLayout == null) {
            frameLayout = null;
        }
        frameLayout.addView(view);
    }

    @Override // X.C1DLB
    public final void removeView(View view) {
        C2255011DNz c2255011DNz = C2255011DNz.LIZ;
        FrameLayout frameLayout = null;
        if (Intrinsics.LJFF(c2255011DNz, C2255001DNy.LIZ)) {
            FrameLayout frameLayout2 = this.LIZIZ;
            if (frameLayout2 != null) {
                frameLayout = frameLayout2;
            }
            C786410Ut5.LJJJZ(view, frameLayout);
            return;
        }
        if (Intrinsics.LJFF(c2255011DNz, c2255011DNz)) {
            FrameLayout frameLayout3 = this.LIZJ;
            if (frameLayout3 != null) {
                frameLayout = frameLayout3;
            }
            C786410Ut5.LJJJZ(view, frameLayout);
            return;
        }
        if (Intrinsics.LJFF(c2255011DNz, C1DO0.LIZ)) {
            FrameLayout frameLayout4 = this.LIZLLL;
            if (frameLayout4 != null) {
                frameLayout = frameLayout4;
            }
            C786410Ut5.LJJJZ(view, frameLayout);
            return;
        }
        throw new C1954807lC();
    }

    @Override // X.C1DLB
    public final void LIZ(C1DL2 c1dl2, ViewGroup.LayoutParams layoutParams) {
        LIZLLL(c1dl2, layoutParams, C2255011DNz.LIZ);
    }

    @Override // X.C1DLB
    public final void LIZLLL(View view, ViewGroup.LayoutParams layoutParams, AbstractC2254991DNx abstractC2254991DNx) {
        FrameLayout frameLayout = null;
        if (Intrinsics.LJFF(abstractC2254991DNx, C2255001DNy.LIZ)) {
            FrameLayout frameLayout2 = this.LIZIZ;
            if (frameLayout2 != null) {
                frameLayout = frameLayout2;
            }
            frameLayout.addView(view, layoutParams);
            return;
        }
        if (Intrinsics.LJFF(abstractC2254991DNx, C2255011DNz.LIZ)) {
            FrameLayout frameLayout3 = this.LIZJ;
            if (frameLayout3 != null) {
                frameLayout = frameLayout3;
            }
            frameLayout.addView(view, layoutParams);
            return;
        }
        if (Intrinsics.LJFF(abstractC2254991DNx, C1DO0.LIZ)) {
            FrameLayout frameLayout4 = this.LIZLLL;
            if (frameLayout4 != null) {
                frameLayout = frameLayout4;
            }
            frameLayout.addView(view, layoutParams);
            return;
        }
        throw new C1954807lC();
    }
}
