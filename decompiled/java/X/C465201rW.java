package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;

/* JADX INFO: renamed from: X.01rW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C465201rW {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(File file) {
        File[] fileArrListFiles;
        if (file == null || !file.exists()) {
            return;
        }
        try {
            if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    LIZ(file2);
                }
            }
            file.delete();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
