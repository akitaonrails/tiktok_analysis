package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.080G, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C080G {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(C080C c080c) {
        if (C080D.LIZ[c080c.ordinal()] == 1) {
            return ((Boolean) C080H.LIZ.getValue()).booleanValue();
        }
        throw new C1954807lC();
    }

    public static void LIZIZ(String str, JSONObject jSONObject) {
        C20571615ec c20571615ec = C20571615ec.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OutreachPipelineTracker track event=");
        sbLIZ.append(str);
        sbLIZ.append(", params=");
        sbLIZ.append(jSONObject);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c20571615ec.getClass();
        C20571615ec.LIZ(strLIZIZ);
    }

    public static void LIZJ(final C080C c080c, final String str, String str2, String str3, final int i, String str4, String str5, int i2) {
        final String str6 = str4;
        final String str7 = str3;
        final String str8 = str2;
        final String str9 = null;
        if ((i2 & 4) != 0) {
            str8 = null;
        }
        if ((i2 & 8) != 0) {
            str7 = null;
        }
        if ((i2 & 32) != 0) {
            str6 = null;
        }
        if ((i2 & 64) == 0) {
            str9 = str5;
        }
        final String str10 = null;
        if (LIZ(c080c)) {
            C20684815ws.LJFF().execute(new Runnable() { // from class: X.080J
                public final void LIZ() {
                    Object c098200Yq;
                    C080C c080c2 = c080c;
                    String str11 = str;
                    int i3 = i;
                    String str12 = str8;
                    String str13 = str7;
                    String str14 = str6;
                    String str15 = str9;
                    String str16 = str10;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("stage", str11);
                        jSONObject.put("reason_code", i3);
                        jSONObject.put("timing_key", str12);
                        jSONObject.put("outreach_key", str13);
                        jSONObject.put("reason_msg", str14);
                        jSONObject.put("log_id", str15);
                        jSONObject.put("extra", str16);
                        C20684815ws.LJIJ(c080c2.getExceptionEventName(), jSONObject);
                        C080G.LIZIZ(c080c2.getExceptionEventName(), jSONObject);
                        c098200Yq = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    C080C c080c3 = c080c;
                    String str17 = str;
                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    if (thM5exceptionOrNullimpl != null) {
                        C20571615ec.LIZ.getClass();
                        C20571615ec.LIZIZ("OutreachPipelineTracker reportBizException error, biz=" + c080c3 + ", stage=" + str17 + ", error=" + thM5exceptionOrNullimpl);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("OutreachPipelineTracker@32ff.reportBizException$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("OutreachPipelineTracker@32ff.reportBizException$1");
                }
            });
        }
    }

    public static void LIZLLL(final String str, String str2, String str3, final int i, String str4, String str5, String str6, int i2) {
        final String str7 = str5;
        final String str8 = str4;
        final String str9 = str3;
        final String str10 = str6;
        final String str11 = str2;
        final String str12 = null;
        if ((i2 & 2) != 0) {
            str11 = null;
        }
        if ((i2 & 4) != 0) {
            str9 = null;
        }
        if ((i2 & 32) != 0) {
            str8 = null;
        }
        if ((i2 & 64) != 0) {
            str7 = null;
        }
        if ((i2 & 128) != 0) {
            str10 = null;
        }
        if (C080E.LIZ()) {
            C20684815ws.LJFF().execute(new Runnable() { // from class: X.080K
                public final void LIZ() {
                    Object c098200Yq;
                    String str13 = str;
                    int i3 = i;
                    String str14 = str11;
                    String str15 = str9;
                    String str16 = str12;
                    String str17 = str8;
                    String str18 = str7;
                    String str19 = str10;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("stage", str13);
                        jSONObject.put("reason_code", i3);
                        jSONObject.put("timing_key", str14);
                        jSONObject.put("outreach_type", str15);
                        jSONObject.put("outreach_key", str16);
                        jSONObject.put("reason_msg", str17);
                        jSONObject.put("log_id", str18);
                        jSONObject.put("extra", str19);
                        C20684815ws.LJIJ("outreach_signal_exception", jSONObject);
                        C080G.LIZIZ("outreach_signal_exception", jSONObject);
                        c098200Yq = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    String str20 = str;
                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    if (thM5exceptionOrNullimpl != null) {
                        C20571615ec.LIZ.getClass();
                        C20571615ec.LIZIZ("OutreachPipelineTracker reportFrameworkException error, stage=" + str20 + ", error=" + thM5exceptionOrNullimpl);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("OutreachPipelineTracker@32ff.reportFrameworkException$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("OutreachPipelineTracker@32ff.reportFrameworkException$1");
                }
            });
        }
    }
}
