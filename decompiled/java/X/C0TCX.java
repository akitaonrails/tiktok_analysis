package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.dataChannel.LiveDualDevicePowerCameraChannel;
import com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualSourceStateMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0TCX, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TCX {
    public static final String LJIILJJIL;
    public final Fragment LIZ;
    public final DataChannel LIZIZ;
    public final InterfaceC754220TiG LIZJ;
    public final C0TC2 LIZLLL;
    public Long LJ;
    public Long LJFF;
    public C1276370jJr LJI;
    public final C742840TBy LJII;
    public final C11PQ<C742870TCb> LJIIIIZZ;
    public InterfaceC420801kM LJIIIZ;
    public final C11PQ<Boolean> LJIIJ;
    public boolean LJIIJJI;
    public final C0TCW LJIIL;
    public boolean LJIILIIL;

    public final void LIZIZ() {
        InterfaceC1276380jJs interfaceC1276380jJs;
        C20441214yg.LJIIIZ(LJIILJJIL, "stop streaming");
        C1276370jJr c1276370jJr = this.LJI;
        if (c1276370jJr != null && (interfaceC1276380jJs = c1276370jJr.LJFF) != null) {
            interfaceC1276380jJs.stop();
        }
        this.LJI = null;
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[SourceStrategy]");
        sbLIZ.append("DualDeviceRtc");
        LJIILJJIL = C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(Boolean bool) {
        boolean zBooleanValue;
        DataChannel dataChannel;
        if (!this.LJIIJJI) {
            return;
        }
        if (bool != null || ((dataChannel = this.LIZIZ) != null && (bool = (Boolean) dataChannel.gg0(LiveDualDevicePowerCameraChannel.class)) != null)) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = 0;
        }
        DualSourceStateMessage dualSourceStateMessage = new DualSourceStateMessage();
        dualSourceStateMessage.cameraState = !zBooleanValue;
        this.LJII.LJIILIIL(dualSourceStateMessage);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("source sendSourceState isCameraOff = ");
        sbLIZ.append(zBooleanValue);
        C742860TCa.LIZIZ(this.LJFF, C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0TCX(androidx.fragment.app.Fragment r4, com.bytedance.ies.sdk.datachannel.DataChannel r5, X.InterfaceC754220TiG r6, java.lang.String r7, X.C743050TCt r8, java.lang.String r9) {
        /*
            r3 = this;
            r3.<init>()
            r3.LIZ = r4
            r3.LIZIZ = r5
            r3.LIZJ = r6
            r3.LIZLLL = r8
            X.0TBy r1 = new X.0TBy
            r1.<init>(r7, r9)
            r3.LJII = r1
            X.11PQ r0 = new X.11PQ
            r0.<init>()
            r3.LJIIIIZZ = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            X.11PQ r0 = X.C11PQ.LJLLLLLL(r0)
            r3.LJIIJ = r0
            X.0TCW r2 = new X.0TCW
            r2.<init>(r3)
            r3.LJIIL = r2
            r1.LJIILIIL = r2
            X.0TBi r0 = r1.LIZ()
            if (r0 == 0) goto L50
            boolean r1 = r0.isWsConnected()
            r0 = 1
            if (r1 != r0) goto L50
        L37:
            r2.LIZIZ(r0)
            java.lang.String r2 = X.C0TCX.LJIILJJIL
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "didTarget = "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LJIIIZ(r2, r0)
            return
        L50:
            r0 = 0
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0TCX.<init>(androidx.fragment.app.Fragment, com.bytedance.ies.sdk.datachannel.DataChannel, X.0TiG, java.lang.String, X.0TCt, java.lang.String):void");
    }
}
