package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.134t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199521134t {
    public static C199518134q LIZ(AnonymousClass1353 anonymousClass1353) {
        C199520134s c199520134s = new C199520134s();
        C199518134q c199518134q = new C199518134q(c199520134s);
        c199520134s.LIZIZ = c199518134q;
        c199520134s.LIZ = anonymousClass1353.getClass();
        try {
            c199520134s.LIZ = anonymousClass1353.LIZ(c199520134s);
            return c199518134q;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C199527134z c199527134z = new C199527134z(e);
            AbstractC199513134l abstractC199513134l = C134X.LLILZLL;
            C199519134r c199519134r = c199518134q.LLILLJJLI;
            if (abstractC199513134l.LIZLLL(c199519134r, null, c199527134z)) {
                C134X.LIZIZ(c199519134r);
            }
            return c199518134q;
        }
    }
}
