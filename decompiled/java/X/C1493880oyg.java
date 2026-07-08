package X;

import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oyg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1493880oyg {
    public static final Object LJ = new Object();
    public static volatile C1493880oyg LJFF;
    public final ConcurrentHashMap<String, Long> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, C1493900oyi> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, C1493890oyh> LIZJ = new ConcurrentHashMap<>();
    public final boolean LIZLLL = true;

    public static C1493880oyg LIZ() {
        if (LJFF == null) {
            synchronized (LJ) {
                try {
                    if (LJFF == null) {
                        LJFF = new C1493880oyg();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJFF;
    }

    public final void LIZIZ(long j, String str, boolean z, boolean z2) {
        int value;
        int i;
        int i2;
        int i3;
        long j2;
        if (this.LIZLLL && !C2093608Ic.LJ(str)) {
            int i4 = 0;
            if (C1493420oxw.LJFF != null) {
                value = C804420Vh2.LJ(C1493420oxw.LJFF.LIZ).getValue();
            } else {
                value = 0;
            }
            if (value == EnumC804620VhM.WIFI.getValue() || value == EnumC804620VhM.MOBILE_4G.getValue() || value == EnumC804620VhM.MOBILE_3G.getValue() || value == EnumC804620VhM.MOBILE_3G_H.getValue() || value == EnumC804620VhM.MOBILE_3G_HP.getValue() || value == EnumC804620VhM.MOBILE_5G.getValue()) {
                try {
                    if ((C1493420oxw.LJFF == null || C1493420oxw.LJFF.LIZIZ != 2) && z2) {
                        if (this.LIZJ.containsKey("p.pstap.com")) {
                            C1493890oyh c1493890oyh = this.LIZJ.get("p.pstap.com");
                            if (z && j > 0) {
                                c1493890oyh.LIZ++;
                                c1493890oyh.LIZJ += j;
                            } else {
                                c1493890oyh.LIZIZ++;
                            }
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (jCurrentTimeMillis - c1493890oyh.LIZLLL > 300000) {
                                int i5 = c1493890oyh.LIZ;
                                if (i5 > 0) {
                                    j2 = c1493890oyh.LIZJ / ((long) i5);
                                } else {
                                    j2 = 0;
                                }
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("error", c1493890oyh.LIZIZ);
                                jSONObject.put("success", c1493890oyh.LIZ);
                                jSONObject.put("average_duration", j2);
                                if (C1493420oxw.LJFF != null && C1493420oxw.LJFF.LIZIZ == 1) {
                                    jSONObject.put("has_opt", 1);
                                }
                                c1493890oyh.LIZIZ = 0;
                                c1493890oyh.LIZ = 0;
                                c1493890oyh.LIZJ = 0L;
                                c1493890oyh.LIZLLL = jCurrentTimeMillis;
                            }
                        } else {
                            if (z) {
                                i3 = 0;
                            } else {
                                i3 = 1;
                            }
                            this.LIZJ.put("p.pstap.com", new C1493890oyh(z ? 1 : 0, i3, j));
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                if (C1493420oxw.LJFF != null && C1493420oxw.LJFF.LIZIZ == 1) {
                    try {
                        String host = Uri.parse(str).getHost();
                        if (this.LIZIZ.containsKey(host)) {
                            C1493900oyi c1493900oyi = this.LIZIZ.get(host);
                            if (c1493900oyi == null || c1493900oyi.LIZJ) {
                                return;
                            }
                            if (!z) {
                                c1493900oyi.LIZ++;
                            }
                            c1493900oyi.LIZIZ++;
                            int i6 = c1493900oyi.LIZ;
                            if (C1493420oxw.LJFF != null && C1493420oxw.LJFF.LIZLLL > 0) {
                                i2 = C1493420oxw.LJFF.LIZLLL;
                            } else {
                                i2 = 5;
                            }
                            if (i6 >= i2 && (c1493900oyi.LIZ * 100) / c1493900oyi.LIZIZ >= 10) {
                                c1493900oyi.LIZJ = true;
                                c1493900oyi.LIZIZ = 0;
                                c1493900oyi.LIZ = 0;
                                this.LIZ.put(host, Long.valueOf(System.currentTimeMillis()));
                                return;
                            }
                            if (c1493900oyi.LIZIZ > c1493900oyi.LIZLLL) {
                                c1493900oyi.LIZIZ = 0;
                                c1493900oyi.LIZ = 0;
                                c1493900oyi.LIZJ = false;
                                return;
                            }
                            return;
                        }
                        if (!z) {
                            i4 = 1;
                        }
                        if (C1493420oxw.LJFF != null && C1493420oxw.LJFF.LJ > 0) {
                            i = C1493420oxw.LJFF.LJ;
                        } else {
                            i = 50;
                        }
                        this.LIZIZ.put(host, new C1493900oyi(i4, i));
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                }
            }
        }
    }
}
