package X;

import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.creative.model.AYCacheUnit;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.CelebrationData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.CutSameModel;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.creative.model.TemplateConsumeData;
import com.ss.android.ugc.aweme.creative.model.UgcTemplateData;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingModel;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.SelectedMaterialItem;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.TemplateMobParams;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProSchemeModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCInfoModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorTabAlbumAICreate;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.creative.model.publish.CaptionModel;
import com.ss.android.ugc.aweme.creative.model.record.CameraLayoutModel;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.publish.PublishOutput;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.location.LocationStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.effectmanager.effect.model.AssetFrom;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;
import uxk.a;

/* JADX INFO: renamed from: X.0mxZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1416310mxZ {
    public static final boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        C1438590nXV replaceMusicModel;
        Integer muteType;
        if (!LJJJJZ(videoPublishEditModel) || (replaceMusicModel = videoPublishEditModel.getReplaceMusicModel()) == null || (muteType = replaceMusicModel.getMuteType()) == null || muteType.intValue() != 1) {
            return false;
        }
        return true;
    }

    public static final Pair<Integer, Integer> LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        int i;
        ArrayList<ImportVideoInfo> importInfoList = videoPublishEditModel.getImportInfoList();
        int size = 0;
        if (importInfoList != null) {
            Iterator<ImportVideoInfo> it2 = importInfoList.iterator();
            i = 0;
            while (it2.hasNext()) {
                String description = it2.next().getDescription();
                if (description != null) {
                    try {
                        if (Intrinsics.LJFF(new JSONObject(description).optString("source_type"), "vicut")) {
                            i++;
                        }
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        } else {
            i = 0;
        }
        ArrayList<ImportVideoInfo> importInfoList2 = videoPublishEditModel.getImportInfoList();
        if (importInfoList2 != null) {
            size = importInfoList2.size() - i;
        }
        return new Pair<>(Integer.valueOf(size), Integer.valueOf(i));
    }

    public static final void LJ(VideoPublishEditModel videoPublishEditModel) {
        List<StickerItemModel> list;
        Iterator<StickerItemModel> it2;
        if (LJJLIIIJJIZ(videoPublishEditModel)) {
            videoPublishEditModel.creativeModel.stickerModel.textStickerModels.clear();
            return;
        }
        InfoStickerModel infoStickerModel = videoPublishEditModel.getInfoStickerModel();
        if (infoStickerModel == null || (list = infoStickerModel.stickers) == null || (it2 = list.iterator()) == null) {
            return;
        }
        while (it2.hasNext()) {
            if (it2.next().type == 2) {
                it2.remove();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0017, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJFF(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7) {
        /*
            boolean r0 = X.C1428470nHB.LJJZZI(r7)
            r6 = 1
            if (r0 == 0) goto L50
            com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData r0 = r7.getImageAlbumData()
            if (r0 == 0) goto L4e
            java.util.List r0 = r0.getImageList()
            if (r0 == 0) goto L4e
            java.util.Iterator r5 = r0.iterator()
        L17:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r4 = r5.next()
            r0 = r4
            com.ss.android.ugc.aweme.creative.model.edit.SingleImageData r0 = (com.ss.android.ugc.aweme.creative.model.edit.SingleImageData) r0
            com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfoNewEngine r0 = r0.getStickerInfoNewEngine()
            if (r0 == 0) goto L17
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.getTextStickerModels()
            if (r0 == 0) goto L17
            java.util.Iterator r3 = r0.iterator()
        L34:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L17
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel r0 = (com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel) r0
            X.0F7S r1 = r0.getSourceType()
            X.0F7S r0 = X.C0F7S.EDIT
            if (r1 != r0) goto L34
            if (r2 == 0) goto L17
            if (r4 == 0) goto L4e
            return r6
        L4e:
            r6 = 0
            return r6
        L50:
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r7.creativeModel
            com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel r0 = r0.stickerModel
            java.util.List<com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel> r0 = r0.textStickerModels
            java.util.Iterator r3 = r0.iterator()
        L5a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L72
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel r0 = (com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel) r0
            X.0F7S r1 = r0.getSourceType()
            X.0F7S r0 = X.C0F7S.EDIT
            if (r1 != r0) goto L5a
            if (r2 == 0) goto L72
            return r6
        L72:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1416310mxZ.LJFF(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):boolean");
    }

    public static final boolean LJI(VideoPublishEditModel videoPublishEditModel) {
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        CopyOnWriteArrayList<TextStickerModel> textStickerModels;
        if (C1428470nHB.LJJZZI(videoPublishEditModel) && (imageAlbumData = videoPublishEditModel.getImageAlbumData()) != null && (imageList = imageAlbumData.getImageList()) != null) {
            Iterator<SingleImageData> it2 = imageList.iterator();
            while (it2.hasNext()) {
                ImageStickerInfoNewEngine stickerInfoNewEngine = it2.next().getStickerInfoNewEngine();
                if (stickerInfoNewEngine != null && (textStickerModels = stickerInfoNewEngine.getTextStickerModels()) != null) {
                    Iterator<TextStickerModel> it3 = textStickerModels.iterator();
                    while (it3.hasNext()) {
                        if (it3.next().getTextTemplateModel().enableTextTemplate) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public static final boolean LJII(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return false;
        }
        if (((Boolean) C258630ABp.LIZ.getValue()).booleanValue() && LJIILIIL(videoPublishEditModel)) {
            return true;
        }
        if (!videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate || !((Boolean) C0AC7.LIZ.getValue()).booleanValue() || !LJIILIIL(videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIIIZZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return false;
        }
        if (((Boolean) C0ACT.LIZ.getValue()).booleanValue() && LJIILIIL(videoPublishEditModel)) {
            return true;
        }
        if (!videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate || !((Boolean) C258810ACh.LIZ.getValue()).booleanValue() || !LJIILIIL(videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIIZ(VideoPublishEditModel videoPublishEditModel) {
        Cut2EditTransferModel cut2EditTransferModel;
        if (videoPublishEditModel != null && LJIILLIIL(videoPublishEditModel)) {
            CreativeModel creativeModel = videoPublishEditModel.creativeModel;
            if (!creativeModel.draftInfoModel.isDraft && ((cut2EditTransferModel = creativeModel.cut2EditTransferModel) == null || !cut2EditTransferModel.getMusicSyncMode())) {
                C391040FUw.LIZ.getClass();
                int iIntValue = ((Number) C0AZP.LIZ.getValue()).intValue();
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(C391040FUw.LIZIZ.getString("text_not_use_caption_creation_ids", ""), new String[]{","}, 0, 6);
                if (!listLJJLIIIJILLIZJL.contains("text_caption_item_first_pin") && listLJJLIIIJILLIZJL.size() <= iIntValue) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final String LJIIJ(VideoPublishEditModel videoPublishEditModel) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isMV: ");
        sbLIZ.append(videoPublishEditModel.isMvThemeVideoType());
        sbLIZ.append(", isDraft: ");
        sbLIZ.append(videoPublishEditModel.mIsFromDraft);
        sbLIZ.append(", draftId: ");
        sbLIZ.append(videoPublishEditModel.getDraftId());
        sbLIZ.append(", newDraftId: ");
        sbLIZ.append(videoPublishEditModel.getNewDraftId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final boolean LJIIJJI(VideoPublishEditModel videoPublishEditModel) {
        List<AYCacheUnit> listLJIIL = LJIIL(videoPublishEditModel);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIL, 10));
        Iterator<AYCacheUnit> it2 = listLJIIL.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getAyText());
        }
        List<AddYoursStickerModel> list = videoPublishEditModel.creativeModel.stickerModel.addYoursStickerModels;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<AddYoursStickerModel> it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList2.add(it3.next().getTopicText());
        }
        Iterator<AddYoursStickerModel> it4 = videoPublishEditModel.creativeModel.stickerModel.addYoursStickerModels.iterator();
        while (it4.hasNext()) {
            if (C13LP.LJJJJ(it4.next().getTopicText(), arrayList)) {
                return true;
            }
        }
        return false;
    }

    public static final List<AYCacheUnit> LJIIL(VideoPublishEditModel videoPublishEditModel) {
        List listLJJLIIIJ;
        if (videoPublishEditModel.getStickerID() == null) {
            return C13BV.INSTANCE;
        }
        String stickerID = videoPublishEditModel.getStickerID();
        if (stickerID == null || (listLJJLIIIJ = a0.LJJLIIIJ(stickerID, new char[]{','}, false, 0, 6)) == null) {
            listLJJLIIIJ = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (AYCacheUnit aYCacheUnit : videoPublishEditModel.creativeModel.ayMobCacheModel.ayEffectList) {
            if (listLJJLIIIJ.contains(aYCacheUnit.getEffectId())) {
                arrayList.add(aYCacheUnit);
            }
        }
        return arrayList;
    }

    public static final boolean LJIILIIL(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return false;
        }
        if (videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            return true;
        }
        if (!C295900Bim.LIZ() || !LJJLIIIJJIZ(videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIILJJIL(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return false;
        }
        if (((Boolean) C259670AFp.LIZ.getValue()).booleanValue() && LJJLIIIJJIZ(videoPublishEditModel)) {
            return true;
        }
        if (!videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            return false;
        }
        return LJJLIIIJJIZ(videoPublishEditModel);
    }

    public static final boolean LJIILL(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return false;
        }
        if ((!((Boolean) C0AGN.LIZ.getValue()).booleanValue() && (!videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate || !((Boolean) C259830AGf.LIZ.getValue()).booleanValue())) || !LJJLIIIJJIZ(videoPublishEditModel) || !LJIILIIL(videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIILLIIL(VideoPublishEditModel videoPublishEditModel) {
        if (!C289530BWl.LIZ() || videoPublishEditModel == null || !LJJLIIIJJIZ(videoPublishEditModel)) {
            return false;
        }
        NowsShootModel nowsShootModel = videoPublishEditModel.creativeModel.nowsShootModel;
        if (((nowsShootModel == null || nowsShootModel.type == 0) && videoPublishEditModel.getOrigin() != 1 && videoPublishEditModel.getOrigin() != 0) || !Intrinsics.LJFF(videoPublishEditModel.mShootWay, "direct_shoot") || videoPublishEditModel.getCanvasVideoData() != null || videoPublishEditModel.getEditorProModel().getFromEditorProEntranceInAlbum() || LJJI(videoPublishEditModel) || !((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LJI() || C0CHQ.LIZ().getAccountService().LIZ() || !a0.LJJJIL(videoPublishEditModel.getEditorProModel().getOpenEditToolType()) || videoPublishEditModel.isCurrentAutoCutMode() || videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate || C1428470nHB.LJJZZI(videoPublishEditModel) || videoPublishEditModel.isDuet() || videoPublishEditModel.isStitchMode() || videoPublishEditModel.isCurrentAutoCutMode() || videoPublishEditModel.creativeModel.autoCutModel.backwardAutoCutProcess || videoPublishEditModel.isRetakeVideo()) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIZILJ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return false;
        }
        if (videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate || LJJJLIIL(videoPublishEditModel) || C1428470nHB.LLIIIZ(videoPublishEditModel) || LJJJLL(videoPublishEditModel)) {
            return true;
        }
        if (!((Boolean) C258710ABx.LIZ.getValue()).booleanValue() || !LJJLIIIJJIZ(videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIJ(VideoPublishEditModel videoPublishEditModel) {
        if ((!LJJLIIIJJIZ(videoPublishEditModel) || C1428470nHB.LJLIIL(videoPublishEditModel)) && !LJJJLIIL(videoPublishEditModel) && !LJJJLL(videoPublishEditModel) && !C1428470nHB.LLIIIZ(videoPublishEditModel) && !videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            return false;
        }
        return true;
    }

    public static final boolean LJIJI(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return false;
        }
        if (videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            return true;
        }
        if (!LJIIZILJ(videoPublishEditModel) || !LJIJ(videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIJJ(VideoPublishEditModel videoPublishEditModel) {
        if ((((Boolean) C258520ABe.LIZ.getValue()).booleanValue() || LJJJLIIL(videoPublishEditModel) || C1428470nHB.LLIIIZ(videoPublishEditModel) || LJJJLL(videoPublishEditModel) || videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) && LJIJ(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    public static final boolean LJIJJLI(VideoPublishEditModel videoPublishEditModel) {
        if (LJIIZILJ(videoPublishEditModel) && LJIJ(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJ(VideoPublishEditModel videoPublishEditModel) {
        CreativeModel creativeModel;
        EditorProAIGCInfoModel editorProAIGCInfoModel;
        EditorTabAlbumAICreate editorTabAlbumAICreate;
        String str;
        if (videoPublishEditModel == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (editorProAIGCInfoModel = creativeModel.editorProAIGCInfoModel) == null || (editorTabAlbumAICreate = editorProAIGCInfoModel.editorTabAlbumAICreate) == null || (str = editorTabAlbumAICreate.deeplinkEpAIScene) == null || !C123100dR.LIZ(str)) {
            return false;
        }
        return true;
    }

    public static final boolean LJJI(VideoPublishEditModel videoPublishEditModel) {
        EditorProSchemeModel editorProSchemeModel;
        CreativeModel creativeModel;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null) {
            editorProSchemeModel = creativeModel.editorProSchemeModel;
        } else {
            editorProSchemeModel = null;
        }
        return C537970L7z.LJFF(editorProSchemeModel);
    }

    public static final Integer LJJIFFI(VideoPublishEditModel videoPublishEditModel) {
        int value;
        Integer num;
        Integer num2;
        String str;
        if (videoPublishEditModel == null) {
            return null;
        }
        if (videoPublishEditModel.isCutSameVideoType()) {
            CutSameModel cutSameModel = videoPublishEditModel.creativeModel.cutSameModel;
            if (cutSameModel != null) {
                str = cutSameModel.selectedTemplate;
            } else {
                str = null;
            }
            CutsameDataItem cutsameDataItem = (CutsameDataItem) GsonProtectorUtils.fromJson(C09C2.LIZ(), str, CutsameDataItem.class);
            if (cutsameDataItem == null) {
                return null;
            }
            return cutsameDataItem.assetFrom;
        }
        if (C1428470nHB.LJLLILLLL(videoPublishEditModel)) {
            return videoPublishEditModel.creativeModel.pugcTemplateData.assetFrom;
        }
        MixEditingModel mixEditingModel = videoPublishEditModel.creativeModel.mixEditingModel;
        SelectedMaterialItem selectedMaterialItem = mixEditingModel.selectedMaterialItem;
        if (selectedMaterialItem != null && !selectedMaterialItem.fromMixEditingRecommend && !videoPublishEditModel.isCurrentAutoCutMode()) {
            return Integer.valueOf(AssetFrom.CLIENT_INSERT.getValue());
        }
        TemplateMobParams templateMobParams = mixEditingModel.templateMobParams;
        if (templateMobParams != null && (num2 = templateMobParams.assetFrom) != null) {
            value = num2.intValue();
        } else {
            AutoCutThemeData autoCutThemeDataLIZJ = C1416110mxF.LIZJ(videoPublishEditModel.creativeModel.autoCutModel);
            if (autoCutThemeDataLIZJ != null && (num = autoCutThemeDataLIZJ.assetFrom) != null) {
                value = num.intValue();
            } else {
                value = AssetFrom.OTHERS.getValue();
            }
        }
        return Integer.valueOf(value);
    }

    public static final int LJJII(VideoPublishEditModel videoPublishEditModel) {
        int i = 0;
        if (videoPublishEditModel.isCutSameVideoType() && Intrinsics.LJFF(C1412380mrE.LIZ(videoPublishEditModel), C1412390mrF.LJI) && C0C64.LJIILLIIL().LJIIIZ(31744, "template_tab_cc_trans_origin_anchor", true, false)) {
            i = 3;
        } else {
            ArrayList<ImportVideoInfo> importInfoList = videoPublishEditModel.getImportInfoList();
            if (importInfoList != null) {
                long importfileDuration = 0;
                loop0: while (true) {
                    i = 0;
                    for (ImportVideoInfo importVideoInfo : importInfoList) {
                        if (importVideoInfo.getImportfileDuration() > importfileDuration) {
                            importfileDuration = importVideoInfo.getImportfileDuration();
                            String description = importVideoInfo.getDescription();
                            if (description != null) {
                                try {
                                    if (Intrinsics.LJFF(new JSONObject(description).optString("source_type"), "vicut")) {
                                        if (((JSONObject) new JSONObject(description).opt("data")).optString("stickerId").length() > 0) {
                                            i = 1;
                                        } else {
                                            i = 2;
                                        }
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                        }
                    }
                    break loop0;
                }
            }
        }
        videoPublishEditModel.creativeModel.postPageModel.isFromCC = i;
        return i;
    }

    public static final EditorProSchemeModel LJJIII(VideoPublishEditModel videoPublishEditModel) {
        return videoPublishEditModel.creativeModel.editorProSchemeModel;
    }

    public static final MultiEditVideoSegmentRecordData LJJIIJ(VideoPublishEditModel videoPublishEditModel) {
        List<MultiEditVideoSegmentRecordData> list;
        MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModel.getCurMultiEditVideoRecordData();
        if (curMultiEditVideoRecordData != null && (list = curMultiEditVideoRecordData.segmentDataList) != null) {
            return (MultiEditVideoSegmentRecordData) C13LP.LJJJLZIJ(!LJJJI(videoPublishEditModel) ? 1 : 0, list);
        }
        return null;
    }

    public static final MultiEditVideoSegmentRecordData LJJIIJZLJL(VideoPublishEditModel videoPublishEditModel) {
        List<MultiEditVideoSegmentRecordData> list;
        MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModel.getCurMultiEditVideoRecordData();
        if (curMultiEditVideoRecordData != null && (list = curMultiEditVideoRecordData.segmentDataList) != null) {
            return (MultiEditVideoSegmentRecordData) C13LP.LJJJLL(list);
        }
        return null;
    }

    public static final Pair<Integer, Integer> LJJIIZ(VideoPublishEditModel videoPublishEditModel) {
        return new Pair<>(Integer.valueOf(videoPublishEditModel.creativeModel.commonMobModel.originVideoCount), Integer.valueOf(videoPublishEditModel.creativeModel.commonMobModel.originPhotoCount));
    }

    public static final int LJJIIZI(VideoPublishEditModel videoPublishEditModel) {
        if (ComplianceServiceProvider.LJIJJ().LJJIIZ()) {
            return 1;
        }
        if (C569240MUg.LIZ() && !videoPublishEditModel.creativeModel.draftInfoModel.isDraft) {
            a.LIZ.getClass();
            if (a.LIZ() == 4) {
                return a.LIZJ();
            }
            return a.LIZ();
        }
        a.LIZ.getClass();
        return a.LIZIZ();
    }

    public static final List<TextStickerModel> LJJIJIL(VideoPublishEditModel videoPublishEditModel) {
        StickerNewEngineModel stickerNewEngineModel;
        List<TextStickerModel> list;
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        if (creativeModel == null || (stickerNewEngineModel = creativeModel.stickerModel) == null || (list = stickerNewEngineModel.textStickerModels) == null) {
            return new ArrayList();
        }
        return list;
    }

    public static final String LJJIJL(VideoPublishEditModel videoPublishEditModel) {
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        CopyOnWriteArrayList<TextStickerModel> textStickerModels;
        ArrayList arrayList = new ArrayList();
        if (C1428470nHB.LJJZZI(videoPublishEditModel) && (imageAlbumData = videoPublishEditModel.getImageAlbumData()) != null && (imageList = imageAlbumData.getImageList()) != null) {
            Iterator<SingleImageData> it2 = imageList.iterator();
            while (it2.hasNext()) {
                ImageStickerInfoNewEngine stickerInfoNewEngine = it2.next().getStickerInfoNewEngine();
                if (stickerInfoNewEngine != null && (textStickerModels = stickerInfoNewEngine.getTextStickerModels()) != null) {
                    for (TextStickerModel textStickerModel : textStickerModels) {
                        if (textStickerModel.getTextTemplateModel().enableTextTemplate && C123100dR.LIZ(textStickerModel.getTextTemplateModel().templateName)) {
                            arrayList.add(textStickerModel.getTextTemplateModel().templateName);
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return "";
        }
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
    }

    public static final List<EffectPointModel> LJJIJLIJ(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (EffectPointModel effectPointModel : videoPublishEditModel.getEffectList()) {
            String extra = effectPointModel.getExtra();
            if (extra != null && !a0.LJJJIL(extra)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                try {
                    String strOptString = new JSONObject(effectPointModel.getExtra()).optString("game_play_type", "");
                    if (Intrinsics.LJFF(strOptString, EnumC1429610nJ1.EDIT_EFFECT_SERVER.getType())) {
                        arrayList.add(effectPointModel);
                    } else if (Intrinsics.LJFF(strOptString, EnumC1429610nJ1.EDIT_EFFECT_COMBINED.getType())) {
                        arrayList.add(effectPointModel);
                    } else if (Intrinsics.LJFF(strOptString, EnumC1429610nJ1.EDIT_EFFECT_CLIENT.getType())) {
                        arrayList.add(effectPointModel);
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return arrayList;
    }

    public static final boolean LJJIL(VideoPublishEditModel videoPublishEditModel) {
        ArrayList<ImportVideoInfo> importInfoList = videoPublishEditModel.getImportInfoList();
        if (importInfoList != null) {
            Iterator<ImportVideoInfo> it2 = importInfoList.iterator();
            while (it2.hasNext()) {
                String description = it2.next().getDescription();
                if (description != null) {
                    try {
                        if (Intrinsics.LJFF(new JSONObject(description).optString("source_type"), "vicut")) {
                            return true;
                        }
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
            return false;
        }
        return false;
    }

    public static final boolean LJJIZ(VideoPublishEditModel videoPublishEditModel) {
        ArrayList<ImportVideoInfo> importInfoList = videoPublishEditModel.getImportInfoList();
        if (importInfoList != null) {
            Iterator<ImportVideoInfo> it2 = importInfoList.iterator();
            while (it2.hasNext()) {
                String description = it2.next().getDescription();
                if (description != null) {
                    try {
                        if (Intrinsics.LJFF(new JSONObject(description).optString("source_type"), "vicut")) {
                            return true;
                        }
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }
        return false;
    }

    public static final int LJJJ(VideoPublishEditModel videoPublishEditModel) {
        List<StickerModel> listLJFF = C1466090oFr.LJFF(videoPublishEditModel.creativeModel.stickerModel);
        List<InteractStickerStruct> listLJIIIIZZ = C1429860nJQ.LJIIIIZZ(videoPublishEditModel.getMainBusinessData(), EnumC1428480nHC.TRACK_PAGE_EDIT);
        if (listLJIIIIZZ == null) {
            return ((ArrayList) listLJFF).size();
        }
        return ((ArrayList) listLJFF).size() + listLJIIIIZZ.size();
    }

    public static final boolean LJJJI(VideoPublishEditModel videoPublishEditModel) {
        CameraLayoutModel cameraLayoutModel = videoPublishEditModel.creativeModel.cameraLayoutModel;
        if (cameraLayoutModel == null || !cameraLayoutModel.layoutEnabled) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJIL(VideoPublishEditModel videoPublishEditModel) {
        if ((C1428470nHB.LLIIIZ(videoPublishEditModel) || LJJJJJL(videoPublishEditModel) || videoPublishEditModel.isCutSameVideoType()) && !Intrinsics.LJFF(videoPublishEditModel.mShootWay, "mv_page") && !LJJJJLL(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJJ(VideoPublishEditModel videoPublishEditModel) {
        return Intrinsics.LJFF(videoPublishEditModel.mShootWay, "group_shot");
    }

    public static final boolean LJJJJI(VideoPublishEditModel videoPublishEditModel) {
        if (!TextUtils.equals(videoPublishEditModel.mShootWay, "l8_import_music_edit") && !TextUtils.equals(videoPublishEditModel.mShootWay, "l8_music_edit_cml")) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJIZL(VideoPublishEditModel videoPublishEditModel) {
        EditorProSchemeModel editorProSchemeModel;
        CreativeModel creativeModel;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null) {
            editorProSchemeModel = creativeModel.editorProSchemeModel;
        } else {
            editorProSchemeModel = null;
        }
        return C537970L7z.LJI(editorProSchemeModel);
    }

    public static final boolean LJJJJJ(VideoPublishEditModel videoPublishEditModel) {
        String str;
        List<SingleImageData> imageList;
        List<String> list;
        List<String> list2;
        EditPreviewInfo previewInfo;
        List<EditVideoSegment> videoList;
        List<EditVideoSegment> videoList2;
        if (videoPublishEditModel == null || !LJJJI(videoPublishEditModel)) {
            return false;
        }
        CameraLayoutModel cameraLayoutModel = videoPublishEditModel.creativeModel.cameraLayoutModel;
        String strLJJLJLI = null;
        if (cameraLayoutModel != null) {
            str = cameraLayoutModel.compiledFilePath;
            String str2 = cameraLayoutModel.compiledFilePath;
            if (str2 != null) {
                strLJJLJLI = a0.LJJLJLI(str2, File.separator, str2);
            }
        } else {
            str = null;
        }
        if (!C123100dR.LIZ(str)) {
            return false;
        }
        EditPreviewInfo previewInfo2 = videoPublishEditModel.getPreviewInfo();
        if (previewInfo2 != null && (videoList2 = previewInfo2.getVideoList()) != null) {
            Iterator<EditVideoSegment> it2 = videoList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                EditVideoSegment next = it2.next();
                if (Intrinsics.LJFF(next.getVideoPath(), str)) {
                    if (next != null) {
                        return true;
                    }
                }
            }
        }
        if (strLJJLJLI != null && (previewInfo = videoPublishEditModel.getPreviewInfo()) != null && (videoList = previewInfo.getVideoList()) != null) {
            Iterator<EditVideoSegment> it3 = videoList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                EditVideoSegment next2 = it3.next();
                if (u.LJIIZILJ(next2.getVideoPath(), strLJJLJLI, false)) {
                    if (next2 != null) {
                        return true;
                    }
                }
            }
        }
        CanvasVideoData canvasVideoData = videoPublishEditModel.creativeModel.canvasVideoData;
        if (canvasVideoData != null && (list2 = canvasVideoData.sourceInfo) != null) {
            Iterator<String> it4 = list2.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                String next3 = it4.next();
                if (Intrinsics.LJFF(next3, str)) {
                    if (next3 != null) {
                        return true;
                    }
                }
            }
        }
        if (strLJJLJLI != null) {
            CanvasVideoData canvasVideoData2 = videoPublishEditModel.creativeModel.canvasVideoData;
            if (canvasVideoData2 != null && (list = canvasVideoData2.sourceInfo) != null) {
                Iterator<String> it5 = list.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    String next4 = it5.next();
                    if (u.LJIIZILJ(next4, strLJJLJLI, false)) {
                        if (next4 != null) {
                            return true;
                        }
                    }
                }
            }
            ImageAlbumData imageAlbumData = videoPublishEditModel.creativeModel.imageAlbumModel;
            if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
                Iterator<SingleImageData> it6 = imageList.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    SingleImageData next5 = it6.next();
                    if (u.LJIIZILJ(next5.getSrcImageInfo().getPath(), strLJJLJLI, false)) {
                        if (next5 != null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean LJJJJJL(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.isMvThemeVideoType() && !videoPublishEditModel.isPhotoMvMode()) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJJL(CreativeModel creativeModel) {
        Object c098200Yq;
        k kVarLJJIIZ;
        String str = creativeModel.autoCutAnchorModel.extra;
        if (str == null) {
            return false;
        }
        Object obj = null;
        try {
            C1227904rF.LIZ.getClass();
            n nVar = (n) C1227904rF.LIZIZ(str, n.class);
            if (nVar != null && (kVarLJJIIZ = nVar.LJJIIZ("is_autocut_post_mock_route")) != null) {
                c098200Yq = kVarLJJIIZ.LJIL();
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        String str2 = (String) obj;
        if (!Intrinsics.LJFF(str2, "1") && (str2 == null || !u.LJIJI(str2, "true", true))) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJLI(VideoPublishEditModel videoPublishEditModel) {
        CreativeModel creativeModel;
        MusicBuzModel musicBuzModel;
        List<MusicBuzModel> list;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (musicBuzModel = creativeModel.musicBuzModel) != null && (list = musicBuzModel.extendMusicList) != null && musicBuzModel.music != null && !list.isEmpty()) {
            String strLIZJ = C1429680nJ8.LIZJ(musicBuzModel);
            if (strLIZJ.length() != 0) {
                Iterator<MusicBuzModel> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (!C0PVY.LIZ(C1429680nJ8.LIZJ(it2.next()), strLIZJ)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean LJJJJLL(VideoPublishEditModel videoPublishEditModel) {
        TemplateConsumeData templateConsumeDataLLILLJJLI = C1428470nHB.LLILLJJLI(videoPublishEditModel.creativeModel);
        if (templateConsumeDataLLILLJJLI != null) {
            C1412390mrF c1412390mrFLLILLL = C1428470nHB.LLILLL(templateConsumeDataLLILLJJLI);
            if (c1412390mrFLLILLL.LIZJ() && c1412390mrFLLILLL.LIZIZ() && C1428470nHB.LLIIII(templateConsumeDataLLILLJJLI, EnumC1412640mre.PUGC_TEMPLATE)) {
                return true;
            }
            return false;
        }
        return videoPublishEditModel.creativeModel.ugcTemplateData.isPUGCTemplateFromMVAnchor;
    }

    public static final boolean LJJJJZ(VideoPublishEditModel videoPublishEditModel) {
        if (!Intrinsics.LJFF(videoPublishEditModel.mShootWay, "change_ban_music") && !Intrinsics.LJFF(videoPublishEditModel.mShootWay, "l8_import_music_edit") && !Intrinsics.LJFF(videoPublishEditModel.mShootWay, "l8_music_edit_cml")) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJZI(VideoPublishEditModel videoPublishEditModel) {
        if (!LJJJJZ(videoPublishEditModel) && !Intrinsics.LJFF(videoPublishEditModel.mShootWay, "strip_music_preview") && !Intrinsics.LJFF(videoPublishEditModel.mShootWay, "change_ban_music_ep")) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJLIIL(VideoPublishEditModel videoPublishEditModel) {
        if (C1428470nHB.LLILLJJLI(videoPublishEditModel.creativeModel) != null) {
            if (!C1428470nHB.LJLJJLL(videoPublishEditModel) && !C1428470nHB.LLIIJI(videoPublishEditModel) && !C1428470nHB.LJLJL(videoPublishEditModel) && !LJJJJLL(videoPublishEditModel)) {
                return false;
            }
            return true;
        }
        UgcTemplateData ugcTemplateData = videoPublishEditModel.creativeModel.ugcTemplateData;
        if (!ugcTemplateData.isPUGCTemplateFromAutoCutAnchor && !ugcTemplateData.isUgcTemplateFromAnchor && !ugcTemplateData.isPUgcTemplateFromAnchor && !ugcTemplateData.isPUGCTemplateFromMVAnchor) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJLL(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.isCurrentAutoCutMode()) {
            EnumC1412640mre enumC1412640mreLIZJ = C1412660mrg.LIZJ(videoPublishEditModel.creativeModel.autoCutModel.curTemplateType);
            if (enumC1412640mreLIZJ == EnumC1412640mre.PUGC_TEMPLATE || enumC1412640mreLIZJ == EnumC1412640mre.UGC_TEMPLATE) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final NLEModel LJJJZ(VideoPublishEditModel videoPublishEditModel) {
        String nleData = videoPublishEditModel.getNleData();
        if (nleData != null && nleData.length() != 0) {
            C0FGC.LIZ(2);
            NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
            nLEEditorLIZ.restore(videoPublishEditModel.getNleData());
            return nLEEditorLIZ.getModel();
        }
        return null;
    }

    public static final boolean LJJLI(VideoPublishEditModel videoPublishEditModel) {
        CreativeModel creativeModel;
        MusicBuzModel musicBuzModel;
        MusicObject musicObject;
        AVMusic aVMusicExtractAVMusic;
        if (videoPublishEditModel == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (musicBuzModel = creativeModel.musicBuzModel) == null || (musicObject = musicBuzModel.music) == null || (aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicObject)) == null) {
            return false;
        }
        if (C1459090o4Z.LIZ(aVMusicExtractAVMusic) && aVMusicExtractAVMusic.getMusicEndTime() > 0) {
            int musicEndTime = aVMusicExtractAVMusic.getMusicEndTime() - aVMusicExtractAVMusic.getMusicStart();
            if (musicEndTime > LJJL(videoPublishEditModel, 0, null, 3) || Math.abs(musicEndTime - LJJL(videoPublishEditModel, 0, null, 3)) <= 200) {
                return false;
            }
            return true;
        }
        if (Math.abs(aVMusicExtractAVMusic.getDuration() - LJJL(videoPublishEditModel, 0, null, 3)) <= 200 || aVMusicExtractAVMusic.getDuration() >= LJJL(videoPublishEditModel, 0, null, 3)) {
            return false;
        }
        return true;
    }

    public static final boolean LJJLIIIIJ(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        NLETemplateModel nLETemplateModelRestore;
        VecNLETrackSPtr tracks;
        Iterator<String> it2 = videoPublishEditModel.creativeModel.pugcTemplateData.featureList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (Intrinsics.LJFF(it2.next(), "UGC_ASYNC_I2V")) {
                Iterator<String> it3 = videoPublishEditModel.creativeModel.pugcTemplateData.featureList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (Intrinsics.LJFF(it3.next(), "TEMPLATE_MATTING")) {
                        if (videoPublishEditModel.creativeModel.pugcTemplateData.iv2AsyncAndMatting != EnumC551560LkA.DONE.getValue()) {
                            z = true;
                        }
                    }
                }
            }
        }
        z = false;
        if (C123100dR.LIZ(videoPublishEditModel.creativeModel.pugcTemplateData.combineEffectNLETemplateModel) && (nLETemplateModelRestore = NLETemplateModel.restore(videoPublishEditModel.creativeModel.pugcTemplateData.combineEffectNLETemplateModel)) != null && (tracks = nLETemplateModelRestore.getTracks()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<NLETrack> it4 = tracks.iterator();
            while (it4.hasNext()) {
                C19719612Di.LJJI(it4.next().getSlots(), arrayList);
            }
            if (!arrayList.isEmpty()) {
                Iterator it5 = arrayList.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    NLETrackSlot nLETrackSlot = (NLETrackSlot) it5.next();
                    if (C348520DlS.LJFF(nLETrackSlot) && !nLETrackSlot.getFeatureList().contains("UGC_ASYNC_I2V")) {
                        if (C358630E4f.LIZ() && videoPublishEditModel.creativeModel.pugcTemplateData.magicProcessState != EnumC551570LkB.FINISHED.getValue()) {
                            return true;
                        }
                    }
                }
            }
        }
        if (z) {
            return true;
        }
        return false;
    }

    public static final boolean LJJLIIIJ(VideoPublishEditModel videoPublishEditModel) {
        NLEModel nleModel;
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_enable_global_effect_canvas_adapt_android", true, false) || videoPublishEditModel == null || (nleModel = videoPublishEditModel.getNleModel()) == null) {
            return false;
        }
        int i = C365960EWk.LIZ;
        VecNLETrackSPtr tracks = nleModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (nLETrack.getTrackType() == NLETrackType.EFFECT) {
                arrayList.add(nLETrack);
            }
        }
        int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                int i4 = 0;
                for (NLETrackSlot nLETrackSlot : ((NLETrack) obj).getSlots()) {
                    int i5 = i4 + 1;
                    if (i4 >= 0) {
                        if (NLESegmentEffect.dynamicCast(nLETrackSlot.getMainSegment()) != null) {
                            return true;
                        }
                        i4 = i5;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return false;
    }

    public static final NLEModel LJJLIIIJILLIZJL(VideoPublishEditModel videoPublishEditModel) {
        if (C350300DoK.LIZ()) {
            if ((videoPublishEditModel.getNleModel() == null || videoPublishEditModel.getNleDataChange()) && C123100dR.LIZ(videoPublishEditModel.getNleData())) {
                C0FGC.LIZ(2);
                NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
                nLEEditorLIZ.restore(videoPublishEditModel.getNleData());
                videoPublishEditModel.setNleModel(nLEEditorLIZ.getModel());
                videoPublishEditModel.setNleDataChange(false);
            }
            return videoPublishEditModel.getNleModel();
        }
        if (videoPublishEditModel.getNleModel() == null && C123100dR.LIZ(videoPublishEditModel.getNleData())) {
            C0FGC.LIZ(2);
            NLEEditor nLEEditorLIZ2 = C346630DiP.LIZ();
            nLEEditorLIZ2.restore(videoPublishEditModel.getNleData());
            videoPublishEditModel.setNleModel(nLEEditorLIZ2.getModel());
        }
        return videoPublishEditModel.getNleModel();
    }

    public static final String LJJLIIIJJI(AnchorCommonStruct anchorCommonStruct) {
        String strLJIL = null;
        if (anchorCommonStruct == null) {
            return null;
        }
        try {
            new p();
            k kVarLJJIIZ = p.LIZJ(anchorCommonStruct.getExtra()).LJIILIIL().LJJIIZ("dispatch_type");
            if (kVarLJJIIZ == null) {
                return null;
            }
            strLJIL = kVarLJJIIZ.LJIL();
            return strLJIL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return strLJIL;
        }
    }

    public static final boolean LJJLIIIJJIZ(VideoPublishEditModel videoPublishEditModel) {
        StickerNewEngineModel stickerNewEngineModel;
        Boolean bool;
        Boolean useTextNewEngineInMultiPhotoMode;
        if (C1428470nHB.LJLIIL(videoPublishEditModel)) {
            ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
            if (imageAlbumData != null && (useTextNewEngineInMultiPhotoMode = imageAlbumData.getUseTextNewEngineInMultiPhotoMode()) != null) {
                return useTextNewEngineInMultiPhotoMode.booleanValue();
            }
            if (((Number) C259920AGo.LIZ.getValue()).intValue() <= 0 && videoPublishEditModel.creativeModel.onThisDayData.isFromOnThisDay() && !C566870MLd.LIZ(videoPublishEditModel.creativeModel.onThisDayData)) {
                ImageAlbumData imageAlbumData2 = videoPublishEditModel.getImageAlbumData();
                if (imageAlbumData2 != null) {
                    imageAlbumData2.setUseTextNewEngineInMultiPhotoMode(Boolean.FALSE);
                    return false;
                }
                return false;
            }
            ImageAlbumData imageAlbumData3 = videoPublishEditModel.getImageAlbumData();
            if (imageAlbumData3 == null) {
                return true;
            }
            imageAlbumData3.setUseTextNewEngineInMultiPhotoMode(Boolean.TRUE);
            return true;
        }
        if (C1428470nHB.LLIIIJ(videoPublishEditModel)) {
            videoPublishEditModel.creativeModel.stickerModel.textUseNewEngine = Boolean.FALSE;
            return false;
        }
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        if (creativeModel != null && (stickerNewEngineModel = creativeModel.stickerModel) != null && (bool = stickerNewEngineModel.textUseNewEngine) != null) {
            return bool.booleanValue();
        }
        if (((Number) C259920AGo.LIZ.getValue()).intValue() <= 0 && videoPublishEditModel.creativeModel.onThisDayData.isFromOnThisDay() && !C566870MLd.LIZ(videoPublishEditModel.creativeModel.onThisDayData)) {
            videoPublishEditModel.creativeModel.stickerModel.textUseNewEngine = Boolean.FALSE;
            return false;
        }
        videoPublishEditModel.creativeModel.stickerModel.textUseNewEngine = Boolean.TRUE;
        return true;
    }

    public static final PublishOutput LJJLIIIJL(VideoPublishEditModel videoPublishEditModel) {
        Object c098200Yq;
        List<AnchorCommonStruct> originalAnchors = null;
        try {
            LocationStickerModel locationStickerModel = (LocationStickerModel) C13LP.LJJJLZIJ(0, videoPublishEditModel.creativeModel.stickerModel.locationStickerModels);
            if (locationStickerModel != null) {
                c098200Yq = locationStickerModel.getPoiData();
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        PoiData poiData = (PoiData) c098200Yq;
        String creationId = videoPublishEditModel.getCreationId();
        String contactVideoPathAsKey = videoPublishEditModel.getContactVideoPathAsKey();
        String musicId = videoPublishEditModel.getMusicId();
        boolean zIsCommerceMusic = videoPublishEditModel.isCommerceMusic();
        boolean zIsOriginalSound = videoPublishEditModel.isOriginalSound();
        List arrayList = videoPublishEditModel.creativeModel.mediaLocationMetaDataList;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        EditPostModel editPostModel = videoPublishEditModel.creativeModel.editPostModel;
        if (editPostModel != null) {
            originalAnchors = editPostModel.getOriginalAnchors();
        }
        return new PublishOutput(creationId, contactVideoPathAsKey, musicId, zIsCommerceMusic, zIsOriginalSound, poiData, arrayList, originalAnchors);
    }

    public static final int LJJLIIIJLJLI(VideoPublishEditModel videoPublishEditModel) {
        List<StickerItemModel> list;
        InfoStickerModel infoStickerModel = videoPublishEditModel.getInfoStickerModel();
        int size = 0;
        if (infoStickerModel != null && (list = infoStickerModel.stickers) != null) {
            ArrayList arrayList = new ArrayList();
            for (StickerItemModel stickerItemModel : list) {
                int i = stickerItemModel.type;
                if (i == 0 || i == 11 || i == 10) {
                    arrayList.add(stickerItemModel);
                }
            }
            size = arrayList.size();
        }
        return size + LJJJ(videoPublishEditModel);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long LJJLIIIJLLLLLLLZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r8) {
        /*
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r0 = r8.getPreviewInfo()
            r7 = 0
            if (r0 == 0) goto L61
            java.util.List r0 = r0.getVideoList()
            if (r0 == 0) goto L61
            java.util.Iterator r6 = r0.iterator()
            r4 = 0
        L14:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L60
            java.lang.Object r3 = r6.next()
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r3 = (com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment) r3
            boolean r0 = X.C298040BmE.LIZ()
            if (r0 == 0) goto L3a
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            com.ss.android.ugc.aweme.port.internal.IMediaCacheService r1 = r0.LJIILL()
            java.lang.String r0 = r3.getVideoPath()
            long r0 = r1.getFileSize(r0)
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 > 0) goto L50
        L3a:
            java.lang.String r0 = r3.getVideoPath()
            boolean r0 = X.C2471909mP.LJJIIZI(r0)
            if (r0 == 0) goto L52
            java.lang.String r0 = r3.getVideoPath()
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            long r0 = X.C570280MYg.LJ(r0)
        L50:
            long r4 = r4 + r0
            goto L14
        L52:
            X.0VSJ r1 = new X.0VSJ
            java.lang.String r0 = r3.getVideoPath()
            r1.<init>(r0)
            long r0 = r1.length()
            goto L50
        L60:
            r7 = r4
        L61:
            r0 = 1024(0x400, float:1.435E-42)
            long r0 = (long) r0
            long r7 = r7 / r0
            long r7 = r7 / r0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1416310mxZ.LJJLIIIJLLLLLLLZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):long");
    }

    public static final boolean LJJLIIJ(VideoPublishEditModel videoPublishEditModel) {
        return Intrinsics.LJFF(LJJIJIIJI(videoPublishEditModel, null, false), "autocut_algo_lyric");
    }

    public static final void LIZ(VideoPublishEditModel videoPublishEditModel, Map<String, String> map) {
        String str;
        String str2;
        String str3;
        LocationStickerModel locationStickerModel = (LocationStickerModel) C13LP.LJJJLZIJ(0, videoPublishEditModel.creativeModel.stickerModel.locationStickerModels);
        if (locationStickerModel == null) {
            return;
        }
        PoiData poiData = locationStickerModel.getPoiData();
        String str4 = null;
        if (poiData == null || (str = poiData.poiId) == null) {
            str = "";
        }
        map.put("sticker_poi_id", str);
        map.put("poi_enter_method", "poi_sticker");
        EnumC1466210oG3 theme = locationStickerModel.getTheme();
        if (theme != null) {
            map.put("sticker_type", String.valueOf(Integer.valueOf(theme.getType()).intValue()));
        }
        Boolean boolIsCutOff = locationStickerModel.isCutOff();
        if (boolIsCutOff != null) {
            if (boolIsCutOff.booleanValue()) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_cut_off", str3);
        }
        if (videoPublishEditModel.isPoi()) {
            PoiData poiData2 = videoPublishEditModel.getPoiData();
            if (poiData2 != null) {
                str2 = poiData2.poiId;
            } else {
                str2 = null;
            }
            PoiData poiData3 = locationStickerModel.getPoiData();
            if (poiData3 != null) {
                str4 = poiData3.poiId;
            }
            if (Intrinsics.LJFF(str2, str4)) {
                map.put("is_sticker_poi", "1");
            } else {
                map.put("is_sticker_poi", CardStruct.IStatusCode.DEFAULT);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5, com.ss.android.ugc.aweme.common.PublishSettings r6) {
        /*
            if (r6 != 0) goto L3
            return
        L3:
            X.0mxb r0 = r6.privacySetting
            int[] r1 = X.C1416320mxa.LIZ
            int r0 = r0.ordinal()
            r4 = r1[r0]
            r3 = 3
            r2 = 0
            r1 = 1
            if (r4 == r1) goto L17
            r0 = 2
            if (r4 == r0) goto Lab
            if (r4 == r3) goto L18
        L17:
            r0 = 1
        L18:
            r5.isPrivate = r0
            boolean r0 = r6.allowComment
            if (r0 != r1) goto L1f
            r3 = 0
        L1f:
            r5.commentSetting = r3
            boolean r0 = r6.allowDuet
            if (r0 != r1) goto La8
            r0 = 0
        L26:
            r5.reactDuetSetting = r0
            boolean r0 = r6.allowStitch
            if (r0 == r1) goto L2d
            r2 = 1
        L2d:
            r5.stitchSetting = r2
            java.lang.String r0 = r6.caption
            java.lang.String r2 = ""
            if (r0 != 0) goto L36
            r0 = r2
        L36:
            r5.setTitle(r0)
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0nYH r1 = r0.getPublishService()
            java.lang.String r0 = r5.getTitle()
            if (r0 != 0) goto L48
            r0 = r2
        L48:
            java.util.List r0 = r1.LJJLIIIJL(r0)
            r5.setStructList(r0)
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0nYH r1 = r0.getPublishService()
            java.lang.String r0 = r6.caption
            if (r0 == 0) goto L5c
            r2 = r0
        L5c:
            java.util.List r0 = r5.getStructList()
            if (r0 != 0) goto L64
            X.13BV r0 = X.C13BV.INSTANCE
        L64:
            kotlin.Pair r2 = r1.LJIILIIL(r2, r0)
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r5.creativeModel
            com.ss.android.ugc.aweme.creative.model.publish.PostPageModel r0 = r0.postPageModel
            com.ss.android.ugc.aweme.creative.model.publish.CaptionModel r1 = r0.captionModel
            java.lang.Object r0 = r2.getFirst()
            java.lang.String r0 = (java.lang.String) r0
            r1.markupText = r0
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r5.creativeModel
            com.ss.android.ugc.aweme.creative.model.publish.PostPageModel r0 = r0.postPageModel
            com.ss.android.ugc.aweme.creative.model.publish.CaptionModel r1 = r0.captionModel
            java.lang.Object r0 = r2.getSecond()
            java.util.List r0 = (java.util.List) r0
            r1.markupExtra = r0
            java.lang.Double r0 = r6.coverImageTimeStamp
            if (r0 == 0) goto La6
            double r1 = r0.doubleValue()
            float r0 = (float) r1
        L8d:
            r5.setVideoCoverStartTm(r0)
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r5.creativeModel
            com.ss.android.ugc.aweme.creative.model.publish.PostPageModel r1 = r0.postPageModel
            boolean r0 = r6.isDirectPost()
            r1.isDirectPublishByCC = r0
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0nYH r0 = r0.getPublishService()
            r0.LJJJJ(r5)
            return
        La6:
            r0 = 0
            goto L8d
        La8:
            r0 = 1
            goto L26
        Lab:
            r0 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1416310mxZ.LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.ss.android.ugc.aweme.common.PublishSettings):void");
    }

    public static final void LJIL(VideoPublishEditModel videoPublishEditModel, String str) {
        String str2;
        String str3 = "";
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        videoPublishEditModel.setTitle(str2);
        CaptionModel captionModel = videoPublishEditModel.creativeModel.postPageModel.captionModel;
        if (str == null) {
            str = "";
        }
        captionModel.markupText = str;
        InterfaceC1439070nYH publishService = C0CHQ.LIZ().getPublishService();
        String title = videoPublishEditModel.getTitle();
        if (title != null) {
            str3 = title;
        }
        videoPublishEditModel.setStructList(publishService.LJJLIIIJL(str3));
        C0CHQ.LIZ().getPublishService().LJJJJ(videoPublishEditModel);
    }

    public static final String LJJIJ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        String str;
        String extra;
        CelebrationData celebrationData;
        Integer celebrationType;
        NLETrack mainTrack;
        String str2;
        String str3;
        String str4;
        if (videoPublishEditModel.isCurrentAutoCutMode()) {
            return videoPublishEditModel.getTTTemplateIdForAutoCut();
        }
        String templateId = null;
        if (C1428470nHB.LLIIIZ(videoPublishEditModel)) {
            TemplateConsumeData templateConsumeDataLLILLJJLI = C1428470nHB.LLILLJJLI(videoPublishEditModel.creativeModel);
            if (templateConsumeDataLLILLJJLI != null && (str4 = templateConsumeDataLLILLJJLI.templateId) != null && str4.length() > 0) {
                return str4;
            }
            return videoPublishEditModel.creativeModel.mvModel.templateId;
        }
        if (!C1428470nHB.LJLJL(videoPublishEditModel) && !C1428470nHB.LJLJJLL(videoPublishEditModel) && !LJJJJLL(videoPublishEditModel)) {
            if (C1428470nHB.LLIIJI(videoPublishEditModel) && (z || Intrinsics.LJFF(videoPublishEditModel.creativeModel.ugcTemplateData.showOriginTemplateAnchor, Boolean.TRUE))) {
                TemplateConsumeData templateConsumeDataLLILLJJLI2 = C1428470nHB.LLILLJJLI(videoPublishEditModel.creativeModel);
                if (templateConsumeDataLLILLJJLI2 != null && (str3 = templateConsumeDataLLILLJJLI2.templateId) != null && str3.length() > 0) {
                    return str3;
                }
                return videoPublishEditModel.creativeModel.ugcTemplateData.ugcTemplateId;
            }
            if (videoPublishEditModel.isCutSameVideoType()) {
                AVUploadMiscInfoStruct uploadMiscInfoStruct = videoPublishEditModel.getUploadMiscInfoStruct();
                if (uploadMiscInfoStruct == null) {
                    return null;
                }
                return uploadMiscInfoStruct.mvThemeId;
            }
            if (LJJJJJL(videoPublishEditModel)) {
                AVUploadMiscInfoStruct uploadMiscInfoStruct2 = videoPublishEditModel.getUploadMiscInfoStruct();
                if (uploadMiscInfoStruct2 == null) {
                    return null;
                }
                return uploadMiscInfoStruct2.mvThemeId;
            }
            if (C1428470nHB.LJLI(videoPublishEditModel) && !C1428470nHB.LJJLI(videoPublishEditModel)) {
                TemplateMobParams templateMobParams = videoPublishEditModel.creativeModel.mixEditingModel.templateMobParams;
                if (templateMobParams == null || (str2 = templateMobParams.autocutTemplateId) == null) {
                    return "";
                }
                return str2;
            }
            NLEModel nleModel = videoPublishEditModel.getNleModel();
            if (nleModel != null && (mainTrack = nleModel.getMainTrack()) != null) {
                extra = mainTrack.getExtra("using_template_id");
            } else {
                extra = null;
            }
            if (C123100dR.LIZ(extra) && (celebrationData = videoPublishEditModel.creativeModel.celebrationData) != null && (celebrationType = celebrationData.getCelebrationType()) != null && celebrationType.intValue() == 2) {
                CelebrationData celebrationData2 = videoPublishEditModel.creativeModel.celebrationData;
                if (celebrationData2 != null) {
                    templateId = celebrationData2.getTemplateId();
                }
                if (Intrinsics.LJFF(extra, templateId)) {
                    return extra;
                }
            }
            String str5 = videoPublishEditModel.creativeModel.templateSchemaData.schemaTag;
            if (str5 == null || str5.length() == 0) {
                return "";
            }
            return extra;
        }
        TemplateConsumeData templateConsumeDataLLILLJJLI3 = C1428470nHB.LLILLJJLI(videoPublishEditModel.creativeModel);
        if (templateConsumeDataLLILLJJLI3 != null && (str = templateConsumeDataLLILLJJLI3.templateId) != null && str.length() > 0) {
            return str;
        }
        return videoPublishEditModel.creativeModel.ugcTemplateData.ugcTemplateId;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021 A[PHI: r5
      0x0021: PHI (r5v1 com.bytedance.ies.nle.editor_jni.NLEModel) = (r5v0 com.bytedance.ies.nle.editor_jni.NLEModel), (r5v2 com.bytedance.ies.nle.editor_jni.NLEModel) binds: [B:3:0x0007, B:11:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJJIJIIJIL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4, com.bytedance.ies.nle.editor_jni.NLEModel r5) {
        /*
            r0 = 2
            X.C0FGC.LIZ(r0)
            r3 = 0
            java.lang.String r2 = "using_template_type"
            if (r5 != 0) goto L21
            boolean r0 = X.C350300DoK.LIZ()
            if (r0 == 0) goto L42
            boolean r0 = r4.getNleDataChange()
            if (r0 != 0) goto L42
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = r4.getNleModel()
            if (r0 == 0) goto L42
            com.bytedance.ies.nle.editor_jni.NLEModel r5 = r4.getNleModel()
            if (r5 == 0) goto L81
        L21:
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = r5.getMainTrack()
            if (r0 == 0) goto L81
            java.lang.String r0 = r0.getExtra(r2)
            if (r0 == 0) goto L81
            java.lang.Integer r0 = X.C2095008Iq.LJIIJJI(r0)
            if (r0 == 0) goto L81
            int r0 = r0.intValue()
            X.0mre r0 = X.C1412660mrg.LIZJ(r0)
            if (r0 == 0) goto L81
            java.lang.String r0 = X.C1412630mrd.LIZLLL(r0)
            return r0
        L42:
            com.bytedance.ies.nle.editor_jni.NLEEditor r1 = X.C346630DiP.LIZ()
            java.lang.String r0 = r4.getNleData()
            r1.restore(r0)
            com.bytedance.ies.nle.editor_jni.NLEModel r1 = r1.getModel()
            boolean r0 = X.C350300DoK.LIZ()
            if (r0 == 0) goto L5e
            r0 = 0
            r4.setNleDataChange(r0)
            r4.setNleModel(r1)
        L5e:
            if (r1 == 0) goto L81
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = r1.getMainTrack()
            if (r0 == 0) goto L81
            java.lang.String r0 = r0.getExtra(r2)
            if (r0 == 0) goto L81
            java.lang.Integer r0 = X.C2095008Iq.LJIIJJI(r0)
            if (r0 == 0) goto L81
            int r0 = r0.intValue()
            X.0mre r0 = X.C1412660mrg.LIZJ(r0)
            if (r0 == 0) goto L81
            java.lang.String r0 = X.C1412630mrd.LIZLLL(r0)
            return r0
        L81:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1416310mxZ.LJJIJIIJIL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.bytedance.ies.nle.editor_jni.NLEModel):java.lang.String");
    }

    public static final boolean LJJJLZIJ(VideoPublishEditModel videoPublishEditModel, int i) {
        int previewVideoLength;
        EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
        if (previewInfo != null) {
            previewVideoLength = previewInfo.getPreviewVideoLength();
        } else {
            previewVideoLength = 0;
        }
        if (previewVideoLength <= i) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJJIJIIJI(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5, com.bytedance.ies.nle.editor_jni.NLEModel r6, boolean r7) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1416310mxZ.LJJIJIIJI(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.bytedance.ies.nle.editor_jni.NLEModel, boolean):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r0 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJJL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5, int r6, com.ss.android.ugc.aweme.creative.model.music.AVMusic r7, int r8) {
        /*
            r0 = r8 & 1
            if (r0 == 0) goto L5
            r6 = 0
        L5:
            r0 = r8 & 2
            if (r0 == 0) goto La
            r7 = 0
        La:
            if (r5 == 0) goto L45
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r5.creativeModel
            if (r0 == 0) goto L45
            com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r0 = r0.musicBuzModel
            if (r0 == 0) goto L45
            int r3 = r0.musicMaxLoopDuration
        L16:
            if (r6 > 0) goto L27
            if (r5 == 0) goto L43
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = r5.getNleModel()
            if (r0 == 0) goto L43
            long r1 = r0.getDuration()
            int r0 = (int) r1
        L25:
            int r6 = r0 / 1000
        L27:
            if (r3 <= 0) goto L31
            if (r7 == 0) goto L32
            boolean r0 = r7.isUnlimitedMusic()
        L2f:
            if (r0 == 0) goto L47
        L31:
            return r6
        L32:
            if (r5 == 0) goto L47
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r5.creativeModel
            if (r0 == 0) goto L47
            com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r0 = r0.musicBuzModel
            if (r0 == 0) goto L47
            com.ss.android.ugc.aweme.creative.model.music.MusicObject r0 = r0.music
            if (r0 == 0) goto L47
            boolean r0 = r0.isUnlimitedMusic
            goto L2f
        L43:
            r0 = 0
            goto L25
        L45:
            r3 = 0
            goto L16
        L47:
            java.lang.Class<com.ss.android.ugc.aweme.services.music.IMusicBridgeService> r0 = com.ss.android.ugc.aweme.services.music.IMusicBridgeService.class
            r1 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.services.music.IMusicBridgeService r0 = (com.ss.android.ugc.aweme.services.music.IMusicBridgeService) r0
            if (r0 == 0) goto L60
            int r0 = r0.defaultMusicMaxLoopDuration()
        L5b:
            int r6 = java.lang.Math.min(r6, r0)
            return r6
        L60:
            r0 = 59400(0xe808, float:8.3237E-41)
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1416310mxZ.LJJL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, int, com.ss.android.ugc.aweme.creative.model.music.AVMusic, int):int");
    }
}
