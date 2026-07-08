package X;

import com.ss.android.ugc.aweme.internalshare.api.experiment.SharePanelSearchRelationApiConfig;

/* JADX INFO: renamed from: X.0CNA, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CNA {
    public static final SharePanelSearchRelationApiConfig LIZ = new SharePanelSearchRelationApiConfig(0, 3, 500);

    public static boolean LIZ() {
        return LIZIZ().enabled == 1;
    }

    public static SharePanelSearchRelationApiConfig LIZIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        SharePanelSearchRelationApiConfig sharePanelSearchRelationApiConfig = LIZ;
        SharePanelSearchRelationApiConfig sharePanelSearchRelationApiConfig2 = (SharePanelSearchRelationApiConfig) c0c64LJIILLIIL.LJJII(SharePanelSearchRelationApiConfig.class, sharePanelSearchRelationApiConfig, "share_panel_search_add_relation_api", true);
        return sharePanelSearchRelationApiConfig2 != null ? sharePanelSearchRelationApiConfig2 : sharePanelSearchRelationApiConfig;
    }
}
