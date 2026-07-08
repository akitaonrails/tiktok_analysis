package X;

import com.ss.android.ugc.aweme.ad.feed.caption.ICommerceTransAndCaptionAbility;
import com.ss.android.ugc.aweme.api.component.interaction.CommerceInteractionComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0S5D, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S5D extends C09AY implements Function0<ICommerceTransAndCaptionAbility> {
    public final /* synthetic */ CommerceInteractionComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0S5D(CommerceInteractionComponent commerceInteractionComponent) {
        super(0);
        this.LL = commerceInteractionComponent;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.aweme.ad.feed.caption.ICommerceTransAndCaptionAbility] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ ICommerceTransAndCaptionAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), ICommerceTransAndCaptionAbility.class, null);
    }
}
