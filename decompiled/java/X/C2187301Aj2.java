package X;

import com.ss.android.ugc.aweme.ad.feed.task.detect.AppAdsDetectAppConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Aj2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2187301Aj2 extends C09AY implements Function0<Long> {
    public C2187301Aj2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        Long l = ((AppAdsDetectAppConfig) C2187271Aiz.LIZIZ.getValue()).version;
        return Long.valueOf(l != null ? l.longValue() : -1L);
    }
}
