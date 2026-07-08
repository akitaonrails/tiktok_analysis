package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LivePhotoStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SQu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C721220SQu {
    public static final C0SFO LIZ = C1EE2.LIZIZ.LJJJLZIJ().getSbLogger("LivePhoto", false, false);

    public static final int LIZ(Aweme aweme) {
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        int i = 0;
        if (!LIZLLL(aweme) || (photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null || (imageList = photoModeImageInfo.getImageList()) == null || imageList.isEmpty()) {
            return 0;
        }
        if (!(imageList instanceof Collection) || !imageList.isEmpty()) {
            Iterator<PhotoModeImageUrlModel> it2 = imageList.iterator();
            i = 0;
            while (it2.hasNext()) {
                LivePhotoStruct livePhotoStruct = it2.next().livePhotoStruct;
                if (livePhotoStruct != null && livePhotoStruct.isLivePhoto() && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i;
    }

    public static final int LIZIZ(Aweme aweme) {
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        int i = 0;
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null && !imageList.isEmpty()) {
            Iterator<PhotoModeImageUrlModel> it2 = imageList.iterator();
            i = 0;
            while (it2.hasNext()) {
                LivePhotoStruct livePhotoStruct = it2.next().livePhotoStruct;
                if (livePhotoStruct != null && livePhotoStruct.livePhotoType == 2 && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i;
    }

    public static final boolean LIZLLL(Aweme aweme) {
        List<PhotoModeImageUrlModel> imageList;
        Map<String, Object> postExtraMap;
        Object obj;
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (postExtraMap = photoModeImageInfo.getPostExtraMap()) != null && (obj = postExtraMap.get("has_live_photo")) != null) {
            return Intrinsics.LJFF(obj, Boolean.TRUE);
        }
        PhotoModeImageInfo photoModeImageInfo2 = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo2 != null && (imageList = photoModeImageInfo2.getImageList()) != null && !imageList.isEmpty()) {
            Iterator<PhotoModeImageUrlModel> it2 = imageList.iterator();
            while (it2.hasNext()) {
                LivePhotoStruct livePhotoStruct = it2.next().livePhotoStruct;
                if (livePhotoStruct != null && livePhotoStruct.isLivePhoto()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static final boolean LJ(Aweme aweme) {
        boolean zLJFF;
        List<PhotoModeImageUrlModel> imageList;
        Map<String, Object> postExtraMap;
        if (!LIZLLL(aweme)) {
            return false;
        }
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (postExtraMap = photoModeImageInfo.getPostExtraMap()) != null) {
            zLJFF = Intrinsics.LJFF(postExtraMap.get("all_live_photo"), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        if (zLJFF) {
            return true;
        }
        PhotoModeImageInfo photoModeImageInfo2 = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo2 == null || (imageList = photoModeImageInfo2.getImageList()) == null) {
            return false;
        }
        if (!imageList.isEmpty()) {
            Iterator<PhotoModeImageUrlModel> it2 = imageList.iterator();
            while (it2.hasNext()) {
                LivePhotoStruct livePhotoStruct = it2.next().livePhotoStruct;
                if (livePhotoStruct == null || !livePhotoStruct.isLivePhoto()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final String LIZJ(Aweme aweme, Set<Integer> set) {
        int iLJII;
        Iterator<T> it2 = set.iterator();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            if (LJFF(iIntValue, aweme) && (iLJII = LJII(iIntValue, aweme)) != 0) {
                if (iLJII != 1) {
                    if (iLJII == 2) {
                        z3 = true;
                    }
                } else {
                    z2 = true;
                }
            } else {
                z = true;
            }
        }
        if (z) {
            if (!z2 && !z3) {
                return "normal_photo";
            }
            return "mix_type";
        }
        if (z2) {
            if (!z3) {
                return "livephoto_live";
            }
            return "mix_type";
        }
        if (!z3) {
            return "normal_photo";
        }
        return "livephoto_loop";
    }

    public static final boolean LJFF(int i, Aweme aweme) {
        LivePhotoStruct livePhotoStructLJI = LJI(i, aweme);
        if (livePhotoStructLJI == null) {
            return false;
        }
        if (livePhotoStructLJI.livePhotoType == 2) {
            return true;
        }
        return livePhotoStructLJI.isLivePhoto();
    }

    public static final LivePhotoStruct LJI(int i, Aweme aweme) {
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null && (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(i, imageList)) != null) {
            return photoModeImageUrlModel.livePhotoStruct;
        }
        return null;
    }

    public static final int LJII(int i, Aweme aweme) {
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        LivePhotoStruct livePhotoStruct;
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null && (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(i, imageList)) != null && (livePhotoStruct = photoModeImageUrlModel.livePhotoStruct) != null) {
            return livePhotoStruct.livePhotoType;
        }
        return 0;
    }
}
