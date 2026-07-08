package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.FileFilter;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0VDM, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VDM {
    public final Map<String, Boolean> LIZ = new HashMap();
    public volatile C0VSJ LIZIZ;

    public final File LIZ() throws Throwable {
        Object obj;
        if (this.LIZIZ == null) {
            Context applicationContext = null;
            if (C792400V6o.LIZ == null) {
                return null;
            }
            Context context = C792400V6o.LIZ;
            File file = C786450Ut9.LIZJ;
            if (file == null || !C786450Ut9.LJ) {
                try {
                    C786450Ut9.LIZJ = context.getFilesDir();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        Class<?> cls = Class.forName("android.app.ActivityThread");
                        Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                        Field declaredField = cls.getDeclaredField("mInitialApplication");
                        declaredField.setAccessible(true);
                        obj = declaredField.get(objInvoke);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        PrintStream printStream = System.out;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Error: ");
                        sbLIZ.append(e.getMessage());
                        printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    if (!(obj instanceof Application)) {
                        System.out.println("Error: mInitialApplication is not an instance of Application");
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(th.getMessage());
                        sbLIZ2.append(":");
                        sbLIZ2.append(C08RN.LIZJ());
                        sbLIZ2.append(" applicationContext is null");
                        throw new Throwable(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream2 = System.out;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Application context obtained through ActivityThread: ");
                    sbLIZ3.append(applicationContext);
                    printStream2.println(C2188811AlT.LIZIZ(sbLIZ3));
                    if (applicationContext != null) {
                        C786450Ut9.LIZJ = applicationContext.getFilesDir();
                        C08RN.LIZ(applicationContext);
                    }
                    StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                    sbLIZ22.append(th.getMessage());
                    sbLIZ22.append(":");
                    sbLIZ22.append(C08RN.LIZJ());
                    sbLIZ22.append(" applicationContext is null");
                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ22));
                }
                file = C786450Ut9.LIZJ;
            }
            this.LIZIZ = new C0VSJ(file, "cloud_uploading");
        }
        if (this.LIZIZ != null && !this.LIZIZ.exists()) {
            this.LIZIZ.mkdirs();
        }
        return this.LIZIZ;
    }

    public final synchronized void LIZIZ(C0VDC c0vdc, File file, String str) {
        boolean z;
        String str2;
        C0VDZ.LIZ(0, c0vdc.LIZJ, "命令产物已生成，等待上传", null);
        if (this.LIZIZ != null && !this.LIZIZ.exists()) {
            this.LIZIZ.mkdirs();
        }
        String str3 = c0vdc.LIZJ;
        File fileLIZ = LIZ();
        if (fileLIZ != null) {
            C0VSJ c0vsj = new C0VSJ(fileLIZ, str3);
            if (c0vsj.exists()) {
                C2120108Sh.LJ(c0vsj);
            }
            file.renameTo(c0vsj);
            long jLIZLLL = C08OX.LIZLLL(c0vsj);
            boolean z2 = true;
            if (c0vdc.LIZLLL.optBoolean("wifiOnly") && jLIZLLL > 2097152) {
                z = true;
            } else {
                z = false;
            }
            ((HashMap) this.LIZ).put(str3, Boolean.valueOf(z));
            if (z) {
                C0VDB.LIZIZ().getClass();
                if (!C0W1G.LJII(C0VDB.LJFF)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("产物超过阈值，等待WiFi环境执行. fileTotalSize=");
                    sbLIZ.append(jLIZLLL);
                    C0VDZ.LIZ(0, c0vdc.LIZJ, C2188811AlT.LIZIZ(sbLIZ), null);
                    return;
                }
            }
            for (File file2 : c0vsj.listFiles(new FileFilter() { // from class: X.0VDd
                @Override // java.io.FileFilter
                public final boolean accept(File file3) {
                    return file3.isFile();
                }
            })) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("正在上传:");
                sbLIZ2.append(file2.getName());
                boolean zLIZIZ = C0VDZ.LIZIZ(file2, str3, str, C2188811AlT.LIZIZ(sbLIZ2));
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("文件上传");
                if (zLIZIZ) {
                    str2 = "成功";
                } else {
                    str2 = "失败";
                }
                sbLIZ3.append(str2);
                sbLIZ3.append(":");
                sbLIZ3.append(file2.getName());
                C0VDZ.LIZ(0, c0vdc.LIZJ, C2188811AlT.LIZIZ(sbLIZ3), null);
                if (!zLIZIZ) {
                    z2 = false;
                }
            }
            if (z2) {
                C0VDZ.LIZ(2, str3, "上传成功", null);
            }
            C2120108Sh.LJ(c0vsj);
            return;
        }
        throw new C0VFS("pending目录因拿不到context而未设置");
    }
}
