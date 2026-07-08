package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.01Sb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C335901Sb {
    public static final C335901Sb LIZ = new C335901Sb();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(318));
    public static final C054G LIZJ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));

    public static void LIZ(long j, String str, Throwable th, boolean z) {
        if (!((Boolean) LIZIZ.getValue()).booleanValue()) {
            return;
        }
        try {
            C189200o6.m2constructorimpl(C23250099c.LIZLLL(LIZJ, null, null, new C336001Sc(str, j, z, th, null), 3));
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }
}
