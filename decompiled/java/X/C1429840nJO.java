package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0nJO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429840nJO {
    public static final C1429840nJO LIZ = new C1429840nJO();

    public static List LIZ(VideoPublishEditModel videoPublishEditModel) {
        List<SingleImageData> imageList;
        TextImageTaskInfo textImageTaskInfoLIZJ;
        String trackList;
        List<StickerModel> allStickers;
        ImageStickerInfoNewEngine stickerInfoNewEngine;
        CopyOnWriteArrayList<TextStickerModel> textStickerModels;
        ImageStickerInfoNewEngine stickerInfoNewEngine2;
        List<StickerModel> allStickers2;
        ArrayList arrayList = new ArrayList();
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (stickerInfoNewEngine2 = imageAlbumData.getStickerInfoNewEngine()) != null && (allStickers2 = stickerInfoNewEngine2.getAllStickers()) != null) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(allStickers2, 10));
            Iterator<StickerModel> it2 = allStickers2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().getInteractStickerStruct());
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (((InteractStickerStruct) obj).getType() != 0) {
                    arrayList3.add(obj);
                }
            }
            arrayList.addAll(arrayList3);
        }
        ImageAlbumData imageAlbumData2 = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData2 != null && (imageList = imageAlbumData2.getImageList()) != null) {
            int i = 0;
            for (SingleImageData singleImageData : imageList) {
                int i2 = i + 1;
                String trackList2 = null;
                if (i >= 0) {
                    SingleImageData singleImageData2 = singleImageData;
                    if (((Boolean) C278960AwY.LIZ.getValue()).booleanValue()) {
                        C1453810nw3.LIZ.getClass();
                        if (C1453810nw3.LIZ(videoPublishEditModel) && (stickerInfoNewEngine = singleImageData2.getStickerInfoNewEngine()) != null && (textStickerModels = stickerInfoNewEngine.getTextStickerModels()) != null) {
                            List<InteractStickerStruct> listLIZ = C0FMY.LIZ(textStickerModels);
                            Iterator it3 = ((ArrayList) listLIZ).iterator();
                            while (it3.hasNext()) {
                                ((InteractStickerStruct) it3.next()).setMaterialIndex(i);
                            }
                            arrayList.addAll(listLIZ);
                        }
                    }
                    ImageStickerInfoNewEngine stickerInfoNewEngine3 = singleImageData2.getStickerInfoNewEngine();
                    if (stickerInfoNewEngine3 != null && (allStickers = stickerInfoNewEngine3.getAllStickers()) != null) {
                        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(allStickers, 10));
                        Iterator<StickerModel> it4 = allStickers.iterator();
                        while (it4.hasNext()) {
                            InteractStickerStruct interactStickerStruct = it4.next().getInteractStickerStruct();
                            interactStickerStruct.setMaterialIndex(i);
                            arrayList4.add(interactStickerStruct);
                        }
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj2 : arrayList4) {
                            if (((InteractStickerStruct) obj2).getType() != 0) {
                                arrayList5.add(obj2);
                            }
                        }
                        arrayList.addAll(arrayList5);
                    }
                    LIZ.getClass();
                    if (singleImageData2.isText2Image() && (textImageTaskInfoLIZJ = C572250McR.LIZJ(videoPublishEditModel.creativeModel.text2ImageModel)) != null && (trackList = textImageTaskInfoLIZJ.getTrackList()) != null && trackList.length() > 0) {
                        InteractStickerStruct interactStickerStruct2 = new InteractStickerStruct();
                        interactStickerStruct2.setType(116);
                        interactStickerStruct2.setMaterialIndex(i);
                        interactStickerStruct2.setNoGlobal(true);
                        TextImageTaskInfo textImageTaskInfoLIZJ2 = C572250McR.LIZJ(videoPublishEditModel.creativeModel.text2ImageModel);
                        if (textImageTaskInfoLIZJ2 != null) {
                            trackList2 = textImageTaskInfoLIZJ2.getTrackList();
                        }
                        interactStickerStruct2.setTrackList(trackList2);
                        Gson gsonLIZ = C19598511m3.LIZ();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("original_user_id", videoPublishEditModel.creativeModel.text2ImageModel.fromAuthorId);
                        linkedHashMap.put("original_item_id", videoPublishEditModel.creativeModel.text2ImageModel.fromAwemeId);
                        interactStickerStruct2.setAttr(GsonProtectorUtils.toJson(gsonLIZ, linkedHashMap));
                        arrayList.add(interactStickerStruct2);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return arrayList;
    }
}
