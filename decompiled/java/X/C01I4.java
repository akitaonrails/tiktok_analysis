package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.GuestShowdownFirstStartEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.GuestShowdownLoserListUpdatedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.GuestShowdownOnClosedMessageReceivedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.GuestShowdownPlayerListUpdatedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.GuestShowdownReStartEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.GuestShowdownShowEndDialogDirectlyEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.GuestShowdownTop3ListUpdatedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.GuestShowdownWinnerListUpdatedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.IGuestShowdownApi;
import com.bytedance.android.live.liveinteract.multilive.model.GuestShowdownGetContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.GuestShowdownGetContentResponse;
import com.bytedance.android.livesdk.model.message.FanTicketRoomNoticeContent;
import com.bytedance.android.livesdk.model.message.UserFanTicket;
import com.bytedance.android.livesdk.model.message.UserPlayInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.data.multi_guest_play.GuestShowdownConfig;
import webcast.data.multi_guest_play.GuestShowdownConfigChange;
import webcast.data.multi_guest_play.GuestShowdownContent;
import webcast.data.multi_guest_play.GuestShowdownUser;

/* JADX INFO: renamed from: X.01I4, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public abstract class C01I4 implements InterfaceC213200ry {
    public final DataChannel LIZ;
    public GuestShowdownContent LIZIZ;
    public List<Long> LIZJ = new ArrayList();
    public List<Long> LIZLLL = new ArrayList();
    public List<Long> LJ = new ArrayList();
    public List<C0170003k> LJFF;
    public List<Pair<Long, Integer>> LJI;
    public List<C0170003k> LJII;
    public List<C0170003k> LJIIIIZZ;
    public final CopyOnWriteArrayList<C01I7> LJIIIZ;
    public final C213100rx LJIIJ;
    public final ConcurrentHashMap<Long, Long> LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public Integer LJIILLIIL;
    public final C01GW LJIIZILJ;
    public final C01GW LJIJ;
    public final C01GW LJIJI;

    public void LJIIIZ() throws JSONException {
        this.LJIILLIIL = null;
        this.LJIIJJI.clear();
        this.LJIILIIL = 0L;
        this.LJIILJJIL = 0L;
        this.LJIILL = 0L;
        LJIJJ(null, "clearCache");
    }

    public abstract String LJIILL();

    public abstract void LJIILLIIL(GuestShowdownContent guestShowdownContent, int i, boolean z, String str);

    public final int LJIILJJIL() {
        GuestShowdownContent guestShowdownContent = this.LIZIZ;
        if (guestShowdownContent != null) {
            return guestShowdownContent.playStatus;
        }
        return 0;
    }

    public void LJIIZILJ() {
        InterfaceC938250aWV interfaceC938250aWV;
        if (!C01ZE.LIZ() || (interfaceC938250aWV = (InterfaceC938250aWV) this.LJIIZILJ.getValue()) == null) {
            return;
        }
        interfaceC938250aWV.LJI((C01I5) this.LJIJ.getValue());
    }

    public void LJIJ() {
        IMessageManager iMessageManager;
        InterfaceC938250aWV interfaceC938250aWV;
        C20441214yg.LJIIIZ(LJIILL(), "onDestroy");
        if (C01ZE.LIZ() && (interfaceC938250aWV = (InterfaceC938250aWV) this.LJIIZILJ.getValue()) != null) {
            interfaceC938250aWV.LJII((C01I5) this.LJIJ.getValue());
        }
        this.LJIIIZ.clear();
        C213100rx c213100rx = this.LJIIJ;
        c213100rx.getClass();
        try {
            DataChannel dataChannel = c213100rx.LIZ;
            if (dataChannel == null || (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) == null) {
                return;
            }
            iMessageManager.removeMessageListener((OnIMMessageListener) c213100rx.LJ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("GuestShowdownMessageChannel", e);
        }
    }

    public C01I4(DataChannel dataChannel) {
        this.LIZ = dataChannel;
        C13BV c13bv = C13BV.INSTANCE;
        this.LJFF = c13bv;
        this.LJI = new ArrayList();
        this.LJII = c13bv;
        this.LJIIIIZZ = c13bv;
        this.LJIIIZ = new CopyOnWriteArrayList<>();
        this.LJIIJ = new C213100rx(dataChannel, this);
        this.LJIIJJI = new ConcurrentHashMap<>();
        this.LJIIZILJ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(386));
        this.LJIJ = C452501pT.LIZIZ(new C5182020e(this, 343));
        this.LJIJI = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(387));
    }

    @Override // X.InterfaceC213200ry
    public final void LIZ(GuestShowdownContent guestShowdownContent) {
        C20441214yg.LIZIZ(LJIILL(), "onContentSyncMessageReceived");
        LJIIIIZZ(guestShowdownContent, "onContentSyncMessageReceived");
    }

    @Override // X.InterfaceC213200ry
    public final void LIZJ(GuestShowdownContent guestShowdownContent) {
        C20441214yg.LIZIZ(LJIILL(), "onPunishmentMessageReceived");
        LJIIIIZZ(guestShowdownContent, "onPunishmentMessageReceived");
    }

    @Override // X.InterfaceC213200ry
    public final void LIZLLL(FanTicketRoomNoticeContent fanTicketRoomNoticeContent) {
        long j;
        int i;
        Integer numValueOf;
        long j2 = fanTicketRoomNoticeContent.eventTime;
        if (j2 < this.LJIIL) {
            return;
        }
        this.LJIIL = j2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (UserFanTicket userFanTicket : C13LP.LJLLLL(new C512401z8(47), fanTicketRoomNoticeContent.userFanTicket)) {
            UserPlayInfo userPlayInfo = userFanTicket.playInfo;
            if (userPlayInfo != null) {
                arrayList4.add(new Pair(Long.valueOf(userFanTicket.userId), Integer.valueOf(userPlayInfo.userTag)));
            }
            long j3 = userFanTicket.userId;
            UserPlayInfo userPlayInfo2 = userFanTicket.playInfo;
            if (userPlayInfo2 != null) {
                j = userPlayInfo2.score;
            } else {
                j = 0;
            }
            LJIJJLI(j3, j, "onFanTicketMessageReceived");
            UserPlayInfo userPlayInfo3 = userFanTicket.playInfo;
            if (userPlayInfo3 != null && (numValueOf = Integer.valueOf(userPlayInfo3.userTag)) != null) {
                if (numValueOf.intValue() == 2) {
                    arrayList.add(Long.valueOf(userFanTicket.userId));
                } else if (numValueOf.intValue() == 3) {
                    arrayList2.add(Long.valueOf(userFanTicket.userId));
                }
            }
            UserPlayInfo userPlayInfo4 = userFanTicket.playInfo;
            if (userPlayInfo4 != null && 1 <= (i = userPlayInfo4.rank) && i < 4) {
                arrayList3.add(Long.valueOf(userFanTicket.userId));
            }
        }
        String strLJIILL = LJIILL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onGuestShowdownFanTicketMessageReceived, winnerUidList != winnerUidListFromIM: ");
        sbLIZ.append(!Intrinsics.LJFF(this.LIZJ, arrayList));
        sbLIZ.append(", winnerUidList: ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", winnerUidListFromIM: ");
        sbLIZ.append(arrayList);
        sbLIZ.append("; loserUidList != loserUidListFromIM: ");
        sbLIZ.append(!Intrinsics.LJFF(this.LIZLLL, arrayList2));
        sbLIZ.append(", loserUidList: ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", loserUidListFromIM: ");
        sbLIZ.append(arrayList2);
        sbLIZ.append("; top3UidList != top3UidListFromIM: ");
        sbLIZ.append(!Intrinsics.LJFF(this.LJ, arrayList3));
        sbLIZ.append(", top3UidList: ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", top3UidListFromIM: ");
        sbLIZ.append(arrayList3);
        C20441214yg.LIZIZ(strLJIILL, C2188811AlT.LIZIZ(sbLIZ));
        LJIIJ(arrayList4);
        LJIIL(arrayList, arrayList2);
        LJIIJJI(arrayList3);
    }

    @Override // X.InterfaceC213200ry
    public void LJ(GuestShowdownContent guestShowdownContent) {
        C20441214yg.LIZIZ(LJIILL(), "onReadyMessageReceived");
        LJIIIIZZ(guestShowdownContent, "onReadyMessageReceived");
    }

    @Override // X.InterfaceC213200ry
    public final void LJFF(GuestShowdownContent guestShowdownContent) {
        C20441214yg.LIZIZ(LJIILL(), "onUpdateConfigMessageReceived");
        LJIIIIZZ(guestShowdownContent, "onUpdateConfigMessageReceived");
    }

    @Override // X.InterfaceC213200ry
    public final void LJI(GuestShowdownContent guestShowdownContent) {
        C20441214yg.LIZIZ(LJIILL(), "onStartMessageReceived");
        this.LJIILJJIL = C445101oH.LIZ();
        LJIIIIZZ(guestShowdownContent, "onStartMessageReceived");
    }

    public final void LJIIJ(List<Pair<Long, Integer>> list) {
        if (!Intrinsics.LJFF(this.LJI, list)) {
            this.LJI = list;
            DataChannel dataChannel = this.LIZ;
            if (dataChannel != null) {
                dataChannel.LC0(GuestShowdownPlayerListUpdatedEvent.class, list);
            }
        }
    }

    public final void LJIIJJI(List<Long> list) {
        if (!Intrinsics.LJFF(this.LJ, list) || this.LJ.size() != this.LJFF.size()) {
            this.LJ = list;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                arrayList.add(LJIILIIL(((Number) it2.next()).longValue()));
            }
            this.LJFF = C13LP.LJJJJLI(arrayList);
            DataChannel dataChannel = this.LIZ;
            if (dataChannel != null) {
                dataChannel.LC0(GuestShowdownTop3ListUpdatedEvent.class, this.LJ);
            }
            String strLJIILL = LJIILL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("top3ListUpdated: ");
            sbLIZ.append(list);
            C320901Mh.LIZ(strLJIILL, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.003k] */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.003k] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.003k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0170003k LJIILIIL(long r12) {
        /*
            r11 = this;
            boolean r0 = com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt.currentUserIsAnchor()
            r5 = 0
            if (r0 == 0) goto L3f
            X.0amx r1 = X.C948450amx.LIZIZ
            java.lang.String r0 = "MULTI_GUEST_V3_ANCHOR_USER_MANAGER"
            java.lang.Object r1 = r1.LJIIIZ(r0)
            boolean r0 = r1 instanceof X.InterfaceC302401Fe
            if (r0 == 0) goto L60
            X.01Fe r1 = (X.InterfaceC302401Fe) r1
            if (r1 == 0) goto L60
            X.0aGn r0 = r1.LIZ()
            if (r0 == 0) goto L60
            java.lang.Object r0 = r0.LJIILIIL(r12)
            com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r0 = (com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo) r0
            if (r0 == 0) goto L60
            com.bytedance.android.live.base.model.user.User r0 = r0.mUser
        L27:
            if (r0 == 0) goto L60
            X.003k r5 = new X.003k
            long r7 = r0.getId()
            com.bytedance.android.live.base.model.ImageModel r6 = r0.getAvatarThumb()
            java.lang.String r9 = r0.getDisplayId()
            java.lang.String r10 = r0.getNickName()
            r5.<init>(r6, r7, r9, r10)
        L3e:
            return r5
        L3f:
            X.0amx r1 = X.C948450amx.LIZIZ
            java.lang.String r0 = "MULTI_GUEST_V3_GUEST_USER_MANAGER"
            java.lang.Object r1 = r1.LJIIIZ(r0)
            boolean r0 = r1 instanceof X.InterfaceC917640ZzG
            if (r0 == 0) goto L60
            X.0ZzG r1 = (X.InterfaceC917640ZzG) r1
            if (r1 == 0) goto L60
            X.0aGn r0 = r1.LIZ()
            if (r0 == 0) goto L60
            java.lang.Object r0 = r0.LJIILIIL(r12)
            com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser r0 = (com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser) r0
            if (r0 == 0) goto L60
            com.bytedance.android.live.base.model.user.User r0 = r0.user
            goto L27
        L60:
            webcast.data.multi_guest_play.GuestShowdownContent r0 = r11.LIZIZ
            if (r0 == 0) goto L93
            java.util.List<webcast.data.multi_guest_play.GuestShowdownUser> r0 = r0.runningPlayUsers
            if (r0 == 0) goto L93
            java.util.Iterator r4 = r0.iterator()
        L6c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L91
            java.lang.Object r3 = r4.next()
            r0 = r3
            webcast.data.multi_guest_play.GuestShowdownUser r0 = (webcast.data.multi_guest_play.GuestShowdownUser) r0
            long r1 = r0.userId
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 != 0) goto L6c
        L7f:
            webcast.data.multi_guest_play.GuestShowdownUser r3 = (webcast.data.multi_guest_play.GuestShowdownUser) r3
            if (r3 == 0) goto L93
            X.003k r5 = new X.003k
            long r7 = r3.userId
            com.bytedance.android.live.base.model.ImageModel r6 = r3.avatarThumb
            java.lang.String r9 = r3.displayId
            java.lang.String r10 = r3.nickname
            r5.<init>(r6, r7, r9, r10)
            return r5
        L91:
            r3 = r5
            goto L7f
        L93:
            webcast.data.multi_guest_play.GuestShowdownContent r0 = r11.LIZIZ
            if (r0 == 0) goto L3e
            java.util.List<webcast.data.multi_guest_play.GuestShowdownUser> r0 = r0.leavePlayUsers
            if (r0 == 0) goto L3e
            java.util.Iterator r4 = r0.iterator()
        L9f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lc4
            java.lang.Object r3 = r4.next()
            r0 = r3
            webcast.data.multi_guest_play.GuestShowdownUser r0 = (webcast.data.multi_guest_play.GuestShowdownUser) r0
            long r1 = r0.userId
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 != 0) goto L9f
        Lb2:
            webcast.data.multi_guest_play.GuestShowdownUser r3 = (webcast.data.multi_guest_play.GuestShowdownUser) r3
            if (r3 == 0) goto L3e
            X.003k r5 = new X.003k
            long r7 = r3.userId
            com.bytedance.android.live.base.model.ImageModel r6 = r3.avatarThumb
            java.lang.String r9 = r3.displayId
            java.lang.String r10 = r3.nickname
            r5.<init>(r6, r7, r9, r10)
            return r5
        Lc4:
            r3 = r5
            goto Lb2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01I4.LJIILIIL(long):X.003k");
    }

    @Override // X.InterfaceC213200ry
    public void LIZIZ(int i, GuestShowdownContent guestShowdownContent) {
        C20441214yg.LIZIZ(LJIILL(), "onCalculatingMessageReceived");
        this.LJIILL = C445101oH.LIZ();
        LJIIIIZZ(guestShowdownContent, "onCalculatingMessageReceived");
    }

    public final void LJIIIIZZ(GuestShowdownContent guestShowdownContent, String str) {
        long j;
        if (guestShowdownContent != null && Long.valueOf(guestShowdownContent.version) != null) {
            GuestShowdownContent guestShowdownContent2 = this.LIZIZ;
            if (guestShowdownContent2 != null) {
                j = guestShowdownContent2.version;
            } else {
                j = 0;
            }
            if (guestShowdownContent.version >= j) {
                LJIJJ(guestShowdownContent, str);
                return;
            }
        }
        String strLJIILL = LJIILL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ignore update source=");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ(strLJIILL, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIIL(List<Long> list, List<Long> list2) {
        if (!Intrinsics.LJFF(this.LIZJ, list) || this.LIZJ.size() != this.LJII.size()) {
            this.LIZJ = list;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                arrayList.add(LJIILIIL(((Number) it2.next()).longValue()));
            }
            this.LJII = C13LP.LJJJJLI(arrayList);
            DataChannel dataChannel = this.LIZ;
            if (dataChannel != null) {
                dataChannel.LC0(GuestShowdownWinnerListUpdatedEvent.class, this.LIZJ);
            }
            String strLJIILL = LJIILL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("winnerListUpdated: ");
            sbLIZ.append(list);
            C320901Mh.LIZ(strLJIILL, C2188811AlT.LIZIZ(sbLIZ));
        }
        if (!Intrinsics.LJFF(this.LIZLLL, list2) || this.LIZLLL.size() != this.LJIIIIZZ.size()) {
            this.LIZLLL = list2;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator it3 = ((ArrayList) list2).iterator();
            while (it3.hasNext()) {
                arrayList2.add(LJIILIIL(((Number) it3.next()).longValue()));
            }
            this.LJIIIIZZ = C13LP.LJJJJLI(arrayList2);
            DataChannel dataChannel2 = this.LIZ;
            if (dataChannel2 != null) {
                dataChannel2.LC0(GuestShowdownLoserListUpdatedEvent.class, this.LIZLLL);
            }
            String strLJIILL2 = LJIILL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("loserListUpdated: ");
            sbLIZ2.append(list2);
            C320901Mh.LIZ(strLJIILL2, C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public final AbstractC19484711Kz<C470590Icr<GuestShowdownGetContentResponse.ResponseData>> LJIJI(GuestShowdownGetContentParams guestShowdownGetContentParams, long j) {
        C480460Ism.LIZ().getClass();
        AbstractC19484711Kz<C470590Icr<GuestShowdownGetContentResponse.ResponseData>> content = ((IGuestShowdownApi) C480460Ism.LIZLLL(IGuestShowdownApi.class)).getContent(guestShowdownGetContentParams);
        if (j > 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            C11RO c11roLIZ = C11S5.LIZ();
            content.getClass();
            C1701890uOB.LIZ(timeUnit, "unit is null");
            C1701890uOB.LIZ(c11roLIZ, "scheduler is null");
            content = new C11LU(content, j, timeUnit, c11roLIZ);
        }
        return C01NB.LIZIZ(content, LJIILL(), "requestGetContent").LJIILL(new C516201zk(this, 240)).LJIIL(new C516201zk(this, 241)).LJFF(new C0UO0());
    }

    public void LJIJJ(GuestShowdownContent guestShowdownContent, String str) throws JSONException {
        String strLIZJ;
        int i;
        int i2;
        DataChannel dataChannel;
        int i3;
        int i4;
        List<GuestShowdownUser> list;
        List<GuestShowdownUser> listLJLLLL;
        GuestShowdownConfig guestShowdownConfig;
        String strLJIILL = LJIILL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateContent before comparing, source=");
        sbLIZ.append(str);
        sbLIZ.append(" content=");
        String strLIZJ2 = null;
        if (guestShowdownContent != null) {
            strLIZJ = C1516000pYM.LIZJ(guestShowdownContent);
        } else {
            strLIZJ = null;
        }
        sbLIZ.append(strLIZJ);
        C20441214yg.LIZIZ(strLJIILL, C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(guestShowdownContent, this.LIZIZ)) {
            return;
        }
        String strLJIILL2 = LJIILL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateContreturnent after comparing, source=");
        sbLIZ2.append(str);
        sbLIZ2.append(" content=");
        if (guestShowdownContent != null) {
            strLIZJ2 = C1516000pYM.LIZJ(guestShowdownContent);
        }
        sbLIZ2.append(strLIZJ2);
        C20441214yg.LIZIZ(strLJIILL2, C2188811AlT.LIZIZ(sbLIZ2));
        GuestShowdownContent guestShowdownContent2 = this.LIZIZ;
        if (guestShowdownContent2 != null) {
            i = guestShowdownContent2.playStatus;
        } else {
            i = 0;
        }
        if (guestShowdownContent != null) {
            i2 = guestShowdownContent.playStatus;
        } else {
            i2 = 0;
        }
        if (i == 4 && i2 == 1) {
            C20441214yg.LIZIZ(LJIILL(), "checkIsStartAgain: start again");
            this.LJIIJJI.clear();
            this.LJIILJJIL = 0L;
            this.LJIILL = 0L;
            DataChannel dataChannel2 = this.LIZ;
            if (dataChannel2 != null) {
                dataChannel2.FQ2(GuestShowdownReStartEvent.class);
            }
        } else if (i2 == 1 && C930540aK4.LIZJ() && (dataChannel = this.LIZ) != null) {
            dataChannel.FQ2(GuestShowdownFirstStartEvent.class);
        }
        this.LIZIZ = guestShowdownContent;
        if (guestShowdownContent != null && (guestShowdownConfig = guestShowdownContent.playConfig) != null && guestShowdownConfig.winnerNum == 3) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        this.LJIILLIIL = i3;
        Object value = this.LJIJI.getValue();
        if (guestShowdownContent != null) {
            i4 = guestShowdownContent.playStatus;
        } else {
            i4 = 0;
        }
        value.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("game_status", i4);
        C389001fE.LIZ("guest_showdown_game_status_change", jSONObject, System.currentTimeMillis(), false);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("sendGuestShowdownStatusEvent, params: ");
        sbLIZ3.append(jSONObject);
        C20441214yg.LJIIIZ("GuestShowdownJsbEventHelper", C2188811AlT.LIZIZ(sbLIZ3));
        Iterator<C01I7> it2 = this.LJIIIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(this.LIZIZ);
        }
        if (!Intrinsics.LJFF(str, "parse_sei") && LJIILJJIL() != 5 && LJIILJJIL() != 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            GuestShowdownContent guestShowdownContent3 = this.LIZIZ;
            if (guestShowdownContent3 != null && (list = guestShowdownContent3.runningPlayUsers) != null && (listLJLLLL = C13LP.LJLLLL(new C512401z8(49), list)) != null) {
                for (GuestShowdownUser guestShowdownUser : listLJLLLL) {
                    arrayList4.add(new Pair(Long.valueOf(guestShowdownUser.userId), Integer.valueOf(guestShowdownUser.userTag)));
                    LJIJJLI(guestShowdownUser.userId, guestShowdownUser.score, str);
                    int i5 = guestShowdownUser.userTag;
                    if (i5 != 2) {
                        if (i5 == 3) {
                            arrayList2.add(Long.valueOf(guestShowdownUser.userId));
                        }
                    } else {
                        arrayList.add(Long.valueOf(guestShowdownUser.userId));
                    }
                    int i6 = guestShowdownUser.rank;
                    if (1 <= i6 && i6 < 4) {
                        arrayList3.add(Long.valueOf(guestShowdownUser.userId));
                    }
                }
            }
            LJIIJ(arrayList4);
            LJIIL(arrayList, arrayList2);
            LJIIJJI(arrayList3);
        }
    }

    @Override // X.InterfaceC213200ry
    public void LJII(GuestShowdownContent guestShowdownContent, int i, GuestShowdownConfigChange guestShowdownConfigChange) {
        DataChannel dataChannel;
        LJIILLIIL(guestShowdownContent, i, true, "");
        if (i != 2) {
            if (i != 8) {
                C20441214yg.LIZIZ(LJIILL(), "onClosedMessageReceived else");
                LJIIIIZZ(guestShowdownContent, "onClosedMessageReceived");
            } else {
                if (guestShowdownContent != null && (dataChannel = this.LIZ) != null) {
                    dataChannel.LC0(GuestShowdownShowEndDialogDirectlyEvent.class, guestShowdownContent);
                }
                C20441214yg.LIZIZ(LJIILL(), "onClosedMessageReceived play_exclusive");
            }
            DataChannel dataChannel2 = this.LIZ;
            if (dataChannel2 != null) {
                dataChannel2.LC0(GuestShowdownOnClosedMessageReceivedEvent.class, Integer.valueOf(i));
                return;
            }
            return;
        }
        C20441214yg.LIZIZ(LJIILL(), "onClosedMessageReceived last play closed message when start again");
    }

    public final void LJIJJLI(long j, long j2, String str) {
        long jLongValue;
        Long l = this.LJIIJJI.get(Long.valueOf(j));
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        String strLJIILL = LJIILL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateScore userId=");
        sbLIZ.append(j);
        sbLIZ.append(" matchTotalScore=");
        sbLIZ.append(j2);
        sbLIZ.append(" previousScore=");
        sbLIZ.append(jLongValue);
        sbLIZ.append(" source=");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ(strLJIILL, C2188811AlT.LIZIZ(sbLIZ));
        this.LJIIJJI.put(Long.valueOf(j), Long.valueOf(j2));
        C500260Jjc.LJJLIIIJJIZ(new C01I6(this, j, j2));
    }
}
