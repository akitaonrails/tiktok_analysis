package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.card.MixCardAssemHolder;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0zD0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1887160zD0 extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ MixCardAssemHolder LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1887160zD0(MixCardAssemHolder mixCardAssemHolder) {
        super(1);
        this.LL = mixCardAssemHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        MixCardAssemHolder mixCardAssemHolder = this.LL;
        assembler2.GQ2(mixCardAssemHolder, new C1887150zCz(mixCardAssemHolder));
        MixCardAssemHolder mixCardAssemHolder2 = this.LL;
        assembler2.RQ2(mixCardAssemHolder2, new C1887170zD1(mixCardAssemHolder2));
        return Unit.LIZ;
    }
}
