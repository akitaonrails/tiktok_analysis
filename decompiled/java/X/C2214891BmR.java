package X;

import com.ss.android.ugc.aweme.preload.smart.v3.exp.SmartPreloadReportConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1BmR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2214891BmR extends C09AY implements Function0<Float> {
    public C2214891BmR() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        SmartPreloadReportConfig smartPreloadReportConfig = (SmartPreloadReportConfig) C1618200sDC.LIZ.getValue();
        return Float.valueOf(smartPreloadReportConfig != null ? smartPreloadReportConfig.getRunRate() : 0.0f);
    }
}
