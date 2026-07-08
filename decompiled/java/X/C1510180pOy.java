package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import kotlin.text.a0;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0pOy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1510180pOy extends FeatureProducer {
    public static float LIZJ;
    public static Integer LJ;
    public static Integer LJFF;
    public static Integer LJI;
    public static final C1510180pOy LIZIZ = new C1510180pOy();
    public static String LIZLLL = "f_phone";

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final String getProducerName() {
        return LIZLLL;
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void setProducerName(String str) {
        LIZLLL = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final Object getFeatureInternal(String str, JSONObject jSONObject, String str2, ReturnCode returnCode) {
        boolean z;
        int i = 1;
        int iLJ = 0;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (returnCode != null) {
                returnCode.code = 1;
                return null;
            }
            return null;
        }
        if (returnCode != null) {
            returnCode.code = 200;
        }
        switch (str.hashCode()) {
            case -2026985990:
                if (str.equals("loadmore_latency")) {
                    return Float.valueOf(LIZJ);
                }
                break;
            case -1613589672:
                if (str.equals("language")) {
                    return C786410Ut5.t2(Locale.getDefault());
                }
                break;
            case -1609532505:
                if (str.equals("g_common_background_status")) {
                    return Integer.valueOf(C2214201BlK.LJIIJJI ? 1 : 0);
                }
                break;
            case -1483091692:
                if (str.equals("tcp_rtt")) {
                    C1510170pOx c1510170pOx = C1510170pOx.LIZ;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    c1510170pOx.getClass();
                    return Integer.valueOf(C1510170pOx.LIZ(jCurrentTimeMillis).LIZ);
                }
                break;
            case -1423461020:
                if (str.equals("access")) {
                    C1510170pOx c1510170pOx2 = C1510170pOx.LIZ;
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    c1510170pOx2.getClass();
                    if (jCurrentTimeMillis2 - C1510170pOx.LIZLLL > 30000) {
                        C844470XAv.LIZ.getClass();
                        C1510170pOx.LIZJ = C786410Ut5.b3(C844470XAv.LIZ());
                        C1510170pOx.LIZLLL = jCurrentTimeMillis2;
                    }
                    return C1510170pOx.LIZJ;
                }
                break;
            case -1190839236:
                if (str.equals("device_platform")) {
                    return "android";
                }
                break;
            case -1074026988:
                if (str.equals("minute")) {
                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                    if (jCurrentTimeMillis3 - C1510200pP0.LIZLLL > 20000) {
                        C1510200pP0.LIZLLL = jCurrentTimeMillis3;
                        Calendar calendar = C1510210pP1.LIZ;
                        synchronized (calendar) {
                            try {
                                calendar.setTimeInMillis(jCurrentTimeMillis3);
                                C1510200pP0.LIZJ = calendar.get(12);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }
                    return Integer.valueOf(C1510200pP0.LIZJ);
                }
                break;
            case -902467928:
                if (str.equals("signal")) {
                    C1510170pOx c1510170pOx3 = C1510170pOx.LIZ;
                    long jCurrentTimeMillis4 = System.currentTimeMillis();
                    c1510170pOx3.getClass();
                    if (jCurrentTimeMillis4 - C1510170pOx.LJFF > 30000) {
                        C844470XAv.LIZ.getClass();
                        Context contextLIZ = C844470XAv.LIZ();
                        C1510170pOx.LJ = C801110Vbh.LIZ(contextLIZ).LIZIZ(contextLIZ);
                        C1510170pOx.LJFF = jCurrentTimeMillis4;
                    }
                    return Integer.valueOf(C1510170pOx.LJ);
                }
                break;
            case -897593495:
                if (str.equals("is_charge")) {
                    C1510170pOx c1510170pOx4 = C1510170pOx.LIZ;
                    long jCurrentTimeMillis5 = System.currentTimeMillis();
                    c1510170pOx4.getClass();
                    if (jCurrentTimeMillis5 - C1510170pOx.LJIIJJI > 30000) {
                        C844470XAv.LIZ.getClass();
                        C0VA1 c0va1LIZ = C0VAA.LIZ(C844470XAv.LIZ());
                        if (c0va1LIZ != null) {
                            C1510170pOx.LJIIJ = c0va1LIZ.LIZIZ.LIZLLL;
                        }
                        C1510170pOx.LJIIJJI = jCurrentTimeMillis5;
                    }
                    return Integer.valueOf(C1510170pOx.LJIIJ ? 1 : 0);
                }
                break;
            case -896251085:
                if (str.equals("sp_dev")) {
                    return Integer.valueOf(C20595415iS.LIZJ() ? 1 : 0);
                }
                break;
            case -481815380:
                if (str.equals("net_quality_lv")) {
                    C1510170pOx c1510170pOx5 = C1510170pOx.LIZ;
                    long jCurrentTimeMillis6 = System.currentTimeMillis();
                    c1510170pOx5.getClass();
                    if (jCurrentTimeMillis6 - C1510170pOx.LJIIIZ > 30000) {
                        int effectiveConnectionType = TTNetInit.getEffectiveConnectionType();
                        C1510170pOx.LJIIIIZZ = effectiveConnectionType;
                        if (effectiveConnectionType < 0) {
                            C1510170pOx.LJIIIIZZ = 0;
                        }
                        C1510170pOx.LJIIIZ = jCurrentTimeMillis6;
                    }
                    return Integer.valueOf(C1510170pOx.LJIIIIZZ);
                }
                break;
            case -338223363:
                if (str.equals("portrait_all")) {
                    return FeatureProducer.getFeature$default(C1305460k4m.LIZIZ, "portrait_all", (JSONObject) null, str2, (ReturnCode) null, 10, (Object) null);
                }
                break;
            case -319008484:
                if (str.equals("monthday")) {
                    C1510200pP0.LIZ();
                    return Integer.valueOf(C1510200pP0.LJFF);
                }
                break;
            case -132747717:
                if (str.equals("http_rtt")) {
                    C1510170pOx c1510170pOx6 = C1510170pOx.LIZ;
                    long jCurrentTimeMillis7 = System.currentTimeMillis();
                    c1510170pOx6.getClass();
                    return Integer.valueOf(C1510170pOx.LIZ(jCurrentTimeMillis7).LIZIZ);
                }
                break;
            case -102985484:
                if (str.equals("version_code")) {
                    C1510170pOx.LIZ.getClass();
                    try {
                        C844470XAv.LIZ.getClass();
                        Iterator it2 = a0.LJJLIIIJILLIZJL(C844470XAv.LJFF(), new String[]{e3.d}, 0, 6).iterator();
                        while (it2.hasNext()) {
                            iLJ = (iLJ * 100) + CastIntegerProtector.valueOf((String) it2.next()).intValue();
                            break;
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C844470XAv.LIZ.getClass();
                        iLJ = (int) C844470XAv.LJ();
                    }
                    return Integer.valueOf(iLJ);
                }
                break;
            case 3208676:
                if (str.equals("hour")) {
                    C1510200pP0.LIZ();
                    return Integer.valueOf(C1510200pP0.LIZ);
                }
                break;
            case 106363846:
                if (str.equals("p_dev")) {
                    return Integer.valueOf(C20595415iS.LIZIZ() ? 1 : 0);
                }
                break;
            case 126629256:
                if (str.equals("cur_speed")) {
                    C1510170pOx.LIZ.getClass();
                    return Integer.valueOf(Math.max(C1479130oat.LJII(), 0));
                }
                break;
            case 957831062:
                if (str.equals("country")) {
                    C1510170pOx.LIZ.getClass();
                    if (C1510170pOx.LIZIZ == null) {
                        C1510170pOx.LIZIZ = C1913880zu6.LIZ();
                    }
                    return C1510170pOx.LIZIZ;
                }
                break;
            case 1226862376:
                if (str.equals("weekday")) {
                    C1510200pP0.LIZ();
                    return Integer.valueOf(C1510200pP0.LJ - 1);
                }
                break;
            case 1268302803:
                if (str.equals("tcp_band")) {
                    C1510170pOx c1510170pOx7 = C1510170pOx.LIZ;
                    long jCurrentTimeMillis8 = System.currentTimeMillis();
                    c1510170pOx7.getClass();
                    return Integer.valueOf(C1510170pOx.LIZ(jCurrentTimeMillis8).LIZJ);
                }
                break;
            case 2023669679:
                if (str.equals("battery_pct")) {
                    C1510170pOx c1510170pOx8 = C1510170pOx.LIZ;
                    long jCurrentTimeMillis9 = System.currentTimeMillis();
                    c1510170pOx8.getClass();
                    if (jCurrentTimeMillis9 - C1510170pOx.LJIILIIL > 30000) {
                        C844470XAv.LIZ.getClass();
                        C0VA1 c0va1LIZ2 = C0VAA.LIZ(C844470XAv.LIZ());
                        if (c0va1LIZ2 != null) {
                            C1510170pOx.LJIIL = c0va1LIZ2.LIZIZ();
                        }
                        C1510170pOx.LJIILIIL = jCurrentTimeMillis9;
                    }
                    return Integer.valueOf(C1510170pOx.LJIIL);
                }
                break;
            case 2082342154:
                if (str.equals("is_wifi")) {
                    C1510170pOx c1510170pOx9 = C1510170pOx.LIZ;
                    long jCurrentTimeMillis10 = System.currentTimeMillis();
                    c1510170pOx9.getClass();
                    if (jCurrentTimeMillis10 - C1510170pOx.LIZLLL > 30000) {
                        C844470XAv.LIZ.getClass();
                        C1510170pOx.LIZJ = C786410Ut5.b3(C844470XAv.LIZ());
                        C1510170pOx.LIZLLL = jCurrentTimeMillis10;
                    }
                    String str3 = C1510170pOx.LIZJ;
                    if (TextUtils.isEmpty(str3) || !a0.LJJIIZI(str3, "wifi", false)) {
                        i = 0;
                    }
                    return Integer.valueOf(i);
                }
                break;
        }
        return FeatureProducer.getFeature$default(C1305460k4m.LIZIZ, str, (JSONObject) null, str2, (ReturnCode) null, 10, (Object) null);
    }
}
