package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.base.widget.StickerContainerWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AJU, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final /* synthetic */ class C1AJU extends C2217421BqW implements Function1<C956380azk, Unit> {
    public C1AJU(Object obj) {
        super(1, obj, StickerContainerWidget.class, "onLinkStateChanged", "onLinkStateChanged(Lcom/bytedance/android/livesdk/chatroom/event/LinkCrossRoomEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C956380azk c956380azk) {
        StickerContainerWidget stickerContainerWidget = (StickerContainerWidget) this.receiver;
        stickerContainerWidget.getClass();
        int i = c956380azk.LIZ;
        if (i != 0) {
            if (i == 1) {
                stickerContainerWidget.LLILLJJLI = stickerContainerWidget.LLILLL;
                stickerContainerWidget.D1(EnumC1847310yAj.HOST_LINK);
            }
            return Unit.LIZ;
        }
        stickerContainerWidget.LLILLJJLI[1] = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).hI2().LIZ().LJJIIJZLJL() + ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).hI2().LIZ().LJJLIL();
        stickerContainerWidget.C1(EnumC1847310yAj.HOST_LINK);
        C1AJP c1ajp = stickerContainerWidget.LLILZ;
        if (c1ajp != null) {
            c1ajp.LLJJJJJIL = stickerContainerWidget.LLILLJJLI;
            c1ajp.j0();
        }
        return Unit.LIZ;
    }
}
