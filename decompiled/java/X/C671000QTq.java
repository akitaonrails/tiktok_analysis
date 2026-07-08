package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.config.EcSearchSugOptimizeConfig;
import com.ss.android.ugc.aweme.ecommerce.search.sug.repo.EcSearchSugResponse;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QTq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C671000QTq {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(466));

    public static void LIZ() {
        C804450Vh5 c804450Vh5 = (C804450Vh5) LIZ.getValue();
        c804450Vh5.LJ.lock();
        try {
            c804450Vh5.LIZIZ.clear();
            c804450Vh5.LIZJ.clear();
            c804450Vh5.LJ.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c804450Vh5.LJ.unlock();
            throw th;
        }
    }

    public static EcSearchSugResponse LIZIZ(String str) {
        long j;
        C01GW c01gw = LIZ;
        C443120HZe c443120HZe = (C443120HZe) ((C804450Vh5) c01gw.getValue()).LIZ(str);
        if (c443120HZe != null) {
            C670940QTk.LIZ.getClass();
            if (((EcSearchSugOptimizeConfig) C670940QTk.LIZJ.getValue()).enableCacheMoreTime) {
                j = 60000;
            } else {
                j = 30000;
            }
            if (Intrinsics.LJFF(C0QOY.LIZ, c443120HZe.getThird()) && System.currentTimeMillis() - ((Number) c443120HZe.getSecond()).longValue() <= j) {
                return (EcSearchSugResponse) c443120HZe.getFirst();
            }
            C804450Vh5 c804450Vh5 = (C804450Vh5) c01gw.getValue();
            c804450Vh5.LJ.lock();
            try {
                if (c804450Vh5.LIZIZ.containsKey(str)) {
                    c804450Vh5.LIZIZ.remove(str);
                    c804450Vh5.LIZJ.remove(str);
                }
                c804450Vh5.LJ.unlock();
                return null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c804450Vh5.LJ.unlock();
                throw th;
            }
        }
        return null;
    }
}
