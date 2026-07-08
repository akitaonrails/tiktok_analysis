package X;

import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig;

/* JADX INFO: renamed from: X.0oaW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1478900oaW implements ISpeedCalculatorConfig {
    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig
    public int getCalculatorType() {
        return 1;
    }

    public InterfaceC1479000oag getCustomSpeedAlgorithm() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig
    public double getDefaultSpeedInBPS() {
        return -1.0d;
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig
    public InterfaceC1479030oaj getIntelligentAlgoConfig() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig
    public String getSpeedCalculateConfig() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig
    public int getSpeedQueueSize() {
        return 10;
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig
    public EnumC1478870oaT getSpeedAlgorithmType() {
        return EnumC1478870oaT.DEFAULT;
    }
}
