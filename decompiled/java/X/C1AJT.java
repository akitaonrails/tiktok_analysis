package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AJT, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final /* synthetic */ class C1AJT extends C2217421BqW implements Function1<C956380azk, Unit> {
    public C1AJT(Object obj) {
        super(1, obj, DecorationWrapperWidget.class, "onLinkStateChanged", "onLinkStateChanged(Lcom/bytedance/android/livesdk/chatroom/event/LinkCrossRoomEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C956380azk c956380azk) {
        DecorationWrapperWidget decorationWrapperWidget = (DecorationWrapperWidget) this.receiver;
        decorationWrapperWidget.getClass();
        int i = c956380azk.LIZ;
        if (i != 0) {
            if (i == 1) {
                decorationWrapperWidget.LL = decorationWrapperWidget.LLILLJJLI;
                decorationWrapperWidget.LLJIJIL = false;
                decorationWrapperWidget.A1();
            }
            return Unit.LIZ;
        }
        decorationWrapperWidget.LL[1] = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).hI2().LIZ().LJJIIJZLJL() + ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).hI2().LIZ().LJJLIL();
        decorationWrapperWidget.LLJIJIL = true;
        decorationWrapperWidget.A1();
        for (C1AJN c1ajn : (ArrayList) decorationWrapperWidget.LLILLL) {
            c1ajn.LLILLL = decorationWrapperWidget.LL;
            c1ajn.u0(false);
        }
        return Unit.LIZ;
    }
}
