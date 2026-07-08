package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.ability.PcsDialogAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.assem.PcsServiceBioContentAssemV2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xXe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1823080xXe extends C09AY implements Function0<PcsDialogAbility> {
    public final /* synthetic */ PcsServiceBioContentAssemV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1823080xXe(PcsServiceBioContentAssemV2 pcsServiceBioContentAssemV2) {
        super(0);
        this.LL = pcsServiceBioContentAssemV2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.bytedance.android.livesdk.comp.api.pcs.data.ability.PcsDialogAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final PcsDialogAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), PcsDialogAbility.class, null);
    }
}
