package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageAdjustInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleAdjustInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS261S0000000_22;

/* JADX INFO: renamed from: X.0mde, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403960mde {
    public static final C1403960mde LIZ = new C1403960mde();

    public static C0LAB LIZJ(VideoPublishEditModel videoPublishEditModel) {
        List<SingleImageData> imageList;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(videoPublishEditModel));
        c0lab.LJ("enter_from", "video_edit_page");
        int size = 0;
        c0lab.LIZ(0, "video_cnt");
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            size = imageList.size();
        }
        c0lab.LIZ(size, "pic_cnt");
        return c0lab;
    }

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        List<SingleImageData> imageList;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            Iterator<SingleImageData> it2 = imageList.iterator();
            while (it2.hasNext()) {
                ImageAdjustInfo adjustInfo = it2.next().getAdjustInfo();
                if (adjustInfo != null) {
                    Map<String, SingleAdjustInfo> adjustMap = adjustInfo.getAdjustMap();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, SingleAdjustInfo> entry : adjustMap.entrySet()) {
                        if (C1404000mdi.LIZLLL(entry.getValue().getIntensity(), entry.getKey())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    linkedHashSet.addAll(linkedHashMap.keySet());
                }
            }
        }
        c0lab.LJ("adjust_function_applied", C13LP.LJJLIIIJ(linkedHashSet, ",", null, null, 0, null, AFwS261S0000000_22.get$arr$(277), 30));
    }

    public static void LIZIZ(C0LAB c0lab, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            if (C1404000mdi.LIZLLL(((SingleAdjustInfo) entry.getValue()).getIntensity(), (String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        c0lab.LJ("adjust_function_applied", C13LP.LJJLIIIJ(linkedHashMap.keySet(), ",", null, null, 0, null, AFwS261S0000000_22.get$arr$(276), 30));
    }
}
