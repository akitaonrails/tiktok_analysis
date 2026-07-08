package X;

import com.ss.android.ugc.aweme.tools.sticker.core.attributionlink.AttributionLinkScenario;

/* JADX INFO: renamed from: X.11l8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19592811l8 {
    public static AttributionLinkScenario LIZ(EnumC2198891B4d enumC2198891B4d) {
        switch (C2198921B4g.LIZ[enumC2198891B4d.ordinal()]) {
            case 1:
                return AttributionLinkScenario.ATTRIBUTION_LINK_SCENARIO_VIDEO;
            case 2:
                return AttributionLinkScenario.ATTRIBUTION_LINK_SCENARIO_IMAGE;
            case 3:
                return AttributionLinkScenario.ATTRIBUTION_LINK_SCENARIO_LINK;
            case 4:
            case 5:
            case 6:
                return AttributionLinkScenario.ATTRIBUTION_LINK_SCENARIO_MUSIC;
            default:
                throw new C1954807lC();
        }
    }
}
