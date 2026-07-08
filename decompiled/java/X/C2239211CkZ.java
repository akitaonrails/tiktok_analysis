package X;

import Y.AObjectS408S0100000_34;
import com.bytedance.ies.cutsame.source.model.ProcessorConfig;
import com.bytedance.ies.nle.editor_jni.DynamicLightWaveUtil;
import com.bytedance.ies.nleeditor.NLE;

/* JADX INFO: renamed from: X.1CkZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2239211CkZ {
    public final String LIZ;
    public final String LIZIZ;
    public final C1782370wTz LIZJ;
    public C20343614iw LIZLLL;
    public final C01GW LJ;

    public final void LIZ() {
        C357400Dzm.LIZIZ("cancel");
        ((DynamicLightWaveUtil) this.LJ.getValue()).cancelCompile();
    }

    public C2239211CkZ(String str, String str2, C1782370wTz c1782370wTz, ProcessorConfig processorConfig) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = c1782370wTz;
        NLE.loadNLELibrary$default(NLE.INSTANCE, false, false, false, 7, null);
        this.LJ = C452501pT.LIZIZ(new AObjectS408S0100000_34(this, 8));
    }
}
