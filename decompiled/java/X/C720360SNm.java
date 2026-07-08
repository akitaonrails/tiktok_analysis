package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.CreationInfo;
import com.ss.android.ugc.aweme.feed.model.AnimatedImageInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.PhotoModeTextInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0SNm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C720360SNm {
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
                if ((!C281370B1b.LIZ() && !C2280911EPp.LIZ()) || (urlModel = photoModeImageUrlModel2.targetMultiRateImageUrl) == null) {
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
                float fLJI = C720310SNh.LJI(((double) width) / ((double) height));
                PhotoModeImage photoModeImage = new PhotoModeImage(urlModel, urlModel.getWidth(), urlModel.getHeight(), Float.valueOf(fLJI), photoModeImageUrlModel2.translatedDisplayImage, i);
                if (fLJI < photoModeImageInfo.getMinAspectRatio()) {
                    photoModeImageInfo.setMinImage(photoModeImage);
                    photoModeImageInfo.setMinAspectRatio(fLJI);
                }
                if (fLJI > photoModeImageInfo.getMaxAspectRatio()) {
                    photoModeImageInfo.setMaxImage(photoModeImage);
                    photoModeImageInfo.setMaxAspectRatio(fLJI);
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

    public static final int LIZJ(Aweme aweme) {
        if (aweme != null && AwemeExtKt.isPhotoMode(aweme)) {
            return C1EE2.LIZIZ.LJLIIIL().LIZJ(aweme.getAid());
        }
        return -1;
    }

    public static final List<PhotoModeImage> LIZLLL(PhotoModeImageInfo photoModeImageInfo) {
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

    public static final boolean LJ(Aweme aweme) {
        PhotoModeTextInfo photoModeTextInfo;
        if (aweme != null && AwemeExtKt.isPhotoMode(aweme) && (photoModeTextInfo = aweme.getPhotoModeTextInfo()) != null && photoModeTextInfo.isAITextMode()) {
            return true;
        }
        return false;
    }

    public static final boolean LJFF(Aweme aweme) {
        PhotoModeTextInfo photoModeTextInfo;
        if (aweme != null && AwemeExtKt.isPhotoMode(aweme) && (photoModeTextInfo = aweme.getPhotoModeTextInfo()) != null && photoModeTextInfo.isComment2Post()) {
            return true;
        }
        return false;
    }

    public static final boolean LJI(Aweme aweme) {
        PhotoModeTextInfo photoModeTextInfo;
        if (aweme != null && AwemeExtKt.isPhotoMode(aweme) && (photoModeTextInfo = aweme.getPhotoModeTextInfo()) != null && photoModeTextInfo.isConvertedText()) {
            return true;
        }
        return false;
    }

    public static final int LJII(Aweme aweme) {
        CreationInfo creationInfo;
        List<String> creationUsedFunctions;
        if (aweme == null || (creationInfo = aweme.getCreationInfo()) == null || (creationUsedFunctions = creationInfo.getCreationUsedFunctions()) == null || !creationUsedFunctions.contains("is_inspiration_added")) {
            return 0;
        }
        return 1;
    }

    public static final boolean LJIIIIZZ(Aweme aweme) {
        AnimatedImageInfo animatedImageInfo;
        Integer num;
        if (aweme.getAwemeType() == 0 && (animatedImageInfo = aweme.getAnimatedImageInfo()) != null && (num = animatedImageInfo.type) != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIIZ(Aweme aweme) {
        if (AwemeExtKt.isPhotoMode(aweme) && aweme.getMusic() == null) {
            return true;
        }
        return false;
    }

    public static final int LJIIJ(Aweme aweme) {
        CreationInfo creationInfo;
        List<String> creationUsedFunctions;
        if (aweme == null || (creationInfo = aweme.getCreationInfo()) == null || (creationUsedFunctions = creationInfo.getCreationUsedFunctions()) == null || !creationUsedFunctions.contains("is_photo_text_added")) {
            return 0;
        }
        return 1;
    }

    public static final boolean LJIIJJI(Aweme aweme) {
        PhotoModeTextInfo photoModeTextInfo;
        if (aweme != null && AwemeExtKt.isPhotoMode(aweme) && (photoModeTextInfo = aweme.getPhotoModeTextInfo()) != null && photoModeTextInfo.isText2Image()) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIL(Aweme aweme) {
        if (aweme != null && (LJI(aweme) || C0NC0.LIZ(aweme))) {
            return true;
        }
        if (LJIIJJI(aweme) && aweme != null && C0S7E.LIZ(aweme) == 1) {
            return true;
        }
        return false;
    }

    public static final PhotoModeImage LIZIZ(PhotoModeImageInfo photoModeImageInfo, int i) {
        int size;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        UrlModel urlModel;
        List<PhotoModeImageUrlModel> imageList2 = photoModeImageInfo.getImageList();
        if (imageList2 != null) {
            size = imageList2.size();
        } else {
            size = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("computeSinglePhotoModeImage position : ");
        sbLIZ.append(i);
        sbLIZ.append(", imageList size : ");
        sbLIZ.append(size);
        C2344809Gs.LIZLLL(4, "PhotoModeBitrate", C2188811AlT.LIZIZ(sbLIZ));
        if (i >= size || (imageList = photoModeImageInfo.getImageList()) == null || (photoModeImageUrlModel = (PhotoModeImageUrlModel) ListProtector.get(imageList, i)) == null) {
            return null;
        }
        if ((!C281370B1b.LIZ() && !C2280911EPp.LIZ()) || (urlModel = photoModeImageUrlModel.targetMultiRateImageUrl) == null) {
            urlModel = photoModeImageUrlModel.displayImageNoWatermark;
            if (urlModel == null) {
                urlModel = new UrlModel();
            }
        }
        int width = urlModel.getWidth();
        int height = urlModel.getHeight();
        if (height == 0) {
            height = 1;
        }
        float fLJI = C720310SNh.LJI(((double) width) / ((double) height));
        PhotoModeImage photoModeImage = new PhotoModeImage(urlModel, urlModel.getWidth(), urlModel.getHeight(), Float.valueOf(fLJI), photoModeImageUrlModel.translatedDisplayImage, i);
        if (fLJI < photoModeImageInfo.getMinAspectRatio()) {
            photoModeImageInfo.setMinImage(photoModeImage);
            photoModeImageInfo.setMinAspectRatio(fLJI);
        }
        if (fLJI > photoModeImageInfo.getMaxAspectRatio()) {
            photoModeImageInfo.setMaxImage(photoModeImage);
            photoModeImageInfo.setMaxAspectRatio(fLJI);
        }
        return photoModeImage;
    }

    public static final PhotoModeImage LJIILIIL(Aweme aweme, int i, boolean z) {
        PhotoModeImage photoModeImageLIZIZ;
        String uri;
        Integer numValueOf;
        List<PhotoModeImage> photoModeImageList;
        UrlModel urlModel;
        PhotoModeImageInfo photoModeImageInfo;
        Integer numValueOf2 = null;
        if ((z || ((Boolean) C2280911EPp.LJIIJJI.getValue()).booleanValue()) && C2280911EPp.LIZ()) {
            PhotoModeImageInfo photoModeImageInfo2 = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo2 == null) {
                return null;
            }
            synchronized (photoModeImageInfo2) {
                try {
                    if (photoModeImageInfo2.getPhotoModeImageList() == null) {
                        photoModeImageInfo2.setPhotoModeImageList(LIZ(photoModeImageInfo2));
                    }
                    photoModeImageLIZIZ = LIZIZ(photoModeImageInfo2, i);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getOrInitPhotoAt compute ");
                    if (photoModeImageLIZIZ == null || (urlModel = photoModeImageLIZIZ.urlModel) == null) {
                        uri = null;
                    } else {
                        uri = urlModel.getUri();
                    }
                    sbLIZ.append(uri);
                    sbLIZ.append(" : ");
                    if (photoModeImageLIZIZ == null) {
                        numValueOf = null;
                    } else {
                        numValueOf = Integer.valueOf(photoModeImageLIZIZ.width);
                    }
                    sbLIZ.append(numValueOf);
                    sbLIZ.append(" * ");
                    if (photoModeImageLIZIZ != null) {
                        numValueOf2 = Integer.valueOf(photoModeImageLIZIZ.height);
                    }
                    sbLIZ.append(numValueOf2);
                    sbLIZ.append(' ');
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (photoModeImageLIZIZ != null && (photoModeImageList = photoModeImageInfo2.getPhotoModeImageList()) != null && i < photoModeImageList.size()) {
                        photoModeImageList.set(i, photoModeImageLIZIZ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return photoModeImageLIZIZ;
        }
        PhotoModeImageInfo photoModeImageInfo3 = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo3 == null || i > C1697810uHb.LJIIIZ(LIZLLL(photoModeImageInfo3)).LLILLJJLI || i < 0 || (photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null) {
            return null;
        }
        return (PhotoModeImage) ListProtector.get(LIZLLL(photoModeImageInfo), i);
    }
}
