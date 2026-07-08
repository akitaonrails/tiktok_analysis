package X;

import java.nio.file.Path;

/* JADX INFO: renamed from: X.08PN, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C08PN extends C08PO {
    public static final String LIZ(Path path) {
        String string;
        Path fileName = path.getFileName();
        if (fileName == null || (string = fileName.toString()) == null) {
            return "";
        }
        return string;
    }
}
