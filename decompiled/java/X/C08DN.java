package X;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.08DN, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08DN {
    public static List LIZ(File file, C08SW c08sw, boolean z) {
        if (file != null && file.exists() && file.isDirectory()) {
            ArrayList arrayList = new ArrayList();
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                for (File file2 : fileArrListFiles) {
                    arrayList.add(file2);
                    if (z && file2.isDirectory()) {
                        arrayList.addAll(LIZ(file2, c08sw, true));
                    }
                }
            }
            return arrayList;
        }
        return null;
    }
}
