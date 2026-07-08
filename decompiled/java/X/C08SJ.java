package X;

import Y.AComparatorS22S0000000_3;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.08SJ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08SJ implements C08SK {
    @Override // X.C08SK
    public final void LIZ(C0VSJ c0vsj, C2249308rb c2249308rb) {
        File[] fileArrListFiles;
        if (!c0vsj.exists() || !c0vsj.isDirectory() || (fileArrListFiles = c0vsj.listFiles()) == null) {
            return;
        }
        long length = 0;
        for (File file : fileArrListFiles) {
            length += file.length();
        }
        if (length <= c2249308rb.LIZIZ) {
            return;
        }
        Iterator it2 = new ArrayList(C13LQ.LJJLIIIIJ(new AComparatorS22S0000000_3(45), fileArrListFiles)).iterator();
        while (it2.hasNext() && length > c2249308rb.LIZIZ) {
            File file2 = (File) it2.next();
            long length2 = file2.length();
            if (file2.delete()) {
                length -= length2;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LRUCleanStrategy deleted: ");
                sbLIZ.append(file2.getName());
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
    }
}
