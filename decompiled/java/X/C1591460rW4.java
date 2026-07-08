package X;

import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0rW4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1591460rW4 implements InterfaceC1592890rYN {
    public static C1591800rWc LJIIIZ;
    public static final C1591460rW4 LIZ = new C1591460rW4();
    public static final int LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final int LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
    public static final int LIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
    public static int LJ = 1;
    public static int LJFF = 1;
    public static int LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(98));
    public static int LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(98));
    public static EnumC1591490rW7 LJIIIIZZ = EnumC1591490rW7.BIG_FONT;
    public static final boolean LJIIJ = true;

    public static float LJFF(float f) {
        return (f == 17.0f || f != 15.0f) ? 8.0f : 5.0f;
    }

    public static int LJ() {
        return C296130Bj9.LIZ() ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)) : ((IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)).shouldShowMallTopTab() ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)) : ((Number) C260600AJe.LIZ.getValue()).intValue() == 1 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
    }

    @Override // X.InterfaceC1592890rYN
    public final boolean LIZ() {
        return LJIIJ;
    }

    @Override // X.InterfaceC1592890rYN
    public final EnumC1591490rW7 LIZIZ() {
        return LJIIIIZZ;
    }

    public static int LIZJ(C1591460rW4 c1591460rW4) {
        c1591460rW4.getClass();
        if (C1581510rG1.LIZIZ()) {
            if (C1581510rG1.LIZJ()) {
                return LJI;
            }
            int i = LJI;
            if (i != 0) {
                return i;
            }
            return LJII;
        }
        int i2 = LJ;
        C0CXE.LIZ.getClass();
        if (!C0CXE.LIZ()) {
            C0CXC.LIZ.getClass();
            if (!C0CXC.LIZIZ() && LJ != 2) {
                return LJ();
            }
        }
        if (i2 <= 1) {
            return LIZJ;
        }
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(108));
        return LIZLLL;
    }

    public static int LIZLLL(C1591460rW4 c1591460rW4) {
        c1591460rW4.getClass();
        if (C1581510rG1.LIZIZ()) {
            if (C1581510rG1.LIZJ()) {
                return LJII;
            }
            int i = LJII;
            if (i != 0) {
                return i;
            }
            return LJI;
        }
        int i2 = LJFF;
        C0CXE.LIZ.getClass();
        if (!C0CXE.LIZ()) {
            C0CXC.LIZ.getClass();
            if (!C0CXC.LIZIZ() && LJFF != 2) {
                return LJ();
            }
        }
        if (i2 <= 1) {
            return LIZJ;
        }
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(108));
        return LIZLLL;
    }
}
