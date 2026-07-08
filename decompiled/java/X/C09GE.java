package X;

import com.bytedance.android.livesdk.livesetting.other.TtliveGamePartnershipPerformanceSample;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.09GE, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09GE extends C09AY implements Function0<Boolean> {
    public C09GE() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(TtliveGamePartnershipPerformanceSample.INSTANCE.enabled());
    }
}
