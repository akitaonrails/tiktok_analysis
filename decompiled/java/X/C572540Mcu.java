package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.io.File;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Mcu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C572540Mcu {
    public static final C572540Mcu LIZ = new C572540Mcu();
    public static final String LIZIZ;
    public static final String LIZJ;

    public static Uri LIZ() {
        File[] fileArrListFiles;
        String absolutePath = null;
        String strLIZJ = LIZJ(null);
        C1662160tM6 c1662160tM6 = C1662160tM6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" target path: ");
        sbLIZ.append(strLIZJ);
        C201955140j.LIZLLL(c1662160tM6, "TextToImageGeckoManager", C2188811AlT.LIZIZ(sbLIZ));
        if (strLIZJ.length() == 0) {
            return null;
        }
        C0VSJ c0vsj = new C0VSJ(strLIZJ);
        if (!c0vsj.exists() || (fileArrListFiles = c0vsj.listFiles()) == null || fileArrListFiles.length == 0) {
            C201955140j.LIZLLL(c1662160tM6, "TextToImageGeckoManager", "dir not exist");
            return null;
        }
        File[] fileArrListFiles2 = c0vsj.listFiles();
        StringBuilder sb = new StringBuilder("file://");
        if (fileArrListFiles2 != null) {
            int length = fileArrListFiles2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                File file = fileArrListFiles2[i];
                if (u.LJIIZILJ(file.getPath(), "phototext_texttophoto_second_bg.jpeg", false)) {
                    absolutePath = file.getAbsolutePath();
                    break;
                }
                i++;
            }
        }
        sb.append(absolutePath);
        return UriProtector.parse(sb.toString());
    }

    public static File LIZIZ() {
        File[] fileArrListFiles;
        String strLIZJ = LIZJ(null);
        C1662160tM6 c1662160tM6 = C1662160tM6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" target path: ");
        sbLIZ.append(strLIZJ);
        C201955140j.LIZLLL(c1662160tM6, "TextToImageGeckoManager", C2188811AlT.LIZIZ(sbLIZ));
        if (strLIZJ.length() == 0) {
            return null;
        }
        C0VSJ c0vsj = new C0VSJ(strLIZJ);
        if (!c0vsj.exists() || (fileArrListFiles = c0vsj.listFiles()) == null || fileArrListFiles.length == 0) {
            C201955140j.LIZLLL(c1662160tM6, "TextToImageGeckoManager", "dir not exist");
            return null;
        }
        File[] fileArrListFiles2 = c0vsj.listFiles();
        if (fileArrListFiles2 != null) {
            for (File file : fileArrListFiles2) {
                if (a0.LJJIIZI(file.getPath(), "phototext_texttophoto_optimizeeditcard_lottie.json", false)) {
                    return file;
                }
            }
        }
        return null;
    }

    static {
        C1553670qX7 c1553670qX7 = C1553670qX7.LIZ;
        LIZIZ = C1553670qX7.LIZ();
        c1553670qX7.getClass();
        LIZJ = "offlineX";
    }

    public static String LIZJ(String str) {
        boolean z;
        File[] fileArrListFiles;
        String str2 = LIZJ;
        String str3 = LIZIZ;
        if (str == null) {
            str = "text_2_image_resource";
        }
        String strLJFF = C1552050qUV.LJFF(str2, str3, str);
        C1662160tM6 c1662160tM6 = C1662160tM6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" target path: ");
        sbLIZ.append(strLJFF);
        C201955140j.LIZLLL(c1662160tM6, "TextToImageGeckoManager", C2188811AlT.LIZIZ(sbLIZ));
        if (strLJFF != null && strLJFF.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C201955140j.LIZLLL(c1662160tM6, "TextToImageGeckoManager", "gecko path is null or empty");
            return "";
        }
        C0VSJ c0vsj = new C0VSJ(strLJFF);
        if (c0vsj.exists() && (fileArrListFiles = c0vsj.listFiles()) != null && fileArrListFiles.length != 0) {
            return strLJFF;
        }
        C201955140j.LIZLLL(c1662160tM6, "TextToImageGeckoManager", "dir not exist");
        return "";
    }
}
