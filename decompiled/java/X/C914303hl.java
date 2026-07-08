package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcPaymentSecurityConfig;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03hl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C914303hl {
    public static volatile Cashier LIZIZ;
    public static AnonymousClass0956 LIZLLL;
    public static String LJ;
    public static final C914303hl LIZ = new C914303hl();
    public static final CopyOnWriteArraySet<Integer> LIZJ = new CopyOnWriteArraySet<>();

    public static Cashier LIZIZ() {
        return LIZIZ;
    }

    public static void LIZJ(Object obj) {
        LIZJ.remove(Integer.valueOf(obj.hashCode()));
    }

    public static void LJ(String str) {
        C1724230uyD.LIZ.getClass();
        C932203ke.LIZ.getClass();
        if (C1724150uy5.LJIIL.LJIIJJI) {
            C23250099c.LIZLLL(C817503Hh.LL, null, null, new C914403hm(str, null), 3);
        }
        if (Intrinsics.LJFF(((EcPaymentSecurityConfig.SecurityConfigModel) EcPaymentSecurityConfig.LIZIZ.getValue()).enable, Boolean.TRUE)) {
            try {
                C189200o6.m2constructorimpl(C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C937903lZ(null), 2));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public static void LIZLLL(Object obj, String str) {
        LIZJ.add(Integer.valueOf(obj.hashCode()));
        AnonymousClass0956 anonymousClass0956 = LIZLLL;
        if (anonymousClass0956 != null && anonymousClass0956.isActive()) {
            return;
        }
        AnonymousClass0956 anonymousClass09562 = LIZLLL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        LIZLLL = C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C914203hk(str, null), 2);
    }

    public static void LJFF(String str, String str2) {
        LJ = str;
        LJ(str2);
    }

    public static Object LIZ(String str, boolean z, InterfaceC1364105Vn interfaceC1364105Vn) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        C907003ga c907003ga = InterfaceC907103gb.LIZ;
        Boolean boolValueOf = Boolean.valueOf(z);
        c907003ga.getClass();
        C907003ga.LIZ(boolValueOf, str).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LIZIZ(new C1077404Jg(c23260099m, 3));
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }
}
