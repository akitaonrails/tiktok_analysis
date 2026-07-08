package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.card.MixCardAssemHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0zD1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1887170zD1 extends C09AY implements Function1<C0SZ5, Unit> {
    public final /* synthetic */ MixCardAssemHolder LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1887170zD1(MixCardAssemHolder mixCardAssemHolder) {
        super(1);
        this.LL = mixCardAssemHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0SZ5 c0sz5) {
        C0SZ5 c0sz52 = c0sz5;
        MixCardAssemHolder mixCardAssemHolder = this.LL;
        c0sz52.LL = mixCardAssemHolder.LLILLL;
        c0sz52.LLIZLLLIL = mixCardAssemHolder.LLIZ.getId();
        return Unit.LIZ;
    }
}
