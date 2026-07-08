package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoEffectSPtr;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionModel;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.creative.model.magic.MagicCombineEffectModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0EMy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C363500EMy {
    public static final C363500EMy LIZ = new C363500EMy();
    public static C1438850nXv LIZIZ;
    public static C348100Dkm LIZJ;
    public static String LIZLLL;
    public static NLEModel LJ;
    public static AVMusic LJFF;
    public static boolean LJI;
    public static String LJII;
    public static C1459930o5v LJIIIIZZ;
    public static boolean LJIIIZ;
    public static boolean LJIIJ;
    public static boolean LJIIJJI;
    public static String LJIIL;
    public static String LJIILIIL;
    public static boolean LJIILJJIL;
    public static Long LJIILL;

    static {
        C1446930nkx.LJ(AFwS234S0000000_5.get$arr$(470));
        C1446930nkx.LIZJ(AFwS234S0000000_5.get$arr$(471));
        C1446930nkx.LIZLLL(AFwS234S0000000_5.get$arr$(472));
        C1446930nkx.LIZLLL(AFwS234S0000000_5.get$arr$(473));
        LJII = "";
    }

    public static int LJFF(NLEModel nLEModel) {
        C362740EKa.LIZ.getClass();
        if (nLEModel == null) {
            return 0;
        }
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (nLETrack2.getMainTrack() || C351220Dpo.LLLIIL(nLETrack2) || C351220Dpo.LLILL(nLETrack2)) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (C351220Dpo.LJJLL((NLETrackSlot) obj) != null) {
                arrayList3.add(obj);
            }
        }
        return arrayList3.size();
    }

    public static boolean LJI(VideoPublishEditModel videoPublishEditModel) {
        ArrayList<TimeSpeedModelExtension> arrayList;
        MultiEditVideoStatusRecordData multiEditVideoRecordData = videoPublishEditModel.getMultiEditVideoRecordData();
        if (multiEditVideoRecordData != null && (arrayList = multiEditVideoRecordData.editSegments) != null) {
            Iterator<TimeSpeedModelExtension> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (it2.next().getBackgroundVideo() != null) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean LJII(NLEModel nLEModel) {
        C362740EKa.LIZ.getClass();
        if (!C362740EKa.LJI(nLEModel) && !C362740EKa.LJII(nLEModel)) {
            return false;
        }
        return true;
    }

    public static boolean LJIIIIZZ(VideoPublishEditModel videoPublishEditModel) {
        if (!C0E50.LIZ) {
            return false;
        }
        if (videoPublishEditModel.creativeModel.nowsShootModel != null && !C365020ESu.LIZ(videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    public static boolean LJIIIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return false;
        }
        if (videoPublishEditModel.getEditorProModel().getFromEditType() != 0 && videoPublishEditModel.getEditorProModel().getFromEditType() != 2 && videoPublishEditModel.getEditorProModel().getFromEditType() != 3 && videoPublishEditModel.getEditorProModel().getFromEditType() != 4) {
            return false;
        }
        return true;
    }

    public static boolean LJIIJ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null || !videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            return false;
        }
        return true;
    }

    public static boolean LJIIJJI(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return false;
        }
        boolean zLIZJ = C365940EWi.LIZJ(videoPublishEditModel);
        if ((Intrinsics.LJFF(videoPublishEditModel.getEditorProModel().getOpenEditToolType(), "ai_video") && C0EN1.LIZ()) || !zLIZJ || !u4.LJLJJI(videoPublishEditModel) || videoPublishEditModel.isCurrentAutoCutMode()) {
            return false;
        }
        return true;
    }

    public static boolean LJIIL(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return false;
        }
        return TextUtils.equals(videoPublishEditModel.getEditorProModel().getOpenEditToolType(), "cutout");
    }

    public static boolean LJIILIIL(VideoPublishEditModel videoPublishEditModel) {
        return TextUtils.equals(videoPublishEditModel.getEditorProModel().getOpenEditToolType(), "new_edit");
    }

    public static boolean LJIILJJIL(VideoPublishEditModel videoPublishEditModel) {
        if (C1416310mxZ.LJJ(videoPublishEditModel)) {
            return true;
        }
        if (TextUtils.equals(videoPublishEditModel.getEditorProModel().getOpenEditToolType(), "new_edit") && TextUtils.equals(videoPublishEditModel.creativeModel.editorProAIGCInfoModel.editorTabAlbumAICreate.fromEditorTabAICreate, "ai_create")) {
            return true;
        }
        return false;
    }

    public static void LJIILLIIL(C0E48 c0e48) {
        if (c0e48 != null) {
            NLEModel nLEModelLJI = C350870DpF.LJI(c0e48);
            String extra = null;
            NLETrack nLETrack = null;
            for (NLETrack nLETrack2 : (ArrayList) C351220Dpo.LJLLI(nLEModelLJI)) {
                VecNLETrackSlotSPtr slots = nLETrack2.getSlots();
                if (slots != null) {
                    for (NLETrackSlot nLETrackSlot : slots) {
                        if (Intrinsics.LJFF(nLETrackSlot.getExtra("text_slot_type"), "AI_CAPTION") && Intrinsics.LJFF(nLETrackSlot.getExtra("is_meme_audio"), "1")) {
                            nLETrack = nLETrack2;
                        }
                        if (nLETrackSlot.hasExtra("text_tts_id")) {
                            extra = nLETrackSlot.getExtra("text_tts_id");
                        }
                    }
                }
            }
            if (extra != null && extra.length() != 0 && nLETrack != null) {
                for (NLETrack nLETrack3 : nLEModelLJI.getTracks()) {
                    if (Intrinsics.LJFF(C348350DlB.LIZ(nLETrack3), "TEXT_SPEAK")) {
                        Iterator<NLETrackSlot> it2 = nLETrack3.getSlots().iterator();
                        while (it2.hasNext()) {
                            if (Intrinsics.LJFF(it2.next().getUUID(), extra)) {
                                C350870DpF.LJI(c0e48).removeTrack(nLETrack);
                                C350870DpF.LJI(c0e48).removeTrack(nLETrack3);
                                C350870DpF.LIZ(c0e48, false);
                                c0e48.S7().LIZIZ(Boolean.TRUE, "remove_ai_caption", false);
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    public static void LJIJ(AVMusic aVMusic) {
        LJFF = aVMusic;
    }

    public static void LIZ(NLEModel nLEModel, boolean z) {
        for (NLETrack nLETrack : nLEModel.getTracks()) {
            if (C351220Dpo.LLILL(nLETrack)) {
                nLETrack.setEnable(z);
            }
            if (Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "DUB")) {
                nLETrack.setEnable(!z);
            }
        }
    }

    public static void LIZJ(MagicCombineEffectModel magicCombineEffectModel, NLEModel nLEModel) {
        List slots;
        C362740EKa.LIZ.getClass();
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack == null || (slots = mainTrack.getSlots()) == null) {
            slots = C13BV.INSTANCE;
        }
        C362740EKa.LIZ(magicCombineEffectModel, slots);
    }

    public static EffectPointModel LIZLLL(NLETrackSlot nLETrackSlot, NLENode nLENode) {
        boolean z;
        int iIntValue;
        int iIntValue2;
        String extra = nLENode.getExtra("nleExtraIsFromEditProMagic");
        if (((extra != null && !a0.LJJJIL(extra)) || (extra = nLETrackSlot.getExtra("nleExtraIsFromEditProMagic")) != null) && !a0.LJJJIL(extra)) {
            z = false;
        } else {
            z = true;
        }
        String str = "false";
        if (z) {
            extra = "false";
        }
        C348380DlE c348380DlE = new C348380DlE();
        c348380DlE.LIZIZ = nLETrackSlot.getStartTime();
        c348380DlE.LIZJ = nLETrackSlot.getEndTime();
        c348380DlE.LIZLLL = nLENode.getExtra("nleExtraEffectDirectory");
        c348380DlE.LJFF = nLENode.getExtra("nleExtraEffectKey");
        c348380DlE.LJII = nLENode.getExtra("original_effect_name");
        Integer numLJIIJJI = C2095008Iq.LJIIJJI(nLENode.getExtra("nleExtraEffectSelectedColor"));
        if (numLJIIJJI != null) {
            iIntValue = numLJIIJJI.intValue();
        } else {
            iIntValue = 0;
        }
        c348380DlE.LJIIIIZZ = iIntValue;
        c348380DlE.LJIIIZ = 1;
        c348380DlE.LJIIJ = nLENode.getExtra("nleExtraEffectCategory");
        c348380DlE.LJ = nLENode.getExtra("nleExtraEffectTag");
        c348380DlE.LJIIJJI = 1;
        String extra2 = nLENode.getExtra("nleExtraIsEditPro");
        if (extra2 != null) {
            str = extra2;
        }
        c348380DlE.LJIIZILJ = Boolean.parseBoolean(str);
        c348380DlE.LJIJ = Boolean.parseBoolean(extra);
        c348380DlE.LJIIL = nLENode.getExtra("nle_extra_resource_id");
        Integer numLJIIJJI2 = C2095008Iq.LJIIJJI(nLENode.getExtra("nleExtraEffectIndex"));
        if (numLJIIJJI2 != null) {
            iIntValue2 = numLJIIJJI2.intValue();
        } else {
            iIntValue2 = -1;
        }
        c348380DlE.LJIILIIL = iIntValue2;
        c348380DlE.LJIILJJIL = nLENode.getExtra("nleExtraEffectSelectFrom");
        c348380DlE.LJIILL = nLENode.getExtra("nleExtraEffectEntrancePoint");
        c348380DlE.LJIILLIIL = nLENode.getExtra("nleExtraEffectChallenge");
        c348380DlE.LJIJJ = nLENode.getExtra("nleExtraEffectIconUrl");
        c348380DlE.LJIL = nLENode.getExtra("searched_effect_info");
        return C363510EMz.LIZ(c348380DlE, false, (int) (c348380DlE.LIZJ - c348380DlE.LIZIZ));
    }

    public static List LJ(List list, VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        NLENode nLENode;
        NLESegmentFilter segment;
        NLESegment mainSegment;
        NLESegmentFilter segment2;
        NLESegment mainSegment2;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            NLETrackSlot nLETrackSlot = (NLETrackSlot) it2.next();
            C363500EMy c363500EMy = LIZ;
            String str = videoPublishEditModel.mShootWay;
            c363500EMy.getClass();
            if (!TextUtils.equals(str, "ugc_template") && !TextUtils.equals(str, "pugc_template")) {
                z = false;
            } else {
                z = true;
            }
            if (z && C351220Dpo.LLJLLL(nLETrackSlot)) {
                if (!nLETrackSlot.getFeatureList().contains("UGC_ASYNC_I2V")) {
                    C348380DlE c348380DlE = new C348380DlE();
                    c348380DlE.LIZIZ = nLETrackSlot.getStartTime();
                    c348380DlE.LIZJ = nLETrackSlot.getEndTime();
                    c348380DlE.LJFF = nLETrackSlot.getExtra("ep_magic_effect_id");
                    c348380DlE.LJIIL = nLETrackSlot.getExtra("ep_magic_resource_id");
                    EffectPointModel effectPointModelLIZ = C363510EMz.LIZ(c348380DlE, false, (int) (c348380DlE.LIZJ - c348380DlE.LIZIZ));
                    effectPointModelLIZ.setMagic(true);
                    NLETrackSlot renderProxy = nLETrackSlot.getRenderProxy();
                    if (renderProxy != null && (mainSegment2 = renderProxy.getMainSegment()) != null) {
                        effectPointModelLIZ.setExtra(mainSegment2.getExtra("nleExtraEffectTag"));
                    }
                    NLEFilter nLEFilter = (NLEFilter) C13LP.LJJJLL(nLETrackSlot.getFilters());
                    if (nLEFilter != null && (segment2 = nLEFilter.getSegment()) != null) {
                        effectPointModelLIZ.setExtra(segment2.getExtra("nleExtraEffectTag"));
                    }
                    VecNLEVideoEffectSPtr videoEffects = nLETrackSlot.getVideoEffects();
                    if (videoEffects != null && C13LP.LJJJLL(videoEffects) != null) {
                        effectPointModelLIZ.setExtra(nLETrackSlot.getExtra("nleExtraEffectExtra"));
                        String extra = effectPointModelLIZ.getExtra();
                        if (extra == null || extra.length() == 0) {
                            effectPointModelLIZ.setExtra(nLETrackSlot.getExtra("nleExtraEffectExtra"));
                        }
                    }
                    arrayList.add(effectPointModelLIZ);
                }
            } else {
                NLETrackSlot renderProxy2 = nLETrackSlot.getRenderProxy();
                if (renderProxy2 != null && (mainSegment = renderProxy2.getMainSegment()) != null) {
                    EffectPointModel effectPointModelLIZLLL = LIZLLL(nLETrackSlot, mainSegment);
                    effectPointModelLIZLLL.setExtra(mainSegment.getExtra("nleExtraEffectTag"));
                    arrayList.add(effectPointModelLIZLLL);
                }
                NLEFilter nLEFilter2 = (NLEFilter) C13LP.LJJJLL(nLETrackSlot.getFilters());
                if (nLEFilter2 != null && (segment = nLEFilter2.getSegment()) != null) {
                    EffectPointModel effectPointModelLIZLLL2 = LIZLLL(nLETrackSlot, segment);
                    effectPointModelLIZLLL2.setExtra(segment.getExtra("nleExtraEffectTag"));
                    arrayList.add(effectPointModelLIZLLL2);
                }
                VecNLEVideoEffectSPtr videoEffects2 = nLETrackSlot.getVideoEffects();
                if (videoEffects2 != null && (nLENode = (NLENode) C13LP.LJJJLL(videoEffects2)) != null) {
                    EffectPointModel effectPointModelLIZLLL3 = LIZLLL(nLETrackSlot, nLENode);
                    if (effectPointModelLIZLLL3.getKey().length() == 0) {
                        effectPointModelLIZLLL3.setKey(nLETrackSlot.getExtra("nleExtraEffectKey"));
                    }
                    if (effectPointModelLIZLLL3.getName().length() == 0) {
                        effectPointModelLIZLLL3.setName(nLETrackSlot.getExtra("original_effect_name"));
                    }
                    if (effectPointModelLIZLLL3.getResourceId().length() == 0) {
                        effectPointModelLIZLLL3.setResourceId(nLETrackSlot.getExtra("nle_extra_resource_id"));
                    }
                    if (effectPointModelLIZLLL3.getSelectFrom().length() == 0) {
                        effectPointModelLIZLLL3.setSelectFrom(nLETrackSlot.getExtra("nleExtraEffectSelectFrom"));
                    }
                    if (effectPointModelLIZLLL3.getEntrancePoint().length() == 0) {
                        effectPointModelLIZLLL3.setEntrancePoint(nLETrackSlot.getExtra("nleExtraEffectEntrancePoint"));
                    }
                    int iIntValue = -1;
                    if (effectPointModelLIZLLL3.getIndex() == -1) {
                        Integer numLJIIJJI = C2095008Iq.LJIIJJI(nLETrackSlot.getExtra("nleExtraEffectIndex"));
                        if (numLJIIJJI != null) {
                            iIntValue = numLJIIJJI.intValue();
                        }
                        effectPointModelLIZLLL3.setIndex(iIntValue);
                    }
                    String resDir = effectPointModelLIZLLL3.getResDir();
                    if (resDir == null || resDir.length() == 0) {
                        effectPointModelLIZLLL3.setResDir(nLETrackSlot.getExtra("nleExtraEffectDirectory"));
                    }
                    String iconUrl = effectPointModelLIZLLL3.getIconUrl();
                    if (iconUrl == null || iconUrl.length() == 0) {
                        effectPointModelLIZLLL3.setIconUrl(nLETrackSlot.getExtra("nleExtraEffectIconUrl"));
                    }
                    String category = effectPointModelLIZLLL3.getCategory();
                    if (category == null || category.length() == 0) {
                        effectPointModelLIZLLL3.setCategory(nLETrackSlot.getExtra("nleExtraEffectCategory"));
                    }
                    if (effectPointModelLIZLLL3.getExtra().length() == 0) {
                        effectPointModelLIZLLL3.setExtra(nLETrackSlot.getExtra("nleExtraEffectExtra"));
                    }
                    arrayList.add(effectPointModelLIZLLL3);
                }
            }
        }
        return arrayList;
    }

    public static final boolean LJIILL(VideoPublishEditContainerScene videoPublishEditContainerScene, VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        CreativeModel creativeModel;
        EditorProModel editorProModel;
        PUgcTemplateData pUgcTemplateData;
        if (!(videoPublishEditContainerScene instanceof VideoEditContainerScene)) {
            return false;
        }
        boolean zLJJJJIZL = C1416310mxZ.LJJJJIZL(videoPublishEditModel);
        Bundle bundle = ((VideoEditContainerScene) videoPublishEditContainerScene).LLLLIILL;
        if (bundle != null && bundle.containsKey("editor_pro_init_data")) {
            z = true;
        } else {
            z = false;
        }
        boolean zLJJLJ = C1428520nHG.LJJLJ(videoPublishEditModel);
        LIZ.getClass();
        boolean zLJIIJJI = LJIIJJI(videoPublishEditModel);
        if (!zLJJJJIZL && !z && !zLJJLJ && ((videoPublishEditModel == null || (((creativeModel = videoPublishEditModel.creativeModel) == null || (pUgcTemplateData = creativeModel.pugcTemplateData) == null || !pUgcTemplateData.isFromCreateTemplate) && ((editorProModel = videoPublishEditModel.getEditorProModel()) == null || !editorProModel.getFromEditorProEntranceInAlbum()))) && !zLJIIJJI)) {
            return false;
        }
        return true;
    }

    public static void LJIIZILJ(C0E48 c0e48, String str) {
        NLETrack nLETrackLIZ;
        if (c0e48 != null && (nLETrackLIZ = C348860Dm0.LIZ(C350870DpF.LJI(c0e48))) != null) {
            if (str == null) {
                str = "";
            }
            nLETrackLIZ.setExtra("music_origin_for_mod", str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x068e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel r18, com.bytedance.ies.nle.editor_jni.NLEModel r19, java.lang.Boolean r20) {
        /*
            Method dump skipped, instruction units count: 1953
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C363500EMy.LIZIZ(com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel, com.bytedance.ies.nle.editor_jni.NLEModel, java.lang.Boolean):void");
    }

    public static void LJIJI(Scene scene, C348100Dkm c348100Dkm, VideoPublishEditModel videoPublishEditModel, List list, C0ELJ c0elj, InterfaceC377540ErA interfaceC377540ErA, boolean z) {
        String str;
        String str2;
        String strLJIJ;
        ArrayList<StickerItemModel> arrayList;
        List<StickerItemModel> list2;
        int iIntValue;
        if (C372650EjH.LIZIZ(scene).requireAppCompatActivity().isFinishing()) {
            return;
        }
        LIZJ = c348100Dkm;
        if (!C1416310mxZ.LJJLIIIJJIZ(videoPublishEditModel)) {
            C364470EQr c364470EQr = C364470EQr.LIZ;
            Integer numValueOf = Integer.valueOf((int) (c348100Dkm.LIZ.getModel().getMeasuredEndTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
            c364470EQr.getClass();
            if (videoPublishEditModel.getInfoStickerModel() == null) {
                videoPublishEditModel.setInfoStickerModel(new InfoStickerModel(videoPublishEditModel.draftDir()));
            }
            C1416310mxZ.LJ(videoPublishEditModel);
            ArrayList arrayList2 = new ArrayList();
            if (u4.LJLJLLL(videoPublishEditModel)) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : list) {
                    if (Intrinsics.LJFF(((TextStickerData) obj).getType(), "type_inline_caption")) {
                        arrayList3.add(obj);
                    }
                }
                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                int i = 0;
                for (Object obj2 : arrayList3) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        arrayList4.add(Boolean.valueOf(arrayList2.add(C0F7Y.LIZ((TextStickerData) obj2, i))));
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            } else {
                InlineCaptionModel inlineCaptionModel = videoPublishEditModel.creativeModel.inlineCaptionModel;
                if (inlineCaptionModel != null && (arrayList = inlineCaptionModel.utterances) != null) {
                    arrayList.clear();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj3 : list) {
                        if (Intrinsics.LJFF(((TextStickerData) obj3).getType(), "type_inline_caption")) {
                            arrayList5.add(obj3);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(arrayList5, 10));
                    int i3 = 0;
                    for (Object obj4 : arrayList5) {
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            arrayList6.add(Boolean.valueOf(arrayList.add(C0F7Y.LIZ((TextStickerData) obj4, i3))));
                            i3 = i4;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
            }
            int size = arrayList2.size();
            ArrayList arrayList7 = new ArrayList();
            for (Object obj5 : list) {
                if (Intrinsics.LJFF(((TextStickerData) obj5).getType(), "type_text_sticker")) {
                    arrayList7.add(obj5);
                }
            }
            ArrayList arrayList8 = new ArrayList(C15438062q.LJIJJ(arrayList7, 10));
            int i5 = 0;
            for (Object obj6 : arrayList7) {
                int i6 = i5 + 1;
                if (i5 >= 0) {
                    TextStickerData textStickerData = (TextStickerData) obj6;
                    if (textStickerData.getEndTime() == 0) {
                        if (numValueOf != null) {
                            iIntValue = numValueOf.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        textStickerData.setEndTime(iIntValue);
                    }
                    arrayList8.add(Boolean.valueOf(arrayList2.add(C0F7Y.LIZ(textStickerData, i5 + size))));
                    i5 = i6;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            InfoStickerModel infoStickerModel = videoPublishEditModel.getInfoStickerModel();
            if (infoStickerModel != null && (list2 = infoStickerModel.stickers) != null) {
                list2.addAll(arrayList2);
            }
        }
        NLEModel model = c348100Dkm.LIZ.getModel();
        if (model == null) {
            model = new NLEModel();
        }
        u4.LJJL(videoPublishEditModel, model, "edit_to_ep_before", false);
        if (C295990Biv.LIZ() && (((str = videoPublishEditModel.getEditorProDraftModel().nleData) == null || str.length() == 0) && videoPublishEditModel.getEditorProModel().isAdvancedEditDraft() && (str2 = videoPublishEditModel.getEditorProDraftModel().nleDataPath) != null && str2.length() != 0 && C2354709Kn.LIZIZ(str2) && (strLJIJ = C2354709Kn.LJIJ(str2)) != null && strLJIJ.length() != 0)) {
            videoPublishEditModel.getEditorProDraftModel().nleData = strLJIJ;
        }
        c0elj.setEnterMovePos(c348100Dkm.LIZIZ.getPlayerApi().getCurrentPosition() + ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        if (videoPublishEditModel.isRetakeVideo()) {
            LIZ.getClass();
        }
        if (interfaceC377540ErA != null) {
            interfaceC377540ErA.bx0(c0elj, z);
        }
    }
}
