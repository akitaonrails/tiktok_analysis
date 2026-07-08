package X;

import android.content.Context;
import com.bytedance.android.livesdk.base.widget.StickerContainerWidget;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS170S0101000_33;

/* JADX INFO: renamed from: X.1AJS, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final /* synthetic */ class C1AJS extends C2217421BqW implements Function1<C1081690eFr, Unit> {
    public C1AJS(Object obj) {
        super(1, obj, StickerContainerWidget.class, "updateValidArea", "updateValidArea(Lcom/bytedance/android/livesdk/chatroom/event/StickerValidAreaEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1081690eFr c1081690eFr) {
        Context context;
        int iMax;
        C1081690eFr c1081690eFr2 = c1081690eFr;
        StickerContainerWidget stickerContainerWidget = (StickerContainerWidget) this.receiver;
        if (stickerContainerWidget.isViewValid() && (context = stickerContainerWidget.context) != null && (iMax = Math.max((C12ES.LJIIIIZZ(context) - c1081690eFr2.LIZ) - stickerContainerWidget.context.getResources().getDimensionPixelSize(R.dimen.ajh), ((int) C497740JfY.LIZIZ(130.0f)) + ((int) C497740JfY.LIZIZ(148.0f)))) != stickerContainerWidget.LLILLJJLI[1]) {
            stickerContainerWidget.z1(new AwS170S0101000_33(stickerContainerWidget, iMax, 7));
        }
        return Unit.LIZ;
    }
}
