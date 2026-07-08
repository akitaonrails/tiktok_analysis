package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.ability.PcsDialogAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.PcsServiceBioFragmentV2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KcU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C521320KcU extends C09AY implements Function0<PcsDialogAbility> {
    public final /* synthetic */ PcsServiceBioFragmentV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C521320KcU(PcsServiceBioFragmentV2 pcsServiceBioFragmentV2) {
        super(0);
        this.LL = pcsServiceBioFragmentV2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.bytedance.android.livesdk.comp.api.pcs.data.ability.PcsDialogAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final PcsDialogAbility invoke() {
        return C1558520qew.LIZ(C1558360qeg.LJFF(this.LL, null), PcsDialogAbility.class, null);
    }
}
