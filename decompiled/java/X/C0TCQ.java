package X;

import com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualSinkStateMessage;

/* JADX INFO: renamed from: X.0TCQ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TCQ extends C0TDG {
    public static final /* synthetic */ int LJIILJJIL = 0;
    public C742850TBz LJIIJ;
    public C0TCV LJIIL;
    public C0TCS LJIIJJI = new C0TCS();
    public final C0TCR LJIILIIL = new C0TCR(this);

    @Override // X.C0TDG
    public final void LIZ() {
        C742850TBz c742850TBz = this.LJIIJ;
        if (c742850TBz != null) {
            DualSinkStateMessage dualSinkStateMessage = new DualSinkStateMessage();
            dualSinkStateMessage.liveState = C0TC1.LIVE_STATE_FINISH.getCode();
            c742850TBz.LJIIJ(dualSinkStateMessage);
            c742850TBz.LJIIJJI();
            String str = C742850TBz.LJIILL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("disconnectedByUser() connectState = ");
            sbLIZ.append(c742850TBz.LJI.get());
            C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LIZ.onNext(C0TCU.StateIdle);
        C20441214yg.LJIIIZ("DualDeviceRtc", "disconnect()");
    }

    @Override // X.C0TDG
    public final void LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init() msgStrategy = ");
        sbLIZ.append(this.LJIIJ);
        C20441214yg.LJIIIZ("DualDeviceRtc", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJIIJ != null) {
            return;
        }
        C742850TBz c742850TBz = new C742850TBz();
        C0TCR c0tcr = this.LJIILIIL;
        c742850TBz.LJIIJJI = c0tcr;
        c0tcr.LJ();
        this.LJIIJ = c742850TBz;
    }

    @Override // X.C0TDG
    public final void LIZLLL() {
        if (LIZJ()) {
            C0TCS c0tcs = this.LJIIJJI;
            c0tcs.LIZ = 4;
            LJ(c0tcs);
        }
        C742850TBz c742850TBz = this.LJIIJ;
        if (c742850TBz != null) {
            c742850TBz.LJI();
        }
        this.LJIIJ = null;
        this.LJIIJJI = new C0TCS();
        this.LIZ.onNext(C0TCU.StateIdle);
        C20441214yg.LJIIIZ("DualDeviceRtc", "stop()");
    }

    public final void LJ(C0TCS c0tcs) {
        DualSinkStateMessage dualSinkStateMessage = new DualSinkStateMessage();
        dualSinkStateMessage.liveState = c0tcs.LIZ;
        dualSinkStateMessage.roomId = String.valueOf(c0tcs.LIZIZ);
        dualSinkStateMessage.rtcRoomId = c0tcs.LIZJ;
        dualSinkStateMessage.durationSec = c0tcs.LIZLLL;
        dualSinkStateMessage.pauseSec = c0tcs.LJ;
        dualSinkStateMessage.autoTranslationEnable = Integer.valueOf(c0tcs.LJFF);
        C742850TBz c742850TBz = this.LJIIJ;
        if (c742850TBz != null) {
            if (c742850TBz.LIZLLL()) {
                C20441214yg.LJIIIZ(C742850TBz.LJIILL, "sendLiveStateMessage is not connect");
            } else {
                c742850TBz.LJIIJ(dualSinkStateMessage);
                String str = C742850TBz.LJIILL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("sendLiveStateMessage stateMessage = ");
                sbLIZ.append(dualSinkStateMessage);
                C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        this.LJIIJJI = c0tcs;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("sendLiveState message =");
        sbLIZ2.append(dualSinkStateMessage);
        C742860TCa.LIZ(this.LJIIJJI.LIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("sendLiveState() message = ");
        sbLIZ3.append(dualSinkStateMessage);
        C20441214yg.LJIIIZ("DualDeviceRtc", C2188811AlT.LIZIZ(sbLIZ3));
    }
}
