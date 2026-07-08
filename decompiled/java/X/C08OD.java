package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.08OD, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08OD {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C08OE());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1850407Mo());

    public static boolean LIZIZ() {
        return ((Boolean) LIZIZ.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    public static void LIZJ() {
        ?? arrayList;
        if (LIZIZ()) {
            try {
                C844470XAv.LIZ.getClass();
                Context contextLIZ = C844470XAv.LIZ();
                long jLJ = C844470XAv.LJ();
                if (((Boolean) C0A6A.LIZIZ.getValue()).booleanValue() && KevaImpl.getRepo("EmergencyDFBugFixHelper", 0).getLong("last_do_delete_version_code", -1L) == jLJ) {
                    return;
                }
                File fileLIZ = LIZ(contextLIZ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("splitcompat/");
                sbLIZ.append(jLJ);
                sbLIZ.append("/verified-splits");
                C0VSJ c0vsj = new C0VSJ(fileLIZ, C2188811AlT.LIZIZ(sbLIZ));
                if (c0vsj.exists() && c0vsj.isDirectory()) {
                    File[] fileArrListFiles = c0vsj.listFiles();
                    if (fileArrListFiles != null) {
                        arrayList = new ArrayList();
                        for (File file : fileArrListFiles) {
                            if (file.isFile() && Intrinsics.LJFF(C08QA.LJIJ(file), "apk")) {
                                arrayList.add(file);
                            }
                        }
                    } else {
                        arrayList = C13BV.INSTANCE;
                    }
                    ArrayList<File> arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (u.LJJIIJZLJL(((File) obj).getName(), "config.", false)) {
                            arrayList2.add(obj);
                        }
                    }
                    for (File file2 : arrayList2) {
                        file2.delete();
                        File fileLIZ2 = LIZ(contextLIZ);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("splitcompat/");
                        sbLIZ2.append(jLJ);
                        sbLIZ2.append("/native-libraries/");
                        sbLIZ2.append(C08QA.LJIJI(file2));
                        new C0VSJ(fileLIZ2, C2188811AlT.LIZIZ(sbLIZ2)).delete();
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (a0.LJJIIZI(((File) obj2).getName(), ".config.arm64_v8a", false)) {
                            arrayList3.add(obj2);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(a0.LJJJLL(".config.arm64_v8a", C08QA.LJIJI((File) it2.next())));
                    }
                    ArrayList<File> arrayList5 = new ArrayList();
                    for (Object obj3 : arrayList) {
                        File file3 = (File) obj3;
                        if (!arrayList4.isEmpty()) {
                            Iterator it3 = arrayList4.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (u.LJJIIJZLJL(file3.getName(), (String) it3.next(), false)) {
                                        arrayList5.add(obj3);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    for (File file4 : arrayList5) {
                        file4.delete();
                        File fileLIZ3 = LIZ(contextLIZ);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("splitcompat/");
                        sbLIZ3.append(jLJ);
                        sbLIZ3.append("/native-libraries/");
                        sbLIZ3.append(C08QA.LJIJI(file4));
                        new C0VSJ(fileLIZ3, C2188811AlT.LIZIZ(sbLIZ3)).delete();
                    }
                    if (((Boolean) C0A6A.LIZIZ.getValue()).booleanValue()) {
                        KevaImpl.getRepo("EmergencyDFBugFixHelper", 0).storeLong("last_do_delete_version_code", jLJ);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
            }
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
}
