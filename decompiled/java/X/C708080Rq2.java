package X;

import com.ss.android.ugc.aweme.api.component.interaction.CommerceInteractionComponent;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rq2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C708080Rq2 extends C09AY implements Function0<IVideoCellAbility> {
    public final /* synthetic */ CommerceInteractionComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C708080Rq2(CommerceInteractionComponent commerceInteractionComponent) {
        super(0);
        this.LL = commerceInteractionComponent;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ IVideoCellAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), IVideoCellAbility.class, null);
    }
}
