package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.OneStopSheetFragment;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04cn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1138304cn extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ OneStopSheetFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1138304cn(OneStopSheetFragment oneStopSheetFragment) {
        super(1);
        this.LL = oneStopSheetFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.RQ2(this.LL, new C1138204cm());
        return Unit.LIZ;
    }
}
