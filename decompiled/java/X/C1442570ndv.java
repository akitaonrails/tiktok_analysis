package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.property.bytebench.RecodeByteBenchStrategy;

/* JADX INFO: renamed from: X.0ndv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1442570ndv implements InterfaceC1442580ndw {
    public static final /* synthetic */ C1442570ndv LJIILLIIL = new C1442570ndv();
    public final /* synthetic */ InterfaceC1442580ndw LJIILL;

    @Override // X.InterfaceC1442580ndw
    public final int hdRecodeBitrateThreshold() {
        return this.LJIILL.hdRecodeBitrateThreshold();
    }

    @Override // X.InterfaceC1442580ndw
    public final int recodeBitrateThreshold() {
        return this.LJIILL.recodeBitrateThreshold();
    }

    public C1442570ndv() {
        InterfaceC1442580ndw interfaceC1442580ndw;
        C212350188e c212350188eLIZJ = C212350188e.LIZJ();
        C844470XAv.LIZ.getClass();
        C09GA c09gaLIZIZ = c212350188eLIZJ.LIZIZ(C844470XAv.LJIIJ);
        this.LJIILL = (c09gaLIZIZ == null || (interfaceC1442580ndw = (InterfaceC1442580ndw) c09gaLIZIZ.LJII(RecodeByteBenchStrategy.class)) == null) ? new InterfaceC1442580ndw() { // from class: X.0ndu
            static {
                C1440300naG.LIZ("RecodeByteBenchApi -> use DefaultApi");
            }

            @Override // X.InterfaceC1442580ndw
            public final int hdRecodeBitrateThreshold() {
                SettingsManager.LIZLLL().getClass();
                return SettingsManager.LJ("high_quality_bitrate_of_recode_threshold", 10000000);
            }

            @Override // X.InterfaceC1442580ndw
            public final int recodeBitrateThreshold() {
                SettingsManager.LIZLLL().getClass();
                return SettingsManager.LJ("bitrate_of_recode_threshold", 10000000);
            }
        } : interfaceC1442580ndw;
    }
}
