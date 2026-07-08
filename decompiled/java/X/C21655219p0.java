package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19p0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21655219p0 implements InterfaceC2229661COm {
    public final ViewGroup LIZ;
    public final View LIZIZ;
    public final ViewGroup LIZJ;
    public final float LIZLLL;
    public final Function1<Boolean, Unit> LJ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public final Integer LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public final Rect LJIIJ;

    public final Integer LJI() {
        return (Integer) this.LJFF.getValue();
    }

    public final AbstractC21655319p1 LJII() {
        ViewGroup viewGroup = this.LIZ;
        if (viewGroup == null || viewGroup.getVisibility() != 0) {
            return C21655719p5.LIZIZ;
        }
        ViewGroup viewGroup2 = this.LIZ;
        boolean localVisibleRect = viewGroup2 != null ? viewGroup2.getLocalVisibleRect(this.LJIIJ) : true;
        Rect rect = this.LJIIJ;
        if (rect.top == 0) {
            return C21655519p3.LIZIZ;
        }
        if (!localVisibleRect) {
            return C21655419p2.LIZIZ;
        }
        C21655619p4 c21655619p4 = new AbstractC21655319p1() { // from class: X.19p4
        };
        c21655619p4.LIZ = (r2 - r0) / rect.bottom;
        return c21655619p4;
    }

    @Override // X.InterfaceC2229661COm
    public final boolean LIZJ() {
        Integer numLJI = LJI();
        if (numLJI == null) {
            return false;
        }
        int iIntValue = numLJI.intValue();
        AbstractC21655319p1 abstractC21655319p1LJII = LJII();
        if (Intrinsics.LJFF(abstractC21655319p1LJII, C21655719p5.LIZIZ)) {
            return false;
        }
        if (!Intrinsics.LJFF(abstractC21655319p1LJII, C21655419p2.LIZIZ)) {
            return true;
        }
        if (this.LJIIIZ != iIntValue) {
            LJIIIIZZ(iIntValue);
        }
        return false;
    }

    @Override // X.InterfaceC2229661COm
    public final int LIZLLL() {
        Integer numLJI = LJI();
        if (numLJI != null) {
            return numLJI.intValue();
        }
        return 0;
    }

    @Override // X.InterfaceC2229661COm
    public final boolean LJ() {
        AbstractC21655319p1 abstractC21655319p1LJII = LJII();
        if (Intrinsics.LJFF(abstractC21655319p1LJII, C21655719p5.LIZIZ)) {
            return false;
        }
        if (!Intrinsics.LJFF(abstractC21655319p1LJII, C21655519p3.LIZIZ)) {
            return true;
        }
        if (this.LJIIIZ != 0) {
            LJIIIIZZ(0);
        }
        return false;
    }

    @Override // X.InterfaceC2229661COm
    public final void LJFF() {
        int i;
        ViewGroup.LayoutParams layoutParams;
        Integer numLJI = LJI();
        if (numLJI != null) {
            int iIntValue = numLJI.intValue();
            AbstractC21655319p1 abstractC21655319p1LJII = LJII();
            if (Intrinsics.LJFF(abstractC21655319p1LJII, C21655519p3.LIZIZ)) {
                LJIIIIZZ(0);
            } else if (Intrinsics.LJFF(abstractC21655319p1LJII, C21655419p2.LIZIZ)) {
                View view = this.LIZIZ;
                if (view != null) {
                    view.scrollBy(0, -iIntValue);
                }
                LJIIIIZZ(0);
            } else if (!Intrinsics.LJFF(abstractC21655319p1LJII, C21655719p5.LIZIZ) && (i = this.LJIIIZ) > 0) {
                View view2 = this.LIZIZ;
                if (view2 != null) {
                    view2.scrollBy(0, -i);
                }
                LJIIIIZZ(0);
            }
            Integer num = this.LJII;
            if (num != null) {
                int iIntValue2 = num.intValue();
                ViewGroup viewGroup = this.LIZJ;
                if (viewGroup == null || (layoutParams = viewGroup.getLayoutParams()) == null || iIntValue2 == layoutParams.height) {
                    return;
                }
                layoutParams.height = iIntValue2;
                C786410Ut5.X5(layoutParams, this.LIZJ);
            }
        }
    }

    public final void LJIIIIZZ(int i) {
        Object c098200Yq;
        boolean z;
        int i2;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        int i3 = this.LJIIIZ;
        this.LJIIIZ = i;
        if (i != 0 && (i2 = this.LJIIIIZZ) != 0 && (viewGroup = this.LIZJ) != null && (layoutParams = viewGroup.getLayoutParams()) != null && i2 != layoutParams.height) {
            layoutParams.height = i2;
            C786410Ut5.X5(layoutParams, this.LIZJ);
        }
        try {
            c098200Yq = Float.valueOf(LJII().LIZ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Float fValueOf = Float.valueOf(0.0f);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = fValueOf;
        }
        if (((Number) c098200Yq).floatValue() > this.LIZLLL) {
            z = true;
        } else {
            z = false;
        }
        if (i3 == this.LJIIIZ) {
            return;
        }
        this.LJ.invoke(Boolean.valueOf(z));
    }

    public final void LJIIIZ(int i) {
        Integer numLJI = LJI();
        if (numLJI != null) {
            int iIntValue = numLJI.intValue();
            Integer num = (Integer) this.LJI.getValue();
            if (num != null) {
                this.LJIIIIZZ = num.intValue() + iIntValue + i;
            }
        }
    }

    @Override // X.InterfaceC2229661COm
    public final void LIZ(int i, int[] iArr) {
        Integer numLJI = LJI();
        if (numLJI != null) {
            int iIntValue = numLJI.intValue();
            int i2 = this.LJIIIZ;
            int i3 = i2 + i;
            if (i3 <= iIntValue) {
                View view = this.LIZIZ;
                if (view != null) {
                    view.scrollBy(0, i);
                }
                LJIIIIZZ(this.LJIIIZ + i);
                iArr[1] = iArr[1] + i;
                return;
            }
            if (i3 <= iIntValue || i2 >= iIntValue) {
                return;
            }
            int i4 = iIntValue - i2;
            View view2 = this.LIZIZ;
            if (view2 != null) {
                view2.scrollBy(0, i4);
            }
            LJIIIIZZ(this.LJIIIZ + i4);
            iArr[1] = iArr[1] + i4;
        }
    }

    @Override // X.InterfaceC2229661COm
    public final void LIZIZ(int i, int[] iArr) {
        Integer numLJI = LJI();
        if (numLJI != null) {
            if (Math.abs(this.LJIIIZ + i) <= numLJI.intValue() && this.LJIIIZ + i >= 0) {
                View view = this.LIZIZ;
                if (view != null) {
                    view.scrollBy(0, i);
                }
                LJIIIIZZ(this.LJIIIZ + i);
                iArr[1] = iArr[1] + i;
                return;
            }
            int i2 = this.LJIIIZ;
            if (i2 <= 0) {
                return;
            }
            View view2 = this.LIZIZ;
            if (view2 != null) {
                view2.scrollBy(0, -i2);
            }
            int i3 = this.LJIIIZ;
            LJIIIIZZ(i3 + (-i3));
            iArr[1] = iArr[1] + (-this.LJIIIZ);
        }
    }

    public /* synthetic */ C21655219p0(ViewGroup viewGroup, View view, ViewGroup viewGroup2, Function1 function1) {
        this(viewGroup, view, viewGroup2, 0.7f, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C21655219p0(ViewGroup viewGroup, View view, ViewGroup viewGroup2, float f, Function1<? super Boolean, Unit> function1) {
        Integer numValueOf;
        ViewGroup.LayoutParams layoutParams;
        this.LIZ = viewGroup;
        this.LIZIZ = view;
        this.LIZJ = viewGroup2;
        this.LIZLLL = f;
        this.LJ = function1;
        this.LJFF = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4105));
        this.LJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4104));
        if (viewGroup2 != null && (layoutParams = viewGroup2.getLayoutParams()) != null) {
            numValueOf = Integer.valueOf(layoutParams.height);
        } else {
            numValueOf = null;
        }
        this.LJII = numValueOf;
        this.LJIIJ = new Rect();
    }
}
