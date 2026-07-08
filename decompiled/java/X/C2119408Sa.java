package X;

import android.net.Uri;
import androidx.core.content.FileProvider;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.08Sa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2119408Sa implements InterfaceC2119608Sc {
    public final String LIZ;
    public final HashMap<String, File> LIZIZ = new HashMap<>();

    public C2119408Sa(String str) {
        this.LIZ = str;
    }

    @Override // X.InterfaceC2119608Sc
    public final File LIZ(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int iIndexOf = encodedPath.indexOf(47, 1);
        String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
        String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
        File file = this.LIZIZ.get(strDecode);
        if (file != null) {
            File file2 = new File(file, strDecode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (LIZJ(canonicalFile.getPath(), file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Failed to resolve canonical path for ");
                sbLIZ.append(file2);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Unable to find configured root for ");
        sbLIZ2.append(uri);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.InterfaceC2119608Sc
    public final Uri LIZIZ(File file) {
        String strSubstring;
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry<String, File> entry = null;
            for (Map.Entry<String, File> entry2 : this.LIZIZ.entrySet()) {
                String path = entry2.getValue().getPath();
                if (LIZJ(canonicalPath, path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry != null) {
                String path2 = entry.getValue().getPath();
                if (path2.endsWith("/")) {
                    strSubstring = canonicalPath.substring(path2.length());
                } else {
                    strSubstring = canonicalPath.substring(path2.length() + 1);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(Uri.encode(entry.getKey()));
                sbLIZ.append('/');
                sbLIZ.append(Uri.encode(strSubstring, "/"));
                return new Uri.Builder().scheme("content").authority(this.LIZ).encodedPath(C2188811AlT.LIZIZ(sbLIZ)).build();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Failed to find configured root that contains ");
            sbLIZ2.append(canonicalPath);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Failed to resolve canonical path for ");
            sbLIZ3.append(file);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    public static boolean LIZJ(String str, String str2) {
        String strRemoveTrailingSlash = FileProvider.removeTrailingSlash(str);
        String strRemoveTrailingSlash2 = FileProvider.removeTrailingSlash(str2);
        if (!strRemoveTrailingSlash.equals(strRemoveTrailingSlash2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strRemoveTrailingSlash2);
            sbLIZ.append('/');
            if (!strRemoveTrailingSlash.startsWith(C2188811AlT.LIZIZ(sbLIZ))) {
                return false;
            }
            return true;
        }
        return true;
    }
}
