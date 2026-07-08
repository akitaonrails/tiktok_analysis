package X;

import java.io.File;
import java.util.zip.ZipFile;
import kotlin.text.u;

/* JADX INFO: renamed from: X.09NU, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09NU extends ZipFile {
    /* JADX WARN: Illegal instructions before constructor call */
    public C09NU(String str) {
        if (C0VSE.LIZIZ(str) && C0VSE.LIZ && C0VSE.LJI) {
            str = u.LJJIFFI(str, "../", "", false);
        }
        super(str);
    }

    public C09NU(C0VSJ c0vsj) {
        super(C09NV.LIZ(c0vsj), 1);
    }

    public C09NU(File file) {
        super(C09NV.LIZ(file));
    }
}
