package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.dialog.PcsServicePlusOptinFragment;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04d3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1139904d3 extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ PcsServicePlusOptinFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1139904d3(PcsServicePlusOptinFragment pcsServicePlusOptinFragment) {
        super(1);
        this.LL = pcsServicePlusOptinFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.RQ2(this.LL, new C1139804d2());
        return Unit.LIZ;
    }
}
