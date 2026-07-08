package X;

import com.bytedance.android.livesdk.base.widget.StickerContainerWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AJb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final /* synthetic */ class C2177291AJb extends C2217421BqW implements Function1<C0II9, Unit> {
    public C2177291AJb(Object obj) {
        super(1, obj, StickerContainerWidget.class, "subOnlyLiveStatusChange", "subOnlyLiveStatusChange(Lcom/bytedance/android/livesdk/subscription/SubOnlyLiveAudienceStatus;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0II9 c0ii9) {
        StickerContainerWidget stickerContainerWidget = (StickerContainerWidget) this.receiver;
        stickerContainerWidget.getClass();
        if (c0ii9 == C0II9.NON_SUBSCRIBER_FORBIDDEN_LIVE) {
            stickerContainerWidget.C1(EnumC1847310yAj.SUB_ONLY_AUDIENCE);
        } else {
            stickerContainerWidget.D1(EnumC1847310yAj.SUB_ONLY_AUDIENCE);
        }
        return Unit.LIZ;
    }
}
