package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.android.livesdk.dataChannel.NotifyServerLiveEndSucceedEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAllModePingIntervalDropSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorPingAnchorWsIntervalSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorPingAnchorWsRetryLimitSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorPingAnchorWsSwitch;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostEnableNetControlSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostNetControlConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostWsMigrationSwitch;
import com.bytedance.android.livesdk.livesetting.broadcast.RoomPingIntervalSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.host.LiveDispatchConfig;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0UZ9, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UZ9 implements Handler.Callback, InterfaceC774450UZn {
    public final BPEAHandler LL;
    public final HandlerThread LLILLJJLI;
    public boolean LLILLL;
    public final long LLILZ;
    public final C0UZK LLILZIL;
    public int LLILZLL = 1;
    public Boolean LLIZ;
    public Boolean LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public LiveMode LLJILJIL;
    public final boolean LLJILJILJ;
    public long LLJILLL;
    public boolean LLJJ;
    public InterfaceC774410UZj LLJJI;
    public boolean LLJJIII;

    public final void LIZJ() {
        BPEAHandler bPEAHandler = this.LL;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacksAndMessages(null);
        }
        HandlerThread handlerThread = this.LLILLJJLI;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        if (LiveAnchorPingAnchorWsSwitch.INSTANCE.isEnable()) {
            this.LLILZIL.LIZIZ();
        }
    }

    public final void LJI() {
        int i;
        if (this.LLILLL || this.LLJIJIL || (i = this.LLILZLL) != 1) {
            return;
        }
        this.LLJIJIL = true;
        this.LLILZIL.LJ(false, false, false, i, 0, 0);
    }

    public final void LJIIIIZZ() {
        if (this.LLJILJILJ && this.LLILZLL == 3 && ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppBackground() && this.LLJILLL > 0 && System.currentTimeMillis() - this.LLJILLL < 180000) {
            C786410Ut5.LJLJJI(102, 15000L, this.LL);
        }
    }

    public final void LJIIL() {
        if (this.LLILLL) {
            return;
        }
        LJI();
        C20441214yg.LIZIZ("PingAnchor", "start");
        this.LLILZLL = 2;
        if (LiveAnchorPingAnchorWsSwitch.INSTANCE.enableChangeStateWebsocket()) {
            this.LLIZLLLIL = Boolean.TRUE;
        }
        this.LLIZ = Boolean.FALSE;
        if (LiveHostEnableNetControlSetting.INSTANCE.enable()) {
            C20441214yg.LIZIZ("HostNetCtrl", "prepare");
            LiveDispatchConfig configByScene = LiveHostNetControlConfig.INSTANCE.getConfigByScene("biz_live_broadcast_start_room");
            if (configByScene != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("prepare: ");
                sbLIZ.append(GsonProtectorUtils.toJson(C293501Bt.LIZ(), configByScene));
                C20441214yg.LIZIZ("HostNetCtrl", C2188811AlT.LIZIZ(sbLIZ));
                ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).registerNetworkControl(configByScene.getSceneName(), configByScene);
            }
        }
        LJIIIZ(0, 0, true, false);
        this.LLILLL = true;
    }

    public final void LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("firstSuccess: ");
        sbLIZ.append(true);
        C20441214yg.LIZIZ("LiveHostWsManager", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJ = true;
        if (LiveHostEnableNetControlSetting.INSTANCE.enable()) {
            ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).unRegisterNetworkControl("biz_live_broadcast_start_room");
        }
    }

    public final long LIZ(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isPause: ");
        sbLIZ.append(z);
        sbLIZ.append(", liveMode: ");
        sbLIZ.append(this.LLJILJIL);
        sbLIZ.append(", setting: ");
        sbLIZ.append(this.LLJJIII);
        C20441214yg.LIZIZ("Interval#get", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            return this.LLILZ;
        }
        if (this.LLJILJILJ || this.LLJJIII) {
            if (LiveAnchorPingAnchorWsSwitch.INSTANCE.isEnable() && this.LLJJ) {
                if (this.LLIZLLLIL.booleanValue()) {
                    return RoomPingIntervalSetting.INSTANCE.increaseInternal();
                }
                return ((long) LiveAnchorPingAnchorWsIntervalSetting.INSTANCE.getValue()) * 1000;
            }
            RoomPingIntervalSetting roomPingIntervalSetting = RoomPingIntervalSetting.INSTANCE;
            if (roomPingIntervalSetting.enable()) {
                if (roomPingIntervalSetting.isV2()) {
                    if (this.LLILZLL != 4 && !this.LLIZ.booleanValue()) {
                        return roomPingIntervalSetting.increaseInternal();
                    }
                    if (this.LLJJIII) {
                        return ((long) LiveAnchorPingAnchorWsIntervalSetting.INSTANCE.getValue()) * 1000;
                    }
                    return roomPingIntervalSetting.decreaseInternal();
                }
                return roomPingIntervalSetting.decreaseInternal();
            }
        }
        return this.LLILZ;
    }

    public final void LIZLLL(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPause: ");
        sbLIZ.append(i);
        sbLIZ.append(", started: ");
        sbLIZ.append(this.LLILLL);
        C20441214yg.LIZIZ("PingAnchor", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLILLL) {
            return;
        }
        if (i == 2) {
            this.LLJILLL = System.currentTimeMillis();
        }
        if (this.LLILZLL != 1) {
            LJIIJJI(3, 0, i);
        }
    }

    public final void LJ(int i) {
        if (!this.LLILLL && !this.LLJI) {
            return;
        }
        this.LLJILLL = 0L;
        LJIIJJI(2, 0, i);
    }

    public final void LJFF(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSuccess: ");
        sbLIZ.append(i);
        sbLIZ.append("vs mStatus: ");
        sbLIZ.append(this.LLILZLL);
        C20441214yg.LIZIZ("LiveHostWsManager", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILZLL == i) {
            this.LLIZ = Boolean.TRUE;
            if (i == 4 && this.LLJJI != null) {
                DataChannelGlobal.LLILZ.GQ2(NotifyServerLiveEndSucceedEvent.class);
                this.LLJJI.LIZ();
            }
            if (LiveAnchorPingAnchorWsSwitch.INSTANCE.enableChangeStateWebsocket()) {
                this.LLIZLLLIL = Boolean.FALSE;
                this.LLJ = 0;
                this.LL.removeMessages(102);
                LJII(0);
            }
        }
        if (i == 4 && this.LLJJI != null) {
            DataChannelGlobal.LLILZ.GQ2(NotifyServerLiveEndSucceedEvent.class);
            this.LLJJI.LIZ();
        }
    }

    public final void LJII(int i) {
        int i2 = this.LLILZLL;
        boolean z = false;
        if (i2 != 2) {
            if (i2 == 3) {
                if (i != 2) {
                    if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppBackground()) {
                        LJIIIIZZ();
                        return;
                    }
                }
            } else if (i2 == 1 && this.LLJILJIL == LiveMode.THIRD_PARTY) {
                C786410Ut5.LJLJJI(102, LIZ(false), this.LL);
                return;
            }
            if (!this.LLJILJILJ || i2 != 3) {
                return;
            }
            LJIIIIZZ();
            return;
        }
        BPEAHandler bPEAHandler = this.LL;
        if (this.LLILZLL == 3) {
            z = true;
        }
        C786410Ut5.LJLJJI(102, LIZ(z), bPEAHandler);
    }

    public final void LJIIJ(LiveMode liveMode) {
        this.LLJILJIL = liveMode;
        int i = C0UV7.LIZ[liveMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                this.LLJJIII = false;
                return;
            } else {
                this.LLJJIII = LiveAllModePingIntervalDropSetting.INSTANCE.isEnable();
                return;
            }
        }
        this.LLJJIII = LiveAllModePingIntervalDropSetting.INSTANCE.enableGameMode();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (102 == message.what) {
            LJIIIZ(0, 0, false, this.LLIZLLLIL.booleanValue());
            return true;
        }
        return true;
    }

    public C0UZ9(C0UZK c0uzk, boolean z) {
        Boolean bool = Boolean.FALSE;
        this.LLIZ = bool;
        this.LLIZLLLIL = bool;
        this.LLJ = 0;
        this.LLJI = false;
        this.LLJIJIL = false;
        this.LLJILJIL = null;
        this.LLJILLL = 0L;
        this.LLJJ = false;
        this.LLJJIII = false;
        HandlerThread handlerThread = new HandlerThread("LiveHostStatusService");
        this.LLILLJJLI = handlerThread;
        handlerThread.start();
        this.LL = new BPEAHandler(C786410Ut5.W2(handlerThread), this);
        this.LLJILJILJ = z;
        this.LLILZ = Mp4ScreenVideoLoadTimeout.CONTROL;
        this.LLILZIL = c0uzk;
        c0uzk.LIZJ(this);
    }

    public final void LJIILIIL(int i, InterfaceC774410UZj interfaceC774410UZj) {
        this.LL.removeMessages(102);
        this.LLILLL = false;
        this.LLJIJIL = false;
        this.LLJJI = interfaceC774410UZj;
        LJIIJJI(4, i, 0);
    }

    public final void LJIIJJI(int i, int i2, int i3) {
        boolean z;
        HashMap map = new HashMap();
        map.put("room_status", Integer.valueOf(i));
        map.put("code", Integer.valueOf(i2));
        map.put("pingSource", Integer.valueOf(i3));
        C1CC2.LJII(0, "ttlive_broadcast_action_all", map);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setStatus: ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("PingAnchor", C2188811AlT.LIZIZ(sbLIZ));
        if (i != this.LLILZLL) {
            z = true;
        } else {
            z = false;
        }
        this.LLILZLL = i;
        this.LLIZ = Boolean.FALSE;
        if (LiveAnchorPingAnchorWsSwitch.INSTANCE.enableChangeStateWebsocket()) {
            this.LLIZLLLIL = Boolean.valueOf(z);
            this.LLJ = 0;
        }
        LJIIIZ(i2, i3, false, z);
    }

    public final void LJIIIZ(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        boolean z4 = z2;
        boolean zLJI = MethodIDManager.LJI(202175);
        this.LL.removeMessages(102);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("roomStateChange: ");
        sbLIZ.append(z4);
        sbLIZ.append(", retryCnt: ");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", isFirstPlaying: ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("LiveHostWsManager", C2188811AlT.LIZIZ(sbLIZ));
        LiveAnchorPingAnchorWsSwitch liveAnchorPingAnchorWsSwitch = LiveAnchorPingAnchorWsSwitch.INSTANCE;
        if (liveAnchorPingAnchorWsSwitch.enableChangeStateWebsocket() && !this.LLIZ.booleanValue() && z4) {
            if (this.LLJ >= LiveAnchorPingAnchorWsRetryLimitSetting.INSTANCE.getValue()) {
                this.LLIZ = Boolean.TRUE;
                this.LLIZLLLIL = Boolean.FALSE;
                this.LLJ = 0;
                z4 = false;
            } else {
                this.LLJ++;
            }
        }
        C0UZK c0uzk = this.LLILZIL;
        int i3 = this.LLILZLL;
        if (liveAnchorPingAnchorWsSwitch.isEnable() && !z && ((!z4 || liveAnchorPingAnchorWsSwitch.enableChangeStateWebsocket()) && ((this.LLJILJILJ || LiveHostWsMigrationSwitch.INSTANCE.enableRiskMigration()) && this.LLJJ))) {
            z3 = true;
        } else {
            z3 = false;
        }
        c0uzk.LJ(z, z3, this.LLIZLLLIL.booleanValue(), i3, i, i2);
        LJII(i2);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
