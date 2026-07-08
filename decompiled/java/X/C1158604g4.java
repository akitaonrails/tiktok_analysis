package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.PcsIndustrySelectFragment;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04g4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1158604g4 extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ PcsIndustrySelectFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1158604g4(PcsIndustrySelectFragment pcsIndustrySelectFragment) {
        super(1);
        this.LL = pcsIndustrySelectFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.RQ2(this.LL, new C1158504g3());
        return Unit.LIZ;
    }
}
