package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1BlL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2214211BlL {
    public static final C830530Wi3<C520050KaR, C520050KaR> LIZ = new C830530Wi3<>(0);

    public static void LIZ(AbstractC1387200mCc abstractC1387200mCc) {
        C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = LIZ;
        C520050KaR c520050KaR = new C520050KaR(abstractC1387200mCc);
        synchronized (c830530Wi3) {
            try {
                c830530Wi3.remove(c520050KaR);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
