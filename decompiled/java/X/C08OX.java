package X;

import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.os.StatFs;
import android.system.Os;
import android.system.OsConstants;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: X.08OX, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08OX {
    public static int LIZ;
    public static long LIZIZ;
    public static int LIZJ;

    public static long LJII() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new C0VSP("/proc/stat")), LSPassThroughRecordSizeConfig.DEFAULT);
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                String[] strArrSplit = line.split(" ");
                long j = Long.parseLong(strArrSplit[2]) + Long.parseLong(strArrSplit[3]) + Long.parseLong(strArrSplit[4]) + Long.parseLong(strArrSplit[6]) + Long.parseLong(strArrSplit[5]) + Long.parseLong(strArrSplit[7]) + Long.parseLong(strArrSplit[8]);
                C1971107np.LIZ(bufferedReader);
                return j;
            } catch (Throwable th) {
                th = th;
                TryCatchGuardChecker.doCheck(th);
                C1971107np.LIZ(bufferedReader);
                return -1L;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
    }

    public static long LJIIIIZZ() {
        try {
            String[] strArrSplit = LJI(C786410Ut5.j4("/proc/%s/status", new Object[]{Integer.valueOf(Process.myPid())})).trim().split("\n");
            for (String str : strArrSplit) {
                if (str.startsWith("VmSize")) {
                    Matcher matcher = PatternProtector.compile("\\d+").matcher(str);
                    if (matcher.find()) {
                        return CastLongProtector.parseLong(matcher.group());
                    }
                }
            }
            if (strArrSplit.length > 12) {
                Matcher matcher2 = PatternProtector.compile("\\d+").matcher(strArrSplit[12]);
                if (matcher2.find()) {
                    return CastLongProtector.parseLong(matcher2.group());
                }
            }
            return -1L;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return -1L;
        }
    }

    static {
        new HashMap(3);
        LIZIZ = -1L;
        LIZJ = 0;
    }

    public static synchronized int LIZJ() {
        BufferedReader bufferedReader;
        int i = LIZ;
        if (i != 0) {
            return i;
        }
        try {
            try {
                bufferedReader = new BufferedReader(new C0VSF("/proc/cpuinfo"), 50);
                int i2 = 0;
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (line.startsWith("processor")) {
                            i2++;
                        }
                    } catch (Throwable th) {
                        th = th;
                        TryCatchGuardChecker.doCheck(th);
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
                LIZ = i2;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
        return LIZ;
    }

    public static long LJFF() {
        if (LIZIZ == -1) {
            long jSysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
            if (jSysconf <= 0) {
                jSysconf = 100;
            }
            LIZIZ = jSysconf;
        }
        return LIZIZ;
    }

    public static long LIZIZ() {
        int iMyPid = Process.myPid();
        BufferedReader bufferedReader = null;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("/proc/");
            sbLIZ.append(iMyPid);
            sbLIZ.append("/stat");
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new C0VSP(C2188811AlT.LIZIZ(sbLIZ))), LSPassThroughRecordSizeConfig.DEFAULT);
            try {
                String line = bufferedReader2.readLine();
                bufferedReader2.close();
                String[] strArrSplit = line.split(" ");
                long j = Long.parseLong(strArrSplit[13]) + Long.parseLong(strArrSplit[14]) + Long.parseLong(strArrSplit[15]) + Long.parseLong(strArrSplit[16]);
                C1971107np.LIZ(bufferedReader2);
                return j;
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                TryCatchGuardChecker.doCheck(th);
                C1971107np.LIZ(bufferedReader);
                return -1L;
            }
        } catch (Throwable th2) {
            th = th2;
        }
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

    public static long LIZLLL(File file) {
        long length;
        File[] fileArrListFiles = file.listFiles();
        long j = 0;
        if (fileArrListFiles == null) {
            return 0L;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                length = LIZLLL(file2);
            } else {
                length = file2.length();
            }
            j += length;
        }
        return j;
    }

    public static long LJ(File file) {
        try {
            return C2204961BRm.LLIIII(new StatFs(file.getPath()), new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv+7san+EGJRxg0MWmicvgoCCVOI+yEpA==", null));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0L;
        }
    }

    public static String LJI(String str) throws Throwable {
        BufferedReader bufferedReader;
        C0VSJ c0vsj = new C0VSJ(str);
        FileInputStream fileInputStream = null;
        try {
            try {
                C0VSP c0vsp = new C0VSP(c0vsj);
                StringBuilder sb = new StringBuilder();
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(c0vsp));
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line != null) {
                                sb.append(line);
                                sb.append('\n');
                            } else {
                                bufferedReader.close();
                                String string = sb.toString();
                                c0vsp.close();
                                return string;
                            }
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    break;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = null;
                }
            } catch (Throwable th4) {
                th = th4;
                TryCatchGuardChecker.doCheck(th);
                if (0 != 0) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
