package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.assem.PcsServicePlusOptinContentAssem;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04dQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1142204dQ extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ PcsServicePlusOptinContentAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1142204dQ(PcsServicePlusOptinContentAssem pcsServicePlusOptinContentAssem) {
        super(1);
        this.LL = pcsServicePlusOptinContentAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        assembler2.RQ2(this.LL, new C1139304cx());
        assembler2.RQ2(this.LL, new C1142104dP());
        assembler2.RQ2(this.LL, new C1142304dR());
        return Unit.LIZ;
    }
}
