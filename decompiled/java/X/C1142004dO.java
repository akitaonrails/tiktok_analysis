package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.fragment.SubSpaceDetailFragment;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04dO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1142004dO extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ SubSpaceDetailFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1142004dO(SubSpaceDetailFragment subSpaceDetailFragment) {
        super(1);
        this.LL = subSpaceDetailFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.RQ2(this.LL, new C1141904dN());
        return Unit.LIZ;
    }
}
