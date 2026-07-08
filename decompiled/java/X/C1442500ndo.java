package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.property.bytebench.BitrateByteBenchStrategy;

/* JADX INFO: renamed from: X.0ndo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1442500ndo implements InterfaceC1442530ndr {
    public static final /* synthetic */ C1442500ndo LJIILLIIL = new C1442500ndo();
    public final /* synthetic */ InterfaceC1442530ndr LJIILL;

    @Override // X.InterfaceC1442530ndr
    public final float syntheticVideoBitrate() {
        return this.LJIILL.syntheticVideoBitrate();
    }

    @Override // X.InterfaceC1442530ndr
    public final float videoBitrate() {
        return this.LJIILL.videoBitrate();
    }

    @Override // X.InterfaceC1442530ndr
    public final int videoBitrateCategoryIndex() {
        return this.LJIILL.videoBitrateCategoryIndex();
    }

    public C1442500ndo() {
        InterfaceC1442530ndr interfaceC1442530ndr;
        C212350188e c212350188eLIZJ = C212350188e.LIZJ();
        C844470XAv.LIZ.getClass();
        C09GA c09gaLIZIZ = c212350188eLIZJ.LIZIZ(C844470XAv.LJIIJ);
        this.LJIILL = (c09gaLIZIZ == null || (interfaceC1442530ndr = (InterfaceC1442530ndr) c09gaLIZIZ.LJII(BitrateByteBenchStrategy.class)) == null) ? new InterfaceC1442530ndr() { // from class: X.0ndp
            static {
                C1440300naG.LIZ("BitrateByteBenchApi -> use DefaultApi");
            }

            @Override // X.InterfaceC1442530ndr
            public final float syntheticVideoBitrate() {
                SettingsManager.LIZLLL().getClass();
                return SettingsManager.LIZJ("synthetic_video_bitrate", 1.0f);
            }

            @Override // X.InterfaceC1442530ndr
            public final float videoBitrate() {
                SettingsManager.LIZLLL().getClass();
                return SettingsManager.LIZJ("video_bitrate", 1.0f);
            }

            @Override // X.InterfaceC1442530ndr
            public final int videoBitrateCategoryIndex() {
                return C0C64.LJIILLIIL().LJIJ(31744, 0, "video_bitrate_category_index", true);
            }
        } : interfaceC1442530ndr;
    }
}
