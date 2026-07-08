package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.fragment.SubSpaceDetailFragment;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jrf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C505250Jrf extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ SubSpaceDetailFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C505250Jrf(SubSpaceDetailFragment subSpaceDetailFragment) {
        super(1);
        this.LL = subSpaceDetailFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.RQ2(this.LL, new C505260Jrg());
        return Unit.LIZ;
    }
}
