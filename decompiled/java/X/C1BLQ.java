package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BLQ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BLQ {
    public static int LIZ(int i) {
        if (i == 2 || i == 3 || i == 4) {
            return 3;
        }
        if (i != 5) {
            return i != 8 ? 4 : 2;
        }
        return 1;
    }

    public static void LJ(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", C1BLT.LIZ(str));
            C20684815ws.LJIJJ("df_uninstall", jSONObject);
            CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
            C793770VBv.LJIIJJI("df_uninstall", 0, jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static JSONObject LJFF(C1BLC c1blc) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : ((LinkedHashMap) c1blc.LJFF()).entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jSONObject;
    }

    public static void LIZJ(int i, C1BLC c1blc) {
        if (c1blc == null) {
            return;
        }
        try {
            JSONObject jSONObjectLJFF = LJFF(c1blc);
            jSONObjectLJFF.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i);
            jSONObjectLJFF.put("is_silent_install", c1blc.LJFF);
            jSONObjectLJFF.put("is_regain_install", c1blc.LIZJ);
            C20684815ws.LJIJJ("df_install", jSONObjectLJFF);
            int iLIZ = LIZ(i);
            CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
            C793770VBv.LJIIJJI("df_install", iLIZ, jSONObjectLJFF);
            if (c1blc instanceof C1BLX) {
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("df_install:");
                sbLIZ.append(C786410Ut5.J3(jSONObjectLJFF));
                C1720106oR.LIZ("DynamicLanguageTask", C2188811AlT.LIZIZ(sbLIZ));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZIZ(C1BLC c1blc, int i, String str) {
        if (c1blc == null) {
            return;
        }
        try {
            JSONObject jSONObjectLJFF = LJFF(c1blc);
            jSONObjectLJFF.put("operation", i);
            jSONObjectLJFF.put("is_silent_install", c1blc.LJFF);
            jSONObjectLJFF.put("extra_info", str);
            C20684815ws.LJIJJ("df_downloader_op", jSONObjectLJFF);
            CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
            C793770VBv.LJIIJJI("df_downloader_op", i, jSONObjectLJFF);
            if (c1blc instanceof C1BLX) {
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("df_downloader_op:");
                sbLIZ.append(C786410Ut5.J3(jSONObjectLJFF));
                C1720106oR.LJI("DynamicLanguageTask", C2188811AlT.LIZIZ(sbLIZ));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZLLL(C1BLC c1blc, int i, C1BLM c1blm) {
        int i2;
        String str;
        if (c1blm != null) {
            try {
                JSONObject jSONObjectLJFF = LJFF(c1blc);
                jSONObjectLJFF.put("pre_status", i);
                jSONObjectLJFF.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, c1blm.LIZJ);
                jSONObjectLJFF.put("is_silent_install", c1blc.LJFF);
                long j = c1blm.LJ;
                long j2 = c1blm.LIZLLL;
                jSONObjectLJFF.put("bytes_downloaded", j);
                jSONObjectLJFF.put("bytes_to_download", j2);
                int i3 = c1blm.LIZJ;
                if (i3 == 2) {
                    if (j == j2) {
                        jSONObjectLJFF.put("download_duration", c1blm.LJFF);
                    }
                    if (c1blc instanceof C1BLX) {
                        int i4 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("df_state_change:");
                        sbLIZ.append(C786410Ut5.J3(jSONObjectLJFF));
                        C1720106oR.LJI("DynamicLanguageTask", C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else if (i3 == 6 || i3 == 0 || i3 == 3) {
                    jSONObjectLJFF.put("error_code", c1blm.LJI);
                    C844470XAv c844470XAv = C844470XAv.LIZ;
                    c844470XAv.getClass();
                    jSONObjectLJFF.put("available_size", C09N1.LJ(C844470XAv.LIZ()));
                    c844470XAv.getClass();
                    jSONObjectLJFF.put("total_size", C09N1.LJI(C844470XAv.LIZ()));
                    try {
                        c844470XAv.getClass();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if ((C844470XAv.LIZ().getApplicationInfo().flags & 262144) == 262144) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    jSONObjectLJFF.put("is_external_storage", i2);
                    if (((Boolean) C08PT.LJ.getValue()).booleanValue()) {
                        str = "1";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    jSONObjectLJFF.put("is_gp_install", str);
                    if (c1blc instanceof C1BLX) {
                        int i5 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("df_state_change:");
                        sbLIZ2.append(C786410Ut5.J3(jSONObjectLJFF));
                        C1720106oR.LIZ("DynamicLanguageTask", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
                C20684815ws.LJIJJ("df_state_change", jSONObjectLJFF);
                int i6 = c1blm.LIZJ;
                CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                C793770VBv.LJIIJJI("df_state_change", i6, jSONObjectLJFF);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }
}
