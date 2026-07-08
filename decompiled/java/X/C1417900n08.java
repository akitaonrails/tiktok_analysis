package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.effectmanager.effect.model.AssetFrom;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0n08, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1417900n08 {
    public static AutoCutThemeData LIZ(MusicModel musicModel, C0MJ9 c0mj9, int i, String str, Function1 function1, boolean z, String str2) {
        String str3;
        String str4;
        Object c098200Yq;
        List<String> urlList;
        AssetFrom assetFrom;
        UrlModel coverMedium;
        List<String> urlList2;
        MatchedPGCSoundInfo matchedPGCSoundInfo = musicModel.getMatchedPGCSoundInfo();
        MusicBuzModel musicBuzModel = null;
        if (matchedPGCSoundInfo != null && (coverMedium = matchedPGCSoundInfo.getCoverMedium()) != null && (urlList2 = coverMedium.getUrlList()) != null) {
            str3 = (String) C13LP.LJJJLL(urlList2);
        } else {
            str3 = null;
        }
        if (musicModel.isPgc() || musicModel.isLocalMusic() || musicModel.getMatchedPGCSoundInfo() == null || str3 == null || str3.length() == 0) {
            UrlModel coverMedium2 = musicModel.convertToMusic().getCoverMedium();
            if (coverMedium2 != null && (urlList = coverMedium2.getUrlList()) != null) {
                str4 = (String) C13LP.LJJJLL(urlList);
            } else {
                str4 = null;
            }
            String localThumbPath = musicModel.getLocalThumbPath();
            if (localThumbPath != null) {
                try {
                    c098200Yq = new C0VSJ(localThumbPath).toURI().toURL().toString();
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                str3 = (String) c098200Yq;
            } else {
                str3 = null;
            }
            if (str4 != null) {
                str3 = str4;
            }
        }
        int iOrdinal = c0mj9.ordinal();
        String musicId = musicModel.getMusicId();
        String name = musicModel.getName();
        if (function1 != null) {
            musicBuzModel = (MusicBuzModel) function1.invoke(musicModel);
        }
        if (c0mj9 == C0MJ9.AUTO_CUT) {
            assetFrom = AssetFrom.OTHERS;
        } else {
            assetFrom = AssetFrom.CLIENT_INSERT;
        }
        return new AutoCutThemeData(iOrdinal, 0, "", i, null, "", null, musicId, str3, name, musicBuzModel, z, str, null, null, null, null, null, null, null, -1, str2, Boolean.FALSE, null, null, null, UUID.randomUUID().toString(), Integer.valueOf(assetFrom.getValue()), C0MJA.NONE, null, null, null, EnumC543490LTf.COMPLETED, null, false, null, 0, false, 0, null, null, null);
    }
}
