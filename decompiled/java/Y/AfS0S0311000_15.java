package Y;

import X.C09JN;
import X.C1304660k3U;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C501470JlZ;
import X.C501540Jlg;
import X.C919690a2Z;
import X.C925070aBF;
import X.C925080aBG;
import X.C925090aBH;
import X.C925130aBL;
import X.C925250aBX;
import X.C944240agA;
import X.InterfaceC923600a8s;
import X.InterfaceC923620a8u;
import X.InterfaceC923660a8y;
import android.content.Context;
import com.bytedance.android.live.liveinteract.gamelink.model.EditBirthFailedWithoutConfirm;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AfS0S0311000_15 implements C09JN {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS0S0311000_15 afS0S0311000_15, Object obj) {
        Context context;
        DataChannel dataChannel;
        C1C7U.LIZ("GameLinkPermissionManager@2602.checkPermission$4");
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkIn_Guest_Permission_Failed, throwable:");
        sbLIZ.append(th);
        C20441214yg.LJFF("GameLinkPermissionManager", C2188811AlT.LIZIZ(sbLIZ), null);
        C925070aBF.LIZ = false;
        if (afS0S0311000_15.z3 && (dataChannel = (DataChannel) afS0S0311000_15.l0) != null) {
            dataChannel.FQ2(EditBirthFailedWithoutConfirm.class);
        }
        Function0 function0 = (Function0) afS0S0311000_15.l1;
        if (function0 != null) {
            function0.invoke();
        }
        if (th instanceof C501470JlZ) {
            InterfaceC923620a8u interfaceC923620a8u = (InterfaceC923620a8u) afS0S0311000_15.l2;
            if (interfaceC923620a8u != null) {
                interfaceC923620a8u.MD(new C925130aBL(afS0S0311000_15.i4, Long.valueOf(r3.getErrorCode()), ((C501470JlZ) th).getPrompt()));
            }
        } else {
            InterfaceC923620a8u interfaceC923620a8u2 = (InterfaceC923620a8u) afS0S0311000_15.l2;
            if (interfaceC923620a8u2 != null && (context = interfaceC923620a8u2.getContext()) != null) {
                C501540Jlg.LIZJ(context, th);
            }
        }
        C1304660k3U.LIZ.LIZIZ(600, "multi-guest guest check permission error.", th, null);
        C1C7U.LIZIZ("GameLinkPermissionManager@2602.checkPermission$4");
    }

    public static final void accept$1(AfS0S0311000_15 afS0S0311000_15, Object obj) {
        Context context;
        DataChannel dataChannel;
        C1C7U.LIZ("MultiGuestPermissionManager@6f0.checkPermission$3");
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("throwable:");
        sbLIZ.append(th);
        C944240agA.LJFF("LinkIn_Guest_Permission_Failed", C2188811AlT.LIZIZ(sbLIZ));
        C925080aBG.LIZ = false;
        if (afS0S0311000_15.z3 && (dataChannel = (DataChannel) afS0S0311000_15.l0) != null) {
            dataChannel.FQ2(com.bytedance.android.live.liveinteract.multiguestv3.main.guest.EditBirthFailedWithoutConfirm.class);
        }
        Function0 function0 = (Function0) afS0S0311000_15.l1;
        if (function0 != null) {
            function0.invoke();
        }
        if (th instanceof C501470JlZ) {
            InterfaceC923600a8s interfaceC923600a8s = (InterfaceC923600a8s) afS0S0311000_15.l2;
            if (interfaceC923600a8s != null) {
                interfaceC923600a8s.tF2(new C919690a2Z(afS0S0311000_15.i4, Long.valueOf(r3.getErrorCode()), ((C501470JlZ) th).getPrompt()));
            }
        } else {
            InterfaceC923600a8s interfaceC923600a8s2 = (InterfaceC923600a8s) afS0S0311000_15.l2;
            if (interfaceC923600a8s2 != null && (context = interfaceC923600a8s2.getContext()) != null) {
                C501540Jlg.LIZJ(context, th);
            }
        }
        C1304660k3U.LIZ.LIZIZ(600, "multi-guest guest check permission error.", th, null);
        C1C7U.LIZIZ("MultiGuestPermissionManager@6f0.checkPermission$3");
    }

    public static final void accept$2(AfS0S0311000_15 afS0S0311000_15, Object obj) {
        Context context;
        DataChannel dataChannel;
        C1C7U.LIZ("VoiceChatPermissionManager@120.checkPermission$3");
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("throwable:");
        sbLIZ.append(th);
        C944240agA.LJFF("LinkIn_Guest_Permission_Failed", C2188811AlT.LIZIZ(sbLIZ));
        C925090aBH.LIZ = false;
        if (afS0S0311000_15.z3 && (dataChannel = (DataChannel) afS0S0311000_15.l0) != null) {
            dataChannel.FQ2(com.bytedance.android.live.liveinteract.multiguestv3.main.guest.EditBirthFailedWithoutConfirm.class);
        }
        Function0 function0 = (Function0) afS0S0311000_15.l1;
        if (function0 != null) {
            function0.invoke();
        }
        if (th instanceof C501470JlZ) {
            InterfaceC923660a8y interfaceC923660a8y = (InterfaceC923660a8y) afS0S0311000_15.l2;
            if (interfaceC923660a8y != null) {
                interfaceC923660a8y.St0(new C925250aBX(afS0S0311000_15.i4, Long.valueOf(r3.getErrorCode()), ((C501470JlZ) th).getPrompt()));
            }
        } else {
            InterfaceC923660a8y interfaceC923660a8y2 = (InterfaceC923660a8y) afS0S0311000_15.l2;
            if (interfaceC923660a8y2 != null && (context = interfaceC923660a8y2.getContext()) != null) {
                C501540Jlg.LIZJ(context, th);
            }
        }
        C1304660k3U.LIZ.LIZIZ(600, "multi-guest guest check permission error.", th, null);
        C1C7U.LIZIZ("VoiceChatPermissionManager@120.checkPermission$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS0S0311000_15(boolean z, boolean z2, DataChannel dataChannel, Function0<Unit> function0, InterfaceC923600a8s interfaceC923600a8s, int i) {
        this.$t = i;
        this.z3 = z;
        this.l0 = z2;
        this.l1 = dataChannel;
        this.l2 = function0;
        this.i4 = interfaceC923600a8s;
    }
}
