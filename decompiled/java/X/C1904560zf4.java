package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.setting.services.ISpeedModeSetting;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zf4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1904560zf4 extends C1619110sEf implements InterfaceC19330810jy {
    public final InterfaceC1493190oxZ LL;
    public InterfaceC539120LCk LLILLJJLI;
    public long LLILLL = -1;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1603));

    @Override // X.InterfaceC19330810jy
    public final int[] LIZJ() {
        return new int[]{1018};
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
        return false;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJFF(InnerPushMessage innerPushMessage) {
        return true;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJI(InnerPushMessage innerPushMessage) {
        return true;
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LJ() {
        InterfaceC1493190oxZ interfaceC1493190oxZ = this.LL;
        if (interfaceC1493190oxZ != null) {
            interfaceC1493190oxZ.LIZIZ(false);
        }
    }

    public C1904560zf4(C1493090oxP c1493090oxP) {
        this.LL = c1493090oxP;
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LIZIZ(InnerPushMessage innerPushMessage) {
        InterfaceC1493190oxZ interfaceC1493190oxZ = this.LL;
        if (interfaceC1493190oxZ != null) {
            interfaceC1493190oxZ.LIZIZ(true);
        }
        this.LLILLL = System.currentTimeMillis();
        C20684815ws.LJIILLIIL("to_cellular_toast_show", C2097908Jt.LIZJ(new Pair("network_status", String.valueOf(((Number) this.LLILZ.getValue()).intValue()))));
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LIZ(int i, InnerPushMessage innerPushMessage) {
        if (innerPushMessage == null || innerPushMessage.getUiTemplate() == null || ((!C1904550zf3.LIZ().easyClick || i != 0) && (C1904550zf3.LIZ().easyClick || i != 3))) {
            return false;
        }
        InterfaceC1493190oxZ interfaceC1493190oxZ = this.LL;
        if (interfaceC1493190oxZ != null) {
            interfaceC1493190oxZ.LIZ();
        }
        InterfaceC539120LCk interfaceC539120LCk = this.LLILLJJLI;
        if (interfaceC539120LCk != null) {
            interfaceC539120LCk.LIZIZ("dismiss_reason_confirmed", null, false);
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC19330810jy
    public final C20663815tU LJIIIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
        this.LLILLJJLI = c20663515tR;
        return null;
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LJIIJ(InnerPushMessage innerPushMessage, boolean z, String str) {
        if (Intrinsics.LJFF(str, "dismiss_reason_confirmed")) {
            ((ISpeedModeSetting) ServiceManager.get().getService(ISpeedModeSetting.class)).LIZJ(EnumC1493040oxK.ALLOW);
            C20684815ws.LJIILLIIL("to_cellular_toast_accept", C2097608Jq.LJIIIIZZ(new Pair("network_status", String.valueOf(((Number) this.LLILZ.getValue()).intValue())), new Pair("duration", String.valueOf(System.currentTimeMillis() - this.LLILLL))));
        }
    }
}
