package X;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: X.09NT, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09NT {
    public static final AssetFileDescriptor LIZ(ContentResolver contentResolver, Uri uri) {
        if (C0VSE.LIZ(uri) && C0VSE.LIZ && C0VSE.LJII) {
            return null;
        }
        return contentResolver.openAssetFileDescriptor(uri, "r", null);
    }

    public static final ParcelFileDescriptor LIZJ(ContentResolver contentResolver, Uri uri) {
        if (C0VSE.LIZ(uri) && C0VSE.LIZ && C0VSE.LJII) {
            return null;
        }
        return contentResolver.openFileDescriptor(uri, "r", null);
    }

    public static final InputStream LJ(ContentResolver contentResolver, Uri uri) {
        if (C0VSE.LIZ(uri) && C0VSE.LIZ && C0VSE.LJII) {
            return null;
        }
        return contentResolver.openInputStream(uri);
    }

    public static final OutputStream LJFF(ContentResolver contentResolver, Uri uri) {
        if (C0VSE.LIZ(uri) && C0VSE.LIZ && C0VSE.LJII) {
            return null;
        }
        return contentResolver.openOutputStream(uri);
    }

    public static final OutputStream LJI(ContentResolver contentResolver, Uri uri) {
        if (C0VSE.LIZ(uri) && C0VSE.LIZ && C0VSE.LJII) {
            return null;
        }
        return contentResolver.openOutputStream(uri, "w");
    }

    public static final AssetFileDescriptor LIZIZ(ContentResolver contentResolver, Uri uri, String str) {
        if (C0VSE.LIZ(uri) && C0VSE.LIZ && C0VSE.LJII) {
            return null;
        }
        return contentResolver.openAssetFileDescriptor(uri, str);
    }

    public static final ParcelFileDescriptor LIZLLL(ContentResolver contentResolver, Uri uri, String str) {
        if (C0VSE.LIZ(uri) && C0VSE.LIZ && C0VSE.LJII) {
            return null;
        }
        return contentResolver.openFileDescriptor(uri, str);
    }
}
