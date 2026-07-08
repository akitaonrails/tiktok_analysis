package Y;

import X.AbstractC742670TBh;
import X.C09JN;
import X.C0TCQ;
import X.C0TDF;
import X.C0TDG;
import X.C19748512Ol;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C742850TBz;
import X.C946950akX;
import X.InterfaceC742680TBi;
import android.os.Build;
import com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualDeviceInviteMessage;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;

/* JADX INFO: loaded from: classes13.dex */
public class AfS33S1000000_12 implements C09JN {
    public final int $t;
    public String s0;

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

    public AfS33S1000000_12(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }

    public static final void accept$0(AfS33S1000000_12 afS33S1000000_12, Object obj) {
        C1C7U.LIZ("AnchorLetsDanceMainSpotViewModel@aed5.finishGame$1$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("finishGame success ");
        sbLIZ.append(obj);
        C20441214yg.LIZIZ("AnchorLetsDanceBizViewModel", C2188811AlT.LIZIZ(sbLIZ));
        C946950akX.LIZLLL(afS33S1000000_12.s0, "success", null, 12);
        C1C7U.LIZIZ("AnchorLetsDanceMainSpotViewModel@aed5.finishGame$1$2");
    }

    public static final void accept$1(AfS33S1000000_12 afS33S1000000_12, Object obj) {
        C1C7U.LIZ("AnchorLetsDanceMainSpotViewModel@aed5.finishGame$1$3");
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("finishGame error ");
        sbLIZ.append(th);
        C20441214yg.LJ("AnchorLetsDanceBizViewModel", C2188811AlT.LIZIZ(sbLIZ));
        C946950akX.LIZLLL(afS33S1000000_12.s0, "fail", th.getMessage(), 8);
        C1C7U.LIZIZ("AnchorLetsDanceMainSpotViewModel@aed5.finishGame$1$3");
    }

    public static final void accept$2(AfS33S1000000_12 afS33S1000000_12, Object obj) {
        C742850TBz c742850TBz;
        C1C7U.LIZ("GameDualDeviceInvitingFragment@3522.onResume$1");
        String str = afS33S1000000_12.s0;
        C0TDG c0tdgLIZLLL = C0TDF.LIZLLL();
        if ((c0tdgLIZLLL instanceof C0TCQ) && (c742850TBz = ((C0TCQ) c0tdgLIZLLL).LJIIJ) != null) {
            DualDeviceInviteMessage dualDeviceInviteMessage = new DualDeviceInviteMessage();
            dualDeviceInviteMessage.versionCode = 4;
            dualDeviceInviteMessage.sinkDid = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
            dualDeviceInviteMessage.inviteId = str;
            dualDeviceInviteMessage.sinkDeviceName = Build.MODEL;
            dualDeviceInviteMessage.sinkPlatform = "android";
            dualDeviceInviteMessage.id = System.currentTimeMillis();
            dualDeviceInviteMessage.resumeTimestampMillsec = System.currentTimeMillis();
            InterfaceC742680TBi interfaceC742680TBiLIZ = c742850TBz.LIZ();
            if (interfaceC742680TBiLIZ != null) {
                interfaceC742680TBiLIZ.LIZLLL(dualDeviceInviteMessage.LIZ(), GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, dualDeviceInviteMessage));
            }
            String str2 = AbstractC742670TBh.LJIIJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sendMessageWithoutDid message= ");
            sbLIZ.append(dualDeviceInviteMessage);
            C20441214yg.LJIIIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
        }
        C1C7U.LIZIZ("GameDualDeviceInvitingFragment@3522.onResume$1");
    }
}
