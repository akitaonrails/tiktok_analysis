package X;

import kotlin.text.u;

/* JADX INFO: renamed from: X.0CCc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C309720CCc {
    public static final String[] LIZ = {"image/x-icon", "image/vnd.microsoft.icon", "image/x-ico"};

    public static final boolean LIZ(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        String[] strArr = LIZ;
        String[] strArr2 = (String[]) c0c64LJIILLIIL.LJJIII("template_produce_skip_compress_mime_types", 0, strArr);
        if (strArr2 != null) {
            strArr = strArr2;
        }
        for (String str2 : strArr) {
            if (u.LJIJI(str2, str, true)) {
                return true;
            }
        }
        return false;
    }
}
