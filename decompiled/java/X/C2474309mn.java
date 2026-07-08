package X;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09mn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2474309mn {
    public static final int LIZ(Context context, String str) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        C2473009ma.LIZ.getClass();
        if (!C2473009ma.LJFF(context, str)) {
            return 0;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        C2473009ma.LIZIZ(context, options, str);
        return options.outWidth * options.outHeight;
    }

    public static final int LIZIZ(Context context, String str) {
        int i;
        int i2 = 0;
        if (str == null || TextUtils.isEmpty(str)) {
            return 0;
        }
        C2473009ma.LIZ.getClass();
        MediaMetadataRetriever mediaMetadataRetrieverLJ = C2473009ma.LJ(context, str);
        try {
            try {
                if (C2473009ma.LJI(str)) {
                    mediaMetadataRetrieverLJ.setDataSource(context, Uri.parse(str));
                } else {
                    mediaMetadataRetrieverLJ.setDataSource(str);
                }
                String strLJII = C20144413ru.LJII(mediaMetadataRetrieverLJ);
                String strLJFF = C20144413ru.LJFF(mediaMetadataRetrieverLJ);
                if (strLJII != null) {
                    i = Integer.parseInt(strLJII);
                } else {
                    i = 0;
                }
                if (strLJFF != null) {
                    i2 = Integer.parseInt(strLJFF);
                }
                int i3 = i * i2;
                try {
                    mediaMetadataRetrieverLJ.release();
                    return i3;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return i3;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                try {
                    mediaMetadataRetrieverLJ.release();
                    throw th;
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    throw th;
                }
            }
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            try {
                mediaMetadataRetrieverLJ.release();
                return i2;
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
                return i2;
            }
        }
    }
}
