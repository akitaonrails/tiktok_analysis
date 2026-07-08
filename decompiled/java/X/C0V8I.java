package X;

import android.app.Application;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V8I, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V8I {
    public static final C0V8I LJIILJJIL = new C0V8I();
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public volatile boolean LJ;
    public List<String> LJFF;
    public List<String> LJI;
    public List<String> LJII;
    public boolean LJIIIIZZ;
    public C792540V7c LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;

    public static Pair LJIIIZ() {
        try {
            int i = Build.VERSION.SDK_INT;
            long freeSpace = 0;
            if (i >= 26) {
                StorageStatsManager storageStatsManager = (StorageStatsManager) C786410Ut5.G2(C792190V5t.LIZIZ, "storagestats");
                StorageManager storageManager = (StorageManager) C786410Ut5.G2(C792190V5t.LIZIZ, "storage");
                Iterator<StorageVolume> it2 = storageManager.getStorageVolumes().iterator();
                long allocatableBytes = 0;
                while (it2.hasNext()) {
                    String uuid = it2.next().getUuid();
                    UUID uuidFromString = uuid == null ? StorageManager.UUID_DEFAULT : UUID.fromString(uuid);
                    freeSpace += storageStatsManager.getTotalBytes(uuidFromString);
                    allocatableBytes += storageManager.getAllocatableBytes(uuidFromString);
                }
                return new Pair(Long.valueOf(((freeSpace / 1000) / 1000) * 1024 * 1024), Long.valueOf(((allocatableBytes / 1000) / 1000) * 1024 * 1024));
            }
            int i2 = 0;
            if (i < 24) {
                StorageManager storageManager2 = (StorageManager) C786410Ut5.G2(C792190V5t.LIZIZ, "storage");
                long freeSpace2 = 0;
                for (Object obj : (List) C2204961BRm.a0(LJIIL(storageManager2.getClass(), "getVolumes", new Class[0]), storageManager2, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyFdhvmtdan5wTkbBwqNVSbfOJYtBZryFA=", null))) {
                    File file = (File) C2204961BRm.a0(LJIIL(obj.getClass(), "getPathFile", new Class[0]), obj, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyFdhvmtdan5wTkbBwqNVSbfOJYtBZryFA=", null));
                    freeSpace2 += file.getFreeSpace();
                    freeSpace += file.getFreeSpace();
                }
                return new Pair(Long.valueOf(freeSpace), Long.valueOf(freeSpace2));
            }
            List<StorageVolume> storageVolumes = ((StorageManager) C786410Ut5.G2(C792190V5t.LIZIZ, "storage")).getStorageVolumes();
            if (C08GN.LIZIZ(storageVolumes)) {
                return null;
            }
            long freeSpace3 = 0;
            for (StorageVolume storageVolume : storageVolumes) {
                File file2 = (File) C2204961BRm.a0(LJIIL(storageVolume.getClass(), "getPathFile", new Class[i2]), storageVolume, new Object[i2], new C0WZX("dzBzEgAjS8/YVFkiQFyFdhvmtdan5wTkbBwqNVSbfOJYtBZryFA=", null));
                freeSpace += file2.getTotalSpace();
                freeSpace3 += file2.getFreeSpace();
                i2 = 0;
            }
            return new Pair(Long.valueOf(((freeSpace / 1000) / 1000) * 1024 * 1024), Long.valueOf(((freeSpace3 / 1000) / 1000) * 1024 * 1024));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new Pair(Long.valueOf(C2204961BRm.LLIIII(new StatFs(Environment.getDataDirectory().getPath()), new C0WZX("dzBzEgAjS8/YVFkiQFyFdhvmtce6/QPkbhw1O1KbdPoV", null)) + C2204961BRm.LLIIII(new StatFs(Environment.getRootDirectory().getPath()), new C0WZX("dzBzEgAjS8/YVFkiQFyFdhvmtce6/QPkbhw1O1KbdPoV", null))), Long.valueOf(C2204961BRm.LLFFF(new StatFs(Environment.getDataDirectory().getPath()), new C0WZX("dzBzEgAjS8/YVFkiQFyFdhvmtce6/QPkbhw1O1KbdPoV", null))));
        }
    }

    public final long LJI() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Application application = C792190V5t.LIZIZ;
                String packageName = application.getPackageName();
                return C2204961BRm.LJJII((StorageStatsManager) C786410Ut5.H2(application, "storagestats"), ((StorageManager) C786410Ut5.H2(application, "storage")).getUuidForPath(new C0VSJ(application.getDataDir().getParent(), packageName)), C786410Ut5.V3(application.getPackageManager(), packageName, 128).uid, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhvmtdan5wTkbBwqNVSbfOJYtBZryFA=", null)).getAppBytes();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            long jLJIIIIZZ = LJIIIIZZ(new C0VSJ(C786410Ut5.V3(C792190V5t.LIZIZ.getPackageManager(), C792190V5t.LIZIZ.getPackageName(), 0).sourceDir).getParentFile());
            long jLJIIIIZZ2 = 0;
            for (File file : C786410Ut5.M3(C792190V5t.LIZIZ).getExternalMediaDirs()) {
                jLJIIIIZZ2 += LJIIIIZZ(file);
            }
            return jLJIIIIZZ + jLJIIIIZZ2 + this.LJIIJ + this.LJIIJJI;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0L;
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

    public static JSONArray LJFF(C823150WQv c823150WQv) {
        JSONArray jSONArray = new JSONArray();
        Iterator it2 = ((ArrayList) c823150WQv.LIZIZ()).iterator();
        while (it2.hasNext()) {
            JSONObject jSONObjectLJFF = ((C0V8K) it2.next()).LJFF();
            if (jSONObjectLJFF != null) {
                jSONArray.put(jSONObjectLJFF);
            }
        }
        return jSONArray;
    }

    public static long LJIIIIZZ(File file) {
        long length;
        long j = 0;
        try {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                return 0L;
            }
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    length = LJIIIIZZ(file2);
                } else {
                    length = file2.length();
                }
                j += length;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return j;
    }

    public final void LIZLLL(List<C0V8M> list) {
        if (C08GN.LIZIZ(list)) {
            return;
        }
        for (C0V8M c0v8m : list) {
            if (TextUtils.equals(c0v8m.LIZ, this.LIZ)) {
                this.LJIIJ = c0v8m.LIZJ;
            } else if (TextUtils.equals(c0v8m.LIZ, this.LIZJ)) {
                this.LJIIJJI = c0v8m.LIZJ;
            } else if (TextUtils.equals(c0v8m.LIZ, this.LIZIZ)) {
                this.LJIIL = c0v8m.LIZJ;
            } else if (TextUtils.equals(c0v8m.LIZ, this.LIZLLL)) {
                this.LJIILIIL = c0v8m.LIZJ;
            }
        }
    }

    public final String LJII(String str) {
        if (!C08GN.LIZIZ(this.LJII) && str != null) {
            Iterator<String> it2 = this.LJII.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String next = it2.next();
                if (str.startsWith(next)) {
                    if (next != null && str != null) {
                        String strReplaceAll = str.substring(next.length()).replaceAll("[^/]", "*");
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(next);
                        sbLIZ.append(strReplaceAll);
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }
                }
            }
        }
        return null;
    }

    public final boolean LJIIJ(File file) {
        if (!C08GN.LIZIZ(this.LJFF)) {
            return this.LJFF.contains(file.getAbsolutePath());
        }
        return false;
    }

    public final boolean LJIIJJI(C0V8J c0v8j) {
        Iterator<String> it2 = this.LJFF.iterator();
        while (it2.hasNext()) {
            if (c0v8j.LIZ.contains(it2.next())) {
                return true;
            }
        }
        return false;
    }

    public final List<String> LJIILIIL(List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (C08GN.LIZIZ(list)) {
            return arrayList;
        }
        for (String str : list) {
            if (str.contains("internal")) {
                arrayList.add(str.replace("internal", this.LIZ));
            } else if (str.contains("external")) {
                arrayList.add(str.replace("external", this.LIZJ));
            }
        }
        return arrayList;
    }

    public final long LIZIZ(File file, List<C0V8J> list) {
        long jLIZIZ = 0;
        if (file != null && file.exists() && !LJIIJ(file)) {
            if (file.isFile()) {
                long length = file.length();
                if (length < this.LJIIIZ.LIZLLL) {
                    return length;
                }
                C0V8J c0v8j = new C0V8J(this);
                c0v8j.LIZLLL = false;
                c0v8j.LIZ = file.getAbsolutePath();
                c0v8j.LIZIZ = length;
                ((ArrayList) list).add(c0v8j);
                return length;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                C0V8J c0v8j2 = new C0V8J(this);
                c0v8j2.LIZLLL = file.isDirectory();
                c0v8j2.LIZ = file.getAbsolutePath();
                ArrayList arrayList = new ArrayList();
                c0v8j2.LJFF = arrayList;
                ((ArrayList) list).add(c0v8j2);
                for (File file2 : fileArrListFiles) {
                    if (file2 != null && file2.exists() && !LJIIJ(file2)) {
                        jLIZIZ += LIZIZ(file2, arrayList);
                    }
                }
                c0v8j2.LIZIZ = jLIZIZ;
            }
        }
        return jLIZIZ;
    }

    public final JSONArray LJ(long j, List list) {
        ArrayList<C0V8J> arrayList = (ArrayList) list;
        if (!arrayList.isEmpty()) {
            BigDecimal bigDecimal = new BigDecimal(j);
            JSONArray jSONArray = new JSONArray();
            for (C0V8J c0v8j : arrayList) {
                if (LJIIJJI(c0v8j)) {
                    c0v8j.LIZJ = 0.0f;
                } else {
                    c0v8j.LIZJ = (float) new BigDecimal(c0v8j.LIZIZ).divide(bigDecimal, 4, 4).doubleValue();
                }
                List<C0V8J> list2 = c0v8j.LJFF;
                if (list2 != null) {
                    ArrayList<C0V8J> arrayList2 = (ArrayList) list2;
                    if (arrayList2.size() > 0) {
                        for (C0V8J c0v8j2 : arrayList2) {
                            if (LJIIJJI(c0v8j2)) {
                                c0v8j2.LIZJ = 0.0f;
                            } else {
                                c0v8j2.LIZJ = (float) new BigDecimal(c0v8j2.LIZIZ).divide(bigDecimal, 4, 4).doubleValue();
                            }
                        }
                    }
                }
                jSONArray.put(c0v8j.LIZIZ());
            }
            return jSONArray;
        }
        return null;
    }

    public static Method LJIIL(Class cls, String str, Class<?>... clsArr) {
        try {
            Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cls, str, clsArr);
            method.setAccessible(true);
            return method;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final List<C0V8M> LIZJ(String str, C823150WQv<C0V8K> c823150WQv, C823150WQv<C0V8K> c823150WQv2, C823150WQv<C0V8K> c823150WQv3, List<String> list) {
        long j;
        ArrayList arrayList = new ArrayList();
        C0VSJ c0vsj = new C0VSJ(str);
        C0V8M c0v8m = new C0V8M(this);
        c0v8m.LIZ = str;
        c0v8m.LIZIZ = new C0V8M(this);
        File[] fileArrListFiles = c0vsj.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
            ArrayList arrayList2 = (ArrayList) list;
            if (arrayList2.contains(c0vsj.getAbsolutePath())) {
                arrayList.add(c0v8m);
                arrayList2.remove(c0vsj.getAbsolutePath());
            }
            c0v8m.LIZLLL = fileArrListFiles.length;
            LinkedList linkedList = new LinkedList();
            linkedList.offer(c0v8m);
            while (!linkedList.isEmpty()) {
                int size = linkedList.size();
                for (int i = 0; i < size; i++) {
                    C0V8M c0v8m2 = (C0V8M) linkedList.poll();
                    if (c0v8m2 != null) {
                        String str2 = c0v8m2.LIZ;
                        C0VSJ c0vsj2 = new C0VSJ(str2);
                        if (!c0vsj2.exists() || LJIIJ(c0vsj2)) {
                            c0v8m2.LIZIZ.LIZLLL--;
                        } else if (c0vsj2.isFile()) {
                            long length = c0vsj2.length();
                            if (length >= 0 && length <= 17179869184L) {
                                j = 0;
                                c823150WQv.LIZ(new C0V8K(this, str2, length, 1));
                            } else {
                                j = 0;
                            }
                            C0V8M c0v8m3 = c0v8m2.LIZIZ;
                            if (c0v8m3 != null) {
                                c0v8m3.LIZ(length, c823150WQv3, c823150WQv2);
                                if (!c0v8m2.LIZIZ.LJFF) {
                                    long jCurrentTimeMillis = System.currentTimeMillis() - c0vsj2.lastModified();
                                    if (jCurrentTimeMillis >= this.LJIIIZ.LJIIIIZZ && jCurrentTimeMillis < 62899200000L && jCurrentTimeMillis > j && length >= 104857600 && length <= 17179869184L) {
                                        c823150WQv3.LIZ(new C0V8L(this, str2, size, 0, jCurrentTimeMillis));
                                    }
                                }
                            }
                        } else {
                            if (arrayList2.contains(c0vsj2.getAbsolutePath())) {
                                arrayList.add(c0v8m2);
                                arrayList2.remove(c0vsj2.getAbsolutePath());
                            }
                            File[] fileArrListFiles2 = c0vsj2.listFiles();
                            if (fileArrListFiles2 != null && fileArrListFiles2.length != 0) {
                                c0v8m2.LIZLLL = fileArrListFiles2.length;
                                for (File file : fileArrListFiles2) {
                                    C0V8M c0v8m4 = new C0V8M(this);
                                    c0v8m4.LIZIZ = c0v8m2;
                                    c0v8m4.LIZ = file.getAbsolutePath();
                                    if (file.isDirectory() && !c0v8m2.LJFF) {
                                        long jCurrentTimeMillis2 = System.currentTimeMillis() - file.lastModified();
                                        if (jCurrentTimeMillis2 >= this.LJIIIZ.LJIIIIZZ && jCurrentTimeMillis2 < 62899200000L && jCurrentTimeMillis2 > 0) {
                                            c0v8m4.LJFF = true;
                                        }
                                    }
                                    linkedList.offer(c0v8m4);
                                }
                            } else {
                                c0v8m2.LIZIZ.LIZ(0L, c823150WQv3, c823150WQv2);
                            }
                        }
                    }
                }
            }
            return arrayList;
        }
        return null;
    }
}
