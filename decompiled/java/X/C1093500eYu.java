package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0eYu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1093500eYu {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C796430VMb c796430VMb, String str, String str2, Object obj) {
        String string;
        if (obj == null) {
            string = null;
        } else {
            try {
                string = C293501Bt.LIZ().LJIILL(obj);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                string = obj.toString();
            }
        }
        try {
            C784440Upu.LIZ().LIZIZ(new C00IQ("feature_write", c796430VMb.LIZJ, null, c796430VMb.LIZIZ, str, str2, string, null, null));
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }
}
