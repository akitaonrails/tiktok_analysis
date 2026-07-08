package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import webcast.api.room.EncourageGoLiveCard;

/* JADX INFO: renamed from: X.0IcC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C470180IcC extends AbstractC1542200qEc {
    public final /* synthetic */ C470150Ic9 LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
        long id;
        Room room;
        InterfaceC2262081DgM interfaceC2262081DgMAuthor;
        C20441214yg.LIZIZ("PromoteLynxVariantCard", "onLoadFinish");
        long jCurrentTimeMillis = System.currentTimeMillis();
        C470150Ic9 c470150Ic9 = this.LLILLJJLI;
        long j = jCurrentTimeMillis - c470150Ic9.LLJJL;
        DataChannel dataChannel = c470150Ic9.LLILLL;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (interfaceC2262081DgMAuthor = room.author()) != null) {
            id = interfaceC2262081DgMAuthor.getId();
        } else {
            id = 0;
        }
        C470150Ic9 c470150Ic92 = this.LLILLJJLI;
        EncourageGoLiveCard encourageGoLiveCard = c470150Ic92.LLILZ;
        if (encourageGoLiveCard != null) {
            C470020Ibw.LIZ(encourageGoLiveCard, j, c470150Ic92.LLILZIL, id, true, this.LLILLL);
        }
    }

    public C470180IcC(C470150Ic9 c470150Ic9, boolean z) {
        this.LLILLJJLI = c470150Ic9;
        this.LLILLL = z;
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        C20441214yg.LIZIZ("PromoteLynxVariantCard", "onLoadStart");
        this.LLILLJJLI.LLJJL = System.currentTimeMillis();
    }

    @Override // X.AbstractC1537870q7d
    public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        long id;
        Room room;
        InterfaceC2262081DgM interfaceC2262081DgMAuthor;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadFailed: ");
        sbLIZ.append(c1542120qEU.LIZ());
        C20441214yg.LIZIZ("PromoteLynxVariantCard", C2188811AlT.LIZIZ(sbLIZ));
        long jCurrentTimeMillis = System.currentTimeMillis();
        C470150Ic9 c470150Ic9 = this.LLILLJJLI;
        long j = jCurrentTimeMillis - c470150Ic9.LLJJL;
        DataChannel dataChannel = c470150Ic9.LLILLL;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (interfaceC2262081DgMAuthor = room.author()) != null) {
            id = interfaceC2262081DgMAuthor.getId();
        } else {
            id = 0;
        }
        C470150Ic9 c470150Ic92 = this.LLILLJJLI;
        EncourageGoLiveCard encourageGoLiveCard = c470150Ic92.LLILZ;
        if (encourageGoLiveCard != null) {
            C470020Ibw.LIZ(encourageGoLiveCard, j, c470150Ic92.LLILZIL, id, true, this.LLILLL);
        }
    }
}
