package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.feed.platform.container.interaction.FeedInteractionAreaContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RIV, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RIV extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ FeedInteractionAreaContainer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RIV(FeedInteractionAreaContainer feedInteractionAreaContainer) {
        super(1);
        this.LL = feedInteractionAreaContainer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        FeedInteractionAreaContainer feedInteractionAreaContainer = this.LL;
        assembler.LQ2(feedInteractionAreaContainer, new C0RIW(feedInteractionAreaContainer));
        return Unit.LIZ;
    }
}
