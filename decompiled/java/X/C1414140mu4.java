package X;

import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetConsumerType;
import com.ss.android.ugc.effectmanager.effect.model.AssetParentType;
import com.ss.android.ugc.effectmanager.effect.model.AssetType;
import com.ss.android.ugc.effectmanager.effect.model.Author;
import com.ss.android.ugc.effectmanager.effect.model.BusinessExtra;
import com.ss.android.ugc.effectmanager.effect.model.CoverInfo;
import com.ss.android.ugc.effectmanager.effect.model.FileInf;
import com.ss.android.ugc.effectmanager.effect.model.Icon;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mu4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1414140mu4 {
    public static final C1414140mu4 LIZ = new C1414140mu4();

    public static String LIZ(String str, String str2, String str3) throws JSONException {
        boolean z;
        JSONObject jSONObject;
        if (Intrinsics.LJFF(str2, "default")) {
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                jSONObject = new JSONObject();
                LIZ.getClass();
                jSONObject.put("tt_prop", true);
                jSONObject.put("tt_prop_id", str3);
            } else {
                try {
                    jSONObject = new JSONObject(str);
                    LIZ.getClass();
                    jSONObject.put("tt_prop", true);
                    jSONObject.put("tt_prop_id", str3);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    jSONObject = new JSONObject();
                    LIZ.getClass();
                    jSONObject.put("tt_prop", true);
                    jSONObject.put("tt_prop_id", str3);
                }
            }
            return C786410Ut5.J3(jSONObject);
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C1412800mru LIZIZ(AutoCutThemeData autoCutThemeData, NLEModel nLEModel, AVMusic aVMusic) {
        Pair pair;
        String str;
        List<FileInf> listSingletonList;
        String strJ4 = autoCutThemeData.name;
        if (strJ4 == null) {
            strJ4 = "";
        }
        boolean zBooleanValue = false;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_autocut_reuse_music_rename_templates", true, false) && autoCutThemeData.reuseMusicAlignBranch != 0) {
            strJ4 = C786410Ut5.j4(C20642515q3.LJI(2131850064), Arrays.copyOf(new Object[]{Integer.valueOf(autoCutThemeData.reuseMusicAlignDisplayIndex)}, 1));
        }
        UrlModel urlModel = new UrlModel();
        urlModel.setUri(autoCutThemeData.coverUrl);
        urlModel.setWidth(urlModel.getWidth());
        urlModel.setHeight(urlModel.getHeight());
        ArrayList arrayList = new ArrayList();
        String str2 = autoCutThemeData.coverUrl;
        if (str2 == null) {
            str2 = "";
        }
        arrayList.add(str2);
        urlModel.setUrlList(arrayList);
        int i = autoCutThemeData.templateType;
        if (i == EnumC1412640mre.CUT_SAME.getValue()) {
            pair = new Pair(MixEditingMaterialType.CC_TEMPLATE, Integer.valueOf(AssetType.CAPCUT_TEMPLATE.getValue()));
        } else if (i == EnumC1412640mre.PUGC_TEMPLATE.getValue()) {
            pair = new Pair(MixEditingMaterialType.PUGC_TEMPLATE, Integer.valueOf(AssetType.PUGC_TEMPLATE.getValue()));
        } else if (i == EnumC1412640mre.AIGT.getValue()) {
            pair = new Pair(MixEditingMaterialType.AIGT, Integer.valueOf(AssetType.AIGT.getValue()));
        } else if (i == EnumC1412640mre.SGT.getValue()) {
            pair = new Pair(MixEditingMaterialType.SGT, Integer.valueOf(AssetType.SGT.getValue()));
        } else if (i != EnumC1412640mre.ALGORITHM_TEMPLATE.getValue() && i != EnumC1412640mre.DESIGNER_FIXED_TEMPLATE.getValue()) {
            if (i == EnumC1412640mre.AI_ALIVE_TEMPLATE.getValue()) {
                pair = new Pair(MixEditingMaterialType.AI_ALIVE_TEMPLATE, Integer.valueOf(AssetType.AI_ALIVE_TEMPLATE.getValue()));
            } else if (i == EnumC1412640mre.AUTO_PICK_TEMPLATE.getValue()) {
                pair = new Pair(MixEditingMaterialType.AUTO_PICK_TEMPLATE, Integer.valueOf(AssetType.AUTO_PICK_TEMPLATE.getValue()));
            } else if (i == EnumC1412640mre.UGC_TEMPLATE.getValue()) {
                pair = new Pair(MixEditingMaterialType.UGC_TEMPLATE, Integer.valueOf(AssetType.UGC_TEMPLATE.getValue()));
            } else {
                pair = new Pair(MixEditingMaterialType.UNKNOWN_TYPE, -1);
            }
        } else {
            pair = new Pair(MixEditingMaterialType.AI_TEMPLATE, Integer.valueOf(AssetType.AUTOCUT_AI_TEMPLATE_V2.getValue()));
        }
        MixEditingMaterialType mixEditingMaterialType = (MixEditingMaterialType) pair.getFirst();
        int iIntValue = ((Number) pair.getSecond()).intValue();
        if (C703302op.LIZ(autoCutThemeData.templateId)) {
            str = autoCutThemeData.templateId;
        } else {
            str = autoCutThemeData.musicId;
            if (str == null) {
                str = "";
            }
        }
        boolean zLIZ = C296620Bjw.LIZ();
        String str3 = null;
        List<Icon> listSingletonList2 = null;
        FileInf fileInf = new FileInf(null, null, null, Collections.singletonList(autoCutThemeData.templateUrl), null);
        Icon icon = new Icon(urlModel.getUri(), "", "", urlModel.getUrlList());
        Asset asset = new Asset();
        if (zLIZ) {
            listSingletonList = Collections.singletonList(fileInf);
        } else {
            listSingletonList = null;
        }
        if (zLIZ) {
            listSingletonList2 = Collections.singletonList(icon);
        }
        Asset assetCopy = asset.copy(asset.asset_id, asset.asset_parent_type, asset.asset_consumer_type, asset.asset_type, str, asset.title, asset.desc, asset.author, asset.file, listSingletonList, asset.cover, asset.cover_list, asset.icon, listSingletonList2, asset.business_extra, asset.tags, asset.extra, asset.version, asset.creatorSearchInfo, asset.from_source);
        assetCopy.setAsset_id(str);
        assetCopy.setAsset_parent_type(AssetParentType.TEMPLATE.getValue());
        assetCopy.setAsset_type(iIntValue);
        assetCopy.setAsset_consumer_type(AssetConsumerType.AUTOCUT_INSERT_TEMPLATE.getValue());
        assetCopy.setFile(fileInf);
        assetCopy.setTitle(strJ4);
        assetCopy.setIcon(icon);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "mix_editing_ai_alive_template_use_legacy_music_id", true, false) || mixEditingMaterialType != MixEditingMaterialType.AI_ALIVE_TEMPLATE) {
            assetCopy.getBusiness_extra().setMusic_id(autoCutThemeData.musicId);
        }
        assetCopy.getBusiness_extra().setMusic_url(autoCutThemeData.musicUrl);
        assetCopy.getBusiness_extra().setTemplate_backup_music_url(autoCutThemeData.musicUrl);
        BusinessExtra business_extra = assetCopy.getBusiness_extra();
        Boolean bool = autoCutThemeData.musicPostUnavailable;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        business_extra.setMusic_post_unavailable(zBooleanValue);
        boolean z = false;
        return new C1412800mru(mixEditingMaterialType, strJ4, urlModel, assetCopy, new C1413040msI(NLEModel.dynamicCast(nLEModel.deepClone()), aVMusic), z, str3, null == true ? 1 : 0, null == true ? 1 : 0, z, autoCutThemeData.iconType, autoCutThemeData.reuseMusicAlignBranch, autoCutThemeData.reuseMusicLocalCoverPath, autoCutThemeData.shouldApplyReuseMusicOnSelect, autoCutThemeData.reuseMusicName, null == true ? 1 : 0, 33728);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r104v0, types: [com.ss.android.ugc.effectmanager.effect.model.Asset] */
    /* JADX WARN: Type inference failed for: r94v0, types: [java.util.List] */
    public static C1412800mru LIZJ(MusicBuzModel musicBuzModel, Context context, String str) {
        boolean z;
        boolean z2;
        UrlModel urlModelLJIIJJI;
        String str2;
        UrlModel coverMedium;
        List<String> urlList;
        String string;
        String str3;
        List<String> urlList2;
        String str4;
        List<String> urlList3;
        List listSingletonList;
        List<String> urlList4;
        List<String> urlList5;
        Object objSingletonList = null;
        if (C1429680nJ8.LJ(musicBuzModel)) {
            UrlModel urlModel = new UrlModel();
            urlModel.setUri(musicBuzModel.localThumbPath);
            urlModel.setWidth(urlModel.getWidth());
            urlModel.setHeight(urlModel.getHeight());
            ArrayList arrayList = new ArrayList();
            String str5 = musicBuzModel.localThumbPath;
            if (str5 == null) {
                str5 = "";
            }
            arrayList.add(str5);
            urlModel.setUrlList(arrayList);
            urlModelLJIIJJI = urlModel;
        } else {
            if (!musicBuzModel.isPGC && !C1429680nJ8.LJ(musicBuzModel)) {
                z = true;
            } else {
                z = false;
            }
            if (!musicBuzModel.isPGC && !C1429680nJ8.LJ(musicBuzModel) && musicBuzModel.matchedPGCSoundInfo != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (C1418630n1J.LIZJ(z, z2, false) == EnumC1419660n2y.USE_PGC) {
                MatchedPGCSoundInfo matchedPGCSoundInfo = musicBuzModel.matchedPGCSoundInfo;
                if (matchedPGCSoundInfo != null && (coverMedium = matchedPGCSoundInfo.getCoverMedium()) != null && (urlList = coverMedium.getUrlList()) != null) {
                    str2 = (String) C13LP.LJJJLZIJ(0, urlList);
                } else {
                    str2 = null;
                }
                urlModelLJIIJJI = C19591311kt.LJIIJJI(str2);
            } else {
                MusicObject musicObject = musicBuzModel.music;
                if (musicObject != null) {
                    urlModelLJIIJJI = musicObject.coverThumb;
                } else {
                    urlModelLJIIJJI = null;
                }
            }
        }
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
        if (aVMusicExtractAVMusic == null) {
            aVMusicExtractAVMusic = new AVMusic();
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("studio_mix_material_anr_fix_opt", true) && C123100dR.LIZ(musicBuzModel.musicPath) && new C0VSJ(musicBuzModel.musicPath).exists()) {
            aVMusicExtractAVMusic.path = musicBuzModel.musicPath;
        }
        MixEditingMaterialType mixEditingMaterialType = MixEditingMaterialType.SOUND_SYNC;
        if (context == null || (string = context.getString(2131848921)) == null) {
            string = "";
        }
        MusicObject musicObject2 = musicBuzModel.music;
        if (musicObject2 != null) {
            boolean zLIZ = C296620Bjw.LIZ();
            FileInf fileInf = new FileInf(null, null, null, null, null);
            UrlModel urlModel2 = musicObject2.coverThumb;
            if (urlModel2 != null && (urlList5 = urlModel2.getUrlList()) != null) {
                str3 = (String) C13LP.LJJJLL(urlList5);
            } else {
                str3 = null;
            }
            List listSingletonList2 = null;
            UrlModel urlModel3 = musicObject2.coverThumb;
            if (urlModel3 != null) {
                urlList2 = urlModel3.getUrlList();
            } else {
                urlList2 = null;
            }
            CoverInfo coverInfo = new CoverInfo(str3, null, null, urlList2, null);
            UrlModel urlModel4 = musicObject2.coverThumb;
            if (urlModel4 != null && (urlList4 = urlModel4.getUrlList()) != null) {
                str4 = (String) C13LP.LJJJLL(urlList4);
            } else {
                str4 = null;
            }
            UrlModel urlModel5 = musicObject2.coverThumb;
            if (urlModel5 != null) {
                urlList3 = urlModel5.getUrlList();
            } else {
                urlList3 = null;
            }
            Icon icon = new Icon(str4, null, null, urlList3);
            String musicId = MusicBeanUtilKt.getMusicId(musicObject2);
            int value = AssetType.SOUND_SYNC.getValue();
            int value2 = AssetParentType.SOUNDSYNC.getValue();
            int value3 = AssetConsumerType.SOUND_SYNC.getValue();
            String musicId2 = MusicBeanUtilKt.getMusicId(musicObject2);
            String str6 = musicObject2.musicName;
            if (str6 == null) {
                str6 = "";
            }
            Author author = new Author("", null, null, null);
            if (zLIZ) {
                listSingletonList = Collections.singletonList(fileInf);
                listSingletonList2 = Collections.singletonList(coverInfo);
                objSingletonList = Collections.singletonList(icon);
            } else {
                listSingletonList = null;
            }
            objSingletonList = new Asset(musicId, value2, value3, value, musicId2, str6, str6, author, fileInf, listSingletonList, coverInfo, listSingletonList2, icon, objSingletonList, new BusinessExtra(null, null, null, null, null, "", "", null, null, null, null, null, null, "", "", "", null, null, null, null, "", null, null, null, "", "", "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "", "", false, null, null, null, null, null, null, null, null, null, null, null, false, null, Boolean.FALSE, null, null, null, null, null, null, "", null, null, null, null, null, null), C13BV.INSTANCE, "", "", null, -1);
        }
        C1413060msK c1413060msK = new C1413060msK(aVMusicExtractAVMusic);
        if (str != null && !Intrinsics.LJFF(str, aVMusicExtractAVMusic.getMusicId())) {
            c1413060msK.LIZJ = aVMusicExtractAVMusic;
        }
        return new C1412800mru(mixEditingMaterialType, string, urlModelLJIIJJI, objSingletonList, c1413060msK, false, null, false ? 1 : 0, false ? 1 : 0, false ? 1 : 0, false ? 1 : 0, false ? 1 : 0, false ? 1 : 0, false ? 1 : 0, false ? 1 : 0, false ? 1 : 0, 65472);
    }
}
