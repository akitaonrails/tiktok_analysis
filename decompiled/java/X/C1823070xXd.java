package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.ability.PcsServiceBioAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem.PcsServiceBioSingleSkuAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xXd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1823070xXd extends C09AY implements Function0<PcsServiceBioAbility> {
    public final /* synthetic */ PcsServiceBioSingleSkuAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1823070xXd(PcsServiceBioSingleSkuAssem pcsServiceBioSingleSkuAssem) {
        super(0);
        this.LL = pcsServiceBioSingleSkuAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.ability.PcsServiceBioAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final PcsServiceBioAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), PcsServiceBioAbility.class, null);
    }
}
