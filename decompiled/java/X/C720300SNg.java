package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import java.util.List;

/* JADX INFO: renamed from: X.0SNg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C720300SNg {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(Aweme aweme) {
        if (!C0SNF.LIZIZ) {
            return;
        }
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        List<PhotoModeImage> listLIZ = null;
        if (photoModeImageInfo != null && photoModeImageInfo.getPhotoModeImageList() != null) {
            return;
        }
        synchronized (aweme) {
            try {
                PhotoModeImageInfo photoModeImageInfo2 = aweme.getPhotoModeImageInfo();
                if (photoModeImageInfo2 != null) {
                    PhotoModeImageInfo photoModeImageInfo3 = aweme.getPhotoModeImageInfo();
                    if (photoModeImageInfo3 != null) {
                        listLIZ = LIZ(photoModeImageInfo3, AwemeExtKt.isAdTraffic(aweme));
                    }
                    photoModeImageInfo2.setPhotoModeImageList(listLIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZ(com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo r17, boolean r18) {
        /*
            r8 = r17
            java.util.List r1 = r8.getImageList()
            r7 = 0
            if (r1 == 0) goto Lad
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r6.<init>(r0)
            java.util.Iterator r10 = r1.iterator()
            r5 = 0
            r17 = 0
        L1b:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto La8
            java.lang.Object r4 = r10.next()
            int r9 = r17 + 1
            if (r17 < 0) goto La4
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel r4 = (com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel) r4
            if (r18 != 0) goto La1
            int r1 = X.C0SNF.LIZ
            r0 = 2
            if (r1 == r0) goto La1
            r0 = 3
            if (r1 != r0) goto L8e
            if (r17 != 0) goto L8b
            java.util.List<com.ss.android.ugc.aweme.feed.model.MultiImageUrlInfo> r0 = r4.bitrateImages
            if (r0 == 0) goto L47
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r5, r0)
            com.ss.android.ugc.aweme.feed.model.MultiImageUrlInfo r0 = (com.ss.android.ugc.aweme.feed.model.MultiImageUrlInfo) r0
            if (r0 == 0) goto L47
            com.ss.android.ugc.aweme.base.model.UrlModel r12 = r0.image
            if (r12 != 0) goto L50
        L47:
            com.ss.android.ugc.aweme.base.model.UrlModel r12 = r4.displayImageNoWatermark
        L49:
            if (r12 != 0) goto L50
            com.ss.android.ugc.aweme.base.model.UrlModel r12 = new com.ss.android.ugc.aweme.base.model.UrlModel
            r12.<init>()
        L50:
            int r1 = r12.getWidth()
            int r0 = r12.getHeight()
            if (r0 != 0) goto L5b
            r0 = 1
        L5b:
            double r2 = (double) r1
            double r0 = (double) r0
            double r2 = r2 / r0
            float r1 = X.C720310SNh.LJI(r2)
            com.ss.android.ugc.aweme.feed.model.PhotoModeImage r11 = new com.ss.android.ugc.aweme.feed.model.PhotoModeImage
            int r13 = r12.getWidth()
            int r14 = r12.getHeight()
            java.lang.Float r15 = java.lang.Float.valueOf(r1)
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r4.translatedDisplayImage
            r16 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            float r0 = r8.getMinAspectRatio()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L85
            r8.setMinImage(r11)
            r8.setMinAspectRatio(r1)
        L85:
            r6.add(r11)
            r17 = r9
            goto L1b
        L8b:
            com.ss.android.ugc.aweme.base.model.UrlModel r12 = r4.displayImageNoWatermark
            goto L49
        L8e:
            java.util.List<com.ss.android.ugc.aweme.feed.model.MultiImageUrlInfo> r0 = r4.bitrateImages
            if (r0 == 0) goto L9e
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r5, r0)
            com.ss.android.ugc.aweme.feed.model.MultiImageUrlInfo r0 = (com.ss.android.ugc.aweme.feed.model.MultiImageUrlInfo) r0
            if (r0 == 0) goto L9e
            com.ss.android.ugc.aweme.base.model.UrlModel r12 = r0.image
            if (r12 != 0) goto L50
        L9e:
            com.ss.android.ugc.aweme.base.model.UrlModel r12 = r4.displayImageNoWatermark
            goto L49
        La1:
            com.ss.android.ugc.aweme.base.model.UrlModel r12 = r4.displayImageNoWatermark
            goto L49
        La4:
            X.C1697810uHb.LJIJI()
            throw r7
        La8:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r6)
        Lad:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C720300SNg.LIZ(com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo, boolean):java.util.List");
    }
}
