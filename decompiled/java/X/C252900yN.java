package X;

import com.bytedance.android.livesdk.impl.revenue.strategy.bubble.TouchPointBubbleWidget;
import com.ss.ugc.live.sdk.message.data.IMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.00yN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C252900yN extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ TouchPointBubbleWidget LL;
    public final /* synthetic */ IMessage LLILLJJLI;
    public final /* synthetic */ AbstractC253300yR LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C252900yN(TouchPointBubbleWidget touchPointBubbleWidget, IMessage iMessage, AbstractC253300yR abstractC253300yR) {
        super(1);
        this.LL = touchPointBubbleWidget;
        this.LLILLJJLI = iMessage;
        this.LLILLL = abstractC253300yR;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        TouchPointBubbleWidget touchPointBubbleWidget = this.LL;
        C786410Ut5.LJJZZIII(touchPointBubbleWidget.LL, new RunnableC513901zN(zBooleanValue, touchPointBubbleWidget, this.LLILLJJLI, this.LLILLL, 0));
        return Unit.LIZ;
    }
}
