package X;

import android.content.Intent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EPAnchorData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.autocut.lyricsrule.ILyricsRuleTemplatePreloadService;
import com.ss.android.ugc.effectmanager.effect.model.AssetFrom;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0L7D, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L7D {
    public static final C0L7D LIZ = new C0L7D();

    public static boolean LIZ(CreativeModel creativeModel, AVMusic aVMusic) {
        String str;
        boolean z;
        String strLIZLLL;
        String str2;
        List<String> urlList;
        List<String> urlList2;
        String str3;
        List<String> urlList3;
        EPAnchorData ePAnchorData = creativeModel.editorProSchemeModel.anchorData;
        String str4 = null;
        if (ePAnchorData == null || (str = ePAnchorData.resourceId) == null) {
            str = "";
        }
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C1426005i6.LIZJ(C1398350mUb.LIZIZ, "Anchor.AutoCutInject", "REJECT empty resourceId");
            return false;
        }
        String musicId = aVMusic.getMusicId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(musicId);
        sbLIZ.append('#');
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        AutoCutModel autoCutModel = creativeModel.autoCutModel;
        List<AutoCutThemeData> list = autoCutModel.templateList;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<AutoCutThemeData> it2 = list.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().templateId, str)) {
                    C1426005i6.LIZ(C1398350mUb.LIZIZ, "Anchor.AutoCutInject", "SKIP exists key=" + strLIZIZ);
                    return false;
                }
            }
        }
        ILyricsRuleTemplatePreloadService iLyricsRuleTemplatePreloadService = (ILyricsRuleTemplatePreloadService) PluggableExtentionKt.pluggableSpi$default(ILyricsRuleTemplatePreloadService.class, false, false, false, 14, null);
        if (iLyricsRuleTemplatePreloadService != null) {
            strLIZLLL = iLyricsRuleTemplatePreloadService.LIZLLL(musicId, str);
        } else {
            strLIZLLL = null;
        }
        C0MJ9 c0mj9 = C0MJ9.AUTO_CUT;
        int iOrdinal = c0mj9.ordinal();
        EnumC1412640mre enumC1412640mre = EnumC1412640mre.LYRICS_RULE_TEMPLATE;
        int value = enumC1412640mre.getValue();
        UrlModel urlModel = aVMusic.playUrl;
        if (urlModel != null && (urlList3 = urlModel.getUrlList()) != null) {
            str2 = (String) C13LP.LJJJLL(urlList3);
        } else {
            str2 = null;
        }
        String str5 = aVMusic.musicName;
        UrlModel urlModel2 = aVMusic.coverMedium;
        if (urlModel2 != null && (urlList2 = urlModel2.getUrlList()) != null && (str3 = (String) C13LP.LJJJLL(urlList2)) != null) {
            str4 = str3;
        } else {
            UrlModel urlModel3 = aVMusic.coverThumb;
            if (urlModel3 != null && (urlList = urlModel3.getUrlList()) != null) {
                str4 = (String) C13LP.LJJJLL(urlList);
            }
        }
        String str6 = str4;
        AutoCutThemeData autoCutThemeData = new AutoCutThemeData(iOrdinal, 0, str, value, null, "", null, musicId, str6, str5, null, true, "", "", null, null, null, null, null, null, -1, str2, Boolean.FALSE, null, null, null, UUID.randomUUID().toString(), Integer.valueOf(AssetFrom.CLIENT_INSERT.getValue()), C0MJA.NONE, null, null, null, EnumC543490LTf.COMPLETED, null, false, null, 0, false, 0, null, null, strLIZLLL);
        ListProtector.add(autoCutModel.templateList, 0, autoCutThemeData);
        C1416110mxF.LJIIIZ(autoCutModel, 0, c0mj9, enumC1412640mre.getValue(), str, "", "", C0L9M.FIRST_GENERATE_AUTOCUT.getValue(), null);
        autoCutModel.clickFrom = "anchor";
        autoCutModel.clickFromMostRecent = "anchor";
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("INSERT key=");
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(" name=");
        sbLIZ2.append(aVMusic.musicName);
        sbLIZ2.append(" musicUrl=");
        sbLIZ2.append(autoCutThemeData.musicUrl);
        sbLIZ2.append(" coverUrl=");
        sbLIZ2.append(autoCutThemeData.coverUrl);
        sbLIZ2.append(" lyricCoverOverlayUrl=");
        sbLIZ2.append(autoCutThemeData.lyricCoverOverlayUrl);
        C1426005i6.LIZ(c1398350mUb, "Anchor.AutoCutInject", C2188811AlT.LIZIZ(sbLIZ2));
        return true;
    }

    public static final boolean LIZIZ(Intent intent, AVMusic aVMusic) {
        CreativeModel creativeModelLIZIZ = C0MUK.LIZIZ(intent);
        LIZ.getClass();
        boolean zLIZ = LIZ(creativeModelLIZIZ, aVMusic);
        if (zLIZ) {
            C0MUK.LJIIIZ(intent, creativeModelLIZIZ);
        }
        return zLIZ;
    }
}
