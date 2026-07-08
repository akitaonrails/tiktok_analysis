package X;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.videoarch.liveio.LiveIOManager;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oWt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1476650oWt {
    public static Context LJ;
    public boolean LIZ;
    public int LIZIZ = -1;
    public boolean LIZJ;
    public String LIZLLL;

    public static void LIZIZ() {
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

    public static boolean LJI(C1476640oWs c1476640oWs) {
        int iLIZ;
        int iLIZ2;
        boolean z;
        new C2118408Rq();
        int iLIZ3 = -1;
        try {
            iLIZ = C2118408Rq.LIZ("vcbasekit");
            try {
                iLIZ2 = C2118408Rq.LIZ("ttquic");
                try {
                    iLIZ3 = C2118408Rq.LIZ("avmdlbase");
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Exception e2) {
                e = e2;
                iLIZ2 = -1;
            }
        } catch (Exception e3) {
            e = e3;
            iLIZ = -1;
            iLIZ2 = -1;
        }
        if (!c1476640oWs.LIZLLL && iLIZ2 != 0) {
            z = false;
        } else {
            z = true;
        }
        if (iLIZ != 0 || !z || iLIZ3 != 0) {
            return false;
        }
        return true;
    }

    public final long LIZJ(int i) {
        if (this.LIZJ) {
            return LiveIOManager.getInstance().getLongValue(i);
        }
        return -1L;
    }

    public final boolean LJFF(C1476640oWs c1476640oWs) {
        if (LiveIOManager.getInstance().isRunning()) {
            return true;
        }
        LiveIOManager.getInstance().setConfig(LSPassThroughRecordSizeConfig.DEFAULT, this.LIZLLL);
        int iStart = LiveIOManager.getInstance().start();
        this.LIZLLL = null;
        if (iStart != 0) {
            return false;
        }
        if (c1476640oWs.LIZJ) {
            LiveIOManager.getInstance().setApplicationContext(LJ);
            LiveIOManager.getInstance().setIntValue(1005, LiveIOManager.getInstance().getCurrentNetworkType());
        }
        return true;
    }

    public final boolean LJIIIIZZ(C1476640oWs c1476640oWs) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cache_dir", c1476640oWs.LIZ);
            String absolutePath = LIZ(LJ).getAbsolutePath();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(absolutePath);
            sbLIZ.append("/liveio.scfg");
            jSONObject.put("SCFGPath", C2188811AlT.LIZIZ(sbLIZ));
            jSONObject.put("loadQuicASyn", c1476640oWs.LIZIZ);
            jSONObject.put("EnableConfigCenterOpenDL", c1476640oWs.LJFF);
            if (c1476640oWs.LJ) {
                String absolutePath2 = null;
                File fileY2 = C786410Ut5.y2(LJ, null);
                if (fileY2 != null || (fileY2 = LIZ(LJ)) != null) {
                    absolutePath2 = fileY2.getAbsolutePath();
                }
                if (!TextUtils.isEmpty(absolutePath2)) {
                    jSONObject.put("SslKeyLogPath", absolutePath2);
                }
            }
            jSONObject.put("liveio_params_config", c1476640oWs.LJI);
            this.LIZLLL = C786410Ut5.J3(jSONObject);
            return true;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public final long LIZLLL(String str, int i) {
        if (this.LIZJ) {
            return LiveIOManager.getInstance().getLongValueByStr(str, i);
        }
        return -1L;
    }

    public final String LJ(String str, int i) {
        if (this.LIZJ) {
            return LiveIOManager.getInstance().getStringValueByStr(str, i);
        }
        return null;
    }

    public final void LJIIIZ(int i, long j) {
        if (this.LIZJ) {
            LiveIOManager.getInstance().setLongValue(i, j);
        }
    }

    public final void LJIIJJI(Context context, C1476640oWs c1476640oWs) {
        if (context == null) {
            return;
        }
        synchronized (this) {
            try {
                if (this.LIZ) {
                    return;
                }
                LJ = context;
                if (LJIIIIZZ(c1476640oWs) && LJI(c1476640oWs) && LJFF(c1476640oWs)) {
                    this.LIZ = true;
                    this.LIZJ = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIL(Context context, C1476640oWs c1476640oWs) {
        if (context == null) {
            return;
        }
        synchronized (this) {
            try {
                if (this.LIZ) {
                    return;
                }
                if (!LJI(c1476640oWs)) {
                    return;
                }
                LJ = context;
                if (!LJIIIIZZ(c1476640oWs) || !LJFF(c1476640oWs)) {
                    return;
                }
                synchronized (this) {
                    try {
                        this.LIZ = true;
                        this.LIZJ = true;
                    } finally {
                    }
                }
            } finally {
            }
        }
    }

    public final void LJII(int i, String str, long j) {
        if (this.LIZJ) {
            LiveIOManager.getInstance().setInt64ValueByStrKey(i, str, j);
        }
    }

    public final void LJIIJ(int i, String str, String str2) {
        if (this.LIZJ) {
            LiveIOManager.getInstance().setStringValueByStrKey(i, str, str2);
        }
    }
}
