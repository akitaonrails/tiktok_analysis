package X;

import com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AJR, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final /* synthetic */ class C1AJR extends C2217421BqW implements Function1<C1081690eFr, Unit> {
    public C1AJR(Object obj) {
        super(1, obj, DecorationWrapperWidget.class, "updateValidArea", "updateValidArea(Lcom/bytedance/android/livesdk/chatroom/event/StickerValidAreaEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1081690eFr c1081690eFr) {
        C1081690eFr c1081690eFr2 = c1081690eFr;
        DecorationWrapperWidget decorationWrapperWidget = (DecorationWrapperWidget) this.receiver;
        if (decorationWrapperWidget.isViewValid() && decorationWrapperWidget.context != null && C500260Jjc.LJJIIJ()) {
            int iMax = Math.max((C12ES.LJIIIIZZ(decorationWrapperWidget.context) - c1081690eFr2.LIZ) - decorationWrapperWidget.context.getResources().getDimensionPixelSize(R.dimen.ajh), decorationWrapperWidget.LLIZLLLIL);
            int[] iArr = decorationWrapperWidget.LL;
            if (iMax != iArr[1]) {
                iArr[1] = iMax;
                for (C1AJN c1ajn : (ArrayList) decorationWrapperWidget.LLILLL) {
                    c1ajn.LLILLL = decorationWrapperWidget.LL;
                    c1ajn.u0(false);
                }
            }
        }
        return Unit.LIZ;
    }
}
