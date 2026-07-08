package X;

import Y.ARunnableS107S0100000_7;
import Y.AfS176S0100000_7;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.dataChannel.PlayerStatusChannel;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePipResumeEnableSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostCommerce;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ibp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C469950Ibp {
    public static final C01GW<C469950Ibp> LJIJ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(2));
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public C19EG LJ;
    public final C01GW LJFF;
    public C11JF LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public final C469970Ibr LJIILLIIL;
    public final C469960Ibq LJIIZILJ;

    public static int LIZJ() {
        Double dLIZ = InterfaceC1106030et7.g5.LIZ();
        if (dLIZ != null) {
            return (int) dLIZ.doubleValue();
        }
        return 0;
    }

    public final String LIZ() {
        return this.LIZ ? "mini_window" : InterfaceC1106030et7.e5.LIZIZ().booleanValue() ? "voice_only" : "none";
    }

    public final boolean LJIIIZ() {
        return this.LJII && !InterfaceC1106030et7.c5.LIZIZ().booleanValue() && C472950Igf.LIZJ();
    }

    public final void LJIIL() {
        C11JF c11jf = this.LJI;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LJI = (C11JF) C11NZ.LJLJJLL(100L, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS176S0100000_7(this, 0));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0Ibr] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Ibq] */
    public C469950Ibp() {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(3));
        this.LJFF = c01gwLIZIZ;
        this.LJIILLIIL = new C1AGV() { // from class: X.0Ibr
            public boolean LL = true;

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
            }

            public final void LIZ() {
                if (this.LLILLJJLI.LJ == null) {
                    return;
                }
                if (C472950Igf.LIZJ()) {
                    C469950Ibp c469950Ibp = this.LLILLJJLI;
                    if (!c469950Ibp.LIZ) {
                        c469950Ibp.LJII = true;
                    }
                }
                if (this.LL) {
                    this.LL = false;
                    C469950Ibp c469950Ibp2 = this.LLILLJJLI;
                    c469950Ibp2.LJI(c469950Ibp2.LIZ());
                }
            }

            @Override // X.C1AGV
            public final void LJIJ(boolean z) {
                C469950Ibp c469950Ibp = this.LLILLJJLI;
                if (z != c469950Ibp.LJIIIIZZ) {
                    c469950Ibp.LJIIJ = false;
                }
                c469950Ibp.LJIIIIZZ = z;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PipController setAppEnterBackground isAppBackground=");
                sbLIZ.append(this.LLILLJJLI.LJIIIIZZ);
                C20441214yg.LJIIIZ("AudioLiveService", C2188811AlT.LIZIZ(sbLIZ));
                this.LLILLJJLI.LJIIL();
                if (z) {
                    if (!InterfaceC1106030et7.e5.LIZIZ().booleanValue()) {
                        DataChannelGlobal.LLILZ.HQ2(PlayerStatusChannel.class, C0II2.STOP);
                    }
                    this.LLILLJJLI.LJIIIZ = false;
                    if (!InterfaceC1106030et7.c5.LIZIZ().booleanValue() && InterfaceC1106030et7.e5.LIZIZ().booleanValue()) {
                        boolean zIsLivePlayActivityOnTop = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).isLivePlayActivityOnTop();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("isLiveActivity : ");
                        sbLIZ2.append(zIsLivePlayActivityOnTop);
                        C20441214yg.LIZIZ("AudioLiveService", C2188811AlT.LIZIZ(sbLIZ2));
                        if (zIsLivePlayActivityOnTop && !((IHostCommerce) C1161920gLG.LIZJ(IHostCommerce.class)).GD1(this.LLILLJJLI.LJ)) {
                            DataChannelGlobal.LLILZ.HQ2(PlayerStatusChannel.class, C0II2.SWITCH_AO);
                            this.LLILLJJLI.LJIIIZ = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!this.LLILLJJLI.LJIIIZ) {
                    return;
                }
                DataChannelGlobal.LLILZ.HQ2(PlayerStatusChannel.class, C0II2.SWITCH_NORMAL);
                this.LLILLJJLI.LJIIIZ = false;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                this.LLILLJJLI.getClass();
                if (!C469950Ibp.LIZLLL(activity)) {
                    return;
                }
                C469950Ibp c469950Ibp = this.LLILLJJLI;
                if (c469950Ibp.LIZ) {
                    c469950Ibp.LJIIIIZZ(C0IIM.CLOSE_MINI_WINDOW, "mini_window");
                }
                C469950Ibp c469950Ibp2 = this.LLILLJJLI;
                c469950Ibp2.LJIIJJI = false;
                c469950Ibp2.LJIIJ = true;
                C20441214yg.LIZIZ("AudioLiveService", "PipController cancelNotification");
                c469950Ibp2.LJIIL();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                this.LLILLJJLI.getClass();
                if (C469950Ibp.LIZLLL(activity) && this.LLILLJJLI.LIZ) {
                    LIZ();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PipController#onActivityResumed: playActivity=");
                sbLIZ.append(this.LLILLJJLI.LJ);
                sbLIZ.append(" pip=");
                sbLIZ.append(C472950Igf.LIZIZ(this.LLILLJJLI.LJ));
                sbLIZ.append(" activity=");
                sbLIZ.append(activity);
                C20441214yg.LJIIIZ("picture_in_picture", C2188811AlT.LIZIZ(sbLIZ));
                if (C472950Igf.LIZIZ(this.LLILLJJLI.LJ)) {
                    this.LLILLJJLI.getClass();
                    if (!C469950Ibp.LIZLLL(activity) && LivePipResumeEnableSetting.INSTANCE.getValue()) {
                        Intent intent = new Intent(C497740JfY.LJII(), (Class<?>) ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getLivePlayActivityClass());
                        intent.setFlags(131072);
                        intent.putExtra("is_pip_resume", true);
                        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
                        C1701330uNH.LIZ(intent, activity);
                        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+yPQ8P27ug9Y9BTQNsf8rcs=", null));
                        C20441214yg.LJIIIZ("picture_in_picture", "PipController#onActivityResumed: resume PlayActivity");
                    }
                }
                if (this.LLILLJJLI.LJ == null || !C469950Ibp.LIZLLL(activity) || C472950Igf.LIZIZ(activity)) {
                    return;
                }
                this.LL = true;
                C469950Ibp c469950Ibp = this.LLILLJJLI;
                c469950Ibp.LJIIIIZZ(C0IIM.BACK_APP, c469950Ibp.LIZ());
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
                this.LLILLJJLI.getClass();
                if (C469950Ibp.LIZLLL(activity) && this.LLILLJJLI.LJIIIIZZ) {
                    LIZ();
                }
            }
        };
        this.LJIIZILJ = new C1AU9() { // from class: X.0Ibq
            public boolean LIZ = true;

            @Override // X.C1AU9
            public final void LIZ() {
            }

            @Override // X.C1AU9
            public final void LJFF(AbstractC1387200mCc abstractC1387200mCc) {
            }

            public final void LJI() {
                if (this.LIZIZ.LJ == null) {
                    return;
                }
                if (C472950Igf.LIZJ()) {
                    C469950Ibp c469950Ibp = this.LIZIZ;
                    if (!c469950Ibp.LIZ) {
                        c469950Ibp.LJII = true;
                    }
                }
                if (this.LIZ) {
                    this.LIZ = false;
                    C469950Ibp c469950Ibp2 = this.LIZIZ;
                    c469950Ibp2.LJI(c469950Ibp2.LIZ());
                }
            }

            @Override // X.C1AU9
            public final void LIZIZ(AbstractC1387200mCc abstractC1387200mCc) {
                this.LIZIZ.getClass();
                if (C469950Ibp.LJ(abstractC1387200mCc) && this.LIZIZ.LIZ) {
                    LJI();
                }
            }

            @Override // X.C1AU9
            public final void LIZJ(AbstractC1387200mCc abstractC1387200mCc) {
                InterfaceC475370IkZ c480060Is8;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PipController#onActivityResumed: playActivity=");
                sbLIZ.append(this.LIZIZ.LJ);
                sbLIZ.append(" pip=");
                sbLIZ.append(C472950Igf.LIZIZ(this.LIZIZ.LJ));
                sbLIZ.append(" activity=");
                sbLIZ.append(abstractC1387200mCc);
                C20441214yg.LJIIIZ("picture_in_picture", C2188811AlT.LIZIZ(sbLIZ));
                if (C472950Igf.LIZIZ(this.LIZIZ.LJ)) {
                    this.LIZIZ.getClass();
                    if (!C469950Ibp.LJ(abstractC1387200mCc) && LivePipResumeEnableSetting.INSTANCE.getValue()) {
                        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).whetherChangeSAFStatus();
                        if (C479990Is1.LIZ) {
                            c480060Is8 = new C469980Ibs(new Bundle());
                        } else {
                            c480060Is8 = new C480060Is8(new Intent(C497740JfY.LJII(), (Class<?>) ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getLivePlayActivityClass()));
                        }
                        c480060Is8.LIZ(131072);
                        c480060Is8.putBoolean("is_pip_resume", true);
                        C20441214yg.LJIIIZ("picture_in_picture", "PipController#onActivityResumed: resume PlayActivity");
                        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).startLivePlay(C497740JfY.LJII(), c480060Is8);
                    }
                }
                if (this.LIZIZ.LJ != null && C469950Ibp.LJ(abstractC1387200mCc)) {
                    if ((abstractC1387200mCc instanceof C1397950mTx) && C472950Igf.LIZIZ(((C1397950mTx) abstractC1387200mCc).LIZLLL)) {
                        return;
                    }
                    this.LIZ = true;
                    C469950Ibp c469950Ibp = this.LIZIZ;
                    c469950Ibp.LJIIIIZZ(C0IIM.BACK_APP, c469950Ibp.LIZ());
                }
            }

            @Override // X.C1AU9
            public final void LIZLLL(AbstractC1387200mCc abstractC1387200mCc) {
                this.LIZIZ.getClass();
                if (C469950Ibp.LJ(abstractC1387200mCc) && this.LIZIZ.LJIIIIZZ) {
                    LJI();
                }
            }

            @Override // X.C1AU9
            public final void LJ(AbstractC1387200mCc abstractC1387200mCc) {
                this.LIZIZ.getClass();
                if (!C469950Ibp.LJ(abstractC1387200mCc)) {
                    return;
                }
                C469950Ibp c469950Ibp = this.LIZIZ;
                if (c469950Ibp.LIZ) {
                    c469950Ibp.LJIIIIZZ(C0IIM.CLOSE_MINI_WINDOW, "mini_window");
                }
                C469950Ibp c469950Ibp2 = this.LIZIZ;
                c469950Ibp2.LJIIJJI = false;
                c469950Ibp2.LJIIJ = true;
                C20441214yg.LIZIZ("AudioLiveService", "PipController cancelNotification");
                c469950Ibp2.LJIIL();
            }

            @Override // X.C1AU9
            public final void LJIJ(boolean z) {
                C469950Ibp c469950Ibp = this.LIZIZ;
                if (z != c469950Ibp.LJIIIIZZ) {
                    c469950Ibp.LJIIJ = false;
                }
                c469950Ibp.LJIIIIZZ = z;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PipController setAppEnterBackground isAppBackground=");
                sbLIZ.append(this.LIZIZ.LJIIIIZZ);
                C20441214yg.LJIIIZ("AudioLiveService", C2188811AlT.LIZIZ(sbLIZ));
                this.LIZIZ.LJIIL();
                if (z) {
                    if (!InterfaceC1106030et7.e5.LIZIZ().booleanValue()) {
                        DataChannelGlobal.LLILZ.HQ2(PlayerStatusChannel.class, C0II2.STOP);
                    }
                    this.LIZIZ.LJIIIZ = false;
                    if (!InterfaceC1106030et7.c5.LIZIZ().booleanValue() && InterfaceC1106030et7.e5.LIZIZ().booleanValue()) {
                        boolean zIsLivePlayActivityOnTop = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).isLivePlayActivityOnTop();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("isLiveActivity : ");
                        sbLIZ2.append(zIsLivePlayActivityOnTop);
                        C20441214yg.LIZIZ("AudioLiveService", C2188811AlT.LIZIZ(sbLIZ2));
                        if (zIsLivePlayActivityOnTop && !((IHostCommerce) C1161920gLG.LIZJ(IHostCommerce.class)).GD1(this.LIZIZ.LJ)) {
                            DataChannelGlobal.LLILZ.HQ2(PlayerStatusChannel.class, C0II2.SWITCH_AO);
                            this.LIZIZ.LJIIIZ = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!this.LIZIZ.LJIIIZ) {
                    return;
                }
                DataChannelGlobal.LLILZ.HQ2(PlayerStatusChannel.class, C0II2.SWITCH_NORMAL);
                this.LIZIZ.LJIIIZ = false;
            }
        };
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext != null && iHostAppContext.context() != null) {
            LJIIJ();
        } else {
            C20441214yg.LJ("PipController", "IHostAppContext not init!");
            C786410Ut5.LJLIIL(2000L, (Handler) c01gwLIZIZ.getValue(), new ARunnableS107S0100000_7(this, 4));
        }
    }

    public final void LJIIJ() {
        if (C464660IKa.LIZ()) {
            IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
            if (iHostAppContext != null) {
                iHostAppContext.registerPageEventCallback(this.LJIIZILJ);
                return;
            }
            return;
        }
        IHostAppContext iHostAppContext2 = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext2 != null) {
            iHostAppContext2.registerLifeCycleCallback(this.LJIILLIIL);
        }
    }

    public static boolean LIZLLL(Activity activity) {
        return Intrinsics.LJFF(activity.getClass(), ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getLivePlayActivityClass());
    }

    public static boolean LJ(AbstractC1387200mCc abstractC1387200mCc) {
        if (!((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).isLivePlayActivity(abstractC1387200mCc) && !((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).isLivePlayRootFragment(abstractC1387200mCc)) {
            return false;
        }
        return true;
    }

    public static void LJII(String str) {
        String str2;
        boolean zIsPlaying;
        String str3;
        EnterRoomConfig enterRoomConfig;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomLinkSession enterRoomLinkSessionLIZ = C0IL2.LIZ.LIZ();
        if (enterRoomLinkSessionLIZ != null && (enterRoomConfig = enterRoomLinkSessionLIZ.mEnterRoomConfig) != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
            str2 = roomsData.warmUpPlayerTag;
        } else {
            str2 = null;
        }
        InterfaceC480510Isr interfaceC480510IsrLIZIZ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ(str2);
        boolean zBooleanValue = false;
        if (interfaceC480510IsrLIZIZ != null) {
            zIsPlaying = interfaceC480510IsrLIZIZ.isPlaying();
        } else {
            zIsPlaying = false;
        }
        Boolean bool = (Boolean) DataChannelGlobal.LLILZ.gg0(C930790aKT.class);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_live_backstage_return_click", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_10()));
        c474500IjALIZIZ.LJIL();
        c474500IjALIZIZ.LJJII(str, "backstage_type");
        if (zIsPlaying) {
            if (zBooleanValue) {
                str3 = "paused";
            } else {
                str3 = "live";
            }
        } else {
            str3 = "closed";
        }
        c474500IjALIZIZ.LJJII(str3, "live_status");
        c474500IjALIZIZ.LIZ();
    }

    public final void LJFF(long j) {
        if (TextUtils.equals(LIZ(), "voice_only")) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_audio_player_pause_duration");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(Long.valueOf(j), "pause_duration");
            c474500IjALIZ.LIZ();
        }
    }

    public final void LJI(String str) {
        Object obj;
        if (!this.LIZJ) {
            this.LJIIJJI = true;
            this.LJIILIIL = SystemClock.elapsedRealtime();
            this.LJIILL = 0L;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_exit_backgroud");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(str, "backstage_type");
            String str2 = "1";
            if (C472950Igf.LIZJ() && C472950Igf.LIZ(C497740JfY.LJII())) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(obj, "mini_window_sys_auth");
            if (!InterfaceC1106030et7.c5.LIZIZ().booleanValue()) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(str2, "mini_window_app_auth");
            c474500IjALIZ.LJJII(Integer.valueOf(this.LIZLLL), "draw_position");
            c474500IjALIZ.LIZ();
        }
    }

    public final void LJIIJJI(boolean z) {
        C20441214yg.LIZIZ("AudioLiveService", "PipController updateMuteStatus");
        LJIIL();
        if (this.LJIIIIZZ && TextUtils.equals("voice_only", LIZ())) {
            if (z) {
                this.LJIILJJIL = SystemClock.elapsedRealtime();
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LJIILJJIL;
            this.LJIILL += jElapsedRealtime;
            this.LJIILJJIL = 0L;
            LJFF(jElapsedRealtime);
        }
    }

    public final void LJIIIIZZ(C0IIM c0iim, String str) {
        Object obj;
        if (this.LJIIJJI) {
            this.LJIIJJI = false;
            long j = 0;
            if (this.LJIILJJIL > 0) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LJIILJJIL;
                this.LJIILL += jElapsedRealtime;
                this.LJIILJJIL = 0L;
                LJFF(jElapsedRealtime);
            }
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - this.LJIILIIL;
            if (Intrinsics.LJFF(str, "mini_window")) {
                j = jElapsedRealtime2;
            } else if (Intrinsics.LJFF(str, "voice_only")) {
                j = jElapsedRealtime2 - this.LJIILL;
            }
            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_live_backstage_watch_duration", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_10()));
            c474500IjALIZIZ.LJIL();
            c474500IjALIZIZ.LJJII(str, "backstage_type");
            c474500IjALIZIZ.LJJII(c0iim.name().toLowerCase(Locale.US), "end_type");
            c474500IjALIZIZ.LJJII(Long.valueOf(j), "duration");
            String str2 = "1";
            if (C472950Igf.LIZJ() && C472950Igf.LIZ(C497740JfY.LJII())) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZIZ.LJJII(obj, "mini_window_sys_auth");
            if (!InterfaceC1106030et7.c5.LIZIZ().booleanValue()) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZIZ.LJJII(str2, "mini_window_app_auth");
            c474500IjALIZIZ.LIZ();
            if (c0iim == C0IIM.BACK_APP) {
                LJII(str);
            } else {
                this.LJIIL = true;
            }
        }
        if (this.LJIIL && c0iim == C0IIM.BACK_APP) {
            this.LJIIL = false;
            LJII(str);
        }
    }
}
