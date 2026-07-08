package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.management.fragment.SubscriptionManagementFragmentV2;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04dX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1142904dX extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ SubscriptionManagementFragmentV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1142904dX(SubscriptionManagementFragmentV2 subscriptionManagementFragmentV2) {
        super(1);
        this.LL = subscriptionManagementFragmentV2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.RQ2(this.LL, new C1142804dW());
        return Unit.LIZ;
    }
}
