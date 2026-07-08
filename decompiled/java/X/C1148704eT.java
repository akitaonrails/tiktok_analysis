package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicesku.assem.PcsServiceSkuContentAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicesku.assem.sku.PcsServiceSkuAssem;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04eT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1148704eT extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ PcsServiceSkuContentAssem LL;
    public final /* synthetic */ C13IQ<? extends PcsServiceSkuAssem> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1148704eT(PcsServiceSkuContentAssem pcsServiceSkuContentAssem, C19719912Dl c19719912Dl) {
        super(1);
        this.LL = pcsServiceSkuContentAssem;
        this.LLILLJJLI = c19719912Dl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.QQ2(this.LL, new C1148604eS(this.LLILLJJLI));
        return Unit.LIZ;
    }
}
