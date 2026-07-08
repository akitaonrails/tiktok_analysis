package X;

import Y.AfS181S0100000_12;
import android.util.Log;
import com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualAckMessage;
import com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualBaseMessage;
import com.bytedance.android.livesdk.livesetting.game.GameDualDeviceRtcParamsSetting;
import com.bytedance.android.livesdk.signaling.model.downlink.GameDualDeviceSignalData;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0TBh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC742670TBh implements C0J63 {
    public static final String LJIIJ;
    public C11JF LIZLLL;
    public C11JF LJFF;
    public final long LJII;
    public final long LJIIIIZZ;
    public final long LJIIIZ;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(479));
    public final ConcurrentHashMap<Integer, DualBaseMessage> LIZIZ = new ConcurrentHashMap<>();
    public final C11NJ LIZJ = new C11NJ();
    public final AtomicBoolean LJ = new AtomicBoolean(false);
    public final AtomicInteger LJI = new AtomicInteger(0);

    public abstract void LJ(int i);

    public final InterfaceC742680TBi LIZ() {
        return (InterfaceC742680TBi) this.LIZ.getValue();
    }

    public final boolean LIZLLL() {
        return this.LJI.get() == 0;
    }

    public void LJI() {
        boolean zIsEmpty = this.LIZIZ.isEmpty();
        if (zIsEmpty) {
            LJII();
        } else {
            this.LIZJ.LIZ(C11NZ.LJLJJLL(this.LJIIIZ, TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS181S0100000_12(this, 258), new C09JN() { // from class: X.0T6j
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("DualDeviceMsgStrategy@4754.delay2Release$2");
                    C20441214yg.LJ(AbstractC742670TBh.LJIIJ, Log.getStackTraceString((Throwable) obj));
                    C1C7U.LIZIZ("DualDeviceMsgStrategy@4754.delay2Release$2");
                }
            }));
            this.LJ.set(true);
        }
        String str = LJIIJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("release() isWaitingAckEmpty = ");
        sbLIZ.append(zIsEmpty);
        C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJII() {
        this.LJI.set(0);
        InterfaceC742680TBi interfaceC742680TBiLIZ = LIZ();
        if (interfaceC742680TBiLIZ != null) {
            interfaceC742680TBiLIZ.release();
        }
        this.LIZJ.dispose();
        this.LJ.set(false);
        C20441214yg.LJIIIZ(LJIIJ, "releaseActual()");
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[MsgStrategy]");
        sbLIZ.append("DualDeviceRtc");
        LJIIJ = C2188811AlT.LIZIZ(sbLIZ);
    }

    public AbstractC742670TBh() {
        GameDualDeviceRtcParamsSetting gameDualDeviceRtcParamsSetting = GameDualDeviceRtcParamsSetting.INSTANCE;
        this.LJII = gameDualDeviceRtcParamsSetting.getConfig().msgStrategyHeartBeatTimeOut;
        this.LJIIIIZZ = gameDualDeviceRtcParamsSetting.getConfig().msgStrategyResendTimeOut;
        this.LJIIIZ = gameDualDeviceRtcParamsSetting.getConfig().msgStrategyDelayReleaseTimer;
        InterfaceC742680TBi interfaceC742680TBiLIZ = LIZ();
        if (interfaceC742680TBiLIZ != null) {
            interfaceC742680TBiLIZ.LJFF(this);
        }
    }

    public final void LJIIIIZZ() {
        if (LIZLLL()) {
            return;
        }
        C11JF c11jf = this.LJFF;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C11JF c11jf2 = (C11JF) C11NZ.LJLJL(this.LJII, TimeUnit.SECONDS, C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS181S0100000_12(this, 256), new C09JN() { // from class: X.0T6l
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("DualDeviceMsgStrategy@4754.resetTimeOutTimer$2");
                C20441214yg.LJ(AbstractC742670TBh.LJIIJ, Log.getStackTraceString((Throwable) obj));
                C1C7U.LIZIZ("DualDeviceMsgStrategy@4754.resetTimeOutTimer$2");
            }
        });
        this.LIZJ.LIZ(c11jf2);
        this.LJFF = c11jf2;
    }

    @Override // X.C0J63
    public final void LIZJ(GameDualDeviceSignalData gameDualDeviceSignalData) {
        this.LIZJ.LIZ(C11NZ.LJJJJZ(gameDualDeviceSignalData).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0TBq
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                GameDualDeviceSignalData gameDualDeviceSignalData2 = (GameDualDeviceSignalData) obj;
                String content = gameDualDeviceSignalData2.getContent();
                try {
                    C742770TBr c742770TBr = EnumC742780TBs.Companion;
                    int messageType = gameDualDeviceSignalData2.getMessageType();
                    c742770TBr.getClass();
                    DualBaseMessage dualBaseMessage = (DualBaseMessage) C19748512Ol.LIZIZ.LJII(content, C742770TBr.LIZ(messageType));
                    String str = AbstractC742670TBh.LJIIJ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onDownlinkMessageReceived() message = ");
                    sbLIZ.append(dualBaseMessage);
                    C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ));
                    return new Pair(dualBaseMessage, gameDualDeviceSignalData2.getFromDid());
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJIIIZ(AbstractC742670TBh.LJIIJ, Log.getStackTraceString(e));
                    return null;
                }
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS181S0100000_12(this, 255), new C09JN() { // from class: X.0T6m
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("DualDeviceMsgStrategy@4754.onMessage$3");
                C20441214yg.LJ(AbstractC742670TBh.LJIIJ, Log.getStackTraceString((Throwable) obj));
                C1C7U.LIZIZ("DualDeviceMsgStrategy@4754.onMessage$3");
            }
        }));
    }

    public final void LJIIIZ(DualBaseMessage dualBaseMessage) {
        dualBaseMessage.id = System.currentTimeMillis();
        dualBaseMessage.resumeTimestampMillsec = System.currentTimeMillis();
        InterfaceC742680TBi interfaceC742680TBiLIZ = LIZ();
        if (interfaceC742680TBiLIZ != null) {
            interfaceC742680TBiLIZ.LJ(dualBaseMessage.LIZ(), GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, dualBaseMessage));
        }
        String str = LJIIJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendMessage message= ");
        sbLIZ.append(dualBaseMessage);
        C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIIJ(DualBaseMessage dualBaseMessage) {
        dualBaseMessage.isNeedAck = true;
        this.LIZIZ.put(Integer.valueOf(dualBaseMessage.LIZ()), dualBaseMessage);
        if (this.LIZLLL == null) {
            long j = this.LJIIIIZZ;
            InterfaceC420801kM interfaceC420801kMLJJLL = C11NZ.LJJJJL(j, j, TimeUnit.SECONDS, C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS181S0100000_12(this, 259), new C09JN() { // from class: X.0T6k
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("DualDeviceMsgStrategy@4754.initResendTimer$2");
                    C20441214yg.LJ(AbstractC742670TBh.LJIIJ, Log.getStackTraceString((Throwable) obj));
                    C1C7U.LIZIZ("DualDeviceMsgStrategy@4754.initResendTimer$2");
                }
            });
            this.LIZJ.LIZ(interfaceC420801kMLJJLL);
            this.LIZLLL = (C11JF) interfaceC420801kMLJJLL;
        }
        LJIIIZ(dualBaseMessage);
    }

    public void LJFF(DualBaseMessage dualBaseMessage, String str) {
        if (!LIZLLL() && dualBaseMessage.isNeedAck) {
            DualAckMessage dualAckMessage = new DualAckMessage();
            dualAckMessage.ackId = dualBaseMessage.id;
            LJIIIZ(dualAckMessage);
        }
        if (dualBaseMessage instanceof C742730TBn) {
            if (this.LJI.get() == 2) {
                LJIIIZ(new DualBaseMessage() { // from class: X.0TBm
                    @Override // com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualBaseMessage
                    public final int LIZ() {
                        return EnumC742780TBs.DUAL_DEVICE_SINK_PONG.getMessageType();
                    }
                });
            }
            String str2 = LJIIJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onMessage send ping message connectState= ");
            sbLIZ.append(this.LJI.get());
            C20441214yg.LJIIIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
        } else if (dualBaseMessage instanceof DualAckMessage) {
            Iterator<Map.Entry<Integer, DualBaseMessage>> it2 = this.LIZIZ.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry<Integer, DualBaseMessage> next = it2.next();
                int iIntValue = next.getKey().intValue();
                if (next.getValue().id == ((DualAckMessage) dualBaseMessage).ackId) {
                    this.LIZIZ.remove(Integer.valueOf(iIntValue));
                    break;
                }
            }
            int size = this.LIZIZ.size();
            String str3 = LJIIJ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("on ack message size= ");
            sbLIZ2.append(size);
            C20441214yg.LJIIIZ(str3, C2188811AlT.LIZIZ(sbLIZ2));
            if (size == 0) {
                C11JF c11jf = this.LIZLLL;
                if (c11jf != null) {
                    c11jf.dispose();
                }
                this.LIZLLL = null;
                if (this.LJ.get()) {
                    LJII();
                }
            }
        }
        LJIIIIZZ();
        String str4 = LJIIJ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("onMessage message = ");
        sbLIZ3.append(dualBaseMessage);
        C20441214yg.LJIIIZ(str4, C2188811AlT.LIZIZ(sbLIZ3));
    }
}
