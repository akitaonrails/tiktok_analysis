package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;

/* JADX INFO: renamed from: X.0Yjv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C882650Yjv {
    public static final boolean LIZJ() {
        Object c098200Yq;
        try {
            InterfaceC1712506nD interfaceC1712506nDLJFF = C1668706g9.LIZ(IIMBusinessChatService.LIZ).LJFF();
            InterfaceC1712506nD.LIZ.getClass();
            c098200Yq = Boolean.valueOf(interfaceC1712506nDLJFF.LJI(AnonymousClass0613.LIZ()));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    public static final boolean LIZLLL() {
        Object c098200Yq;
        try {
            InterfaceC1712506nD interfaceC1712506nDLJFF = C1668706g9.LIZ(IIMBusinessChatService.LIZ).LJFF();
            InterfaceC1712506nD.LIZ.getClass();
            c098200Yq = Boolean.valueOf(interfaceC1712506nDLJFF.LIZ(AnonymousClass0613.LIZ()));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    public static final int LIZ() {
        return LIZJ() ? C0C64.LJIILLIIL().LJIIIZ(31744, "inbox_business_fold_skylight_enabled", false, false) ? 2 : 0 : LIZLLL() ? C0C64.LJIILLIIL().LJIIIZ(31744, "inbox_creator_fold_skylight_enabled", false, false) ? 1 : 0 : C0C64.LJIILLIIL().LJIIIZ(31744, "skylight_fold_experiment", false, false) ? 3 : 0;
    }

    public static final boolean LIZIZ() {
        return (LIZJ() || LIZLLL() || !C0C64.LJIILLIIL().LJIIIZ(31744, "skylight_fold_experiment", false, false)) ? false : true;
    }

    public static final boolean LJ() {
        return LIZ() > 0;
    }
}
