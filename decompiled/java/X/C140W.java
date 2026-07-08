package X;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: X.140W, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C140W {
    JPEG("image/jpeg", LIZJ("jpg", "jpeg")),
    PNG("image/png", LIZJ("png")),
    GIF("image/gif", LIZJ("gif")),
    BMP("image/x-ms-bmp", LIZJ("bmp")),
    WEBP("image/webp", LIZJ("webp")),
    MPEG("video/mpeg", LIZJ("mpeg", "mpg")),
    MP4("video/mp4", LIZJ("mp4", "m4v")),
    QUICKTIME("video/quicktime", LIZJ("mov")),
    THREEGPP("video/3gpp", LIZJ("3gp", "3gpp")),
    THREEGPP2("video/3gpp2", LIZJ("3g2", "3gpp2")),
    MKV("video/x-matroska", LIZJ("mkv")),
    WEBM("video/webm", LIZJ("webm")),
    TS("video/mp2ts", LIZJ("ts")),
    AVI("video/avi", LIZJ("avi"));

    public final String LL;
    public final Set<String> LLILLJJLI;

    public static Set<C140W> ofAll() {
        return EnumSet.allOf(C140W.class);
    }

    public static Set<C140W> ofImage() {
        return EnumSet.of(JPEG, PNG, GIF, BMP, WEBP);
    }

    public static Set<C140W> ofVideo() {
        return EnumSet.of(MPEG, MP4, QUICKTIME, THREEGPP, THREEGPP2, MKV, WEBM, TS, AVI);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }

    public static C835410Wpv LIZJ(String... strArr) {
        List listAsList = Arrays.asList(strArr);
        C835410Wpv c835410Wpv = new C835410Wpv(0);
        if (listAsList != null) {
            c835410Wpv.addAll(listAsList);
        }
        return c835410Wpv;
    }

    public static boolean isImage(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("image");
    }

    public static boolean isVideo(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("video");
    }

    public static C140W valueOf(String str) {
        return (C140W) C08FF.LIZ(C140W.class, str);
    }

    public static Set<C140W> of(C140W c140w, C140W... c140wArr) {
        return EnumSet.of(c140w, c140wArr);
    }

    public boolean checkType(Context context, ContentResolver contentResolver, Uri uri) {
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        if (uri == null) {
            return false;
        }
        String extensionFromMimeType = singleton.getExtensionFromMimeType(contentResolver.getType(uri));
        String strLIZ = null;
        boolean z = false;
        for (String str : this.LLILLJJLI) {
            if (str.equals(extensionFromMimeType)) {
                return true;
            }
            if (!z) {
                strLIZ = C09N5.LIZ(context, uri);
                if (!TextUtils.isEmpty(strLIZ)) {
                    strLIZ = strLIZ.toLowerCase(Locale.US);
                }
                z = true;
            }
            if (strLIZ != null && strLIZ.endsWith(str)) {
                return true;
            }
        }
        return false;
    }

    C140W(String str, C835410Wpv c835410Wpv) {
        this.LL = str;
        this.LLILLJJLI = c835410Wpv;
    }
}
