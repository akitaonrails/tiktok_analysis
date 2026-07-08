package X;

import Y.AfS0S0410100_15;
import Y.AfS0S0510100_15;
import Y.AfS151S0200000_15;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostHistoryContract$AbsView;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostHistoryFragment;
import com.bytedance.android.live.liveinteract.multihost.biz.reservation.MultiCoHostNudgeCountDownEvent;
import com.bytedance.android.live.liveinteract.multihost.core.countdown.MultiCoHostCountDownEvent;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.ReserveResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostShowHistoryListSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.AwS30S0000100_15;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0b6a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C960620b6a extends AbstractC963000bAQ implements InterfaceC950820aqm {
    public final DataChannel LLILLJJLI;
    public final C01GW LLILLL;

    @Override // X.InterfaceC950820aqm
    public final void LJ() {
    }

    @Override // X.InterfaceC950820aqm
    public final void LIZLLL() {
        MultiCoHostHistoryContract$AbsView multiCoHostHistoryContract$AbsView = (MultiCoHostHistoryContract$AbsView) this.LL;
        if (multiCoHostHistoryContract$AbsView != null) {
            multiCoHostHistoryContract$AbsView.SR();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsPresenter
    public final void LJIIIIZZ() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        int i = 0;
        int i2 = 0;
        for (C955670ayb c955670ayb : LJIIZILJ().Y1()) {
            if (c955670ayb instanceof C955810ayp) {
                if (c955670ayb.LIZ) {
                    C955810ayp c955810ayp = (C955810ayp) c955670ayb;
                    User owner = c955810ayp.LJ.getOwner();
                    linkedHashSet.add(Long.valueOf(owner != null ? owner.getId() : 0L));
                    if (C955940az2.LIZIZ(((C955590ayT) c955670ayb).LJIIJ)) {
                        User owner2 = c955810ayp.LJ.getOwner();
                        linkedHashSet2.add(Long.valueOf(owner2 != null ? owner2.getId() : 0L));
                    }
                    if (c955810ayp.LJJIIZI) {
                        i2++;
                    }
                }
            } else if (c955670ayb instanceof C963060bAW) {
                Iterator<C956050azD> it2 = ((C963060bAW) c955670ayb).LJFF.iterator();
                while (it2.hasNext()) {
                    if (it2.next().LIZ) {
                        i++;
                    }
                }
            }
        }
        String str = CoHostShowHistoryListSetting.INSTANCE.isGroupA() ? "anchor" : "cohost_record";
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_connection_history_list_show");
        Room roomLIZJ = C950220apo.LIZJ();
        c474500IjALIZ.LJJII(String.valueOf(roomLIZJ != null ? Long.valueOf(roomLIZJ.getId()) : null), "room_id");
        c474500IjALIZ.LJJII(String.valueOf(C950220apo.LJ()), "anchor_id");
        c474500IjALIZ.LJJII(str, "display_type");
        c474500IjALIZ.LJJII(Integer.valueOf(linkedHashSet.size()), "show_anchor_cnt");
        c474500IjALIZ.LJJII(Integer.valueOf(linkedHashSet2.size()), "available_anchor_cnt");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "show_match_record_cnt");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "show_cohost_record_cnt");
        c474500IjALIZ.LIZ();
        this.LLILLJJLI.zQ2(this);
        LJIIZILJ().release();
    }

    public final InterfaceC960700b6i LJIIZILJ() {
        return (InterfaceC960700b6i) this.LLILLL.getValue();
    }

    @Override // X.AbstractC963000bAQ
    public final boolean LJIILIIL() {
        return LJIIZILJ().Z1();
    }

    @Override // X.AbstractC963000bAQ
    public final void LJIILJJIL() {
        LJIIZILJ().X1();
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsPresenter
    public final void onCreate() {
        super.onCreate();
        DataChannel dataChannel = this.LLILLJJLI;
        dataChannel.CQ2(MultiCoHostCountDownEvent.class, this, new C960670b6f(this));
        dataChannel.CQ2(MultiCoHostNudgeCountDownEvent.class, this, new C960680b6g(this));
    }

    @Override // X.AbstractC963000bAQ
    public final void LJIIJ(Room room) {
        C950790aqj.LIZLLL(room);
    }

    @Override // X.AbstractC963000bAQ
    public final void LJIIJJI(Room room) {
        C950790aqj.LIZ.LIZ(null, room);
    }

    @Override // X.AbstractC963000bAQ
    public final void LJIILL(final C955590ayT c955590ayT) {
        Long lValueOf;
        long id;
        final Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        C955400ayA c955400ayA = C955400ayA.LIZ;
        Long lValueOf2 = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        String strValueOf = String.valueOf(lValueOf);
        String strValueOf2 = String.valueOf(c955590ayT.LJ.getOwnerUserId());
        if (room != null) {
            lValueOf2 = Long.valueOf(room.getId());
        }
        C955400ayA.LJLJL(strValueOf, strValueOf2, String.valueOf(lValueOf2));
        C480460Ism.LIZ().getClass();
        CoHostApi coHostApi = (CoHostApi) C480460Ism.LIZLLL(CoHostApi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        ((C0J1N) coHostApi.reserve(id, c955590ayT.LJ.getId(), c955590ayT.LJ.getOwnerUserId(), 1).LJIILIIL(new C0UO0()).LIZJ(LJII())).LIZ(new C09JN() { // from class: X.0b6d
            @Override // X.C09JN
            public final void accept(Object obj) {
                long j;
                C955590ayT c955590ayT2;
                RivalExtraInfo rivalExtraInfo;
                ReserveResponse.ResponseData responseData;
                ReserveResponse.ResponseData responseData2;
                C1C7U.LIZ("MultiCoHostHistoryPresenter@e856.reserve$1");
                BaseResponse baseResponse = (BaseResponse) obj;
                C955400ayA c955400ayA2 = C955400ayA.LIZ;
                Room room2 = room;
                C955590ayT c955590ayT3 = c955590ayT;
                Long lValueOf3 = null;
                if (baseResponse != null && (responseData2 = (ReserveResponse.ResponseData) baseResponse.data) != null) {
                    lValueOf3 = Long.valueOf(responseData2.reservationId);
                }
                C955400ayA.LJLJLLL(room2, c955590ayT3, String.valueOf(lValueOf3));
                long ownerUserId = c955590ayT.LJ.getOwnerUserId();
                if (baseResponse != null && (responseData = (ReserveResponse.ResponseData) baseResponse.data) != null) {
                    j = responseData.createdTimestamp;
                } else {
                    j = 0;
                }
                C916430ZxJ.LIZ(ownerUserId, j);
                MultiCoHostHistoryContract$AbsView multiCoHostHistoryContract$AbsView = (MultiCoHostHistoryContract$AbsView) this.LL;
                if (multiCoHostHistoryContract$AbsView != null) {
                    multiCoHostHistoryContract$AbsView.ht();
                }
                C960620b6a c960620b6a = this;
                for (Map.Entry entry : ((LinkedHashMap) C1195704m3.LIZ(c960620b6a.LJIIZILJ().Y1(), new C960690b6h(c955590ayT.LJ.getOwnerUserId(), -1L))).entrySet()) {
                    Object key = entry.getKey();
                    if ((((key instanceof C955590ayT) && (c955590ayT2 = (C955590ayT) key) != null) || (c955590ayT2 = (C955590ayT) entry.getValue()) != null) && (rivalExtraInfo = c955590ayT2.LJIIJ) != null) {
                        RivalExtraInfo.ReserveInfo reserveInfo = new RivalExtraInfo.ReserveInfo();
                        reserveInfo.replyStatus = 0;
                        rivalExtraInfo.reserveInfo = reserveInfo;
                    }
                    MultiCoHostHistoryContract$AbsView multiCoHostHistoryContract$AbsView2 = (MultiCoHostHistoryContract$AbsView) c960620b6a.LL;
                    if (multiCoHostHistoryContract$AbsView2 != null) {
                        multiCoHostHistoryContract$AbsView2.UR(c960620b6a.LJIIZILJ().Y1().indexOf(entry.getKey()), entry.getValue());
                    }
                }
                C1C7U.LIZIZ("MultiCoHostHistoryPresenter@e856.reserve$1");
            }
        }, new AfS151S0200000_15(this, c955590ayT, 15));
    }

    public C960620b6a(MultiCoHostHistoryFragment multiCoHostHistoryFragment, DataChannel dataChannel) {
        super(multiCoHostHistoryFragment);
        this.LLILLJJLI = dataChannel;
        this.LLILLL = C292401Bi.LIZ(new AwS559S0100000_15(this, 95));
    }

    @Override // X.InterfaceC950820aqm
    public final void LIZ(Throwable th, Room room) {
        MultiCoHostHistoryContract$AbsView multiCoHostHistoryContract$AbsView = (MultiCoHostHistoryContract$AbsView) this.LL;
        if (multiCoHostHistoryContract$AbsView != null) {
            multiCoHostHistoryContract$AbsView.RR(th);
        }
    }

    @Override // X.InterfaceC950820aqm
    public final void LIZJ(int i, int i2, long j) {
        C955590ayT c955590ayT;
        for (Map.Entry entry : ((LinkedHashMap) C1195704m3.LIZ(LJIIZILJ().Y1(), new AwS30S0000100_15(j, 16))).entrySet()) {
            if (i >= 0) {
                Object key = entry.getKey();
                RivalExtraInfo rivalExtraInfo = null;
                if (((key instanceof C955590ayT) && (c955590ayT = (C955590ayT) key) != null) || (c955590ayT = (C955590ayT) entry.getValue()) != null) {
                    rivalExtraInfo = c955590ayT.LJIIJ;
                }
                C955940az2.LIZJ(rivalExtraInfo, i, i2, c955590ayT);
            }
            MultiCoHostHistoryContract$AbsView multiCoHostHistoryContract$AbsView = (MultiCoHostHistoryContract$AbsView) this.LL;
            if (multiCoHostHistoryContract$AbsView != null) {
                multiCoHostHistoryContract$AbsView.UR(LJIIZILJ().Y1().indexOf(entry.getKey()), entry.getValue());
            }
        }
    }

    @Override // X.InterfaceC950820aqm
    public final void LJFF(long j, Room room, RivalExtraInfo rivalExtraInfo) {
        C955590ayT c955590ayT;
        for (Map.Entry entry : ((LinkedHashMap) C1195704m3.LIZ(LJIIZILJ().Y1(), new C960690b6h(j, -1L))).entrySet()) {
            Object key = entry.getKey();
            if (((key instanceof C955590ayT) && (c955590ayT = (C955590ayT) key) != null) || (c955590ayT = (C955590ayT) entry.getValue()) != null) {
                c955590ayT.LJ = room;
                c955590ayT.LJIIJ = rivalExtraInfo;
                c955590ayT.LJIJ = c955590ayT.LJ();
            }
            MultiCoHostHistoryContract$AbsView multiCoHostHistoryContract$AbsView = (MultiCoHostHistoryContract$AbsView) this.LL;
            if (multiCoHostHistoryContract$AbsView != null) {
                multiCoHostHistoryContract$AbsView.UR(LJIIZILJ().Y1().indexOf(entry.getKey()), entry.getValue());
            }
        }
    }

    @Override // X.InterfaceC950820aqm
    public final void LIZIZ(int i, int i2, int i3, long j) {
        C955590ayT c955590ayT;
        RivalExtraInfo rivalExtraInfo;
        for (Map.Entry entry : ((LinkedHashMap) C1195704m3.LIZ(LJIIZILJ().Y1(), new AwS30S0000100_15(j, 16))).entrySet()) {
            Object key = entry.getKey();
            if ((((key instanceof C955590ayT) && (c955590ayT = (C955590ayT) key) != null) || (c955590ayT = (C955590ayT) entry.getValue()) != null) && (rivalExtraInfo = c955590ayT.LJIIJ) != null) {
                rivalExtraInfo.showPlayType = i;
                C955940az2.LIZJ(rivalExtraInfo, i2, i3, c955590ayT);
            }
            MultiCoHostHistoryContract$AbsView multiCoHostHistoryContract$AbsView = (MultiCoHostHistoryContract$AbsView) this.LL;
            if (multiCoHostHistoryContract$AbsView != null) {
                multiCoHostHistoryContract$AbsView.UR(LJIIZILJ().Y1().indexOf(entry.getKey()), entry.getValue());
            }
        }
    }

    @Override // X.AbstractC963000bAQ
    public final void LJIIIZ(C955590ayT c955590ayT, C955540ayO c955540ayO, boolean z, long j) {
        Room room = c955590ayT.LJ;
        C238400w2 c238400w2 = new C238400w2();
        long jLJIIL = C950220apo.LJIIL(room);
        c238400w2.element = jLJIIL;
        long jLongValue = 0;
        if (jLJIIL == 0) {
            C480460Ism.LIZ().getClass();
            CoHostApi coHostApi = (CoHostApi) C480460Ism.LIZLLL(CoHostApi.class);
            Long lLJIIJ = C930540aK4.LJIIJ();
            if (lLJIIJ != null) {
                jLongValue = lLJIIJ.longValue();
            }
            ((C0J1N) coHostApi.getUserLinkmicStatusMultiCoHost(jLongValue, String.valueOf(room.getOwnerUserId()), String.valueOf(room.getId()), "", "", "", "", false).LJIILIIL(new C0UO0()).LIZJ(LJII())).LIZ(new AfS0S0510100_15(c238400w2, room, c955590ayT, c955540ayO, z, this, j, 1), new AfS0S0410100_15(c955590ayT, c955540ayO, this, z, c238400w2, j, 1));
            return;
        }
        C950790aqj.LIZJ(c955590ayT, c955540ayO, z, "", this, j, jLJIIL);
    }

    @Override // X.AbstractC963000bAQ
    public final void LJIIL(C955590ayT c955590ayT, C955540ayO c955540ayO, boolean z, long j) {
        C950790aqj.LJ(c955590ayT, c955540ayO, z, C915980Zwa.LJI().LIZ().LJL(), this, j);
    }
}
