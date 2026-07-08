package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ozs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1494620ozs extends AbstractC1494610ozr {
    public volatile String LIZ;
    public boolean LIZIZ;

    public static void LJIIZILJ(JSONObject jSONObject) {
        try {
            jSONObject.put("nt_band_width", C1494500ozg.LIZ.LIZIZ());
            jSONObject.put("cdn_nt_band_width", C1494540ozk.LIZ.LIZIZ());
            jSONObject.put("cronet_open", C1493400oxu.LJIIJ(TTNetInit.getTTNetDepend().getContext()).LJFF());
            TTNetInit.getTTNetDepend().LIZIZ();
            jSONObject.put("cronet_plugin_install", true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LJIIL(C1494850p0F c1494850p0F, JSONObject jSONObject) throws JSONException {
        C0XPH c0xphLJII;
        jSONObject.put("processName", C2162308dZ.LIZ(C0XM1.LIZ().LIZ));
        C0XPI c0xpiLIZJ = C0XM1.LIZJ();
        if (c0xpiLIZJ != null && (c0xphLJII = c0xpiLIZJ.LJII()) != null) {
            jSONObject.put("first_app_foreground_timestamp", c0xphLJII.LIZ);
            jSONObject.put("last_app_foreground_timestamp", c0xphLJII.LIZIZ);
            jSONObject.put("last_app_background_timestamp", c0xphLJII.LIZJ);
        }
        jSONObject.put("request_start_app_resume_state", c1494850p0F.LJIJJLI);
        jSONObject.put("request_end_app_resume_state", c1494850p0F.LJIL);
    }

    public static void LJIILIIL(String str, List list, JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            C1494800p0A c1494800p0A = (C1494800p0A) ListProtector.get(list, i);
            long j = c1494800p0A.LIZJ - c1494800p0A.LIZIZ;
            Long l = (Long) map.get(c1494800p0A.LIZ);
            if (l == null) {
                map.put(c1494800p0A.LIZ, Long.valueOf(j));
            } else {
                map.put(c1494800p0A.LIZ, Long.valueOf(l.longValue() + j));
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : map.keySet()) {
            jSONObject2.put(str2, map.get(str2));
        }
        jSONObject.put(str, jSONObject2);
    }

    public static void LJIILLIIL(C1494570ozn c1494570ozn, String str, JSONObject jSONObject, String str2) throws JSONException {
        Object obj = ((HashMap) c1494570ozn.LJL).get(str);
        if (obj instanceof Map) {
            Map map = (Map) obj;
            JSONObject jSONObject2 = new JSONObject();
            for (String str3 : map.keySet()) {
                jSONObject2.put(str3, map.get(str3));
            }
            jSONObject.put(str2, jSONObject2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0302  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(org.json.JSONObject r17, X.C1494850p0F r18, java.lang.Throwable r19, int r20) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1494620ozs.LJIILJJIL(org.json.JSONObject, X.0p0F, java.lang.Throwable, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(org.json.JSONObject r7, X.C1494850p0F r8, java.lang.Throwable r9, int r10) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1494620ozs.LJIILL(org.json.JSONObject, X.0p0F, java.lang.Throwable, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [X.0ozs] */
    @Override // X.AbstractC1494610ozr
    public final void LJIIIIZZ(long j, long j2, String str, String str2, C1494850p0F c1494850p0F, JSONObject jSONObject) {
        long j3;
        long j4;
        String str3 = "image";
        if (c1494850p0F == null) {
            return;
        }
        try {
            if (C1493430oxx.LIZ()) {
                jSONObject.put("netClientType", "CronetClient");
            } else {
                jSONObject.put("netClientType", "TTOkhttp3Client");
            }
            C1494470ozd c1494470ozd = C1494500ozg.LIZ;
            jSONObject.put("networkQuality", c1494470ozd.LIZIZ().toString());
            ?? LIZJ = (int) c1494470ozd.LIZJ();
            jSONObject.put("downloadSpeed", (int) LIZJ);
            jSONObject.put("cronet_plugin_install", C0XM1.LIZ().LJIILIIL.LIZ.LJIILIIL.invoke());
            jSONObject.put("cronet_plugin_version", C0XM1.LIZ().LJIILJJIL.LIZ.LJIILJJIL.invoke());
            try {
                LIZJ = this;
                LIZJ.LJIILL(jSONObject, c1494850p0F, null, 0);
                LJIIL(c1494850p0F, jSONObject);
                j3 = LIZJ;
            } catch (JSONException e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
                j3 = LIZJ;
            }
        } catch (JSONException e2) {
            e = e2;
        }
        try {
            j3 = j;
            if (!c1494850p0F.LJJIJIIJI.contains("image")) {
                str3 = "api";
            }
            long j5 = 0;
            if (jSONObject.has("timing_totalSendBytes")) {
                j5 = 0 + CastLongProtector.parseLong(jSONObject.get("timing_totalSendBytes").toString());
            }
            if (jSONObject.has("timing_totalReceivedBytes")) {
                j5 += CastLongProtector.parseLong(jSONObject.get("timing_totalReceivedBytes").toString());
            }
            C0XPI c0xpiLIZJ = C0XM1.LIZJ();
            j4 = j3;
            if (c0xpiLIZJ != null) {
                c0xpiLIZJ.LJI(j5, j3, str3);
                j4 = j3;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            j4 = j3;
        }
        C793770VBv.LJIIIIZZ(j4, j2, str, "", str2, 200, jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [long] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.String] */
    @Override // X.AbstractC1494610ozr
    public final void LJII(long j, long j2, String str, String str2, C1494850p0F c1494850p0F, Throwable th, JSONObject jSONObject) {
        ?? r12;
        long j3;
        String str3 = "image";
        if (c1494850p0F == null) {
            return;
        }
        String[] strArr = new String[1];
        int iLIZIZ = C1498560p6E.LIZIZ(th, strArr);
        int iLIZJ = C1498560p6E.LIZJ(th);
        if (th != null) {
            try {
                C1494470ozd c1494470ozd = C1494500ozg.LIZ;
                jSONObject.put("networkQuality", c1494470ozd.LIZIZ().toString());
                jSONObject.put("downloadSpeed", (int) c1494470ozd.LIZJ());
                jSONObject.put("cronet_plugin_install", C0XM1.LIZ().LJIILIIL.LIZ.LJIILIIL.invoke());
                jSONObject.put("cronet_plugin_version", C0XM1.LIZ().LJIILJJIL.LIZ.LJIILJJIL.invoke());
                jSONObject.put("substatus", iLIZJ);
                if (C1493430oxx.LIZ()) {
                    jSONObject.put("netClientType", "CronetClient");
                } else {
                    jSONObject.put("netClientType", "TTOkhttp3Client");
                }
                jSONObject.put("addExecutorToAllInterceptors", c1494850p0F.LJFF - c1494850p0F.LJ);
                jSONObject.put("addExecutorTime", c1494850p0F.LJ);
                r12 = "allInterceptorsTime";
                jSONObject.put("allInterceptorsTime", c1494850p0F.LJI - c1494850p0F.LJFF);
                try {
                    LJIILL(jSONObject, c1494850p0F, th, iLIZJ);
                    LJIIL(c1494850p0F, jSONObject);
                } catch (JSONException e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (JSONException e2) {
                e = e2;
            }
        }
        try {
            r12 = j;
            if (!c1494850p0F.LJJIJIIJI.contains("image")) {
                str3 = "api";
            }
            long j4 = 0;
            if (jSONObject.has("timing_totalSendBytes")) {
                j4 = 0 + CastLongProtector.parseLong(jSONObject.get("timing_totalSendBytes").toString());
            }
            if (jSONObject.has("timing_totalReceivedBytes")) {
                j4 += CastLongProtector.parseLong(jSONObject.get("timing_totalReceivedBytes").toString());
            }
            C0XPI c0xpiLIZJ = C0XM1.LIZJ();
            j3 = r12;
            if (c0xpiLIZJ != 0) {
                c0xpiLIZJ.LJI(j4, r12, str3);
                j3 = r12;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            j3 = r12;
        }
        String str4 = strArr[0];
        boolean zLJI = MethodIDManager.LJI(138004);
        C793770VBv.LIZLLL(j3, j2, str, str4, str2, iLIZIZ, jSONObject);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        C793770VBv.LJIIIIZZ(j3, j2, str, strArr[0], str2, iLIZIZ, jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12, types: [long] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [X.0ozs] */
    /* JADX WARN: Type inference failed for: r2v3 */
    @Override // X.AbstractC1494610ozr
    public final void LJIIIZ(long j, long j2, String str, String str2, String str3, C1494850p0F c1494850p0F, JSONObject jSONObject) {
        long j3;
        long j4;
        String str4 = "image";
        if (c1494850p0F == null) {
            return;
        }
        try {
            if (c1494850p0F.LJJIJIL) {
                jSONObject.put("hit_rules", 1);
            }
            if (C1493430oxx.LIZ()) {
                jSONObject.put("netClientType", "CronetClient");
            } else {
                jSONObject.put("netClientType", "TTOkhttp3Client");
            }
            C1494470ozd c1494470ozd = C1494500ozg.LIZ;
            jSONObject.put("networkQuality", c1494470ozd.LIZIZ().toString());
            jSONObject.put("downloadSpeed", (int) c1494470ozd.LIZJ());
            jSONObject.put("cronet_plugin_install", C0XM1.LIZ().LJIILIIL.LIZ.LJIILIIL.invoke());
            jSONObject.put("cronet_plugin_version", C0XM1.LIZ().LJIILJJIL.LIZ.LJIILJJIL.invoke());
            jSONObject.put("addExecutorToAllInterceptors", c1494850p0F.LJFF - c1494850p0F.LJ);
            jSONObject.put("addExecutorTime", c1494850p0F.LJ);
            ?? r2 = c1494850p0F.LJI - c1494850p0F.LJFF;
            jSONObject.put("allInterceptorsTime", (long) r2);
            jSONObject.put("fallback", c1494850p0F.LJJII);
            jSONObject.put("requestHeader", c1494850p0F.LJJIIZI);
            jSONObject.put("responseHeader", c1494850p0F.LJJIJ);
            try {
                r2 = this;
                r2.LJIILJJIL(jSONObject, c1494850p0F, null, 0);
                LJIIL(c1494850p0F, jSONObject);
                j3 = r2;
            } catch (JSONException e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
                j3 = r2;
            }
        } catch (JSONException e2) {
            e = e2;
        }
        try {
            j3 = j;
            if (!c1494850p0F.LJJIJIIJI.contains("image")) {
                str4 = "api";
            }
            long j5 = 0;
            if (jSONObject.has("timing_totalSendBytes")) {
                j5 = 0 + CastLongProtector.parseLong(jSONObject.get("timing_totalSendBytes").toString());
            }
            if (jSONObject.has("timing_totalReceivedBytes")) {
                j5 += CastLongProtector.parseLong(jSONObject.get("timing_totalReceivedBytes").toString());
            }
            C0XPI c0xpiLIZJ = C0XM1.LIZJ();
            j4 = j3;
            if (c0xpiLIZJ != null) {
                c0xpiLIZJ.LJI(j5, j3, str4);
                j4 = j3;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            j4 = j3;
        }
        C793770VBv.LJIIIIZZ(j4, j2, str, str3, str2, 200, jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v3, types: [long] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.String] */
    @Override // X.AbstractC1494610ozr
    public final void LJI(long j, long j2, String str, String str2, String str3, C1494850p0F c1494850p0F, Throwable th, JSONObject jSONObject) {
        ?? r11;
        long j3;
        String str4 = "image";
        if (c1494850p0F == null) {
            return;
        }
        int iLIZIZ = C1498560p6E.LIZIZ(th, new String[]{str3});
        int iLIZJ = C1498560p6E.LIZJ(th);
        if (th != null) {
            try {
                C1494470ozd c1494470ozd = C1494500ozg.LIZ;
                jSONObject.put("networkQuality", c1494470ozd.LIZIZ().toString());
                jSONObject.put("downloadSpeed", (int) c1494470ozd.LIZJ());
                jSONObject.put("cronet_plugin_install", C0XM1.LIZ().LJIILIIL.LIZ.LJIILIIL.invoke());
                jSONObject.put("cronet_plugin_version", C0XM1.LIZ().LJIILJJIL.LIZ.LJIILJJIL.invoke());
                jSONObject.put("substatus", iLIZJ);
                if (C1493430oxx.LIZ()) {
                    jSONObject.put("netClientType", "CronetClient");
                } else {
                    jSONObject.put("netClientType", "TTOkhttp3Client");
                }
                jSONObject.put("addExecutorToAllInterceptors", c1494850p0F.LJFF - c1494850p0F.LJ);
                jSONObject.put("addExecutorTime", c1494850p0F.LJ);
                r11 = "allInterceptorsTime";
                jSONObject.put("allInterceptorsTime", c1494850p0F.LJI - c1494850p0F.LJFF);
                jSONObject.put("fallback", c1494850p0F.LJJII);
                jSONObject.put("requestHeader", c1494850p0F.LJJIIZI);
                jSONObject.put("responseHeader", c1494850p0F.LJJIJ);
                try {
                    LJIILJJIL(jSONObject, c1494850p0F, th, iLIZJ);
                    LJIIL(c1494850p0F, jSONObject);
                } catch (JSONException e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (JSONException e2) {
                e = e2;
            }
        }
        try {
            r11 = j;
            if (!c1494850p0F.LJJIJIIJI.contains("image")) {
                str4 = "api";
            }
            long j4 = 0;
            if (jSONObject.has("timing_totalSendBytes")) {
                j4 = 0 + CastLongProtector.parseLong(jSONObject.get("timing_totalSendBytes").toString());
            }
            if (jSONObject.has("timing_totalReceivedBytes")) {
                j4 += CastLongProtector.parseLong(jSONObject.get("timing_totalReceivedBytes").toString());
            }
            C0XPI c0xpiLIZJ = C0XM1.LIZJ();
            j3 = r11;
            if (c0xpiLIZJ != 0) {
                c0xpiLIZJ.LJI(j4, r11, str4);
                j3 = r11;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            j3 = r11;
        }
        boolean zLJI = MethodIDManager.LJI(138004);
        C793770VBv.LIZLLL(j3, j2, str, str3, str2, iLIZIZ, jSONObject);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        C793770VBv.LJIIIIZZ(j3, j2, str, str3, str2, iLIZIZ, jSONObject);
    }
}
