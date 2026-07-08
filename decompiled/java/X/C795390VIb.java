package X;

import android.content.Context;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0VIb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C795390VIb {
    public static final String[] LIZ;

    static {
        C0VI8.LIZIZ("WrkDbPathHelper");
        LIZ = new String[]{"-journal", "-shm", "-wal"};
    }

    public static void LIZ(Context context) {
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            C0VI8.LIZ().getClass();
            HashMap map = new HashMap();
            File databasePath = context.getDatabasePath("androidx.work.workdb");
            File file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
            map.put(databasePath, file);
            for (String str : LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(databasePath.getPath());
                sbLIZ.append(str);
                File file2 = new File(C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(file.getPath());
                sbLIZ2.append(str);
                map.put(file2, new File(C2188811AlT.LIZIZ(sbLIZ2)));
            }
            for (File file3 : map.keySet()) {
                File file4 = (File) map.get(file3);
                if (file3.exists() && file4 != null) {
                    if (file4.exists()) {
                        C786410Ut5.j4("Over-writing contents of %s", new Object[]{file4});
                        C0VI8.LIZ().getClass();
                    }
                    if (file3.renameTo(file4)) {
                        C786410Ut5.j4("Migrated %s to %s", new Object[]{file3, file4});
                    } else {
                        C786410Ut5.j4("Renaming %s to %s failed", new Object[]{file3, file4});
                    }
                    C0VI8.LIZ().getClass();
                }
            }
        }
    }
}
