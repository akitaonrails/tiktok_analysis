package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetPanelModelKt;
import com.ss.android.ugc.effectmanager.effect.model.AssetType;
import java.util.Map;

/* JADX INFO: renamed from: X.0n7W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1422480n7W {
    public static final C1422480n7W LIZ = new C1422480n7W();

    public static String LIZIZ(C1419590n2r c1419590n2r) {
        EnumC1412640mre enumC1412640mreLIZLLL;
        try {
            AssetType assetType = AssetPanelModelKt.toAssetType(c1419590n2r.LIZ.getAsset_type());
            if (assetType != null && (enumC1412640mreLIZLLL = C1412660mrg.LIZLLL(assetType)) != null) {
                return C1412630mrd.LIZLLL(enumC1412640mreLIZLLL);
            }
            return null;
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void LIZJ(ShortVideoContext shortVideoContext, boolean z, int i) {
        int i2;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        if (z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c0lab.LIZ(i2, "is_quick_search");
        c0lab.LIZ(i, "location");
        C20684815ws.LJIILLIIL("ttcrt_tab_search_entrance_click", c0lab.LIZ);
    }

    public static C0LAB LIZ(String str, C1422410n7P c1422410n7P, String str2, C1419590n2r c1419590n2r, int i, int i2) {
        String asset_id;
        String strLIZIZ;
        int i3;
        Asset asset;
        Asset asset2;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("search_id", str);
        c0lab.LJ("enter_from", c1422410n7P.LIZIZ);
        c0lab.LJ("search_keyword", str2);
        String creatorSearchInfo = null;
        if (c1419590n2r != null && (asset2 = c1419590n2r.LIZ) != null) {
            asset_id = asset2.getAsset_id();
        } else {
            asset_id = null;
        }
        c0lab.LJ("search_result_id", asset_id);
        if (c1419590n2r != null) {
            LIZ.getClass();
            strLIZIZ = LIZIZ(c1419590n2r);
        } else {
            strLIZIZ = null;
        }
        c0lab.LJ("tt_template_type", strLIZIZ);
        c0lab.LJ("search_type", "create_tab_search_general");
        int i4 = 0;
        if (i == 1) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        c0lab.LIZ(i3, "is_fullscreen");
        c0lab.LIZ(i2, "universal_rank");
        if (i == 1) {
            i4 = 1;
        }
        c0lab.LIZ(i4, "is_inner");
        if (c1419590n2r != null && (asset = c1419590n2r.LIZ) != null) {
            creatorSearchInfo = asset.getCreatorSearchInfo();
        }
        c0lab.LJ("creator_search_info", creatorSearchInfo);
        return c0lab;
    }

    public static void LIZLLL(boolean z, String str, String str2, Integer num, String str3, C1422410n7P c1422410n7P) {
        String str4;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("words_source", str);
        c0lab.LJ("words_content", str2);
        c0lab.LIZLLL(num, "words_position");
        c0lab.LJ("search_position", str3);
        c0lab.LJ("words_label", "template");
        if (c1422410n7P != null) {
            c0lab.LJ("blankpage_id", c1422410n7P.LJ);
        }
        Map<String, String> map = c0lab.LIZ;
        if (z) {
            str4 = "trending_words_show";
        } else {
            str4 = "trending_words_click";
        }
        C20684815ws.LJIILLIIL(str4, map);
    }
}
