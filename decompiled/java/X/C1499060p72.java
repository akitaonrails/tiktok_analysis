package X;

import com.ss.android.ugc.aweme.net.experiment.EcomNetTimeOutExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0p72, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1499060p72 extends C09AY implements Function0<EcomNetTimeOutExperiment.EcomNetTimeoutConfigModel[]> {
    public C1499060p72() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.net.experiment.EcomNetTimeOutExperiment$EcomNetTimeoutConfigModel[], java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final EcomNetTimeOutExperiment.EcomNetTimeoutConfigModel[] invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        EcomNetTimeOutExperiment.EcomNetTimeoutConfigModel[] ecomNetTimeoutConfigModelArr = EcomNetTimeOutExperiment.LIZ;
        ?? LJJII = c0c64LJIILLIIL.LJJII(EcomNetTimeOutExperiment.EcomNetTimeoutConfigModel[].class, ecomNetTimeoutConfigModelArr, "ecom_net_common_time_out", true);
        return LJJII != 0 ? LJJII : ecomNetTimeoutConfigModelArr;
    }
}
