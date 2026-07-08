package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.dialog.PcsServicePlusOptinFragment;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hmu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1217500hmu extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ PcsServicePlusOptinFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1217500hmu(PcsServicePlusOptinFragment pcsServicePlusOptinFragment) {
        super(1);
        this.LL = pcsServicePlusOptinFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.RQ2(this.LL, new C1217490hmt());
        return Unit.LIZ;
    }
}
