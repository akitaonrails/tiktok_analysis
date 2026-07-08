package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0FP9, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FP9 {
    public static JSONArray LIZJ(VideoPublishEditModel videoPublishEditModel) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        if (videoPublishEditModel.getImageAlbumData() == null) {
            return jSONArray;
        }
        int i = 0;
        if (C1416310mxZ.LJJLIIIJJIZ(videoPublishEditModel) && C1428470nHB.LJLIIL(videoPublishEditModel)) {
            for (SingleImageData singleImageData : videoPublishEditModel.getImageAlbumData().getImageList()) {
                if (singleImageData.getStickerInfoNewEngine() != null) {
                    JSONArray jSONArray2 = new JSONArray();
                    CopyOnWriteArrayList<TextStickerModel> textStickerModels = singleImageData.getStickerInfoNewEngine().getTextStickerModels();
                    Iterator<TextStickerModel> it2 = textStickerModels.iterator();
                    while (it2.hasNext()) {
                        jSONArray2.put(it2.next().getTextStr());
                    }
                    if (jSONArray2.length() > 0) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("index", i);
                        jSONObject.put("content", jSONArray2);
                        if (C0FM7.LIZ()) {
                            JSONArray jSONArray3 = new JSONArray();
                            Iterator<TextStickerModel> it3 = textStickerModels.iterator();
                            while (it3.hasNext()) {
                                jSONArray3.put(((double) Math.round((r2.getFontModel().fontSize * it3.next().getBaseStickerModel().getScale()) * 10.0f)) / 10.0d);
                            }
                            jSONObject.put("size_list", jSONArray3);
                        }
                        jSONArray.put(jSONObject);
                    }
                }
                i++;
            }
            return jSONArray;
        }
        for (SingleImageData singleImageData2 : videoPublishEditModel.getImageAlbumData().getImageList()) {
            JSONArray jSONArray4 = new JSONArray();
            for (StickerItemModel stickerItemModel : singleImageData2.getStickerInfo().getStickers()) {
                if (stickerItemModel.type == 2) {
                    jSONArray4.put(C123P.LJIIIIZZ(((TextStickerData) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), stickerItemModel.extra, TextStickerData.class)).getTextWrapList()));
                }
            }
            if (jSONArray4.length() > 0) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("index", i);
                jSONObject2.put("content", jSONArray4);
                List<StickerItemModel> stickers = singleImageData2.getStickerInfo().getStickers();
                if (C0FM7.LIZ()) {
                    JSONArray jSONArray5 = new JSONArray();
                    for (StickerItemModel stickerItemModel2 : stickers) {
                        if (stickerItemModel2.type == 2) {
                            jSONArray5.put(((double) Math.round((r2.getFontSize() * ((TextStickerData) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), stickerItemModel2.extra, TextStickerData.class)).getScale()) * 10.0f)) / 10.0d);
                        }
                    }
                    jSONObject2.put("size_list", jSONArray5);
                }
                jSONArray.put(jSONObject2);
            }
            i++;
        }
        return jSONArray;
    }

    public static List<String> LIZLLL(StickerItemModel stickerItemModel) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(C123P.LJIIIIZZ(((TextStickerData) C0CHQ.LIZ().getGson().LJII(stickerItemModel.extra, TextStickerData.class)).getTextWrapList()));
            return arrayList;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return arrayList;
        }
    }

    public static void LIZ(BaseShortVideoContext baseShortVideoContext, JSONArray jSONArray) {
        if (!(baseShortVideoContext instanceof VideoPublishEditModel)) {
            return;
        }
        JSONArray jSONArray2 = new JSONArray();
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
        if (videoPublishEditModel.isCommentReply()) {
            jSONArray2.put(videoPublishEditModel.getCommentVideoModel().getCommentMsg());
        }
        if (jSONArray2.length() > 0) {
            try {
                JSONObject jSONObjectPut = new JSONObject().put("data", jSONArray2);
                jSONObjectPut.put("type", 8);
                jSONArray.put(jSONObjectPut);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext r9, org.json.JSONArray r10) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FP9.LIZIZ(com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext, org.json.JSONArray):void");
    }
}
