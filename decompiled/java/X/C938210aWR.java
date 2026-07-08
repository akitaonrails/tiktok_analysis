package X;

import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.android.livesdk.model.message.FanTicketRoomNoticeContent;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.UserFanTicket;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.sei.TicketInfo;
import com.bytedance.android.livesdk.sei.TicketInfoExtra;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aWR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C938210aWR implements LifecycleOwner {
    public final DataChannel LL;
    public final boolean LLILLJJLI;
    public final InterfaceC921620a5g LLILLL;
    public final C938220aWS LLILZ;
    public final LifecycleRegistry LLILZIL = new LifecycleRegistry(this);
    public long LLILZLL;
    public long LLIZ;
    public FanTicketRoomNoticeContent LLIZLLLIL;
    public final C11PQ<Long> LLJ;
    public final C987070bnF LLJI;
    public final C937340aV2 LLJIJIL;

    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C938210aWR.LJ():void");
    }

    public final void LJIIIIZZ() {
        List<UserFanTicket> list;
        AbstractC928510aGn abstractC928510aGnLIZ;
        List<LinkListUser> listLJJIII;
        MultiGuestDataHolder multiGuestDataHolder;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        List<LinkPlayerInfo> listLJJIII2;
        InterfaceC302601Fg interfaceC302601FgLIZ;
        InterfaceC302601Fg interfaceC302601FgLIZ2;
        FanTicketRoomNoticeContent fanTicketRoomNoticeContent = this.LLIZLLLIL;
        if (fanTicketRoomNoticeContent == null || (list = fanTicketRoomNoticeContent.userFanTicket) == null) {
            return;
        }
        for (UserFanTicket userFanTicket : list) {
            if (MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow() && (interfaceC302601FgLIZ = C01FQ.LIZ()) != null && interfaceC302601FgLIZ.LJIJI() && (interfaceC302601FgLIZ2 = C01FQ.LIZ()) != null) {
                interfaceC302601FgLIZ2.LJIJJ(userFanTicket.userId, userFanTicket.matchTotalScore);
            }
            if (C930540aK4.LIZJ()) {
                InterfaceC302401Fe interfaceC302401Fe = (InterfaceC302401Fe) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
                if (interfaceC302401Fe != null && (abstractC928510aGnLIZ2 = interfaceC302401Fe.LIZ()) != null && (listLJJIII2 = abstractC928510aGnLIZ2.LJJIII()) != null) {
                    for (LinkPlayerInfo linkPlayerInfo : listLJJIII2) {
                        User user = linkPlayerInfo.mUser;
                        if (user != null && user.getId() == userFanTicket.userId) {
                            linkPlayerInfo.mFanTicket = userFanTicket.fanTicket;
                        }
                    }
                }
            } else {
                InterfaceC917640ZzG interfaceC917640ZzG = (InterfaceC917640ZzG) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
                if (interfaceC917640ZzG != null && (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) != null && (listLJJIII = abstractC928510aGnLIZ.LJJIII()) != null) {
                    for (LinkListUser linkListUser : listLJJIII) {
                        User user2 = linkListUser.user;
                        if (user2 != null && user2.getId() == userFanTicket.userId) {
                            linkListUser.fanTicket = userFanTicket.fanTicket;
                        }
                    }
                }
            }
            FanTicketRoomNoticeContent fanTicketRoomNoticeContent2 = this.LLIZLLLIL;
            if (!TextUtils.isEmpty(fanTicketRoomNoticeContent2 != null ? fanTicketRoomNoticeContent2.fanTicketIconUrl : null) && (multiGuestDataHolder = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER")) != null) {
                FanTicketRoomNoticeContent fanTicketRoomNoticeContent3 = this.LLIZLLLIL;
                multiGuestDataHolder.LJJJLZIJ = fanTicketRoomNoticeContent3 != null ? fanTicketRoomNoticeContent3.fanTicketIconUrl : null;
            }
            LIZJ(userFanTicket.userId);
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILZIL;
    }

    public static long LIZ(long j) {
        AbstractC928510aGn abstractC928510aGnLIZ;
        List listLJJIII;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        List listLJJIII2;
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        InterfaceC927690aFT interfaceC927690aFTLIZ = C924220a9s.LIZ();
        InterfaceC938530aWx interfaceC938530aWxLIZ = C01IB.LIZ();
        if (MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow() && interfaceC302601FgLIZ != null && interfaceC302601FgLIZ.LJIJI()) {
            return interfaceC302601FgLIZ.LIZJ(j);
        }
        if (interfaceC927690aFTLIZ != null && interfaceC927690aFTLIZ.LJFF()) {
            return interfaceC927690aFTLIZ.LIZLLL(Long.valueOf(j));
        }
        if (interfaceC938530aWxLIZ != null && interfaceC938530aWxLIZ.LJIIJ()) {
            return interfaceC938530aWxLIZ.LJIIIZ(Long.valueOf(j));
        }
        Object obj = null;
        if (C930540aK4.LIZJ()) {
            InterfaceC302401Fe interfaceC302401Fe = (InterfaceC302401Fe) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (interfaceC302401Fe != null && (abstractC928510aGnLIZ2 = interfaceC302401Fe.LIZ()) != null && (listLJJIII2 = abstractC928510aGnLIZ2.LJJIII()) != null) {
                Iterator it2 = listLJJIII2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    User user = ((LinkPlayerInfo) next).mUser;
                    if (user != null && user.getId() == j) {
                        obj = next;
                        break;
                    }
                }
                LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj;
                if (linkPlayerInfo != null) {
                    return linkPlayerInfo.mFanTicket;
                }
                return 0L;
            }
            return 0L;
        }
        InterfaceC917640ZzG interfaceC917640ZzG = (InterfaceC917640ZzG) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (interfaceC917640ZzG != null && (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) != null && (listLJJIII = abstractC928510aGnLIZ.LJJIII()) != null) {
            Iterator it3 = listLJJIII.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                User user2 = ((LinkListUser) next2).user;
                if (user2 != null && user2.getId() == j) {
                    obj = next2;
                    break;
                }
            }
            LinkListUser linkListUser = (LinkListUser) obj;
            if (linkListUser != null) {
                return linkListUser.fanTicket;
            }
            return 0L;
        }
        return 0L;
    }

    public final LinkPlayerInfo LIZIZ(String str) {
        InterfaceC917640ZzG interfaceC917640ZzG;
        AbstractC928510aGn abstractC928510aGnLIZ;
        List listLJJIII;
        Object next;
        InterfaceC302401Fe interfaceC302401Fe;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        List listLJJIII2;
        Object obj = null;
        if (C937310aUz.LIZIZ(this.LL) == EnumC934000aPe.ANCHOR) {
            InterfaceC921620a5g interfaceC921620a5g = this.LLILLL;
            if (!(interfaceC921620a5g instanceof InterfaceC302401Fe) || (interfaceC302401Fe = (InterfaceC302401Fe) interfaceC921620a5g) == null || (abstractC928510aGnLIZ2 = interfaceC302401Fe.LIZ()) == null || (listLJJIII2 = abstractC928510aGnLIZ2.LJJIII()) == null) {
                return null;
            }
            Iterator it2 = listLJJIII2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (Intrinsics.LJFF(((LinkPlayerInfo) next2).mInteractIdStr, str)) {
                    obj = next2;
                    break;
                }
            }
            return (LinkPlayerInfo) obj;
        }
        if (C937310aUz.LIZIZ(this.LL) != EnumC934000aPe.GUEST && C937310aUz.LIZIZ(this.LL) != EnumC934000aPe.AUDIENCE) {
            return null;
        }
        InterfaceC921620a5g interfaceC921620a5g2 = this.LLILLL;
        if (!(interfaceC921620a5g2 instanceof InterfaceC917640ZzG) || (interfaceC917640ZzG = (InterfaceC917640ZzG) interfaceC921620a5g2) == null || (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) == null || (listLJJIII = abstractC928510aGnLIZ.LJJIII()) == null) {
            return null;
        }
        Iterator it3 = listLJJIII.iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                if (Intrinsics.LJFF(((LinkListUser) next).linkMicId, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        LinkListUser linkListUser = (LinkListUser) next;
        if (linkListUser == null) {
            return null;
        }
        return C930540aK4.LIZ(linkListUser);
    }

    public final void LIZJ(long j) {
        Object next;
        C11PQ<Long> c11pq;
        C2262071DgL c2262071DgL;
        long jLIZ = LIZ(j);
        Iterator<T> it2 = this.LLILZ.LLJJ.values().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                List<C2262071DgL> listLJLZ = ((C938230aWT) next).LJ.LJLZ();
                if (listLJLZ != null && (c2262071DgL = (C2262071DgL) C13LP.LJJJLL(listLJLZ)) != null && c2262071DgL.getId() == j) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C938230aWT c938230aWT = (C938230aWT) next;
        if (c938230aWT != null && (c11pq = c938230aWT.LJII) != null) {
            c11pq.onNext(Long.valueOf(jLIZ));
        }
    }

    public final void LIZLLL(FanTicketRoomNoticeContent fanTicketRoomNoticeContent, long j) {
        long j2;
        InterfaceC938070aWD interfaceC938070aWD;
        InterfaceC938070aWD interfaceC938070aWD2;
        if (fanTicketRoomNoticeContent != null) {
            j2 = fanTicketRoomNoticeContent.version;
        } else {
            j2 = 0;
        }
        if (j2 > 0) {
            if (this.LLIZ > j2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("receiveLinkMicFanTicketMessage return as lastReceivedFanTicketRoomNoticeMessageCreateTime ");
                sbLIZ.append(this.LLILZLL);
                sbLIZ.append(" > create ");
                sbLIZ.append(j2);
                C20441214yg.LIZIZ("MultiGuestFanTicketInfoCenter", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("receiveLinkMicFanTicketMessage ");
            sbLIZ2.append(j2);
            C20441214yg.LIZIZ("MultiGuestFanTicketInfoCenter", C2188811AlT.LIZIZ(sbLIZ2));
            this.LLIZ = j2;
            if (this.LLILLJJLI && (interfaceC938070aWD2 = (InterfaceC938070aWD) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_TICKET_SEI_WRITER")) != null) {
                interfaceC938070aWD2.LIZIZ(fanTicketRoomNoticeContent);
            }
            this.LLIZLLLIL = fanTicketRoomNoticeContent;
            this.LLJ.onNext(Long.valueOf(this.LLIZ));
            return;
        }
        if (this.LLILZLL > j) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("receiveLinkMicFanTicketMessage return as lastReceivedFanTicketRoomNoticeMessageCreateTime ");
            sbLIZ3.append(this.LLILZLL);
            sbLIZ3.append(" > createTime ");
            sbLIZ3.append(j);
            C20441214yg.LIZIZ("MultiGuestFanTicketInfoCenter", C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("receiveLinkMicFanTicketMessage ");
        sbLIZ4.append(j);
        C20441214yg.LIZIZ("MultiGuestFanTicketInfoCenter", C2188811AlT.LIZIZ(sbLIZ4));
        this.LLILZLL = j;
        if (this.LLILLJJLI && (interfaceC938070aWD = (InterfaceC938070aWD) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_TICKET_SEI_WRITER")) != null) {
            interfaceC938070aWD.LIZIZ(fanTicketRoomNoticeContent);
        }
        this.LLIZLLLIL = fanTicketRoomNoticeContent;
        this.LLJ.onNext(Long.valueOf(this.LLILZLL));
    }

    public final FanTicketRoomNoticeContent LJI(TicketInfoExtra ticketInfoExtra, boolean z) {
        long id;
        int iIntValue;
        User user;
        FanTicketRoomNoticeContent fanTicketRoomNoticeContent = new FanTicketRoomNoticeContent();
        ArrayList arrayList = new ArrayList();
        Map<String, TicketInfo> map = ticketInfoExtra.map;
        if (map != null) {
            for (Map.Entry<String, TicketInfo> entry : map.entrySet()) {
                String key = entry.getKey();
                TicketInfo value = entry.getValue();
                UserFanTicket userFanTicket = new UserFanTicket();
                LinkPlayerInfo linkPlayerInfoLIZIZ = LIZIZ(key);
                long jLongValue = 0;
                if (linkPlayerInfoLIZIZ != null && (user = linkPlayerInfoLIZIZ.mUser) != null) {
                    id = user.getId();
                } else {
                    id = 0;
                }
                userFanTicket.userId = id;
                userFanTicket.LIZ = key;
                userFanTicket.animationName = value.animId;
                Long l = value.ticketValue;
                if (l != null) {
                    jLongValue = l.longValue();
                }
                userFanTicket.fanTicket = jLongValue;
                userFanTicket.iconName = value.styleName;
                if (z) {
                    userFanTicket.animationName = value.animId;
                    userFanTicket.ticketUiStyle = value.ticketUiStyle;
                    userFanTicket.ticketUiStyleV2 = value.ticketUiStyleV2;
                    Integer num = value.completionProgress;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    userFanTicket.completionProgressPercent = iIntValue;
                }
                arrayList.add(userFanTicket);
            }
        }
        fanTicketRoomNoticeContent.userFanTicket = arrayList;
        return fanTicketRoomNoticeContent;
    }

    public final void LJII(long j, long j2) {
        C2262071DgL c2262071DgL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateAllFanTicketCountDuringPlay userId:");
        sbLIZ.append(j);
        sbLIZ.append(" matchTotalScore:");
        sbLIZ.append(j2);
        C20441214yg.LIZIZ("MultiGuestFanTicketInfoCenter", C2188811AlT.LIZIZ(sbLIZ));
        Collection<C938230aWT> collectionValues = this.LLILZ.LLJJ.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            List<C2262071DgL> listLJLZ = ((C938230aWT) obj).LJ.LJLZ();
            if (listLJLZ != null && (c2262071DgL = (C2262071DgL) C13LP.LJJJLL(listLJLZ)) != null && c2262071DgL.getId() == j) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C938230aWT) it2.next()).LJII.onNext(Long.valueOf(j2));
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0aV2] */
    public C938210aWR(DataChannel dataChannel, boolean z, InterfaceC921620a5g interfaceC921620a5g, C938220aWS c938220aWS) {
        this.LL = dataChannel;
        this.LLILLJJLI = z;
        this.LLILLL = interfaceC921620a5g;
        this.LLILZ = c938220aWS;
        C11PQ<Long> c11pq = new C11PQ<>();
        c11pq.onNext(0L);
        this.LLJ = c11pq;
        this.LLJI = new C987070bnF(this, 3);
        this.LLJIJIL = new InterfaceC922630a7J() { // from class: X.0aV2
            @Override // X.InterfaceC922630a7J
            public final void Ue(Throwable th) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onFetchFailed t=");
                sbLIZ.append(th.getMessage());
                C937310aUz.LJFF("MultiGuestFanTicketInfoCenter", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC922630a7J
            public final void L2(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, int i) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onListChangeByFetch source=");
                sbLIZ.append(i);
                C937310aUz.LIZLLL("MultiGuestFanTicketInfoCenter", C2188811AlT.LIZIZ(sbLIZ));
                if (C937310aUz.LIZIZ(this.LL.LL) == EnumC934000aPe.ANCHOR) {
                    List<LinkPlayerInfo> listLIZ = interfaceC921200a50.LIZ();
                    C938210aWR c938210aWR = this.LL;
                    Iterator<LinkPlayerInfo> it2 = listLIZ.iterator();
                    while (it2.hasNext()) {
                        User user = it2.next().mUser;
                        if (user != null) {
                            c938210aWR.LIZJ(user.getId());
                        }
                    }
                }
            }

            @Override // X.InterfaceC922630a7J
            public final void rn(InterfaceC921200a50<LinkListUser, LinkMessage> interfaceC921200a50, int i) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onListChangeByIM source=");
                sbLIZ.append(i);
                C937310aUz.LIZLLL("MultiGuestFanTicketInfoCenter", C2188811AlT.LIZIZ(sbLIZ));
                if (C937310aUz.LIZIZ(this.LL.LL) != EnumC934000aPe.ANCHOR) {
                    List<LinkListUser> listLIZ = interfaceC921200a50.LIZ();
                    C938210aWR c938210aWR = this.LL;
                    Iterator<LinkListUser> it2 = listLIZ.iterator();
                    while (it2.hasNext()) {
                        User user = it2.next().user;
                        if (user != null) {
                            c938210aWR.LIZJ(user.getId());
                        }
                    }
                }
            }
        };
    }
}
