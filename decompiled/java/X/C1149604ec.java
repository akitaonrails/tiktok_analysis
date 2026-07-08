package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.assem.PcsServiceBioContentAssemV2;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04ec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1149604ec extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ PcsServiceBioContentAssemV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1149604ec(PcsServiceBioContentAssemV2 pcsServiceBioContentAssemV2) {
        super(1);
        this.LL = pcsServiceBioContentAssemV2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.RQ2(this.LL, new C1149504eb());
        return Unit.LIZ;
    }
}
