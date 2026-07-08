package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.view.fragment.SubOnlySpacePostTopicFragment;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jm5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C501790Jm5 extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ SubOnlySpacePostTopicFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C501790Jm5(SubOnlySpacePostTopicFragment subOnlySpacePostTopicFragment) {
        super(1);
        this.LL = subOnlySpacePostTopicFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        SubOnlySpacePostTopicFragment subOnlySpacePostTopicFragment = this.LL;
        assembler.QQ2(subOnlySpacePostTopicFragment, new C501800Jm6(subOnlySpacePostTopicFragment));
        return Unit.LIZ;
    }
}
