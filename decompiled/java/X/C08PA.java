package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;

/* JADX INFO: renamed from: X.08PA, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08PA {
    public static final Object LIZ = new Object();
    public static volatile List<File> LIZIZ;

    public static List<File> LIZ(Context context, boolean z) {
        List<File> list = LIZIZ;
        if (!z && list != null) {
            return list;
        }
        synchronized (LIZ) {
            try {
                List<File> list2 = LIZIZ;
                if (!z && list2 != null) {
                    return list2;
                }
                ArrayList arrayList = new ArrayList();
                C0VSJ c0vsj = new C0VSJ(context.getApplicationInfo().sourceDir);
                arrayList.add(c0vsj);
                C2418109dj c2418109djLIZLLL = C2418109dj.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("base apk:");
                sbLIZ.append(c0vsj);
                c2418109djLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
                String[] strArr = context.getApplicationInfo().splitSourceDirs;
                int i = 0;
                if (strArr != null && strArr.length != 0) {
                    int length = strArr.length;
                    while (i < length) {
                        String str = strArr[i];
                        C2418109dj c2418109djLIZLLL2 = C2418109dj.LIZLLL();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("splitDir:");
                        sbLIZ2.append(str);
                        c2418109djLIZLLL2.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
                        arrayList.add(new C0VSJ(str));
                        i++;
                    }
                } else {
                    File parentFile = c0vsj.getParentFile();
                    parentFile.setReadable(true);
                    File[] fileArrListFiles = parentFile.listFiles();
                    if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                        int length2 = fileArrListFiles.length;
                        while (i < length2) {
                            File file = fileArrListFiles[i];
                            C2418109dj c2418109djLIZLLL3 = C2418109dj.LIZLLL();
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("splitDir:");
                            sbLIZ3.append(file.getAbsolutePath());
                            c2418109djLIZLLL3.LJFF(C2188811AlT.LIZIZ(sbLIZ3));
                            if (file.isFile() && file.getName().endsWith(".apk")) {
                                file.setReadable(true);
                                arrayList.add(file);
                            }
                            i++;
                        }
                    }
                }
                LIZIZ = Collections.unmodifiableList(arrayList);
                return LIZIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static File LIZIZ(String str, List list) throws IOException {
        File file;
        Iterator it2 = list.iterator();
        while (true) {
            file = null;
            if (!it2.hasNext()) {
                break;
            }
            file = (File) it2.next();
            C09NU c09nu = new C09NU(file);
            ZipEntry entry = c09nu.getEntry(str);
            c09nu.close();
            if (entry != null && file != null) {
                break;
            }
        }
        return file;
    }
}
