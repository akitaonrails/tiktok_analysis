package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ThumbnailUtils;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.google.gson.l;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.addyours.model.AddYoursInfoStruct;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.edit.TTStoryUploadModel;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.SimpleTextStickerData;
import com.ss.android.ugc.aweme.sticker.data.CaptionStruct;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.TextStickerInfo;
import com.ss.android.ugc.aweme.sticker.data.VideoShareInfoStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import lth.o;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0nJ7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429670nJ7 {
    public final List<CreateAnchorInfo> LIZ = new ArrayList();
    public final Set<String> LIZIZ = new HashSet();

    public static String LJIILL() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("default");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(e3.e);
        sbLIZ.append(LJIIL(arrayList));
        sbLIZ.append(e3.f);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:701:0x12b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r20, java.util.LinkedHashMap<java.lang.String, java.lang.String> r21) {
        /*
            Method dump skipped, instruction units count: 5289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1429670nJ7.LIZJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.util.LinkedHashMap):void");
    }

    public static boolean LJIIJ(AVMusic aVMusic) {
        int previewStartTime = (int) (aVMusic.getPreviewStartTime() * 1000.0f);
        int i = aVMusic.clipShootDuration + previewStartTime;
        if (aVMusic.getMusicBeginTime() >= previewStartTime && aVMusic.getMusicEndTime() <= i) {
            return false;
        }
        return true;
    }

    public static Bitmap LJIIJJI(Bitmap bitmap) {
        int height;
        float f;
        Bitmap bitmapCreateBitmap = bitmap;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "publish_short_video_cover_compress", true) != 0 && bitmapCreateBitmap != null) {
            if (bitmapCreateBitmap.getWidth() > bitmapCreateBitmap.getHeight()) {
                if (bitmapCreateBitmap.getWidth() > 360.0f) {
                    height = bitmapCreateBitmap.getWidth();
                    f = 360.0f / height;
                }
                f = 1.0f;
            } else {
                if (bitmapCreateBitmap.getHeight() > 360.0f) {
                    height = bitmapCreateBitmap.getHeight();
                    f = 360.0f / height;
                }
                f = 1.0f;
            }
            Matrix matrix = new Matrix();
            matrix.postScale(f, f);
            bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
            Bitmap.Config config = bitmapCreateBitmap.getConfig();
            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
            if (config != config2) {
                Bitmap bitmapCopy = bitmapCreateBitmap.copy(config2, true);
                bitmapCreateBitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
                return bitmapCopy;
            }
        }
        return bitmapCreateBitmap;
    }

    public static String LJIIL(List list) {
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                sb.append("\"");
                sb.append((String) ListProtector.get(list, i));
                sb.append("\"");
            } else {
                sb.append(",\"");
                sb.append((String) ListProtector.get(list, i));
                sb.append("\"");
            }
        }
        return sb.toString();
    }

    public static boolean LJIILIIL(VideoPublishEditModel videoPublishEditModel) {
        if (!videoPublishEditModel.isStitchMode() && !videoPublishEditModel.isDuet() && !"single_song".equals(videoPublishEditModel.mShootWay) && !"prop_page".equals(videoPublishEditModel.mShootWay) && !"mv_page".equals(videoPublishEditModel.mShootWay) && !"click_internal_entrance".equals(videoPublishEditModel.mShootWay) && !"prop_reuse".equals(videoPublishEditModel.mShootWay) && !"mv_reuse".equals(videoPublishEditModel.mShootWay) && !"add_yours".equals(videoPublishEditModel.mShootWay)) {
            return false;
        }
        return true;
    }

    public static Bitmap LJIILJJIL(VideoPublishEditModel videoPublishEditModel) {
        String validVideoCoverPath;
        boolean z;
        int i;
        Bitmap.Config config;
        String videoPath = "";
        Bitmap bitmapLIZIZ = null;
        boolean z2 = false;
        if (C493401w4.LIZ()) {
            if (((Number) C0AEQ.LIZ.getValue()).intValue() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                String strLJII = C0MH8.LIZ.LJII(videoPublishEditModel, -1);
                if (strLJII == null || !C123100dR.LIZ(strLJII)) {
                    strLJII = "";
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("read cover bitmap: backupPath: ");
                sbLIZ.append("");
                sbLIZ.append(", type = ");
                sbLIZ.append(-1);
                sbLIZ.append(", stacktrace: ");
                sbLIZ.append(C13SZ.LIZIZ(new Throwable()));
                C0MH8.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(strLJII, options);
                options.inJustDecodeBounds = false;
                Pair pair = new Pair(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
                int iIntValue = ((Number) pair.getFirst()).intValue();
                int iIntValue2 = ((Number) pair.getSecond()).intValue();
                if (iIntValue <= 110 && iIntValue2 <= 90) {
                    i = 1;
                } else {
                    int i2 = iIntValue / 2;
                    int i3 = iIntValue2 / 2;
                    i = 1;
                    while (i2 / i >= 110 && i3 / i >= 90) {
                        i *= 2;
                    }
                }
                options.inSampleSize = i;
                if (((Number) C259340AEi.LIZ.getValue()).intValue() == 1) {
                    config = Bitmap.Config.ARGB_8888;
                } else {
                    config = Bitmap.Config.RGB_565;
                }
                options.inPreferredConfig = config;
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(strLJII, options);
                ConcurrentHashMap<String, List<C0MHA>> concurrentHashMap = C0MH8.LIZLLL.get(videoPublishEditModel.getCreationId());
                if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
                    z2 = true;
                }
                return (Bitmap) new Pair(bitmapDecodeFile, Boolean.valueOf(!z2)).getFirst();
            }
            return LJIIJJI((Bitmap) C0MH8.LIZ.LJIILIIL(-1, videoPublishEditModel, "").getFirst());
        }
        if (C1429320nIY.LIZJ(videoPublishEditModel)) {
            if (C1429320nIY.LIZJ(videoPublishEditModel)) {
                bitmapLIZIZ = C1443400nfG.LIZIZ(C1429320nIY.LIZIZ(videoPublishEditModel));
                CoverPublishModel coverPublishModel = videoPublishEditModel.creativeModel.coverPublishModel;
                if (coverPublishModel != null && bitmapLIZIZ != null) {
                    bitmapLIZIZ = coverPublishModel.getEffectTextModel().mergeCoverText(bitmapLIZIZ);
                }
            }
            return LJIIJJI(bitmapLIZIZ);
        }
        if (videoPublishEditModel.isCurrentAutoCutMode() && (validVideoCoverPath = videoPublishEditModel.getValidVideoCoverPath()) != null) {
            return BitmapFactory.decodeFile(validVideoCoverPath, C23034090u.LIZ(validVideoCoverPath));
        }
        if (C1428470nHB.LJJZZI(videoPublishEditModel) && !C1428470nHB.LJJJJLL(videoPublishEditModel)) {
            o.LJFF(C2216131BoR.LIZ());
            return LJIIJJI(C1444180ngW.LIZ(videoPublishEditModel).getFirst());
        }
        if (videoPublishEditModel.isMvThemeVideoType()) {
            String str = videoPublishEditModel.getMvCreateVideoData().videoCoverImgPath;
            if (C2354709Kn.LIZIZ(str)) {
                return BitmapFactory.decodeFile(str, C23034090u.LIZ(str));
            }
        }
        if (videoPublishEditModel.isMultiVideoEdit()) {
            String str2 = videoPublishEditModel.getMultiEditVideoRecordData().coverImagePath;
            if (C2354709Kn.LIZIZ(str2)) {
                return BitmapFactory.decodeFile(str2, C23034090u.LIZ(str2));
            }
        }
        String validVideoCoverPath2 = videoPublishEditModel.getValidVideoCoverPath();
        if (validVideoCoverPath2 != null) {
            return BitmapFactory.decodeFile(validVideoCoverPath2, C23034090u.LIZ(validVideoCoverPath2));
        }
        if (C1444940nhk.LJII(videoPublishEditModel.getCanvasVideoData())) {
            String str3 = (String) ListProtector.get(videoPublishEditModel.getCanvasVideoData().sourceInfo, 0);
            return C2471909mP.LIZLLL(str3, C23034090u.LIZ(str3));
        }
        if (videoPublishEditModel.getPreviewInfo() != null) {
            videoPath = ((EditVideoSegment) ListProtector.get(videoPublishEditModel.getPreviewInfo().getVideoList(), 0)).getVideoPath();
        }
        if (C1429730nJD.LIZIZ == null) {
            C1429730nJD.LIZIZ = new C1429730nJD();
        }
        C1429730nJD.LIZIZ.getClass();
        String strLJIIJ = C2471909mP.LJIIJ(C0CHQ.LIZ, videoPath);
        if (!C2286708xd.LIZJ(strLJIIJ)) {
            return null;
        }
        return ThumbnailUtils.extractThumbnail(ThumbnailUtils.createVideoThumbnail(strLJIIJ, 1), 90, 110, 2);
    }

    public static String LJIILLIIL(VideoPublishEditModel videoPublishEditModel) {
        AVUploadMiscInfoStruct uploadMiscInfoStruct = videoPublishEditModel.getUploadMiscInfoStruct();
        if (uploadMiscInfoStruct == null) {
            return "";
        }
        return uploadMiscInfoStruct.mvThemeId;
    }

    public static String LJIIZILJ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.getTextStickerDataList() != null && !videoPublishEditModel.getTextStickerDataList().isEmpty()) {
            C13M7 c13m7 = new C13M7();
            for (SimpleTextStickerData simpleTextStickerData : videoPublishEditModel.getTextStickerDataList()) {
                if (simpleTextStickerData.isCreatorVoice()) {
                    c13m7.add(simpleTextStickerData.getVoiceCreatorUserId());
                }
            }
            String strLJIIL = LJIIL(new ArrayList(c13m7));
            if (strLJIIL.isEmpty()) {
                return strLJIIL;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(e3.e);
            sbLIZ.append(strLJIIL);
            sbLIZ.append(e3.f);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return "";
    }

    public static String LJIJ(VideoPublishEditModel videoPublishEditModel) {
        String strLJIIL = LJIIL(videoPublishEditModel.creativeModel.voiceConversionModel.vcCreatorIDs);
        if (strLJIIL.isEmpty()) {
            return strLJIIL;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(e3.e);
        sbLIZ.append(strLJIIL);
        sbLIZ.append(e3.f);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJIJI(ArrayList arrayList) {
        if (arrayList == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            if (i == 0) {
                sb.append("\"");
                sb.append((String) ListProtector.get(arrayList, i));
                sb.append("\"");
            } else {
                sb.append(",\"");
                sb.append((String) ListProtector.get(arrayList, i));
                sb.append("\"");
            }
        }
        return sb.toString();
    }

    public static void LJIJJLI(List list) {
        if (C086I.LIZIZ(list)) {
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            CaptionStruct captionStruct = ((InteractStickerStruct) it2.next()).getCaptionStruct();
            if (captionStruct != null) {
                captionStruct.setVideoWidth(null);
                captionStruct.setMarginStart(null);
                captionStruct.setMarginTop(null);
                captionStruct.setMarginBottom(null);
            }
        }
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, LinkedHashMap linkedHashMap) {
        float videoCoverStartTm;
        if (videoPublishEditModel.isMvThemeVideoType()) {
            videoCoverStartTm = videoPublishEditModel.getMvCreateVideoData().videoCoverStartTime / 1000.0f;
        } else {
            videoCoverStartTm = videoPublishEditModel.getVideoCoverStartTm();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(videoCoverStartTm);
        sbLIZ.append("");
        linkedHashMap.put("cover_tsp", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJ(VideoPublishEditModel videoPublishEditModel, LinkedHashMap linkedHashMap) {
        String str;
        CanvasExtra canvasExtra;
        ForwardCanvasExtra forwardCanvasExtra;
        VideoShareInfoStruct videoShareInfoStruct;
        CanvasVideoData canvasVideoData = videoPublishEditModel.getCanvasVideoData();
        if (canvasVideoData != null && (canvasExtra = canvasVideoData.extra) != null && (forwardCanvasExtra = canvasExtra.forwardCanvasExtra) != null && (videoShareInfoStruct = forwardCanvasExtra.videoShareInfoStruct) != null) {
            str = videoShareInfoStruct.awemeId;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            linkedHashMap.put("shared_video_original_item_id", str);
        }
    }

    public static void LJFF(VideoPublishEditModel videoPublishEditModel, LinkedHashMap linkedHashMap) {
        if (C1444940nhk.LJII(videoPublishEditModel.getCanvasVideoData()) && !C1428470nHB.LLIIIL(videoPublishEditModel)) {
            linkedHashMap.put("image_content_type", String.valueOf(2));
        } else {
            if (!C1428470nHB.LJJZZI(videoPublishEditModel)) {
                return;
            }
            linkedHashMap.put("image_content_type", String.valueOf(4));
        }
    }

    public static void LJII(VideoPublishEditModel videoPublishEditModel, LinkedHashMap linkedHashMap) {
        TTStoryUploadModel ttStoryUploadModel = videoPublishEditModel.getTtStoryUploadModel();
        if (ttStoryUploadModel == null) {
            linkedHashMap.put("is_tiktok_story", CardStruct.IStatusCode.DEFAULT);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(ttStoryUploadModel.getContentType());
        sbLIZ.append("");
        linkedHashMap.put("data_source", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(ttStoryUploadModel.getIndex());
        sbLIZ2.append("");
        linkedHashMap.put("bulk_index", C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(ttStoryUploadModel.getTotalCount());
        sbLIZ3.append("");
        linkedHashMap.put("bulk_total", C2188811AlT.LIZIZ(sbLIZ3));
        linkedHashMap.put("story_type", C1428470nHB.LJJIIJZLJL(videoPublishEditModel));
        linkedHashMap.put("is_tiktok_story", "1");
        if (C1444940nhk.LJIIJ(videoPublishEditModel.getCanvasVideoData())) {
            linkedHashMap.put("share_story_post_type", "1");
        }
    }

    public static void LJIIIIZZ(VideoPublishEditModel videoPublishEditModel, LinkedHashMap linkedHashMap) {
        String summaryContent;
        if (C1428470nHB.LLIIIILZ(videoPublishEditModel) && C1428470nHB.LJJJIL(videoPublishEditModel)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("text_content", videoPublishEditModel.getCreativeModel().text2ImageModel.text);
                jSONObject.put("is_text2image", C1428470nHB.LJJLIIIJILLIZJL(videoPublishEditModel));
                int iLJJIJ = C1428470nHB.LJJIJ(videoPublishEditModel);
                if (iLJJIJ != -1) {
                    jSONObject.put("generated_text_post_position", iLJJIJ);
                }
                if (!TextUtils.isEmpty(videoPublishEditModel.getCreativeModel().text2ImageModel.searchQuery)) {
                    jSONObject.put("search_query", videoPublishEditModel.getCreativeModel().text2ImageModel.searchQuery);
                }
                String str = videoPublishEditModel.getCreativeModel().text2ImageModel.fromCommentId;
                boolean z = true;
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("is_comment2text", true);
                    jSONObject.put("comment_id", CastLongProtector.parseLong(str));
                    String str2 = videoPublishEditModel.getCreativeModel().text2ImageModel.fromAwemeId;
                    if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put("original_item_id", CastLongProtector.parseLong(str2));
                    }
                    String str3 = videoPublishEditModel.getCreativeModel().text2ImageModel.fromAuthorId;
                    if (!TextUtils.isEmpty(str3)) {
                        jSONObject.put("original_user_id", CastLongProtector.parseLong(str3));
                    }
                }
                TextImageTaskInfo textImageTaskInfoLIZJ = C572250McR.LIZJ(videoPublishEditModel.getCreativeModel().text2ImageModel);
                if (textImageTaskInfoLIZJ != null && textImageTaskInfoLIZJ.getType() != null && Objects.equals(textImageTaskInfoLIZJ.getType(), C0LIV.AI.getType())) {
                    jSONObject.put("ai_generated_image_style_id", (int) C572250McR.LJ(videoPublishEditModel.getCreativeModel().text2ImageModel));
                    jSONObject.put("is_ai_text_mode", true);
                }
                jSONObject.put("unique_creation_id", videoPublishEditModel.getCreativeModel().text2ImageModel.textKey);
                jSONObject.put("text_post_template_id", C572250McR.LJ(videoPublishEditModel.getCreativeModel().text2ImageModel));
                if (textImageTaskInfoLIZJ != null && textImageTaskInfoLIZJ.getHasCommentInfo() != null && textImageTaskInfoLIZJ.getHasCommentInfo().booleanValue()) {
                    if (videoPublishEditModel.getCreativeModel().text2ImageModel.commentSummary == null || videoPublishEditModel.getCreativeModel().text2ImageModel.commentSummary.getSummaryType() == null || videoPublishEditModel.getCreativeModel().text2ImageModel.commentSummary.getSummaryType().intValue() != EnumC558270Luz.AI_SUMMARY.getType()) {
                        z = false;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    if (videoPublishEditModel.getCreativeModel().text2ImageModel.commentSummary != null) {
                        summaryContent = videoPublishEditModel.getCreativeModel().text2ImageModel.commentSummary.getSummaryContent();
                    } else {
                        summaryContent = "";
                    }
                    jSONObject.put("is_ai_summary", boolValueOf);
                    jSONObject.put("comment_summary", summaryContent);
                }
                linkedHashMap.put("text_post_content", C786410Ut5.J3(jSONObject));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void LJIIIZ(VideoPublishEditModel videoPublishEditModel, LinkedHashMap linkedHashMap) {
        String text;
        C0MN4 c0mn4;
        Comment commentInfo;
        if (!C1428470nHB.LLIIIJ(videoPublishEditModel) && !C1428470nHB.LLIIIL(videoPublishEditModel)) {
            return;
        }
        if (videoPublishEditModel.getTtStoryUploadModel() != null) {
            linkedHashMap.put("story_type", "2");
        } else {
            linkedHashMap.put("aweme_type", "160");
        }
        if (C1444940nhk.LIZLLL(videoPublishEditModel.getCanvasVideoData())) {
            try {
                JSONObject jSONObject = new JSONObject();
                C0MND c0mnd = videoPublishEditModel.creativeModel.commentForwardModel;
                if (c0mnd == null || (c0mn4 = c0mnd.LIZJ) == null || (commentInfo = c0mn4.getCommentInfo()) == null || (text = commentInfo.getText()) == null) {
                    text = "";
                }
                jSONObject.put("text_content", text);
                linkedHashMap.put("text_post_content", C786410Ut5.J3(jSONObject));
                return;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            StickerItemModel firstTextSticker = videoPublishEditModel.getFirstTextSticker();
            if (firstTextSticker != null) {
                jSONObject2.put("text_content", ((TextStickerData) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), firstTextSticker.extra, TextStickerData.class)).getTextStr());
                if (((Boolean) C262810ARr.LIZ.getValue()).booleanValue()) {
                    videoPublishEditModel.getInfoStickerModel().stickers.remove(firstTextSticker);
                }
            }
            linkedHashMap.put("text_post_content", C786410Ut5.J3(jSONObject2));
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public static void LJIJJ(VideoPublishEditModel videoPublishEditModel, LinkedHashMap linkedHashMap) {
        List<AddYoursStickerModel> list = videoPublishEditModel.creativeModel.stickerModel.addYoursStickerModels;
        if (!list.isEmpty()) {
            AddYoursStickerModel addYoursStickerModel = (AddYoursStickerModel) ListProtector.get(list, 0);
            if (!(!Objects.equals(addYoursStickerModel.getTopicText(), addYoursStickerModel.getFollowTopicText())) && addYoursStickerModel.getSourceOfTrendsAddYoursInVideo() != null) {
                int iIntValue = addYoursStickerModel.getSourceOfTrendsAddYoursInVideo().intValue();
                if (iIntValue < 2) {
                    linkedHashMap.put("add_yours_info", GsonProtectorUtils.toJson(o.LJIJ.getRetrofitFactoryGson(), new AddYoursInfoStruct(2, addYoursStickerModel.getAddYoursEnterMethod())));
                    return;
                } else {
                    if (iIntValue > 3) {
                        return;
                    }
                    linkedHashMap.put("add_yours_info", GsonProtectorUtils.toJson(o.LJIJ.getRetrofitFactoryGson(), new AddYoursInfoStruct(3, addYoursStickerModel.getAddYoursEnterMethod())));
                    return;
                }
            }
            linkedHashMap.put("add_yours_info", GsonProtectorUtils.toJson(o.LJIJ.getRetrofitFactoryGson(), new AddYoursInfoStruct(null, addYoursStickerModel.getAddYoursEnterMethod())));
        }
    }

    public static void LJIL(VideoPublishEditModel videoPublishEditModel, Collection collection) {
        List<NormalTrackTimeStamp> list;
        if (videoPublishEditModel == null || C086I.LIZIZ(collection) || !C1428470nHB.LLIILZL(videoPublishEditModel)) {
            return;
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            InteractStickerStruct interactStickerStruct = (InteractStickerStruct) it2.next();
            try {
                list = (List) o.LJIJ.getRetrofitFactoryGson().LJIIIIZZ(interactStickerStruct.getTrackList(), new TypeToken<List<NormalTrackTimeStamp>>() { // from class: X.0nJB
                }.getType());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                list = null;
            }
            if (C0IKQ.LIZIZ(list)) {
                for (NormalTrackTimeStamp normalTrackTimeStamp : list) {
                    if (normalTrackTimeStamp != null) {
                        float[] fArrLIZ = C1429750nJF.LIZ(normalTrackTimeStamp.getX(), normalTrackTimeStamp.getY(), videoPublishEditModel.getVideoCanvasWidth(), videoPublishEditModel.getVideoCanvasHeight(), videoPublishEditModel.getOutVideoWidth(), videoPublishEditModel.getOutVideoHeight());
                        normalTrackTimeStamp.setX(AbstractC568770MSl.LIZ(fArrLIZ[0]));
                        normalTrackTimeStamp.setY(AbstractC568770MSl.LIZ(fArrLIZ[1]));
                    }
                }
                try {
                    interactStickerStruct.setTrackList(GsonProtectorUtils.toJson(o.LIZIZ, list));
                } catch (l e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
    }

    public static void LJJ(List list, VideoPublishEditModel videoPublishEditModel) {
        C201955140j.LIZ("ShortVideoFutureDelegate -> processInlineCaption");
        if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                InteractStickerStruct interactStickerStruct = (InteractStickerStruct) it2.next();
                if (interactStickerStruct.getType() == 20 && interactStickerStruct.getCaptionStruct() != null) {
                    C201955140j.LIZ("ShortVideoFutureDelegate -> processInlineCaption -> captionStruct is not null");
                    CaptionStruct captionStruct = interactStickerStruct.getCaptionStruct();
                    if (!C289240BVi.LIZ(videoPublishEditModel)) {
                        captionStruct.setAudioUri(videoPublishEditModel.creativeModel.inlineCaptionModel.audioUri);
                        captionStruct.setSrcLanguage(videoPublishEditModel.creativeModel.inlineCaptionModel.selectLanguageCode);
                        captionStruct.setTaskId(videoPublishEditModel.creativeModel.inlineCaptionModel.taskId);
                    }
                    interactStickerStruct.setCaptionStruct(captionStruct);
                    return;
                }
            }
        }
    }

    public static void LJJI(List list, VideoPublishEditModel videoPublishEditModel) {
        if (!C086I.LIZIZ(list) && C1428470nHB.LLIIIJ(videoPublishEditModel)) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((InteractStickerStruct) it2.next()).getType() == 18) {
                    it2.remove();
                }
            }
        }
    }

    public static void LJJIFFI(VideoPublishEditModel videoPublishEditModel, Collection collection) {
        boolean z;
        float[] fArr;
        if (!collection.isEmpty()) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                InteractStickerStruct interactStickerStruct = (InteractStickerStruct) it2.next();
                if (interactStickerStruct.getType() == 18 && interactStickerStruct.getTextInfo() != null) {
                    TextStickerInfo textInfo = interactStickerStruct.getTextInfo();
                    float f = textInfo.srcWidth;
                    float f2 = textInfo.srcHeight;
                    int videoCanvasWidth = videoPublishEditModel.getVideoCanvasWidth();
                    int videoCanvasHeight = videoPublishEditModel.getVideoCanvasHeight();
                    float outVideoWidth = videoPublishEditModel.getOutVideoWidth();
                    float f3 = videoCanvasWidth;
                    float f4 = (outVideoWidth * 1.0f) / f3;
                    float outVideoHeight = videoPublishEditModel.getOutVideoHeight();
                    float f5 = videoCanvasHeight;
                    float f6 = (1.0f * outVideoHeight) / f5;
                    if (f4 == f6) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        fArr = new float[]{f, f2};
                    } else {
                        float fMax = Math.max(f4, f6);
                        if (fMax == f4) {
                            f2 = ((f2 * f5) * fMax) / outVideoHeight;
                        } else {
                            f = ((f * f3) * fMax) / outVideoWidth;
                        }
                        fArr = new float[]{f, f2};
                    }
                    interactStickerStruct.setTextInfo(new TextStickerInfo(textInfo.bgColor, textInfo.textColor, textInfo.srcLanguage, AbstractC568770MSl.LIZ(fArr[0]), AbstractC568770MSl.LIZ(fArr[1]), textInfo.textSize, textInfo.alignment));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r8, java.util.LinkedHashMap<java.lang.String, java.lang.String> r9) {
        /*
            Method dump skipped, instruction units count: 1005
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1429670nJ7.LIZLLL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.util.LinkedHashMap):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r20, java.util.LinkedHashMap<java.lang.String, java.lang.String> r21, com.google.gson.Gson r22) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1429670nJ7.LJI(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.util.LinkedHashMap, com.google.gson.Gson):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0799  */
    /* JADX WARN: Type inference failed for: r2v6, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.0nJ9] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, org.json.JSONObject] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r13, com.ss.android.ugc.aweme.shortvideo.SynthetiseResult r14, java.util.LinkedHashMap<java.lang.String, java.lang.String> r15) {
        /*
            Method dump skipped, instruction units count: 1988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1429670nJ7.LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.ss.android.ugc.aweme.shortvideo.SynthetiseResult, java.util.LinkedHashMap):void");
    }
}
