package X;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.librarian.Librarian;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.io.File;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;

/* JADX INFO: renamed from: X.08OG, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08OG {
    public static final List<String> LIZ = new ArrayList();

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

    public static C0VSJ LIZIZ(Context context, String str) {
        String strMapLibraryName = System.mapLibraryName("monitorcollector-lib");
        if (context == null || LIZ(context) == null) {
            return null;
        }
        C0VSJ c0vsj = new C0VSJ(LIZ(context), "libso");
        if (!c0vsj.exists()) {
            new C0VSJ(c0vsj.getAbsolutePath()).mkdirs();
        }
        if (!TextUtils.isEmpty(str)) {
            str = str.replace(context.getPackageName(), "").replace(":", "");
            if (!TextUtils.isEmpty(str)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("_");
                str = C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(strMapLibraryName);
        return new C0VSJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static synchronized boolean LIZJ(Context context, String str) {
        List<String> list = LIZ;
        if (((ArrayList) list).contains("monitorcollector-lib")) {
            return true;
        }
        try {
            try {
                LoadSoLancet.LIZJ("monitorcollector-lib");
                long jUptimeMillis = SystemClock.uptimeMillis();
                Librarian.LJFF("monitorcollector-lib");
                LoadSoLancet.LJ(jUptimeMillis, "monitorcollector-lib");
                LoadSoLancet.LIZLLL(jUptimeMillis, "monitorcollector-lib");
                LoadSoLancet.LIZIZ("monitorcollector-lib");
                ((ArrayList) list).add("monitorcollector-lib");
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                C792910V8n.LIZJ("APM-LoadLibrary", "System loadFailed", e);
                C0VSJ c0vsjLIZIZ = LIZIZ(context, str);
                if (c0vsjLIZIZ == null) {
                    return false;
                }
                if (c0vsjLIZIZ.exists()) {
                    c0vsjLIZIZ.delete();
                }
                if (LIZLLL(context, c0vsjLIZIZ) != null) {
                    return false;
                }
                try {
                    System.load(c0vsjLIZIZ.getAbsolutePath());
                    ((ArrayList) LIZ).add("monitorcollector-lib");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C792910V8n.LIZJ("APM-LoadLibrary", "Unpack loadFailed", th);
                    return false;
                }
            }
            return true;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return false;
        }
    }

    public static String LIZLLL(Context context, C0VSJ c0vsj) {
        InputStream inputStream;
        C09NU c09nu;
        C0VSV c0vsv = null;
        try {
            c09nu = new C09NU(new C0VSJ(context.getApplicationInfo().sourceDir));
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("lib/");
                String str = Build.CPU_ABI;
                sbLIZ.append(str);
                sbLIZ.append("/");
                sbLIZ.append(System.mapLibraryName("monitorcollector-lib"));
                ZipEntry entry = c09nu.getEntry(C2188811AlT.LIZIZ(sbLIZ));
                if (entry == null) {
                    int iIndexOf = str.indexOf(45);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("lib/");
                    if (iIndexOf <= 0) {
                        iIndexOf = str.length();
                    }
                    sbLIZ2.append(str.substring(0, iIndexOf));
                    sbLIZ2.append("/");
                    sbLIZ2.append(System.mapLibraryName("monitorcollector-lib"));
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    entry = c09nu.getEntry(strLIZIZ);
                    if (entry == null) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("Library entry not found:");
                        sbLIZ3.append(strLIZIZ);
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                        try {
                            c09nu.close();
                            return strLIZIZ2;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            return strLIZIZ2;
                        }
                    }
                }
                c0vsj.createNewFile();
                inputStream = c09nu.getInputStream(entry);
                try {
                    C0VSV c0vsv2 = new C0VSV(c0vsj);
                    try {
                        byte[] bArr = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
                        while (true) {
                            int i = inputStream.read(bArr);
                            if (i > 0) {
                                c0vsv2.write(bArr, 0, i);
                            } else {
                                C1971107np.LIZIZ(c0vsj.getAbsolutePath());
                                C1971107np.LIZ(c0vsv2);
                                C1971107np.LIZ(inputStream);
                                try {
                                    c09nu.close();
                                    return null;
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    return null;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        c0vsv = c0vsv2;
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            String message = th.getMessage();
                            C1971107np.LIZ(c0vsv);
                            C1971107np.LIZ(inputStream);
                            if (c09nu != null) {
                                try {
                                    c09nu.close();
                                    return message;
                                } catch (Throwable th4) {
                                    TryCatchGuardChecker.doCheck(th4);
                                    return message;
                                }
                            }
                            return message;
                        } catch (Throwable th5) {
                            TryCatchGuardChecker.doCheck(th5);
                            C1971107np.LIZ(c0vsv);
                            C1971107np.LIZ(inputStream);
                            if (c09nu != null) {
                                try {
                                    c09nu.close();
                                    throw th5;
                                } catch (Throwable th6) {
                                    TryCatchGuardChecker.doCheck(th6);
                                    throw th5;
                                }
                            }
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            } catch (Throwable th8) {
                th = th8;
                inputStream = null;
            }
        } catch (Throwable th9) {
            th = th9;
            inputStream = null;
            c09nu = null;
        }
    }
}
