package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.dialog.PcsServiceBioDialog;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xWt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1822610xWt extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ PcsServiceBioDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1822610xWt(PcsServiceBioDialog pcsServiceBioDialog) {
        super(1);
        this.LL = pcsServiceBioDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        C1822330xWR c1822330xWRUS = this.LL.uS();
        if (c1822330xWRUS != null && c1822330xWRUS.LLILZIL) {
            assembler2.RQ2(this.LL, new C1159304gB());
        }
        return Unit.LIZ;
    }
}
