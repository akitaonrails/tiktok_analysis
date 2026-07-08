package X;

import com.ss.android.ugc.aweme.creative.compileconfig.BaseCompileConfigParams;
import com.ss.android.ugc.aweme.creative.compileconfig.CompileConfigLevelStruct;
import com.ss.android.ugc.aweme.creative.compileconfig.VEVideoEncodeConfigParams;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.aweme.property.UploadSpeedEncodeSettings;

/* JADX INFO: renamed from: X.0nVZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1437390nVZ extends AbstractC1440790nb3<VEVideoEncodeConfigParams> {
    public final C1437060nV2 LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;

    @Override // X.InterfaceC1440780nb2
    public final String getName() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1440780nb2
    public final int getPriority() {
        return this.LJ;
    }

    @Override // X.InterfaceC1440780nb2
    public final String getStage() {
        return this.LIZJ;
    }

    @Override // X.AbstractC1440790nb3
    public final void LIZ(BaseCompileConfigParams baseCompileConfigParams) {
        VEVideoEncodeConfigParams vEVideoEncodeConfigParams = (VEVideoEncodeConfigParams) baseCompileConfigParams;
        UploadSpeedEncodeSettings uploadSpeedEncodeSettingsLIZJ = C1420140n3k.LIZJ(this.LIZIZ.LIZ.getUploadSpeedInfo());
        if (uploadSpeedEncodeSettingsLIZJ != null) {
            C1437420nVc c1437420nVc = new C1437420nVc(0);
            c1437420nVc.LIZ = Integer.valueOf(uploadSpeedEncodeSettingsLIZJ.LIZ);
            c1437420nVc.LIZIZ = new CompileConfigLevelStruct<>(Boolean.valueOf(uploadSpeedEncodeSettingsLIZJ.useSmartCompile), Boolean.valueOf(uploadSpeedEncodeSettingsLIZJ.highQualityUseSmartCompile));
            c1437420nVc.LIZJ = new CompileConfigLevelStruct<>(Integer.valueOf(uploadSpeedEncodeSettingsLIZJ.bitrateOfRecodeThreshold), Integer.valueOf(uploadSpeedEncodeSettingsLIZJ.highQualityBitrateOfRecodeThreshold));
            c1437420nVc.LIZLLL = new CompileConfigLevelStruct<>(AVSettingsWrapper.getCompileVideoSize(uploadSpeedEncodeSettingsLIZJ.compileVideoSizeIndex), AVSettingsWrapper.getCompileVideoSize(uploadSpeedEncodeSettingsLIZJ.highQualityCompileVideoSizeIndex));
            C1437060nV2 c1437060nV2 = this.LIZIZ;
            C1437400nVa c1437400nVa = c1437060nV2.LIZIZ;
            c1437400nVa.LIZIZ = c1437420nVc;
            if (c1437400nVa.LJ.LJFF) {
                if (c1437060nV2.LIZ()) {
                    vEVideoEncodeConfigParams.setExternalSettingsJsonStr(uploadSpeedEncodeSettingsLIZJ.highQualityVeSynthesisSettings);
                } else {
                    vEVideoEncodeConfigParams.setExternalSettingsJsonStr(uploadSpeedEncodeSettingsLIZJ.veSynthesisSettings);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1437390nVZ(InterfaceC1440780nb2 interfaceC1440780nb2, C1437060nV2 c1437060nV2) {
        super(interfaceC1440780nb2);
        C1437120nV8 c1437120nV8 = C1437120nV8.LIZ;
        String str = c1437120nV8.key;
        int i = c1437120nV8.priority;
        this.LIZIZ = c1437060nV2;
        this.LIZJ = "upload";
        this.LIZLLL = str;
        this.LJ = i;
    }
}
