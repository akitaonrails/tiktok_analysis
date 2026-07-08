package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.ability.PcsServiceBioAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.viewmodel.PcsServiceBioVM;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xWs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1822600xWs extends C09AY implements Function0<PcsServiceBioAbility> {
    public final /* synthetic */ PcsServiceBioVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1822600xWs(PcsServiceBioVM pcsServiceBioVM) {
        super(0);
        this.LL = pcsServiceBioVM;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.ability.PcsServiceBioAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final PcsServiceBioAbility invoke() {
        InterfaceC665370Q7z interfaceC665370Q7z = this.LL.LL;
        if (interfaceC665370Q7z != null) {
            return C1558520qew.LIZ(interfaceC665370Q7z, PcsServiceBioAbility.class, null);
        }
        return null;
    }
}
