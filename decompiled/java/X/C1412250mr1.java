package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.TemplateMobParams;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetPanelModelKt;
import com.ss.android.ugc.effectmanager.effect.model.AssetType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0mr1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1412250mr1 {
    public static long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    public static EnumC1412640mre LIZ(Asset asset) {
        AssetType assetType = AssetPanelModelKt.toAssetType(asset.getAsset_type());
        if (assetType != null) {
            return C1412660mrg.LIZLLL(assetType);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0 A[PHI: r17
      0x00a0: PHI (r17v3 java.lang.String) = (r17v0 java.lang.String), (r17v4 java.lang.String) binds: [B:43:0x009e, B:41:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.C1412200mqw r21) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1412250mr1.LIZJ(X.0mqw):void");
    }

    public static void LIZIZ(C1412200mqw c1412200mqw, int i) {
        Asset asset;
        boolean z;
        boolean zLIZIZ;
        C1412800mru c1412800mru = c1412200mqw.LIZIZ;
        if (c1412800mru != null && (asset = c1412800mru.LIZLLL) != null) {
            TemplateMobParams templateMobParamsLJ = C1412590mrZ.LJ(asset, c1412800mru);
            int i2 = c1412200mqw.LIZ;
            VideoPublishEditModel videoPublishEditModel = c1412200mqw.LIZJ;
            C443120HZe<Integer, Integer, Integer> c443120HZeLJFF = C1417710mzp.LJFF(videoPublishEditModel.getMediaModelList());
            int iIntValue = c443120HZeLJFF.getSecond().intValue();
            int iIntValue2 = c443120HZeLJFF.getThird().intValue();
            int size = videoPublishEditModel.creativeModel.initialModel.highLightVideoParametersModel.albumFragmentIds.size();
            String str = templateMobParamsLJ.autocutClickFrom;
            int i3 = templateMobParamsLJ.autocutTemplateType;
            String str2 = templateMobParamsLJ.autocutTemplateId;
            String str3 = templateMobParamsLJ.autocutTemplateGroupId;
            String str4 = templateMobParamsLJ.templateTag;
            String creationId = videoPublishEditModel.getCreationId();
            String str5 = videoPublishEditModel.mShootWay;
            int origin = videoPublishEditModel.getOrigin();
            String str6 = templateMobParamsLJ.musicId;
            String strLIZIZ = C1412490mrP.LIZIZ(videoPublishEditModel);
            String str7 = templateMobParamsLJ.templateResourceId;
            CreativeModel creativeModel = videoPublishEditModel.creativeModel;
            NowsShootModel nowsShootModel = creativeModel.nowsShootModel;
            if (nowsShootModel != null && nowsShootModel.type == 0) {
                z = true;
            } else {
                z = false;
            }
            String str8 = creativeModel.mixEditingModel.requestId;
            CommonMobParamModel commonMobParamModel = creativeModel.commonMobModel;
            C1417720mzq c1417720mzq = new C1417720mzq(commonMobParamModel.originVideoCount, commonMobParamModel.originPhotoCount, null, null, 12);
            String musicId = videoPublishEditModel.getMusicId();
            Integer num = templateMobParamsLJ.assetFrom;
            CreativeModel creativeModel2 = videoPublishEditModel.creativeModel;
            boolean z2 = creativeModel2.draftInfoModel.isDraft;
            boolean z3 = creativeModel2.photoModeEnterEditingStage.isFromMultiPhotoSpecialPage;
            C1414930mvL.LIZ.getClass();
            int iLIZJ = C1414930mvL.LIZJ(videoPublishEditModel);
            AutoCutThemeData autoCutThemeDataLIZJ = C1416110mxF.LIZJ(videoPublishEditModel.creativeModel.autoCutModel);
            if (autoCutThemeDataLIZJ != null) {
                zLIZIZ = C1402530mbL.LIZIZ(autoCutThemeDataLIZJ.featureBits, autoCutThemeDataLIZJ.featureCode);
            } else {
                zLIZIZ = false;
            }
            C1412800mru c1412800mru2 = c1412200mqw.LIZIZ;
            C1417710mzp.LJJIL(str, i, i3, str2, str3, str4, false, creationId, str5, "video_edit_page", origin, str6, i2, iIntValue, iIntValue2, size, strLIZIZ, str7, null, null, z, str8, c1417720mzq, musicId, num, z3, z2, new AwS601S0100000_22(videoPublishEditModel, 655), Integer.valueOf(iLIZJ), zLIZIZ, c1412800mru2.LJIIJJI, c1412800mru2.LJIILIIL, templateMobParamsLJ.sceneType, 786432);
            LIZ = System.currentTimeMillis();
        }
    }

    public static void LIZLLL(Context context, C1412200mqw c1412200mqw) {
        Asset asset;
        boolean zLIZIZ;
        C1412800mru c1412800mru = c1412200mqw.LIZIZ;
        if (c1412800mru == null) {
            return;
        }
        MixEditingMaterialType mixEditingMaterialType = c1412800mru.LIZ;
        if ((mixEditingMaterialType == MixEditingMaterialType.AI_TEMPLATE || mixEditingMaterialType == MixEditingMaterialType.CC_TEMPLATE || mixEditingMaterialType == MixEditingMaterialType.AIGT || mixEditingMaterialType == MixEditingMaterialType.SGT || mixEditingMaterialType == MixEditingMaterialType.PUGC_TEMPLATE || mixEditingMaterialType == MixEditingMaterialType.UGC_TEMPLATE || mixEditingMaterialType == MixEditingMaterialType.EFFECT_TYPE || mixEditingMaterialType == MixEditingMaterialType.SOUND_SYNC || mixEditingMaterialType == MixEditingMaterialType.AI_ALIVE_TEMPLATE || mixEditingMaterialType == MixEditingMaterialType.AUTO_PICK_TEMPLATE || mixEditingMaterialType == MixEditingMaterialType.LYRICS_RULE_TEMPLATE) && (asset = c1412800mru.LIZLLL) != null) {
            TemplateMobParams templateMobParamsLJ = C1412590mrZ.LJ(asset, c1412800mru);
            int i = c1412200mqw.LIZ;
            VideoPublishEditModel videoPublishEditModel = c1412200mqw.LIZJ;
            List<MediaModel> mediaModelList = videoPublishEditModel.getMediaModelList();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(mediaModelList, 10));
            for (MediaModel mediaModel : mediaModelList) {
                AutoCutMediaModel.Companion.getClass();
                arrayList.add(C526710KlB.LIZ(context, mediaModel));
            }
            String str = videoPublishEditModel.mShootWay;
            String creationId = videoPublishEditModel.getCreationId();
            String title = asset.getTitle();
            int origin = videoPublishEditModel.getOrigin();
            String str2 = templateMobParamsLJ.autocutClickFrom;
            String str3 = templateMobParamsLJ.musicId;
            int i2 = templateMobParamsLJ.autocutTemplateType;
            String str4 = templateMobParamsLJ.autocutTemplateId;
            String str5 = templateMobParamsLJ.autocutTemplateGroupId;
            String str6 = templateMobParamsLJ.templateTag;
            String strLIZIZ = C1412490mrP.LIZIZ(videoPublishEditModel);
            String str7 = templateMobParamsLJ.templateResourceId;
            String musicId = videoPublishEditModel.getMusicId();
            Integer num = templateMobParamsLJ.assetFrom;
            AutoCutThemeData autoCutThemeDataLIZJ = C1416110mxF.LIZJ(videoPublishEditModel.creativeModel.autoCutModel);
            if (autoCutThemeDataLIZJ != null) {
                zLIZIZ = C1402530mbL.LIZIZ(autoCutThemeDataLIZJ.featureBits, autoCutThemeDataLIZJ.featureCode);
            } else {
                zLIZIZ = false;
            }
            C1417710mzp.LJJIIZI(arrayList, "video_edit_page", str, creationId, title, Integer.valueOf(i), "", origin, str3, str2, Integer.valueOf(i2), str4, "", null, str5, str6, strLIZIZ, str7, null, null, true, videoPublishEditModel, musicId, num, new AwS601S0100000_22(videoPublishEditModel, 656), zLIZIZ, c1412800mru.LJIIJJI, c1412800mru.LJIILIIL, templateMobParamsLJ.sceneType, 4194304);
        }
    }

    public static void LJ(C1412200mqw c1412200mqw, String str, TemplateMobParams templateMobParams, int i) {
        boolean zLIZIZ;
        if (c1412200mqw.LIZIZ == null || templateMobParams == null) {
            return;
        }
        int i2 = c1412200mqw.LIZ;
        VideoPublishEditModel videoPublishEditModel = c1412200mqw.LIZJ;
        C443120HZe<Integer, Integer, Integer> c443120HZeLJFF = C1417710mzp.LJFF(videoPublishEditModel.getMediaModelList());
        int iIntValue = c443120HZeLJFF.getSecond().intValue();
        int iIntValue2 = c443120HZeLJFF.getThird().intValue();
        long jCurrentTimeMillis = System.currentTimeMillis() - LIZ;
        String str2 = templateMobParams.autocutClickFrom;
        String strLIZLLL = C1412590mrZ.LIZLLL(Integer.valueOf(templateMobParams.autocutTemplateType));
        if (strLIZLLL == null) {
            strLIZLLL = C1416310mxZ.LJJIJIIJI(videoPublishEditModel, null, true);
        }
        String strLJJIJ = C1416310mxZ.LJJIJ(videoPublishEditModel, true);
        int i3 = templateMobParams.autocutTemplateType;
        String str3 = templateMobParams.autocutTemplateId;
        String str4 = templateMobParams.autocutTemplateGroupId;
        String str5 = templateMobParams.templateTag;
        String creationId = videoPublishEditModel.getCreationId();
        String str6 = videoPublishEditModel.mShootWay;
        String enterFrom = videoPublishEditModel.getEnterFrom();
        int origin = videoPublishEditModel.getOrigin();
        String str7 = templateMobParams.musicId;
        String strLIZIZ = C1412490mrP.LIZIZ(videoPublishEditModel);
        String str8 = templateMobParams.templateResourceId;
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        String str9 = creativeModel.mixEditingModel.requestId;
        CommonMobParamModel commonMobParamModel = creativeModel.commonMobModel;
        C1417720mzq c1417720mzq = new C1417720mzq(commonMobParamModel.originVideoCount, commonMobParamModel.originPhotoCount, null, null, 12);
        Integer num = templateMobParams.assetFrom;
        boolean z = creativeModel.draftInfoModel.isDraft;
        AwS601S0100000_22 awS601S0100000_22 = new AwS601S0100000_22(videoPublishEditModel, 657);
        AutoCutThemeData autoCutThemeDataLIZJ = C1416110mxF.LIZJ(videoPublishEditModel.creativeModel.autoCutModel);
        if (autoCutThemeDataLIZJ != null) {
            zLIZIZ = C1402530mbL.LIZIZ(autoCutThemeDataLIZJ.featureBits, autoCutThemeDataLIZJ.featureCode);
        } else {
            zLIZIZ = false;
        }
        C1412800mru c1412800mru = c1412200mqw.LIZIZ;
        C1417710mzp.LJIILLIIL(str2, i, strLIZLLL, strLJJIJ, i3, str3, str4, str5, creationId, str6, enterFrom, origin, str7, i2, iIntValue, iIntValue2, strLIZIZ, jCurrentTimeMillis, str8, null, null, str9, c1417720mzq, str, num, false, z, awS601S0100000_22, zLIZIZ, c1412800mru.LJIIJJI, c1412800mru.LJIILIIL, templateMobParams.sceneType, 67108864);
    }

    public static Object LJFF(C1412200mqw c1412200mqw, String str, Map map, TemplateMobParams templateMobParams, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZ, new C1412190mqv(2, templateMobParams, c1412200mqw, str, map, null));
        if (objLJI != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objLJI;
    }
}
