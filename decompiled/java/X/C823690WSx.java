package X;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.legoapi.IStorageTaskApi;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WSx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C823690WSx implements C0WT0 {
    public static final String[] LIZIZ = {"safe_mode_config_sp", "safe_mode_exception_repo", "safe_mode_v2_status", "cold_boot_launch_protector", "launch_crash_intercept_sp", "aweme_user", "token_shared_preference", "sp_TicketGuardHelper", "com.bytedance.sdk.account_setting"};
    public static final String[] LIZJ = {"token_shared_preference", "sp_TicketGuardHelper", "com.bytedance.sdk.account_setting", "imsdk_encryption"};
    public static final String[] LIZLLL = {"npth/configCrash", "Pitaya", "tt_file_st", "config-signed.json", "ColdBootFilePrefs"};
    public static final String[] LJ = {"ttpDB.db", "ttm_strategy.db"};
    public final Context LIZ;

    public final void LIZIZ() {
        try {
            C2426709f7.LIZIZ(this.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                IStorageTaskApi iStorageTaskApi = (IStorageTaskApi) PluggableExtentionKt.pluggableSpi(IStorageTaskApi.class);
                if (iStorageTaskApi != null) {
                    iStorageTaskApi.LIZIZ(this.LIZ);
                    C2426709f7.LIZIZ(this.LIZ);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        File fileLIZ = LIZ(this.LIZ);
        for (String str : LIZLLL) {
            C0VSJ c0vsj = new C0VSJ(C786410Ut5.j4("%s/%s", new Object[]{fileLIZ, str}));
            if (c0vsj.exists()) {
                C2260008tK.LJ(c0vsj.getAbsolutePath());
            }
        }
        for (String str2 : LJ) {
            File databasePath = this.LIZ.getDatabasePath(str2);
            if (databasePath != null && databasePath.exists()) {
                databasePath.delete();
            }
        }
        C0VSJ c0vsj2 = new C0VSJ(C786410Ut5.j4("%s/cache", new Object[]{fileLIZ.getParent()}));
        if (c0vsj2.exists()) {
            C2260008tK.LJ(c0vsj2.getAbsolutePath());
        }
    }

    public final void LIZLLL() {
        int i;
        C0VSJ c0vsj = new C0VSJ(LIZ(this.LIZ).getParent(), "shared_prefs");
        for (String str : c0vsj.list()) {
            String strReplace = str.replace(".xml", "");
            String[] strArr = LIZIZ;
            int length = strArr.length;
            while (true) {
                if (i < length) {
                    i = strArr[i].equals(strReplace) ? 0 : i + 1;
                } else {
                    C0VSJ c0vsj2 = new C0VSJ(c0vsj, str);
                    if (c0vsj2.exists()) {
                        try {
                            c0vsj2.delete();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            }
        }
    }

    public C823690WSx(Context context) {
        this.LIZ = context;
    }

    public static File LIZ(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    public static void LIZJ(Context context) {
        try {
            C0VSJ c0vsj = new C0VSJ(C786410Ut5.j4("%s/keva/repo", new Object[]{LIZ(context).getAbsolutePath()}));
            if (c0vsj.exists() && c0vsj.listFiles() != null) {
                for (File file : c0vsj.listFiles()) {
                    if (file.isDirectory()) {
                        String name = file.getName();
                        String[] strArr = LIZJ;
                        int length = strArr.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                if (!strArr[i].equals(name)) {
                                    i++;
                                }
                            } else {
                                C2112608Pk.LJIIIIZZ(file.getAbsolutePath());
                                break;
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void LJ(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(JSONObjectProtectorUtils.getString(jSONObject, "crash"));
            String string = JSONObjectProtectorUtils.getString(jSONObject2, "crashStack");
            int i = JSONObjectProtectorUtils.getInt(jSONObject2, "crashType");
            if ("safemode_dialog_show_v2".equals(str)) {
                LJFF(i, string, EnumC823710WSz.ACTION_DIALOG_SHOW);
            } else if ("safemode_dialog_button_clean_v2".equals(str)) {
                LJFF(i, string, EnumC823710WSz.ACTION_CLICK_SURE_BUTTON);
            } else if ("safemode_dialog_button_exit_v2".equals(str)) {
                LJFF(i, string, EnumC823710WSz.ACTION_CLICK_CANCEL_BUTTON);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void LJII(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LaunchProtectException msg:");
            sbLIZ.append(str);
            sbLIZ.append(" stack:\n");
            sbLIZ.append(str2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("SafeMode reportStack:");
            sbLIZ2.append(strLIZIZ);
            C2188811AlT.LIZIZ(sbLIZ2);
            C805380Via.LJ("LaunchProtectException", strLIZIZ, null);
        }
    }

    public static void LJFF(int i, String str, EnumC823710WSz enumC823710WSz) {
        String strLIZIZ;
        int i2 = C823700WSy.LIZ[enumC823710WSz.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    strLIZIZ = null;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("LaunchProtectClickCancel");
                    sbLIZ.append("_Event");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("LaunchProtectClickSure");
                sbLIZ2.append("_Event");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("LaunchProtectShowDialog");
            sbLIZ3.append("_Event");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (1 == i) {
            C805380Via.LJFF("LaunchProtectException", strLIZIZ, new C823680WSw(strLIZIZ, str));
        } else {
            if (2 != i) {
                return;
            }
            C805380Via.LIZ("LaunchProtectException", str, null, strLIZIZ);
        }
    }

    public static void LJI(String str, String str2, String str3) {
        if ("java".equals(str)) {
            C805380Via.LJFF("LaunchProtectException", str3, new C823680WSw(str3, str2));
        } else if ("native".equals(str)) {
            C805380Via.LIZ("LaunchProtectException", str2, null, str3);
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("event_name", str3);
        C20684815ws.LJIILLIIL("launch_protect_event", c2344009Gk.LIZ);
    }
}
