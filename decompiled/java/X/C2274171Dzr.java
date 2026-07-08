package X;

import com.ss.android.ugc.aweme.effectcreator.experiments.AmeGreenScreenCutoutConfigData;

/* JADX INFO: renamed from: X.1Dzr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2274171Dzr {
    public static final AmeGreenScreenCutoutConfigData LIZ = new AmeGreenScreenCutoutConfigData("portrait_cutout,auto_fit,stroke", "", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/aulpsj_lth_rvarpa/ljhwZthlaukjlkulzlp/images/greenscreen_cutout/greenScreen_gortrait_small.png", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/aulpsj_lth_rvarpa/ljhwZthlaukjlkulzlp/images/greenscreen_cutout/greenScreen_gortrait_big.png");
    public static AmeGreenScreenCutoutConfigData LIZIZ;

    public static final AmeGreenScreenCutoutConfigData LIZ() {
        AmeGreenScreenCutoutConfigData ameGreenScreenCutoutConfigData = LIZIZ;
        if (ameGreenScreenCutoutConfigData != null) {
            return ameGreenScreenCutoutConfigData;
        }
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        AmeGreenScreenCutoutConfigData ameGreenScreenCutoutConfigData2 = LIZ;
        AmeGreenScreenCutoutConfigData ameGreenScreenCutoutConfigData3 = (AmeGreenScreenCutoutConfigData) c0c64LJIILLIIL.LJJII(AmeGreenScreenCutoutConfigData.class, ameGreenScreenCutoutConfigData2, "ame_greenscreen_cutout_config", true);
        LIZIZ = ameGreenScreenCutoutConfigData3;
        return ameGreenScreenCutoutConfigData3 != null ? ameGreenScreenCutoutConfigData3 : ameGreenScreenCutoutConfigData2;
    }
}
