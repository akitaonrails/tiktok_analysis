package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yYd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1862130yYd {
    public static final C1862130yYd LIZ;
    public static boolean LIZIZ;
    public static String LIZJ;
    public static final C1862210yYl LIZLLL;
    public static final C1862150yYf LJ;
    public static final C1862180yYi LJFF;
    public static final C1862170yYh LJI;

    public static void LJIIIIZZ() {
        LIZIZ = false;
        C1862210yYl c1862210yYl = LIZLLL;
        if (c1862210yYl.LIZJ == null) {
            c1862210yYl.LIZJ = null;
            c1862210yYl.LIZ("", "network");
        }
        if (c1862210yYl.LIZLLL == null) {
            c1862210yYl.LIZLLL = null;
            c1862210yYl.LIZ("", "band_width_quality");
        }
        c1862210yYl.LIZ.clear();
        C1862150yYf c1862150yYf = LJ;
        c1862150yYf.LIZIZ = null;
        c1862150yYf.LIZJ = null;
        c1862150yYf.LIZLLL = null;
        c1862150yYf.LIZ.clear();
        C1862170yYh c1862170yYh = LJI;
        c1862170yYh.LIZJ = null;
        c1862170yYh.LIZIZ = null;
        c1862170yYh.LIZLLL = null;
        c1862170yYh.LJ = null;
        c1862170yYh.LJI = null;
        c1862170yYh.LJIIIIZZ = null;
        c1862170yYh.LJFF = null;
        c1862170yYh.LJII = null;
        c1862170yYh.LIZ.clear();
        C1862180yYi c1862180yYi = LJFF;
        c1862180yYi.LIZIZ = -1L;
        c1862180yYi.LIZJ = -1L;
        c1862180yYi.LIZLLL = -1L;
        c1862180yYi.LJ = -1L;
        c1862180yYi.LJFF = -1L;
        c1862180yYi.LJI = -1L;
        c1862180yYi.LJII = null;
        c1862180yYi.LJIIIIZZ = null;
        c1862180yYi.LJIIIZ = null;
        c1862180yYi.LJIIJ = null;
        c1862180yYi.LJIIJJI = null;
        c1862180yYi.LJIIL = null;
        c1862180yYi.LJIILJJIL = null;
        c1862180yYi.LJIILIIL = null;
        c1862180yYi.LIZ.clear();
        LIZJ = "";
    }

    static {
        C1862130yYd c1862130yYd = new C1862130yYd();
        LIZ = c1862130yYd;
        C1862430yZ7.LIZIZ = new C1860920yWg(c1862130yYd);
        C1862430yZ7.LJI = new C1862220yYm(c1862130yYd);
        C1862430yZ7.LJII = new C1862250yYp(c1862130yYd);
        C1862430yZ7.LJIIIIZZ = new C1862120yYc(c1862130yYd);
        C1862430yZ7.LIZ = new C1862070yYX(c1862130yYd);
        C1862430yZ7.LJFF = new C1862230yYn(c1862130yYd);
        C1862430yZ7.LIZJ = new C1862190yYj(c1862130yYd);
        C1862430yZ7.LIZLLL = new C1862060yYW(c1862130yYd);
        C1862430yZ7.LJ = new C1862140yYe(c1862130yYd);
        LIZJ = "";
        LIZLLL = new C1862210yYl();
        LJ = new C1862150yYf();
        LJFF = new C1862180yYi();
        LJI = new C1862170yYh();
    }

    public static boolean LIZ() {
        if (LJFF.LIZIZ == -1) {
            return false;
        }
        C1862170yYh c1862170yYh = LJI;
        String str = c1862170yYh.LIZLLL;
        if (str == null || str.length() == 0) {
            List<BaseImage> list = c1862170yYh.LJ;
            if (C1527905yX.LIZ(list != null ? Integer.valueOf(list.size()) : null) <= 0) {
                return false;
            }
        }
        return true;
    }

    public static void LJII() {
        try {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, Object> entry : LIZLLL.LIZ.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    LIZ.getClass();
                    if (LIZIZ(value)) {
                        jSONObject.put(key, value);
                    }
                }
                for (Map.Entry<String, Object> entry2 : LJI.LIZ.entrySet()) {
                    String key2 = entry2.getKey();
                    Object value2 = entry2.getValue();
                    LIZ.getClass();
                    if (LIZIZ(value2)) {
                        jSONObject.put(key2, value2);
                    }
                }
                for (Map.Entry<String, Object> entry3 : LJFF.LIZ.entrySet()) {
                    String key3 = entry3.getKey();
                    Object value3 = entry3.getValue();
                    LIZ.getClass();
                    if (LIZIZ(value3)) {
                        jSONObject.put(key3, value3);
                    }
                }
                for (Map.Entry<String, Object> entry4 : LJ.LIZ.entrySet()) {
                    String key4 = entry4.getKey();
                    Object value4 = entry4.getValue();
                    LIZ.getClass();
                    if (LIZIZ(value4)) {
                        jSONObject.put(key4, value4);
                    }
                }
                jSONObject.put("version", 2);
                AppLogNewUtils.onEventV3("tako_e2e_tracker", jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            LIZJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZJ();
            throw th;
        }
    }

    public static void LIZJ() {
        LJIIIIZZ();
        LIZIZ = true;
    }

    public static boolean LIZIZ(Object obj) {
        Long l;
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            if (num != null && Math.abs(num.intValue()) < 1000000) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof Long) || ((l = (Long) obj) != null && Math.abs(l.longValue()) < 1000000)) {
            return true;
        }
        return false;
    }

    public static void LJI(boolean z) {
        if (LIZIZ) {
            return;
        }
        if ((z && LJFF.LJIILJJIL == null) || !LIZ()) {
            return;
        }
        LJII();
    }

    public final void onEventEndResponseException(Throwable th) {
        Class<?> cls;
        String message;
        C1862150yYf c1862150yYf = LJ;
        c1862150yYf.getClass();
        if (th instanceof C1494450ozb) {
            c1862150yYf.LJ(2);
            c1862150yYf.LIZJ(1);
            c1862150yYf.LIZLLL(th.getMessage());
        } else {
            int i = 100;
            if (th instanceof C1494690ozz) {
                C1494690ozz c1494690ozz = (C1494690ozz) th;
                int statusCode = c1494690ozz.getStatusCode();
                if (statusCode > 0) {
                    c1862150yYf.LJ(3);
                    c1862150yYf.LIZJ(statusCode);
                } else {
                    c1862150yYf.LJ(2);
                    c1862150yYf.LIZJ(100);
                }
                String message2 = c1494690ozz.getMessage();
                if (message2 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('(');
                    sbLIZ.append(statusCode);
                    sbLIZ.append(')');
                    int length = message2.length();
                    if (length <= 100) {
                        i = length;
                    }
                    sbLIZ.append(message2.substring(0, i));
                    c1862150yYf.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                    if (a0.LJJIIZI(message2, "PROXY_CONNECTION_FAILED", false)) {
                        c1862150yYf.LIZJ(2);
                    } else if (a0.LJJIIZI(message2, "HTTP2_PROTOCOL_ERROR", false)) {
                        c1862150yYf.LIZJ(3);
                    } else if (a0.LJJIIZI(message2, "TTNET_APP_TIMED_OUT", false)) {
                        c1862150yYf.LIZJ(4);
                    }
                }
            } else {
                if (th != null) {
                    cls = th.getClass();
                } else {
                    cls = null;
                }
                if (Intrinsics.LJFF(cls, IOException.class)) {
                    String message3 = th.getMessage();
                    if (message3 != null) {
                        if (a0.LJJIIZI(message3, "missing CR", false)) {
                            c1862150yYf.LJ(4);
                            c1862150yYf.LIZJ(3);
                        } else if (a0.LJJIIZI(message3, "Premature EOF", false)) {
                            c1862150yYf.LJ(4);
                            c1862150yYf.LIZJ(2);
                        } else {
                            c1862150yYf.LJ(2);
                            c1862150yYf.LIZJ(101);
                        }
                    }
                    c1862150yYf.LIZLLL(th.getMessage());
                } else if (th instanceof C2329809Ay) {
                    c1862150yYf.LJ(4);
                    c1862150yYf.LIZJ(1);
                    c1862150yYf.LIZLLL(th.getMessage());
                } else if (th instanceof C0XIR) {
                    c1862150yYf.LJ(5);
                    C0XIR c0xir = (C0XIR) th;
                    c1862150yYf.LIZJ(c0xir.getErrorCode());
                    c1862150yYf.LIZLLL(c0xir.getMessage());
                } else {
                    c1862150yYf.LJ(2);
                    if (th != null && (message = th.getMessage()) != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(th.getClass().getName());
                        sbLIZ2.append('(');
                        int length2 = message.length();
                        if (length2 <= 100) {
                            i = length2;
                        }
                        sbLIZ2.append(message.substring(0, i));
                        sbLIZ2.append(')');
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        c1862150yYf.LIZLLL(strLIZIZ);
                        if (a0.LJJIIZI(strLIZIZ, "TTNET_APP_TIMED_OUT", false)) {
                            c1862150yYf.LJ(4);
                        }
                    }
                }
            }
        }
        Integer num = c1862150yYf.LIZIZ;
        if (num == null || num.intValue() != 0) {
            LIZ.getClass();
            if (!LIZIZ && LIZ()) {
                LJII();
            }
        }
    }

    public final void onEventFirstPacketPresented(String str) {
        long jLongValue;
        if (Intrinsics.LJFF(LIZJ, str)) {
            C1862180yYi c1862180yYi = LJFF;
            if (c1862180yYi.LIZIZ != -1 && c1862180yYi.LJIIJ != null && c1862180yYi.LJIIJJI == null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                c1862180yYi.LJFF = jCurrentTimeMillis;
                Long lValueOf = Long.valueOf(jCurrentTimeMillis - c1862180yYi.LIZIZ);
                c1862180yYi.LJIIJJI = lValueOf;
                if (lValueOf != null) {
                    jLongValue = lValueOf.longValue();
                } else {
                    jLongValue = 0;
                }
                c1862180yYi.LIZ(Long.valueOf(jLongValue), "first_packet_presented_cost");
                long j = c1862180yYi.LIZLLL;
                if (j != -1) {
                    c1862180yYi.LIZ(Long.valueOf(c1862180yYi.LJFF - j), "client_first_packet_cost");
                }
                long j2 = c1862180yYi.LJI;
                if (j2 != -1) {
                    c1862180yYi.LIZ(Long.valueOf(c1862180yYi.LJFF - j2), "client_first_packet_cost_sub2");
                }
            }
        }
    }

    public final void onEventFirstPacketPresentedSub(String str) {
        if (Intrinsics.LJFF(LIZJ, str)) {
            C1862180yYi c1862180yYi = LJFF;
            if (c1862180yYi.LIZIZ != -1 && c1862180yYi.LJIIJ != null && c1862180yYi.LJI == -1) {
                c1862180yYi.LJI = System.currentTimeMillis();
                Long l = c1862180yYi.LJIIIZ;
                if (l != null) {
                    c1862180yYi.LIZ(Long.valueOf((c1862180yYi.LJI - c1862180yYi.LIZIZ) - l.longValue()), "client_first_packet_cost_sub1");
                }
            }
        }
    }

    public final void onEventGetResponse(TakoBaseResponse takoBaseResponse) {
        int i;
        C1862150yYf c1862150yYf = LJ;
        c1862150yYf.getClass();
        try {
            if (takoBaseResponse == null) {
                c1862150yYf.LIZIZ(4, -1, "data parse error", false);
                return;
            }
            if (takoBaseResponse.statusCode != 0) {
                Integer num = c1862150yYf.LIZIZ;
                String str = "response data error";
                if (num != null && num.intValue() == 1) {
                    c1862150yYf.LIZJ(takoBaseResponse.statusCode);
                    String str2 = takoBaseResponse.statusMessage;
                    if (str2.length() > 0) {
                        str = str2;
                    }
                    c1862150yYf.LIZLLL(str);
                    LIZ.getClass();
                    LJI(false);
                    return;
                }
                int i2 = takoBaseResponse.statusCode;
                if (i2 > 0) {
                    i = 5;
                } else {
                    i = 2;
                }
                String str3 = takoBaseResponse.statusMessage;
                if (str3.length() > 0) {
                    str = str3;
                }
                c1862150yYf.LIZIZ(i, i2, str, false);
                return;
            }
            Integer num2 = c1862150yYf.LIZIZ;
            if (num2 != null && num2.intValue() == 1 && C1862260yYq.LIZ <= 0) {
                c1862150yYf.LIZJ(takoBaseResponse.statusCode);
                String str4 = takoBaseResponse.statusMessage;
                if (str4.length() <= 0) {
                    str4 = "response success";
                }
                c1862150yYf.LIZLLL(str4);
                LIZ.getClass();
                LJI(false);
                return;
            }
            takoBaseResponse.statusMessage.getClass();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZLLL(int i, int i2, String str, String str2, String str3, String str4) {
        long jLongValue;
        if (Intrinsics.LJFF(LIZJ, str)) {
            C1862170yYh c1862170yYh = LJI;
            if (str2 != null) {
                c1862170yYh.LJI = str2;
                c1862170yYh.LIZ(str2, "user_intent");
            } else {
                c1862170yYh.getClass();
            }
            if (str4 != null && str4.length() != 0) {
                c1862170yYh.LIZ(str4, "template_id");
            }
            LJ.LIZIZ(0, -1, "success show", false);
            C1862180yYi c1862180yYi = LJFF;
            if (c1862180yYi.LIZIZ != -1 && c1862180yYi.LJIILJJIL == null) {
                Long lValueOf = Long.valueOf(System.currentTimeMillis() - c1862180yYi.LIZIZ);
                c1862180yYi.LJIILJJIL = lValueOf;
                if (lValueOf != null) {
                    jLongValue = lValueOf.longValue();
                } else {
                    jLongValue = 0;
                }
                c1862180yYi.LIZ(Long.valueOf(jLongValue), "whole_e2e_cost");
                c1862180yYi.LIZ(Integer.valueOf(i2), "card_type");
                c1862180yYi.LIZ(str3, "card_subtype");
                c1862180yYi.LIZ(Integer.valueOf(i), "text_count");
                LIZ.getClass();
                Integer num = c1862170yYh.LJII;
                if (num == null || num.intValue() != 1) {
                    C443120HZe c443120HZe = new C443120HZe(c1862180yYi.LJIIL, c1862180yYi.LJIILJJIL, Integer.valueOf(i));
                    Long l = (Long) c443120HZe.getFirst();
                    Long l2 = (Long) c443120HZe.getSecond();
                    int iIntValue = ((Number) c443120HZe.getThird()).intValue();
                    if (l != null) {
                        l.longValue();
                        if (l2 != null) {
                            l2.longValue();
                            long jLongValue2 = l2.longValue() - l.longValue();
                            if (iIntValue > 0 && jLongValue2 > 0) {
                                c1862180yYi.LIZ(Double.valueOf((jLongValue2 * 1.0d) / ((double) iIntValue)), "char_average_cost");
                            }
                        }
                    }
                }
                LJI(true);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void LJ(String str, EnumC1858090yS7 enumC1858090yS7, Map map, Long l, String str2, List list) {
        long jCurrentTimeMillis;
        String str3;
        LJIIIIZZ();
        C1862170yYh c1862170yYh = LJI;
        Object obj = "";
        if (c1862170yYh.LIZLLL == null) {
            c1862170yYh.LIZLLL = str;
            if (str == null) {
                str = "";
            }
            c1862170yYh.LIZ(str, "tako_send_message");
        }
        c1862170yYh.LJ = list;
        String value = enumC1858090yS7.getValue();
        if (c1862170yYh.LIZIZ == null) {
            c1862170yYh.LIZIZ = value;
            if (value == null) {
                value = "";
            }
            c1862170yYh.LIZ(value, "send_type");
        }
        if (c1862170yYh.LJIIIIZZ == null) {
            c1862170yYh.LJIIIIZZ = map;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    if (C123100dR.LIZ((String) entry.getValue())) {
                        String str4 = (String) entry.getKey();
                        Object value2 = entry.getValue();
                        if (value2 == null) {
                            value2 = "";
                        }
                        c1862170yYh.LIZ(value2, str4);
                    }
                }
            }
        }
        if (c1862170yYh.LJFF == null) {
            c1862170yYh.LJFF = str2;
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2;
            }
            c1862170yYh.LIZ(str3, "msg_source");
        }
        C1862210yYl c1862210yYl = LIZLLL;
        if (c1862210yYl.LIZIZ == null) {
            c1862210yYl.LIZIZ = "";
            c1862210yYl.LIZ("", "tako_domain");
        }
        EnumC804620VhM enumC804620VhM = C036E.LIZ.LIZIZ;
        if (c1862210yYl.LIZJ == null) {
            c1862210yYl.LIZJ = enumC804620VhM;
            Object obj2 = enumC804620VhM;
            if (enumC804620VhM == null) {
                obj2 = "";
            }
            c1862210yYl.LIZ(obj2, "network");
        }
        EnumC1494480oze enumC1494480ozeLIZIZ = C1494500ozg.LIZ.LIZIZ();
        if (c1862210yYl.LIZLLL == null) {
            c1862210yYl.LIZLLL = enumC1494480ozeLIZIZ;
            if (enumC1494480ozeLIZIZ != null) {
                obj = enumC1494480ozeLIZIZ;
            }
            c1862210yYl.LIZ(obj, "band_width_quality");
        }
        EnumC804620VhM enumC804620VhM2 = c1862210yYl.LIZJ;
        EnumC804620VhM enumC804620VhM3 = EnumC804620VhM.NONE;
        if (enumC804620VhM2 == enumC804620VhM3 || enumC804620VhM2 == enumC804620VhM3) {
            LIZ.getClass();
            LJ.LIZIZ(2, 1, "NO_NETWORK", false);
        }
        C1862180yYi c1862180yYi = LJFF;
        c1862180yYi.getClass();
        if (l != null) {
            jCurrentTimeMillis = l.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        c1862180yYi.LIZIZ = jCurrentTimeMillis;
        if (C289490BWh.LIZ() && C289490BWh.LIZ()) {
            C1861200yX8.LIZLLL = str2;
        }
    }

    public static void LJFF(C1862130yYd c1862130yYd, String str, EnumC1858090yS7 enumC1858090yS7, Map map, Long l, String str2, int i) {
        String str3 = str2;
        Long l2 = l;
        C13BV c13bv = null;
        if ((i & 8) != 0) {
            l2 = null;
        }
        if ((i & 16) != 0) {
            str3 = "inner";
        }
        if ((i & 32) != 0) {
            c13bv = C13BV.INSTANCE;
        }
        c1862130yYd.getClass();
        LJ(str, enumC1858090yS7, map, l2, str3, c13bv);
    }
}
