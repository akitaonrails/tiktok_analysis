package X;

import com.bytedance.android.live.liveinteract.match.business.event.BattleTerminatedEvent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bUs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C975680bUs implements InterfaceC975520bUc {
    public final boolean LIZ;
    public final InterfaceC975710bUv LIZIZ;
    public final DataChannel LIZJ;
    public final InterfaceC975700bUu LIZLLL;
    public boolean LJ;
    public Room LJII;
    public InterfaceC975690bUt<? extends InterfaceC975780bV2> LJIIIIZZ;
    public C975960bVK LJIIIZ;
    public EnumC964170bCJ LJIIJJI;
    public final String LJFF = UUID.randomUUID().toString();
    public EnumC919170a1j LJI = EnumC919170a1j.UNKNOWN;
    public List<C975960bVK> LJIIJ = new ArrayList();

    @Override // X.InterfaceC975520bUc
    public final void LJ() {
        InterfaceC975690bUt<? extends InterfaceC975780bV2> interfaceC975690bUt = this.LJIIIIZZ;
        if (interfaceC975690bUt != null) {
            interfaceC975690bUt.LJ();
        }
    }

    @Override // X.InterfaceC975520bUc
    public final void d1() {
        InterfaceC975690bUt<? extends InterfaceC975780bV2> interfaceC975690bUt = this.LJIIIIZZ;
        if (interfaceC975690bUt != null) {
            interfaceC975690bUt.d1();
        }
    }

    @Override // X.InterfaceC975520bUc
    public final void j3() {
        InterfaceC975690bUt<? extends InterfaceC975780bV2> interfaceC975690bUt = this.LJIIIIZZ;
        if (interfaceC975690bUt != null) {
            interfaceC975690bUt.j3();
        }
    }

    @Override // X.InterfaceC975520bUc
    public final boolean n3() {
        InterfaceC975690bUt<? extends InterfaceC975780bV2> interfaceC975690bUt = this.LJIIIIZZ;
        if (interfaceC975690bUt != null) {
            return interfaceC975690bUt.LJIIIZ();
        }
        return false;
    }

    @Override // X.InterfaceC975520bUc
    public final EnumC919170a1j LJIIIZ() {
        return this.LJI;
    }

    @Override // X.InterfaceC975520bUc
    public final EnumC964170bCJ Y2() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC975520bUc
    public final InterfaceC975710bUv a3() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC975520bUc
    public final boolean d3() {
        return this.LJ;
    }

    @Override // X.InterfaceC975520bUc
    public final DataChannel getDataChannel() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC975520bUc
    public final InterfaceC975700bUu getDelegate() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC975520bUc
    public final Room getRoomInfo() {
        return this.LJII;
    }

    @Override // X.InterfaceC975520bUc
    public final String getUniqueId() {
        return this.LJFF;
    }

    @Override // X.InterfaceC975520bUc
    public final boolean isAnchor() {
        return this.LIZ;
    }

    @Override // X.InterfaceC975520bUc
    public final C975960bVK m3() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC975520bUc
    public final List<C975960bVK> p3() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC975520bUc
    public final void H0(C960280b62 c960280b62) {
        EnumC964170bCJ status;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveMatchEngine onCancelAutoMatchEvent, scene: ");
        sbLIZ.append(c960280b62.LIZ);
        sbLIZ.append(", matchState = ");
        InterfaceC975690bUt<? extends InterfaceC975780bV2> interfaceC975690bUt = this.LJIIIIZZ;
        if (interfaceC975690bUt != null) {
            status = interfaceC975690bUt.getStatus();
        } else {
            status = null;
        }
        sbLIZ.append(status);
        C20441214yg.LIZIZ("LiveMatchEngine", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC975690bUt<? extends InterfaceC975780bV2> interfaceC975690bUt2 = this.LJIIIIZZ;
        if (interfaceC975690bUt2 != null) {
            interfaceC975690bUt2.H0(c960280b62);
        }
    }

    public final void LIZIZ(String str) {
        InterfaceC975700bUu interfaceC975700bUu = this.LIZLLL;
        if (interfaceC975700bUu != null) {
            interfaceC975700bUu.LIZJ();
        }
        InterfaceC975690bUt<? extends InterfaceC975780bV2> interfaceC975690bUt = this.LJIIIIZZ;
        if (interfaceC975690bUt != null) {
            interfaceC975690bUt.LIZLLL(str);
        }
    }

    public final void LIZJ(EnumC919170a1j enumC919170a1j) {
        this.LJI = enumC919170a1j;
        this.LIZIZ.LIZ();
        InterfaceC975700bUu interfaceC975700bUu = this.LIZLLL;
        if (interfaceC975700bUu != null) {
            interfaceC975700bUu.LJFF(this, this.LJI);
        }
    }

    @Override // X.InterfaceC975520bUc
    public final void LJII(long j) {
        DataChannel dataChannel;
        InterfaceC975690bUt<? extends InterfaceC975780bV2> interfaceC975690bUt = this.LJIIIIZZ;
        if (interfaceC975690bUt != null) {
            interfaceC975690bUt.LJII(j);
        }
        if (j != 201 && (dataChannel = this.LIZJ) != null) {
            dataChannel.LC0(BattleTerminatedEvent.class, Long.valueOf(j));
        }
    }

    @Override // X.InterfaceC975520bUc
    public final void X2(C974180bSS c974180bSS) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveMatchEngine onAutoMatchEvent, scene: ");
        sbLIZ.append(c974180bSS.LIZ);
        C20441214yg.LIZIZ("LiveMatchEngine", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC975690bUt<? extends InterfaceC975780bV2> interfaceC975690bUt = this.LJIIIIZZ;
        if (interfaceC975690bUt != null) {
            interfaceC975690bUt.X2(c974180bSS);
        }
    }

    @Override // X.InterfaceC975520bUc
    public final void b3(Function0<Unit> function0) {
        InterfaceC975690bUt<? extends InterfaceC975780bV2> interfaceC975690bUt = this.LJIIIIZZ;
        if (interfaceC975690bUt != null) {
            interfaceC975690bUt.b3(function0);
        }
    }

    @Override // X.InterfaceC975520bUc
    public final void c3(boolean z) {
        this.LJ = z;
    }

    @Override // X.InterfaceC975520bUc
    public final void e3(C975600bUk c975600bUk) {
        InterfaceC975690bUt<? extends InterfaceC975780bV2> interfaceC975690bUt = this.LJIIIIZZ;
        if (interfaceC975690bUt != null) {
            interfaceC975690bUt.e3(c975600bUk);
        }
    }

    @Override // X.InterfaceC975520bUc
    public final void g3(C975960bVK c975960bVK) {
        EnumC919170a1j enumC919170a1j;
        this.LJIIIZ = c975960bVK;
        if (c975960bVK == null || (enumC919170a1j = c975960bVK.LIZLLL) == null) {
            enumC919170a1j = EnumC919170a1j.UNKNOWN;
        }
        LIZJ(enumC919170a1j);
    }

    @Override // X.InterfaceC975520bUc
    public final void h3(String str) {
        InterfaceC975690bUt<? extends InterfaceC975780bV2> interfaceC975690bUt = this.LJIIIIZZ;
        if (interfaceC975690bUt != null) {
            interfaceC975690bUt.h3(str);
        }
    }

    @Override // X.InterfaceC975520bUc
    public final void i3(C974230bSX c974230bSX) {
        InterfaceC975690bUt<? extends InterfaceC975780bV2> interfaceC975690bUt = this.LJIIIIZZ;
        if (interfaceC975690bUt != null) {
            interfaceC975690bUt.i3(c974230bSX);
        }
    }

    @Override // X.InterfaceC975520bUc
    public final void k3(EnumC919170a1j enumC919170a1j) {
        LIZJ(enumC919170a1j);
    }

    @Override // X.InterfaceC975520bUc
    public final void l3(Room room) {
        C20441214yg.LIZIZ("LiveMatchEngine", "onMatchProcessStart room");
        this.LJII = room;
    }

    @Override // X.InterfaceC975520bUc
    public final void q3(AbstractC1136060ffY abstractC1136060ffY) {
        InterfaceC975690bUt<? extends InterfaceC975780bV2> interfaceC975690bUt = this.LJIIIIZZ;
        if (interfaceC975690bUt != null) {
            interfaceC975690bUt.LIZ(abstractC1136060ffY);
        }
    }

    @Override // X.InterfaceC975520bUc
    public final void LIZ(EnumC962960bAM enumC962960bAM, String str) {
        InterfaceC975700bUu interfaceC975700bUu = this.LIZLLL;
        if (interfaceC975700bUu != null) {
            interfaceC975700bUu.LIZ(enumC962960bAM, str);
        }
    }

    @Override // X.InterfaceC975520bUc
    public final void LJFF(long j, String str) {
        long j2;
        InterfaceC975690bUt<? extends InterfaceC975780bV2> interfaceC975690bUt;
        List<C954460awe> list;
        if (C948770anT.LIZ() && C970370bMJ.LIZLLL()) {
            C975960bVK c975960bVK = this.LJIIIZ;
            if (c975960bVK != null && (list = c975960bVK.LJJJLL) != null) {
                j2 = 0;
                for (C954460awe c954460awe : list) {
                    if (Intrinsics.LJFF(c954460awe.LJIIJJI, str)) {
                        j2 = c954460awe.LJ;
                    }
                }
            } else {
                j2 = 0;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onUserLeft: leftUid ");
            sbLIZ.append(j2);
            sbLIZ.append(", linkMicId ");
            sbLIZ.append(str);
            C20441214yg.LJIIIZ("LiveMatchEngine", C2188811AlT.LIZIZ(sbLIZ));
            if (j2 != 0 && (interfaceC975690bUt = this.LJIIIIZZ) != null) {
                interfaceC975690bUt.LJFF(j, str);
                return;
            }
            return;
        }
        InterfaceC975690bUt<? extends InterfaceC975780bV2> interfaceC975690bUt2 = this.LJIIIIZZ;
        if (interfaceC975690bUt2 != null) {
            interfaceC975690bUt2.LJFF(j, str);
        }
    }

    @Override // X.InterfaceC975520bUc
    public final void f3(int i, boolean z) {
        InterfaceC975690bUt<? extends InterfaceC975780bV2> interfaceC975690bUt = this.LJIIIIZZ;
        if (interfaceC975690bUt != null) {
            interfaceC975690bUt.f3(i, z);
        }
    }

    @Override // X.InterfaceC975520bUc
    public final boolean o3(BattleInfoResponse battleInfoResponse, EnumC970440bMQ enumC970440bMQ) {
        InterfaceC975690bUt<? extends InterfaceC975780bV2> interfaceC975690bUt = this.LJIIIIZZ;
        if (interfaceC975690bUt != null) {
            return interfaceC975690bUt.LIZIZ(battleInfoResponse);
        }
        return true;
    }

    @Override // X.InterfaceC975520bUc
    public final void LJIIIIZZ(int i, int i2, AbnormalDisconnectReason abnormalDisconnectReason) {
        InterfaceC975690bUt<? extends InterfaceC975780bV2> interfaceC975690bUt = this.LJIIIIZZ;
        if (interfaceC975690bUt != null) {
            interfaceC975690bUt.LJIIIIZZ(i, i2, abnormalDisconnectReason);
        }
    }

    @Override // X.InterfaceC975520bUc
    public final void Z2(List<C954460awe> list, List<C954460awe> list2, CustomLinkMessage customLinkMessage) {
        InterfaceC975690bUt<? extends InterfaceC975780bV2> interfaceC975690bUt = this.LJIIIIZZ;
        if (interfaceC975690bUt != null) {
            interfaceC975690bUt.LJIIL(list, list2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC975520bUc
    public final boolean r3(EnumC964170bCJ enumC964170bCJ, EnumC975850bV9 enumC975850bV9, LinkMicBattleMessage linkMicBattleMessage, BattleInfoResponse battleInfoResponse) {
        EnumC964170bCJ status;
        EnumC964170bCJ status2;
        InterfaceC975700bUu interfaceC975700bUu;
        EnumC964170bCJ status3;
        boolean z = false;
        EnumC964170bCJ status4 = null;
        if (this.LJ) {
            InterfaceC975690bUt<? extends InterfaceC975780bV2> interfaceC975690bUt = this.LJIIIIZZ;
            if (interfaceC975690bUt == null || (status3 = interfaceC975690bUt.getStatus()) == null) {
                status3 = EnumC964170bCJ.NONE;
            }
            if (status3.compareTo(EnumC964170bCJ.MATCH_START) > 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("rematch status = ");
                InterfaceC975690bUt<? extends InterfaceC975780bV2> interfaceC975690bUt2 = this.LJIIIIZZ;
                if (interfaceC975690bUt2 != null) {
                    status4 = interfaceC975690bUt2.getStatus();
                }
                sbLIZ.append(status4);
                sbLIZ.append(" , Rematch Engine can't goes after START");
                C20441214yg.LJ("LiveMatchEngine", C2188811AlT.LIZIZ(sbLIZ));
                return false;
            }
        }
        InterfaceC975690bUt<? extends InterfaceC975780bV2> interfaceC975690bUt3 = this.LJIIIIZZ;
        if (interfaceC975690bUt3 != null) {
            status = interfaceC975690bUt3.getStatus();
        } else {
            status = null;
        }
        if (status == enumC964170bCJ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("same status and toStatus = ");
            sbLIZ2.append(enumC964170bCJ);
            sbLIZ2.append(" currentIsRematch = ");
            sbLIZ2.append(this.LJ);
            C20441214yg.LJ("LiveMatchEngine", C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
        InterfaceC975690bUt<? extends InterfaceC975780bV2> interfaceC975690bUt4 = this.LJIIIIZZ;
        if (interfaceC975690bUt4 == null || (status2 = interfaceC975690bUt4.getStatus()) == null) {
            status2 = EnumC964170bCJ.NONE;
        }
        if (C20489615Fm.LIZ(status2, enumC964170bCJ)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("can't transit from ");
            InterfaceC975690bUt<? extends InterfaceC975780bV2> interfaceC975690bUt5 = this.LJIIIIZZ;
            if (interfaceC975690bUt5 != null) {
                status4 = interfaceC975690bUt5.getStatus();
            }
            sbLIZ3.append(status4);
            sbLIZ3.append(" to ");
            sbLIZ3.append(enumC964170bCJ);
            C20441214yg.LJ("LiveMatchEngine", C2188811AlT.LIZIZ(sbLIZ3));
            return false;
        }
        C975800bV4 c975800bV4LIZJ = this.LIZIZ.LIZJ(this, enumC964170bCJ, linkMicBattleMessage, battleInfoResponse, enumC975850bV9);
        C0UVC.LIZJ("LiveMatchEngine");
        C0UVC.LIZLLL = "updateState";
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("state = ");
        sbLIZ4.append(c975800bV4LIZJ);
        sbLIZ4.append(" fromSource = ");
        sbLIZ4.append(enumC975850bV9);
        sbLIZ4.append(" isRematch = ");
        sbLIZ4.append(this.LJ);
        C0UVC.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("Engine Match state will Leave from ");
        sbLIZ5.append(enumC975850bV9);
        sbLIZ5.append(" isRematch = ");
        sbLIZ5.append(this.LJ);
        C20441214yg.LJ("LiveMatchEngine", C2188811AlT.LIZIZ(sbLIZ5));
        InterfaceC975690bUt<? extends InterfaceC975780bV2> interfaceC975690bUt6 = this.LJIIIIZZ;
        if (interfaceC975690bUt6 != null) {
            interfaceC975690bUt6.LJI(enumC975850bV9);
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("Engine Match state will Enter to ");
        sbLIZ6.append(c975800bV4LIZJ.LIZ);
        sbLIZ6.append(" isReamtch = ");
        sbLIZ6.append(this.LJ);
        C20441214yg.LJ("LiveMatchEngine", C2188811AlT.LIZIZ(sbLIZ6));
        InterfaceC975700bUu interfaceC975700bUu2 = this.LIZLLL;
        if (interfaceC975700bUu2 != null) {
            interfaceC975700bUu2.LJI(this, c975800bV4LIZJ.LIZ);
        }
        InterfaceC975690bUt<? extends InterfaceC975780bV2> interfaceC975690bUt7 = this.LJIIIIZZ;
        if (interfaceC975690bUt7 != null) {
            status4 = interfaceC975690bUt7.getStatus();
        }
        this.LJIIIIZZ = c975800bV4LIZJ;
        if (c975800bV4LIZJ instanceof InterfaceC975720bUw) {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("matchModel is null  = ");
            if (this.LJIIIZ == null) {
                z = true;
            }
            sbLIZ7.append(z);
            sbLIZ7.append(" state isRematch = ");
            sbLIZ7.append(this.LJ);
            sbLIZ7.append(" , model = ");
            sbLIZ7.append(this.LJIIIZ);
            C20441214yg.LJ("LiveMatchEngine", C2188811AlT.LIZIZ(sbLIZ7));
            ((InterfaceC975720bUw) c975800bV4LIZJ).g3(this.LJIIIZ);
        }
        this.LJIIJJI = c975800bV4LIZJ.LIZ;
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("Engine Match state before State = ");
        sbLIZ8.append(status4);
        sbLIZ8.append(", Did Enter state ");
        sbLIZ8.append(enumC975850bV9);
        sbLIZ8.append(" After status = ");
        sbLIZ8.append(c975800bV4LIZJ.LIZ);
        sbLIZ8.append(" ,rematch = ");
        sbLIZ8.append(this.LJ);
        C20441214yg.LJ("LiveMatchEngine", C2188811AlT.LIZIZ(sbLIZ8));
        InterfaceC975690bUt<? extends InterfaceC975780bV2> interfaceC975690bUt8 = this.LJIIIIZZ;
        if (interfaceC975690bUt8 != null) {
            interfaceC975690bUt8.LIZJ(enumC975850bV9);
        }
        InterfaceC975700bUu interfaceC975700bUu3 = this.LIZLLL;
        if (interfaceC975700bUu3 != null) {
            interfaceC975700bUu3.LIZLLL(this, c975800bV4LIZJ.LIZ);
        }
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append("DidEnterStatus = ");
        sbLIZ9.append(c975800bV4LIZJ.LIZ);
        sbLIZ9.append(", sourceFrom = ");
        sbLIZ9.append(enumC975850bV9);
        sbLIZ9.append(" ,isRematch = ");
        sbLIZ9.append(this.LJ);
        sbLIZ9.append(' ');
        C20441214yg.LJ("LiveMatchEngine", C2188811AlT.LIZIZ(sbLIZ9));
        if (c975800bV4LIZJ.LIZ == EnumC964170bCJ.NONE && enumC975850bV9 == EnumC975850bV9.MATCH_BACK_TO_OLD_ARCH_TEAM_MATCH && (interfaceC975700bUu = this.LIZLLL) != null) {
            interfaceC975700bUu.LJ();
        }
        return true;
    }

    public C975680bUs(boolean z, InterfaceC975710bUv interfaceC975710bUv, DataChannel dataChannel, InterfaceC975700bUu interfaceC975700bUu, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = interfaceC975710bUv;
        this.LIZJ = dataChannel;
        this.LIZLLL = interfaceC975700bUu;
        this.LJ = z2;
        EnumC964170bCJ enumC964170bCJ = EnumC964170bCJ.NONE;
        this.LJIIJJI = enumC964170bCJ;
        r3(enumC964170bCJ, EnumC975850bV9.INITIALIZE, null, null);
    }
}
