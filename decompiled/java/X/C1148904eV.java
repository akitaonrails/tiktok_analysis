package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicesku.PcsServiceSkuDialog;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04eV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1148904eV extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ PcsServiceSkuDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1148904eV(PcsServiceSkuDialog pcsServiceSkuDialog) {
        super(1);
        this.LL = pcsServiceSkuDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        assembler2.RQ2(this.LL, new C1149004eW());
        assembler2.QQ2(this.LL, new C1148804eU());
        assembler2.RQ2(this.LL, new C1137404ce());
        return Unit.LIZ;
    }
}
