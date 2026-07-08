package X;

import Y.ARunnableS107S0000000_34;
import android.widget.TextView;
import com.bytedance.ies.safemode.SafeModeActivity;
import com.bytedance.ies.safemode.SafeModeReporter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BMW, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BMW {
    public static void LIZ() {
        if (C2203571BMd.LJIILLIIL.LIZIZ != null) {
            C823690WSx.LJI(SafeModeActivity.LL, SafeModeActivity.LLILLJJLI, "LaunchProtectClickCancel");
        }
        C1BMY.LIZIZ().getClass();
        C1BMX c1bmx = new C1BMX();
        c1bmx.LIZIZ = 2;
        c1bmx.LIZ = System.currentTimeMillis();
        C2203541BMa.LIZJ(c1bmx);
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (C2203541BMa.class) {
            C2203541BMa.LIZ.LJII(jCurrentTimeMillis, "boot_protected_time_stamp");
        }
        C2203541BMa.LIZIZ(false);
        SafeModeActivity safeModeActivity = SafeModeActivity.LLILZIL;
        if (safeModeActivity != null) {
            C786410Ut5.L3(safeModeActivity);
        }
        SafeModeReporter.CrashInfo crashInfoLIZIZ = SafeModeReporter.CrashInfo.LIZIZ(SafeModeActivity.LL, SafeModeActivity.LLILLJJLI);
        int i = SafeModeActivity.LLILLL;
        Gson gson = SafeModeReporter.LIZ;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reachType", i);
            jSONObject.put("crash", crashInfoLIZIZ.LIZLLL());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        SafeModeReporter.LIZLLL("safemode_dialog_button_exit_v2", jSONObject);
        SafeModeActivity safeModeActivity2 = SafeModeActivity.LLILZIL;
        if (safeModeActivity2 != null) {
            safeModeActivity2.finish();
        }
        SafeModeActivity safeModeActivity3 = SafeModeActivity.LLILZIL;
        if (safeModeActivity3 != null) {
            C0VO7.LIZ(safeModeActivity3);
        }
    }

    public static void LIZIZ() {
        TextView textView;
        if (C2203571BMd.LJIILLIIL.LIZIZ != null) {
            C823690WSx.LJI(SafeModeActivity.LL, SafeModeActivity.LLILLJJLI, "LaunchProtectClickSure");
        }
        SafeModeActivity safeModeActivity = SafeModeActivity.LLILZIL;
        if (safeModeActivity != null && (textView = (TextView) safeModeActivity.findViewById(R.id.nnp)) != null) {
            C786410Ut5.LLIL(textView, 0);
        }
        C1BMY.LIZIZ().getClass();
        C1BMX c1bmx = new C1BMX();
        c1bmx.LIZIZ = 1;
        c1bmx.LIZ = System.currentTimeMillis();
        C2203541BMa.LIZJ(c1bmx);
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (C2203541BMa.class) {
            C2203541BMa.LIZ.LJII(jCurrentTimeMillis, "boot_protected_time_stamp");
        }
        C2203541BMa.LIZIZ(true);
        SafeModeActivity safeModeActivity2 = SafeModeActivity.LLILZIL;
        if (safeModeActivity2 != null) {
            C786410Ut5.L3(safeModeActivity2);
        }
        SafeModeReporter.CrashInfo crashInfoLIZIZ = SafeModeReporter.CrashInfo.LIZIZ(SafeModeActivity.LL, SafeModeActivity.LLILLJJLI);
        int i = SafeModeActivity.LLILLL;
        Gson gson = SafeModeReporter.LIZ;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reachType", i);
            jSONObject.put("crash", crashInfoLIZIZ.LIZLLL());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        SafeModeReporter.LIZLLL("safemode_dialog_button_clean_v2", jSONObject);
        C0WP3.LIZ(PthreadAsyncTask.THREAD_POOL_EXECUTOR_V2).execute(new ARunnableS107S0000000_34(4));
    }
}
