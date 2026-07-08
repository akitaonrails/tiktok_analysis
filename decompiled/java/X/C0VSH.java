package X;

import java.io.File;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0VSH, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VSH {
    public static File LIZ(File file) {
        if (C0VSE.LIZIZ(file.getAbsolutePath()) && C0VSE.LIZ && C0VSE.LIZLLL) {
            return new File(u.LJJIFFI(file.getAbsolutePath(), "../", "", false));
        }
        return file;
    }

    public static String LIZIZ(String str) {
        if (C0VSE.LIZIZ(str) && C0VSE.LIZ && C0VSE.LIZLLL) {
            return u.LJJIFFI(str, "../", "", false);
        }
        return str;
    }
}
