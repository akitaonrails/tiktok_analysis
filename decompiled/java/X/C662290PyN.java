package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.search.abtest.SearchPhotoCoverConfig;
import java.util.List;

/* JADX INFO: renamed from: X.0PyN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C662290PyN {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(Aweme aweme) {
        PhotoModeImageInfo photoModeImageInfo;
        UrlModel urlModel;
        List<String> urlList;
        UrlModel urlModel2;
        List<String> urlList2;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        UrlModel urlModel3;
        List<String> urlList3;
        if (aweme == null || (photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null) {
            return null;
        }
        int i = C662310PyP.LIZ[LIZJ(aweme).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    List<PhotoModeImageUrlModel> imageList = photoModeImageInfo.getImageList();
                    if (imageList == null || (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLL(imageList)) == null || (urlModel3 = photoModeImageUrlModel.displayImageNoWatermark) == null || (urlList3 = urlModel3.getUrlList()) == null) {
                        return null;
                    }
                    return (String) C13LP.LJJJLL(urlList3);
                }
                throw new C1954807lC();
            }
            PhotoModeImageUrlModel imagePostCover = photoModeImageInfo.getImagePostCover();
            if (imagePostCover == null || (urlModel2 = imagePostCover.displayImageNoWatermark) == null || (urlList2 = urlModel2.getUrlList()) == null) {
                return null;
            }
            return (String) C13LP.LJJJLL(urlList2);
        }
        PhotoModeImageUrlModel searchOutflowDisplayImage = photoModeImageInfo.getSearchOutflowDisplayImage();
        if (searchOutflowDisplayImage == null || (urlModel = searchOutflowDisplayImage.displayImageNoWatermark) == null || (urlList = urlModel.getUrlList()) == null) {
            return null;
        }
        return (String) C13LP.LJJJLL(urlList);
    }

    public static final List<String> LIZIZ(Aweme aweme) {
        PhotoModeImageInfo photoModeImageInfo;
        UrlModel urlModel;
        UrlModel urlModel2;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        UrlModel urlModel3;
        if (aweme == null || (photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null) {
            return null;
        }
        int i = C662310PyP.LIZ[LIZJ(aweme).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    List<PhotoModeImageUrlModel> imageList = photoModeImageInfo.getImageList();
                    if (imageList == null || (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLL(imageList)) == null || (urlModel3 = photoModeImageUrlModel.displayImageNoWatermark) == null) {
                        return null;
                    }
                    return urlModel3.getUrlList();
                }
                throw new C1954807lC();
            }
            PhotoModeImageUrlModel imagePostCover = photoModeImageInfo.getImagePostCover();
            if (imagePostCover == null || (urlModel2 = imagePostCover.displayImageNoWatermark) == null) {
                return null;
            }
            return urlModel2.getUrlList();
        }
        PhotoModeImageUrlModel searchOutflowDisplayImage = photoModeImageInfo.getSearchOutflowDisplayImage();
        if (searchOutflowDisplayImage == null || (urlModel = searchOutflowDisplayImage.displayImageNoWatermark) == null) {
            return null;
        }
        return urlModel.getUrlList();
    }

    public static final EnumC662300PyO LIZJ(Aweme aweme) {
        PhotoModeImageInfo photoModeImageInfo;
        PhotoModeImageUrlModel imagePostCover;
        UrlModel urlModel;
        List<String> urlList;
        String str;
        UrlModel urlModel2;
        List<String> urlList2;
        String str2;
        if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null) {
            PhotoModeImageUrlModel searchOutflowDisplayImage = photoModeImageInfo.getSearchOutflowDisplayImage();
            if (searchOutflowDisplayImage != null && (urlModel2 = searchOutflowDisplayImage.displayImageNoWatermark) != null && (urlList2 = urlModel2.getUrlList()) != null && (str2 = (String) C13LP.LJJJLL(urlList2)) != null && str2.length() > 0) {
                return EnumC662300PyO.OUTFLOW;
            }
            C662280PyM.LIZ.getClass();
            if (((SearchPhotoCoverConfig) C662280PyM.LIZJ.getValue()).enable && (imagePostCover = photoModeImageInfo.getImagePostCover()) != null && (urlModel = imagePostCover.displayImageNoWatermark) != null && (urlList = urlModel.getUrlList()) != null && (str = (String) C13LP.LJJJLL(urlList)) != null && str.length() > 0) {
                return EnumC662300PyO.COVER;
            }
            return EnumC662300PyO.IMAGE_LIST;
        }
        return EnumC662300PyO.IMAGE_LIST;
    }

    public static final boolean LJ(Aweme aweme) {
        if (LIZJ(aweme) == EnumC662300PyO.COVER) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0121 A[ADDED_TO_REGION, LOOP:3: B:83:0x0121->B:95:0x0146, LOOP_START, PHI: r3
      0x0121: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:82:0x011f, B:95:0x0146] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZLLL(int r10, com.ss.android.ugc.aweme.feed.model.Aweme r11) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C662290PyN.LIZLLL(int, com.ss.android.ugc.aweme.feed.model.Aweme):java.util.List");
    }
}
