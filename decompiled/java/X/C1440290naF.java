package X;

import com.ss.android.ugc.aweme.creative.compileconfig.BaseCompileConfigParams;
import com.ss.android.ugc.aweme.creative.compileconfig.CompileConfigResolution;
import com.ss.android.ugc.aweme.creative.compileconfig.strategies.source.CanvasCompileConfigParams;
import com.ss.android.ugc.aweme.setting.performance.videoquality.SingleImageModeMaxResolutionExperiment;

/* JADX INFO: renamed from: X.0naF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1440290naF extends AbstractC1440790nb3<CanvasCompileConfigParams> {
    public final C1440830nb7 LIZIZ;
    public final C1437640nVy LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final int LJFF;

    @Override // X.InterfaceC1440780nb2
    public final String getName() {
        return this.LJ;
    }

    @Override // X.InterfaceC1440780nb2
    public final int getPriority() {
        return this.LJFF;
    }

    @Override // X.InterfaceC1440780nb2
    public final String getStage() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC1440790nb3
    public final void LIZ(BaseCompileConfigParams baseCompileConfigParams) {
        CompileConfigResolution compileConfigResolution = new CompileConfigResolution(SingleImageModeMaxResolutionExperiment.LIZ(), ((SingleImageModeMaxResolutionExperiment.ResolutionConfig) SingleImageModeMaxResolutionExperiment.LIZIZ.getValue()).height, null, null, 12, null);
        this.LIZJ.LIZ.LIZ = compileConfigResolution;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LegacySourceStageCanvasSettingConfigStrategy, maxResolution: ");
        sbLIZ.append(compileConfigResolution);
        C564000MAc.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1440290naF(InterfaceC1440780nb2 interfaceC1440780nb2, C1440830nb7 c1440830nb7, C1437640nVy c1437640nVy) {
        super(interfaceC1440780nb2);
        C1440310naH c1440310naH = C1440310naH.LIZ;
        String str = c1440310naH.key;
        int i = c1440310naH.priority;
        this.LIZIZ = c1440830nb7;
        this.LIZJ = c1437640nVy;
        this.LIZLLL = "source";
        this.LJ = str;
        this.LJFF = i;
    }
}
