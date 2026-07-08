package X;

import Y.ARunnableS92S0000000_13;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.looper.MessageRecorder;
import com.bytedance.crash.monitor.k;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VdY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C802260VdY extends C801980Vd6 {
    public static JSONObject LJFF = null;
    public static JSONArray LJI = null;
    public static boolean LJII = false;
    public static boolean LJIIIIZZ = true;
    public static String LJIIIZ = "none";
    public C802320Vde LJ;

    public C802260VdY(C802680VeE c802680VeE) {
        super(c802680VeE);
    }

    public static synchronized void LJFF(String str) {
        if (!str.equals(LJIIIZ)) {
            LJIIIZ = str;
        }
    }

    public static boolean LJI(JSONArray jSONArray) {
        if (jSONArray == null) {
            return false;
        }
        try {
            if (jSONArray.toString().contains("none")) {
                return false;
            }
            if (jSONArray.toString().contains("all")) {
                return true;
            }
            if (jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (Build.VERSION.SDK_INT == CastIntegerProtector.parseInt(jSONArray.optString(i))) {
                        return true;
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return false;
    }

    @Override // X.C801980Vd6, X.InterfaceC802080VdG
    public final void LIZ(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean zLJI;
        JSONObject jSONObjectOptJSONObject3;
        boolean z10;
        String strOptString;
        JSONArray jSONArrayOptJSONArray;
        super.LIZ(jSONObject);
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("custom_event_settings");
        JSONObject jSONObjectOptJSONObject5 = null;
        if (jSONObjectOptJSONObject4 == null) {
            jSONObjectOptJSONObject = null;
        } else {
            jSONObjectOptJSONObject = jSONObjectOptJSONObject4.optJSONObject("npth_simple_setting");
        }
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("custom_event_settings");
        if (jSONObjectOptJSONObject6 == null) {
            jSONObjectOptJSONObject2 = null;
        } else {
            jSONObjectOptJSONObject2 = jSONObjectOptJSONObject6.optJSONObject("fd_track");
        }
        LJFF = jSONObjectOptJSONObject2;
        LJI = jSONObjectOptJSONObject.optJSONArray("gwp_asan_set_init_param");
        boolean z11 = true;
        if (!LJII) {
            String[] strArr = {"custom_event_settings", "npth_simple_setting", "crash_upload_domain"};
            JSONObject jSONObjectLJFF = C0VJO.LJFF(jSONObject, strArr);
            if (jSONObjectLJFF == null) {
                strOptString = null;
            } else {
                strOptString = jSONObjectLJFF.optString(strArr[2]);
            }
            String[] strArr2 = {"custom_event_settings", "npth_simple_setting", "crash_upload_domain_list"};
            JSONObject jSONObjectLJFF2 = C0VJO.LJFF(jSONObject, strArr2);
            if (jSONObjectLJFF2 == null) {
                jSONArrayOptJSONArray = null;
            } else {
                jSONArrayOptJSONArray = jSONObjectLJFF2.optJSONArray(strArr2[2]);
            }
            if (!TextUtils.isEmpty(strOptString) && jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0 && !strOptString.equals(C802380Vdk.LIZ)) {
                int i = 0;
                while (true) {
                    if (i >= jSONArrayOptJSONArray.length()) {
                        break;
                    }
                    if (strOptString.equals(jSONArrayOptJSONArray.optString(i))) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("setDomainName:");
                        sbLIZ.append(strOptString);
                        C2188811AlT.LIZIZ(sbLIZ);
                        C802380Vdk.LIZ = strOptString;
                        break;
                    }
                    i++;
                }
            }
        }
        JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("exception_modules");
        if (jSONObjectOptJSONObject7 != null && (jSONObjectOptJSONObject3 = jSONObjectOptJSONObject7.optJSONObject("biz_exception")) != null) {
            int iOptInt = jSONObjectOptJSONObject3.optInt("enable_upload", 0);
            HashSet hashSet = new HashSet();
            JSONObject jSONObjectOptJSONObject8 = jSONObjectOptJSONObject3.optJSONObject("allow_log_type");
            if (jSONObjectOptJSONObject8 != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject8.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (jSONObjectOptJSONObject8.optInt(next) == 1) {
                        hashSet.add(next);
                    }
                }
            }
            RunnableC801890Vcx runnableC801890Vcx = RunnableC801890Vcx.LLILZIL;
            if (iOptInt == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            C1189304l1 c1189304l1 = new C1189304l1(z10, hashSet);
            runnableC801890Vcx.getClass();
            if (C802300Vdc.LIZJ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("setConfig:");
                sbLIZ2.append(c1189304l1);
                C2188811AlT.LIZIZ(sbLIZ2);
            }
            System.currentTimeMillis();
            runnableC801890Vcx.LL = c1189304l1;
            if (!z10) {
                synchronized (runnableC801890Vcx.LLILLJJLI) {
                    try {
                        runnableC801890Vcx.LLILLJJLI.clear();
                    } finally {
                    }
                }
                synchronized (runnableC801890Vcx.LLILLL) {
                    try {
                        runnableC801890Vcx.LLILLL.clear();
                    } finally {
                    }
                }
                C0VXF.removeCallbacks(runnableC801890Vcx);
            } else {
                C0VXF.removeCallbacks(runnableC801890Vcx);
                C0VXF.postDelayed(runnableC801890Vcx, 30000L);
                runnableC801890Vcx.LIZ();
                runnableC801890Vcx.LIZJ();
            }
            LJFF(jSONObjectOptJSONObject3.optString("trigger"));
        }
        jSONObjectOptJSONObject.optInt("enable_upload_custom_java_crash");
        if (jSONObjectOptJSONObject.optInt("enable_dump_history_message_java") == 1) {
            z = true;
        } else {
            z = false;
        }
        C802250VdX.LJ = z;
        if (jSONObjectOptJSONObject.optInt("enable_dump_history_message_native") == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C802930Ved.LIZJ = z2;
        if (jSONObjectOptJSONObject.optInt("enable_dump_view_tree_java") == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        C802250VdX.LIZLLL = z3;
        if (jSONObjectOptJSONObject.optInt("enable_dump_view_tree_native") == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        C802930Ved.LIZIZ = z4;
        if (jSONObjectOptJSONObject.optInt("enable_dump_view_tree_anr") == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        C802640VeA.LJJJI = z5;
        jSONObjectOptJSONObject.optInt("enable_anrinfo_report");
        if (jSONObjectOptJSONObject.optInt("enable_user_custom_data") == 1) {
            z6 = true;
        } else {
            z6 = false;
        }
        LJIIIIZZ = z6;
        jSONObjectOptJSONObject.optInt("enable_logcat_report");
        jSONObjectOptJSONObject.optInt("enable_native_info");
        jSONObjectOptJSONObject.optInt("enable_dump_message");
        jSONObjectOptJSONObject.optInt("disable_looper_monitor");
        if (jSONObjectOptJSONObject.optInt("disable_dump_trace_try_catch") == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (jSONObjectOptJSONObject.optInt("enable_dump_scudo_info") == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        MessageRecorder.LJ(jSONObjectOptJSONObject.optInt("npth_looper_monitor_start_mode"));
        LJII(jSONObjectOptJSONObject);
        if (jSONObjectOptJSONObject.optInt("enable_upload_bg_anr") == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        C802430Vdp.LJIIJJI = z9;
        jSONObjectOptJSONObject.optInt("SLI_exception");
        jSONObjectOptJSONObject.optInt("scene_exception");
        if (jSONObjectOptJSONObject.optInt("enable_profiler_java_lock_monitor") == 1) {
            C0VXF.post(new ARunnableS92S0000000_13(6));
        }
        if (jSONObjectOptJSONObject.optInt("disable_anr_profiler") == 1) {
            zLJI = true;
        } else {
            zLJI = LJI(jSONObjectOptJSONObject.optJSONArray("disable_api_level_profiler"));
        }
        try {
            C08SE.LJIIIIZZ(new C0VSJ(C0VX9.LIZLLL(), "anr_profiler.config"), String.valueOf(zLJI), false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (z7) {
            NativeBridge.LJJJJZI();
        }
        if (z8) {
            int iLJJIJ = NativeBridge.LJJIJ(Build.VERSION.SDK_INT);
            C802790VeP c802790VeP = k.LIZ;
            if (c802790VeP != null) {
                c802790VeP.LIZJ.LIZIZ("init_scudo_dumper_state", String.valueOf(iLJJIJ));
            }
        }
        if (jSONObjectOptJSONObject.optInt("enable_leak_watch") != 1) {
            z11 = false;
        }
        try {
            C08SE.LJIIIIZZ(new C0VSJ(C0VX9.LIZLLL(), "object_leak.config"), String.valueOf(z11), false);
        } catch (Throwable th2) {
        }
        JSONObject jSONObjectOptJSONObject9 = jSONObject.optJSONObject("exception_modules");
        if (jSONObjectOptJSONObject9 != null) {
            jSONObjectOptJSONObject5 = jSONObjectOptJSONObject9.optJSONObject("protector");
        }
        C802760VeM.LIZ(jSONObjectOptJSONObject5);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(org.json.JSONObject r7) {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C802260VdY.LJII(org.json.JSONObject):void");
    }

    public void LJIIIIZZ(JSONObject jSONObject) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SimpleSettings:");
        sbLIZ.append(jSONObject);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LJ = new C802320Vde(jSONObject.optInt("crash_limit_issue"), jSONObject.optInt("crash_limit_all"), jSONObject.optInt("crash_limit_exception"), jSONObject.optInt("crash_limit_exception_md5"), jSONObject.optInt("crash_limit_exception_stack"));
    }
}
