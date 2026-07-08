package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multilive.model.AnchorClientList;
import com.bytedance.android.live.liveinteract.multilive.model.ChannelMessage;
import com.bytedance.android.live.liveinteract.multilive.model.GuestClientList;
import com.bytedance.android.live.liveinteract.multilive.model.LinkedUser;
import com.bytedance.android.live.liveinteract.multilive.model.ReportLinkMessageReq;
import com.bytedance.android.live.liveinteract.multilive.model.ReportLinkMessageResp;
import com.bytedance.android.live.liveinteract.multilive.model.WaitUser;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableLinkmicMessageReporterSetting;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a3e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C920360a3e {
    public static final C920360a3e LIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;
    public static long LIZJ;
    public static int LIZLLL;
    public static C11JF LJ;
    public static C11JL LJFF;
    public static final long LJI;
    public static final long LJII;
    public static boolean LJIIIIZZ;
    public static final C304201Fw LJIIIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C920360a3e.class, "multiGuestDataHolder", "getMultiGuestDataHolder()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/common/MultiGuestDataHolder;", 0);
        C13LE.LIZ.getClass();
        LIZIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LIZ = new C920360a3e();
        LIZJ = -1L;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        LJI = room != null ? room.getId() : 0L;
        LJII = UserService.getInstance().user().getCurrentUserId();
        LJIIIZ = new C304201Fw("MULTI_GUEST_DATA_HOLDER");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ() {
        InterfaceC954180awC interfaceC954180awCLLJLL;
        OnLineMicInfo onLineMicInfoLLII;
        MicPositionInfo micPositionInfo;
        Integer numValueOf;
        int iIntValue;
        AbstractC928510aGn abstractC928510aGnLIZ;
        Long lLJIIL;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        LinkPlayerInfo linkPlayerInfoLJIIIZ;
        if (EnableLinkmicMessageReporterSetting.INSTANCE.isReportV1()) {
            LIZJ();
            ReportLinkMessageReq reportLinkMessageReq = new ReportLinkMessageReq(null, null, null, null, null);
            LIZ.getClass();
            reportLinkMessageReq.common = LJ();
            long j = LJI;
            long j2 = LJII;
            reportLinkMessageReq.mySelf = new Player(j, j2);
            reportLinkMessageReq.channelMessage = LIZLLL(1);
            InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
            List<String> listLJZ = interfaceC954180awCLLJLL2 != null ? interfaceC954180awCLLJLL2.LJZ() : null;
            InterfaceC954180awC interfaceC954180awCLLJLL3 = C915980Zwa.LJIIIIZZ().LLJLL();
            InterfaceC958070b2T interfaceC958070b2TLLJJ = interfaceC954180awCLLJLL3 != null ? interfaceC954180awCLLJLL3.LLJJ() : null;
            ArrayList arrayList = new ArrayList();
            Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            InterfaceC302401Fe interfaceC302401Fe = objLJIIIZ instanceof InterfaceC302401Fe ? (InterfaceC302401Fe) objLJIIIZ : null;
            arrayList.add(new WaitUser(j2, (interfaceC302401Fe == null || (abstractC928510aGnLIZ2 = interfaceC302401Fe.LIZ()) == null || (linkPlayerInfoLJIIIZ = C921170a4x.LJIIIZ(abstractC928510aGnLIZ2, j2)) == null) ? null : linkPlayerInfoLJIIIZ.mInteractIdStr));
            if (listLJZ != null) {
                for (String str : listLJZ) {
                    arrayList.add(new WaitUser((interfaceC302401Fe == null || (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) == null || (lLJIIL = C921170a4x.LJIIL(abstractC928510aGnLIZ, str)) == null) ? 0L : lLJIIL.longValue(), str));
                }
            }
            CopyOnWriteArrayList copyOnWriteArrayListLIZIZ = LIZIZ(interfaceC958070b2TLLJJ != null ? interfaceC958070b2TLLJJ.LJJJJL() : null);
            CopyOnWriteArrayList copyOnWriteArrayListLIZIZ2 = LIZIZ(interfaceC958070b2TLLJJ != null ? interfaceC958070b2TLLJJ.Kh() : null);
            CopyOnWriteArrayList<WaitUser> copyOnWriteArrayListLIZIZ3 = LIZIZ(interfaceC958070b2TLLJJ != null ? interfaceC958070b2TLLJJ.LJJJ() : null);
            List<LinkUser> listLIZLLL = interfaceC958070b2TLLJJ != null ? interfaceC958070b2TLLJJ.LIZLLL() : null;
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            if (listLIZLLL != null) {
                for (LinkUser linkUser : listLIZLLL) {
                    String str2 = linkUser.linkMicId;
                    LIZ.getClass();
                    C304201Fw c304201Fw = LJIIIZ;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LIZIZ;
                    MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) c304201Fw.LIZ();
                    int i = !(multiGuestDataHolder != null ? Intrinsics.LJFF(multiGuestDataHolder.LIZLLL(str2), Boolean.FALSE) : 0);
                    MultiGuestDataHolder multiGuestDataHolder2 = (MultiGuestDataHolder) c304201Fw.LIZ();
                    int i2 = !(multiGuestDataHolder2 != null ? Intrinsics.LJFF(multiGuestDataHolder2.LJIILLIIL(str2), Boolean.FALSE) : 0);
                    if (str2 != null && (interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL()) != null && (onLineMicInfoLLII = interfaceC954180awCLLJLL.LLII(str2)) != null && (micPositionInfo = onLineMicInfoLLII.micPositionData) != null && (numValueOf = Integer.valueOf(micPositionInfo.position)) != null && (iIntValue = numValueOf.intValue()) != -1) {
                        Long l = linkUser.userId;
                        copyOnWriteArrayList.add(new LinkedUser(l != null ? l.longValue() : 0L, str2, i, i2, iIntValue));
                    }
                }
            }
            if (!copyOnWriteArrayListLIZIZ3.isEmpty()) {
                for (WaitUser waitUser : copyOnWriteArrayListLIZIZ3) {
                    Iterator it2 = copyOnWriteArrayListLIZIZ.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            if (((WaitUser) next).uid == waitUser.uid) {
                                if (next != null) {
                                    copyOnWriteArrayListLIZIZ.remove(next);
                                }
                            }
                        }
                    }
                }
            }
            reportLinkMessageReq.anchorClientList = new AnchorClientList(arrayList, copyOnWriteArrayListLIZIZ, copyOnWriteArrayListLIZIZ2, copyOnWriteArrayListLIZIZ3, copyOnWriteArrayList, null);
            reportLinkMessageReq.guestClientList = null;
            C20441214yg.LIZIZ("MultiGuestV3ReportUtil", reportLinkMessageReq.toString());
            C480460Ism.LIZ().getClass();
            LJFF = (C11JL) ((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).reportLinkMsg(reportLinkMessageReq).LJFF(new C0UO0()).LJJIIZ(new C09JN() { // from class: X.0T7k
                @Override // X.C09JN
                public final void accept(Object obj) {
                    long j3;
                    Long lValueOf;
                    ReportLinkMessageResp reportLinkMessageResp;
                    ReportLinkMessageResp reportLinkMessageResp2;
                    C1C7U.LIZ("MultiGuestV3ReportUtil@9899.anchorReport$2");
                    BaseResponse baseResponse = (BaseResponse) obj;
                    C920360a3e c920360a3e = C920360a3e.LIZ;
                    if (baseResponse != null && (reportLinkMessageResp2 = (ReportLinkMessageResp) baseResponse.data) != null) {
                        j3 = reportLinkMessageResp2.interval;
                    } else {
                        j3 = 0;
                    }
                    C920360a3e.LIZJ = j3;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Anchor report success: interval is ");
                    if (baseResponse != null && (reportLinkMessageResp = (ReportLinkMessageResp) baseResponse.data) != null) {
                        lValueOf = Long.valueOf(reportLinkMessageResp.interval);
                    } else {
                        lValueOf = null;
                    }
                    sbLIZ.append(lValueOf);
                    C20441214yg.LIZIZ("MultiGuestV3ReportUtil", C2188811AlT.LIZIZ(sbLIZ));
                    long j4 = C920360a3e.LIZJ;
                    if (j4 > 0) {
                        C920360a3e.LJ = (C11JF) C19490011Na.LIZJ(j4, TimeUnit.SECONDS).LJJJLZIJ(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.0T7P
                            @Override // X.C09JN
                            public final void accept(Object obj2) {
                                C1C7U.LIZ("MultiGuestV3ReportUtil@9899.anchorReport$2$1");
                                C920360a3e.LIZ.getClass();
                                C920360a3e.LIZ();
                                C1C7U.LIZIZ("MultiGuestV3ReportUtil@9899.anchorReport$2$1");
                            }
                        }, new C09JN() { // from class: X.00L9
                            @Override // X.C09JN
                            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                                C1C7U.LIZ("MultiGuestV3ReportUtil@9899.anchorReport$2$2");
                                C1C7U.LIZIZ("MultiGuestV3ReportUtil@9899.anchorReport$2$2");
                            }
                        });
                    }
                    C1C7U.LIZIZ("MultiGuestV3ReportUtil@9899.anchorReport$2");
                }
            }, new C09JN() { // from class: X.0T7N
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("MultiGuestV3ReportUtil@9899.anchorReport$3");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Anchor report fail: error msg is ");
                    sbLIZ.append(((Throwable) obj).getMessage());
                    C20441214yg.LIZIZ("MultiGuestV3ReportUtil", C2188811AlT.LIZIZ(sbLIZ));
                    C1C7U.LIZIZ("MultiGuestV3ReportUtil@9899.anchorReport$3");
                }
            });
        }
    }

    public static void LIZJ() {
        if (EnableLinkmicMessageReporterSetting.INSTANCE.isReportV1()) {
            C11JF c11jf = LJ;
            if (c11jf != null) {
                c11jf.dispose();
            } else if (LJFF == null) {
                return;
            }
            C11JL c11jl = LJFF;
            if (c11jl != null) {
                c11jl.dispose();
            }
            LJ = null;
            LJFF = null;
            C20441214yg.LIZIZ("MultiGuestV3ReportUtil", "disPose");
        }
    }

    public static LinkCommon LJ() {
        LinkCommon linkCommon = new LinkCommon(0, 0L, 0L, null, "", "", 0, "");
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        linkCommon.scene = interfaceC954180awCLLJLL != null ? interfaceC954180awCLLJLL.scene() : -1;
        linkCommon.appId = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).appId();
        linkCommon.live_id = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).liveId();
        linkCommon.extraMap = null;
        C931800aM6.LIZ.getClass();
        if (C931800aM6.LIZIZ()) {
            linkCommon.linkmicArchVersion = 1;
            linkCommon.scene = 4;
        }
        return linkCommon;
    }

    public static CopyOnWriteArrayList LIZIZ(List list) {
        long jLongValue;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                LinkUser linkUser = (LinkUser) it2.next();
                Long l = linkUser.userId;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                copyOnWriteArrayList.add(new WaitUser(jLongValue, linkUser.linkMicId));
            }
        }
        return copyOnWriteArrayList;
    }

    public static ChannelMessage LIZLLL(int i) {
        int i2;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        C939230aY5 c939230aY5LJJJLZIJ;
        long jLJIILL = C921180a4y.LJIILL(C915980Zwa.LJIIIIZZ());
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        String strVal = C927600aFK.LJII().getStrVal();
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) != null && (c939230aY5LJJJLZIJ = interfaceC937900aVwLLIIJLIL.LJJJLZIJ()) != null) {
            i2 = c939230aY5LJJJLZIJ.LIZ;
        } else {
            i2 = 0;
        }
        return new ChannelMessage(jLJIILL, i, strVal, i2);
    }

    public static void LJFF(int i) {
        int i2;
        if (!EnableLinkmicMessageReporterSetting.INSTANCE.isReportV1()) {
            return;
        }
        LIZJ();
        LIZLLL = i;
        if (C924790aAn.LIZLLL().LJFF()) {
            i2 = 3;
        } else if (LJIIIIZZ) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        ReportLinkMessageReq reportLinkMessageReq = new ReportLinkMessageReq(null, null, null, null, null);
        LIZ.getClass();
        reportLinkMessageReq.common = LJ();
        long j = LJI;
        long j2 = LJII;
        reportLinkMessageReq.mySelf = new Player(j, j2);
        reportLinkMessageReq.channelMessage = LIZLLL(2);
        reportLinkMessageReq.anchorClientList = null;
        reportLinkMessageReq.guestClientList = new GuestClientList(j2, C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ()), i2, LIZLLL, 0);
        C20441214yg.LIZIZ("MultiGuestV3ReportUtil", reportLinkMessageReq.toString());
        C480460Ism.LIZ().getClass();
        LJFF = (C11JL) ((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).reportLinkMsg(reportLinkMessageReq).LJFF(new C0UO0()).LJJIIZ(new C09JN() { // from class: X.0T7l
            @Override // X.C09JN
            public final void accept(Object obj) {
                long j3;
                Long lValueOf;
                ReportLinkMessageResp reportLinkMessageResp;
                ReportLinkMessageResp reportLinkMessageResp2;
                C1C7U.LIZ("MultiGuestV3ReportUtil@9899.guestReport$2");
                BaseResponse baseResponse = (BaseResponse) obj;
                C920360a3e c920360a3e = C920360a3e.LIZ;
                if (baseResponse != null && (reportLinkMessageResp2 = (ReportLinkMessageResp) baseResponse.data) != null) {
                    j3 = reportLinkMessageResp2.interval;
                } else {
                    j3 = 0;
                }
                C920360a3e.LIZJ = j3;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Guest report success: interval is ");
                if (baseResponse != null && (reportLinkMessageResp = (ReportLinkMessageResp) baseResponse.data) != null) {
                    lValueOf = Long.valueOf(reportLinkMessageResp.interval);
                } else {
                    lValueOf = null;
                }
                sbLIZ.append(lValueOf);
                C20441214yg.LIZIZ("MultiGuestV3ReportUtil", C2188811AlT.LIZIZ(sbLIZ));
                long j4 = C920360a3e.LIZJ;
                if (j4 > 0) {
                    C920360a3e.LJ = (C11JF) C19490011Na.LIZJ(j4, TimeUnit.SECONDS).LJJJLZIJ(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.0T7Q
                        @Override // X.C09JN
                        public final void accept(Object obj2) {
                            C1C7U.LIZ("MultiGuestV3ReportUtil@9899.guestReport$2$1");
                            C920360a3e c920360a3e2 = C920360a3e.LIZ;
                            int i3 = C920360a3e.LIZLLL;
                            c920360a3e2.getClass();
                            C920360a3e.LJFF(i3);
                            C1C7U.LIZIZ("MultiGuestV3ReportUtil@9899.guestReport$2$1");
                        }
                    }, new C09JN() { // from class: X.00LA
                        @Override // X.C09JN
                        public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                            C1C7U.LIZ("MultiGuestV3ReportUtil@9899.guestReport$2$2");
                            C1C7U.LIZIZ("MultiGuestV3ReportUtil@9899.guestReport$2$2");
                        }
                    });
                }
                C1C7U.LIZIZ("MultiGuestV3ReportUtil@9899.guestReport$2");
            }
        }, new C09JN() { // from class: X.0T7O
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("MultiGuestV3ReportUtil@9899.guestReport$3");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Guest report fail: error msg is ");
                sbLIZ.append(((Throwable) obj).getMessage());
                C20441214yg.LIZIZ("MultiGuestV3ReportUtil", C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("MultiGuestV3ReportUtil@9899.guestReport$3");
            }
        });
    }
}
