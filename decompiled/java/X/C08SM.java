package X;

import java.io.File;

/* JADX INFO: renamed from: X.08SM, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08SM implements C08SK {
    @Override // X.C08SK
    public final void LIZ(C0VSJ c0vsj, C2249308rb c2249308rb) {
        File[] fileArrListFiles;
        if (!c0vsj.exists() || !c0vsj.isDirectory() || (fileArrListFiles = c0vsj.listFiles()) == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (File file : fileArrListFiles) {
            if (jCurrentTimeMillis - file.lastModified() > c2249308rb.LIZJ) {
                file.delete();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TTLCleanStrategy deleted: ");
                sbLIZ.append(file.getName());
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
    }
}
