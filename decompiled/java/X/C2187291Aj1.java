package X;

import com.ss.android.ugc.aweme.ad.feed.task.detect.AppAdsDetectAppConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Aj1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2187291Aj1 extends C09AY implements Function0<Boolean> {
    public C2187291Aj1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Boolean bool = ((AppAdsDetectAppConfig) C2187271Aiz.LIZIZ.getValue()).enable;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }
}
