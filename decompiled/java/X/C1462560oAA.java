package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.hashtag.HashTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextHashtagModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0oAA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1462560oAA {
    public static final Gson LIZ = ((IFoundationAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getNetworkService().getRetrofitFactoryGson();

    public static final Pair<String, ArrayList<String>> LJFF(List<? extends StickerModel> list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        int type = ((StickerModel) C13LP.LJJJJZI(list)).getStickerType().getType();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((StickerModel) it2.next()).getBaseModel().getLocationInfo());
        }
        return new Pair<>(String.valueOf(type), arrayList2);
    }

    public static final int LJI(VideoPublishEditModel videoPublishEditModel) {
        int size;
        if (!videoPublishEditModel.creativeModel.stickerModel.mentionStickerModel.isEmpty()) {
            size = videoPublishEditModel.creativeModel.stickerModel.mentionStickerModel.size();
        } else {
            List<InteractStickerStruct> listLJI = C1429860nJQ.LJI(videoPublishEditModel.getMainBusinessContext(), 8, EnumC1428480nHC.TRACK_PAGE_EDIT);
            if (listLJI != null) {
                size = listLJI.size();
            } else {
                size = 0;
            }
        }
        List<TextStickerModel> list = videoPublishEditModel.creativeModel.stickerModel.textStickerModels;
        ArrayList arrayList = new ArrayList();
        for (TextStickerModel textStickerModel : list) {
            if (textStickerModel.getMentionList() != null && (!r0.isEmpty())) {
                arrayList.add(textStickerModel);
            }
        }
        return size + arrayList.size();
    }

    public static final String LJII(List<String> list) {
        if (list == null) {
            return "giphy";
        }
        if (list.contains("pollsticker")) {
            return "poll";
        }
        if (list.contains("mention")) {
            return "mention";
        }
        if (list.contains("hashtag")) {
            return "hashtag";
        }
        if (list.contains("donation")) {
            return "donation";
        }
        if (list.contains("location")) {
            return "poi";
        }
        if (list.contains("addyours")) {
            return "add_yours";
        }
        if (list.contains("musicsticker")) {
            return "music";
        }
        if (list.contains("emojislidersticker")) {
            return "emoji_slider";
        }
        if (list.contains("linksticker")) {
            return "link_sticker";
        }
        if (list.contains("articlesticker")) {
            return "article_link";
        }
        if (list.contains("interactiveemoji")) {
            return "interactive_emoji";
        }
        if (list.contains("CountdownSticker")) {
            return "live";
        }
        if (list.contains("emoji")) {
            return "emoji";
        }
        if (!list.contains("UploadImageSticker") && !list.contains("custom_sticker_uploaded") && !list.contains("custom_sticker_from_panel")) {
            if (list.contains("im_sticker")) {
                return "im_sticker";
            }
            if (list.contains("set_sticker")) {
                return "sticker_set";
            }
            if (list.contains("tenor") || list.contains("gif")) {
                return "tenor";
            }
            if (list.contains("secretreplies")) {
                return "secret_replies";
            }
            if (list.contains("socialavatar")) {
                return "social_avatar";
            }
            if (list.contains("dm_group_chat")) {
                return "dm_group_chat";
            }
            if (list.contains("lyricssticker")) {
                return "add_lyrics";
            }
            return "inhouse";
        }
        return "diy";
    }

    public static final boolean LJIIJ(StickerItemModel stickerItemModel) {
        if (stickerItemModel.type == 2 && Intrinsics.LJFF(((TextStickerData) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), stickerItemModel.extra, TextStickerData.class)).getType(), "type_inline_caption")) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:186:0x0473  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r14, X.C0LAB r15) {
        /*
            Method dump skipped, instruction units count: 1401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1462560oAA.LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.0LAB):void");
    }

    public static final void LIZJ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        int size;
        c0lab.LIZ(LJI(videoPublishEditModel), "at_prop_cnt");
        String strLIZIZ = "";
        for (HashTagStickerModel hashTagStickerModel : videoPublishEditModel.creativeModel.stickerModel.hashtagStickerModel) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(hashTagStickerModel.getHashtagName());
            sbLIZ.append(',');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        Iterator<TextStickerModel> it2 = videoPublishEditModel.creativeModel.stickerModel.textStickerModels.iterator();
        while (it2.hasNext()) {
            List<TextHashtagModel> hashtagList = it2.next().getHashtagList();
            if (hashtagList != null) {
                for (TextHashtagModel textHashtagModel : hashtagList) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZIZ);
                    sbLIZ2.append(textHashtagModel.getText());
                    sbLIZ2.append(',');
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
            }
        }
        c0lab.LJ("under_edit_text_hashtag", strLIZIZ);
        if (!videoPublishEditModel.creativeModel.stickerModel.hashtagStickerModel.isEmpty()) {
            size = videoPublishEditModel.creativeModel.stickerModel.hashtagStickerModel.size();
        } else {
            List<InteractStickerStruct> listLJI = C1429860nJQ.LJI(videoPublishEditModel.getMainBusinessContext(), 9, EnumC1428480nHC.TRACK_PAGE_EDIT);
            if (listLJI != null) {
                size = listLJI.size();
            } else {
                size = 0;
            }
        }
        List<TextStickerModel> list = videoPublishEditModel.creativeModel.stickerModel.textStickerModels;
        ArrayList arrayList = new ArrayList();
        for (TextStickerModel textStickerModel : list) {
            if (textStickerModel.getHashtagList() != null && (!r0.isEmpty())) {
                arrayList.add(textStickerModel);
            }
        }
        c0lab.LIZ(size + arrayList.size(), "tag_prop_cnt");
    }

    public static final void LIZLLL(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        TextStickerModel textStickerModel;
        TextStickerModel next;
        int i;
        int i2;
        String string;
        String str;
        List<TextStickerModel> listLJIIIZ = C1428470nHB.LJIIIZ(videoPublishEditModel);
        Iterator<TextStickerModel> it2 = listLJIIIZ.iterator();
        while (true) {
            textStickerModel = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getCompatModel().isUsedPovTheme()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Iterator<TextStickerModel> it3 = listLJIIIZ.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            TextStickerModel next2 = it3.next();
            C1421430n5p c1421430n5p = C1421430n5p.LIZ;
            String textStr = next2.getTextStr();
            c1421430n5p.getClass();
            if (new Regex("(?i)(?<![a-zA-Z])pov(?![a-zA-Z])").containsMatchIn(textStr)) {
                textStickerModel = next2;
                break;
            }
        }
        if (next != null) {
            i = 1;
        } else {
            i = 0;
        }
        c0lab.LIZ(i, "add_edit_page_pov");
        if (textStickerModel != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c0lab.LIZ(i2, "text_has_pov");
        ArrayList arrayList = new ArrayList();
        Iterator<TextStickerModel> it4 = listLJIIIZ.iterator();
        while (it4.hasNext()) {
            C1421350n5h c1421350n5hLIZ = C1421620n68.LIZ(it4.next().getTextStr());
            if (c1421350n5hLIZ == null || (str = c1421350n5hLIZ.LIZJ) == null || (string = a0.LJLIIIL(str).toString()) == null) {
                string = "";
            }
            if (string.length() > 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("POV: ");
                sbLIZ.append(string);
                arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        c0lab.LJ("pov_text", GsonProtectorUtils.toJson(LIZ, arrayList));
    }

    public static final boolean LJ(StickerItemModel stickerItemModel, Boolean bool) {
        if (!Intrinsics.LJFF(stickerItemModel.stickerSource, "2") && !Intrinsics.LJFF(stickerItemModel.stickerSource, "1")) {
            return false;
        }
        if (bool != null && bool.booleanValue() != stickerItemModel.isFromEditorPro()) {
            return false;
        }
        return true;
    }

    public static final String LJIIIIZZ(String str, List list) {
        if (Intrinsics.LJFF(str, "search")) {
            if (list == null) {
                return "info";
            }
        } else {
            if (list != null) {
            }
            return "info";
        }
        Iterator<String> it2 = C1462570oAB.LIZ.iterator();
        while (it2.hasNext()) {
            if (list.contains(it2.next())) {
                return "interactive";
            }
        }
        return "info";
    }

    public static final int LJIIIZ(VideoPublishEditModel videoPublishEditModel, Boolean bool) {
        List<StickerItemModel> list;
        InfoStickerModel infoStickerModel = videoPublishEditModel.getInfoStickerModel();
        if (infoStickerModel == null || (list = infoStickerModel.stickers) == null) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        for (StickerItemModel stickerItemModel : list) {
            StickerItemModel stickerItemModel2 = stickerItemModel;
            if (LJ(stickerItemModel2, bool) && !stickerItemModel2.isTextSticker()) {
                arrayList.add(stickerItemModel);
            }
        }
        return arrayList.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x021c, code lost:
    
        r2 = r6.liveEventCountDownStickerModel.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0226, code lost:
    
        if (r2.hasNext() == false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0228, code lost:
    
        r1 = r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0237, code lost:
    
        if (X.C385630FAb.LIZIZ(r1.getBaseStickerModel()) == false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0239, code lost:
    
        if (r1 == null) goto L112;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJIIJJI(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r14, java.lang.Boolean r15) {
        /*
            Method dump skipped, instruction units count: 1062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1462560oAA.LJIIJJI(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.lang.Boolean):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJIIL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5, java.lang.Boolean r6) {
        /*
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r5.creativeModel
            com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel r0 = r0.stickerModel
            int r0 = X.C1466090oFr.LJIILIIL(r0, r6)
            r4 = 1
            r3 = 0
            java.lang.String r2 = ""
            if (r0 > 0) goto L1f
            X.11mo r0 = com.ss.android.ugc.aweme.ogc.news.sticker.IArticleStickerService.Companion
            r0.getClass()
            X.11py r0 = X.C19603211mo.LIZ()
            if (r0 == 0) goto L2f
            boolean r0 = r0.LJFF(r5)
            if (r0 != r4) goto L2f
        L1f:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r2)
            java.lang.String r0 = "interactive,"
            r1.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
        L2f:
            int r0 = LJIIIZ(r5, r6)
            if (r0 <= 0) goto L45
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r2)
            java.lang.String r0 = "info,"
            r1.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
        L45:
            java.lang.String r0 = ","
            boolean r0 = kotlin.text.u.LJIIZILJ(r2, r0, r3)
            if (r0 == 0) goto L56
            int r0 = r2.length()
            int r0 = r0 - r4
            java.lang.String r2 = r2.substring(r3, r0)
        L56:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1462560oAA.LJIIL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.lang.Boolean):java.lang.String");
    }

    public static final void LIZ(String str, String str2, Map map) {
        if (!map.containsKey(str)) {
            map.put(str, str2);
            return;
        }
        String str3 = (String) ((LinkedHashMap) map).get(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str3);
        sbLIZ.append(',');
        sbLIZ.append(str2);
        map.put(str, C2188811AlT.LIZIZ(sbLIZ));
    }
}
