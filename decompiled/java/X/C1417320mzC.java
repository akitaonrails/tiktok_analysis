package X;

import android.app.Application;
import com.bytedance.ies.smartmovie.jni.Meta;
import com.bytedance.ies.smartmovie.jni.SmartMovieJniJNI;
import com.bytedance.ies.smartmovie.jni.VecMeta;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.edit.FeatureExtraction;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetPanelModelKt;
import com.ss.android.ugc.effectmanager.effect.model.AssetType;
import com.ss.android.ugc.effectmanager.effect.model.CoverInfo;
import com.ss.android.ugc.effectmanager.effect.model.FileInf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS132S0400000_3;

/* JADX INFO: renamed from: X.0mzC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1417320mzC {
    public static final boolean LIZ(AutoCutThemeData autoCutThemeData) {
        return C0LCZ.LIZ(C1412660mrg.LIZJ(autoCutThemeData.templateType), autoCutThemeData.musicPostUnavailable, autoCutThemeData.musicId, autoCutThemeData.musicUrl);
    }

    public static final String LIZIZ(AVMusic aVMusic) {
        String str;
        String title;
        MatchedPGCSoundInfo matchedPGCSoundInfo = aVMusic.getMatchedPGCSoundInfo();
        if (matchedPGCSoundInfo != null && (title = matchedPGCSoundInfo.getTitle()) != null && title.length() > 0) {
            return title;
        }
        if (!aVMusic.isPgc() && !aVMusic.isLocalMusic() && ((Number) C279510AxR.LIZ.getValue()).intValue() > 0 && aVMusic.getMatchedPGCSoundInfo() == null && !aVMusic.getIsRenamedUGC() && ((Boolean) C279520AxS.LIZ.getValue()).booleanValue() && (str = aVMusic.authorName) != null && str.length() != 0) {
            Application application = C0CHQ.LIZ;
            int iN3 = C786410Ut5.n3(application.getResources(), "originalSound_editingPage_soundPanel_soundTitle1", "string", application.getPackageName());
            if (iN3 != 0) {
                return application.getString(iN3, aVMusic.authorName);
            }
        }
        return aVMusic.musicName;
    }

    public static final List<C2262608tk> LIZJ(VecMeta vecMeta) {
        long jLIZIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(vecMeta, 10));
        for (Meta meta : vecMeta) {
            String strLIZLLL = meta.LIZLLL();
            if (meta.LJFF()) {
                jLIZIZ = meta.LIZIZ();
            } else {
                jLIZIZ = 0;
            }
            Boolean boolValueOf = Boolean.valueOf(meta.LJFF());
            String strMeta_getFileUriPath = SmartMovieJniJNI.Meta_getFileUriPath(meta.LIZ, meta);
            if (strMeta_getFileUriPath == null) {
                strMeta_getFileUriPath = "";
            }
            arrayList.add(new C2262608tk(strLIZLLL, jLIZIZ, boolValueOf, null, strMeta_getFileUriPath, null, false, 104));
        }
        return C13LP.LLIIII(arrayList);
    }

    public static final boolean LJ(AutoCutModel autoCutModel) {
        if (C306420Bzk.LIZ()) {
            List<AutoCutThemeData> list = autoCutModel.templateList;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<AutoCutThemeData> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (it2.next().LIZIZ() == C0MJ9.MIX_EDITING) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final AutoCutThemeData LJFF(AutoCutThemeData autoCutThemeData) {
        MusicBuzModel musicBuzModel;
        AVMusic aVMusicExtractAVMusic;
        String musicId;
        String str;
        List<String> urlList;
        List<String> urlList2;
        if (!autoCutThemeData.shouldApplyReuseMusicOnSelect || (musicBuzModel = autoCutThemeData.reuseMusicOverrideBuz) == null || (aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel)) == null || (musicId = aVMusicExtractAVMusic.getMusicId()) == null) {
            return autoCutThemeData;
        }
        UrlModel urlModel = aVMusicExtractAVMusic.playUrl;
        if (urlModel == null || (urlList2 = urlModel.getUrlList()) == null || (str = (String) C13LP.LJJJLL(urlList2)) == null) {
            UrlModel urlModel2 = aVMusicExtractAVMusic.reuseAudioPlayUrl;
            if (urlModel2 != null && (urlList = urlModel2.getUrlList()) != null) {
                str = (String) C13LP.LJJJLL(urlList);
            } else {
                str = null;
            }
        }
        return AutoCutThemeData.LIZ(autoCutThemeData, musicId, musicBuzModel, str, Boolean.FALSE, null, false, null, 0, 0, null, null, -65012865, 1023);
    }

    public static final AwS132S0400000_3 LIZLLL(List list, Set set) {
        C259800zU c259800zU = new C259800zU();
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sb = new StringBuilder("getFeaturesExtraction, path: ");
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C2262608tk) it2.next()).LIZ);
        }
        sb.append(arrayList);
        sb.append(", uri:");
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((C2262608tk) it3.next()).LJ);
        }
        sb.append(arrayList2);
        C201955140j.LIZLLL(c1398350mUb, "msg-log", sb.toString());
        return new AwS132S0400000_3(c259800zU, (C259800zU<List<Pair<FeatureExtraction, Integer>>>) new C118300cf(), (C118300cf) list, (List<C2262608tk>) set, (Set<String>) 0);
    }

    public static final void LJI(AutoCutThemeData autoCutThemeData, Asset asset) {
        FileInf file;
        CoverInfo cover;
        List<String> url_list;
        String str;
        List<String> url_list2;
        EnumC1412640mre enumC1412640mreLIZLLL;
        String str2 = null;
        if (C296620Bjw.LIZ()) {
            List<FileInf> package_list = asset.getPackage_list();
            if (package_list != null) {
                file = (FileInf) C13LP.LJJJLL(package_list);
            } else {
                file = null;
            }
            List<CoverInfo> cover_list = asset.getCover_list();
            if (cover_list != null) {
                cover = (CoverInfo) C13LP.LJJJLL(cover_list);
            } else {
                cover = null;
            }
        } else {
            file = asset.getFile();
            cover = asset.getCover();
        }
        autoCutThemeData.templateId = asset.getAsset_id();
        AssetType assetType = AssetPanelModelKt.toAssetType(asset.getAsset_type());
        if (assetType != null && (enumC1412640mreLIZLLL = C1412660mrg.LIZLLL(assetType)) != null) {
            autoCutThemeData.templateType = enumC1412640mreLIZLLL.getValue();
        }
        if (file != null && (url_list2 = file.getUrl_list()) != null) {
            str2 = (String) C13LP.LJJJLL(url_list2);
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        autoCutThemeData.templateUrl = str2;
        autoCutThemeData.name = asset.getTitle();
        if (cover != null && (url_list = cover.getUrl_list()) != null && (str = (String) C13LP.LJJJLL(url_list)) != null) {
            str3 = str;
        }
        autoCutThemeData.coverUrl = str3;
        autoCutThemeData.anchorName = asset.getBusiness_extra().getAnchor_name();
    }
}
