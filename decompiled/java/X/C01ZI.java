package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.model.message.FanTicketRoomNoticeContent;
import com.bytedance.android.livesdk.model.message.UserFanTicket;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.TopGuestMetaContent;
import webcast.im.MultiGuestTopGuestMessage;
import webcast.im.TopGuestEndContent;
import webcast.im.TopGuestStartContent;
import webcast.im.TopGuestUserInfo;

/* JADX INFO: renamed from: X.01ZI, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public abstract class C01ZI implements C01ZQ {
    public final C2252321DDq LIZ;
    public final AnonymousClass0951 LIZIZ;
    public final C2252321DDq LIZJ;
    public final AnonymousClass0951 LIZLLL;
    public final C2252321DDq LJ;
    public final AnonymousClass0951 LJFF;
    public final C2252331DDr LJI;
    public final AnonymousClass0950 LJII;
    public volatile TopGuestMetaContent LJIIIIZZ;
    public final ConcurrentHashMap<Long, Long> LJIIIZ;
    public final ConcurrentHashMap<Long, Integer> LJIIJ;
    public final C01ZP LJIIJJI;
    public final C01GW LJIIL;
    public FanTicketRoomNoticeContent LJIILIIL;
    public String LJIILJJIL;
    public final C01GW LJIILL;
    public final Object LJIILLIIL;
    public final C054G LJIIZILJ;
    public boolean LJIJ;
    public Boolean LJIJI;

    public abstract String LJFF();

    public abstract C01ZL LJI();

    public void LIZLLL() {
        IMessageManager iMessageManager;
        C01ZP c01zp = this.LJIIJJI;
        DataChannel dataChannel = c01zp.LIZ;
        if (dataChannel == null || (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) == null) {
            return;
        }
        iMessageManager.addStickyMessageListener(C001A.LINK_MIC_FAN_TICKET_METHOD.getIntType(), (OnIMMessageListener) c01zp.LIZJ);
        iMessageManager.addStickyMessageListener(C001A.MULTI_GUEST_TOP_GUEST_MESSAGE.getIntType(), (OnIMMessageListener) c01zp.LIZJ);
    }

    public final void LJII() {
        C20441214yg.LIZIZ(LJFF(), "clear");
        this.LJIIIZ.clear();
        this.LJIIJ.clear();
        this.LJIIIIZZ = null;
        this.LJIILIIL = null;
        LJIIJJI(0);
        C1813460xI8.LIZIZ(this.LIZJ, new C5178020a(-1L, 10));
    }

    public void LJIIIIZZ() {
        IMessageManager iMessageManager;
        C20441214yg.LIZIZ(LJFF(), "destroy");
        TopGuestMetaContent topGuestMetaContent = this.LJIIIIZZ;
        if (topGuestMetaContent != null && topGuestMetaContent.topGuestStatus == 1) {
            LJIIJ();
        }
        C01ZP c01zp = this.LJIIJJI;
        c01zp.getClass();
        try {
            DataChannel dataChannel = c01zp.LIZ;
            if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
                iMessageManager.removeMessageListener((OnIMMessageListener) c01zp.LIZJ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJ("TopGuestGamePlayMessageChannel", String.valueOf(e.getMessage()));
        }
        ((C11NJ) this.LJIIL.getValue()).LJ();
        LJII();
        C2296808zG.LIZJ(this.LJIIZILJ, null);
    }

    public final void LJIIJ() {
        MultiGuestDataHolder multiGuestDataHolder;
        C01ZL c01zlLJI = LJI();
        TopGuestMetaContent topGuestMetaContent = this.LJIIIIZZ;
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_DATA_HOLDER");
        c01zlLJI.LIZJ(topGuestMetaContent, (!(objLJIIIZ instanceof MultiGuestDataHolder) || (multiGuestDataHolder = (MultiGuestDataHolder) objLJIIIZ) == null) ? 0 : multiGuestDataHolder.LJJIFFI, this.LJIILJJIL);
        LJII();
    }

    public C01ZI(DataChannel dataChannel) {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(0);
        this.LIZ = c2252321DDqLIZ;
        this.LIZIZ = C09IC.LIZIZ(c2252321DDqLIZ);
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(-1L);
        this.LIZJ = c2252321DDqLIZ2;
        this.LIZLLL = C09IC.LIZIZ(c2252321DDqLIZ2);
        C2252321DDq c2252321DDqLIZ3 = C1BNE.LIZ(Boolean.FALSE);
        this.LJ = c2252321DDqLIZ3;
        this.LJFF = C09IC.LIZIZ(c2252321DDqLIZ3);
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 7);
        this.LJI = c2252331DDrLIZIZ;
        this.LJII = C09IC.LIZ(c2252331DDrLIZIZ);
        this.LJIIIZ = new ConcurrentHashMap<>();
        this.LJIIJ = new ConcurrentHashMap<>();
        this.LJIIJJI = new C01ZP(dataChannel, this);
        this.LJIIL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(432));
        this.LJIILJJIL = "live_end";
        this.LJIILL = C452501pT.LIZIZ(new C5182020e(this, 475));
        this.LJIILLIIL = new Object();
        this.LJIIZILJ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZ));
    }

    @Override // X.C01ZQ
    public void LIZ(FanTicketRoomNoticeContent fanTicketRoomNoticeContent) {
        long j;
        long j2 = fanTicketRoomNoticeContent.version;
        FanTicketRoomNoticeContent fanTicketRoomNoticeContent2 = this.LJIILIIL;
        if (fanTicketRoomNoticeContent2 != null) {
            j = fanTicketRoomNoticeContent2.version;
        } else {
            j = 0;
        }
        if (j2 < j) {
            return;
        }
        this.LJIILIIL = fanTicketRoomNoticeContent;
        List<UserFanTicket> list = fanTicketRoomNoticeContent.userFanTicket;
        synchronized (this.LJIILLIIL) {
            try {
                boolean z = false;
                for (UserFanTicket userFanTicket : list) {
                    LJIILIIL(userFanTicket.topGuestRank, userFanTicket.userId, userFanTicket.fanTicket);
                    if (userFanTicket.topGuestRank == 1) {
                        C1813460xI8.LIZIZ(this.LIZJ, new C5178020a(userFanTicket.userId, 10));
                        z = true;
                    }
                }
                if (!z) {
                    C1813460xI8.LIZIZ(this.LIZJ, new C5178020a(-1L, 10));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (this.LJIJ) {
            LJI().LIZLLL(this.LJIIIIZZ, "anchor start game");
            this.LJIJ = false;
        }
    }

    @Override // X.C01ZQ
    public final void LIZIZ(MultiGuestTopGuestMessage multiGuestTopGuestMessage) {
        String str;
        Integer numValueOf;
        List<TopGuestUserInfo> list;
        synchronized (this.LJIILLIIL) {
            try {
                TopGuestEndContent topGuestEndContent = multiGuestTopGuestMessage.topGuestEndContent;
                if (topGuestEndContent != null && (list = topGuestEndContent.topGuestUserInfo) != null) {
                    for (TopGuestUserInfo topGuestUserInfo : list) {
                        LJIILIIL((int) topGuestUserInfo.rank, topGuestUserInfo.userId, topGuestUserInfo.fanTicket);
                    }
                }
                TopGuestEndContent topGuestEndContent2 = multiGuestTopGuestMessage.topGuestEndContent;
                if (topGuestEndContent2 == null || (numValueOf = Integer.valueOf((int) topGuestEndContent2.endReason)) == null || numValueOf.intValue() == 0) {
                    str = "other";
                } else if (numValueOf.intValue() == 1) {
                    str = "host_close";
                } else if (numValueOf.intValue() == 2) {
                    str = "switch_cohost";
                } else {
                    str = "other";
                }
                this.LJIILJJIL = str;
                LJIIL(multiGuestTopGuestMessage.metaContent, "onEndMessageReceived");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C01ZQ
    public final void LIZJ(MultiGuestTopGuestMessage multiGuestTopGuestMessage) {
        TopGuestStartContent topGuestStartContent;
        List<TopGuestUserInfo> list;
        InterfaceC954180awC interfaceC954180awCUU1 = C915980Zwa.LJIIIIZZ().UU1();
        if (interfaceC954180awCUU1 != null && interfaceC954180awCUU1.A0()) {
            Boolean bool = this.LJIJI;
            Boolean bool2 = Boolean.FALSE;
            if (!Intrinsics.LJFF(bool, bool2)) {
                if (this.LJIILIIL == null) {
                    this.LJIJ = true;
                }
                LJIIL(multiGuestTopGuestMessage.metaContent, "onStartMessageReceived");
                this.LJIJI = bool2;
                return;
            }
        }
        synchronized (this.LJIILLIIL) {
            try {
                if ((C950220apo.LJI() || LJI().LJ) && (topGuestStartContent = multiGuestTopGuestMessage.topGuestStartContent) != null && (list = topGuestStartContent.topGuestUserInfo) != null) {
                    for (TopGuestUserInfo topGuestUserInfo : list) {
                        LJIILIIL((int) topGuestUserInfo.rank, topGuestUserInfo.userId, topGuestUserInfo.fanTicket);
                    }
                }
                LJIIL(multiGuestTopGuestMessage.metaContent, "onStartMessageReceived");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIJJI(int i) {
        C1813460xI8.LIZIZ(this.LIZ, new C020M(i, 4));
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    LJIIJ();
                    return;
                }
                return;
            }
            if (!this.LJIJ) {
                LJI().LIZLLL(this.LJIIIIZZ, "anchor start game");
            }
            LinkMicAbilityManager.LJIIIZ.getClass();
            InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
            if (interfaceC941720ac6LIZIZ != null) {
                interfaceC941720ac6LIZIZ.LJIL(C01EL.START, "top_guests");
            }
            InterfaceC941720ac6 interfaceC941720ac6LIZIZ2 = C941700ac4.LIZIZ();
            if (interfaceC941720ac6LIZIZ2 == null) {
                return;
            }
            interfaceC941720ac6LIZIZ2.LIZ((C351401Ya) this.LJIILL.getValue());
            return;
        }
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ3 = C941700ac4.LIZIZ();
        if (interfaceC941720ac6LIZIZ3 != null) {
            interfaceC941720ac6LIZIZ3.LJIIJJI((C351401Ya) this.LJIILL.getValue());
        }
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ4 = C941700ac4.LIZIZ();
        if (interfaceC941720ac6LIZIZ4 != null) {
            interfaceC941720ac6LIZIZ4.LJIL(C01EL.END, "top_guests");
        }
        C01ZL c01zlLJI = LJI();
        c01zlLJI.LIZ = 0L;
        c01zlLJI.LIZIZ = 0L;
        c01zlLJI.LIZJ = "";
        c01zlLJI.LIZLLL = 0L;
        c01zlLJI.LJFF = 1;
    }

    public final void LJ(C01EL c01el, String str) {
        if (c01el == C01EL.START) {
            LJIIIZ(str, true);
        } else {
            if (c01el != C01EL.END) {
                return;
            }
            LJIIIZ(str, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(java.lang.String r10, boolean r11) {
        /*
            r9 = this;
            long r4 = java.lang.System.currentTimeMillis()
            r1 = 1
            if (r11 != r1) goto L30
            X.0951 r0 = r9.LJFF
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L79
            X.01ZL r1 = r9.LJI()
            r1.LIZJ = r10
            boolean r0 = r1.LIZIZ()
            if (r0 == 0) goto L23
            r1.LIZ = r4
        L23:
            X.1DDq r2 = r9.LJ
            X.020N r1 = new X.020N
            r0 = 10
            r1.<init>(r11, r0)
            X.C1813460xI8.LIZIZ(r2, r1)
        L2f:
            return
        L30:
            if (r11 == r1) goto L79
            if (r11 != 0) goto L23
            X.0951 r0 = r9.LJFF
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != r1) goto L60
            X.01ZL r6 = r9.LJI()
            boolean r0 = r6.LIZIZ()
            if (r0 == 0) goto L60
            java.lang.String r0 = r6.LIZJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r10, r0)
            if (r0 == 0) goto L60
            long r2 = r6.LIZIZ
            long r0 = r6.LIZ
            long r4 = r4 - r0
            long r2 = r2 + r4
            r6.LIZIZ = r2
            r0 = 0
            r6.LIZ = r0
        L60:
            X.01ZL r0 = r9.LJI()
            java.lang.String r0 = r0.LIZJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r10, r0)
            if (r0 == 0) goto L2f
            X.1DDq r2 = r9.LJ
            X.020N r1 = new X.020N
            r0 = 11
            r1.<init>(r11, r0)
            X.C1813460xI8.LIZIZ(r2, r1)
            return
        L79:
            X.0951 r0 = r9.LJFF
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != r1) goto L23
            X.01ZL r8 = r9.LJI()
            r8.LIZJ = r10
            boolean r0 = r8.LIZIZ()
            if (r0 == 0) goto L23
            long r6 = r8.LIZIZ
            long r2 = r8.LIZ
            long r0 = r4 - r2
            long r6 = r6 + r0
            r8.LIZIZ = r6
            r8.LIZ = r4
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01ZI.LJIIIZ(java.lang.String, boolean):void");
    }

    public final void LJIIL(TopGuestMetaContent topGuestMetaContent, String str) {
        long j;
        boolean z;
        boolean z2;
        TopGuestMetaContent topGuestMetaContent2;
        String strLJFF = LJFF();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateTopGuestGamePlayContent, source: ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ(strLJFF, C2188811AlT.LIZIZ(sbLIZ));
        if (topGuestMetaContent != null) {
            long j2 = topGuestMetaContent.version;
            TopGuestMetaContent topGuestMetaContent3 = this.LJIIIIZZ;
            if (topGuestMetaContent3 != null) {
                j = topGuestMetaContent3.version;
            } else {
                j = 0;
            }
            if (j2 >= j) {
                int i = topGuestMetaContent.topGuestStatus;
                boolean z3 = false;
                if (i != 1) {
                    if (i == 2 && ((topGuestMetaContent2 = this.LJIIIIZZ) == null || topGuestMetaContent2.topGuestStatus != 1)) {
                        return;
                    }
                } else {
                    TopGuestMetaContent topGuestMetaContent4 = this.LJIIIIZZ;
                    if (topGuestMetaContent4 != null && topGuestMetaContent4.topGuestStatus == 1) {
                        return;
                    }
                    LinkMicAbilityManager.LJIIIZ.getClass();
                    InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
                    if (interfaceC941720ac6LIZIZ != null && interfaceC941720ac6LIZIZ.LJIIZILJ("count_down_for_all")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    LJIIIZ("count_down_for_all", z);
                    InterfaceC941720ac6 interfaceC941720ac6LIZIZ2 = C941700ac4.LIZIZ();
                    if (interfaceC941720ac6LIZIZ2 != null && interfaceC941720ac6LIZIZ2.LJIIZILJ("live_show")) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    LJIIIZ("live_show", z2);
                    InterfaceC941720ac6 interfaceC941720ac6LIZIZ3 = C941700ac4.LIZIZ();
                    if (interfaceC941720ac6LIZIZ3 != null && interfaceC941720ac6LIZIZ3.LJIIZILJ("guest_showdown")) {
                        z3 = true;
                    }
                    LJIIIZ("guest_showdown", z3);
                }
                this.LJIIIIZZ = topGuestMetaContent;
                LJIIJJI(topGuestMetaContent.topGuestStatus);
            }
        }
    }

    public final void LJIILIIL(int i, long j, long j2) {
        this.LJIIJ.put(Long.valueOf(j), Integer.valueOf(i));
        this.LJIIIZ.put(Long.valueOf(j), Long.valueOf(j2));
    }
}
