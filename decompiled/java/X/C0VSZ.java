package X;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: renamed from: X.0VSZ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VSZ {
    public final C0VSX LIZ;

    public final void LIZJ() {
        this.LIZ.LJ();
    }

    public final void finalize() throws Throwable {
        super.finalize();
        C1553130qWF.LIZ("gecko-debug-tag", "gecko loader finalize lock");
        LIZJ();
    }

    public final boolean LIZ(String str) {
        C0VSX c0vsx = this.LIZ;
        c0vsx.getClass();
        if (!TextUtils.isEmpty(str)) {
            C0X9I c0x9iLIZIZ = c0vsx.LIZIZ(str.trim());
            C0X9H c0x9hLIZIZ = c0x9iLIZIZ.LIZIZ(c0x9iLIZIZ.LIZJ, EnumC797980VSa.CHECK_EXIST);
            String strSubstring = str.substring(c0x9iLIZIZ.LIZJ.length() + 1);
            File file = c0x9hLIZIZ.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("res");
            sbLIZ.append(File.separator);
            sbLIZ.append(strSubstring);
            return new C0VSJ(file, C2188811AlT.LIZIZ(sbLIZ)).exists();
        }
        throw new RuntimeException("relativePath is empty");
    }

    public final String LIZIZ(String str) {
        C0VSX c0vsx = this.LIZ;
        c0vsx.getClass();
        if (!TextUtils.isEmpty(str)) {
            C0X9I c0x9iLIZIZ = c0vsx.LIZIZ(str.trim());
            C0X9H c0x9hLIZIZ = c0x9iLIZIZ.LIZIZ(c0x9iLIZIZ.LIZJ, EnumC797980VSa.GET_PATH);
            return c0x9hLIZIZ.LIZ(c0x9hLIZIZ.LIZ, str.substring(c0x9iLIZIZ.LIZJ.length() + 1)).getAbsolutePath();
        }
        throw new RuntimeException("relativePath is empty");
    }

    public C0VSZ(Context context, String str) {
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                C1551940qUK c1551940qUK = C797990VSb.LIZ;
                c1551940qUK.LIZIZ();
                String rootDirectoryPath = c1551940qUK.LIZLLL.getRootDirectoryPath();
                if (TextUtils.isEmpty(rootDirectoryPath)) {
                    this.LIZ = new C0VSX(context, str, new C0VSJ(C0VSX.LIZ(context), "gecko_offline_res_x"));
                    return;
                } else {
                    this.LIZ = new C0VSX(context, str, new C0VSJ(rootDirectoryPath));
                    return;
                }
            }
            throw new RuntimeException("access key is empty");
        }
        throw new RuntimeException("context is null");
    }
}
