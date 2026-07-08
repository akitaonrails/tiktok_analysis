package X;

import java.io.File;

/* JADX INFO: renamed from: X.13M9, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13M9 {
    public final String LIZ;
    public final File LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[component=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", canonicalPath=");
        File file = this.LIZIZ;
        sbLIZ.append(file != null ? file.getCanonicalPath() : null);
        sbLIZ.append(", absolutePath=");
        File file2 = this.LIZIZ;
        sbLIZ.append(file2 != null ? file2.getAbsolutePath() : null);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C13M9(String str) {
        File absoluteFile;
        this.LIZ = str;
        if (str != null) {
            absoluteFile = new C0VSJ(str).getAbsoluteFile();
        } else {
            absoluteFile = null;
        }
        this.LIZIZ = absoluteFile;
    }

    public final C13M9 LIZ(String str) {
        if (this.LIZIZ == null) {
            return null;
        }
        return new C13M9(new C0VSJ(this.LIZIZ.getAbsolutePath(), str).getAbsoluteFile().getAbsolutePath());
    }
}
