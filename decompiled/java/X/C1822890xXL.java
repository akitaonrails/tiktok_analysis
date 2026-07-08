package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem.PcsServiceBioContentAssem;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xXL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1822890xXL extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ PcsServiceBioContentAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1822890xXL(PcsServiceBioContentAssem pcsServiceBioContentAssem) {
        super(1);
        this.LL = pcsServiceBioContentAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        C1822330xWR c1822330xWRHp = this.LL.hp();
        if (c1822330xWRHp != null && c1822330xWRHp.LIZ()) {
            assembler2.RQ2(this.LL, new C1159404gC());
            View view = this.LL.LLJJLIIIJLLLLLLLZ;
            if (view != null) {
                C500260Jjc.LJIILIIL(view);
            }
            View view2 = this.LL.LLJL;
            if (view2 != null) {
                C500260Jjc.LJIILIIL(view2);
            }
        }
        return Unit.LIZ;
    }
}
