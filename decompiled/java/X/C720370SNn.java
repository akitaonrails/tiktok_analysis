package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.TranslationInfo;
import com.ss.android.ugc.aweme.translation.service.ICLATranslatabilityService;
import java.util.List;

/* JADX INFO: renamed from: X.0SNn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C720370SNn {
    public static final /* synthetic */ int LIZ = 0;

    public static AnonymousClass0075 LIZ(Aweme aweme) {
        String str;
        TranslationInfo translationInfo;
        if (C582980Mtk.LIZIZ(aweme) && C281430B1h.LIZ()) {
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo != null && (translationInfo = photoModeImageInfo.getTranslationInfo()) != null) {
                str = translationInfo.iamgeMajorLanguage;
            } else {
                str = null;
            }
            Integer numValueOf = Integer.valueOf(C123100dR.LIZ(str) ? 1 : 0);
            ICLATranslatabilityService iCLATranslatabilityService = C0SQQ.LIZ;
            return new AnonymousClass0075(numValueOf, Integer.valueOf(!iCLATranslatabilityService.LJIILL(aweme).isEmpty() ? 1 : 0), Integer.valueOf(!iCLATranslatabilityService.LJIIIIZZ(aweme, null).isEmpty() ? 1 : 0), str);
        }
        return new AnonymousClass0075(null, null, null, null);
    }

    public static C2797016l LIZIZ(int i, Aweme aweme) {
        String str;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        List<PhotoModeImageUrlModel> imageList2;
        PhotoModeImageUrlModel photoModeImageUrlModel2;
        String str2 = null;
        if (C582980Mtk.LIZIZ(aweme) && C281430B1h.LIZ()) {
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo != null && (imageList2 = photoModeImageInfo.getImageList()) != null && (photoModeImageUrlModel2 = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(i, imageList2)) != null) {
                str = photoModeImageUrlModel2.ocrLanguage;
            } else {
                str = null;
            }
            Integer numValueOf = Integer.valueOf(C0SQQ.LIZ.LJII(i, aweme) ? 1 : 0);
            Integer numValueOf2 = Integer.valueOf(C123100dR.LIZ(str) ? 1 : 0);
            Integer numValueOf3 = Integer.valueOf(i + 1);
            PhotoModeImageInfo photoModeImageInfo2 = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo2 != null && (imageList = photoModeImageInfo2.getImageList()) != null && (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(i, imageList)) != null) {
                str2 = photoModeImageUrlModel.ocrLanguage;
            }
            return new C2797016l(numValueOf, numValueOf2, numValueOf3, str2);
        }
        return new C2797016l(null, null, null, null);
    }
}
