package X;

import com.ss.android.ugc.aweme.experiment.ColdBootDowngradeIncentiveConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0BGq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C285420BGq extends C09AY implements Function0<Long> {
    public C285420BGq() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(((ColdBootDowngradeIncentiveConfig) C285400BGo.LIZIZ.getValue()).downgradeShareCoinIncentiveComponentValue);
    }
}
