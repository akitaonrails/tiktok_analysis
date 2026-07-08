package X;

import com.ss.android.ugc.aweme.ad.feed.task.detect.AppAdsDetectAppConfig;
import com.ss.android.ugc.aweme.ad.feed.task.detect.DetectConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Aj0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2187281Aj0 extends C09AY implements Function0<DetectConfig> {
    public C2187281Aj0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final DetectConfig invoke() {
        DetectConfig detectConfig = ((AppAdsDetectAppConfig) C2187271Aiz.LIZIZ.getValue()).detectConfig;
        return detectConfig == null ? new DetectConfig(null, null, null) : detectConfig;
    }
}
