package X;

import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;

/* JADX INFO: renamed from: X.0kbi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1325880kbi {
    public static final Uri LIZ = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "display_photo");

    public static String LIZ(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    public static Uri LIZIZ(int i) {
        return new Uri.Builder().scheme("res").path(String.valueOf(i)).build();
    }

    public static boolean LIZJ(Uri uri) {
        String string = uri.toString();
        if (!string.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) && !string.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString())) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(Uri uri) {
        return "content".equals(LIZ(uri));
    }

    public static boolean LJ(Uri uri) {
        String strLIZ = LIZ(uri);
        if (!"https".equals(strLIZ) && !"http".equals(strLIZ)) {
            return false;
        }
        return true;
    }
}
