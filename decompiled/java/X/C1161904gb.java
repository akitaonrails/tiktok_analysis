package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.fragment.SubSpaceFeedFragment;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04gb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1161904gb extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ SubSpaceFeedFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1161904gb(SubSpaceFeedFragment subSpaceFeedFragment) {
        super(1);
        this.LL = subSpaceFeedFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        SubSpaceFeedFragment subSpaceFeedFragment = this.LL;
        assembler.QQ2(subSpaceFeedFragment, new C1161804ga(subSpaceFeedFragment));
        return Unit.LIZ;
    }
}
