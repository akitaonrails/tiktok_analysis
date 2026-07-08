package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.PcsServiceBioFragmentV2;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04ee, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1149804ee extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ PcsServiceBioFragmentV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1149804ee(PcsServiceBioFragmentV2 pcsServiceBioFragmentV2) {
        super(1);
        this.LL = pcsServiceBioFragmentV2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        PcsServiceBioFragmentV2 pcsServiceBioFragmentV2 = this.LL;
        assembler2.RQ2(pcsServiceBioFragmentV2, new C1138604cq());
        assembler2.RQ2(pcsServiceBioFragmentV2, new C1149704ed());
        return Unit.LIZ;
    }
}
