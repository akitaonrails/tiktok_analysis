package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.PcsServiceBioFragmentV2;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KcZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C521370KcZ extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ PcsServiceBioFragmentV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C521370KcZ(PcsServiceBioFragmentV2 pcsServiceBioFragmentV2) {
        super(1);
        this.LL = pcsServiceBioFragmentV2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        PcsServiceBioFragmentV2 pcsServiceBioFragmentV2 = this.LL;
        assembler.DQ2(pcsServiceBioFragmentV2, new C1822850xXH(pcsServiceBioFragmentV2));
        return Unit.LIZ;
    }
}
