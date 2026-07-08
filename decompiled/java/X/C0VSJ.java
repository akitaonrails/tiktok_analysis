package X;

import java.io.File;
import java.net.URI;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0VSJ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VSJ extends File {
    public static final C0VSI Companion = new C0VSI();

    public C0VSJ(URI uri) {
        String strLJJIFFI;
        Companion.getClass();
        if (uri != null && C0VSE.LIZIZ(uri.getPath()) && C0VSE.LJIIIIZZ && C0VSE.LIZ && C0VSE.LIZIZ) {
            String path = uri.getPath();
            uri = new URI(uri.getScheme(), uri.getHost(), (path == null || (strLJJIFFI = u.LJJIFFI(path, "../", "", false)) == null) ? uri.getPath() : strLJJIFFI, uri.getFragment());
        }
        super(uri);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0VSJ(String str) {
        super(C0VSI.LIZ(str));
        Companion.getClass();
    }

    public C0VSJ(File file, String str) {
        Companion.getClass();
        if (file != null && C0VSE.LIZIZ(file.getAbsolutePath()) && C0VSE.LIZ && C0VSE.LIZIZ) {
            file = new File(u.LJJIFFI(file.getAbsolutePath(), "../", "", false));
        }
        super(file, C0VSI.LIZ(str));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0VSJ(String str, String str2) {
        String strLIZ;
        C0VSI c0vsi = Companion;
        c0vsi.getClass();
        if (str == null) {
            strLIZ = null;
        } else {
            strLIZ = C0VSI.LIZ(str);
        }
        c0vsi.getClass();
        super(strLIZ, C0VSI.LIZ(str2));
    }
}
