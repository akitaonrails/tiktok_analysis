package X;

import java.io.File;
import java.io.FileReader;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0VSF, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VSF extends FileReader {
    public C0VSF(File file) {
        if (C0VSE.LIZIZ(file.getAbsolutePath()) && C0VSE.LJIIIIZZ && C0VSE.LIZ && C0VSE.LJ) {
            file = new File(u.LJJIFFI(file.getAbsolutePath(), "../", "", false));
        }
        super(file);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0VSF(String str) {
        if (C0VSE.LIZIZ(str) && C0VSE.LIZ && C0VSE.LJ) {
            str = u.LJJIFFI(str, "../", "", false);
        }
        super(str);
    }
}
