package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.ResourceModel;
import com.bytedance.android.livesdk.gift.assets.VideoResource;
import com.bytedance.android.livesdk.gift.model.AssetBase;
import com.bytedance.android.livesdk.gift.model.DistributionStrategy;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftEffectLayerEnabledSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftMultiplePlayerSetting;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fjj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1138650fjj implements InterfaceC1138810fjz {
    public static C1139230fkf LIZJ(int i, AssetsModel assetsModel) {
        List<VideoResource> list;
        VideoResource next;
        List<VideoResource> list2;
        VideoResource next2;
        ResourceModel resourceModel;
        List<String> list3;
        String[] strArr;
        if (assetsModel == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createByteVC1OptRequest");
            sbLIZ.append(", assetsModel is null");
            C20441214yg.LJ("DefaultResourceSupport", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        ConcurrentHashSet<Long> concurrentHashSet = C1138790fjx.LIZ;
        if ((!C1138790fjx.LIZ(assetsModel.id) || LiveGiftMultiplePlayerSetting.INSTANCE.isTargetVFBytevc1Opt()) && (list = assetsModel.videoResourceList) != null) {
            Iterator<VideoResource> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.videoTypeName, "bytevc1opt")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            VideoResource videoResource = next;
            if (videoResource == null || TextUtils.isEmpty(videoResource.videoMd5) || !(!videoResource.videoUrl.urlList.isEmpty()) || (list2 = assetsModel.videoResourceList) == null) {
                return null;
            }
            Iterator<VideoResource> it3 = list2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (Intrinsics.LJFF(next2.videoTypeName, "bytevc1opt")) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            VideoResource videoResource2 = next2;
            if (videoResource2 == null || (resourceModel = videoResource2.videoUrl) == null || (list3 = resourceModel.urlList) == null || (strArr = (String[]) list3.toArray(new String[0])) == null) {
                return null;
            }
            return new C1139230fkf(videoResource2.videoUrl.uri, assetsModel.id, strArr, videoResource2.videoMd5, i);
        }
        return null;
    }

    public static C1139230fkf LIZLLL(int i, AssetsModel assetsModel) {
        VideoResource videoResource;
        ResourceModel resourceModel;
        List<String> list;
        VideoResource next;
        ResourceModel resourceModel2;
        List<String> list2;
        String[] strArr;
        List<String> list3;
        String[] strArr2;
        ResourceModel resourceModel3;
        String str;
        String str2;
        VideoResource next2;
        String str3 = null;
        if (assetsModel == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createByteVC1Request");
            sbLIZ.append(", assetsModel is null");
            C20441214yg.LJ("DefaultResourceSupport", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        ConcurrentHashSet<Long> concurrentHashSet = C1138790fjx.LIZ;
        if (C1138790fjx.LIZ(assetsModel.id) && !LiveGiftMultiplePlayerSetting.INSTANCE.isTargetVFBytevc1()) {
            return null;
        }
        List<VideoResource> list4 = assetsModel.videoResourceList;
        if (list4 != null) {
            Iterator<VideoResource> it2 = list4.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next2 = it2.next();
                    if (Intrinsics.LJFF(next2.videoTypeName, "bytevc1")) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            videoResource = next2;
        } else {
            videoResource = null;
        }
        if ((videoResource == null || TextUtils.isEmpty(videoResource.videoMd5) || videoResource.videoUrl.urlList.isEmpty()) && (TextUtils.isEmpty(assetsModel.bytevc1Md5) || (resourceModel = assetsModel.resourceByteVC1Model) == null || (list = resourceModel.urlList) == null || !(!list.isEmpty()))) {
            return null;
        }
        ResourceModel resourceModel4 = assetsModel.resourceByteVC1Model;
        if (resourceModel4 != null && (list3 = resourceModel4.urlList) != null && (strArr2 = (String[]) list3.toArray(new String[0])) != null && strArr2.length != 0 && (resourceModel3 = assetsModel.resourceByteVC1Model) != null && (str = resourceModel3.uri) != null && str.length() != 0 && (str2 = assetsModel.bytevc1Md5) != null && str2.length() != 0) {
            ResourceModel resourceModel5 = assetsModel.resourceByteVC1Model;
            if (resourceModel5 != null) {
                str3 = resourceModel5.uri;
            }
            return new C1139230fkf(str3, assetsModel.id, strArr2, assetsModel.bytevc1Md5, i);
        }
        List<VideoResource> list5 = assetsModel.videoResourceList;
        if (list5 == null) {
            return null;
        }
        Iterator<VideoResource> it3 = list5.iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                if (Intrinsics.LJFF(next.videoTypeName, "bytevc1")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        VideoResource videoResource2 = next;
        if (videoResource2 == null || (resourceModel2 = videoResource2.videoUrl) == null || (list2 = resourceModel2.urlList) == null || (strArr = (String[]) list2.toArray(new String[0])) == null || strArr.length == 0 || videoResource2.videoMd5.length() <= 0) {
            return null;
        }
        return new C1139230fkf(videoResource2.videoUrl.uri, assetsModel.id, strArr, videoResource2.videoMd5, i);
    }

    public static C1139230fkf LJ(int i, AssetsModel assetsModel) {
        List<VideoResource> list;
        VideoResource next;
        List<VideoResource> list2;
        VideoResource next2;
        ResourceModel resourceModel;
        List<String> list3;
        String[] strArr;
        if (assetsModel == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createCropBVC1Request");
            sbLIZ.append(", assetsModel is null");
            C20441214yg.LJ("DefaultResourceSupport", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        ConcurrentHashSet<Long> concurrentHashSet = C1138790fjx.LIZ;
        if ((!C1138790fjx.LIZ(assetsModel.id) || LiveGiftMultiplePlayerSetting.INSTANCE.isTargetVFCropBvc1()) && (list = assetsModel.videoResourceList) != null) {
            Iterator<VideoResource> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.videoTypeName, "crop_bvc1")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            VideoResource videoResource = next;
            if (videoResource == null || TextUtils.isEmpty(videoResource.videoMd5) || !(!videoResource.videoUrl.urlList.isEmpty()) || (list2 = assetsModel.videoResourceList) == null) {
                return null;
            }
            Iterator<VideoResource> it3 = list2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (Intrinsics.LJFF(next2.videoTypeName, "crop_bvc1")) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            VideoResource videoResource2 = next2;
            if (videoResource2 == null || (resourceModel = videoResource2.videoUrl) == null || (list3 = resourceModel.urlList) == null || (strArr = (String[]) list3.toArray(new String[0])) == null) {
                return null;
            }
            return new C1139230fkf(videoResource2.videoUrl.uri, assetsModel.id, strArr, videoResource2.videoMd5, i);
        }
        return null;
    }

    public static C1139230fkf LJFF(int i, AssetsModel assetsModel) {
        List<VideoResource> list;
        VideoResource next;
        List<VideoResource> list2;
        VideoResource next2;
        ResourceModel resourceModel;
        List<String> list3;
        String[] strArr;
        if (assetsModel == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createDegradation264Request");
            sbLIZ.append(", assetsModel is null");
            C20441214yg.LJ("DefaultResourceSupport", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        ConcurrentHashSet<Long> concurrentHashSet = C1138790fjx.LIZ;
        if ((!C1138790fjx.LIZ(assetsModel.id) || LiveGiftMultiplePlayerSetting.INSTANCE.isTargetVF480p()) && (list = assetsModel.videoResourceList) != null) {
            Iterator<VideoResource> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.videoTypeName, "480p")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            VideoResource videoResource = next;
            if (videoResource == null || TextUtils.isEmpty(videoResource.videoMd5) || !(!videoResource.videoUrl.urlList.isEmpty()) || (list2 = assetsModel.videoResourceList) == null) {
                return null;
            }
            Iterator<VideoResource> it3 = list2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (Intrinsics.LJFF(next2.videoTypeName, "480p")) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            VideoResource videoResource2 = next2;
            if (videoResource2 == null || (resourceModel = videoResource2.videoUrl) == null || (list3 = resourceModel.urlList) == null || (strArr = (String[]) list3.toArray(new String[0])) == null) {
                return null;
            }
            return new C1139230fkf(videoResource2.videoUrl.uri, assetsModel.id, strArr, videoResource2.videoMd5, i);
        }
        return null;
    }

    public static C1139230fkf LJII(int i, AssetsModel assetsModel) {
        VideoResource videoResource;
        List<String> list;
        String[] strArr;
        VideoResource next;
        ResourceModel resourceModel;
        List<String> list2;
        String[] strArr2;
        VideoResource next2;
        if (assetsModel == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createH264Request");
            sbLIZ.append(", assetsModel is null");
            C20441214yg.LJ("DefaultResourceSupport", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        List<VideoResource> list3 = assetsModel.videoResourceList;
        if (list3 != null) {
            Iterator<VideoResource> it2 = list3.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next2 = it2.next();
                    if (Intrinsics.LJFF(next2.videoTypeName, "h264")) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            videoResource = next2;
        } else {
            videoResource = null;
        }
        if (videoResource == null || TextUtils.isEmpty(videoResource.videoMd5) || videoResource.videoUrl.urlList.isEmpty()) {
            if (TextUtils.isEmpty(assetsModel.md5)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(Long.valueOf(assetsModel.id));
                sbLIZ2.append(" isGiftH264Valid with illegal param, assetsModel:");
                sbLIZ2.append(assetsModel);
                sbLIZ2.append(" md5:");
                sbLIZ2.append(assetsModel.md5);
                C20441214yg.LJ("DefaultResourceSupport", C2188811AlT.LIZIZ(sbLIZ2));
                return null;
            }
            if (!(!assetsModel.resourceModel.urlList.isEmpty())) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(assetsModel.id);
                sbLIZ3.append(" isGiftH264Valid with illegal param, urlList is empty");
                C20441214yg.LJ("DefaultResourceSupport", C2188811AlT.LIZIZ(sbLIZ3));
                return null;
            }
        }
        List<VideoResource> list4 = assetsModel.videoResourceList;
        if (list4 != null) {
            Iterator<VideoResource> it3 = list4.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    if (Intrinsics.LJFF(next.videoTypeName, "h264")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            VideoResource videoResource2 = next;
            if (videoResource2 != null && (resourceModel = videoResource2.videoUrl) != null && (list2 = resourceModel.urlList) != null && (strArr2 = (String[]) list2.toArray(new String[0])) != null && strArr2.length != 0 && videoResource2.videoMd5.length() > 0) {
                return new C1139230fkf(videoResource2.videoUrl.uri, assetsModel.id, strArr2, videoResource2.videoMd5, i);
            }
        }
        ResourceModel resourceModel2 = assetsModel.resourceModel;
        if (resourceModel2 == null || (list = resourceModel2.urlList) == null || (strArr = (String[]) list.toArray(new String[0])) == null) {
            return null;
        }
        return new C1139230fkf(assetsModel.resourceModel.uri, assetsModel.id, strArr, assetsModel.md5, i);
    }

    public static C1139230fkf LJIIIIZZ(int i, AssetsModel assetsModel) {
        List<VideoResource> list;
        VideoResource next;
        List<VideoResource> list2;
        VideoResource next2;
        ResourceModel resourceModel;
        List<String> list3;
        String[] strArr;
        if (assetsModel == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createTrantorBVC1Request");
            sbLIZ.append(", assetsModel is null");
            C20441214yg.LJ("DefaultResourceSupport", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        ConcurrentHashSet<Long> concurrentHashSet = C1138790fjx.LIZ;
        if ((!C1138790fjx.LIZ(assetsModel.id) || LiveGiftMultiplePlayerSetting.INSTANCE.isTargetVFTrantor()) && (list = assetsModel.videoResourceList) != null) {
            Iterator<VideoResource> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.videoTypeName, "trantor_bvc1")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            VideoResource videoResource = next;
            if (videoResource == null || TextUtils.isEmpty(videoResource.videoMd5) || !(!videoResource.videoUrl.urlList.isEmpty()) || (list2 = assetsModel.videoResourceList) == null) {
                return null;
            }
            Iterator<VideoResource> it3 = list2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (Intrinsics.LJFF(next2.videoTypeName, "trantor_bvc1")) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            VideoResource videoResource2 = next2;
            if (videoResource2 == null || (resourceModel = videoResource2.videoUrl) == null || (list3 = resourceModel.urlList) == null || (strArr = (String[]) list3.toArray(new String[0])) == null) {
                return null;
            }
            return new C1139230fkf(videoResource2.videoUrl.uri, assetsModel.id, strArr, videoResource2.videoMd5, i);
        }
        return null;
    }

    public static C1139230fkf LJIIIZ(int i, AssetsModel assetsModel) {
        List<VideoResource> list;
        VideoResource next;
        List<VideoResource> list2;
        VideoResource next2;
        ResourceModel resourceModel;
        List<String> list3;
        String[] strArr;
        if (assetsModel == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createTrantorCropBVC1Request");
            sbLIZ.append(", assetsModel is null");
            C20441214yg.LJ("DefaultResourceSupport", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        ConcurrentHashSet<Long> concurrentHashSet = C1138790fjx.LIZ;
        if ((!C1138790fjx.LIZ(assetsModel.id) || LiveGiftMultiplePlayerSetting.INSTANCE.isTargetVFTrantorCrop()) && (list = assetsModel.videoResourceList) != null) {
            Iterator<VideoResource> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.videoTypeName, "trantor_crop_bvc1")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            VideoResource videoResource = next;
            if (videoResource == null || TextUtils.isEmpty(videoResource.videoMd5) || !(!videoResource.videoUrl.urlList.isEmpty()) || (list2 = assetsModel.videoResourceList) == null) {
                return null;
            }
            Iterator<VideoResource> it3 = list2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (Intrinsics.LJFF(next2.videoTypeName, "trantor_crop_bvc1")) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            VideoResource videoResource2 = next2;
            if (videoResource2 == null || (resourceModel = videoResource2.videoUrl) == null || (list3 = resourceModel.urlList) == null || (strArr = (String[]) list3.toArray(new String[0])) == null) {
                return null;
            }
            return new C1139230fkf(videoResource2.videoUrl.uri, assetsModel.id, strArr, videoResource2.videoMd5, i);
        }
        return null;
    }

    public static C1139230fkf LJI(AssetsModel assetsModel, int i, Integer num) {
        AssetBase assetBase;
        String uri;
        List urls;
        String[] strArr = null;
        if (!LiveGiftEffectLayerEnabledSetting.INSTANCE.isEnabled() && num != null && num.intValue() != 0) {
            if (assetsModel == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("createDistributionStrategyRequest");
                sbLIZ.append(", assetsModel is null");
                C20441214yg.LJ("DefaultResourceSupport", C2188811AlT.LIZIZ(sbLIZ));
                return null;
            }
            for (DistributionStrategy distributionStrategy : assetsModel.distributionStrategy) {
                if (num.intValue() == distributionStrategy.resourceType && (assetBase = distributionStrategy.assetBase) != null) {
                    ImageModel imageModel = assetBase.url;
                    if (imageModel != null) {
                        uri = imageModel.getUri();
                    } else {
                        uri = null;
                    }
                    long j = assetsModel.id;
                    ImageModel imageModel2 = assetBase.url;
                    if (imageModel2 != null && (urls = imageModel2.getUrls()) != null) {
                        strArr = (String[]) urls.toArray(new String[0]);
                    }
                    return new C1139230fkf(uri, j, strArr, assetBase.md5, i);
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("createDistributionStrategyRequest");
            sbLIZ2.append(", asset_download_fail_resource_not_found, effect_id:");
            sbLIZ2.append(assetsModel.id);
            sbLIZ2.append(" distributionResourceType:");
            sbLIZ2.append(num);
            C20441214yg.LJ("DefaultResourceSupport", C2188811AlT.LIZIZ(sbLIZ2));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("effect_id", String.valueOf(assetsModel.id));
            linkedHashMap.put("resource_type", num.toString());
            C1136500fgG.LIZ("asset_download_fail_resource_not_found", linkedHashMap, null, false);
        }
        return null;
    }
}
