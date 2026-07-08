package X;

import com.bytedance.android.live.liveinteract.api.LinkConnectionTypeChangedEvent;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;

/* JADX INFO: renamed from: X.0Jfi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC497840Jfi implements InterfaceC955780aym {
    @Override // X.InterfaceC955780aym
    public final boolean LIZ() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LIZJ;
    }

    @Override // X.InterfaceC955780aym
    public final C497860Jfk LJIIJJI() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        LinkCrossRoomDataHolder linkCrossRoomDataHolderLIZIZ = C464550IJp.LIZIZ();
        C497860Jfk c497860Jfk = new C497860Jfk();
        c497860Jfk.LIZ = linkCrossRoomDataHolderLIZIZ.LIZLLL;
        c497860Jfk.LIZIZ = linkCrossRoomDataHolderLIZIZ.LJ;
        c497860Jfk.LIZJ = 0;
        c497860Jfk.LIZLLL = "anchor";
        c497860Jfk.LJ = linkCrossRoomDataHolderLIZIZ.LJI;
        c497860Jfk.LJFF = CardStruct.IStatusCode.DEFAULT;
        return c497860Jfk;
    }

    @Override // X.InterfaceC955780aym
    public final String LJIJJ() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJJIL;
    }

    @Override // X.InterfaceC955780aym
    public final String LJJIJIIJI() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        String str = C464550IJp.LIZIZ().LJJJI;
        return str == null ? "" : str;
    }

    @Override // X.InterfaceC955780aym
    public final String LJJL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJIJIIJI;
    }

    @Override // X.InterfaceC955780aym
    public final void LJJZZIII() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ();
    }

    @Override // X.InterfaceC955780aym
    public final String LLIL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJIJIIJIL;
    }

    @Override // X.InterfaceC955780aym
    public final long LLJJJIL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJ;
    }

    @Override // X.InterfaceC955780aym
    public final Map<Long, Long> LLJJL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJZZI;
    }

    @Override // X.InterfaceC955780aym
    public final long getBattleId() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJJ;
    }

    @Override // X.InterfaceC955780aym
    public final long getChannelId() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LIZLLL;
    }

    @Override // X.InterfaceC955780aym
    public final void LJ(String str) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJJI = str;
        C464550IJp.LIZIZ().LJJJIL = "";
    }

    @Override // X.InterfaceC955780aym
    public final void LJJIIZ(String str) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJIJIIJIL = str;
    }

    @Override // X.InterfaceC955780aym
    public final void LJJJJJ(String str) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJJIL = str;
    }

    @Override // X.InterfaceC955780aym
    public final void LJJJJZ(long j) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJ = j;
    }

    @Override // X.InterfaceC955780aym
    public final void LJJJLL(long j) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJJ = j;
    }

    @Override // X.InterfaceC955780aym
    public final void LJJLL(String str) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJIJIIJI = str;
    }

    @Override // X.InterfaceC955780aym
    public final void LLLI(boolean z) {
        DataChannel dataChannel;
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        LinkCrossRoomDataHolder linkCrossRoomDataHolderLIZIZ = C464550IJp.LIZIZ();
        linkCrossRoomDataHolderLIZIZ.LIZJ = z;
        if (C500260Jjc.LJIJI(linkCrossRoomDataHolderLIZIZ.LIZIZ) && (dataChannel = linkCrossRoomDataHolderLIZIZ.LIZIZ) != null) {
            dataChannel.FQ2(LinkConnectionTypeChangedEvent.class);
        }
        C497700JfU.LIZ.LIZJ(z, EnumC768840UDy.CO_HOST);
    }

    @Override // X.InterfaceC955780aym
    public final void LLLIIII(long j) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LIZLLL = j;
    }
}
