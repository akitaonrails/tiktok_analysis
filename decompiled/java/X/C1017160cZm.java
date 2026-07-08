package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.commercialize.service.ISamsungPageService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.LivePhotoStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cZm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017160cZm {
    public static final C1017160cZm LIZ = new C1017160cZm();

    public static final void LIZ(Aweme aweme, Map map, String str, boolean z) {
        IFeedService iFeedServiceLIZIZ;
        InterfaceC1017820caq interfaceC1017820caqLJIILIIL;
        Set<Map.Entry<String, Object>> setEntrySet;
        int i;
        int size;
        int i2;
        List<PhotoModeImageUrlModel> imageList;
        List<PhotoModeImageUrlModel> imageList2;
        List<PhotoModeImageUrlModel> imageList3;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        LivePhotoStruct livePhotoStruct;
        LIZIZ(aweme, str, map, z);
        int i3 = 0;
        AwemeRawAd awemeRawAd = null;
        if (aweme != null && str != null && C1017070cZd.LLIIL(aweme)) {
            IAdPhotoModeService iAdPhotoModeService = (IAdPhotoModeService) ServiceManager.get().getService(IAdPhotoModeService.class);
            if (iAdPhotoModeService.LIZIZ() != null) {
                map.put("slide_area", iAdPhotoModeService.LIZIZ());
                map.put("action_type", iAdPhotoModeService.LJI());
            }
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo != null && (imageList3 = photoModeImageInfo.getImageList()) != null && (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(iAdPhotoModeService.LJJIJIIJIL(), imageList3)) != null && (livePhotoStruct = photoModeImageUrlModel.livePhotoStruct) != null && livePhotoStruct.isLivePhoto()) {
                i = 1;
            } else {
                i = 0;
            }
            map.put("is_video", Integer.valueOf(i));
            PhotoModeImageInfo photoModeImageInfo2 = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo2 != null && (imageList2 = photoModeImageInfo2.getImageList()) != null) {
                size = imageList2.size();
            } else {
                size = 0;
            }
            PhotoModeImageInfo photoModeImageInfo3 = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo3 != null && (imageList = photoModeImageInfo3.getImageList()) != null && !imageList.isEmpty()) {
                Iterator<PhotoModeImageUrlModel> it2 = imageList.iterator();
                i2 = 0;
                while (it2.hasNext()) {
                    LivePhotoStruct livePhotoStruct2 = it2.next().livePhotoStruct;
                    if (livePhotoStruct2 != null && livePhotoStruct2.isLivePhoto() && (i2 = i2 + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            } else {
                i2 = 0;
            }
            map.put("image_creative_cnt", Integer.valueOf(size - i2));
            map.put("video_creative_cnt", Integer.valueOf(i2));
            map.put("carousel_creative_cnt", Integer.valueOf(size));
        }
        LIZ.getClass();
        if (aweme != null && C1017070cZd.LJJJZ(aweme) && Intrinsics.LJFF(str, "title")) {
            if (AwemeBizExtKt.isDesMoreTextShow(aweme)) {
                i3 = 1;
            }
            map.put("if_title_collapsed", Integer.valueOf(i3));
        }
        ICommerceService iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi$default(ICommerceService.class, false, false, false, 14, null);
        if (iCommerceService != null && (iFeedServiceLIZIZ = iCommerceService.LIZIZ()) != null && (interfaceC1017820caqLJIILIIL = iFeedServiceLIZIZ.LJIILIIL()) != null) {
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            }
            Map<String, Object> mapLJIIJJI = interfaceC1017820caqLJIILIIL.LJIIJJI(awemeRawAd, str);
            if (mapLJIIJJI != null && (setEntrySet = mapLJIIJJI.entrySet()) != null) {
                Iterator<T> it3 = setEntrySet.iterator();
                while (it3.hasNext()) {
                    Map.Entry entry = (Map.Entry) it3.next();
                    map.put(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public static final void LIZIZ(Aweme aweme, String str, Map map, boolean z) {
        AwemeRawAd awemeRawAd;
        ISamsungPageService iSamsungPageService;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || str == null) {
            return;
        }
        if (C1017180cZo.LJIIIIZZ(awemeRawAd) == 1 || C1017180cZo.LIZ(awemeRawAd) || (((iSamsungPageService = (ISamsungPageService) PluggableExtentionKt.pluggableSpi$default(ISamsungPageService.class, false, false, false, 14, null)) != null && iSamsungPageService.LIZJ(awemeRawAd)) || C1017180cZo.LJJ(awemeRawAd))) {
            if (TextUtils.equals(str, "slide") && C1017180cZo.LIZ(awemeRawAd) && C1017180cZo.LJIILIIL(awemeRawAd)) {
                return;
            }
            if (C1017070cZd.LJJJJLI(aweme)) {
                LIZ.getClass();
                if (!TextUtils.equals(str, "auto_show_feedplay") && !TextUtils.equals(str, "auto_show_feedfinish")) {
                    return;
                }
            }
            String strLJIIIZ = C1017180cZo.LJIIIZ(awemeRawAd);
            if (strLJIIIZ != null) {
                map.put("appstore_type", strLJIIIZ);
            }
            map.put("package_name", awemeRawAd.getPackageName());
            C1022030chd.LIZ(awemeRawAd, str, map, z);
            C1022030chd.LIZIZ(awemeRawAd, str, map, z);
        }
    }
}
