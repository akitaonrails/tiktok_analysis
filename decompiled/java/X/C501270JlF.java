package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.spacemember.view.fragment.SubSpaceMemberListFragment;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JlF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C501270JlF extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ SubSpaceMemberListFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C501270JlF(SubSpaceMemberListFragment subSpaceMemberListFragment) {
        super(1);
        this.LL = subSpaceMemberListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.RQ2(this.LL, new C501280JlG());
        return Unit.LIZ;
    }
}
