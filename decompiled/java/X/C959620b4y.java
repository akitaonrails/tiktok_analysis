package X;

import com.bytedance.android.livesdk.chatroom.model.interact.BattleGamePlayContent;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.QuickCohostSwitchPoolEnable;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0b4y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C959620b4y implements InterfaceC959730b59 {
    public final Room LIZ;
    public final C959600b4w LIZIZ;
    public final InterfaceC960050b5f LIZJ;
    public final InterfaceC960040b5e LIZLLL;
    public final InterfaceC959930b5T LJ;
    public final DataChannel LJFF;
    public InterfaceC959610b4x<? extends InterfaceC960070b5h> LJII;
    public String LJI = "";
    public EnumC958840b3i LJIIIIZZ = EnumC958840b3i.UNKNOWN;

    @Override // X.InterfaceC959730b59
    public final void LIZLLL() {
        InterfaceC959610b4x<? extends InterfaceC960070b5h> interfaceC959610b4x = this.LJII;
        if (interfaceC959610b4x != null) {
            interfaceC959610b4x.LIZLLL();
        }
        this.LJ.LIZJ();
    }

    @Override // X.InterfaceC959730b59
    public final boolean LJI() {
        return !QuickCohostSwitchPoolEnable.INSTANCE.isTrue();
    }

    @Override // X.InterfaceC959730b59
    public final EnumC958900b3o Y2() {
        EnumC958900b3o status;
        InterfaceC959610b4x<? extends InterfaceC960070b5h> interfaceC959610b4x = this.LJII;
        return (interfaceC959610b4x == null || (status = interfaceC959610b4x.getStatus()) == null) ? EnumC958900b3o.NONE : status;
    }

    @Override // X.InterfaceC959730b59
    public final InterfaceC960040b5e LJIIIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC959730b59
    public final C959600b4w c0() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC959730b59
    public final EnumC958840b3i d0() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC959730b59
    public final DataChannel getDataChannel() {
        return this.LJFF;
    }

    @Override // X.InterfaceC959730b59
    public final InterfaceC959930b5T getDelegate() {
        return this.LJ;
    }

    @Override // X.InterfaceC959730b59
    public final Room getRoomInfo() {
        return this.LIZ;
    }

    @Override // X.InterfaceC959730b59
    public final String getSessionId() {
        return this.LJI;
    }

    @Override // X.InterfaceC959730b59
    public final void LIZ(LinkMessage linkMessage) {
        InterfaceC959610b4x<? extends InterfaceC960070b5h> interfaceC959610b4x = this.LJII;
        if (interfaceC959610b4x != null) {
            interfaceC959610b4x.LIZ(linkMessage);
        }
    }

    @Override // X.InterfaceC959730b59
    public final void LIZIZ(C954640aww c954640aww) {
        InterfaceC959610b4x<? extends InterfaceC960070b5h> interfaceC959610b4x = this.LJII;
        if (interfaceC959610b4x != null) {
            interfaceC959610b4x.LIZIZ(c954640aww);
        }
    }

    public final void LIZJ(EnumC959580b4u enumC959580b4u) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onQuickCoHostTerminated, current status = ");
        sbLIZ.append(Y2());
        sbLIZ.append(" exitType = ");
        sbLIZ.append(enumC959580b4u);
        C20441214yg.LJ("QuickCoHostEngine", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC959610b4x<? extends InterfaceC960070b5h> interfaceC959610b4x = this.LJII;
        if (interfaceC959610b4x != null) {
            interfaceC959610b4x.LJJIFFI(enumC959580b4u);
        }
    }

    @Override // X.InterfaceC959730b59
    public final void LJFF(String str) {
        this.LJI = str;
    }

    @Override // X.InterfaceC959730b59
    public final void LJII(EnumC958840b3i enumC958840b3i) {
        this.LJIIIIZZ = enumC958840b3i;
        C959600b4w c959600b4w = this.LIZIZ;
        if (enumC958840b3i != c959600b4w.LIZIZ) {
            c959600b4w.LIZ(enumC958840b3i);
        }
    }

    @Override // X.InterfaceC959730b59
    public final void LJIIIIZZ(LinkMessage linkMessage) {
        InterfaceC959610b4x<? extends InterfaceC960070b5h> interfaceC959610b4x = this.LJII;
        if (interfaceC959610b4x != null) {
            interfaceC959610b4x.LJIJI();
        }
    }

    @Override // X.InterfaceC959730b59
    public final void LJIIJ(C954640aww c954640aww) {
        InterfaceC959610b4x<? extends InterfaceC960070b5h> interfaceC959610b4x = this.LJII;
        if (interfaceC959610b4x != null) {
            interfaceC959610b4x.LJII();
        }
    }

    @Override // X.InterfaceC959730b59
    public final boolean LJIIJJI(EnumC958900b3o enumC958900b3o, Object obj, EnumC959690b55 enumC959690b55) {
        EnumC958900b3o status;
        EnumC958900b3o status2;
        Boolean boolValueOf;
        EnumC958900b3o status3;
        InterfaceC959610b4x<? extends InterfaceC960070b5h> interfaceC959610b4x = this.LJII;
        if (interfaceC959610b4x == null || (status = interfaceC959610b4x.getStatus()) == null) {
            status = EnumC958900b3o.NONE;
        }
        InterfaceC959610b4x<? extends InterfaceC960070b5h> interfaceC959610b4x2 = this.LJII;
        EnumC958900b3o enumC958900b3o2 = null;
        if (interfaceC959610b4x2 != null) {
            status2 = interfaceC959610b4x2.getStatus();
        } else {
            status2 = null;
        }
        if (status2 == enumC958900b3o) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("transit");
            sbLIZ.append(" return by same status, current status is ");
            sbLIZ.append(status);
            C20441214yg.LJ("QuickCoHostEngine", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        InterfaceC959610b4x<? extends InterfaceC960070b5h> interfaceC959610b4x3 = this.LJII;
        if (interfaceC959610b4x3 != null) {
            boolValueOf = Boolean.valueOf(interfaceC959610b4x3.LJIIJ(enumC958900b3o, enumC959690b55));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIFFI(boolValueOf)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("transit");
            sbLIZ2.append(" cannot transit from ");
            sbLIZ2.append(status);
            sbLIZ2.append(" to ");
            sbLIZ2.append(enumC958900b3o);
            C20441214yg.LJ("QuickCoHostEngine", C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
        AbstractC959650b51 abstractC959650b51LIZ = this.LIZJ.LIZ(enumC958900b3o, this, obj);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("updateState");
        sbLIZ3.append(", current state ");
        InterfaceC959610b4x<? extends InterfaceC960070b5h> interfaceC959610b4x4 = this.LJII;
        if (interfaceC959610b4x4 != null) {
            status3 = interfaceC959610b4x4.getStatus();
        } else {
            status3 = null;
        }
        sbLIZ3.append(status3);
        sbLIZ3.append(" new state ");
        if (abstractC959650b51LIZ != null) {
            enumC958900b3o2 = abstractC959650b51LIZ.LIZJ;
        }
        sbLIZ3.append(enumC958900b3o2);
        sbLIZ3.append(" source ");
        sbLIZ3.append(enumC959690b55);
        C20441214yg.LJIIIZ("QuickCoHostEngine", C2188811AlT.LIZIZ(sbLIZ3));
        InterfaceC959610b4x<? extends InterfaceC960070b5h> interfaceC959610b4x5 = this.LJII;
        if (interfaceC959610b4x5 != null) {
            interfaceC959610b4x5.LJJII(enumC959690b55);
        }
        InterfaceC959930b5T interfaceC959930b5T = this.LJ;
        InterfaceC959610b4x<? extends InterfaceC960070b5h> interfaceC959610b4x6 = this.LJII;
        if (interfaceC959610b4x6 != null) {
            interfaceC959610b4x6.getStatus();
        }
        interfaceC959930b5T.LJ();
        this.LJII = abstractC959650b51LIZ;
        if (abstractC959650b51LIZ != null) {
            abstractC959650b51LIZ.LJIILLIIL();
        }
        this.LJ.LJI(abstractC959650b51LIZ.LIZJ, enumC959690b55);
        return true;
    }

    @Override // X.InterfaceC959730b59
    public final void LJ(Integer num, EnumC959580b4u enumC959580b4u, BattleGamePlayContent battleGamePlayContent, boolean z) {
        InterfaceC959610b4x<? extends InterfaceC960070b5h> interfaceC959610b4x = this.LJII;
        if (interfaceC959610b4x != null) {
            interfaceC959610b4x.LJ(num, enumC959580b4u, battleGamePlayContent, z);
        }
        this.LJ.LIZJ();
    }

    public C959620b4y(Room room, C959600b4w c959600b4w, C959770b5D c959770b5D, C959330b4V c959330b4V, C959590b4v c959590b4v, DataChannel dataChannel) {
        this.LIZ = room;
        this.LIZIZ = c959600b4w;
        this.LIZJ = c959770b5D;
        this.LIZLLL = c959330b4V;
        this.LJ = c959590b4v;
        this.LJFF = dataChannel;
        LJIIJJI(EnumC958900b3o.NONE, null, EnumC959690b55.INITIALIZE);
    }
}
