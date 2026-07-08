package X;

import com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteLynxWidget;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: renamed from: X.0Ibx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C470030Ibx extends AbstractC1542200qEc {
    public final /* synthetic */ LivePromoteLynxWidget LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
        long id;
        InterfaceC2262081DgM interfaceC2262081DgMAuthor;
        long jCurrentTimeMillis = System.currentTimeMillis();
        LivePromoteLynxWidget livePromoteLynxWidget = this.LLILLJJLI;
        long j = jCurrentTimeMillis - livePromoteLynxWidget.LLJJL;
        Room room = (Room) livePromoteLynxWidget.dataChannel.gg0(RoomChannel.class);
        if (room != null && (interfaceC2262081DgMAuthor = room.author()) != null) {
            id = interfaceC2262081DgMAuthor.getId();
        } else {
            id = 0;
        }
        LivePromoteLynxWidget livePromoteLynxWidget2 = this.LLILLJJLI;
        C470020Ibw.LIZ(livePromoteLynxWidget2.LLILZLL, j, livePromoteLynxWidget2.LLILLJJLI, id, true, this.LLILLL);
    }

    public C470030Ibx(LivePromoteLynxWidget livePromoteLynxWidget, boolean z) {
        this.LLILLJJLI = livePromoteLynxWidget;
        this.LLILLL = z;
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        this.LLILLJJLI.LLJJL = System.currentTimeMillis();
    }

    @Override // X.AbstractC1537870q7d
    public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        long id;
        InterfaceC2262081DgM interfaceC2262081DgMAuthor;
        long jCurrentTimeMillis = System.currentTimeMillis();
        LivePromoteLynxWidget livePromoteLynxWidget = this.LLILLJJLI;
        long j = jCurrentTimeMillis - livePromoteLynxWidget.LLJJL;
        Room room = (Room) livePromoteLynxWidget.dataChannel.gg0(RoomChannel.class);
        if (room != null && (interfaceC2262081DgMAuthor = room.author()) != null) {
            id = interfaceC2262081DgMAuthor.getId();
        } else {
            id = 0;
        }
        LivePromoteLynxWidget livePromoteLynxWidget2 = this.LLILLJJLI;
        C470020Ibw.LIZ(livePromoteLynxWidget2.LLILZLL, j, livePromoteLynxWidget2.LLILLJJLI, id, false, this.LLILLL);
    }
}
