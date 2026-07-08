package X;

import com.ss.android.ugc.aweme.ability.ISlideIndicatorAbility;
import com.ss.android.ugc.aweme.feed.assem.bubblelist.BubbleListAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SDY, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SDY extends C09AY implements Function0<ISlideIndicatorAbility> {
    public final /* synthetic */ BubbleListAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SDY(BubbleListAssem bubbleListAssem) {
        super(0);
        this.LL = bubbleListAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.aweme.ability.ISlideIndicatorAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final ISlideIndicatorAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), ISlideIndicatorAbility.class, null);
    }
}
