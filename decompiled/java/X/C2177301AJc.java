package X;

import com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget;
import com.bytedance.android.widget.Widget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AJc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final /* synthetic */ class C2177301AJc extends C2217421BqW implements Function1<C0II9, Unit> {
    public C2177301AJc(Object obj) {
        super(1, obj, DecorationWrapperWidget.class, "subOnlyLiveStatusChange", "subOnlyLiveStatusChange(Lcom/bytedance/android/livesdk/subscription/SubOnlyLiveAudienceStatus;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0II9 c0ii9) {
        Widget widget = (Widget) this.receiver;
        widget.getClass();
        if (c0ii9 == C0II9.NON_SUBSCRIBER_FORBIDDEN_LIVE) {
            widget.hide();
        } else {
            widget.show();
        }
        return Unit.LIZ;
    }
}
