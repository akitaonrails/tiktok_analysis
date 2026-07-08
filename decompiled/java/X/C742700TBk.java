package X;

import Y.AfS181S0100000_12;
import android.os.Build;
import android.util.Log;
import com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualBaseMessage;
import com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualDeviceRejectMessage;
import com.bytedance.android.livesdk.signaling.model.downlink.GameDualDeviceSignalData;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.deviceregister.DeviceRegisterManager;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0TBk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C742700TBk implements C0J63, C0TF0 {
    public static final String LJ;
    public final C01GW LIZ;
    public final C11NJ LIZIZ;
    public final String LIZJ;
    public InterfaceC742710TBl LIZLLL;

    @Override // X.C0TF0
    public final void release() {
        InterfaceC742680TBi interfaceC742680TBi = (InterfaceC742680TBi) this.LIZ.getValue();
        if (interfaceC742680TBi != null) {
            interfaceC742680TBi.release();
        }
        this.LIZLLL = null;
        C20441214yg.LJIIIZ(LJ, "release()");
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[PreviewSourceMsgStrategy]");
        sbLIZ.append("DualDeviceRtc");
        LJ = C2188811AlT.LIZIZ(sbLIZ);
    }

    public C742700TBk() {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(480));
        this.LIZ = c01gwLIZIZ;
        this.LIZIZ = new C11NJ();
        this.LIZJ = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        InterfaceC742680TBi interfaceC742680TBi = (InterfaceC742680TBi) c01gwLIZIZ.getValue();
        if (interfaceC742680TBi != null) {
            interfaceC742680TBi.LJFF(this);
        }
    }

    @Override // X.C0J63
    public final void LIZIZ(boolean z) {
        InterfaceC742710TBl interfaceC742710TBl = this.LIZLLL;
        if (interfaceC742710TBl != null) {
            interfaceC742710TBl.LIZIZ();
        }
        String str = LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onWsStateChanged isConnect = ");
        sbLIZ.append(z);
        C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C0J63
    public final void LIZJ(GameDualDeviceSignalData gameDualDeviceSignalData) {
        this.LIZIZ.LIZ(C11NZ.LJJJJZ(gameDualDeviceSignalData).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0TBp
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                GameDualDeviceSignalData gameDualDeviceSignalData2 = (GameDualDeviceSignalData) obj;
                String content = gameDualDeviceSignalData2.getContent();
                try {
                    C742770TBr c742770TBr = EnumC742780TBs.Companion;
                    int messageType = gameDualDeviceSignalData2.getMessageType();
                    c742770TBr.getClass();
                    DualBaseMessage dualBaseMessage = (DualBaseMessage) C19748512Ol.LIZIZ.LJII(content, C742770TBr.LIZ(messageType));
                    String str = C742700TBk.LJ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onDownlinkMessageReceived() message = ");
                    sbLIZ.append(dualBaseMessage);
                    C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ));
                    return new Pair(dualBaseMessage, gameDualDeviceSignalData2.getFromDid());
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJIIIZ(C742700TBk.LJ, Log.getStackTraceString(e));
                    return null;
                }
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS181S0100000_12(this, 260), new C09JN() { // from class: X.0T7c
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("DualDevicePreviewSourceMsgStrategy@fd86.onMessage$3");
                C20441214yg.LJ(C742700TBk.LJ, Log.getStackTraceString((Throwable) obj));
                C1C7U.LIZIZ("DualDevicePreviewSourceMsgStrategy@fd86.onMessage$3");
            }
        }));
    }

    public final void LIZLLL(C743630TEz c743630TEz) {
        this.LIZLLL = c743630TEz;
        InterfaceC742680TBi interfaceC742680TBi = (InterfaceC742680TBi) this.LIZ.getValue();
        if (interfaceC742680TBi != null) {
            interfaceC742680TBi.isWsConnected();
        }
    }

    @Override // X.C0TF0
    public final void LIZ(String str, String str2) {
        DualDeviceRejectMessage dualDeviceRejectMessage = new DualDeviceRejectMessage();
        dualDeviceRejectMessage.inviteId = str2;
        dualDeviceRejectMessage.sourceDid = this.LIZJ;
        dualDeviceRejectMessage.sourceDeviceName = Build.MODEL;
        InterfaceC742680TBi interfaceC742680TBi = (InterfaceC742680TBi) this.LIZ.getValue();
        if (interfaceC742680TBi != null) {
            interfaceC742680TBi.LIZJ(dualDeviceRejectMessage.LIZ(), str, GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, dualDeviceRejectMessage));
        }
    }
}
