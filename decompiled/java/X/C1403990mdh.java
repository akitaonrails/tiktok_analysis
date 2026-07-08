package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSelectItem;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mdh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403990mdh {
    public static final C1403990mdh LIZ = new C1403990mdh();

    public static List LIZ(List list) {
        List<String> containFormatList;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AIGCInfo aIGCInfo = (AIGCInfo) it2.next();
            if (aIGCInfo != null && (containFormatList = aIGCInfo.getContainFormatList()) != null) {
                linkedHashSet.addAll(containFormatList);
            }
        }
        return new ArrayList(linkedHashSet);
    }

    public static List LIZIZ(VideoPublishEditModel videoPublishEditModel, String str) {
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        SingleImageData singleImageData;
        AIGCInfo aigcInfo;
        ImageAlbumData imageAlbumData2;
        List<SingleImageData> imageList2;
        SingleImageData singleImageData2;
        AIGCInfo aigcInfo2;
        ArrayList arrayList = new ArrayList();
        if (Intrinsics.LJFF(str, "choose_photo")) {
            ArrayList arrayList2 = new ArrayList();
            List<ImageSelectItem> list = videoPublishEditModel.creativeModel.editSaveLocalModel.selectedImagesList;
            if (list != null) {
                int i = 0;
                for (ImageSelectItem imageSelectItem : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        if (imageSelectItem.isSelected && (imageAlbumData2 = videoPublishEditModel.getImageAlbumData()) != null && (imageList2 = imageAlbumData2.getImageList()) != null && (singleImageData2 = (SingleImageData) ListProtector.get(imageList2, i)) != null && (aigcInfo2 = singleImageData2.getAigcInfo()) != null) {
                            arrayList2.add(aigcInfo2);
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            return LIZ(arrayList2);
        }
        if (Intrinsics.LJFF(str, "current_photo")) {
            int i3 = videoPublishEditModel.creativeModel.editSaveLocalModel.imageModeSelectedItem;
            if (i3 != -1 && (imageAlbumData = videoPublishEditModel.getImageAlbumData()) != null && (imageList = imageAlbumData.getImageList()) != null && (singleImageData = (SingleImageData) ListProtector.get(imageList, i3)) != null && (aigcInfo = singleImageData.getAigcInfo()) != null) {
                C1403990mdh c1403990mdh = LIZ;
                List listSingletonList = Collections.singletonList(aigcInfo);
                c1403990mdh.getClass();
                return LIZ(listSingletonList);
            }
            return arrayList;
        }
        return videoPublishEditModel.creativeModel.commonMobModel.c2paFormatList;
    }

    public static void LIZJ(List list, JSONObject jSONObject) {
        String strOptString;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("manifests");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
        while (itKeys.hasNext()) {
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(itKeys.next());
            if (jSONObjectOptJSONObject2 != null && (strOptString = jSONObjectOptJSONObject2.optString("format")) != null) {
                if (a0.LJJIIZI(strOptString, "audio", false)) {
                    list.add("audio");
                }
                if (a0.LJJIIZI(strOptString, "image", false)) {
                    list.add("image");
                }
                if (a0.LJJIIZI(strOptString, "video", false)) {
                    list.add("video");
                }
            }
        }
    }

    public static void LIZLLL(boolean z, boolean z2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJ(Boolean.valueOf(z), "plugin_installed");
        c2344009Gk.LJ(Boolean.valueOf(z2), "sdk_initialized");
        C20684815ws.LJIILLIIL("read_write_c2pa_sdk_status", c2344009Gk.LIZ);
    }
}
