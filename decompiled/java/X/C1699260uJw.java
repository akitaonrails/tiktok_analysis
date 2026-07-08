package X;

import Y.ACallableS411S0100000_3;
import Y.ARunnableS123S0100000_23;
import Y.ARunnableS29S1200000_26;
import Y.ARunnableS31S0201000_26;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveEnableThreadPoolExp;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveHardwareDecodeBytevc1EnableSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveHardwareDecodeH264EnableSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveHttpkDegradeEnabledSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveEnableSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurrySpeedSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveSlowSpeedSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveSlowTimeSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveSdkFastOpenDisableSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveSdkNtpEnableSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePlayerSessionIdSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LiveEnablePlayerSetTimeoutSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePlayThreadReuseOptSetting;
import com.bytedance.android.livesdk.settings.LivePlayerThreadTimeOutSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.videoarch.liveplayer.VideoLiveManager;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uJw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1699260uJw extends AbstractC1700380uLk implements Handler.Callback {
    public VideoLiveManager LLJILJILJ;
    public InterfaceC1700400uLm LLJILLL;
    public BPEAHandler LLJJ;
    public volatile HandlerThread LLJJI;
    public volatile C1480770odX LLJJIII;
    public ExecutorService LLJJIJI;
    public volatile boolean LLJJIJIIJIL;

    @Override // X.C1API
    public final void LJIIJ(int i) {
    }

    @Override // X.C1API
    public final void LJIIZILJ(boolean z) {
    }

    @Override // X.C1API
    public final void LJJIJL() {
        LJJJJLL(LJJIII(29, null));
    }

    @Override // X.C1API
    public final void dynamicOpenTextureRender() {
    }

    @Override // X.C1API
    public final void stopUseTextureRender() {
    }

    @Override // X.C1API
    public final int LIZJ() {
        VideoLiveManager videoLiveManager = this.LLJILJILJ;
        if (videoLiveManager == null || videoLiveManager.LLFFF() == null) {
            return -1;
        }
        return this.LLJILJILJ.LLFFF().ordinal();
    }

    @Override // X.C1API
    public final int LJ() {
        VideoLiveManager videoLiveManager = this.LLJILJILJ;
        if (videoLiveManager == null) {
            return -1;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getPlayerState: ");
        sbLIZ.append(videoLiveManager.LJIIIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        if (videoLiveManager.LJIIIZ == null) {
            return -1;
        }
        VideoLiveManager videoLiveManager2 = this.LLJILJILJ;
        videoLiveManager2.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getPlayerState: ");
        sbLIZ2.append(videoLiveManager2.LJIIIZ);
        C2188811AlT.LIZIZ(sbLIZ2);
        C1698940uJQ.LIZJ();
        return videoLiveManager2.LJIIIZ.ordinal();
    }

    @Override // X.C1API
    public final boolean LJFF() {
        InterfaceC1467950oIr interfaceC1467950oIr;
        VideoLiveManager videoLiveManager = this.LLJILJILJ;
        return (videoLiveManager == null || (interfaceC1467950oIr = videoLiveManager.LIZLLL) == null || !(((C1470430oMr) interfaceC1467950oIr).LIZ instanceof C20547315ah)) ? false : true;
    }

    @Override // X.C1API
    public final JSONObject LJI() {
        VideoLiveManager videoLiveManager = this.LLJILJILJ;
        return videoLiveManager != null ? videoLiveManager.LLILZ() : new JSONObject();
    }

    @Override // X.C1API
    public final String LJIIIIZZ() {
        JSONObject jSONObjectLJZI;
        VideoLiveManager videoLiveManager = this.LLJILJILJ;
        return (videoLiveManager == null || (jSONObjectLJZI = videoLiveManager.LJZI()) == null) ? "" : C786410Ut5.J3(jSONObjectLJZI);
    }

    public final void LJIJ() {
        ExecutorService executorService;
        if (!LivePlayThreadReuseOptSetting.INSTANCE.enableReuseOpt() || this.LLJJIII == null) {
            if (this.LLJJI != null) {
                this.LLJJI.quit();
                this.LLJJI.interrupt();
            }
            if (!LiveEnablePlayerSetTimeoutSetting.INSTANCE.getValue() || (executorService = this.LLJJIJI) == null || executorService.isShutdown()) {
                return;
            }
            this.LLJJIJI.shutdown();
            return;
        }
        if (this.LLJJIII.LIZ != this.LLJJI && this.LLJJI != null) {
            this.LLJJI.quit();
            this.LLJJI.interrupt();
        }
        if (!C486790J7d.LIZIZ()) {
            C786410Ut5.LJJZZIII(this.LLILLJJLI, new ARunnableS123S0100000_23(this, 6));
        } else {
            C1484670ojp.LIZ.LIZIZ(this.LLJJIII);
            this.LLJJIII = null;
        }
    }

    @Override // X.C1API
    public final List<String> LJIJJLI() {
        VideoLiveManager videoLiveManager = this.LLJILJILJ;
        if (videoLiveManager != null) {
            return videoLiveManager.LLJJ();
        }
        return null;
    }

    @Override // X.C1API
    public final void LJJIFFI() {
        LJJJJLL(LJJIII(28, null));
    }

    @Override // X.C1API
    public final long LJJIIJ() {
        VideoLiveManager videoLiveManager = this.LLJILJILJ;
        if (videoLiveManager != null) {
            return videoLiveManager.LJIILLIIL.LJJ(100);
        }
        return 0L;
    }

    @Override // X.C1API
    public final long c0() {
        VideoLiveManager videoLiveManager = this.LLJILJILJ;
        if (videoLiveManager != null) {
            return videoLiveManager.LLIIJLIL().LIZ;
        }
        return 0L;
    }

    @Override // X.C1API
    public final String d0() {
        VideoLiveManager videoLiveManager = this.LLJILJILJ;
        return videoLiveManager != null ? videoLiveManager.LLILZLL(318) : "";
    }

    @Override // X.C1API
    public final Bitmap getCurrentFrame() {
        VideoLiveManager videoLiveManager = this.LLJILJILJ;
        if (videoLiveManager != null) {
            videoLiveManager.getClass();
        }
        return null;
    }

    @Override // X.C1API
    public final String getCurrentResolution() {
        VideoLiveManager videoLiveManager = this.LLJILJILJ;
        return videoLiveManager != null ? videoLiveManager.LLILZLL(58) : "";
    }

    @Override // X.C1API
    public final Point getVideoSize() {
        return this.LLJILJILJ != null ? new Point(this.LLJILJILJ.LLJILJIL(), this.LLJILJILJ.LLJIJIL()) : new Point(0, 0);
    }

    @Override // X.C1API
    public final boolean isPlaying() {
        VideoLiveManager videoLiveManager = this.LLJILJILJ;
        return videoLiveManager != null && videoLiveManager.LLFFF() == EnumC1487710ooj.PLAYED;
    }

    @Override // X.C1API
    public final boolean isWidevineDrmStream() {
        VideoLiveManager videoLiveManager = this.LLJILJILJ;
        if (videoLiveManager != null) {
            return videoLiveManager.LJJII.LJJIII();
        }
        return false;
    }

    @Override // X.C1API
    public final void play() {
        LJJJJLI("TTLivePlayer2", "play: ");
        this.LLJILJILJ.play();
    }

    @Override // X.C1API
    public final void stop() {
        LJJJJLI("TTLivePlayer2", "stop: ");
        LJJJJLL(LJJIII(12, null));
    }

    @Override // X.AbstractC1700380uLk, X.C1API
    public final void reset() {
        super.reset();
        LJJJJLI("TTLivePlayer2", "reset: ");
        LJJJJLL(LJJIII(15, null));
    }

    @Override // X.C1API
    public final boolean LJJIJ() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.C1API
    public final C1699430uKD getPlayerThreadBlockStatus() {
        return this.LL;
    }

    public C1699260uJw(C1491040ou6 c1491040ou6) {
        ExecutorService executorService;
        if (LivePlayThreadReuseOptSetting.INSTANCE.enableReuseOpt()) {
            this.LLJJIII = C1484670ojp.LIZ.LIZ(EnumC1482310og1.LIVE);
            if (this.LLJJIII != null && this.LLJJIII.LIZ != null) {
                this.LLJJI = this.LLJJIII.LIZ;
            } else {
                this.LLJJI = C1BZJ.LJI();
                this.LLJJI.start();
            }
        } else {
            this.LLJJI = C1BZJ.LJI();
            this.LLJJI.start();
        }
        this.LLJJ = new BPEAHandler(C786410Ut5.W2(this.LLJJI), this);
        if (LiveEnablePlayerSetTimeoutSetting.INSTANCE.getValue() && ((executorService = this.LLJJIJI) == null || executorService.isShutdown())) {
            this.LLJJIJI = C807400Vlq.LIZLLL(new ThreadFactoryC854690Xfv(0));
        }
        LJJJJLL(LJJIII(18, c1491040ou6));
    }

    @Override // X.C1API
    public final String LJIIIZ(int i) {
        VideoLiveManager videoLiveManager = this.LLJILJILJ;
        if (videoLiveManager != null) {
            return videoLiveManager.LLILZLL(i);
        }
        return null;
    }

    @Override // X.C1API
    public final void LJIILIIL(boolean z) {
        LJJJJLL(LJJIII(19, Boolean.valueOf(z)));
    }

    @Override // X.C1API
    public final void LJIILJJIL(boolean z) {
        LJJJJLL(LJJIII(7, Boolean.valueOf(z)));
    }

    @Override // X.C1API
    public final void LJIILLIIL(ArrayList<String> arrayList) {
        LJJJJLL(LJJIII(25, arrayList));
    }

    public final String LJIJI(String str) {
        if (LivePlayerSessionIdSetting.INSTANCE.allowPassSessionId()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("full link >> setBizSessionId: bizSessionId is ");
            sbLIZ.append(str);
            LJJJJLI("TTLivePlayer2", C2188811AlT.LIZIZ(sbLIZ));
            this.LLJILJILJ.LLLLIILL(str);
            return str;
        }
        LJJJJLI("TTLivePlayer2", "setBizSessionId is return due to the switch is off.");
        return null;
    }

    @Override // X.C1API
    public final void LJJ(String str) {
        LJJJJLL(LJJIII(22, str));
    }

    @Override // X.C1API
    public final void LJJI(String str) {
        LJJJJLL(LJJIII(34, str));
    }

    @Override // X.C1API
    public final void LJJII(C1699360uK6 c1699360uK6) {
        C1699360uK6 c1699360uK62 = c1699360uK6;
        if (c1699360uK62 == null) {
            c1699360uK62 = new C1699360uK6("", "", "", null, false, false);
        }
        LJJJJLL(LJJIII(21, c1699360uK62));
    }

    @Override // X.C1API
    public final void LJJIIZI(int i) {
        LJJJJLL(LJJIII(17, Integer.valueOf(i)));
    }

    @Override // X.C1API
    public final void LJJIJIIJIL(int i) {
        LJJJJLL(LJJIII(27, Integer.valueOf(i)));
    }

    @Override // X.C1API
    public final boolean LJJIL(Surface surface) {
        Surface surface2;
        VideoLiveManager videoLiveManager = this.LLJILJILJ;
        if (videoLiveManager != null && (surface2 = videoLiveManager.LJJIJ) != null && surface2 == surface) {
            return true;
        }
        return false;
    }

    @Override // X.C1API
    public final void LJJJ(String str) {
        LJJJJLL(LJJIII(33, str));
    }

    @Override // X.C1API
    public final void LJJJIL(String str) {
        LJJJJLL(LJJIII(20, str));
    }

    @Override // X.C1API
    public final void LJJJJI(Surface surface) {
        LJJJJLL(LJJIII(5, surface));
    }

    @Override // X.C1API
    public final void LJJJJJ(String str) {
        LJJJJLL(LJJIII(14, null));
    }

    public final void LJJJJJL(C1699340uK4 c1699340uK4) {
        String strLJIJI = LJIJI(c1699340uK4.LIZ);
        C0IX5.LJIILJJIL(strLJIJI);
        C465050ILn.LJ(this.LLIZ, "live_sdk_player_start");
        C1700440uLq c1700440uLq = this.LLILZIL;
        if (c1700440uLq != null) {
            c1700440uLq.LLILZIL = strLJIJI;
        }
        if (c1699340uK4.LIZJ) {
            this.LLJILJILJ.LIZJ(155, 1);
        }
        if (!TextUtils.isEmpty(c1699340uK4.LIZIZ)) {
            this.LLJILJILJ.LLLLL(c1699340uK4.LIZIZ);
        }
        this.LLJILJILJ.play();
    }

    public final void LJJJJLL(Message message) {
        if (this.LLJJI != null && this.LLJJI.isAlive() && !this.LLJJI.isInterrupted()) {
            if (this.LLJJ == null) {
                this.LLJJ = new BPEAHandler(C786410Ut5.W2(this.LLJJI), this);
            }
            C786410Ut5.LJLJLJ(this.LLJJ, message, 0L);
        }
    }

    public final void LJJJJZI(C1699340uK4 c1699340uK4) {
        this.LLJILJILJ.LIZJ(156, 73);
        long j = this.LLIZ;
        if (j != 0) {
            this.LLJILJILJ.LIZ(157, String.valueOf(j));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("_prepareAsync, roomId: ");
            sbLIZ.append(this.LLIZ);
            LJJJJLI("waterMark", C2188811AlT.LIZIZ(sbLIZ));
        }
        Long l = c1699340uK4.LIZLLL;
        if (l != null) {
            this.LLJILJILJ.LIZJ(158, l.intValue());
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("_prepareAsync, isPrivate: ");
            sbLIZ2.append(l);
            LJJJJLI("waterMark", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    @Override // X.C1API
    public final void LJJL(SurfaceHolder surfaceHolder) {
        LJJJJLL(LJJIII(6, surfaceHolder));
    }

    @Override // X.C1API
    public final void changeSRSupportScene(boolean z) {
        LJJJJLL(LJJIII(23, Boolean.valueOf(z)));
    }

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
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        String str;
        String str2;
        String strValueOf = "null";
        switch (message.what) {
            case 1:
                C1699300uK0 c1699300uK0 = (C1699300uK0) HandlerHook.getMessageObj(message.obj);
                String str3 = c1699300uK0.LIZ;
                String str4 = c1699300uK0.LIZIZ;
                LJJJJLI("TTLivePlayer2", "setDataSource: with url");
                this.LLJILJILJ.LLLLLL(str3);
                if (!C2093608Ic.LJ(str4)) {
                    this.LLJILJILJ.LIZ(43, str4);
                }
                break;
            case 2:
                C1699320uK2 c1699320uK2 = (C1699320uK2) HandlerHook.getMessageObj(message.obj);
                String str5 = c1699320uK2.LIZ;
                Map<String, String> map = c1699320uK2.LIZIZ;
                if (str5.indexOf("://") <= 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("file://");
                    sbLIZ.append(str5);
                    UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    Uri uri = UriProtector.parse(str5);
                    if (map != null) {
                        str2 = map.get("sdk_params");
                    } else {
                        str2 = "";
                    }
                    this.LLJILJILJ.LLLLLILLIL(new C1698830uJF[]{new C1698830uJF(uri.toString(), null, str2)});
                }
                break;
            case 3:
                C1699340uK4 c1699340uK4 = (C1699340uK4) HandlerHook.getMessageObj(message.obj);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("start: VideoLiveManager");
                sbLIZ2.append(this.LLJILJILJ);
                LJJJJLI("TTLivePlayer2", C2188811AlT.LIZIZ(sbLIZ2));
                if (LiveNetAdaptiveEnableSetting.INSTANCE.getValue()) {
                    this.LLJILJILJ.LIZJ(18, 0);
                    this.LLJILJILJ.LLLLILI(LiveNetAdaptiveHurrySpeedSetting.INSTANCE.getValue(), 19);
                    this.LLJILJILJ.LIZJ(17, LiveNetAdaptiveHurryTimeSetting.INSTANCE.getValue());
                    this.LLJILJILJ.LLLLILI(LiveNetAdaptiveSlowSpeedSetting.INSTANCE.getValue(), 20);
                    this.LLJILJILJ.LIZJ(21, LiveNetAdaptiveSlowTimeSetting.INSTANCE.getValue());
                }
                if (LiveHardwareDecodeH264EnableSetting.INSTANCE.getValue() == 1) {
                    this.LLJILJILJ.LIZJ(35, 1);
                    this.LLJILJILJ.LIZJ(33, 1);
                    this.LLJILJILJ.LIZJ(34, 0);
                }
                if (LiveHardwareDecodeBytevc1EnableSetting.INSTANCE.getValue() == 1) {
                    this.LLJILJILJ.LIZJ(36, 1);
                }
                this.LLJILJILJ.LIZJ(9, 2);
                LJJJJJL(c1699340uK4);
                LJJJJZI(c1699340uK4);
                InterfaceC1700400uLm interfaceC1700400uLm = this.LLJILLL;
                if (interfaceC1700400uLm != null) {
                    ((C1APH) interfaceC1700400uLm).LJJLIIIJJIZ();
                }
                break;
            case 4:
                C1699340uK4 c1699340uK42 = (C1699340uK4) HandlerHook.getMessageObj(message.obj);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("prepareAsync: VideoLiveManager:");
                sbLIZ3.append(this.LLJILJILJ);
                LJJJJLI("TTLivePlayer2", C2188811AlT.LIZIZ(sbLIZ3));
                if (c1699340uK42 != null) {
                    if (!TextUtils.isEmpty(c1699340uK42.LIZIZ)) {
                        this.LLJILJILJ.LLLLL(c1699340uK42.LIZIZ);
                    }
                    LJJJJZI(c1699340uK42);
                }
                this.LLJILJILJ.LIZJ(2, 0);
                if (LiveNetAdaptiveEnableSetting.INSTANCE.getValue()) {
                    this.LLJILJILJ.LIZJ(18, 0);
                    this.LLJILJILJ.LLLLILI(LiveNetAdaptiveHurrySpeedSetting.INSTANCE.getValue(), 19);
                    this.LLJILJILJ.LIZJ(17, LiveNetAdaptiveHurryTimeSetting.INSTANCE.getValue());
                    this.LLJILJILJ.LLLLILI(LiveNetAdaptiveSlowSpeedSetting.INSTANCE.getValue(), 20);
                    this.LLJILJILJ.LIZJ(21, LiveNetAdaptiveSlowTimeSetting.INSTANCE.getValue());
                }
                if (LiveHardwareDecodeH264EnableSetting.INSTANCE.getValue() == 1) {
                    this.LLJILJILJ.LIZJ(35, 1);
                    this.LLJILJILJ.LIZJ(33, 1);
                    this.LLJILJILJ.LIZJ(34, 0);
                }
                if (LiveHardwareDecodeBytevc1EnableSetting.INSTANCE.getValue() == 1) {
                    this.LLJILJILJ.LIZJ(36, 1);
                }
                if (LiveSdkFastOpenDisableSetting.INSTANCE.getValue() == 1) {
                    this.LLJILJILJ.LIZJ(40, 0);
                }
                if (LiveSdkNtpEnableSetting.INSTANCE.getValue() == 1) {
                    this.LLJILJILJ.LIZJ(42, 1);
                }
                this.LLJILJILJ.LLLLILI(((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).calcTargetLoudness(), 143);
                this.LLJILJILJ.LIZJ(9, 2);
                LJJJJJL(c1699340uK42);
                InterfaceC1700400uLm interfaceC1700400uLm2 = this.LLJILLL;
                if (interfaceC1700400uLm2 != null) {
                    ((C1APH) interfaceC1700400uLm2).LJJLIIIJJIZ();
                }
                break;
            case 5:
                Surface surface = (Surface) HandlerHook.getMessageObj(message.obj);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("setSurfaceDisplay: surface = ");
                if (surface != null) {
                    strValueOf = String.valueOf(surface.hashCode());
                }
                sbLIZ4.append(strValueOf);
                LJJJJLI("TTLivePlayer2", C2188811AlT.LIZIZ(sbLIZ4));
                this.LLJILJILJ.setSurface(surface);
                break;
            case 6:
                SurfaceHolder surfaceHolder = (SurfaceHolder) HandlerHook.getMessageObj(message.obj);
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("setSurfaceDisplay: surface holder= ");
                if (surfaceHolder != null) {
                    strValueOf = String.valueOf(surfaceHolder.hashCode());
                }
                sbLIZ5.append(strValueOf);
                LJJJJLI("TTLivePlayer2", C2188811AlT.LIZIZ(sbLIZ5));
                this.LLJILJILJ.LLLLLLL(surfaceHolder);
                break;
            case 7:
                boolean zBooleanValue = ((Boolean) HandlerHook.getMessageObj(message.obj)).booleanValue();
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("setMute: ");
                sbLIZ6.append(zBooleanValue);
                LJJJJLI("TTLivePlayer2", C2188811AlT.LIZIZ(sbLIZ6));
                this.LLJILJILJ.LLLLLIL(zBooleanValue);
                break;
            case 8:
                float fFloatValue = ((Float) HandlerHook.getMessageObj(message.obj)).floatValue();
                LJJJJLI("TTLivePlayer2", "setVolume: ");
                this.LLJILJILJ.LLLLLLZ(fFloatValue);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                boolean zBooleanValue2 = ((Boolean) HandlerHook.getMessageObj(message.obj)).booleanValue();
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("setSeiOpen: ");
                sbLIZ7.append(zBooleanValue2);
                LJJJJLI("TTLivePlayer2", C2188811AlT.LIZIZ(sbLIZ7));
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                String str6 = (String) HandlerHook.getMessageObj(message.obj);
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("switchResolution: ");
                sbLIZ8.append(str6);
                LJJJJLI("TTLivePlayer2", C2188811AlT.LIZIZ(sbLIZ8));
                this.LLJILJILJ.LLLI(str6);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LJJJJLI("TTLivePlayer2", "pause: ");
                this.LLJILJILJ.pause();
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LJJJJLI("TTLivePlayer2", "stop: ");
                this.LLJILJILJ.stop();
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LJJJJLI("TTLivePlayer2", "release: ");
                this.LLJILJILJ.release();
                LJIJ();
                break;
            case 14:
                LJJJJLI("TTLivePlayer2", "releaseAsync: ");
                this.LLJILJILJ.LJIILL();
                LJIJ();
                break;
            case 15:
                this.LLJILJILJ.LLLILZLLLI();
                break;
            case 16:
                HandlerHook.getMessageObj(message.obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                ((Integer) HandlerHook.getMessageObj(message.obj)).intValue();
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                C1491040ou6 c1491040ou6 = (C1491040ou6) HandlerHook.getMessageObj(message.obj);
                LJJJJLI("TTLivePlayer2", "init: ");
                c1491040ou6.getClass();
                c1491040ou6.LJ = new C1700440uLq(c1491040ou6.LIZIZ);
                Context contextN3 = C786410Ut5.N3(c1491040ou6.LIZ);
                AtomicInteger atomicInteger = VideoLiveManager.k3;
                C1698820uJE c1698820uJE = new C1698820uJE(contextN3);
                c1698820uJE.LJFF = 300000;
                c1698820uJE.LIZJ = new InterfaceC1286560jaI() { // from class: X.0uKA
                };
                c1698820uJE.LJ = false;
                c1698820uJE.LIZIZ = c1491040ou6.LJ;
                c1698820uJE.LJII = c1491040ou6.LJI;
                c1698820uJE.LIZLLL = new InterfaceC1699150uJl() { // from class: X.0uKE
                    @Override // X.InterfaceC1699150uJl
                    public final Object LIZ(Object obj, String str7) {
                        if (TextUtils.equals(str7, "network_type") && (obj instanceof String)) {
                            return C804510VhB.LIZ();
                        }
                        if (TextUtils.equals(str7, "time_diff_server_and_client") && (obj instanceof Long)) {
                            return Long.valueOf(C963140bAe.LIZLLL);
                        }
                        C01GW c01gw = C1335980ks0.LIZ;
                        return C1338270kvh.LIZ(obj, str7);
                    }
                };
                VideoLiveManager videoLiveManagerLIZ = c1698820uJE.LIZ();
                c1491040ou6.LIZJ = videoLiveManagerLIZ;
                videoLiveManagerLIZ.LLLL = true;
                videoLiveManagerLIZ.LJIILLIIL.c1 = true;
                if (LiveHttpkDegradeEnabledSetting.INSTANCE.getValue()) {
                    c1491040ou6.LIZJ.LIZJ(39, 1);
                }
                C1BZJ.LJII(c1491040ou6.LIZJ);
                this.LLJILJILJ = c1491040ou6.LIZJ;
                C1700440uLq c1700440uLq = c1491040ou6.LJ;
                this.LLILZIL = c1700440uLq;
                c1700440uLq.LLILZ = this.LLIZ;
                C1700440uLq c1700440uLq2 = this.LLILZIL;
                c1700440uLq2.LL = this.LLJILJIL;
                InterfaceC1700400uLm interfaceC1700400uLm3 = this.LLJILLL;
                if (interfaceC1700400uLm3 != null) {
                    c1700440uLq2.LLILLJJLI = interfaceC1700400uLm3;
                }
                this.LLJILJILJ.LIZJ(44, 0);
                if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
                    this.LLJILJILJ.LIZJ(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, InterfaceC1106030et7.w8.LIZIZ().booleanValue() ? 1 : 0);
                }
                break;
            case 19:
                boolean zBooleanValue3 = ((Boolean) HandlerHook.getMessageObj(message.obj)).booleanValue();
                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                sbLIZ9.append("setPreviewFlag: ");
                sbLIZ9.append(zBooleanValue3);
                LJJJJLI("TTLivePlayer2", C2188811AlT.LIZIZ(sbLIZ9));
                this.LLJILJILJ.LLLLLJIL(zBooleanValue3);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                String str7 = (String) HandlerHook.getMessageObj(message.obj);
                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                sbLIZ10.append("setProjectKey: ");
                sbLIZ10.append(str7);
                LJJJJLI("TTLivePlayer2", C2188811AlT.LIZIZ(sbLIZ10));
                this.LLJILJILJ.LJIILLIIL.LLJJIII = str7;
                break;
            case 21:
                C1699360uK6 c1699360uK6 = (C1699360uK6) HandlerHook.getMessageObj(message.obj);
                VideoLiveManager videoLiveManager = this.LLJILJILJ;
                StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                sbLIZ11.append(c1699360uK6.LIZ);
                sbLIZ11.append("-");
                sbLIZ11.append(c1699360uK6.LIZIZ);
                videoLiveManager.LIZ(63, C2188811AlT.LIZIZ(sbLIZ11));
                this.LLJILJILJ.LIZ(141, c1699360uK6.LJFF);
                this.LLJILJILJ.LIZ(64, c1699360uK6.LIZJ);
                if (c1699360uK6.LIZLLL) {
                    this.LLJILJILJ.LIZJ(131, 3);
                } else {
                    this.LLJILJILJ.LIZJ(131, -1);
                }
                StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                sbLIZ12.append(c1699360uK6.LIZ);
                sbLIZ12.append(", ");
                sbLIZ12.append(c1699360uK6.LIZIZ);
                sbLIZ12.append(", ");
                sbLIZ12.append(c1699360uK6.LJFF);
                sbLIZ12.append(", ");
                sbLIZ12.append(c1699360uK6.LIZJ);
                sbLIZ12.append(", ");
                sbLIZ12.append(c1699360uK6.LIZLLL);
                LJJJJLI("TTLivePlayer2", C2188811AlT.LIZIZ(sbLIZ12));
                break;
            case 22:
                String str8 = (String) HandlerHook.getMessageObj(message.obj);
                if (!C2093608Ic.LJ(str8)) {
                    this.LLJILJILJ.LIZ(86, str8);
                }
                break;
            case 23:
                ((Boolean) HandlerHook.getMessageObj(message.obj)).booleanValue();
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                boolean zBooleanValue4 = ((Boolean) HandlerHook.getMessageObj(message.obj)).booleanValue();
                VideoLiveManager videoLiveManager2 = this.LLJILJILJ;
                if (videoLiveManager2 != null) {
                    videoLiveManager2.LIZJ(56, zBooleanValue4 ? 1 : 0);
                }
                break;
            case 25:
                ArrayList arrayList = (ArrayList) HandlerHook.getMessageObj(message.obj);
                StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                sbLIZ13.append("preloadResource: ");
                sbLIZ13.append(arrayList.size());
                LJJJJLI("TTLivePlayer2", C2188811AlT.LIZIZ(sbLIZ13));
                if (this.LLJILJILJ != null && !C086I.LIZIZ(arrayList)) {
                    this.LLJILJILJ.getClass();
                    break;
                }
                break;
            case 26:
                C1699300uK0 c1699300uK02 = (C1699300uK0) HandlerHook.getMessageObj(message.obj);
                String str9 = c1699300uK02.LIZ;
                String str10 = c1699300uK02.LIZIZ;
                String str11 = c1699300uK02.LIZJ;
                String str12 = c1699300uK02.LIZLLL;
                C09JN<Pair<Integer, Integer>> c09jn = c1699300uK02.LJFF;
                StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                sbLIZ14.append("prepare: VideoLiveManager:");
                sbLIZ14.append(this.LLJILJILJ);
                LJJJJLI("TTLivePlayer2", C2188811AlT.LIZIZ(sbLIZ14));
                if (!C2093608Ic.LJ(str10)) {
                    this.LLJILJILJ.LIZ(43, str10);
                }
                if (LiveNetAdaptiveEnableSetting.INSTANCE.getValue()) {
                    this.LLJILJILJ.LIZJ(18, 0);
                    this.LLJILJILJ.LLLLILI(LiveNetAdaptiveHurrySpeedSetting.INSTANCE.getValue(), 19);
                    this.LLJILJILJ.LIZJ(17, LiveNetAdaptiveHurryTimeSetting.INSTANCE.getValue());
                    this.LLJILJILJ.LLLLILI(LiveNetAdaptiveSlowSpeedSetting.INSTANCE.getValue(), 20);
                    this.LLJILJILJ.LIZJ(21, LiveNetAdaptiveSlowTimeSetting.INSTANCE.getValue());
                }
                if (LiveHardwareDecodeH264EnableSetting.INSTANCE.getValue() == 1) {
                    this.LLJILJILJ.LIZJ(35, 1);
                    this.LLJILJILJ.LIZJ(33, 1);
                    this.LLJILJILJ.LIZJ(34, 0);
                }
                if (LiveHardwareDecodeBytevc1EnableSetting.INSTANCE.getValue() == 1) {
                    this.LLJILJILJ.LIZJ(36, 1);
                }
                this.LLJILJILJ.LIZJ(9, 2);
                if (c1699300uK02.LJ) {
                    this.LLJILJILJ.LIZJ(155, 1);
                }
                LJJJJL(str9, str11, c09jn, str12);
                break;
            case 27:
                int iIntValue = ((Integer) HandlerHook.getMessageObj(message.obj)).intValue();
                VideoLiveManager videoLiveManager3 = this.LLJILJILJ;
                if (videoLiveManager3 != null) {
                    videoLiveManager3.LLLLIILLL(iIntValue);
                }
                break;
            case 28:
                LJJJJLI("TTLivePlayer2", "cancel: ");
                break;
            case 29:
                final SurfaceTexture surfaceTexture = (SurfaceTexture) HandlerHook.getMessageObj(message.obj);
                StringBuilder sbLIZ15 = C2188811AlT.LIZ();
                sbLIZ15.append("_setSurfaceTexture: surfaceTexture = ");
                if (surfaceTexture != null) {
                    strValueOf = String.valueOf(surfaceTexture.hashCode());
                }
                sbLIZ15.append(strValueOf);
                LJJJJLI("TTLivePlayer2", C2188811AlT.LIZIZ(sbLIZ15));
                LJIL(29, LivePlayerThreadTimeOutSetting.INSTANCE.getValue(), new Function0() { // from class: X.0uK5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        C1699260uJw c1699260uJw = this.LL;
                        c1699260uJw.LLJILJILJ.LLLLLLLLLL(surfaceTexture);
                        return null;
                    }
                });
                break;
            case 30:
                C1699300uK0 c1699300uK03 = (C1699300uK0) HandlerHook.getMessageObj(message.obj);
                String str13 = c1699300uK03.LIZ;
                String str14 = c1699300uK03.LIZIZ;
                String str15 = c1699300uK03.LIZJ;
                String str16 = c1699300uK03.LIZLLL;
                LJJJJLI("TTLivePlayer2", "prepare: ");
                if (!C2093608Ic.LJ(str14)) {
                    this.LLJILJILJ.LIZ(43, str14);
                }
                if (LiveNetAdaptiveEnableSetting.INSTANCE.getValue()) {
                    this.LLJILJILJ.LIZJ(18, 0);
                    this.LLJILJILJ.LLLLILI(LiveNetAdaptiveHurrySpeedSetting.INSTANCE.getValue(), 19);
                    this.LLJILJILJ.LIZJ(17, LiveNetAdaptiveHurryTimeSetting.INSTANCE.getValue());
                    this.LLJILJILJ.LLLLILI(LiveNetAdaptiveSlowSpeedSetting.INSTANCE.getValue(), 20);
                    this.LLJILJILJ.LIZJ(21, LiveNetAdaptiveSlowTimeSetting.INSTANCE.getValue());
                }
                if (LiveHardwareDecodeH264EnableSetting.INSTANCE.getValue() == 1) {
                    this.LLJILJILJ.LIZJ(35, 1);
                    this.LLJILJILJ.LIZJ(33, 1);
                    this.LLJILJILJ.LIZJ(34, 0);
                }
                if (LiveHardwareDecodeBytevc1EnableSetting.INSTANCE.getValue() == 1) {
                    this.LLJILJILJ.LIZJ(36, 1);
                }
                this.LLJILJILJ.LIZJ(9, 2);
                LJJJJL(str13, str15, null, str16);
                break;
            case 31:
                HandlerHook.getMessageObj(message.obj);
                if (this.LLJILJILJ != null) {
                    C20441214yg.LJIIIZ("GiftCustomerCamera", "dynamic open texture render, add surface");
                    this.LLJILJILJ.getClass();
                    C1698940uJQ.LIZJ();
                } else {
                    C20441214yg.LJIIIZ("GiftCustomerCamera", "TTLivePlayer2 mLivePlayer = null");
                }
                break;
            case 32:
                HandlerHook.getMessageObj(message.obj);
                if (this.LLJILJILJ != null) {
                    AtomicInteger atomicInteger2 = VideoLiveManager.k3;
                    C1698940uJQ.LIZJ();
                    C20441214yg.LJIIIZ("GiftCustomerCamera", "_resetExtraSurface");
                } else {
                    C20441214yg.LJIIIZ("GiftCustomerCamera", "mLivePlayer = null when _resetExtraSurface");
                }
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                String str17 = (String) HandlerHook.getMessageObj(message.obj);
                StringBuilder sbLIZ16 = C2188811AlT.LIZ();
                sbLIZ16.append("_setCreateEnterMethod: ");
                sbLIZ16.append(str17);
                LJJJJLI("TTLivePlayer2", C2188811AlT.LIZIZ(sbLIZ16));
                this.LLJILJILJ.LIZ(200, str17);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                try {
                    if (HandlerHook.getMessageObj(message.obj) != null && (HandlerHook.getMessageObj(message.obj) instanceof String)) {
                        str = (String) HandlerHook.getMessageObj(message.obj);
                    } else {
                        str = null;
                    }
                    this.LLJILJILJ.LIZ(141, str);
                    StringBuilder sbLIZ17 = C2188811AlT.LIZ();
                    sbLIZ17.append("_updateEnterMethodSubtag, ");
                    sbLIZ17.append(str);
                    LJJJJLI("TTLivePlayer2", C2188811AlT.LIZIZ(sbLIZ17));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ18 = C2188811AlT.LIZ();
                    sbLIZ18.append("set_enter_method_subtag ");
                    sbLIZ18.append(th);
                    C20441214yg.LJ("PlayerTestLog", C2188811AlT.LIZIZ(sbLIZ18));
                    return true;
                }
                break;
            case 35:
                C1699330uK3 c1699330uK3 = (C1699330uK3) HandlerHook.getMessageObj(message.obj);
                this.LLJILJILJ.LLLLLLIL(c1699330uK3.LIZ, c1699330uK3.LIZIZ, c1699330uK3.LIZJ);
                break;
        }
        return true;
    }

    @Override // X.C1API
    public final void release(String str) {
        LJJJJLL(LJJIII(13, null));
    }

    @Override // X.C1API
    public final void setRenderRotation(C0IIZ c0iiz) {
        if (this.LLJILJILJ != null) {
            C0IJ8 c0ij8 = C0IJ8.VeLivePlayerRotation0;
            int i = C464140IIa.LIZ[c0iiz.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        c0ij8 = C0IJ8.VeLivePlayerRotation270;
                    }
                } else {
                    c0ij8 = C0IJ8.VeLivePlayerRotation180;
                }
            } else {
                c0ij8 = C0IJ8.VeLivePlayerRotation90;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("real setRenderRotation:");
            sbLIZ.append(c0ij8);
            sbLIZ.append(". $");
            sbLIZ.append(this.LLJILJILJ.hashCode());
            C20441214yg.LJIIIZ("PlayerTestLog", C2188811AlT.LIZIZ(sbLIZ));
            this.LLJILJILJ.LLLLLJLJLL(c0ij8);
        }
    }

    @Override // X.C1API
    public final void setSeiOpen(boolean z) {
        LJJJJLL(LJJIII(9, Boolean.valueOf(z)));
    }

    @Override // X.C1API
    public final void switchResolution(String str) {
        LJJJJLL(LJJIII(10, str));
    }

    public static Message LJJIII(int i, Object obj) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.obj = obj;
        return messageObtain;
    }

    @Override // X.C1API
    public final void LJIIL(String str, String str2) {
        LJJJJLL(LJJIII(1, new C1699300uK0(str, str2)));
    }

    @Override // X.C1API
    public final void LJJIIZ(int i, Surface surface) {
        String strValueOf;
        if (surface != null) {
            strValueOf = String.valueOf(surface.hashCode());
        } else {
            strValueOf = "null";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timeout:");
        sbLIZ.append(i);
        sbLIZ.append(" surface:");
        sbLIZ.append(strValueOf);
        sbLIZ.append(" <===> player hash:");
        sbLIZ.append(hashCode());
        C827750WdZ.LIZJ("syncSetSurface", C2188811AlT.LIZIZ(sbLIZ));
        LJJJJZ(i, surface);
    }

    @Override // X.C1API
    public final void LJJIJLIJ(C0IMA c0ima, boolean z) {
        C1700360uLi.LJI.getClass();
        C1700320uLe.LIZ();
        C1699340uK4 c1699340uK4 = new C1699340uK4();
        String str = c0ima.LIZ;
        if (str == null) {
            str = "";
        }
        c1699340uK4.LIZ = str;
        c1699340uK4.LIZJ = z;
        LJJJJLL(LJJIII(3, c1699340uK4));
    }

    @Override // X.C1API
    public final void LJJJI(InterfaceC1700420uLo interfaceC1700420uLo, InterfaceC1700400uLm interfaceC1700400uLm) {
        this.LLILZ = interfaceC1700420uLo;
        C1700440uLq c1700440uLq = this.LLILZIL;
        if (c1700440uLq != null) {
            c1700440uLq.LLILLJJLI = interfaceC1700400uLm;
        }
        this.LLJILLL = interfaceC1700400uLm;
    }

    @Override // X.C1API
    public final void LJJJJIZL(int i, Surface surface) {
        String strValueOf;
        ExecutorService executorService;
        if (surface != null) {
            strValueOf = String.valueOf(surface.hashCode());
        } else {
            strValueOf = "null";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timeout:");
        sbLIZ.append(i);
        sbLIZ.append(" surface:");
        sbLIZ.append(strValueOf);
        sbLIZ.append(" <===> player hash:");
        sbLIZ.append(hashCode());
        C827750WdZ.LIZJ("asyncSetSurface", C2188811AlT.LIZIZ(sbLIZ));
        if (LiveEnableThreadPoolExp.getEnable() && (executorService = this.LLJJIJI) != null && !executorService.isShutdown()) {
            this.LLJJIJI.submit(new ARunnableS31S0201000_26(i, this, surface, 2));
            return;
        }
        BPEAHandler bPEAHandler = this.LLJJ;
        if (bPEAHandler != null) {
            C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS31S0201000_26(i, this, surface, 0));
        } else {
            LJJIIZ(i, surface);
        }
    }

    public final void LJJJJLI(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append(" <===> player hash:");
        sbLIZ.append(hashCode());
        C827750WdZ.LIZJ(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJJJJZ(int i, Surface surface) {
        VideoLiveManager videoLiveManager = this.LLJILJILJ;
        if (videoLiveManager != null) {
            videoLiveManager.LLLLZIL(i, surface);
        }
        if (surface != null) {
            this.LLJJIJIIJIL = false;
        } else {
            this.LLJJIJIIJIL = true;
        }
    }

    @Override // X.C1API
    public final void switchResolution(String str, InterfaceC1699420uKC interfaceC1699420uKC) {
        if (this.LLJJ == null) {
            this.LLJJ = new BPEAHandler(C786410Ut5.W2(this.LLJJI), this);
        }
        LJJJJLL(Message.obtain(this.LLJJ, new ARunnableS29S1200000_26(this, interfaceC1699420uKC, str, 0)));
    }

    @Override // X.C1API
    public final void LJII(SurfaceControl surfaceControl, int i, int i2) {
        LJJJJLL(LJJIII(35, new C1699330uK3(surfaceControl, i, i2)));
    }

    public final void LJIL(int i, int i2, Function0 function0) {
        ExecutorService executorService;
        if (LiveEnablePlayerSetTimeoutSetting.INSTANCE.getValue() && (executorService = this.LLJJIJI) != null && !executorService.isShutdown()) {
            try {
                this.LLJJIJI.submit(new ACallableS411S0100000_3(function0, 4)).get(i2, TimeUnit.MILLISECONDS);
                return;
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
                this.LL = new C1699430uKD(i);
                return;
            } catch (ExecutionException e2) {
                TryCatchGuardChecker.doCheck(e2);
                this.LL = new C1699430uKD(i);
                return;
            } catch (TimeoutException e3) {
                TryCatchGuardChecker.doCheck(e3);
                this.LL = new C1699430uKD(i);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LL = new C1699430uKD(i);
                return;
            }
        }
        function0.invoke();
    }

    @Override // X.C1API
    public final void LJJIIJZLJL(String str, String str2, C0IMA c0ima) {
        String str3 = c0ima.LIZ;
        if (str3 == null) {
            str3 = "";
        }
        long jLIZ = C0IM9.LIZ(c0ima);
        C1699300uK0 c1699300uK0 = new C1699300uK0(str, str2);
        c1699300uK0.LIZJ = str3;
        c1699300uK0.LIZLLL = String.valueOf(jLIZ);
        LJJJJLL(LJJIII(30, c1699300uK0));
    }

    @Override // X.C1API
    public final void LJJIJIIJI(C0IMA c0ima, boolean z, Long l) {
        C1700360uLi.LJI.getClass();
        C1700320uLe.LIZ();
        C1699340uK4 c1699340uK4 = new C1699340uK4();
        String str = c0ima.LIZ;
        if (str == null) {
            str = "";
        }
        c1699340uK4.LIZ = str;
        c1699340uK4.LIZIZ = C0IM9.LIZIZ(c0ima);
        c1699340uK4.LIZJ = z;
        c1699340uK4.LIZLLL = l;
        LJJJJLL(LJJIII(4, c1699340uK4));
    }

    @Override // X.C1API
    public final void LJJIJIL(int i, boolean z, boolean z2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSuperResolutionOptions: ");
        sbLIZ.append(z);
        sbLIZ.append(",");
        sbLIZ.append(z2);
        sbLIZ.append(",");
        sbLIZ.append(i);
        LJJJJLI("TTLivePlayer2", C2188811AlT.LIZIZ(sbLIZ));
        LJJJJLL(LJJIII(16, new Object() { // from class: X.0uKB
        }));
    }

    @Override // X.C1API
    public final void LJJIZ(String str, Map<String, String> map, EnumC1700430uLp enumC1700430uLp) {
        LJJJJLL(LJJIII(2, new C1699320uK2(str, map, enumC1700430uLp)));
    }

    @Override // X.C1API
    public final void LJIJJ(String str, String str2, boolean z, C0IMA c0ima) {
        C1699300uK0 c1699300uK0 = new C1699300uK0(str, str2);
        String str3 = c0ima.LIZ;
        if (str3 == null) {
            str3 = "";
        }
        c1699300uK0.LIZJ = str3;
        c1699300uK0.LJ = z;
        c1699300uK0.LIZLLL = C0IM9.LIZIZ(c0ima);
        LJJJJLL(LJJIII(26, c1699300uK0));
    }

    @Override // X.C1API
    public final void LJJJJ(String str, String str2, boolean z, C0IMA c0ima) {
        C09JN c09jn = C1700770uMN.LL;
        C1699300uK0 c1699300uK0 = new C1699300uK0(str, str2);
        String str3 = c0ima.LIZ;
        if (str3 == null) {
            str3 = "";
        }
        c1699300uK0.LIZJ = str3;
        c1699300uK0.LJFF = c09jn;
        c1699300uK0.LJ = z;
        c1699300uK0.LIZLLL = C0IM9.LIZIZ(c0ima);
        LJJJJLL(LJJIII(26, c1699300uK0));
    }

    public final void LJJJJL(String str, String str2, C09JN<Pair<Integer, Integer>> c09jn, String str3) {
        LJIJI(str2);
        this.LLJILJILJ.LLLLL(str3);
        this.LLJILJILJ.LLLII(str);
        if (c09jn != null) {
            try {
                c09jn.accept(new Pair<>(Integer.valueOf(this.LLJILJILJ.LLJILJIL()), Integer.valueOf(this.LLJILJILJ.LLJIJIL())));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
