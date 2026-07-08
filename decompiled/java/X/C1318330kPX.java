package X;

import android.view.View;
import android.view.ViewParent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0kPX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1318330kPX {
    public static int[] LIZ;

    public static void LJFF(int i, View view, ViewParent viewParent) {
        if (viewParent instanceof InterfaceC1318370kPb) {
            ((InterfaceC1318370kPb) viewParent).onStopNestedScroll(view, i);
        } else {
            if (i != 0) {
                return;
            }
            try {
                C1318340kPY.LJI(viewParent, view);
            } catch (AbstractMethodError e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static boolean LIZIZ(ViewParent viewParent, View view, float f, float f2) {
        try {
            return C1318340kPY.LIZIZ(viewParent, view, f, f2);
        } catch (AbstractMethodError e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static boolean LIZ(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return C1318340kPY.LIZ(viewParent, view, f, f2, z);
        } catch (AbstractMethodError e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static void LJ(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof InterfaceC1318370kPb) {
            ((InterfaceC1318370kPb) viewParent).onNestedScrollAccepted(view, view2, i, i2);
        } else {
            if (i2 != 0) {
                return;
            }
            try {
                C1318340kPY.LJ(viewParent, view, view2, i);
            } catch (AbstractMethodError e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void LIZJ(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof InterfaceC1318370kPb) {
            ((InterfaceC1318370kPb) viewParent).onNestedPreScroll(view, i, i2, iArr, i3);
        } else {
            if (i3 != 0) {
                return;
            }
            try {
                C1318340kPY.LIZJ(viewParent, view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void LIZLLL(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof InterfaceC1318440kPi) {
            ((InterfaceC1318440kPi) viewParent).onNestedScroll(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof InterfaceC1318370kPb) {
            ((InterfaceC1318370kPb) viewParent).onNestedScroll(view, i, i2, i3, i4, i5);
        } else {
            if (i5 != 0) {
                return;
            }
            try {
                C1318340kPY.LIZLLL(viewParent, view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
