package X;

import com.ss.android.ugc.feed.platform.container.info.FeedInfoAreaContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RIX, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RIX extends C09AY implements Function0<Unit> {
    public final /* synthetic */ FeedInfoAreaContainer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RIX(FeedInfoAreaContainer feedInfoAreaContainer) {
        super(0);
        this.LL = feedInfoAreaContainer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.op();
        return Unit.LIZ;
    }
}
