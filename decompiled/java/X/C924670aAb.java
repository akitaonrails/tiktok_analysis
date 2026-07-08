package X;

import android.os.SystemClock;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.dataChannel.PIPStatusData;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.MultiGuestLayoutExtra;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: renamed from: X.0aAb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924670aAb {
    public static volatile long LJIIJJI;
    public static volatile long LJIIL;
    public static final /* synthetic */ int LJIILIIL = 0;
    public final Room LIZ;
    public final DataChannel LIZIZ;
    public final InterfaceC937900aVw LIZJ;
    public final InterfaceC917640ZzG LIZLLL;
    public final C924710aAf LJ;
    public final C924680aAc LJFF;
    public final C924720aAg LJI;
    public int LJII;
    public String LJIIIIZZ;
    public Map<String, String> LJIIIZ;
    public boolean LJIIJ;

    public final void LIZ() {
        AbstractC928510aGn abstractC928510aGnLIZ;
        C924730aAh.LIZ("end");
        int iLIZJ = 0;
        if (C924660aAa.LJFF == 0) {
            C924730aAh.LIZ("end return as isAudienceLayoutWatchNotStarting");
            return;
        }
        InterfaceC917640ZzG interfaceC917640ZzG = this.LIZLLL;
        if (interfaceC917640ZzG != null && (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) != null) {
            iLIZJ = C921170a4x.LIZJ(abstractC928510aGnLIZ);
        }
        C924660aAa.LIZJ(iLIZJ, this.LJIIIZ, this.LIZ);
    }

    public final void LIZIZ() {
        C924730aAh.LIZ("onDestroy");
        LIZ();
        C940770aaZ.LIZ().LJJ(this.LJFF);
        InterfaceC937900aVw interfaceC937900aVw = this.LIZJ;
        if (interfaceC937900aVw != null) {
            interfaceC937900aVw.LJLJLJ(this.LJ);
        }
        InterfaceC917640ZzG interfaceC917640ZzG = this.LIZLLL;
        if (interfaceC917640ZzG != null) {
            interfaceC917640ZzG.LJJIIJ(this.LJI);
        }
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    public static void LIZJ(C924670aAb c924670aAb) {
        AbstractC928510aGn abstractC928510aGnLIZ;
        C924730aAh.LIZ("start");
        int iLIZJ = 0;
        if (C924660aAa.LJFF != 0) {
            C924730aAh.LIZ("start return as isAudienceLayoutWatchStarting");
            return;
        }
        C915980Zwa.LJIIIIZZ();
        if (C921180a4y.LJII()) {
            C924730aAh.LIZIZ(SystemClock.uptimeMillis());
        }
        InterfaceC917640ZzG interfaceC917640ZzG = c924670aAb.LIZLLL;
        if (interfaceC917640ZzG != null && (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) != null) {
            iLIZJ = C921170a4x.LIZJ(abstractC928510aGnLIZ);
        }
        C924660aAa.LIZLLL(iLIZJ);
    }

    public final void LIZLLL(int i) {
        String realDrawLayoutId;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        C915980Zwa.LJIIIIZZ();
        boolean zLJII = C921180a4y.LJII();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update guestCount:");
        sbLIZ.append(i);
        sbLIZ.append(" lastGuestCount:");
        sbLIZ.append(this.LJII);
        sbLIZ.append(" layoutId:");
        InterfaceC937900aVw interfaceC937900aVw = this.LIZJ;
        if (interfaceC937900aVw != null && (interfaceC937820aVoLJJJJZ = interfaceC937900aVw.LJJJJZ()) != null) {
            realDrawLayoutId = interfaceC937820aVoLJJJJZ.getRealDrawLayoutId();
        } else {
            realDrawLayoutId = null;
        }
        sbLIZ.append(realDrawLayoutId);
        sbLIZ.append(" lastLayoutId:");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(" isLinkMic:");
        sbLIZ.append(zLJII);
        sbLIZ.append(" guestLinkDurationStart:");
        sbLIZ.append(LJIIL);
        sbLIZ.append(" guestLinkDurationSum:");
        sbLIZ.append(LJIIJJI);
        C924730aAh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJIIJ != zLJII) {
            this.LJIIJ = zLJII;
            if (zLJII) {
                C924730aAh.LIZIZ(SystemClock.uptimeMillis());
            } else if (LJIIL > 0) {
                long jUptimeMillis = LJIIJJI + (SystemClock.uptimeMillis() - LJIIL);
                LJIIJJI = jUptimeMillis;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("guestLinkDurationSum update:");
                sbLIZ2.append(jUptimeMillis);
                C924730aAh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                C924730aAh.LIZIZ(0L);
            }
        }
        String strLIZJ = C917520Zz4.LIZJ();
        int i2 = this.LJII;
        if (i < 1 ? i2 < 1 : i2 >= 1) {
            if (!(!Intrinsics.LJFF(this.LJIIIIZZ, strLIZJ))) {
                return;
            }
        }
        if (C924660aAa.LJFF != 0) {
            C924660aAa.LIZJ(this.LJII, this.LJIIIZ, this.LIZ);
        }
        this.LJII = i;
        this.LJIIIIZZ = strLIZJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C917650ZzH.LIZIZ(linkedHashMap);
        this.LJIIIZ = linkedHashMap;
        C924660aAa.LIZLLL(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0aAf, X.0b3v] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0a7J, X.0aAg] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0aAc, X.0aaY] */
    public C924670aAb(Room room, DataChannel dataChannel, InterfaceC937900aVw interfaceC937900aVw, InterfaceC917640ZzG interfaceC917640ZzG) {
        this.LIZ = room;
        this.LIZIZ = dataChannel;
        this.LIZJ = interfaceC937900aVw;
        this.LIZLLL = interfaceC917640ZzG;
        ?? r0 = new InterfaceC958970b3v() { // from class: X.0aAf
            @Override // X.InterfaceC958970b3v
            public final void LIZJ(int i, List list) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LJIILL(InterfaceC937840aVq interfaceC937840aVq, EnumC918810a19 enumC918810a19, EnumC918810a19 enumC918810a192, C938510aWv c938510aWv) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LJJIJL(C2180891AWx c2180891AWx) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LJJJI() {
            }

            @Override // X.InterfaceC958970b3v
            public final boolean LJJJIL() {
                return true;
            }

            @Override // X.InterfaceC958970b3v
            public final void LLIIIL(Map map) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLJJJ() {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLJLILLLLZIIL(SeiAppData seiAppData) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLJLLL(List list, boolean z) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLLIIIIL(C2180891AWx c2180891AWx, int i) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLLJ(LinkUser linkUser) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLLLL(InterfaceC937820aVo interfaceC937820aVo) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLIILII(InterfaceC937820aVo interfaceC937820aVo, int i) {
                int iLIZJ;
                AbstractC928510aGn abstractC928510aGnLIZ;
                C924730aAh.LIZ("onLayoutSwitch");
                C924670aAb c924670aAb = this.LL;
                InterfaceC917640ZzG interfaceC917640ZzG2 = c924670aAb.LIZLLL;
                if (interfaceC917640ZzG2 != null && (abstractC928510aGnLIZ = interfaceC917640ZzG2.LIZ()) != null) {
                    iLIZJ = C921170a4x.LIZJ(abstractC928510aGnLIZ);
                } else {
                    iLIZJ = 0;
                }
                c924670aAb.LIZLLL(iLIZJ);
            }
        };
        this.LJ = r0;
        ?? r2 = new InterfaceC940760aaY() { // from class: X.0aAc
            @Override // X.InterfaceC940760aaY
            public final void LJFF(int i, String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJIJI(LayoutState layoutState, List<SpotInfo> list, MultiGuestLayoutExtra multiGuestLayoutExtra) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJI(String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJII(String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIII(List<C957020b0m> list) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIJ(String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIJIIJIL(String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIIJZLJL(C942080acg c942080acg) {
                int iLIZJ;
                AbstractC928510aGn abstractC928510aGnLIZ;
                C924730aAh.LIZ("onLayoutSwitch");
                DataChannel dataChannel2 = this.LIZ.LIZIZ;
                if (dataChannel2 != null) {
                    dataChannel2.SX0(C956730b0J.class, C940770aaZ.LIZ().getDataSource().LJIL());
                }
                C924670aAb c924670aAb = this.LIZ;
                InterfaceC917640ZzG interfaceC917640ZzG2 = c924670aAb.LIZLLL;
                if (interfaceC917640ZzG2 != null && (abstractC928510aGnLIZ = interfaceC917640ZzG2.LIZ()) != null) {
                    iLIZJ = C921170a4x.LIZJ(abstractC928510aGnLIZ);
                } else {
                    iLIZJ = 0;
                }
                c924670aAb.LIZLLL(iLIZJ);
            }
        };
        this.LJFF = r2;
        ?? r1 = new InterfaceC922630a7J() { // from class: X.0aAg
            @Override // X.InterfaceC922630a7J
            public final void Ue(Throwable th) {
            }

            @Override // X.InterfaceC922630a7J
            public final void L2(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, int i) {
                this.LL.LIZLLL(C921170a4x.LIZJ(interfaceC921200a50));
            }

            @Override // X.InterfaceC922630a7J
            public final void rn(InterfaceC921200a50<LinkListUser, LinkMessage> interfaceC921200a50, int i) {
                this.LL.LIZLLL(C921170a4x.LIZJ(interfaceC921200a50));
            }
        };
        this.LJI = r1;
        if (interfaceC937900aVw != 0) {
            interfaceC937900aVw.LJJJJJL(r0);
        }
        C940770aaZ.LIZ().LJIIZILJ(r2);
        if (interfaceC917640ZzG != 0) {
            interfaceC917640ZzG.LJJIJIL(r1);
        }
        if (dataChannel != null) {
            dataChannel.CQ2(PIPStatusData.class, this, new AwS594S0100000_15(this, 322));
        }
    }
}
