package X;

import com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig;

/* JADX INFO: renamed from: X.0ofK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1481880ofK implements ISimReporterConfig {
    @Override // com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig
    public final /* synthetic */ int getCodecBufferingThreshold() {
        return 200;
    }

    @Override // com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig
    public final /* synthetic */ int getNetBufferingThreshold() {
        return 200;
    }

    @Override // com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig
    public final /* synthetic */ int getReportVideoResponseCount() {
        return 10;
    }

    @Override // com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig
    public final EnumC1481890ofL getBlockReportStrategy() {
        return EnumC1481890ofL.STRATEGY_1;
    }

    @Override // com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig
    public final EnumC1481830ofF getReporterType() {
        return EnumC1481830ofF.DT;
    }

    @Override // com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig
    public final Boolean isReportBlockV2() {
        return Boolean.TRUE;
    }

    @Override // com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig
    public final Boolean isReportBlockV2OnLeave() {
        return Boolean.TRUE;
    }

    @Override // com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig
    public final Boolean isReportTotalBlock() {
        return Boolean.FALSE;
    }
}
