package X;

import android.graphics.Bitmap;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0SNl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C720350SNl {
    public static final List<PhotoModeImage> LIZ(PhotoModeImageInfo photoModeImageInfo) {
        UrlModel urlModel;
        List<PhotoModeImageUrlModel> imageList = photoModeImageInfo.getImageList();
        if (imageList == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(imageList, 10));
        int i = 0;
        for (PhotoModeImageUrlModel photoModeImageUrlModel : imageList) {
            int i2 = i + 1;
            if (i >= 0) {
                PhotoModeImageUrlModel photoModeImageUrlModel2 = photoModeImageUrlModel;
                if (!C281370B1b.LIZ() || (urlModel = photoModeImageUrlModel2.targetMultiRateImageUrl) == null) {
                    urlModel = photoModeImageUrlModel2.displayImageNoWatermark;
                    if (urlModel == null) {
                        urlModel = new UrlModel();
                    }
                }
                int width = urlModel.getWidth();
                int height = urlModel.getHeight();
                if (height == 0) {
                    height = 1;
                }
                Bitmap bitmap = C308690C8d.LIZ;
                float fRint = ((int) Math.rint((((double) width) / ((double) height)) * ((double) 100))) / 100;
                PhotoModeImage photoModeImage = new PhotoModeImage(urlModel, urlModel.getWidth(), urlModel.getHeight(), Float.valueOf(fRint), photoModeImageUrlModel2.translatedDisplayImage, i);
                if (fRint < photoModeImageInfo.getMinAspectRatio()) {
                    photoModeImageInfo.setMinImage(photoModeImage);
                    photoModeImageInfo.setMinAspectRatio(fRint);
                }
                if (fRint > photoModeImageInfo.getMaxAspectRatio()) {
                    photoModeImageInfo.setMaxImage(photoModeImage);
                    photoModeImageInfo.setMaxAspectRatio(fRint);
                }
                arrayList.add(photoModeImage);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return new ArrayList(arrayList);
    }

    public static final List<PhotoModeImage> LIZIZ(PhotoModeImageInfo photoModeImageInfo) {
        synchronized (photoModeImageInfo) {
            try {
                List<PhotoModeImage> photoModeImageList = photoModeImageInfo.getPhotoModeImageList();
                if (photoModeImageList != null) {
                    return photoModeImageList;
                }
                photoModeImageInfo.setPhotoModeImageList(LIZ(photoModeImageInfo));
                List<PhotoModeImage> photoModeImageList2 = photoModeImageInfo.getPhotoModeImageList();
                if (photoModeImageList2 == null) {
                    photoModeImageList2 = new ArrayList<>();
                }
                return photoModeImageList2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static final PhotoModeImage LIZJ(int i, Aweme aweme) {
        PhotoModeImageInfo photoModeImageInfo;
        PhotoModeImageInfo photoModeImageInfo2 = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo2 == null || i > C1697810uHb.LJIIIZ(LIZIZ(photoModeImageInfo2)).LLILLJJLI || i < 0 || (photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null) {
            return null;
        }
        return (PhotoModeImage) ListProtector.get(LIZIZ(photoModeImageInfo), i);
    }
}
