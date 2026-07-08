package X;

import android.graphics.Bitmap;
import android.util.LruCache;
import android.util.Size;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;

/* JADX INFO: renamed from: X.097q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23212097q {
    public static final C23213097r LIZ = new LruCache<String, Bitmap>() { // from class: X.097r
        @Override // android.util.LruCache
        public final int sizeOf(String str, Bitmap bitmap) {
            return bitmap.getByteCount();
        }
    };

    public static String LIZ(TikTokMediaModel tikTokMediaModel, Size size) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((MediaModel) tikTokMediaModel).id);
        sbLIZ.append('_');
        sbLIZ.append(size.getWidth());
        sbLIZ.append('x');
        sbLIZ.append(size.getHeight());
        sbLIZ.append('_');
        sbLIZ.append(tikTokMediaModel.LJFF());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LIZJ(Bitmap bitmap, Size size) {
        int width = size.getWidth() * 2;
        int height = size.getHeight() * 2;
        if (bitmap.getWidth() <= width && bitmap.getHeight() <= height) {
            return true;
        }
        return false;
    }

    public static Bitmap LIZLLL(TikTokMediaModel tikTokMediaModel, Size size) {
        String strLIZ = LIZ(tikTokMediaModel, size);
        C23213097r c23213097r = LIZ;
        synchronized (c23213097r) {
            try {
                Bitmap bitmap = c23213097r.get(strLIZ);
                if (bitmap == null) {
                    return null;
                }
                if (bitmap.isRecycled()) {
                    c23213097r.remove(strLIZ);
                    return null;
                }
                return bitmap;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap LIZIZ(android.content.Context r5, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel r6, android.util.Size r7) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            r4 = 1
            r2 = 0
            if (r1 < r0) goto L51
            boolean r0 = r6 instanceof com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel
            if (r0 == 0) goto L29
            r3 = r6
            if (r6 == 0) goto L2a
            X.0L8y r1 = r6.loadSource
        L11:
            X.0L8y r0 = X.EnumC538220L8y.PHOTO_PICKER
            if (r1 != r0) goto L31
            java.lang.String r0 = r3.mediaPickerAbsolutePath
            if (r0 == 0) goto L28
            X.0VSJ r1 = new X.0VSJ
            r1.<init>(r0)
            boolean r0 = r3.LJIILJJIL()
            if (r0 == 0) goto L2c
            android.graphics.Bitmap r2 = android.media.ThumbnailUtils.createVideoThumbnail(r1, r7, r2)
        L28:
            return r2
        L29:
            r3 = r2
        L2a:
            r1 = r2
            goto L11
        L2c:
            android.graphics.Bitmap r2 = android.media.ThumbnailUtils.createImageThumbnail(r1, r7, r2)
            return r2
        L31:
            if (r3 == 0) goto L40
            boolean r0 = r3.isResized
            if (r0 != r4) goto L40
            java.lang.String r0 = r6.LJFF()
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeFile(r0)
            return r2
        L40:
            java.lang.String r0 = r6.LJFF()
            android.net.Uri r1 = X.C2471909mP.LJIILIIL(r0)
            android.content.ContentResolver r0 = r5.getContentResolver()
            android.graphics.Bitmap r2 = r0.loadThumbnail(r1, r7, r2)
            return r2
        L51:
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options
            r3.<init>()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
            r3.inPreferredConfig = r0
            java.lang.String r0 = r6.id
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r0)
            if (r0 == 0) goto L7b
            long r1 = r0.longValue()
            boolean r0 = X.C23214097s.LIZ()
            if (r0 == 0) goto L6d
            r4 = 3
        L6d:
            boolean r0 = r6.LJIILJJIL()
            if (r0 == 0) goto L7c
            android.content.ContentResolver r0 = r5.getContentResolver()
            android.graphics.Bitmap r2 = android.provider.MediaStore.Video.Thumbnails.getThumbnail(r0, r1, r4, r3)
        L7b:
            return r2
        L7c:
            android.content.ContentResolver r0 = r5.getContentResolver()
            android.graphics.Bitmap r2 = android.provider.MediaStore.Images.Thumbnails.getThumbnail(r0, r1, r4, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23212097q.LIZIZ(android.content.Context, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel, android.util.Size):android.graphics.Bitmap");
    }
}
