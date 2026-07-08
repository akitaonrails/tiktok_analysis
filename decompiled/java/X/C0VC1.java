package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VC1, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VC1 {
    public static MappedByteBuffer LIZ;

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

    public static synchronized void LIZIZ(JSONObject jSONObject) {
        try {
            synchronized (C0VCC.class) {
                try {
                    String strLIZ = C2162308dZ.LIZ(C0VC5.LIZ);
                    if (LIZ == null) {
                        File fileLIZ = LIZ(C0VC5.LIZ);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("sdk_");
                        sbLIZ.append(strLIZ);
                        sbLIZ.append("_seq_num.txt");
                        C0VSJ c0vsj = new C0VSJ(fileLIZ, C2188811AlT.LIZIZ(sbLIZ));
                        boolean zExists = c0vsj.exists();
                        if (!zExists) {
                            c0vsj.createNewFile();
                        }
                        MappedByteBuffer map = new RandomAccessFile(c0vsj, "rws").getChannel().map(FileChannel.MapMode.READ_WRITE, 0L, 8L);
                        LIZ = map;
                        if (!zExists) {
                            map.putLong(0, 0L);
                        }
                    }
                    long j = LIZ.getLong(0);
                    jSONObject.put("seq_no", j);
                    jSONObject.put("process_name", strLIZ);
                    LIZ.putLong(0, j + 1);
                } finally {
                }
            }
        } catch (Throwable th) {
        }
    }
}
