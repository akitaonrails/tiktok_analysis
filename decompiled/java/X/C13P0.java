package X;

import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsQueryAdditionalParameters;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsRequestBodyInfo;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.13P0, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13P0 {
    public final C13RD LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 386));

    public C13P0(C13RD c13rd) {
        this.LIZ = c13rd;
    }

    public final void LIZ(MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters, String str, String str2, String str3, int i, int i2, MixedAssetsRequestBodyInfo mixedAssetsRequestBodyInfo, C13MA c13ma) {
        String strLIZ = C1528550psb.LIZ();
        if (c13ma != null) {
            this.LIZ.LJJJIL.LIZIZ(strLIZ, c13ma);
        }
        C13R5 c13r5 = new C13R5(this.LIZ, mixedAssetsQueryAdditionalParameters, str, str2, str3, i, i2, mixedAssetsRequestBodyInfo, strLIZ);
        C20001113Np c20001113Np = this.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(c13r5);
        }
    }

    public final void LIZIZ(MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters, String str, String str2, int i, int i2, MixedAssetsRequestBodyInfo mixedAssetsRequestBodyInfo, boolean z, C13MA c13ma) {
        String strLIZ = C1528550psb.LIZ();
        if (c13ma != null) {
            this.LIZ.LJJJIL.LIZIZ(strLIZ, c13ma);
        }
        C13R4 c13r4 = new C13R4(this.LIZ, mixedAssetsQueryAdditionalParameters, str, str2, i, i2, mixedAssetsRequestBodyInfo, strLIZ, z);
        C20001113Np c20001113Np = this.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(c13r4);
        }
    }
}
