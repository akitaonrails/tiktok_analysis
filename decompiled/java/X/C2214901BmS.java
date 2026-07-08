package X;

import com.ss.android.ugc.aweme.preload.smart.v3.exp.SmartPreloadReportConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1BmS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2214901BmS extends C09AY implements Function0<Boolean> {
    public C2214901BmS() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        SmartPreloadReportConfig smartPreloadReportConfig = (SmartPreloadReportConfig) C1618200sDC.LIZ.getValue();
        return Boolean.valueOf(smartPreloadReportConfig != null ? smartPreloadReportConfig.getEnable() : false);
    }
}
