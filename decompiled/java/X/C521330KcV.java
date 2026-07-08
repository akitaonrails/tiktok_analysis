package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.ability.PcsDialogAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.PcsServiceBioFragmentV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KcV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C521330KcV extends C09AY implements Function1<Unit, Unit> {
    public final /* synthetic */ PcsServiceBioFragmentV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C521330KcV(PcsServiceBioFragmentV2 pcsServiceBioFragmentV2) {
        super(1);
        this.LL = pcsServiceBioFragmentV2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Unit unit) {
        PcsDialogAbility pcsDialogAbility = (PcsDialogAbility) this.LL.LL.getValue();
        if (pcsDialogAbility != null) {
            pcsDialogAbility.cj0();
        }
        return Unit.LIZ;
    }
}
