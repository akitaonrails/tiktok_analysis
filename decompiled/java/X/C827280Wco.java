package X;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.alog.Alog;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0Wco, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C827280Wco {
    public final Context LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJIIIIZZ;
    public String LJIIJJI;
    public boolean LJIJI;
    public int LJFF = 2097152;
    public int LJI = 20971520;
    public int LJII = 7;
    public int LJIIIZ = 65536;
    public int LJIIJ = 196608;
    public int LJIIL = Alog.LJIIIIZZ;
    public int LJIILIIL = Alog.LJIIIZ;
    public int LJIILJJIL = Alog.LJIIJ;
    public int LJIILL = Alog.LJIIJJI;
    public int LJIILLIIL = Alog.LJIIL;
    public int LJIIZILJ = Alog.LJIILIIL;
    public String LJIJ = "b012e20c9aab1cb5257aca2069cb79a9339b3a2224f771c78d64972137936eaf0b2f7ebd8d46c2607e1d7fe7723d40b147b8ecfa8fe2eaeee05210c75822381a";

    public final Alog LIZIZ() {
        if (this.LIZLLL == null) {
            this.LIZLLL = "default";
        }
        ArrayList<String> arrayList = Alog.LJIILL;
        synchronized (arrayList) {
            try {
                Iterator<String> it2 = arrayList.iterator();
                do {
                    String str = null;
                    if (!it2.hasNext()) {
                        Alog.LJIILL.add(this.LIZLLL);
                        if (this.LJ == null) {
                            File fileY2 = C786410Ut5.y2(this.LIZ, null);
                            if (fileY2 != null) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(fileY2.getPath());
                                sbLIZ.append("/alog");
                                this.LJ = C2188811AlT.LIZIZ(sbLIZ);
                            } else {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(LIZ(this.LIZ));
                                sbLIZ2.append("/alog");
                                this.LJ = C2188811AlT.LIZIZ(sbLIZ2);
                            }
                        }
                        if (this.LJIIIIZZ == null) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(LIZ(this.LIZ));
                            sbLIZ3.append("/alog");
                            this.LJIIIIZZ = C2188811AlT.LIZIZ(sbLIZ3);
                        }
                        if (this.LJIIJJI == null) {
                            Context context = this.LIZ;
                            try {
                                str = C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), 0).versionName;
                            } catch (Exception e) {
                            }
                            if (TextUtils.isEmpty(str)) {
                                str = "unknown";
                            }
                            this.LJIIJJI = str;
                        }
                        int i = (this.LJIIIZ / SpeechEngineDefines.TTS_WORK_MODE_BOTH) * SpeechEngineDefines.TTS_WORK_MODE_BOTH;
                        this.LJIIIZ = i;
                        int i2 = (this.LJIIJ / SpeechEngineDefines.TTS_WORK_MODE_BOTH) * SpeechEngineDefines.TTS_WORK_MODE_BOTH;
                        this.LJIIJ = i2;
                        if (i < 4096) {
                            this.LJIIIZ = SpeechEngineDefines.TTS_WORK_MODE_BOTH;
                        }
                        int i3 = this.LJIIIZ;
                        if (i2 < i3 * 2) {
                            this.LJIIJ = i3 * 2;
                        }
                        return new Alog(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI);
                    }
                } while (!it2.next().equals(this.LIZLLL));
                return null;
            } finally {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public C827280Wco(Context context) {
        Context contextN3 = C786410Ut5.N3(context);
        this.LIZ = contextN3 != null ? contextN3 : context;
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

    public final void LIZJ(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str.contains("-")) {
                str = str.replace("-", "");
            }
            if (str.contains("_")) {
                str = str.replace("_", "");
            }
            if (!TextUtils.isEmpty(str)) {
                this.LIZLLL = str;
            }
        }
    }
}
