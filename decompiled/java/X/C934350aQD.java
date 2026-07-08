package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.MulitGuestAudienceShoppingMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS259S0300000_15;

/* JADX INFO: renamed from: X.0aQD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C934350aQD {
    public DataChannel LIZ;
    public final C934440aQM LIZIZ;
    public final C944860ahA LIZJ;
    public final C01GW LIZLLL;
    public final List<Long> LJ;
    public int LJFF;

    public final C934320aQA LIZIZ() {
        return (C934320aQA) this.LIZLLL.getValue();
    }

    public final void LIZJ() {
        DataChannel dataChannel;
        Room room;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("canLinkCrossRoom = ");
        sbLIZ.append(this.LIZJ.LLLIIII);
        sbLIZ.append(" canLinkInRoom = ");
        sbLIZ.append(LIZIZ().LJI());
        C20441214yg.LJIIIZ("FindCrashLog#NewToolbarInteractBehavior#onBundleLoaded", C2188811AlT.LIZIZ(sbLIZ));
        boolean zLJJIIZ = C925150aBN.LJJIIZ(null);
        boolean z = MulitGuestAudienceShoppingMode.isEnabled() && (dataChannel = this.LIZ) != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && C781520UlC.LJIIIIZZ(room);
        DataChannel dataChannel2 = this.LIZ;
        boolean zLJIJI = dataChannel2 != null ? C500260Jjc.LJIJI(dataChannel2) : false;
        if (this.LIZJ.LLLIIII && LIZIZ().LJI()) {
            LJ(0, 17);
            return;
        }
        if (this.LIZJ.LLLIIII && !LIZIZ().LJI()) {
            LJ(0, 1);
            return;
        }
        if (!LIZIZ().LJI() || this.LIZJ.LLLIIII) {
            return;
        }
        if (zLJJIIZ || (z && zLJIJI)) {
            LJ(8, 16);
        } else {
            LJ(0, 16);
        }
    }

    public final void LIZLLL(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setVisibility, visibility=");
        sbLIZ.append(i);
        sbLIZ.append(", type=");
        sbLIZ.append(16);
        sbLIZ.append(", isReservation=");
        sbLIZ.append(true);
        C20441214yg.LJIIIZ("ToolbarInteractDelegate", C2188811AlT.LIZIZ(sbLIZ));
        LIZIZ().LJIJ(i, true);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("set reservationWidget visible: ");
        sbLIZ2.append(i);
        C20441214yg.LIZIZ("ToolbarInteractDelegate", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public C934350aQD(InterfaceC934580aQa interfaceC934580aQa, LifecycleOwner lifecycleOwner) {
        C934440aQM c934440aQM = new C934440aQM();
        this.LIZIZ = c934440aQM;
        this.LIZJ = new C944860ahA(interfaceC934580aQa, lifecycleOwner, c934440aQM);
        this.LIZLLL = C452501pT.LIZIZ(new AwS259S0300000_15(this, interfaceC934580aQa, lifecycleOwner, 56));
        this.LJ = new ArrayList();
    }

    public final void LIZ(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeMultiGuestIconRedNumForApply: ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("ToolbarInteractDelegate", C2188811AlT.LIZIZ(sbLIZ));
        this.LJFF = i2;
        boolean z = false;
        if (i2 + ((ArrayList) this.LJ).size() > 0) {
            LIZIZ().LJJ(false);
            LIZIZ().LJIL(this.LJFF + ((ArrayList) this.LJ).size());
            return;
        }
        LIZIZ().LJIL(0);
        C934320aQA c934320aQALIZIZ = LIZIZ();
        if (i > 0) {
            z = true;
        }
        c934320aQALIZIZ.LJJ(z);
    }

    public final void LJ(int i, int i2) {
        if ((i2 & 1) == 1) {
            this.LIZJ.LJIJJLI(i);
        }
        if ((i2 & 16) == 16) {
            C934320aQA c934320aQALIZIZ = LIZIZ();
            C934450aQN c934450aQN = C934320aQA.LLLILZ;
            c934320aQALIZIZ.LJIJ(i, false);
        }
    }
}
