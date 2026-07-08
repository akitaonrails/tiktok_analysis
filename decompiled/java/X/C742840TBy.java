package X;

import Y.AfS181S0100000_12;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualBaseMessage;
import com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualDeviceConnectReq;
import com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualSinkStateMessage;
import com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualSourceStateMessage;
import com.bytedance.android.livesdk.livesetting.game.GameDualDeviceRtcParamsSetting;
import com.ss.android.deviceregister.DeviceRegisterManager;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0TBy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C742840TBy extends AbstractC742670TBh {
    public static final String LJIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public C0TC2 LJIILIIL;
    public C11JF LJIILJJIL;
    public C11JF LJIILL;
    public final long LJIILLIIL;
    public final long LJIIZILJ;

    public final void LJIIJJI() {
        if (this.LJI.get() != 0) {
            return;
        }
        DualDeviceConnectReq dualDeviceConnectReq = new DualDeviceConnectReq();
        dualDeviceConnectReq.didSource = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        dualDeviceConnectReq.sourceDeviceName = Build.MODEL;
        dualDeviceConnectReq.connectType = this.LJIIL;
        LJIIIZ(dualDeviceConnectReq);
        C20441214yg.LJIIIZ(LJIJ, "rtc source start connect()");
        this.LJI.set(1);
        C11JF c11jf = this.LJIILL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        long j = this.LJIIZILJ;
        C11JF c11jf2 = (C11JF) C11NZ.LJJJJL(j, j, TimeUnit.SECONDS, C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS181S0100000_12(this, 257), new C09JN() { // from class: X.0T6u
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("DualDeviceSourceMsgStrategy@844b.initReconnectTimer$2");
                C20441214yg.LJ(C742840TBy.LJIJ, Log.getStackTraceString((Throwable) obj));
                C1C7U.LIZIZ("DualDeviceSourceMsgStrategy@844b.initReconnectTimer$2");
            }
        });
        this.LIZJ.LIZ(c11jf2);
        this.LJIILL = c11jf2;
        LJIIIIZZ();
    }

    public final void LJIIL() {
        C11JF c11jf = this.LJFF;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C11JF c11jf2 = this.LJIILJJIL;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        this.LJIILJJIL = null;
        C11JF c11jf3 = this.LJIILL;
        if (c11jf3 != null) {
            c11jf3.dispose();
        }
        this.LJI.set(0);
        C20441214yg.LJIIIZ(LJIJ, "rtc source  disconnectActual()");
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[SourceMsgStrategy]");
        sbLIZ.append("DualDeviceRtc");
        LJIJ = C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC742670TBh
    public final void LJI() {
        super.LJI();
        this.LJIILIIL = null;
        C20441214yg.LJIIIZ(LJIJ, "release()");
    }

    @Override // X.C0J63
    public final void LIZIZ(boolean z) {
        C0TC2 c0tc2 = this.LJIILIIL;
        if (c0tc2 != null) {
            c0tc2.LIZIZ(z);
        }
        String str = LJIJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onWsStateChanged isConnect = ");
        sbLIZ.append(z);
        C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082 A[PHI: r3
      0x0082: PHI (r3v1 boolean) = (r3v0 boolean), (r3v0 boolean), (r3v3 boolean), (r3v0 boolean) binds: [B:30:0x0082, B:7:0x000b, B:9:0x0011, B:5:0x0007] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.0TC2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0TC1] */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.0TCZ] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.0TC0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractC742670TBh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(int r7) {
        /*
            r6 = this;
            r0 = 999(0x3e7, float:1.4E-42)
            r3 = 1
            if (r7 != r0) goto L62
            X.0TC0 r1 = X.C0TC0.STATE_TIME_OUT
            if (r1 == 0) goto L82
        L9:
            X.0TC2 r0 = r6.LJIILIIL
            if (r0 == 0) goto L82
            boolean r3 = r0.LIZJ(r1)
            if (r3 != 0) goto L82
            r6.LJIIIIZZ()
        L16:
            java.lang.String r5 = X.C742840TBy.LJIJ
            java.lang.StringBuilder r4 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "rtc source  onDisconnect error = "
            r4.append(r0)
            r4.append(r7)
            java.lang.String r0 = ",msg = "
            r4.append(r0)
            X.0TC4 r0 = X.C0TC1.Companion
            r0.getClass()
            X.07zh r0 = X.C0TC1.getEntries()
            java.util.Iterator r2 = r0.iterator()
        L36:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5f
            java.lang.Object r1 = r2.next()
            X.0TC1 r1 = (X.C0TC1) r1
            int r0 = r1.getCode()
            if (r0 != r7) goto L36
            java.lang.String r0 = r1.getDes()
        L4c:
            r4.append(r0)
            java.lang.String r0 = ",result = "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r4)
            X.C20441214yg.LJIIIZ(r5, r0)
            return
        L5f:
            java.lang.String r0 = ""
            goto L4c
        L62:
            X.0TC4 r0 = X.C0TC1.Companion
            r0.getClass()
            X.07zh r0 = X.C0TC1.getEntries()
            java.util.Iterator r2 = r0.iterator()
        L6f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L82
            java.lang.Object r1 = r2.next()
            X.0TC1 r1 = (X.C0TC1) r1
            int r0 = r1.getCode()
            if (r0 != r7) goto L6f
            goto L9
        L82:
            r6.LJIIL()
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C742840TBy.LJ(int):void");
    }

    public final void LJIILIIL(DualSourceStateMessage dualSourceStateMessage) {
        if (LIZLLL()) {
            C20441214yg.LJIIIZ(LJIJ, "sendSourceStateMessage is not connected");
            return;
        }
        LJIIJ(dualSourceStateMessage);
        String str = LJIJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendSourceStateMessage stateMessage = ");
        sbLIZ.append(dualSourceStateMessage);
        C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    public C742840TBy(String str, String str2) {
        this.LJIIJJI = str;
        this.LJIIL = str2;
        GameDualDeviceRtcParamsSetting gameDualDeviceRtcParamsSetting = GameDualDeviceRtcParamsSetting.INSTANCE;
        this.LJIILLIIL = gameDualDeviceRtcParamsSetting.getConfig().msgStrategyHeartBeatTimer;
        this.LJIIZILJ = gameDualDeviceRtcParamsSetting.getConfig().msgStrategyResendTimeOut;
        InterfaceC742680TBi interfaceC742680TBiLIZ = LIZ();
        if (interfaceC742680TBiLIZ != null) {
            interfaceC742680TBiLIZ.LIZIZ(str);
        }
        String str3 = LJIJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("targetDid =");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ(str3, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC742670TBh
    public final void LJFF(DualBaseMessage dualBaseMessage, String str) {
        if (!TextUtils.equals(this.LJIIJJI, str)) {
            String str2 = LJIJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onMessage return targetDid = ");
            sbLIZ.append(this.LJIIJJI);
            sbLIZ.append(",didFrom =");
            sbLIZ.append(str);
            C20441214yg.LJ(str2, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        super.LJFF(dualBaseMessage, str);
        if (dualBaseMessage instanceof DualSinkStateMessage) {
            C0TC4 c0tc4 = C0TC1.Companion;
            DualSinkStateMessage dualSinkStateMessage = (DualSinkStateMessage) dualBaseMessage;
            int i = dualSinkStateMessage.liveState;
            c0tc4.getClass();
            Iterator<C0TC1> it2 = C0TC1.getEntries().iterator();
            while (it2.hasNext()) {
                if (it2.next().getCode() == i) {
                    LJ(dualSinkStateMessage.liveState);
                    return;
                }
            }
            if (LIZLLL()) {
                return;
            }
            if (this.LJI.get() == 1) {
                C0TC2 c0tc2 = this.LJIILIIL;
                if (c0tc2 != null) {
                    c0tc2.LIZ();
                }
                C11JF c11jf = this.LJIILL;
                if (c11jf != null) {
                    c11jf.dispose();
                }
                this.LJI.set(2);
                C20441214yg.LJIIIZ(LJIJ, "rtc source connect succeed!!");
            }
            if (this.LJIILJJIL == null || !(!r0.isDisposed())) {
                long j = this.LJIILLIIL;
                C11JF c11jf2 = (C11JF) C11NZ.LJJJJL(j, j, TimeUnit.SECONDS, C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS181S0100000_12(this, 254), new C09JN() { // from class: X.0T6t
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("DualDeviceSourceMsgStrategy@844b.initHeartBeatTimer$2");
                        C20441214yg.LJ(C742840TBy.LJIJ, Log.getStackTraceString((Throwable) obj));
                        C1C7U.LIZIZ("DualDeviceSourceMsgStrategy@844b.initHeartBeatTimer$2");
                    }
                });
                this.LIZJ.LIZ(c11jf2);
                this.LJIILJJIL = c11jf2;
                C0TC2 c0tc22 = this.LJIILIIL;
                if (c0tc22 != null) {
                    c0tc22.LJ();
                }
            }
            C0TC2 c0tc23 = this.LJIILIIL;
            if (c0tc23 != null) {
                c0tc23.LIZLLL(dualSinkStateMessage);
            }
            String str3 = LJIJ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onLiveState state = ");
            sbLIZ2.append(dualBaseMessage);
            C20441214yg.LJIIIZ(str3, C2188811AlT.LIZIZ(sbLIZ2));
        }
    }
}
