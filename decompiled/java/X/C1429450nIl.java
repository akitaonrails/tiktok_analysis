package X;

import android.os.SystemClock;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.creative.model.AutoCutAnchorModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenPrompt;
import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateAsset;
import com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCPromptInfo;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModelStatus;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.ImageInfo;
import com.ss.android.ugc.aweme.experiment.AnchorConfig;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mediachoose.helper.AlbumAigc;
import com.ss.android.ugc.aweme.mediachoose.helper.AlbumAigcAnchor;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol.AlbumAiContentService;
import com.ss.android.ugc.aweme.shortvideo.model.DuetAndStitchRouterConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MvModel;
import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlot;
import com.ss.android.ugc.aweme.shortvideo.model.TransAnchorData;
import com.ss.android.ugc.aweme.shortvideo.template.TemplatePostInfo;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.AiMeStyleInfo;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AFwS306S0000000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0nIl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429450nIl {
    public static final C1429450nIl LIZ = new C1429450nIl();
    public static final Set<Integer> LIZIZ = C13LQ.LJLIIL(new Integer[]{Integer.valueOf(EnumC1430380nKG.MV_TEMPLATE.getTYPE()), Integer.valueOf(EnumC1430380nKG.PHOTO_MV_ANCHOR.getTYPE()), Integer.valueOf(EnumC1430380nKG.ANCHOR_UGC_TEMPLATE.getTYPE()), Integer.valueOf(EnumC1430380nKG.ANCHOR_AUTO_CUT.getTYPE()), Integer.valueOf(EnumC1430380nKG.ANCHOR_PUGC_TEMPLATE.getTYPE()), Integer.valueOf(EnumC1430380nKG.ANCHOR_PHOTO_MODE_TEMPLATE.getTYPE()), Integer.valueOf(EnumC1430380nKG.ANCHOR_TT_CC_TEMPLATE.getTYPE()), Integer.valueOf(EnumC1430380nKG.ANCHOR_AIGT_TEMPLATE.getTYPE()), Integer.valueOf(EnumC1430380nKG.ANCHOR_SGT_TEMPLATE.getTYPE())});

    public static final void LIZIZ(List<CreateAnchorInfo> list, VideoPublishEditModel videoPublishEditModel) {
        LIZLLL(list, videoPublishEditModel, null, null, false, 28);
    }

    public static final void LIZJ(List list, VideoPublishEditModel videoPublishEditModel, Map map) {
        LIZLLL(list, videoPublishEditModel, map, "stickers", false, 16);
    }

    public static String LJJIJ() {
        return C290590BaD.LIZ() ? "https://p16-common.tiktokcdn-us.com/obj/tiktok-obj/20px_anchor_TemplatesCards3x.png?biz_tag=anchor.ugc_photo_template" : "https://p16.tiktokcdn.com/obj/tiktok-obj/20px_anchor_template3x.png";
    }

    public static final void LJIIIZ(List<CreateAnchorInfo> list) {
        list.add(new CreateAnchorInfo(70, "Create AI vatars", "aweme://aivatar", "", "", "", Long.valueOf(System.currentTimeMillis()), "", "", "", "", Boolean.TRUE, true, null, null, false, null));
    }

    public static int LJJIII(List list) {
        Iterator it2 = C13LP.LJJJJI(list).iterator();
        int i = 0;
        while (it2.hasNext()) {
            String lowerCase = ((String) it2.next()).toLowerCase(Locale.ROOT);
            int iHashCode = lowerCase.hashCode();
            if (iHashCode != 100313435) {
                if (iHashCode != 106642994) {
                    if (iHashCode == 112202875 && lowerCase.equals("video")) {
                        i |= 2;
                    }
                } else if (lowerCase.equals("photo")) {
                    i |= 1;
                }
            } else if (lowerCase.equals("image")) {
                i |= 1;
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject LJJIIZI(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r6) {
        /*
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r6.creativeModel
            com.ss.android.ugc.aweme.creative.model.UgcTemplateData r0 = r0.ugcTemplateData
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r5 = r0.ugcTemplateOriginAnchor
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            r0 = 0
            if (r5 == 0) goto L19
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r5.getThumbnail()     // Catch: java.lang.Exception -> L52
            if (r1 == 0) goto L19
            java.util.List r1 = r1.getUrlList()     // Catch: java.lang.Exception -> L52
            goto L1a
        L19:
            r1 = r0
        L1a:
            r3 = 0
            if (r1 == 0) goto L24
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Exception -> L52
            if (r1 != 0) goto L24
            goto L26
        L24:
            r1 = 1
            goto L27
        L26:
            r1 = 0
        L27:
            if (r1 != 0) goto L42
            java.lang.String r2 = "icon_url"
            if (r5 == 0) goto L3f
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r5.getThumbnail()     // Catch: java.lang.Exception -> L52
            if (r1 == 0) goto L3f
            java.util.List r1 = r1.getUrlList()     // Catch: java.lang.Exception -> L52
            if (r1 == 0) goto L3f
            java.lang.Object r0 = r1.get(r3)     // Catch: java.lang.Exception -> L52
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L52
        L3f:
            r4.put(r2, r0)     // Catch: java.lang.Exception -> L52
        L42:
            java.lang.String r1 = "third_id"
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r6.creativeModel     // Catch: java.lang.Exception -> L52
            com.ss.android.ugc.aweme.creative.model.UgcTemplateData r0 = r0.ugcTemplateData     // Catch: java.lang.Exception -> L52
            java.lang.String r0 = r0.ugcTemplateId     // Catch: java.lang.Exception -> L52
            if (r0 != 0) goto L4e
            java.lang.String r0 = ""
        L4e:
            r4.put(r1, r0)     // Catch: java.lang.Exception -> L52
            return r4
        L52:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1429450nIl.LJJIIZI(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):org.json.JSONObject");
    }

    public static final void LJJIJIIJI(List<CreateAnchorInfo> list) {
        ArrayList arrayList = (ArrayList) list;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (((CreateAnchorInfo) it2.next()).getType() == 97) {
                C19719612Di.LJJIIJ(arrayList, new AwS601S0100000_22((List) C1857007Pc.LIZIZ.getValue(), (List<CreateAnchorInfo>) 292), true);
                return;
            }
        }
    }

    public static final void LIZ(List<CreateAnchorInfo> list, VideoPublishEditModel videoPublishEditModel) {
        C548590LfN.LIZ.getClass();
        List listLJIIIIZZ = C548590LfN.LIZLLL().LJIIIIZZ(videoPublishEditModel.creativeModel, AFwS306S0000000_22.get$arr$(10));
        if (listLJIIIIZZ != null) {
            ((ArrayList) list).addAll(listLJIIIIZZ);
        }
    }

    public static final void LJ(List<CreateAnchorInfo> list, VideoPublishEditModel videoPublishEditModel) {
        if (C0A15.LIZ() && C565160MEo.LIZIZ(videoPublishEditModel) && videoPublishEditModel.getAILivePhotoModel().LJII()) {
            ArrayList arrayList = (ArrayList) list;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((CreateAnchorInfo) it2.next()).getType() == 97) {
                    return;
                }
            }
            String strLIZ = C0MED.LIZ(C0MEB.ANCHOR_NAME, new Object[0]);
            ArrayList<EnumC1430380nKG> arrayList2 = C1429550nIv.LIZ;
            arrayList.add(new CreateAnchorInfo(97, strLIZ, "", "", "", C1429550nIv.LIZ(EnumC1430380nKG.AI_LIVE_PHOTO_ANCHOR_TYPE, "https://p16.tiktokcdn.com/obj/tiktok-obj/ai_live.png"), Long.valueOf(SystemClock.elapsedRealtime()), "", "", "", "", Boolean.TRUE, true, null, null, false, null));
        }
    }

    public static final void LJI(List<CreateAnchorInfo> list, VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        AiMeStyleInfo aiMeStyleInfo;
        if (!C535390KzB.LIZ()) {
            return;
        }
        ArrayList arrayList = (ArrayList) list;
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (((CreateAnchorInfo) it2.next()).getType() == 82) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("third_id", videoPublishEditModel.creativeModel.aiSelfModel.styleId);
                jSONObject.put("add_from", 1);
                String str = videoPublishEditModel.creativeModel.aiSelfModel.anchorIconUri;
                if (str != null && str.length() != 0) {
                    jSONObject.put("icon_url", videoPublishEditModel.creativeModel.aiSelfModel.anchorIconUri);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            String str2 = videoPublishEditModel.creativeModel.aiSelfModel.styleName;
            if (str2 != null) {
                arrayList.add(LJJIIJ(LIZ, str2, jSONObject));
            }
        }
        for (TimeSpeedModelExtension timeSpeedModelExtension : videoPublishEditModel.getFinalVideoList()) {
            if (timeSpeedModelExtension != null && (aiMeStyleInfo = timeSpeedModelExtension.getAiMeStyleInfo()) != null) {
                String styleName = aiMeStyleInfo.getStyleName();
                String publishStyleId = aiMeStyleInfo.getPublishStyleId();
                String anchorIconUri = aiMeStyleInfo.getAnchorIconUri();
                JSONObject jSONObject2 = new JSONObject();
                if (publishStyleId != null) {
                    jSONObject2.put("third_id", publishStyleId);
                    jSONObject2.put("add_from", 1);
                    if (anchorIconUri != null && anchorIconUri.length() != 0) {
                        jSONObject2.put("icon_url", anchorIconUri);
                    }
                    C1429450nIl c1429450nIl = LIZ;
                    if (styleName == null) {
                        styleName = "";
                    }
                    arrayList.add(LJJIIJ(c1429450nIl, styleName, jSONObject2));
                    return;
                }
            }
        }
    }

    public static final boolean LJIILJJIL(List<CreateAnchorInfo> list, VideoPublishEditModel videoPublishEditModel) throws JSONException {
        NLEModel nLEModelLIZIZ;
        String templateId;
        String templateId2;
        String templateType;
        String dispatchType;
        if (!C527950KnB.LIZIZ() || !videoPublishEditModel.isCurrentAutoCutMode() || videoPublishEditModel.shouldReuseAutoCutAnchor() || C1416310mxZ.LJJLIIJ(videoPublishEditModel) || (nLEModelLIZIZ = C539970LFr.LIZIZ(videoPublishEditModel)) == null || ((ArrayList) s.LJIIZILJ(nLEModelLIZIZ)).size() > 35) {
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        C1412410mrH.LIZ.getClass();
        TemplatePostInfo templatePostInfoLIZ = C1412410mrH.LIZ(videoPublishEditModel);
        String strLJI = null;
        if (templatePostInfoLIZ == null || (templateId = templatePostInfoLIZ.getTemplateId()) == null || templateId.length() == 0) {
            return false;
        }
        if (templatePostInfoLIZ != null) {
            templateId2 = templatePostInfoLIZ.getTemplateId();
        } else {
            templateId2 = null;
        }
        jSONObject.put("third_id", templateId2);
        if (templatePostInfoLIZ != null) {
            templateType = templatePostInfoLIZ.getTemplateType();
        } else {
            templateType = null;
        }
        EnumC1430380nKG enumC1430380nKG = (EnumC1430380nKG) C298980Bnk.LIZJ(C1394440mOI.LJFF(C1394440mOI.LJII(templateType)));
        if (enumC1430380nKG == null) {
            enumC1430380nKG = EnumC1430380nKG.ANCHOR_AUTO_CUT;
        }
        if (C298980Bnk.LIZ() && !C0AYL.LIZ(Integer.valueOf(enumC1430380nKG.getTYPE()))) {
            return false;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("sub_type", templateType);
        if (templatePostInfoLIZ != null) {
            dispatchType = templatePostInfoLIZ.getDispatchType();
        } else {
            dispatchType = null;
        }
        jSONObject2.put("dispatch_type", dispatchType);
        String strJ3 = C786410Ut5.J3(jSONObject2);
        int type = enumC1430380nKG.getTYPE();
        AutoCutThemeData autoCutThemeDataLIZJ = C1416110mxF.LIZJ(videoPublishEditModel.creativeModel.autoCutModel);
        if (autoCutThemeDataLIZJ != null) {
            strLJI = autoCutThemeDataLIZJ.anchorName;
        }
        if (!C123100dR.LIZ(strLJI)) {
            strLJI = C20642515q3.LJI(2131857677);
        }
        String strJ32 = C786410Ut5.J3(jSONObject);
        ArrayList<EnumC1430380nKG> arrayList = C1429550nIv.LIZ;
        LIZ.getClass();
        ((ArrayList) list).add(new CreateAnchorInfo(type, strLJI, "", "", strJ32, C1429550nIv.LIZ(enumC1430380nKG, LJJIJ()), Long.valueOf(SystemClock.elapsedRealtime()), strJ3, "", "", templateType, Boolean.TRUE, true, null, null, false, null));
        return true;
    }

    public static final void LJIILLIIL(List<CreateAnchorInfo> list, VideoPublishEditModel videoPublishEditModel) {
        Integer assetType;
        Object next;
        String strLJI;
        Iterable slots;
        Integer numValueOf;
        boolean z = videoPublishEditModel.creativeModel.stickerModel.lyricEffectAnchorRemoved;
        C1412410mrH.LIZ.getClass();
        TemplatePostInfo templatePostInfoLIZ = C1412410mrH.LIZ(videoPublishEditModel);
        if (templatePostInfoLIZ != null) {
            assetType = templatePostInfoLIZ.getAssetType();
        } else {
            assetType = null;
        }
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ENTRY enable=");
        sbLIZ.append(C291180BbA.LIZ());
        sbLIZ.append(" removed=");
        sbLIZ.append(z);
        sbLIZ.append(" assetType=");
        sbLIZ.append(assetType);
        C1426005i6.LIZ(c1398350mUb, "Anchor.Publish.Add", C2188811AlT.LIZIZ(sbLIZ));
        if (!C291180BbA.LIZ()) {
            C1426005i6.LIZ(c1398350mUb, "Anchor.Publish.Add", "SKIP-DISABLED");
            return;
        }
        if (z) {
            C364520EQw.LIZ(list, AFwS261S0000000_22.get$arr$(153));
            C1426005i6.LIZ(c1398350mUb, "Anchor.Publish.Add", "SKIP-REMOVED user-cleared");
            return;
        }
        if (!C1403850mdT.LJFF(videoPublishEditModel)) {
            C364520EQw.LIZ(list, AFwS261S0000000_22.get$arr$(154));
            C1426005i6.LIZ(c1398350mUb, "Anchor.Publish.Add", "SKIP-INELIGIBLE enableLyricSticker=false");
            return;
        }
        String strLJJIJIIJI = C1416310mxZ.LJJIJIIJI(videoPublishEditModel, null, false);
        if (C123100dR.LIZ(strLJJIJIIJI) && !Intrinsics.LJFF(strLJJIJIIJI, C1412660mrg.LIZIZ(EnumC1412640mre.LYRICS_RULE_TEMPLATE))) {
            C364520EQw.LIZ(list, AFwS261S0000000_22.get$arr$(155));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("SKIP-TT-TEMPLATE-PRESENT type=");
            sbLIZ2.append(strLJJIJIIJI);
            C1426005i6.LIZ(c1398350mUb, "Anchor.Publish.Add", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (assetType != null && assetType.intValue() == 62) {
            ArrayList arrayList = (ArrayList) list;
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (LIZIZ.contains(Integer.valueOf(((CreateAnchorInfo) next).getType()))) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            CreateAnchorInfo createAnchorInfo = (CreateAnchorInfo) next;
            if (createAnchorInfo != null && (numValueOf = Integer.valueOf(createAnchorInfo.getType())) != null) {
                C364520EQw.LIZ(arrayList, AFwS261S0000000_22.get$arr$(157));
                C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("SKIP-TEMPLATE-PRESENT type=");
                sbLIZ3.append(numValueOf);
                C1426005i6.LIZ(c1398350mUb2, "Anchor.Publish.Add", C2188811AlT.LIZIZ(sbLIZ3));
                return;
            }
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (((CreateAnchorInfo) it3.next()).getType() == 120) {
                        C364520EQw.LIZ(arrayList, AFwS261S0000000_22.get$arr$(158));
                        C1426005i6.LIZ(C1398350mUb.LIZIZ, "Anchor.Publish.Add", "REMOVE-STALE-FOR-REFRESH");
                        break;
                    }
                }
            }
            if (!C1466090oFr.LJIIIIZZ(videoPublishEditModel.creativeModel.stickerModel.lyricStickerModels, true)) {
                C364520EQw.LIZ(arrayList, AFwS261S0000000_22.get$arr$(159));
                C1426005i6.LIZ(C1398350mUb.LIZIZ, "Anchor.Publish.Add", "SKIP-NO-VISIBLE-LYRIC-TEXT");
                return;
            }
            if (videoPublishEditModel.getNleData() != null) {
                C0FGC.LIZ(2);
                NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
                nLEEditorLIZ.restore(videoPublishEditModel.getNleData());
                List<NLETrack> listLJJLIIIJ = C351220Dpo.LJJLIIIJ(nLEEditorLIZ.getModel());
                if (listLJJLIIIJ != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (NLETrack nLETrack : listLJJLIIIJ) {
                        if (nLETrack == null || (slots = nLETrack.getSlots()) == null) {
                            slots = C13BV.INSTANCE;
                        }
                        C19719612Di.LJJI(slots, arrayList2);
                    }
                    int size = arrayList2.size();
                    if (size > 1) {
                        C364520EQw.LIZ(arrayList, AFwS261S0000000_22.get$arr$(160));
                        C1398350mUb c1398350mUb3 = C1398350mUb.LIZIZ;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("SKIP-MULTI-MUSIC-SLOT count=");
                        sbLIZ4.append(size);
                        C1426005i6.LIZ(c1398350mUb3, "Anchor.Publish.Add", C2188811AlT.LIZIZ(sbLIZ4));
                        return;
                    }
                }
            }
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_lyric_effect_anchor_type", true) == 1) {
                strLJI = C20642515q3.LJI(2131836938);
            } else {
                strLJI = C20642515q3.LJI(2131836937);
            }
            arrayList.add(new CreateAnchorInfo(120, strLJI, "", "", "", "", -1L, "", "", "", "", Boolean.TRUE, true, null, null, false, Integer.valueOf(R.raw.icon_anchor_templates_cards)));
            C1426005i6.LIZ(C1398350mUb.LIZIZ, "Anchor.Publish.Add", "ADDED type=120");
            return;
        }
        C364520EQw.LIZ(list, AFwS261S0000000_22.get$arr$(156));
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("SKIP-NOT-LYRIC assetType=");
        sbLIZ5.append(assetType);
        C1426005i6.LIZ(c1398350mUb, "Anchor.Publish.Add", C2188811AlT.LIZIZ(sbLIZ5));
    }

    public static final void LJIJ(List<CreateAnchorInfo> list, VideoPublishEditModel videoPublishEditModel) {
        String strLIZLLL;
        if (!videoPublishEditModel.isPhotoMvMode() && (strLIZLLL = C08JS.LIZLLL(videoPublishEditModel.getUploadMiscInfoStruct())) != null && strLIZLLL.length() != 0) {
            String str = videoPublishEditModel.creativeModel.aiSelfModel.styleName;
            if (str == null || str.length() == 0) {
                try {
                    AVUploadMiscInfoStruct uploadMiscInfoStruct = videoPublishEditModel.getUploadMiscInfoStruct();
                    if (uploadMiscInfoStruct != null) {
                        LIZ.getClass();
                        LJIIZILJ(list, uploadMiscInfoStruct, videoPublishEditModel);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    public static void LJIJI(String str, LinkedHashMap linkedHashMap) {
        String str2 = (String) linkedHashMap.get("stickers");
        if (str2 != null && str2.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(',');
            sbLIZ.append(str);
            linkedHashMap.put("stickers", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        linkedHashMap.put("stickers", str);
    }

    public static final boolean LJIJJ(List<CreateAnchorInfo> list, VideoPublishEditModel videoPublishEditModel) throws JSONException {
        String templateType;
        ArrayList<TemplateSlot> arrayListLJFF;
        if (!C527950KnB.LIZIZ() || ((!videoPublishEditModel.shouldReuseAutoCutAnchor() && !C0MUK.LJI(videoPublishEditModel.creativeModel)) || C1416310mxZ.LJJLIIJ(videoPublishEditModel))) {
            return false;
        }
        C1412410mrH.LIZ.getClass();
        TemplatePostInfo templatePostInfoLIZ = C1412410mrH.LIZ(videoPublishEditModel);
        String templateId = null;
        arrayListLJ = null;
        ArrayList<TemplateSlot> arrayListLJ = null;
        if (templatePostInfoLIZ != null) {
            templateType = templatePostInfoLIZ.getTemplateType();
        } else {
            templateType = null;
        }
        EnumC1430380nKG enumC1430380nKG = (EnumC1430380nKG) C298980Bnk.LIZJ(C1394440mOI.LJFF(C1394440mOI.LJII(templateType)));
        if (enumC1430380nKG == null) {
            enumC1430380nKG = EnumC1430380nKG.ANCHOR_AUTO_CUT;
        }
        if (C298980Bnk.LIZ() && !C0AYL.LIZ(Integer.valueOf(enumC1430380nKG.getTYPE()))) {
            return false;
        }
        String str = "";
        if (C0MUK.LJI(videoPublishEditModel.creativeModel)) {
            AnchorCommonStruct anchorCommonStruct = videoPublishEditModel.creativeModel.ugcTemplateData.ugcTemplateOriginAnchor;
            if (anchorCommonStruct != null && (arrayListLJFF = C539530LDz.LJFF(anchorCommonStruct)) != null) {
                arrayListLJ = C539530LDz.LJ(arrayListLJFF);
            }
            JSONArray jSONArray = new JSONArray();
            if (arrayListLJ != null) {
                ArrayList<Integer> arrayListLIZJ = C539530LDz.LIZJ(arrayListLJ);
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(arrayListLIZJ, 10));
                Iterator<Integer> it2 = arrayListLIZJ.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Float.valueOf(it2.next().intValue() / 1000.0f));
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    jSONArray.put(Float.valueOf(((Number) it3.next()).floatValue()));
                }
            }
            LIZ.getClass();
            JSONObject jSONObjectLJJIIZI = LJJIIZI(videoPublishEditModel);
            if (anchorCommonStruct != null) {
                int type = enumC1430380nKG.getTYPE();
                String keyword = anchorCommonStruct.getKeyword();
                if (keyword == null) {
                    keyword = C20642515q3.LJI(2131857677);
                }
                String url = anchorCommonStruct.getUrl();
                if (url != null) {
                    str = url;
                }
                String language = anchorCommonStruct.getLanguage();
                String strJ3 = C786410Ut5.J3(jSONObjectLJJIIZI);
                ArrayList<EnumC1430380nKG> arrayList2 = C1429550nIv.LIZ;
                ((ArrayList) list).add(new CreateAnchorInfo(type, keyword, str, language, strJ3, C1429550nIv.LIZ(enumC1430380nKG, LJJIJ()), Long.valueOf(SystemClock.elapsedRealtime()), anchorCommonStruct.getExtra(), "", "", templateType, Boolean.TRUE, true, null, null, false, null));
            }
            return true;
        }
        AutoCutAnchorModel autoCutAnchorModel = videoPublishEditModel.creativeModel.autoCutAnchorModel;
        JSONObject jSONObject = new JSONObject();
        if (templatePostInfoLIZ != null) {
            templateId = templatePostInfoLIZ.getTemplateId();
        }
        jSONObject.put("third_id", templateId);
        int type2 = enumC1430380nKG.getTYPE();
        String strLJI = C20642515q3.LJI(2131857677);
        String str2 = autoCutAnchorModel.url;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = autoCutAnchorModel.language;
        if (str3 != null) {
            str = str3;
        }
        String strJ32 = C786410Ut5.J3(jSONObject);
        ArrayList<EnumC1430380nKG> arrayList3 = C1429550nIv.LIZ;
        LIZ.getClass();
        ((ArrayList) list).add(new CreateAnchorInfo(type2, strLJI, str2, str, strJ32, C1429550nIv.LIZ(enumC1430380nKG, LJJIJ()), Long.valueOf(SystemClock.elapsedRealtime()), autoCutAnchorModel.extra, "", "", templateType, Boolean.TRUE, true, null, null, false, null));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIJJLI(java.util.List<com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo> r25, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r26) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1429450nIl.LJIJJLI(java.util.List, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):void");
    }

    public static final void LJIL(List<CreateAnchorInfo> list, VideoPublishEditModel videoPublishEditModel) {
        EnumC1430380nKG enumC1430380nKG;
        boolean z;
        String templateType;
        if (C0CHQ.LIZ().getAccountService().LIZ() || C0MUK.LJI(videoPublishEditModel.creativeModel) || C0MUK.LJII(videoPublishEditModel.creativeModel)) {
            return;
        }
        if (videoPublishEditModel.creativeModel.ugcTemplateData.isPUgcTemplateFromAnchor) {
            enumC1430380nKG = EnumC1430380nKG.ANCHOR_PUGC_TEMPLATE;
        } else {
            enumC1430380nKG = EnumC1430380nKG.ANCHOR_UGC_TEMPLATE;
        }
        if (!C0C08.LIZ() && !C0C07.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        if (((Boolean) C298980Bnk.LIZIZ(Boolean.valueOf(z), Boolean.valueOf(true ^ C0AYL.LIZ(Integer.valueOf(enumC1430380nKG.getTYPE()))))).booleanValue()) {
            return;
        }
        if (videoPublishEditModel.creativeModel.ugcTemplateData.showOriginTemplateAnchor == null) {
            Boolean boolLIZJ = C376910Eq9.LIZJ(videoPublishEditModel);
            if (boolLIZJ != null) {
                boolean zBooleanValue = boolLIZJ.booleanValue();
                videoPublishEditModel.creativeModel.ugcTemplateData.showOriginTemplateAnchor = Boolean.valueOf(zBooleanValue);
            } else {
                return;
            }
        }
        if (!Intrinsics.LJFF(videoPublishEditModel.creativeModel.ugcTemplateData.showOriginTemplateAnchor, Boolean.TRUE)) {
            return;
        }
        AnchorCommonStruct anchorCommonStruct = videoPublishEditModel.creativeModel.ugcTemplateData.ugcTemplateOriginAnchor;
        LIZ.getClass();
        JSONObject jSONObjectLJJIIZI = LJJIIZI(videoPublishEditModel);
        if (anchorCommonStruct != null) {
            int type = enumC1430380nKG.getTYPE();
            String keyword = anchorCommonStruct.getKeyword();
            if (keyword == null) {
                keyword = C20642515q3.LJI(2131857677);
            }
            String url = anchorCommonStruct.getUrl();
            if (url == null) {
                url = "";
            }
            String language = anchorCommonStruct.getLanguage();
            String strJ3 = C786410Ut5.J3(jSONObjectLJJIIZI);
            ArrayList<EnumC1430380nKG> arrayList = C1429550nIv.LIZ;
            String strLIZ = C1429550nIv.LIZ(enumC1430380nKG, LJJIJ());
            Long lValueOf = Long.valueOf(SystemClock.elapsedRealtime());
            String extra = anchorCommonStruct.getExtra();
            C1412410mrH.LIZ.getClass();
            TemplatePostInfo templatePostInfoLIZ = C1412410mrH.LIZ(videoPublishEditModel);
            if (templatePostInfoLIZ != null) {
                templateType = templatePostInfoLIZ.getTemplateType();
            } else {
                templateType = null;
            }
            ((ArrayList) list).add(new CreateAnchorInfo(type, keyword, url, language, strJ3, strLIZ, lValueOf, extra, "", "", templateType, Boolean.TRUE, true, null, null, false, null));
        }
    }

    public static final void LJJ(List<CreateAnchorInfo> list, VideoPublishEditModel videoPublishEditModel) {
        List<TransAnchorData> list2;
        NowsShootModel nowsShootModel = videoPublishEditModel.creativeModel.nowsShootModel;
        if ((nowsShootModel != null && nowsShootModel.isNormalPublish) || C1428470nHB.LLIIIL(videoPublishEditModel) || C1428470nHB.LLIIIJ(videoPublishEditModel)) {
            ArrayList arrayList = new ArrayList();
            AnchorTransData autoSelectedAnchor = videoPublishEditModel.getCreativeFlowData().getAutoSelectedAnchor();
            if (autoSelectedAnchor != null) {
                arrayList.add(C1430580nKa.LIZIZ(autoSelectedAnchor));
            }
            List<AnchorTransData> anchors = videoPublishEditModel.getCreativeFlowData().getAnchors();
            if (anchors != null) {
                Iterator<AnchorTransData> it2 = anchors.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C1430580nKa.LIZIZ(it2.next()));
                }
            }
            DuetAndStitchRouterConfig duetAndStitchRouterConfig = videoPublishEditModel.creativeModel.initialModel.duetAndStitchRouterConfig;
            if (duetAndStitchRouterConfig != null && (list2 = duetAndStitchRouterConfig.anchors) != null) {
                Iterator<TransAnchorData> it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList.add(C1430580nKa.LIZIZ(C1446700nka.LIZ(it3.next())));
                }
            }
            ((ArrayList) list).addAll(arrayList);
        }
    }

    public static final void LJJI(List<CreateAnchorInfo> list, VideoPublishEditModel videoPublishEditModel) throws JSONException {
        String title;
        Integer numValueOf;
        List<PhotoTemplateAsset> listLJJIL = C1428520nHG.LJJIL(videoPublishEditModel);
        ArrayList<PhotoTemplateAsset> arrayList = new ArrayList();
        for (Object obj : (ArrayList) listLJJIL) {
            if (C703302op.LIZ(((PhotoTemplateAsset) obj).getPropId())) {
                arrayList.add(obj);
            }
        }
        for (PhotoTemplateAsset photoTemplateAsset : arrayList) {
            JSONObject jSONObject = new JSONObject();
            String propId = photoTemplateAsset.getPropId();
            String str = "";
            if (propId == null) {
                propId = "";
            }
            jSONObject.put("third_id", propId);
            EnumC1430380nKG enumC1430380nKG = EnumC1430380nKG.PROP;
            int type = enumC1430380nKG.getTYPE();
            Asset asset = photoTemplateAsset.getAsset();
            if (asset == null || (title = asset.getTitle()) == null) {
                title = "";
            }
            String strJ3 = C786410Ut5.J3(jSONObject);
            ArrayList<EnumC1430380nKG> arrayList2 = C1429550nIv.LIZ;
            String strLIZ = C1429550nIv.LIZ(enumC1430380nKG, C1429590nIz.LIZ().effectAnchorUrl);
            Asset asset2 = photoTemplateAsset.getAsset();
            if (asset2 != null) {
                numValueOf = Integer.valueOf(asset2.getAsset_type());
            } else {
                numValueOf = null;
            }
            String strValueOf = String.valueOf(numValueOf);
            String propId2 = photoTemplateAsset.getPropId();
            if (propId2 != null) {
                str = propId2;
            }
            ((ArrayList) list).add(new CreateAnchorInfo(type, title, "", "", strJ3, strLIZ, Long.valueOf(SystemClock.elapsedRealtime()), "", str, "", strValueOf, Boolean.TRUE, true, null, null, false, null));
        }
    }

    public static final void LJJIFFI(List<CreateAnchorInfo> list, VideoPublishEditModel videoPublishEditModel) {
        if (!(list instanceof Collection) || !((ArrayList) list).isEmpty()) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                if (((CreateAnchorInfo) it2.next()).getType() == EnumC1430380nKG.SOCIAL_AVATAR_ANCHOR.getTYPE()) {
                    return;
                }
            }
        }
        if (!videoPublishEditModel.creativeModel.stickerModel.socialAvatarStickerModels.isEmpty()) {
            ((ArrayList) list).add(new CreateAnchorInfo(EnumC1430380nKG.SOCIAL_AVATAR_ANCHOR.getTYPE(), C1383370m6R.LJIIJ(2131827015), "", "", "", "https://p16-sg.tiktokcdn.com/obj/tiktok-obj/social_avatar_anchor_icon.png", Long.valueOf(SystemClock.elapsedRealtime()), "", "", "", "", Boolean.FALSE, true, null, null, false, null));
        }
    }

    public static final void LJJII(List<CreateAnchorInfo> list, VideoPublishEditModel videoPublishEditModel) {
        String type;
        String strLJIIJ;
        if (C1428470nHB.LJJLIIIJILLIZJL(videoPublishEditModel)) {
            TextImageTaskInfo textImageTaskInfoLIZJ = C572250McR.LIZJ(videoPublishEditModel.creativeModel.text2ImageModel);
            if (textImageTaskInfoLIZJ != null) {
                type = textImageTaskInfoLIZJ.getType();
            } else {
                type = null;
            }
            if (Intrinsics.LJFF(type, C0LIV.AI.getType())) {
                strLJIIJ = C1383370m6R.LJIIJ(2131821498);
            } else if (C07CL.LIZ()) {
                strLJIIJ = C1383370m6R.LJIIJ(2131830052);
            } else {
                strLJIIJ = C1383370m6R.LJIIJ(2131821540);
            }
            EnumC1430380nKG enumC1430380nKG = EnumC1430380nKG.TEXT_TO_IMAGE_ANCHOR;
            ((ArrayList) list).add(new CreateAnchorInfo(enumC1430380nKG.getTYPE(), strLJIIJ, C1429550nIv.LIZ(enumC1430380nKG, "https://sf16-sg.tiktokcdn.com/obj/eden-sg/5991eh7pkbd/textToPhoto.png"), "", "", C1429550nIv.LIZ(enumC1430380nKG, "https://sf16-sg.tiktokcdn.com/obj/eden-sg/5991eh7pkbd/textToPhoto.png"), Long.valueOf(System.currentTimeMillis()), "", "", "", "", Boolean.FALSE, true, null, null, false, null));
        }
    }

    public static String LJJIIJZLJL(String str, String str2) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String strJ3 = "";
        if (z) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("third_id", str);
            if (str2 != null) {
                jSONObject.put("icon_url", str2);
            }
            strJ3 = C786410Ut5.J3(jSONObject);
            return strJ3;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return strJ3;
        }
    }

    public static String LJJIIZ(String str, Map map) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("title", str);
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            }
            return C786410Ut5.J3(jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static final void LJFF(List<CreateAnchorInfo> list, VideoPublishEditModel videoPublishEditModel, Map<String, String> map) {
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        boolean z;
        String strLIZIZ;
        String string;
        int i;
        VecNLETrackSlotSPtr slots2;
        if (!C1429490nIp.LIZ() || videoPublishEditModel.getNleData() == null) {
            return;
        }
        if (videoPublishEditModel.creativeModel.editorProAIGCInfoModel.aiPlaygroundCameraModel.anchorRemoved) {
            C364520EQw.LIZ(list, AFwS261S0000000_22.get$arr$(150));
            return;
        }
        if (!(list instanceof Collection) || !((ArrayList) list).isEmpty()) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                if (((CreateAnchorInfo) it2.next()).getType() == 114) {
                    return;
                }
            }
        }
        C0FGC.LIZ(2);
        NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
        nLEEditorLIZ.restore(videoPublishEditModel.getNleData());
        NLEModel model = nLEEditorLIZ.getModel();
        NLETrack mainTrack = model.getMainTrack();
        if (mainTrack != null && (slots = mainTrack.getSlots()) != null && slots.size() == 1) {
            NLETrack mainTrack2 = model.getMainTrack();
            if (mainTrack2 != null && (slots2 = mainTrack2.getSlots()) != null) {
                nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(slots2);
            } else {
                nLETrackSlot = null;
            }
            List<NLETrack> listLJJLIIIJLJLI = C351220Dpo.LJJLIIIJLJLI(model);
            ArrayList arrayList = new ArrayList();
            Iterator<NLETrack> it3 = listLJJLIIIJLJLI.iterator();
            while (it3.hasNext()) {
                VecNLETrackSlotSPtr slots3 = it3.next().getSlots();
                if (slots3 != null) {
                    arrayList.add(slots3);
                }
            }
            ArrayList arrayList2 = (ArrayList) C15438062q.LJIJJLI(arrayList);
            if (!arrayList2.isEmpty()) {
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    if (C0E5J.LIZ((NLETrackSlot) it4.next())) {
                        z = true;
                        break;
                    }
                }
                z = false;
            } else {
                z = false;
            }
            if (nLETrackSlot != null && (strLIZIZ = C377740ErU.LIZIZ(nLETrackSlot)) != null && strLIZIZ.length() != 0) {
                C377150EqX c377150EqX = C377150EqX.LIZ;
                EditorProAIGCMediaItemModel editorProAIGCMediaItemModelLJIIJJI = C377150EqX.LJIIJJI(videoPublishEditModel, strLIZIZ, null, Collections.singletonList(EditorProAIGCMediaItemModelStatus.COMPLETE));
                if (editorProAIGCMediaItemModelLJIIJJI != null && nLETrackSlot != null && C0E5J.LJFF(nLETrackSlot) && !z) {
                    String string2 = C1325880kbi.LIZIZ(R.drawable.c4q).toString();
                    ArrayList<EnumC1430380nKG> arrayList3 = C1429550nIv.LIZ;
                    String strLIZ = C1429550nIv.LIZ(EnumC1430380nKG.AI_SELF_ANCHOR, string2);
                    if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_ai_video_tool_anchor_type", true) == 2) {
                        string = C2213981Bky.LIZIZ.getApplicationContext().getString(2131825835);
                    } else {
                        string = C2213981Bky.LIZIZ.getApplicationContext().getString(2131825834);
                    }
                    ((ArrayList) list).add(new CreateAnchorInfo(114, string, "", "", "", strLIZ, -1L, "", "", "", "", Boolean.TRUE, true, null, null, false, null));
                    if (map == null) {
                        return;
                    }
                    AIGCGenerationParam aIGCGenerationParam = editorProAIGCMediaItemModelLJIIJJI.param;
                    List<String> list2 = editorProAIGCMediaItemModelLJIIJJI.referenceImagePathList;
                    ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    int i2 = 0;
                    for (String str : list2) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            String str2 = str;
                            Integer num = (Integer) C13LP.LJJJLZIJ(i2, editorProAIGCMediaItemModelLJIIJJI.faceCountList);
                            if (num != null && num.intValue() > 0) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                            String str3 = editorProAIGCMediaItemModelLJIIJJI.uriMigrationMap.get(str2);
                            if (str3 != null) {
                                str2 = str3;
                            }
                            arrayList4.add(new ImageInfo("", str2, i, i2));
                            i2 = i3;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    String strLIZIZ2 = C105700ad.LIZIZ(new AIGCPromptInfo(aIGCGenerationParam.promptDescription, arrayList4, aIGCGenerationParam.duration, aIGCGenerationParam.aspectRatio, null, 16, null));
                    if (strLIZIZ2 != null && strLIZIZ2.length() != 0) {
                        map.put("ai_video_tool_info", strLIZIZ2);
                        return;
                    }
                    return;
                }
            }
            C364520EQw.LIZ(list, AFwS261S0000000_22.get$arr$(152));
            return;
        }
        C364520EQw.LIZ(list, AFwS261S0000000_22.get$arr$(151));
    }

    public static final void LJII(VideoPublishEditModel videoPublishEditModel, List list, boolean z) {
        InterfaceC1429470nIn interfaceC1429470nInLJFF;
        String taskId;
        int iIntValue;
        String strLJJLIIIJ;
        String strLJFF;
        InterfaceC1397450mT9 interfaceC1397450mT9LIZJ;
        InterfaceC1397450mT9 interfaceC1397450mT9LIZJ2;
        C1EPC c1epcLIZIZ;
        IAiChatFeatureService iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
        if ((z || (iAiChatFeatureService != null && (c1epcLIZIZ = iAiChatFeatureService.LIZIZ()) != null && c1epcLIZIZ.LIZLLL())) && iAiChatFeatureService != null && (interfaceC1429470nInLJFF = iAiChatFeatureService.LJFF()) != null && interfaceC1429470nInLJFF.LJFF(videoPublishEditModel.creativeModel, videoPublishEditModel.getPreviewInfo(), C1428470nHB.LJJZZI(videoPublishEditModel))) {
            AIChatGenNode aIChatGenNodeLIZLLL = interfaceC1429470nInLJFF.LIZLLL(videoPublishEditModel.creativeModel, videoPublishEditModel.getPreviewInfo(), C1428470nHB.LJJZZI(videoPublishEditModel));
            String strJ3 = "";
            if (aIChatGenNodeLIZLLL == null || (taskId = aIChatGenNodeLIZLLL.getTaskId()) == null) {
                taskId = "";
            }
            JSONArray jSONArrayPut = new JSONArray().put(taskId);
            AIChatGenPrompt aIChatGenPromptLIZJ = interfaceC1429470nInLJFF.LIZJ(videoPublishEditModel.creativeModel, videoPublishEditModel.getPreviewInfo(), C1428470nHB.LJJZZI(videoPublishEditModel));
            if (aIChatGenPromptLIZJ == null) {
                return;
            }
            String promptId = aIChatGenPromptLIZJ.getPromptId();
            if (promptId == null) {
                promptId = "";
            }
            String promptText = aIChatGenPromptLIZJ.getPromptText();
            if (promptText == null) {
                promptText = "";
            }
            String promptType = aIChatGenPromptLIZJ.getPromptType();
            if (promptType == null) {
                promptType = "";
            }
            String promptUri = aIChatGenPromptLIZJ.getPromptUri();
            if (promptUri == null) {
                promptUri = "";
            }
            Integer numLJII = interfaceC1429470nInLJFF.LJII(videoPublishEditModel.creativeModel, videoPublishEditModel.getPreviewInfo(), C1428470nHB.LJJZZI(videoPublishEditModel));
            if (numLJII != null) {
                iIntValue = numLJII.intValue();
            } else {
                iIntValue = 0;
            }
            List<Integer> listLJI = interfaceC1429470nInLJFF.LJI(videoPublishEditModel.creativeModel, C1428470nHB.LJJZZI(videoPublishEditModel));
            if (listLJI == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(listLJI, ",", null, null, 0, null, null, 62)) == null) {
                strLJJLIIIJ = "";
            }
            IAiChatFeatureService iAiChatFeatureService2 = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
            if (iAiChatFeatureService2 == null || (interfaceC1397450mT9LIZJ2 = iAiChatFeatureService2.LIZJ()) == null || (strLJFF = interfaceC1397450mT9LIZJ2.LJFF()) == null) {
                strLJFF = "";
            }
            ArrayList<EnumC1430380nKG> arrayList = C1429550nIv.LIZ;
            String strLIZ = C1429550nIv.LIZ(EnumC1430380nKG.AI_IMAGINE_ANCHOR_TYPE, "https://p16-sg.tiktokcdn.com/obj/tiktok-obj/anchor_map_pin.png");
            String promptIconUri = aIChatGenPromptLIZJ.getPromptIconUri();
            if (promptIconUri == null || promptIconUri.length() <= 0) {
                IAiChatFeatureService iAiChatFeatureService3 = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
                if (iAiChatFeatureService3 != null && (interfaceC1397450mT9LIZJ = iAiChatFeatureService3.LIZJ()) != null) {
                    promptIconUri = interfaceC1397450mT9LIZJ.LIZLLL();
                } else {
                    promptIconUri = strLIZ;
                }
            }
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("task_ids", jSONArrayPut), new Pair("prompt", promptText), new Pair("prompt_id", promptId), new Pair("prompt_type", promptType), new Pair("image_count", Integer.valueOf(iIntValue)), new Pair("watermark_index", strLJJLIIIJ), new Pair("prompt_uri", promptUri), new Pair("icon_uri", promptIconUri));
            LIZ.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : ((LinkedHashMap) mapLJIIJ).entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
                strJ3 = C786410Ut5.J3(jSONObject);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            ((ArrayList) list).add(new CreateAnchorInfo(109, strLJFF, "", "", strJ3, strLIZ, Long.valueOf(SystemClock.elapsedRealtime()), "", "", "", "", Boolean.TRUE, true, null, null, false, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIIIZZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r30, java.util.List r31, boolean r32) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1429450nIl.LJIIIIZZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.util.List, boolean):void");
    }

    public static final void LJIIJ(List<CreateAnchorInfo> list, VideoPublishEditModel videoPublishEditModel, LinkedHashMap<String, String> linkedHashMap) {
        List<AlbumAigc> listLIZLLL;
        if (C311010CHb.LIZ() && (listLIZLLL = C1403470mcr.LIZLLL(videoPublishEditModel)) != null) {
            ArrayList arrayList = new ArrayList();
            for (AlbumAigc albumAigc : listLIZLLL) {
                Integer aiType = albumAigc.getAiType();
                if (aiType != null && aiType.intValue() == 2) {
                    AlbumAiContentService.LIZ.getClass();
                    AlbumAiContentService albumAiContentServiceLIZ = C523440Kfu.LIZ();
                    if (albumAiContentServiceLIZ == null || !albumAiContentServiceLIZ.LJIIIZ()) {
                    }
                }
                arrayList.add(albumAigc);
            }
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    Integer aiType2 = ((AlbumAigc) obj).getAiType();
                    if (aiType2 != null && aiType2.intValue() == 3) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    AlbumAigcAnchor aigcAnchor = ((AlbumAigc) it2.next()).getAigcAnchor();
                    if (aigcAnchor != null) {
                        arrayList3.add(aigcAnchor);
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : arrayList3) {
                    if (hashSet.add(((AlbumAigcAnchor) obj2).getPropId())) {
                        arrayList4.add(obj2);
                    }
                }
                Iterator it3 = arrayList4.iterator();
                while (true) {
                    String str = "";
                    if (!it3.hasNext()) {
                        break;
                    }
                    AlbumAigcAnchor albumAigcAnchor = (AlbumAigcAnchor) it3.next();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("add_from", 1);
                    jSONObject.put("third_id", albumAigcAnchor.getPropId());
                    jSONObject.put("icon_url", albumAigcAnchor.getIconUrl());
                    String name = albumAigcAnchor.getName();
                    if (name != null) {
                        str = name;
                    }
                    ((ArrayList) list).add(new CreateAnchorInfo(28, str, "", "", C786410Ut5.J3(jSONObject), C1429590nIz.LIZ().effectAnchorUrl, Long.valueOf(SystemClock.elapsedRealtime()), "", "", "", "", Boolean.TRUE, true, null, null, false, null));
                    String propId = albumAigcAnchor.getPropId();
                    if (propId != null && linkedHashMap != null) {
                        LIZ.getClass();
                        LJIJI(propId, linkedHashMap);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : arrayList) {
                    Integer aiType3 = ((AlbumAigc) obj3).getAiType();
                    if (aiType3 != null && aiType3.intValue() == 2) {
                        arrayList5.add(obj3);
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                Iterator it4 = arrayList5.iterator();
                while (it4.hasNext()) {
                    AlbumAigcAnchor aigcAnchor2 = ((AlbumAigc) it4.next()).getAigcAnchor();
                    if (aigcAnchor2 != null) {
                        arrayList6.add(aigcAnchor2);
                    }
                }
                HashSet hashSet2 = new HashSet();
                ArrayList<AlbumAigcAnchor> arrayList7 = new ArrayList();
                for (Object obj4 : arrayList6) {
                    if (hashSet2.add(((AlbumAigcAnchor) obj4).getPropId())) {
                        arrayList7.add(obj4);
                    }
                }
                for (AlbumAigcAnchor albumAigcAnchor2 : arrayList7) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("third_id", albumAigcAnchor2.getPropId());
                    jSONObject2.put("add_from", 1);
                    if (C123100dR.LIZ(albumAigcAnchor2.getIconUrl())) {
                        jSONObject2.put("icon_url", videoPublishEditModel.creativeModel.aiSelfModel.anchorIconUri);
                    }
                    C1429450nIl c1429450nIl = LIZ;
                    String name2 = albumAigcAnchor2.getName();
                    if (name2 == null) {
                        name2 = "";
                    }
                    ((ArrayList) list).add(LJJIIJ(c1429450nIl, name2, jSONObject2));
                    String propId2 = albumAigcAnchor2.getPropId();
                    if (propId2 != null && linkedHashMap != null) {
                        LJIJI(propId2, linkedHashMap);
                    }
                }
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    Integer aiType4 = ((AlbumAigc) it5.next()).getAiType();
                    if (aiType4 != null && aiType4.intValue() == 1) {
                        ArrayList arrayList8 = (ArrayList) list;
                        Iterator it6 = arrayList8.iterator();
                        while (it6.hasNext()) {
                            if (((CreateAnchorInfo) it6.next()).getType() == 97) {
                                return;
                            }
                        }
                        if (!C0A15.LIZ()) {
                            return;
                        }
                        String strLJIIJ = C1383370m6R.LJIIJ(2131820718);
                        ArrayList<EnumC1430380nKG> arrayList9 = C1429550nIv.LIZ;
                        arrayList8.add(new CreateAnchorInfo(97, strLJIIJ, "", "", "", C1429550nIv.LIZ(EnumC1430380nKG.AI_LIVE_PHOTO_ANCHOR_TYPE, "https://p16.tiktokcdn.com/obj/tiktok-obj/ai_live.png"), Long.valueOf(SystemClock.elapsedRealtime()), "", "", "", "", Boolean.TRUE, true, null, null, false, null));
                        return;
                    }
                }
            }
        }
    }

    public static final void LJIIJJI(VideoPublishEditModel videoPublishEditModel, List list, boolean z) {
        int i;
        C579430Mo1.LIZ.getClass();
        if (!C579430Mo1.LIZIZ(z) || !C1416310mxZ.LJJJJJ(videoPublishEditModel)) {
            return;
        }
        if (((Number) C1866650yfv.LIZIZ.getValue()).intValue() == 1) {
            i = 2131828263;
        } else {
            i = 2131828273;
        }
        String str = ((AnchorConfig) C310650CFr.LIZIZ.getValue()).icons.anchorWithBG;
        String string = C1BWL.LIZJ().getString(i);
        ArrayList<EnumC1430380nKG> arrayList = C1429550nIv.LIZ;
        ((ArrayList) list).add(new CreateAnchorInfo(103, string, "", "", "", C1429550nIv.LIZ(EnumC1430380nKG.CAMERA_LAYOUT_ANCHOR_TYPE, str), Long.valueOf(SystemClock.elapsedRealtime()), "", "", "", "", Boolean.TRUE, true, null, null, false, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r23, java.util.List r24, boolean r25) {
        /*
            r1 = r24
            X.0C64 r2 = X.C0C64.LJIILLIIL()
            java.lang.String r0 = "show_duet_v2_anchor"
            r8 = 31744(0x7c00, float:4.4483E-41)
            r4 = 0
            r7 = 1
            int r0 = r2.LJIJ(r8, r4, r0, r7)
            if (r0 == r7) goto L15
            if (r25 != 0) goto L15
            return
        L15:
            r5 = r23
            boolean r0 = r5.isDuet()
            if (r0 == 0) goto Lb7
            X.0C64 r2 = X.C0C64.LJIILLIIL()
            java.lang.String r0 = "anchor_duet_enable_green_screen"
            int r0 = r2.LJIJ(r8, r4, r0, r7)
            if (r0 == r7) goto L32
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r5.creativeModel
            com.ss.android.ugc.aweme.creative.model.duet.DuetModel r0 = r0.duetModel
            boolean r0 = r0.isDuetGreenSrceen
            if (r0 == 0) goto L32
            return
        L32:
            android.content.res.Resources r3 = X.C1BWL.LIZJ()
            java.lang.Object[] r2 = new java.lang.Object[r7]
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r5.creativeModel
            com.ss.android.ugc.aweme.creative.model.duet.DuetModel r0 = r0.duetModel
            com.ss.android.ugc.aweme.creative.model.duet.DuetUser r0 = r0.duetAuthor
            if (r0 == 0) goto L44
            java.lang.String r0 = r0.nickname
            if (r0 != 0) goto L46
        L44:
            java.lang.String r0 = ""
        L46:
            r2[r4] = r0
            r0 = 2131826574(0x7f11178e, float:1.9286036E38)
            java.lang.String r4 = r3.getString(r0, r2)
            X.0nKG r6 = X.EnumC1430380nKG.CT_DUET_ANCHOR
            int r9 = r6.getTYPE()
            android.content.res.Resources r3 = X.C1BWL.LIZJ()
            X.0C64 r2 = X.C0C64.LJIILLIIL()
            java.lang.String r0 = "anchor_duet_name"
            int r2 = r2.LJIJ(r8, r7, r0, r7)
            if (r2 == r7) goto Lbc
            r0 = 2
            if (r2 == r0) goto Lb8
            r0 = 3
            if (r2 != r0) goto Lbc
            r0 = 2131826569(0x7f111789, float:1.9286026E38)
        L6e:
            java.lang.String r10 = r3.getString(r0)
            java.lang.String r0 = "https://p16-sg.tiktokcdn.com/obj/tiktok-obj/Duet.png"
            java.lang.String r14 = X.C1429550nIv.LIZ(r6, r0)
            X.0nIl r3 = X.C1429450nIl.LIZ
            java.lang.String r2 = r5.getDuetFrom()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r5.creativeModel
            com.ss.android.ugc.aweme.creative.model.duet.DuetModel r0 = r0.duetModel
            java.lang.String r0 = r0.thumbnailUrl
            r3.getClass()
            java.lang.String r13 = LJJIIJZLJL(r2, r0)
            r0 = 0
            java.lang.String r16 = LJJIIZ(r4, r0)
            com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo r8 = new com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo
            r22 = 0
            java.lang.String r11 = ""
            long r2 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r15 = java.lang.Long.valueOf(r2)
            java.lang.Boolean r20 = java.lang.Boolean.TRUE
            r21 = 1
            r24 = 0
            r12 = r11
            r17 = r11
            r18 = r11
            r19 = r11
            r23 = r22
            r25 = r22
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r8)
        Lb7:
            return
        Lb8:
            r0 = 2131826572(0x7f11178c, float:1.9286032E38)
            goto L6e
        Lbc:
            r0 = 2131826568(0x7f111788, float:1.9286024E38)
            goto L6e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1429450nIl.LJIIL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.util.List, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIILIIL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r18, java.util.List r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1429450nIl.LJIILIIL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.util.List, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016c A[EDGE_INSN: B:125:0x016c->B:92:0x016c BREAK  A[LOOP:3: B:57:0x00e6->B:127:?]] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Iterable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIILL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r26, java.util.List r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1429450nIl.LJIILL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.util.List, boolean):void");
    }

    public static void LJIIZILJ(List list, AVUploadMiscInfoStruct aVUploadMiscInfoStruct, VideoPublishEditModel videoPublishEditModel) throws JSONException {
        String templateType;
        String name;
        Integer sourceId;
        UrlModel iconUrl;
        List<String> urlList;
        String str;
        UrlModel iconUrl2;
        List<String> urlList2;
        C1412410mrH.LIZ.getClass();
        TemplatePostInfo templatePostInfoLIZ = C1412410mrH.LIZ(videoPublishEditModel);
        String dispatchType = null;
        if (templatePostInfoLIZ != null) {
            templateType = templatePostInfoLIZ.getTemplateType();
        } else {
            templateType = null;
        }
        EnumC1430380nKG enumC1430380nKG = (EnumC1430380nKG) C298980Bnk.LIZJ(C1394440mOI.LJFF(C1394440mOI.LJII(templateType)));
        if (enumC1430380nKG == null) {
            enumC1430380nKG = EnumC1430380nKG.MV_TEMPLATE;
        }
        if (C298980Bnk.LIZ() && !C0AYL.LIZ(Integer.valueOf(enumC1430380nKG.getTYPE()))) {
            return;
        }
        MvModel mvModel = aVUploadMiscInfoStruct.mvInfo;
        if (mvModel != null) {
            name = mvModel.getName();
            if (name != null && name.length() != 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("add_from", 1);
                    jSONObject.put("third_id", aVUploadMiscInfoStruct.mvThemeId);
                    MvModel mvModel2 = aVUploadMiscInfoStruct.mvInfo;
                    if (mvModel2 != null && (iconUrl = mvModel2.getIconUrl()) != null && (urlList = iconUrl.getUrlList()) != null && !urlList.isEmpty()) {
                        MvModel mvModel3 = aVUploadMiscInfoStruct.mvInfo;
                        if (mvModel3 != null && (iconUrl2 = mvModel3.getIconUrl()) != null && (urlList2 = iconUrl2.getUrlList()) != null) {
                            str = urlList2.get(0);
                        } else {
                            str = null;
                        }
                        jSONObject.put("icon_url", str);
                    }
                    jSONObject.put("mv_template_type", aVUploadMiscInfoStruct.mvType);
                    if (templatePostInfoLIZ != null) {
                        sourceId = templatePostInfoLIZ.getSourceId();
                    } else {
                        sourceId = null;
                    }
                    jSONObject.put("source_id", sourceId);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("sub_type", templateType);
                if (templatePostInfoLIZ != null) {
                    dispatchType = templatePostInfoLIZ.getDispatchType();
                }
                jSONObject2.put("dispatch_type", dispatchType);
                String strJ3 = C786410Ut5.J3(jSONObject2);
                int type = enumC1430380nKG.getTYPE();
                String strJ32 = C786410Ut5.J3(jSONObject);
                ArrayList<EnumC1430380nKG> arrayList = C1429550nIv.LIZ;
                ((ArrayList) list).add(new CreateAnchorInfo(type, name, "", "", strJ32, C1429550nIv.LIZ(enumC1430380nKG, LJJIJ()), -1L, strJ3, "", "", templateType, Boolean.TRUE, true, null, null, false, null));
                return;
            }
        } else {
            name = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[addMiscInfoAnchors] : keyword = ");
        sbLIZ.append(name);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static CreateAnchorInfo LJJIIJ(C1429450nIl c1429450nIl, String str, JSONObject jSONObject) {
        int i;
        String strJ3;
        boolean zLIZ = C566080MIc.LIZ();
        c1429450nIl.getClass();
        if (zLIZ) {
            i = 28;
        } else {
            i = 82;
        }
        String string = C1325880kbi.LIZIZ(R.drawable.c4q).toString();
        ArrayList<EnumC1430380nKG> arrayList = C1429550nIv.LIZ;
        String strLIZ = C1429550nIv.LIZ(EnumC1430380nKG.AI_SELF_ANCHOR, string);
        if (zLIZ) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("sub_type", "ai_self");
                strJ3 = C786410Ut5.J3(jSONObject2);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                strJ3 = "";
            }
        } else {
            strJ3 = "";
        }
        return new CreateAnchorInfo(i, str, "", "", C786410Ut5.J3(jSONObject), strLIZ, Long.valueOf(SystemClock.elapsedRealtime()), strJ3, "", "", String.valueOf(EnumC1430380nKG.AI_SELF_ANCHOR.getTYPE()), Boolean.TRUE, true, null, null, false, null);
    }

    public static void LIZLLL(List list, VideoPublishEditModel videoPublishEditModel, Map map, String str, boolean z, int i) {
        boolean z2 = z;
        Map map2 = map;
        String str2 = null;
        if ((i & 4) != 0) {
            map2 = null;
        }
        if ((i & 8) == 0) {
            str2 = str;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        SettingsManager.LIZLLL().getClass();
        boolean z3 = !SettingsManager.LIZ("aigc_offline_anchor_restore_killswitch", false);
        if (z3) {
            AIGCOfflineModel aIGCOfflineModel = videoPublishEditModel.creativeModel.aigcOfflineModel;
            if (!aIGCOfflineModel.isOfflineAIGCEffectGenerated) {
                List<CreateAnchorInfo> listLIZIZ = C1403720mdG.LIZIZ(videoPublishEditModel, z2);
                if (!listLIZIZ.isEmpty()) {
                    Iterator<CreateAnchorInfo> it2 = listLIZIZ.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        CreateAnchorInfo next = it2.next();
                        if (next.getKeyword().length() != 0 && next.getContent().length() != 0) {
                            try {
                                JSONObject jSONObject = new JSONObject(next.getContent());
                                if (next.getType() == 28 && jSONObject.optInt("add_from") == 1 && jSONObject.optBoolean("aigc_offline_anchor", false)) {
                                    String strOptString = jSONObject.optString("third_id");
                                    String strOptString2 = jSONObject.optString("icon_url");
                                    if (strOptString.length() != 0 && strOptString2.length() != 0) {
                                        aIGCOfflineModel.propId = strOptString;
                                        aIGCOfflineModel.propName = next.getKeyword();
                                        aIGCOfflineModel.iconUrl = strOptString2;
                                        aIGCOfflineModel.isOfflineAIGCEffectGenerated = true;
                                        break;
                                    }
                                }
                            } catch (NullPointerException e) {
                                TryCatchGuardChecker.doCheck(e);
                            } catch (JSONException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                        }
                    }
                }
            }
        }
        AIGCOfflineModel aIGCOfflineModel2 = videoPublishEditModel.creativeModel.aigcOfflineModel;
        if (aIGCOfflineModel2.isOfflineAIGCEffectGenerated) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("add_from", 1);
                jSONObject2.put("third_id", aIGCOfflineModel2.propId);
                jSONObject2.put("icon_url", aIGCOfflineModel2.iconUrl);
                if (z3) {
                    jSONObject2.put("aigc_offline_anchor", true);
                }
                String str3 = aIGCOfflineModel2.propName;
                String strJ3 = C786410Ut5.J3(jSONObject2);
                ArrayList<EnumC1430380nKG> arrayList = C1429550nIv.LIZ;
                ((ArrayList) list).add(new CreateAnchorInfo(28, str3, "", "", strJ3, C1429550nIv.LIZ(EnumC1430380nKG.PROP, C1429590nIz.LIZ().effectAnchorUrl), Long.valueOf(SystemClock.elapsedRealtime()), "", "", "", "", Boolean.TRUE, true, null, null, false, null));
            } catch (JSONException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            if (z3 && map2 != null && str2 != null && str2.length() != 0 && aIGCOfflineModel2.propId.length() > 0) {
                String str4 = (String) map2.get(str2);
                if (str4 != null && str4.length() != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str4);
                    sbLIZ.append(',');
                    sbLIZ.append(aIGCOfflineModel2.propId);
                    map2.put(str2, C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                map2.put(str2, aIGCOfflineModel2.propId);
            }
        }
    }
}
