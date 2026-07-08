package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.13P1, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13P1 {
    public final C13RD LIZ;
    public ConcurrentHashMap<String, String> LIZIZ;

    public C13P1(C13RD c13rd) {
        this.LIZ = c13rd;
    }

    public final void LIZ(String str, String str2, C13MA<Boolean> c13ma) {
        long j;
        if (this.LIZIZ == null && c13ma != null) {
            c13ma.onSuccess(Boolean.TRUE);
        }
        ConcurrentHashMap<String, String> concurrentHashMap = this.LIZIZ;
        if (concurrentHashMap == null) {
            return;
        }
        if (concurrentHashMap.containsKey(str)) {
            long j2 = -1;
            if (str2 != null && str2.length() != 0) {
                try {
                    j = CastLongProtector.parseLong(str2);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    j = -1;
                }
            } else {
                j = -1;
            }
            String str3 = concurrentHashMap.get(str);
            if (str3 != null && str3.length() != 0) {
                try {
                    j2 = CastLongProtector.parseLong(str3);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
            if (j > j2) {
                if (c13ma != null) {
                    c13ma.onSuccess(Boolean.TRUE);
                    return;
                }
                return;
            } else {
                if (c13ma == null) {
                    return;
                }
                c13ma.onSuccess(Boolean.FALSE);
                return;
            }
        }
        if (c13ma != null) {
            c13ma.onSuccess(Boolean.TRUE);
        }
    }

    public final void LIZIZ(String str, String str2, String str3, final C13PH c13ph) {
        if (this.LIZIZ == null && c13ph != null) {
            c13ph.onFinally();
        }
        ConcurrentHashMap<String, String> concurrentHashMap = this.LIZIZ;
        if (concurrentHashMap == null) {
            return;
        }
        concurrentHashMap.put(str2, str3);
        this.LIZ.LJJJIL.LIZIZ(str, new C13PE() { // from class: X.13PA
            @Override // X.C13MA
            public final void onSuccess(String str4) {
                C13PH c13ph2 = c13ph;
                if (c13ph2 != null) {
                    c13ph2.onFinally();
                }
            }

            @Override // X.C13MA
            public final /* bridge */ /* synthetic */ void onFail(String str4, C1662010tLr c1662010tLr) {
            }
        });
        C13R1 c13r1 = new C13R1(this.LIZ, str, concurrentHashMap);
        C20001113Np c20001113Np = this.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(c13r1);
        }
    }
}
