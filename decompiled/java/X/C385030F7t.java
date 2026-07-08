package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.ForegroundColorStyle;
import com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyleData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TypefaceStyle;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F7t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C385030F7t {
    public static final List<TextStickerData> LIZ(VideoPublishEditModel videoPublishEditModel) {
        List<SingleImageData> imageList;
        RandomAccess textStickerModels;
        if (C1428470nHB.LJJZZI(videoPublishEditModel) && !C1428470nHB.LJJJJLL(videoPublishEditModel)) {
            ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
            if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
                if (C1416310mxZ.LJJLIIIJJIZ(videoPublishEditModel)) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(imageList, 10));
                    Iterator<SingleImageData> it2 = imageList.iterator();
                    while (it2.hasNext()) {
                        ImageStickerInfoNewEngine stickerInfoNewEngine = it2.next().getStickerInfoNewEngine();
                        if (stickerInfoNewEngine == null || (textStickerModels = stickerInfoNewEngine.getTextStickerModels()) == null) {
                            textStickerModels = C13BV.INSTANCE;
                        }
                        arrayList.add(textStickerModels);
                    }
                    List listLJIJJLI = C15438062q.LJIJJLI(arrayList);
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJIJJLI, 10));
                    Iterator it3 = listLJIJJLI.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(C0F7U.LIZJ((TextStickerModel) it3.next()));
                    }
                    return arrayList2;
                }
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(imageList, 10));
                Iterator<SingleImageData> it4 = imageList.iterator();
                while (it4.hasNext()) {
                    List<StickerItemModel> stickers = it4.next().getStickerInfo().getStickers();
                    ArrayList arrayList4 = new ArrayList();
                    for (StickerItemModel stickerItemModel : stickers) {
                        if (stickerItemModel.type == 2) {
                            arrayList4.add(stickerItemModel);
                        }
                    }
                    arrayList3.add(arrayList4);
                }
                List listLJIJJLI2 = C15438062q.LJIJJLI(arrayList3);
                ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(listLJIJJLI2, 10));
                Iterator it5 = listLJIJJLI2.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), ((StickerItemModel) it5.next()).extra, TextStickerData.class));
                }
                return arrayList5;
            }
            return C13BV.INSTANCE;
        }
        return C0F7U.LJI(videoPublishEditModel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v11, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v6, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.List] */
    public static final void LIZIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        ?? arrayList;
        List<SingleImageData> imageList;
        Iterable textStickerModels;
        C1462560oAA.LIZIZ(videoPublishEditModel, c0lab);
        C1462560oAA.LIZJ(videoPublishEditModel, c0lab);
        List<TextStickerData> listLIZ = LIZ(videoPublishEditModel);
        ArrayList arrayList2 = new ArrayList();
        for (TextStickerData textStickerData : listLIZ) {
            if (Intrinsics.LJFF(textStickerData.getType(), "type_text_sticker")) {
                arrayList2.add(textStickerData);
            }
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (true) {
            String str = "";
            if (!it2.hasNext()) {
                break;
            }
            String textStr = ((TextStickerData) it2.next()).getTextStr();
            if (textStr != null) {
                str = textStr;
            }
            arrayList3.add(str);
        }
        c0lab.LIZ(arrayList3.size(), "text_sticker_cnt");
        Iterator it3 = arrayList3.iterator();
        int iLIZ = 0;
        while (it3.hasNext()) {
            iLIZ += C2257731DYl.LIZ((String) it3.next());
        }
        c0lab.LIZ(iLIZ, "text_sticker_length");
        if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
            if (!C1428470nHB.LJJZZI(videoPublishEditModel)) {
                arrayList = C13BV.INSTANCE;
            } else {
                try {
                    ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
                    if (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null) {
                        imageList = C13BV.INSTANCE;
                    }
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (C1428470nHB.LJJJJLL(videoPublishEditModel)) {
                    arrayList = C0F7U.LJI(videoPublishEditModel);
                } else {
                    SingleImageData singleImageData = (SingleImageData) C13LP.LJJJLZIJ(0, imageList);
                    if (singleImageData != null) {
                        if (C1416310mxZ.LJJLIIIJJIZ(videoPublishEditModel)) {
                            ImageStickerInfoNewEngine stickerInfoNewEngine = singleImageData.getStickerInfoNewEngine();
                            if (stickerInfoNewEngine == null || (textStickerModels = stickerInfoNewEngine.getTextStickerModels()) == null) {
                                textStickerModels = C13BV.INSTANCE;
                            }
                            arrayList = new ArrayList(C15438062q.LJIJJ(textStickerModels, 10));
                            Iterator it4 = textStickerModels.iterator();
                            while (it4.hasNext()) {
                                arrayList.add(C0F7U.LIZJ((TextStickerModel) it4.next()));
                            }
                        } else {
                            List<StickerItemModel> stickers = singleImageData.getStickerInfo().getStickers();
                            ArrayList arrayList4 = new ArrayList();
                            for (StickerItemModel stickerItemModel : stickers) {
                                if (stickerItemModel.type == 2) {
                                    arrayList4.add(stickerItemModel);
                                }
                            }
                            arrayList = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
                            Iterator it5 = arrayList4.iterator();
                            while (it5.hasNext()) {
                                arrayList.add(GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), ((StickerItemModel) it5.next()).extra, TextStickerData.class));
                            }
                        }
                    } else {
                        arrayList = C13BV.INSTANCE;
                    }
                }
            }
            ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                String textStr2 = ((TextStickerData) it6.next()).getTextStr();
                if (textStr2 == null) {
                    textStr2 = "";
                }
                arrayList5.add(textStr2);
            }
            Iterator it7 = arrayList5.iterator();
            int iLIZ2 = 0;
            while (it7.hasNext()) {
                iLIZ2 += C2257731DYl.LIZ((String) it7.next());
            }
            c0lab.LIZ(iLIZ2, "cover_text_sticker_length");
        }
        if (listLIZ.isEmpty() || listLIZ.isEmpty()) {
            return;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (TextStickerData textStickerData2 : listLIZ) {
            if (!textStickerData2.getInlineTextStyles().isEmpty()) {
                List<InlineRichTextStyleData> inlineTextStyles = textStickerData2.getInlineTextStyles();
                if (i == 0) {
                    if ((inlineTextStyles instanceof Collection) && inlineTextStyles.isEmpty()) {
                        i = 0;
                    } else {
                        Iterator<InlineRichTextStyleData> it8 = inlineTextStyles.iterator();
                        while (it8.hasNext()) {
                            if (it8.next().inlineStyle instanceof TypefaceStyle) {
                                i = 1;
                                break;
                            }
                        }
                        i = 0;
                    }
                }
                if (i2 == 0) {
                    if ((inlineTextStyles instanceof Collection) && inlineTextStyles.isEmpty()) {
                        i2 = 0;
                    } else {
                        Iterator<InlineRichTextStyleData> it9 = inlineTextStyles.iterator();
                        while (it9.hasNext()) {
                            if (it9.next().inlineStyle instanceof ForegroundColorStyle) {
                                i2 = 1;
                                break;
                            }
                        }
                        i2 = 0;
                    }
                }
            }
            if (i4 == 0 && textStickerData2.isAdjustTextRollbar()) {
                i4 = 1;
            }
            if (i3 == 0 && textStickerData2.isUseColorDropper()) {
                i3 = 1;
            }
        }
        c0lab.LIZ(i ^ 1, "is_text_font_select_all");
        c0lab.LIZ(i2 ^ 1, "is_text_color_select_all");
        c0lab.LIZ(i3, "is_use_text_color_dropper");
        c0lab.LIZ(i4, "is_adjust_text_roll_bar");
    }
}
