package X;

import com.ss.android.ugc.aweme.ad.feed.adexperience.IAdDeductionAbility;
import com.ss.android.ugc.aweme.api.component.interaction.CommerceInteractionComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0cDN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1003270cDN extends C09AY implements Function0<IAdDeductionAbility> {
    public final /* synthetic */ CommerceInteractionComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1003270cDN(CommerceInteractionComponent commerceInteractionComponent) {
        super(0);
        this.LL = commerceInteractionComponent;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.aweme.ad.feed.adexperience.IAdDeductionAbility] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ IAdDeductionAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), IAdDeductionAbility.class, null);
    }
}
