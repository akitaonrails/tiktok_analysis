package X;

import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: X.0WKY, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0WKY extends AbstractC821390WKb {
    public final File LIZ;

    public C0WKY(C0VSJ c0vsj) throws IOException {
        if (c0vsj.exists() && c0vsj.isDirectory() && c0vsj.canRead() && c0vsj.canWrite()) {
            this.LIZ = c0vsj;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("exists: ");
        sbLIZ.append(c0vsj.exists());
        sbLIZ.append(", isDirectory: ");
        sbLIZ.append(c0vsj.isDirectory());
        sbLIZ.append(", canRead: ");
        sbLIZ.append(c0vsj.canRead());
        sbLIZ.append(", canWrite: ");
        sbLIZ.append(c0vsj.canWrite());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("dir error! ");
        sbLIZ2.append(strLIZIZ);
        throw new IOException(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
