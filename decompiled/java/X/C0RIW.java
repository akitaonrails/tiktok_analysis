package X;

import com.ss.android.ugc.feed.platform.container.interaction.FeedInteractionAreaContainer;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RIW, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RIW extends C09AY implements Function1<C0RTA, Unit> {
    public final /* synthetic */ FeedInteractionAreaContainer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RIW(FeedInteractionAreaContainer feedInteractionAreaContainer) {
        super(1);
        this.LL = feedInteractionAreaContainer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RTA c0rta) {
        C0RTA c0rta2 = c0rta;
        c0rta2.LLJ = this.LL.LLJLIL;
        c0rta2.LLJI = R.id.bm6;
        return Unit.LIZ;
    }
}
