package X;

import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: X.08PR, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08PR {
    public final long LIZ;
    public final Context LIZIZ;
    public File LIZJ;

    public final Set LIZIZ() throws IOException {
        C0VSJ c0vsj = new C0VSJ(LJII(), "verified-splits");
        LJFF(c0vsj);
        HashSet hashSet = new HashSet();
        File[] fileArrListFiles = c0vsj.listFiles();
        if (fileArrListFiles != null) {
            for (final File file : fileArrListFiles) {
                if (file.isFile() && file.getName().endsWith(".apk") && (!file.canWrite())) {
                    final String strSubstring = file.getName().substring(0, r1.length() - 4);
                    hashSet.add(new C08T5(file, strSubstring) { // from class: X.08Su
                        public final File LIZ;
                        public final String LIZIZ;

                        @Override // X.C08T5
                        public final File LIZ() {
                            return this.LIZ;
                        }

                        @Override // X.C08T5
                        public final String LIZIZ() {
                            return this.LIZIZ;
                        }

                        public final int hashCode() {
                            return ((this.LIZ.hashCode() ^ 1000003) * 1000003) ^ this.LIZIZ.hashCode();
                        }

                        public final String toString() {
                            String string = this.LIZ.toString();
                            String str = this.LIZIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("SplitFileInfo{splitFile=");
                            sbLIZ.append(string);
                            sbLIZ.append(", splitId=");
                            sbLIZ.append(str);
                            sbLIZ.append("}");
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        public final boolean equals(Object obj) {
                            if (obj == this) {
                                return true;
                            }
                            if (obj instanceof C08T5) {
                                C08T5 c08t5 = (C08T5) obj;
                                if (this.LIZ.equals(c08t5.LIZ()) && this.LIZIZ.equals(c08t5.LIZIZ())) {
                                    return true;
                                }
                            }
                            return false;
                        }

                        {
                            this.LIZ = file;
                            if (strSubstring != null) {
                                this.LIZIZ = strSubstring;
                                return;
                            }
                            throw new NullPointerException("Null splitId");
                        }
                    });
                }
            }
        }
        try {
            if (!AabPluginServiceImpl.LJ) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    if (it2.next().toString().contains("ttwebview")) {
                        AabPluginServiceImpl.LIZJ = true;
                        it2.remove();
                    }
                }
            } else if (AabPluginServiceImpl.LIZIZ == null) {
                AabPluginServiceImpl.LIZIZ = Long.valueOf(SystemClock.elapsedRealtime());
                return hashSet;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return hashSet;
    }

    public final C0VSJ LJI() throws Throwable {
        Object obj;
        if (this.LIZJ == null) {
            Context context = this.LIZIZ;
            if (context == null) {
                throw new IllegalStateException("context must be non-null to populate null filesDir");
            }
            File file = C786450Ut9.LIZJ;
            if (file == null || !C786450Ut9.LJ) {
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
            this.LIZJ = file;
        }
        C0VSJ c0vsj = new C0VSJ(this.LIZJ, "splitcompat");
        LJFF(c0vsj);
        return c0vsj;
    }

    public final C0VSJ LJII() throws IOException {
        C0VSJ c0vsj = new C0VSJ(LJI(), Long.toString(this.LIZ));
        LJFF(c0vsj);
        return c0vsj;
    }

    public final void LIZJ() throws Throwable {
        C0VSJ c0vsjLJI = LJI();
        String[] list = c0vsjLJI.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.LIZ))) {
                    C0VSJ c0vsj = new C0VSJ(c0vsjLJI, str);
                    c0vsj.toString();
                    LIZLLL(c0vsj);
                }
            }
        }
    }

    public C08PR(Context context) {
        this.LIZIZ = context;
        this.LIZ = C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), 0).versionCode;
    }

    public static void LIZLLL(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                LIZLLL(file2);
            }
        }
        if (file.exists() && !file.delete()) {
            throw new IOException(C786410Ut5.j4("Failed to delete '%s'", new Object[]{file.getAbsolutePath()}));
        }
    }

    public static void LJFF(C0VSJ c0vsj) throws IOException {
        if (c0vsj.exists()) {
            if (c0vsj.isDirectory()) {
            } else {
                throw new IllegalArgumentException("File input must be directory when it exists.");
            }
        } else {
            c0vsj.mkdirs();
            if (c0vsj.isDirectory()) {
            } else {
                throw new IOException("Unable to create directory: ".concat(String.valueOf(c0vsj.getAbsolutePath())));
            }
        }
    }

    public final C0VSJ LIZ(String str) throws IOException {
        C0VSJ c0vsj = new C0VSJ(LJII(), "verified-splits");
        LJFF(c0vsj);
        return LJ(c0vsj, String.valueOf(str).concat(".apk"));
    }

    public static C0VSJ LJ(C0VSJ c0vsj, String str) {
        C0VSJ c0vsj2 = new C0VSJ(c0vsj, str);
        if (c0vsj2.getCanonicalPath().startsWith(c0vsj.getCanonicalPath())) {
            return c0vsj2;
        }
        throw new IllegalArgumentException("split ID cannot be placed in target directory");
    }
}
