package X;

import com.ss.android.ugc.aweme.ad.feed.mask.IAnoleMaskAbility;
import com.ss.android.ugc.aweme.api.component.interaction.CommerceInteractionComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0btI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C990820btI extends C09AY implements Function0<IAnoleMaskAbility> {
    public final /* synthetic */ CommerceInteractionComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C990820btI(CommerceInteractionComponent commerceInteractionComponent) {
        super(0);
        this.LL = commerceInteractionComponent;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.aweme.ad.feed.mask.IAnoleMaskAbility] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ IAnoleMaskAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), IAnoleMaskAbility.class, null);
    }
}
