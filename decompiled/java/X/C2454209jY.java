package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.09jY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2454209jY {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(long j, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((File) obj).lastModified() < System.currentTimeMillis() - j) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static long LIZIZ(File file, List list, boolean z) {
        if (file.exists() && !list.contains(file)) {
            try {
                long length = file.length();
                int i = 0;
                if (file.isDirectory()) {
                    File[] fileArrListFiles = file.listFiles();
                    int length2 = fileArrListFiles.length;
                    int i2 = 0;
                    while (i < length2) {
                        File file2 = fileArrListFiles[i];
                        length += LIZIZ(file2, list, z);
                        if (i2 == 0 && file2.exists()) {
                            i2 = 1;
                        }
                        i++;
                    }
                    i = i2;
                }
                if (z && i == 0) {
                    file.delete();
                }
                return length;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return 0L;
            }
        }
        return 0L;
    }
}
