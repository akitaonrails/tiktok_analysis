package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.OneStopMainAssem;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hnG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1217720hnG extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ OneStopMainAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1217720hnG(OneStopMainAssem oneStopMainAssem) {
        super(1);
        this.LL = oneStopMainAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.RQ2(this.LL, new C1217710hnF());
        return Unit.LIZ;
    }
}
