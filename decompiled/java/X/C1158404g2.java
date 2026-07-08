package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.pollist.view.fragment.SubSpacePollMemberFragment;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04g2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1158404g2 extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ SubSpacePollMemberFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1158404g2(SubSpacePollMemberFragment subSpacePollMemberFragment) {
        super(1);
        this.LL = subSpacePollMemberFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.RQ2(this.LL, new C1158304g1());
        return Unit.LIZ;
    }
}
