package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualAckMessage;
import com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualBaseMessage;
import com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualDeviceConnectReq;
import com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualSinkStateMessage;
import com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualSourceStateMessage;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0TBz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C742850TBz extends AbstractC742670TBh {
    public static final String LJIILL;
    public C0TC3 LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;

    public final void LJIIJJI() {
        C11JF c11jf = this.LJFF;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LJIIL = null;
        InterfaceC742680TBi interfaceC742680TBiLIZ = LIZ();
        if (interfaceC742680TBiLIZ != null) {
            interfaceC742680TBiLIZ.LIZIZ(null);
        }
        this.LJI.set(0);
        C20441214yg.LJIIIZ(LJIILL, "rtc sink  disconnectActual()");
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[SinkMsgStrategy]");
        sbLIZ.append("DualDeviceRtc");
        LJIILL = C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC742670TBh
    public final void LJI() {
        super.LJI();
        this.LJIIJJI = null;
    }

    @Override // X.C0J63
    public final void LIZIZ(boolean z) {
        String str = LJIILL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onWsStateChanged isConnect = ");
        sbLIZ.append(z);
        C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[SYNTHETIC] */
    @Override // X.AbstractC742670TBh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(int r7) {
        /*
            r6 = this;
            X.0TC3 r0 = r6.LJIIJJI
            if (r0 == 0) goto L59
            boolean r5 = r0.LIZIZ(r7)
            if (r5 != 0) goto L5a
            r6.LJIIIIZZ()
        Ld:
            java.lang.String r4 = X.C742850TBz.LJIILL
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "rtc sink  onDisconnect error = "
            r3.append(r0)
            r3.append(r7)
            java.lang.String r0 = ",msg = "
            r3.append(r0)
            X.0TC5 r0 = X.C0TC0.Companion
            r0.getClass()
            X.07zh r0 = X.C0TC0.getEntries()
            java.util.Iterator r2 = r0.iterator()
        L2d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r1 = r2.next()
            X.0TC0 r1 = (X.C0TC0) r1
            int r0 = r1.getCode()
            if (r0 != r7) goto L2d
            java.lang.String r0 = r1.getDes()
        L43:
            r3.append(r0)
            java.lang.String r0 = ",isNeedDisconnect = "
            r3.append(r0)
            r3.append(r5)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r3)
            X.C20441214yg.LJIIIZ(r4, r0)
            return
        L56:
            java.lang.String r0 = ""
            goto L43
        L59:
            r5 = 1
        L5a:
            r6.LJIIJJI()
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C742850TBz.LJ(int):void");
    }

    @Override // X.AbstractC742670TBh
    public final void LJFF(DualBaseMessage dualBaseMessage, String str) {
        if (dualBaseMessage instanceof DualDeviceConnectReq) {
            if (this.LJI.get() != 0 && !TextUtils.equals(this.LJIIL, ((DualDeviceConnectReq) dualBaseMessage).didSource)) {
                DualSinkStateMessage dualSinkStateMessage = new DualSinkStateMessage();
                dualSinkStateMessage.liveState = -1;
                dualSinkStateMessage.id = System.currentTimeMillis();
                dualSinkStateMessage.resumeTimestampMillsec = System.currentTimeMillis();
                InterfaceC742680TBi interfaceC742680TBiLIZ = LIZ();
                if (interfaceC742680TBiLIZ != null) {
                    interfaceC742680TBiLIZ.LIZJ(dualSinkStateMessage.LIZ(), str, GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, dualSinkStateMessage));
                }
                String str2 = AbstractC742670TBh.LJIIJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("sendMessageWithTargetDid message= ");
                sbLIZ.append(dualSinkStateMessage);
                C20441214yg.LJIIIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
                String str3 = LJIILL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("rtc sink  connect reject,didFrom = ");
                sbLIZ2.append(str);
                C20441214yg.LJIIIZ(str3, C2188811AlT.LIZIZ(sbLIZ2));
            } else {
                DualDeviceConnectReq dualDeviceConnectReq = (DualDeviceConnectReq) dualBaseMessage;
                String str4 = dualDeviceConnectReq.didSource;
                this.LJIIL = str4;
                InterfaceC742680TBi interfaceC742680TBiLIZ2 = LIZ();
                if (interfaceC742680TBiLIZ2 != null) {
                    interfaceC742680TBiLIZ2.LIZIZ(str4);
                }
                this.LJIILJJIL = dualDeviceConnectReq.connectType;
                this.LJI.set(1);
                this.LJIILIIL = dualDeviceConnectReq.sourceDeviceName;
                C0TC3 c0tc3 = this.LJIIJJI;
                if (c0tc3 != null) {
                    c0tc3.LIZJ();
                }
                C20441214yg.LJIIIZ(LJIILL, "rtc sink start connect");
            }
        }
        super.LJFF(dualBaseMessage, str);
        String str5 = this.LJIIL;
        if (str5 != null && TextUtils.equals(str5, str)) {
            if (dualBaseMessage instanceof DualSourceStateMessage) {
                DualSourceStateMessage dualSourceStateMessage = (DualSourceStateMessage) dualBaseMessage;
                C0TC5 c0tc5 = C0TC0.Companion;
                int i = dualSourceStateMessage.connectState;
                c0tc5.getClass();
                Iterator<C0TC0> it2 = C0TC0.getEntries().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (it2.next().getCode() == i) {
                            LJ(dualSourceStateMessage.connectState);
                            break;
                        }
                    } else {
                        C0TC3 c0tc32 = this.LJIIJJI;
                        if (c0tc32 != null) {
                            c0tc32.LIZLLL(dualSourceStateMessage);
                        }
                    }
                }
                String str6 = LJIILL;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("camera state = ");
                sbLIZ3.append(dualSourceStateMessage.cameraState);
                sbLIZ3.append(",connect state = ");
                sbLIZ3.append(dualSourceStateMessage.connectState);
                C20441214yg.LJIIIZ(str6, C2188811AlT.LIZIZ(sbLIZ3));
                return;
            }
            if (!(dualBaseMessage instanceof DualAckMessage) || this.LJI.get() != 1) {
                return;
            }
            C0TC3 c0tc33 = this.LJIIJJI;
            if (c0tc33 != null) {
                c0tc33.LIZ(this.LJIIL, this.LJIILIIL, this.LJIILJJIL);
            }
            this.LJI.set(2);
            C20441214yg.LJIIIZ(LJIILL, "rtc sink connected!!");
            return;
        }
        String str7 = LJIILL;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("onMessage return targetDid = ");
        sbLIZ4.append(this.LJIIL);
        sbLIZ4.append(",didFrom =");
        sbLIZ4.append(str);
        C20441214yg.LJ(str7, C2188811AlT.LIZIZ(sbLIZ4));
    }
}
