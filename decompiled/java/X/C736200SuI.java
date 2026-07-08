package X;

import com.ss.android.ugc.aweme.ability.ICommerceSpeedupAbility;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SuI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C736200SuI extends C09AY implements Function0<ICommerceSpeedupAbility> {
    public final /* synthetic */ CommerceVideoDelegateKt LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C736200SuI(CommerceVideoDelegateKt commerceVideoDelegateKt) {
        super(0);
        this.LL = commerceVideoDelegateKt;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.01wD, com.ss.android.ugc.aweme.ability.ICommerceSpeedupAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final ICommerceSpeedupAbility invoke() {
        return C1558520qew.LIZ(C1558420qem.LIZIZ(this.LL.baseHolder), ICommerceSpeedupAbility.class, null);
    }
}
