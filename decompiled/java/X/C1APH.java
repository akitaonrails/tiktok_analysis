package X;

import Y.ACallableS411S0100000_3;
import Y.ARunnableS102S0200000_33;
import Y.ARunnableS133S0100000_33;
import Y.ARunnableS7S1000000_12;
import Y.AfS131S0000000_3;
import Y.AfS202S0100000_33;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.dataChannel.GlobalInflowMessage;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveLogFilterSwitchAbSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostCpuTotalPssOpt;
import com.bytedance.android.livesdk.livesetting.performance.LiveOptSeiInUIExp;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayerGetPssDisableOpt;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveWatchPreloadSettings;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveCadSmoothExitSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveIgnoreSameSurfaceExp;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveIgnoreSmoothEnterFirstFrameExp;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveInstanceOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveOptSurfaceDestroyReleaseExp;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveStaticLogOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveViewPagerOnMeasureOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveReleaseInnerSurfaceAsyncExp;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveReleaseSurfaceAsyncExp;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveReleaseSurfaceTimeInnerSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveReleaseSurfaceTimeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveSetSurfaceTimeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LiveInnerStreamUseSurfaceControlExp;
import com.bytedance.android.livesdk.livesetting.watchlive.previewlive.LiveUseSurfaceControlExp;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.utils.ScreenShotUtils;
import com.bytedance.android.livesdkapi.depend.handler.WeakHandler;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1APH, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1APH implements InterfaceC480510Isr, InterfaceC469080IaQ, InterfaceC465240IMg, InterfaceC1700420uLo, InterfaceC1700400uLm {
    public static final C480590Isz LLLLL = new C480590Isz(new C480600It0());
    public static String LLLLLIL = "unknown";
    public static final WeakHashMap<C1API, C1699360uK6> LLLLLILLIL = new WeakHashMap<>();
    public static final HashMap<String, Integer> LLLLLJIL = new HashMap<>();
    public C1API LL;
    public volatile C1API LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public InterfaceC463820IGu LLILZLL;
    public volatile boolean LLIZ;
    public volatile boolean LLIZLLLIL;
    public volatile Bitmap LLJ;
    public Surface LLJI;
    public SurfaceHolder LLJIJIL;
    public boolean LLJJJIL;
    public final WeakHandler LLJJJJLIIL;
    public InterfaceC480650It5 LLJJL;
    public volatile int LLJJLIIIJLLLLLLLZ;
    public long LLJL;
    public LiveMode LLJLIL;
    public final C1286680jaU LLJLILLLLZIIL;
    public SoftReference<InterfaceC480660It6> LLJLL;
    public final Context LLJLLIL;
    public final InterfaceC1491080ouA LLJLLL;
    public C0IXC LLLIIIIL;
    public long LLLILZ;
    public C11JF LLLILZJ;
    public int LLLILZLLLI;
    public final C1APL LLLIZZ;
    public final C1APK LLLJ;
    public long LLLJIL;
    public String LLLJL;
    public String LLLL;
    public C1699360uK6 LLLLII;
    public boolean LLLLIIIILLL;
    public boolean LLLLIIL;
    public boolean LLLLIILL;
    public boolean LLLLIILLL;
    public boolean LLLLIL;
    public Boolean LLLLILI;
    public String LLLLJ;
    public C19487011Lw LLLLJI;
    public final CopyOnWriteArrayList<C0IIY> LLJILJIL = new CopyOnWriteArrayList<>();
    public volatile boolean LLJILJILJ = false;
    public volatile long LLJILLL = 0;
    public String LLJJ = "";
    public String LLJJI = "";
    public String LLJJIII = "";
    public String LLJJIJI = "";
    public boolean LLJJIJIIJIL = false;
    public String LLJJIJIL = null;
    public C480590Isz LLJJJ = LLLLL;
    public boolean LLJJJJ = false;
    public boolean LLJJJJJIL = false;
    public String LLJZ = "";
    public boolean LLJZIJLIL = true;
    public boolean LLL = false;
    public boolean LLLF = false;
    public boolean LLLFF = true;
    public long LLLFFI = 0;
    public boolean LLLFZ = true;
    public boolean LLLI = false;
    public boolean LLLII = true;
    public boolean LLLIIII = false;
    public final BPEAHandler LLLIIIL = new BPEAHandler(Looper.getMainLooper());
    public final CopyOnWriteArrayList<C1APY> LLLIIL = new CopyOnWriteArrayList<>();
    public C0IIZ LLLIILIL = C0IIZ.VeLivePlayerRotation0;
    public final int LLLIL = EnumC1279670jPB.PREPARING.ordinal();

    @Override // X.InterfaceC480510Isr
    public final void D0() {
        this.LLIZLLLIL = true;
        C823050WQl.LIZJ().execute(new ARunnableS133S0100000_33(this, 13));
    }

    @Override // X.InterfaceC480510Isr
    public final void L0() {
        this.LLLLIIL = false;
    }

    @Override // X.InterfaceC480520Iss
    public final void LJII() {
    }

    @Override // X.InterfaceC480520Iss
    public final void LJJIIZ() {
        J0(null, null, 0, null, null, null, null, null);
        throw null;
    }

    @Override // X.InterfaceC480510Isr
    public final void n0() {
        LJJZZI(false);
    }

    public static boolean LJJLIIIIJ() {
        return Build.VERSION.SDK_INT >= 29 && LiveUseSurfaceControlExp.getEnable();
    }

    public static boolean LJJLIIIJ() {
        return Build.VERSION.SDK_INT >= 29 && LiveInnerStreamUseSurfaceControlExp.getEnable();
    }

    @Override // X.InterfaceC480510Isr
    public final void I0() {
        C1API c1api = this.LL;
        if (c1api != null) {
            ((AbstractC1700380uLk) c1api).LLJIJIL.clear();
        }
    }

    @Override // X.InterfaceC480510Isr
    public final int LIZJ() {
        C1API c1api = this.LL;
        if (c1api != null) {
            return c1api.LIZJ();
        }
        return -1;
    }

    @Override // X.InterfaceC480520Iss
    public final void LIZLLL() {
        C1API c1api = this.LL;
        if (c1api != null) {
            c1api.LIZLLL();
        }
    }

    @Override // X.InterfaceC480510Isr
    public final int LJ() {
        C1API c1api = this.LL;
        if (c1api != null) {
            return c1api.LJ();
        }
        return -1;
    }

    @Override // X.InterfaceC480510Isr
    public final JSONObject LJI() {
        C1API c1api = this.LL;
        return c1api != null ? c1api.LJI() : new JSONObject();
    }

    @Override // X.InterfaceC480510Isr
    public final String LJIIIIZZ() {
        C1API c1api = this.LL;
        return c1api != null ? c1api.LJIIIIZZ() : "";
    }

    @Override // X.InterfaceC480520Iss
    public final List<String> LJIJJLI() {
        C1API c1api = this.LL;
        if (c1api != null) {
            return c1api.LJIJJLI();
        }
        return null;
    }

    @Override // X.InterfaceC480520Iss
    public final void LJJIFFI() {
        C1API c1api = this.LL;
        if (c1api != null) {
            c1api.LJJIFFI();
        }
    }

    @Override // X.InterfaceC480520Iss
    public final long LJJIIJ() {
        C1API c1api = this.LL;
        if (c1api != null) {
            return c1api.LJJIIJ();
        }
        return 0L;
    }

    @Override // X.InterfaceC480520Iss
    public final void LJJIJLIJ() {
        C480540Isu c480540Isu = new C480540Isu(this);
        C1286680jaU c1286680jaU = this.LLJLILLLLZIIL;
        c1286680jaU.LIZ = false;
        c1286680jaU.getClass();
        c480540Isu.LIZIZ(null, this.LLJZ, true);
        C480530Ist c480530Ist = c480540Isu.LIZIZ;
        HashSet hashSet = (HashSet) C480710ItB.LIZJ;
        hashSet.remove(c480530Ist);
        if (hashSet.isEmpty()) {
            try {
                C480710ItB.LIZ.abandonAudioFocus(C480710ItB.LIZIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJIIL("AudioFocusUtil", "returnFocus error");
            }
        }
        try {
            C480710ItB.LIZ.abandonAudioFocus(C480710ItB.LIZIZ);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C20441214yg.LJIIL("AudioFocusUtil", "returnFocus error");
        }
        t0(this.LLJZ, "release all force", true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("release player force! -> player: ");
        sbLIZ.append(hashCode());
        sbLIZ.append(" release()");
        C827750WdZ.LIZ("LivePlayController", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJJIL = false;
        C1API c1api = this.LL;
        if (c1api != null) {
            c1api.stop();
        }
        C1API c1api2 = this.LL;
        if (c1api2 != null) {
            c1api2.LJJJI(null, null);
            this.LL.release(this.LLJZ);
            this.LL = null;
        }
        LIZIZ("releaseAllForce");
    }

    @Override // X.InterfaceC480520Iss
    public final int LJJJIL() {
        if (C2093608Ic.LJ(this.LLJJ) && C2093608Ic.LJ(this.LLJJI)) {
            return 0;
        }
        return !C2093608Ic.LJ(this.LLJJ) ? 1 : 2;
    }

    @Override // X.InterfaceC480520Iss
    public final void LJJJJJL() {
        C827750WdZ.LIZ("LivePlayController", "remove one px texture view");
    }

    @Override // X.InterfaceC480520Iss
    public final void LJJJJL() {
        C1API c1api = this.LL;
        if (c1api != null) {
            c1api.LJJL(null);
        }
    }

    public final void LJJJJZI() {
        C19487011Lw c19487011Lw = this.LLLLJI;
        if (c19487011Lw != null && !c19487011Lw.isDisposed()) {
            this.LLLLJI.dispose();
            this.LLLLJI = null;
        }
        LJIILL(false);
    }

    public final void LJJLIIIJJIZ() {
        C827750WdZ.LIZ("LivePlayController", "player callback onStartPulling()");
        InterfaceC480650It5 interfaceC480650It5 = this.LLJJL;
        if (interfaceC480650It5 instanceof InterfaceC485640J2s) {
            try {
                ((InterfaceC485640J2s) interfaceC480650It5).o();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        String currentResolution = getCurrentResolution();
        ConcurrentHashMap<String, Boolean> concurrentHashMap = C465150ILx.LIZ;
        String str = this.LLJZ;
        C1699360uK6 c1699360uK6 = this.LLLLII;
        boolean z = c1699360uK6 != null ? c1699360uK6.LIZLLL : false;
        boolean z2 = this.LLLF;
        if (str != null && str.length() != 0) {
            if (z2) {
                C465150ILx.LIZ.put(str, Boolean.valueOf(z));
            } else {
                C465150ILx.LIZIZ.put(str, Boolean.valueOf(z));
            }
            Iterator<InterfaceC465170ILz> it2 = C465150ILx.LIZJ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(str, true, z, z2);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStartPulling, currentResolution= ");
        sbLIZ.append(currentResolution);
        C20441214yg.LJIIIZ("LivePlayController", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC480520Iss
    public final void LJJLIIIJLLLLLLLZ() {
        if (this.LL != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" release player: ");
            sbLIZ.append(this.LL.hashCode());
            sbLIZ.append(" tag: ");
            sbLIZ.append(this.LLJZ);
            sbLIZ.append(" option code: ");
            sbLIZ.append(this.LLLILZLLLI);
            C20441214yg.LJIIIZ("Play_Controller_Instance", C2188811AlT.LIZIZ(sbLIZ));
            this.LL.LJJJI(null, null);
            this.LL.release(this.LLJZ);
            this.LL = null;
        }
        LIZIZ("releasePlayer");
    }

    public final void LJJZ() {
        LiveMode liveMode = this.LLJLIL;
        if (liveMode == LiveMode.SCREEN_RECORD || liveMode == LiveMode.THIRD_PARTY || liveMode == LiveMode.LIVE_STUDIO || liveMode == LiveMode.OFFICIAL_ACTIVITY) {
            if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isInMusicallyRegion()) {
                this.LL.LJJJIL("musically_game_live");
                return;
            } else {
                this.LL.LJJJIL("tiktok_game_live");
                return;
            }
        }
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isInMusicallyRegion()) {
            this.LL.LJJJIL("musically_live");
        } else {
            this.LL.LJJJIL("tiktok_live");
        }
    }

    public final void LJL() {
        C1API c1api = this.LL;
        if (c1api == null) {
            return;
        }
        if (!this.LLJZIJLIL) {
            c1api.LJJIIZI(0);
        } else if (this.LLL || this.LLLLIIIILLL) {
            c1api.LJJIIZI(3);
        } else {
            c1api.LJJIIZI(2);
        }
    }

    @Override // X.InterfaceC480510Isr
    public final long c0() {
        C1API c1api = this.LL;
        if (c1api != null) {
            return c1api.c0();
        }
        return 0L;
    }

    @Override // X.InterfaceC480510Isr
    public final String d0() {
        C1API c1api = this.LL;
        return c1api != null ? c1api.d0() : "";
    }

    @Override // X.InterfaceC480510Isr
    public final void dynamicOpenTextureRender() {
        C1API c1api = this.LL;
        if (c1api != null) {
            c1api.dynamicOpenTextureRender();
        }
    }

    @Override // X.InterfaceC480510Isr
    public final boolean getAndClearResumeFromAbovePage() {
        boolean z = this.LLLLIILLL;
        this.LLLLIILLL = false;
        return z;
    }

    @Override // X.InterfaceC480510Isr
    public final String getCurrentResolution() {
        C1API c1api = this.LL;
        return c1api != null ? c1api.getCurrentResolution() : "";
    }

    @Override // X.InterfaceC480510Isr
    public final C1281010jRL getLiveNetworkState() {
        C1API c1api = this.LL;
        if (c1api != null) {
            return c1api.getNetworkState();
        }
        return null;
    }

    @Override // X.InterfaceC480510Isr
    public final C1699430uKD getPlayerThreadBlockStatus() {
        C1API c1api = this.LL;
        if (c1api != null) {
            return c1api.getPlayerThreadBlockStatus();
        }
        return null;
    }

    @Override // X.InterfaceC480520Iss
    public final View getVideoView() {
        Object obj = this.LLILZLL;
        if (obj instanceof View) {
            return (View) obj;
        }
        return null;
    }

    public final int hashCode() {
        C1API c1api = this.LL;
        if (c1api != null) {
            return c1api.hashCode();
        }
        return -1;
    }

    @Override // X.InterfaceC480510Isr
    public final boolean i0() {
        int i = this.LLILZ;
        return i == 6 || i == 7;
    }

    @Override // X.InterfaceC480520Iss
    public final boolean isPlaying() {
        C1API c1api = this.LL;
        boolean z = c1api != null && c1api.isPlaying();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playing -> controller");
        sbLIZ.append(hashCode());
        sbLIZ.append(" status: ");
        sbLIZ.append(z);
        C827750WdZ.LIZ("LivePlayController", C2188811AlT.LIZIZ(sbLIZ));
        return z;
    }

    @Override // X.InterfaceC480510Isr
    public final boolean isVideoHorizontal() {
        Point videoSize;
        C1API c1api = this.LL;
        return (c1api == null || (videoSize = c1api.getVideoSize()) == null || videoSize.x <= videoSize.y) ? false : true;
    }

    @Override // X.InterfaceC480520Iss
    public final boolean isWidevineDrmStream() {
        C1API c1api = this.LL;
        if (c1api != null) {
            return c1api.isWidevineDrmStream();
        }
        return false;
    }

    @Override // X.InterfaceC480510Isr
    public final int p0() {
        C1API c1api = this.LL;
        if (c1api == null) {
            return this.LLJJLIIIJLLLLLLLZ;
        }
        Point videoSize = c1api.getVideoSize();
        return (videoSize.y << 16) | videoSize.x;
    }

    @Override // X.InterfaceC480510Isr
    public final void r0() {
        C1286680jaU c1286680jaU = this.LLJLILLLLZIIL;
        c1286680jaU.LIZ = true;
        c1286680jaU.LIZIZ = C497740JfY.LJIILLIIL();
        c1286680jaU.LIZJ = C497740JfY.LJIIZILJ();
        C2339809Eu.LIZJ();
        if (LiveHostCpuTotalPssOpt.enable() || LivePlayerGetPssDisableOpt.INSTANCE.getDisable()) {
            return;
        }
        C2339809Eu.LIZJ().LIZ(new ACallableS411S0100000_3(c1286680jaU, 5));
    }

    @Override // X.InterfaceC480510Isr
    public final void stopUseTextureRender() {
        C1API c1api = this.LL;
        if (c1api != null) {
            c1api.stopUseTextureRender();
        }
    }

    @Override // X.InterfaceC480510Isr
    public final void z0() {
        C1286680jaU c1286680jaU = this.LLJLILLLLZIIL;
        c1286680jaU.LIZ = false;
        c1286680jaU.getClass();
    }

    @Override // X.InterfaceC480520Iss
    public final String LJFF() {
        String strLJIIIZ;
        if (LiveStaticLogOptSetting.enable()) {
            C1API c1api = this.LL;
            return (c1api == null || (strLJIIIZ = c1api.LJIIIZ(313)) == null) ? "" : strLJIIIZ;
        }
        C1API c1api2 = this.LL;
        return (c1api2 == null || c1api2.LJI() == null) ? "" : this.LL.LJI().optString("url:", "");
    }

    public final void LJJLI() {
        if (!LJJLIIIJ()) {
            this.LL.LJJL(this.LLJIJIL);
            return;
        }
        SurfaceView surfaceView = (SurfaceView) this.LLILZLL;
        if (surfaceView.getSurfaceControl() == null || !surfaceView.getSurfaceControl().isValid()) {
            return;
        }
        this.LL.LJII(surfaceView.getSurfaceControl(), surfaceView.getWidth(), surfaceView.getHeight());
    }

    public final void LJJLIIIJJI() {
        C1API c1api;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDisplayStateChanged -> ");
        sbLIZ.append(this.LLILZ);
        C827750WdZ.LIZ("LivePlayController", C2188811AlT.LIZIZ(sbLIZ));
        if ((this.LLILZ & 2) > 0 && (c1api = this.LL) != null) {
            InterfaceC463820IGu interfaceC463820IGu = this.LLILZLL;
            if (interfaceC463820IGu instanceof C1A7I) {
                LJJLI();
            } else if ((interfaceC463820IGu instanceof C1A7G) || (interfaceC463820IGu instanceof C20856616jU)) {
                c1api.LJJJJI(this.LLJI);
            } else if (interfaceC463820IGu instanceof C1A7J) {
                if (LJJLIIIIJ()) {
                    SurfaceView surfaceView = (SurfaceView) this.LLILZLL;
                    this.LL.LJII(surfaceView.getSurfaceControl(), surfaceView.getWidth(), surfaceView.getHeight());
                } else {
                    Surface surface = ((C1A7J) this.LLILZLL).getSurface();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onDisplayStateChanged ->  try to get  SurfaceRenderV2View render:");
                    sbLIZ2.append(surface != null);
                    C827750WdZ.LIZ("LivePlayController", C2188811AlT.LIZIZ(sbLIZ2));
                    if (surface != null && (LiveIgnoreSameSurfaceExp.getEnable() || !this.LL.LJJIL(surface))) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("onDisplayStateChanged ->  to set  SurfaceRenderV2View render cause not set:");
                        sbLIZ3.append(surface.hashCode());
                        C827750WdZ.LIZ("LivePlayController", C2188811AlT.LIZIZ(sbLIZ3));
                        this.LLILZLL.getClass();
                        int time = LiveSetSurfaceTimeSetting.getTime();
                        if (LiveReleaseSurfaceAsyncExp.enable() && surface.isValid()) {
                            this.LL.LJJJJIZL(time, surface);
                        } else {
                            this.LL.LJJIIZ(time, surface);
                        }
                    }
                }
            }
            if ((this.LLILZ & 1) > 0 && this.LLJJJIL && !this.LL.isPlaying()) {
                this.LL.LJJIJLIJ(new C0IMA(this.LLLL, Long.valueOf(this.LLJL), false, this.LLLLJ), false);
            }
        }
        int i = this.LLILZ;
        if ((i == 6 || i == 7) && this.LLJJJIL) {
            C827750WdZ.LIZ("LivePlayController", "first frame -> send first frame message");
            InterfaceC480650It5 interfaceC480650It5 = this.LLJJL;
            if (interfaceC480650It5 == null || this.LLILZIL) {
                return;
            }
            interfaceC480650It5.LLLLJ(EnumC1913550ztZ.DISPLAYED_PLAY, null);
            this.LLILZIL = true;
        }
    }

    @Override // X.InterfaceC480510Isr
    public final boolean b0() {
        return isPlaying() || (this.LLILZLL instanceof C1A7J);
    }

    @Override // X.InterfaceC480520Iss
    public final String LJJIZ() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC480520Iss
    public final void LJJJ() {
        LJJJJZI();
    }

    @Override // X.InterfaceC480520Iss
    public final boolean getIfPreviewUsingPlayer() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC480510Isr
    public final String getPlayerTag() {
        return this.LLJZ;
    }

    @Override // X.InterfaceC480520Iss
    public final int getVideoSize() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC480510Isr
    public final boolean h0() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC480510Isr
    public final boolean isHadGamePreviewLiveVideoRotated() {
        return this.LLLI;
    }

    @Override // X.InterfaceC480520Iss
    public final boolean isMute() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC480510Isr
    public final int k0() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC480510Isr
    public final String s0() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC480510Isr
    public final long u0() {
        return this.LLJILLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C945320ahu LJJL(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1APH.LJJL(java.lang.Object):X.0ahu");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    @Override // X.InterfaceC480510Isr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0(java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1APH.A0(java.lang.String):void");
    }

    @Override // X.InterfaceC480510Isr
    public final void C0(long j) {
        this.LLLFFI = j;
    }

    @Override // X.InterfaceC480510Isr
    public final void F0(C0IIX c0iix) {
        this.LLJILJIL.remove(c0iix);
    }

    @Override // X.InterfaceC480510Isr
    public final void G0(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopFromAbovePage -> playerTag: ");
        sbLIZ.append(str);
        sbLIZ.append(" ,mPlayContextTag:");
        sbLIZ.append(this.LLJZ);
        sbLIZ.append(" ,player: ");
        sbLIZ.append(hashCode());
        C827750WdZ.LIZ("LivePlayController", C2188811AlT.LIZIZ(sbLIZ));
        if (!TextUtils.equals(str, this.LLJZ)) {
            return;
        }
        this.LLJJJIL = false;
        C1API c1api = this.LL;
        if (c1api != null) {
            c1api.stop();
        }
        this.LLLIIL.clear();
        this.LLLLIILLL = true;
    }

    @Override // X.InterfaceC480510Isr
    public final void H0(long j) {
        if (j > 0) {
            this.LLJILLL = j;
        }
    }

    @Override // X.InterfaceC480510Isr
    public final void K0(String str) {
        if (!TextUtils.equals(str, this.LLJZ)) {
            return;
        }
        InterfaceC480650It5 interfaceC480650It5 = this.LLJJL;
        if (interfaceC480650It5 != null) {
            interfaceC480650It5.LLLLJ(EnumC1913550ztZ.STOP_WHEN_PLAYING_OTHER, null);
        }
        LJIJ(str);
    }

    @Override // X.InterfaceC480510Isr
    public final void LIZ(boolean z) {
        C1API c1api = this.LL;
        if (c1api != null) {
            c1api.LIZ(z);
        }
    }

    @Override // X.InterfaceC480510Isr
    public final void LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reset -> source: ");
        sbLIZ.append(str);
        C827750WdZ.LIZ("LivePlayController", C2188811AlT.LIZIZ(sbLIZ));
        boolean z = false;
        this.LLJILJILJ = false;
        this.LLJILLL = 0L;
        this.LLLLIILL = true;
        this.LLILLJJLI = null;
        this.LLJJL = null;
        this.LLJJJIL = false;
        this.LLJJ = "";
        this.LLJJI = "";
        this.LLJJJ = LLLLL;
        LJJJLIIL("reset");
        this.LLILZLL = null;
        if (this.LLJIJIL != null) {
            this.LLJIJIL = null;
        }
        Surface surface = this.LLJI;
        if (surface != null) {
            surface.release();
            this.LLJI = null;
        }
        this.LLJJLIIIJLLLLLLLZ = 0;
        this.LLLLIIL = false;
        LJJLJ(true);
        LJJZZIII(false);
        this.LLLFZ = true;
        this.LLJJJJ = false;
        this.LLLI = false;
        ConcurrentHashMap<String, Boolean> concurrentHashMap = C465150ILx.LIZ;
        String str2 = this.LLJZ;
        C1699360uK6 c1699360uK6 = this.LLLLII;
        if (c1699360uK6 != null) {
            z = c1699360uK6.LIZLLL;
        }
        C465150ILx.LIZ(str2, z, this.LLLF);
    }

    @Override // X.InterfaceC480520Iss
    public final void LJIIIZ(C0IXC c0ixc) {
        this.LLLIIIIL = c0ixc;
    }

    @Override // X.InterfaceC480510Isr
    public final void LJIIJ(int i) {
        C1API c1api = this.LL;
        if (c1api != null) {
            c1api.LJIIJ(i);
        }
    }

    @Override // X.InterfaceC480520Iss
    public final void LJIIJJI(boolean z) {
        this.LLLII = z;
    }

    @Override // X.InterfaceC480520Iss
    public final void LJIILIIL(boolean z) {
        this.LLLF = z;
        C1API c1api = this.LL;
        if (c1api != null) {
            c1api.LJIILIIL(z);
        }
        LiveIgnoreSmoothEnterFirstFrameExp.setIsSmoothEnterOrPreview(this.LLLLIL, z);
    }

    @Override // X.InterfaceC480520Iss
    public final void LJIILL(boolean z) {
        C1API c1api = this.LL;
        if (c1api != null) {
            c1api.LJIILL(z);
        }
    }

    @Override // X.InterfaceC480520Iss
    public final void LJIILLIIL(ArrayList<String> arrayList) {
        if (this.LL != null && !C086I.LIZIZ(arrayList)) {
            this.LL.LJIILLIIL(arrayList);
        }
    }

    @Override // X.InterfaceC480510Isr
    public final void LJIIZILJ(boolean z) {
        C1API c1api = this.LL;
        if (c1api != null) {
            c1api.LJIIZILJ(z);
        }
    }

    @Override // X.InterfaceC480510Isr
    public final void LJIJ(String str) {
        ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LJFF(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("destroy player -> tag ");
        sbLIZ.append(str);
        sbLIZ.append(" ,mPlayContextTag: ");
        sbLIZ.append(this.LLJZ);
        sbLIZ.append(" ,player: ");
        sbLIZ.append(hashCode());
        C827750WdZ.LIZ("LivePlayController", C2188811AlT.LIZIZ(sbLIZ));
        if (!TextUtils.equals(str, this.LLJZ)) {
            return;
        }
        C1API c1api = this.LL;
        if (c1api != null) {
            c1api.LJJJI(null, null);
            this.LL.release(this.LLJZ);
            this.LL = null;
        }
        LIZIZ("destroy");
        this.LLLLIL = false;
        LiveIgnoreSmoothEnterFirstFrameExp.setIsSmoothEnterOrPreview(false, false);
    }

    @Override // X.InterfaceC480510Isr
    public final Bitmap LJIJI(boolean z) {
        Object obj;
        try {
            obj = this.LLILZLL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (obj instanceof TextureView) {
            return ((TextureView) obj).getBitmap();
        }
        if (obj instanceof SurfaceView) {
            if (this.LLJ == null) {
                if (LiveViewPagerOnMeasureOptSetting.INSTANCE.enablePrepareFrameAsync() && this.LLIZLLLIL) {
                    this.LLIZLLLIL = false;
                    this.LLIZ = true;
                }
                if (z && (LJJLIIIIJ() || LJJLIIIJ())) {
                    return ScreenShotUtils.LIZIZ((SurfaceView) this.LLILZLL, this.LL.LJIIJJI());
                }
                return ScreenShotUtils.LIZ((SurfaceView) this.LLILZLL);
            }
            if (LiveViewPagerOnMeasureOptSetting.INSTANCE.enablePrepareFrameAsync() && this.LLIZLLLIL) {
                this.LLIZLLLIL = false;
            }
            Bitmap bitmap = this.LLJ;
            this.LLJ = null;
            return bitmap;
        }
        C1API c1api = this.LL;
        if (c1api != null) {
            return c1api.getCurrentFrame();
        }
        return null;
    }

    @Override // X.InterfaceC480510Isr
    public final String LJIL(int i) {
        C1API c1api = this.LL;
        if (c1api != null) {
            return c1api.LJIIIZ(i);
        }
        return null;
    }

    @Override // X.InterfaceC480520Iss
    public final void LJJ(String str) {
        C1API c1api = this.LL;
        if (c1api != null) {
            c1api.LJJ(str);
        }
    }

    @Override // X.InterfaceC480520Iss
    public final void LJJI(String str) {
        C1699360uK6 c1699360uK6 = this.LLLLII;
        if (c1699360uK6 != null) {
            c1699360uK6.LJFF = str;
        }
        C1API c1api = this.LL;
        if (c1api != null) {
            c1api.LJJI(str);
        }
    }

    @Override // X.InterfaceC480520Iss
    public final void LJJII(C1699360uK6 c1699360uK6) {
        this.LLLLII = c1699360uK6;
    }

    @Override // X.InterfaceC480520Iss
    public final void LJJIII(boolean z) {
        C1286680jaU c1286680jaU = this.LLJLILLLLZIIL;
        if (c1286680jaU != null) {
            c1286680jaU.LJFF = z;
        }
    }

    @Override // X.InterfaceC480520Iss
    public final void LJJIIJZLJL(int i) {
        C1286680jaU c1286680jaU = this.LLJLILLLLZIIL;
        if (c1286680jaU != null) {
            c1286680jaU.LJI = i;
        }
    }

    @Override // X.InterfaceC480520Iss
    public final void LJJIIZI(Context context) {
        String string;
        if (context == null) {
            string = e3.g;
        } else {
            string = context.toString();
        }
        stop(string);
    }

    @Override // X.InterfaceC480520Iss
    public final boolean LJJIJ(Context context) {
        C827750WdZ.LIZ("PreCreateSurface", "add one px texture view into main activity");
        return false;
    }

    @Override // X.InterfaceC480520Iss
    public final void LJJIJIIJI(boolean z) {
        this.LLLLIL = z;
        LiveIgnoreSmoothEnterFirstFrameExp.setIsSmoothEnterOrPreview(z, this.LLLF);
    }

    @Override // X.InterfaceC1700420uLo
    public final boolean LJJIL(EnumC1700470uLt enumC1700470uLt) {
        if (C1700480uLu.LIZIZ[enumC1700470uLt.ordinal()] != 11 || this.LLLII) {
            return false;
        }
        if (LiveCadSmoothExitSetting.INSTANCE.enable()) {
            return true;
        }
        return this.LLILZLL instanceof SurfaceView;
    }

    @Override // X.InterfaceC480520Iss
    public final void LJJJJI(boolean z) {
        this.LLLFZ = z;
    }

    @Override // X.InterfaceC480520Iss
    public final void LJJJJIZL(Context context) {
        String string;
        if (context == null) {
            string = e3.g;
        } else {
            string = context.toString();
        }
        LJIJ(string);
    }

    @Override // X.InterfaceC480520Iss
    public final boolean LJJJJLI(Context context) {
        String string;
        if (context == null) {
            string = e3.g;
        } else {
            string = context.toString();
        }
        if (!TextUtils.equals(string, this.LLJZ)) {
            return false;
        }
        C480540Isu c480540Isu = new C480540Isu(this);
        c480540Isu.LIZIZ(null, string, true);
        C480530Ist c480530Ist = c480540Isu.LIZIZ;
        HashSet hashSet = (HashSet) C480710ItB.LIZJ;
        hashSet.remove(c480530Ist);
        if (hashSet.isEmpty()) {
            try {
                C480710ItB.LIZ.abandonAudioFocus(C480710ItB.LIZIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJIIL("AudioFocusUtil", "returnFocus error");
            }
        }
        try {
            C480710ItB.LIZ.abandonAudioFocus(C480710ItB.LIZIZ);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C20441214yg.LJIIL("AudioFocusUtil", "returnFocus error");
        }
        stop(string);
        LJIJ(string);
        return true;
    }

    @Override // X.InterfaceC480520Iss
    public final void LJJJJLL(boolean z) {
        this.LLJJJJJIL = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJJJZ(InterfaceC463820IGu interfaceC463820IGu) {
        if (interfaceC463820IGu instanceof C1A7I) {
            ((SurfaceView) interfaceC463820IGu).getHolder().addCallback(this.LLLJ);
            return;
        }
        if (interfaceC463820IGu instanceof C1A7G) {
            ((TextureView) interfaceC463820IGu).setSurfaceTextureListener(this.LLLIZZ);
            return;
        }
        if (interfaceC463820IGu instanceof C20856616jU) {
            ((TextureView) interfaceC463820IGu).setSurfaceTextureListener(this.LLLIZZ);
        } else {
            if (!(interfaceC463820IGu instanceof C1A7J)) {
                return;
            }
            C1APJ c1apj = new C1APJ(this);
            C1A7J c1a7j = (C1A7J) interfaceC463820IGu;
            c1apj.LL = new WeakReference<>(c1a7j);
            c1a7j.setSurfaceCallBack(c1apj);
        }
    }

    public final void LJJJLIIL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearRenderViewCallback -> source:");
        sbLIZ.append(str);
        C827750WdZ.LIZ("LivePlayController", C2188811AlT.LIZIZ(sbLIZ));
        Object obj = this.LLILZLL;
        if (obj instanceof C1A7I) {
            ((SurfaceView) obj).getHolder().removeCallback(this.LLLJ);
            return;
        }
        if (obj instanceof C1A7G) {
            ((TextureView) obj).setSurfaceTextureListener(null);
        } else if (obj instanceof C20856616jU) {
            ((TextureView) obj).setSurfaceTextureListener(null);
        } else {
            if (!(obj instanceof C1A7J)) {
                return;
            }
            ((C1A7J) obj).setSurfaceCallBack(null);
        }
    }

    public final void LJJLIIIJILLIZJL(Pair<Integer, Integer> pair) {
        int iIntValue;
        int iIntValue2;
        Map<String, Object> map = C1338270kvh.LIZ;
        int i = 0;
        if (pair != null) {
            iIntValue = pair.getFirst().intValue();
            iIntValue2 = pair.getSecond().intValue();
            if (pair.getFirst().intValue() < pair.getSecond().intValue()) {
                i = 1;
            }
        } else {
            iIntValue = 0;
            iIntValue2 = 0;
        }
        C0IHV.LIZ = new C467720IVu(iIntValue, iIntValue2, i ^ 1, this.LLJJIII, this.LLLIIII);
    }

    public final void LJJLIIJ(boolean z) {
        C1API c1api;
        int time = LiveReleaseSurfaceTimeSetting.getTime();
        if (z) {
            this.LL.LJJIIZ(time, null);
        } else if (LiveOptSurfaceDestroyReleaseExp.getEnable() && (c1api = this.LL) != null && c1api.LJJIJ()) {
            C20441214yg.LJIIIZ("LivePlayController", "set Player surface to null has been called. do not need to call setSurface to null");
        } else {
            this.LL.LJJIIZ(time, null);
        }
    }

    public final void LJJLJ(boolean z) {
        if (z) {
            LJJZZI(false);
            LJJLL(false);
        } else {
            LJJLL(false);
            LJJZZI(false);
        }
    }

    public final void LJJLL(boolean z) {
        if (z) {
            int i = this.LLILZ | 1;
            this.LLILZ = i;
            if (this.LLJLIL == LiveMode.AUDIO) {
                this.LLILZ = i | 2 | 4;
            }
        } else {
            this.LLILZ = this.LLILZ & (-2) & (-5);
        }
        LJJLIIIJJI();
    }

    public final void LJJZZI(boolean z) {
        if (z) {
            this.LLILZ |= 4;
            if (this.LLILZIL) {
                this.LLILZIL = false;
            }
        } else {
            this.LLILZ &= -5;
        }
        LJJLIIIJJI();
    }

    public final void LJJZZIII(boolean z) {
        if (z) {
            this.LLILZ |= 2;
        } else {
            this.LLILZ &= -3;
        }
        LJJLIIIJJI();
    }

    @Override // X.InterfaceC480510Isr
    public final void changeLowLatencyMode(boolean z) {
        C1API c1api = this.LL;
        if (c1api != null) {
            c1api.changeLowLatencyMode(z);
        }
    }

    @Override // X.InterfaceC480510Isr
    public final void changeSRSupportScene(boolean z) {
        C1API c1api = this.LL;
        if (c1api != null) {
            c1api.changeSRSupportScene(z);
        }
    }

    @Override // X.InterfaceC480510Isr
    public final void e0(Boolean bool) {
        this.LLLLILI = bool;
    }

    @Override // X.InterfaceC480510Isr
    public final void g0(C480620It2 c480620It2) {
        this.LLJLL = new SoftReference<>(c480620It2);
    }

    @Override // X.InterfaceC480510Isr
    public final int getAudioDuckingDurationForLive(int i) {
        C1API c1api = this.LL;
        if (c1api != null) {
            return c1api.getAudioDuckingDurationForLive(i);
        }
        return 0;
    }

    @Override // X.InterfaceC465240IMg
    public final void handleMsg(Message message) {
        InterfaceC480650It5 interfaceC480650It5;
        int i = message.what;
        if (i == 9) {
            C827750WdZ.LIZ("LivePlayController", "restart play -> receive try again msg");
            try {
                LJJJLL(new C0IMA(this.LLLL, Long.valueOf(this.LLJL), false, this.LLLLJ), false, null);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C827750WdZ.LIZ("LivePlayController", e.getMessage());
                return;
            }
        }
        EnumC1913550ztZ enumC1913550ztZValueOf = EnumC1913550ztZ.valueOf(i);
        if (enumC1913550ztZValueOf != EnumC1913550ztZ.UNKNOWN && (interfaceC480650It5 = this.LLJJL) != null) {
            interfaceC480650It5.LLLLJ(enumC1913550ztZValueOf, HandlerHook.getMessageObj(message.obj));
        }
    }

    @Override // X.InterfaceC480510Isr
    public final boolean j0(EnumC1700470uLt enumC1700470uLt) {
        C1API c1api = this.LL;
        if (c1api != null) {
            return ((AbstractC1700380uLk) c1api).LLJIJIL.contains(enumC1700470uLt);
        }
        return false;
    }

    @Override // X.InterfaceC480510Isr
    public final void l0(boolean z) {
        this.LLLLIIIILLL = z;
        LJL();
    }

    @Override // X.InterfaceC480510Isr
    public final void m0(C0IIX c0iix) {
        this.LLJILJIL.addIfAbsent(c0iix);
        if (this.LLJJJIL && this.LLJILJILJ) {
            try {
                c0iix.onFirstFrameRender();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public void onPageChangeEvent(C20690915xr c20690915xr) {
        C1699360uK6 c1699360uK6;
        LLLLLIL = c20690915xr.LIZ;
        if (this.LL != null && LiveInstanceOptSetting.INSTANCE.enableSwitchStrategy() && (c1699360uK6 = LLLLLILLIL.get(this.LL)) != null) {
            Map<String, Object> map = C1338270kvh.LIZ;
            String str = LLLLLIL;
            if (str != null && !str.equals(c1699360uK6.LIZ)) {
                if (LiveInstanceOptSetting.doRemoveOpt()) {
                    EventBus eventBusLIZLLL = EventBus.LIZLLL();
                    if (eventBusLIZLLL.LJIIJ(this)) {
                        eventBusLIZLLL.LJJI(this);
                    }
                }
                if (this.LL.LIZJ() == this.LLLIL || LiveInstanceOptSetting.ignorePlayerState()) {
                    this.LLLILZLLLI = 3;
                    LJJLIIIJLLLLLLLZ();
                    C11JF c11jf = this.LLLILZJ;
                    if (c11jf != null) {
                        c11jf.dispose();
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC480510Isr
    public final void q0(String str) {
        if (!TextUtils.equals(str, this.LLJZ)) {
            return;
        }
        InterfaceC480650It5 interfaceC480650It5 = this.LLJJL;
        if (interfaceC480650It5 != null) {
            interfaceC480650It5.LLLLJ(EnumC1913550ztZ.STOP_WHEN_JOIN_INTERACT, null);
        }
        LJIJ(str);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public void receiveCreatePosition(C20691015xs c20691015xs) {
        if (this.LL != null && c20691015xs != null) {
            LLLLLJIL.put(C20691015xs.LIZJ, Integer.valueOf(c20691015xs.LIZ));
            Map<String, Object> map = C1338270kvh.LIZ;
        }
    }

    @Override // X.InterfaceC480510Isr
    public final void registerMuteFilter(C1APY c1apy) {
        this.LLLIIL.add(c1apy);
    }

    @Override // X.InterfaceC480510Isr
    public final void setAnchorInteractMode(boolean z) {
        this.LLL = z;
        LJL();
    }

    @Override // X.InterfaceC480510Isr
    public final void setHadGamePreviewLiveVideoRotated(boolean z) {
        this.LLLI = z;
    }

    @Override // X.InterfaceC480510Isr
    public final void setScreenOrientation(boolean z) {
        this.LLJZIJLIL = z;
        LJL();
    }

    @Override // X.InterfaceC480510Isr
    public final void setSeiOpen(boolean z) {
        this.LLLFF = z;
    }

    @Override // X.InterfaceC480510Isr
    public final void stop(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stop -> playerTag: ");
        sbLIZ.append(str);
        sbLIZ.append(" ,mPlayContextTag:");
        sbLIZ.append(this.LLJZ);
        sbLIZ.append(" ,player: ");
        sbLIZ.append(hashCode());
        C827750WdZ.LIZ("LivePlayController", C2188811AlT.LIZIZ(sbLIZ));
        if (!TextUtils.equals(str, this.LLJZ)) {
            return;
        }
        this.LLJJJIL = false;
        C1API c1api = this.LL;
        if (c1api != null) {
            c1api.stop();
        }
        if (this.LLJILJILJ || this.LLJILLL != 0) {
            this.LLJILJILJ = false;
            this.LLJILLL = 0L;
        }
        this.LLLIIL.clear();
    }

    @Override // X.InterfaceC480510Isr
    public final int stopAuxAudioDucking(int i) {
        C1API c1api = this.LL;
        if (c1api != null) {
            return c1api.stopAuxAudioDucking(i);
        }
        return -100;
    }

    @Override // X.InterfaceC480510Isr
    public final void switchNextPullStream(String str) {
        C1API c1api = this.LL;
        if (c1api == null) {
            C20441214yg.LJIIL("LivePlayController", "switchNextPullStream skipped: mLivePlayer is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            C20441214yg.LJIIL("LivePlayController", "switchNextPullStream skipped: pullStreamData is empty");
            return;
        }
        try {
            this.LLJJI = str;
            c1api.reset();
            c1api.LJIIL(str, c1api.getCurrentResolution());
            c1api.play();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("LivePlayController", "switchNextPullStream failed", e);
        }
    }

    @Override // X.InterfaceC480520Iss
    public final void switchResolution(String str) {
        C1API c1api = this.LL;
        if (c1api != null) {
            c1api.switchResolution(str);
            InterfaceC480650It5 interfaceC480650It5 = this.LLJJL;
            if (interfaceC480650It5 != null) {
                interfaceC480650It5.LLLLJ(EnumC1913550ztZ.START_SWITCH_RESOLUTION, null);
            }
            if ((this.LLILZLL instanceof C1A7J) && !TextUtils.equals("ao", str)) {
                LJJJJZ(this.LLILZLL);
            }
        }
    }

    @Override // X.InterfaceC480510Isr
    public final void unRegisterMuteFilter(C1APY c1apy) {
        this.LLLIIL.remove(c1apy);
    }

    @Override // X.InterfaceC480510Isr
    public final void v0(boolean z) {
        this.LLLLIILL = z;
        if (this.LLILZLL instanceof C1A7J) {
            LJJJJZ(this.LLILZLL);
        }
    }

    @Override // X.InterfaceC480510Isr
    public final void w0(boolean z) {
        this.LLJJIJIIJIL = z;
    }

    @Override // X.InterfaceC480510Isr
    public final void x0(long j) {
        this.LLJL = j;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.1APL] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.1APK] */
    public C1APH(Context context, C1491070ou9 c1491070ou9) {
        LiveInstanceOptSetting liveInstanceOptSetting = LiveInstanceOptSetting.INSTANCE;
        this.LLLILZ = liveInstanceOptSetting.getPollInterval();
        this.LLLILZLLLI = 0;
        this.LLLIZZ = new TextureView.SurfaceTextureListener() { // from class: X.1APL
            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onSurfaceTextureDestroyed ,shouldDestroy=");
                sbLIZ.append(this.LL.LLLFZ);
                C827750WdZ.LIZ("LivePlayController", C2188811AlT.LIZIZ(sbLIZ));
                C1APH c1aph = this.LL;
                C1API c1api = c1aph.LL;
                if (c1api != null && c1aph.LLLFZ) {
                    c1api.LJJL(null);
                    this.LL.LL.LJJIJL();
                }
                return this.LL.LLLFZ;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                C827750WdZ.LIZ("LivePlayController", "onSurfaceTextureAvailable");
                C1APH c1aph = this.LL;
                InterfaceC463820IGu interfaceC463820IGu = c1aph.LLILZLL;
                if (((interfaceC463820IGu instanceof C1A7G) || (interfaceC463820IGu instanceof C20856616jU)) && c1aph.LLLFZ) {
                    if (c1aph.LLJI != null) {
                        C1API c1api = c1aph.LL;
                        if (c1api != null) {
                            c1api.LJJIJL();
                        }
                        this.LL.LLJI.release();
                    }
                    this.LL.LLJI = new Surface(surfaceTexture);
                    this.LL.LJJZZIII(true);
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onSurfaceTextureSizeChanged -> width: ");
                sbLIZ.append(i);
                sbLIZ.append(",height: ");
                sbLIZ.append(i2);
                sbLIZ.append(",");
                C827750WdZ.LIZ("LivePlayController", C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        this.LLLJ = new SurfaceHolder.Callback() { // from class: X.1APK
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                C827750WdZ.LIZ("LivePlayController", "surfaceCreated");
                Surface surface = this.LL.LLJI;
                if (surface != null) {
                    surface.release();
                    this.LL.LLJI = null;
                }
                C1APH c1aph = this.LL;
                c1aph.LLJIJIL = surfaceHolder;
                c1aph.LJJZZIII(true);
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                C827750WdZ.LIZ("LivePlayController", "surfaceDestroyed");
                this.LL.getClass();
                if (C1APH.LJJLIIIJ()) {
                    C1APH c1aph = this.LL;
                    Object obj = c1aph.LLILZLL;
                    C1API c1api = c1aph.LL;
                    if (obj instanceof SurfaceView) {
                        View view = (View) obj;
                        if (c1api != null) {
                            c1api.LJII(null, view.getWidth(), view.getHeight());
                            return;
                        }
                        return;
                    }
                    return;
                }
                C1API c1api2 = this.LL.LL;
                if (c1api2 == null) {
                    return;
                }
                c1api2.LJJL(null);
                this.LL.LL.LJJIJL();
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                SurfaceView surfaceView;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("surfaceChanged -> width: ");
                sbLIZ.append(i2);
                sbLIZ.append(",height: ");
                sbLIZ.append(i3);
                sbLIZ.append(",");
                C827750WdZ.LIZ("RenderView", C2188811AlT.LIZIZ(sbLIZ));
                this.LL.getClass();
                if (C1APH.LJJLIIIJ() && (surfaceView = (SurfaceView) this.LL.LLILZLL) != null && surfaceView.getSurfaceControl() != null) {
                    this.LL.LL.LJII(surfaceView.getSurfaceControl(), surfaceView.getWidth(), surfaceView.getHeight());
                }
            }
        };
        this.LLLJL = "";
        this.LLLL = "";
        this.LLLLII = null;
        this.LLLLIIIILLL = false;
        this.LLLLIIL = false;
        this.LLLLIILL = true;
        this.LLLLIILLL = false;
        this.LLLLILI = Boolean.FALSE;
        this.LLLLJ = "";
        this.LLJLLIL = context;
        this.LLJLLL = c1491070ou9;
        this.LLJJJJLIIL = new WeakHandler(Looper.getMainLooper(), this);
        C1286680jaU c1286680jaU = new C1286680jaU();
        this.LLJLILLLLZIIL = c1286680jaU;
        if (!LiveWatchPreloadSettings.INSTANCE.gpuInfoDisable()) {
            C465160ILy.LIZ().getClass();
            String strLIZ = ((C0UZJ) C1APP.LIZIZ(C0UZJ.class)).LIZ(context);
            if (strLIZ != null) {
                c1286680jaU.LJ = strLIZ;
            }
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.JQ2(C1148390fzR.class, this);
        if (liveInstanceOptSetting.enable()) {
            if (dataChannelGlobal.gg0(GlobalInflowMessage.class) == null || !((Boolean) dataChannelGlobal.gg0(GlobalInflowMessage.class)).booleanValue()) {
                Map<String, Object> map = C1338270kvh.LIZ;
                EventBus eventBusLIZLLL = EventBus.LIZLLL();
                if (!eventBusLIZLLL.LJIIJ(this)) {
                    eventBusLIZLLL.LJIJJ(this);
                }
            }
        }
    }

    @Override // X.InterfaceC480510Isr
    public final void B0(final JSONObject jSONObject, final boolean z) {
        if (jSONObject != null) {
            if (jSONObject.has("player_type")) {
                try {
                    jSONObject.put("new_sdk", false);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJI("LivePlayController", e);
                }
            }
            String strOptString = jSONObject.optString("cdn_play_url");
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.equals(strOptString, "none")) {
                if (TextUtils.isEmpty(this.LLLJL)) {
                    this.LLLJL = strOptString;
                } else if (!TextUtils.equals(this.LLLJL, strOptString)) {
                    String str = this.LLLJL;
                    String str2 = this.LLJJ;
                    String str3 = this.LLJJI;
                    String str4 = this.LLJJIII;
                    String str5 = this.LLJJIJIL;
                    C0K04.LJFF("device_name", Build.MODEL, jSONObject);
                    C0K04.LJFF("last_cdn_play_url", str, jSONObject);
                    C0K04.LJFF("url", str2, jSONObject);
                    C0K04.LJFF("pull_stream_data", str3, jSONObject);
                    C0K04.LJFF("default_resolution", str4, jSONObject);
                    C0K04.LJFF("sdk_params", str5, jSONObject);
                    C0K04.LJ("uid", UserService.getInstance().user().getCurrentUserId(), jSONObject);
                    C1CC2.LJIIL(0, "ttlive_audience_enter_room_stream_switch", jSONObject);
                }
            }
        }
        final C1286680jaU c1286680jaU = this.LLJLILLLLZIIL;
        if (c1286680jaU.LIZLLL == null && c1286680jaU.LJ == null) {
            IPullStreamService iPullStreamService = (IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class);
            c1286680jaU.LIZLLL = iPullStreamService.ZC0().get();
            c1286680jaU.LJ = iPullStreamService.rC0().LIZ(null);
            if (c1286680jaU.LIZLLL == null) {
                iPullStreamService.ZC0().LIZ(new InterfaceC780310UjF() { // from class: X.0k4b
                    @Override // X.InterfaceC780310UjF
                    public final void LIZ(String str6) {
                        c1286680jaU.LIZLLL = str6;
                    }
                });
            }
        }
        C2339809Eu c2339809EuLIZJ = C2339809Eu.LIZJ();
        final int i = c1286680jaU.LIZIZ;
        final int i2 = c1286680jaU.LIZJ;
        final String str6 = c1286680jaU.LIZLLL;
        final String str7 = c1286680jaU.LJ;
        c2339809EuLIZJ.LIZ(new Callable(i, i2, str6, str7, jSONObject, z) { // from class: X.0jaT
            public final JSONObject LL;
            public final int LLILLJJLI;
            public final int LLILLL;
            public final String LLILZ;
            public final String LLILZIL;
            public final String LLILZLL = "ttls_push_event";
            public final boolean LLIZ;

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String strLJ;
                C1C7U.LIZ("LivePlayerLog$SendLiveAppLogTask@9d0.call");
                try {
                    if (this.LLIZ) {
                        C1163660gO4.LIZ.getClass();
                        Map mapLIZ = C1163660gO4.LIZ("live_client_monitor_log");
                        if (mapLIZ != null && mapLIZ.size() > 0) {
                            this.LL.put("cpu_speed_rate", mapLIZ.get("cpu_speed"));
                            this.LL.put("cpu", mapLIZ.get("cpu_rate"));
                        }
                        Map mapLIZLLL = C1163660gO4.LIZLLL("live_client_monitor_log");
                        Long l = (Long) mapLIZLLL.get("mem_pss_dalvik");
                        if (l != null && l.longValue() > 0) {
                            this.LL.put("dalvik_pss", l);
                        }
                        this.LL.put("memory", (int) (((Long) mapLIZLLL.get("mem_pss_total")) != null ? (r0.longValue() / 1024.0f) / 1024.0f : -1.0f));
                    }
                    this.LL.put("product_line", "live");
                    Context context = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("data", this.LL);
                    jSONObject2.put("did", AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId());
                    jSONObject2.put("uid", UserService.getInstance().user().getCurrentUserId());
                    jSONObject2.put("net_type", C786410Ut5.b3(context));
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) C786410Ut5.H2(context, "phone");
                        AtomicBoolean atomicBoolean = C794320VDy.LIZ;
                        strLJ = C1300840jxK.LJ(telephonyManager);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        strLJ = "unkown";
                    }
                    jSONObject2.put("net_des", strLJ);
                    LiveLogFilterSwitchAbSetting liveLogFilterSwitchAbSetting = LiveLogFilterSwitchAbSetting.INSTANCE;
                    if (!liveLogFilterSwitchAbSetting.printLogSwitch()) {
                        int iLIZIZ = C1286680jaU.LIZIZ(context);
                        if (iLIZIZ > 0) {
                            jSONObject2.put("app_version_four", iLIZIZ);
                        }
                    } else if (C786410Ut5.V3(context.getPackageManager(), context.getPackageName(), 128).metaData != null) {
                        jSONObject2.put("app_version_four", C786410Ut5.V3(context.getPackageManager(), context.getPackageName(), 128).metaData.getInt("UPDATE_VERSION_CODE"));
                    }
                    if (InterfaceC772390URp.LLZZJLIL.LIZIZ().booleanValue()) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("event_key", "push_stream");
                        double dOptDouble = this.LL.optDouble("in_cap_fps", -1.0d);
                        if (dOptDouble >= 0.0d) {
                            jSONObject3.put("in_cap_fps", dOptDouble);
                        }
                        double dOptDouble2 = this.LL.optDouble("out_cap_fps", -1.0d);
                        if (dOptDouble2 >= 0.0d) {
                            jSONObject3.put("out_cap_fps", dOptDouble2);
                        }
                        C1300340jwW c1300340jwW = C476230Ilx.LIZ;
                        float fLJ = c1300340jwW.LJ();
                        float fLJI = c1300340jwW.LJI();
                        if (fLJ > 0.0f && fLJI > 0.0f) {
                            jSONObject3.put("battery_value", fLJ / fLJI);
                        }
                        float f = c1300340jwW.LJFF;
                        if (f > 0.0f) {
                            jSONObject3.put("thermal_value", f);
                        }
                    } else if (liveLogFilterSwitchAbSetting.printLogSwitch()) {
                        C20441214yg.LJIIIZ("LivePlayerLog", C786410Ut5.J3(jSONObject2));
                    }
                    this.LL.put("channel", ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getChannel());
                    this.LL.put("device_name", Build.MODEL);
                    this.LL.put("screen_height", this.LLILLJJLI);
                    this.LL.put("screen_width", this.LLILLL);
                    String str8 = this.LLILZ;
                    String str9 = this.LLILZIL;
                    JSONObject jSONObject4 = this.LL;
                    if (str8 != null) {
                        jSONObject4.put("cpu_soc", str8);
                    }
                    if (str9 != null) {
                        jSONObject4.put("gpu_name", str9);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C20441214yg.LJI("LivePlayerLog", th);
                    C1286680jaU.LIZJ(3, th);
                }
                try {
                    AppLogNewUtils.onEventV3(this.LLILZLL, this.LL);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
                        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new RunnableC514801zW(th2, 11));
                    } else {
                        C1286680jaU.LIZJ(4, th2);
                    }
                }
                C1C7U.LIZIZ("LivePlayerLog$SendLiveAppLogTask@9d0.call");
                return null;
            }

            {
                this.LLILLJJLI = i;
                this.LLILLL = i2;
                this.LLILZ = str6;
                this.LLILZIL = str7;
                this.LL = jSONObject;
                this.LLIZ = z;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    @Override // X.InterfaceC480510Isr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E0(java.lang.String r5, android.view.Surface r6) {
        /*
            r4 = this;
            X.1API r0 = r4.LL
            if (r0 == 0) goto L7
            r0.stop()
        L7:
            boolean r0 = LJJLIIIIJ()
            r3 = 0
            if (r0 == 0) goto L57
            X.0IGu r1 = r4.LLILZLL
            boolean r0 = r1 instanceof X.C1A7J
            if (r0 == 0) goto L57
            X.1API r0 = r4.LL
            r4.LJJLIIIJLJLI(r1, r0)
        L19:
            java.lang.String r0 = "stopPlayerAndReleaseSurface"
            r4.LJJJLIIL(r0)
            r2 = 0
            r4.LLILZLL = r2
            int r0 = r4.LLILZ
            r0 = r0 & 2
            r1 = 1
            if (r0 <= 0) goto L2b
            r4.LJJZZIII(r3)
        L2b:
            r4.LLLLIILL = r1
            r4.LLILLJJLI = r2
            r4.LLJJL = r2
            r4.LLJJJIL = r3
            java.lang.String r0 = ""
            r4.LLJJ = r0
            r4.LLJJI = r0
            X.0Isz r0 = X.C1APH.LLLLL
            r4.LLJJJ = r0
            r4.LLJJLIIIJLLLLLLLZ = r3
            r4.LLLLIIL = r3
            r4.LLLFZ = r1
            r4.LLJJJJ = r3
            r4.LLLI = r3
            java.lang.Class<com.bytedance.android.live.livepullstream.api.IPullStreamService> r0 = com.bytedance.android.live.livepullstream.api.IPullStreamService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.livepullstream.api.IPullStreamService r0 = (com.bytedance.android.live.livepullstream.api.IPullStreamService) r0
            X.0It8 r0 = r0.YY()
            r0.LJFF(r5)
            return
        L57:
            r4.LJJLIIIJL(r6, r3)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1APH.E0(java.lang.String, android.view.Surface):void");
    }

    @Override // X.InterfaceC480520Iss
    public final void LJIIL(String str, String str2) {
        if (this.LL != null && !TextUtils.isEmpty(str)) {
            try {
                C1API c1api = this.LL;
                if (TextUtils.isEmpty(str2)) {
                    str2 = this.LLJJIII;
                }
                c1api.LJIIL(str, str2);
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJI("LivePlayController", e);
            }
        }
    }

    @Override // X.InterfaceC480520Iss
    public final void LJJIJIIJIL(String str, boolean z) {
        try {
            LJJJLZIJ(str, z);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC480520Iss
    public final void LJJIJIL(long j, String str) {
        ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).predictP95Strategy(str, new C19503011Sa(this, j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0pCM] */
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
    public final void LJJJLZIJ(String str, boolean z) {
        this.LLJILJILJ = false;
        this.LLJILLL = 0L;
        C1API c1api = this.LL;
        if (c1api != null) {
            c1api.LJJJJJ(this.LLJZ);
            this.LL.LJJJI(null, null);
            LJJLJ(false);
        }
        this.LL = this.LLJLLL.LIZ(this.LLJLLIL, new C1502390pCP(this), new InterfaceC1491020ou4() { // from class: X.0pCM
            @Override // X.InterfaceC1491020ou4
            public final Size LIZIZ() {
                View view;
                Object obj = this.LIZ.LLILZLL;
                return (!(obj instanceof View) || (view = (View) obj) == null) ? new Size(-1, -1) : new Size(view.getWidth(), view.getHeight());
            }

            @Override // X.InterfaceC1491020ou4
            public final HashMap<String, Object> LIZ(EnumC1491000ou2 enumC1491000ou2, String str2) {
                HashMap<String, Object> map = new HashMap<>();
                String strQ30 = ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).q30(str2);
                if (TextUtils.isEmpty(strQ30)) {
                    C486790J7d.LIZJ(new ARunnableS7S1000000_12(str2, 0));
                    map.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 0);
                    return map;
                }
                String path = UriProtector.parse(strQ30).getPath();
                map.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 1);
                map.put("path", path);
                return map;
            }
        }, str, z);
        C1699360uK6 c1699360uK6 = this.LLLLII;
        if (c1699360uK6 != null) {
            boolean z2 = c1699360uK6.LJ;
            StringBuilder sb = new StringBuilder();
            sb.append(this.LLLLII.LIZ);
            sb.append("-");
            sb.append(this.LLLLII.LIZIZ);
            if (z2) {
                sb.append("-preview");
            }
            this.LL.LJJJ(sb.toString());
            LLLLLILLIL.put(this.LL, this.LLLLII);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create TTPlayer2 -> player: ");
        sbLIZ.append(hashCode());
        C827750WdZ.LIZ("LivePlayController", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLL = this.LL.LJFF();
        this.LL.LJJJI(this, this);
        this.LL.LJIILIIL(this.LLLF);
        LJJZ();
    }

    public final void LJJJZ(EnumC1913550ztZ enumC1913550ztZ, Object obj) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            InterfaceC480650It5 interfaceC480650It5 = this.LLJJL;
            if (interfaceC480650It5 != null) {
                interfaceC480650It5.LLLLJ(enumC1913550ztZ, obj);
                return;
            }
            return;
        }
        this.LLJJJJLIIL.obtainMessage(enumC1913550ztZ.ordinal(), obj).sendToTarget();
    }

    public final void LJJLIIIJL(Surface surface, boolean z) {
        if (z) {
            int time = LiveReleaseSurfaceTimeInnerSetting.getTime();
            if (LiveReleaseInnerSurfaceAsyncExp.enable() && surface != null && surface.isValid()) {
                this.LL.LJJJJIZL(time, null);
                return;
            } else {
                this.LL.LJJIIZ(time, null);
                return;
            }
        }
        int time2 = LiveReleaseSurfaceTimeSetting.getTime();
        if (LiveReleaseSurfaceAsyncExp.enable() && surface != null && surface.isValid()) {
            this.LL.LJJJJIZL(time2, null);
        } else {
            this.LL.LJJIIZ(time2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJLIIIJLJLI(InterfaceC463820IGu interfaceC463820IGu, final C1API c1api) {
        if (interfaceC463820IGu instanceof SurfaceView) {
            final SurfaceView surfaceView = (SurfaceView) interfaceC463820IGu;
            C786410Ut5.LJLIIL(100L, this.LLLIIIL, new Runnable() { // from class: X.1APM
                @Override // java.lang.Runnable
                public final void run() {
                    C1API c1api2 = c1api;
                    SurfaceView surfaceView2 = surfaceView;
                    C1C7U.LIZ("LivePlayController@1c0e.releaseSurfaceControl$1L");
                    if (c1api2 != null) {
                        c1api2.LJII(null, surfaceView2.getWidth(), surfaceView2.getHeight());
                    }
                    C1C7U.LIZIZ("LivePlayController@1c0e.releaseSurfaceControl$1L");
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLJLI(boolean r16, X.C0INA r17) {
        /*
            Method dump skipped, instruction units count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1APH.LJJLJLI(boolean, X.0INA):void");
    }

    @Override // X.InterfaceC480510Isr
    public final void f0(C0IIZ c0iiz, boolean z) {
        boolean z2;
        if (z || (this.LLLIILIL != c0iiz && this.LL != null)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LivePlayController real set rotation:");
            sbLIZ.append(c0iiz);
            C20441214yg.LJIIIZ("GameLiveCommentSeiHelper", C2188811AlT.LIZIZ(sbLIZ));
            this.LLLIILIL = c0iiz;
            this.LL.setRenderRotation(c0iiz);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("LivePlayController not rotate! rotation:");
        sbLIZ2.append(c0iiz);
        sbLIZ2.append("; mLivePlayer is null:");
        if (this.LL == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ2.append(z2);
        C20441214yg.LJIIIZ("GameLiveCommentSeiHelper", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.InterfaceC480510Isr
    public final int startAuxAudioDucking(C1300320jwU c1300320jwU, InterfaceC1699390uK9 interfaceC1699390uK9) {
        C1API c1api = this.LL;
        if (c1api != null) {
            return c1api.startAuxAudioDucking(c1300320jwU, interfaceC1699390uK9);
        }
        return -100;
    }

    @Override // X.InterfaceC480520Iss
    public final void switchResolution(String str, InterfaceC1699420uKC interfaceC1699420uKC) {
        C1API c1api = this.LL;
        if (c1api != null) {
            c1api.switchResolution(str, interfaceC1699420uKC);
            InterfaceC480650It5 interfaceC480650It5 = this.LLJJL;
            if (interfaceC480650It5 != null) {
                interfaceC480650It5.LLLLJ(EnumC1913550ztZ.START_SWITCH_RESOLUTION, null);
            }
            if ((this.LLILZLL instanceof C1A7J) && !TextUtils.equals("ao", str)) {
                LJJJJZ(this.LLILZLL);
            }
        }
    }

    @Override // X.InterfaceC480510Isr
    public final int writeAuxAudioDuckingPCM(byte[] bArr, int i) {
        C1API c1api = this.LL;
        if (c1api != null) {
            return c1api.writeAuxAudioDuckingPCM(bArr, i);
        }
        return -100;
    }

    @Override // X.InterfaceC480510Isr
    public final void y0(InterfaceC463820IGu interfaceC463820IGu, String str) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bindSurface -> renderView == null?");
        if (interfaceC463820IGu == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C827750WdZ.LIZ("LivePlayController", C2188811AlT.LIZIZ(sbLIZ));
        if (interfaceC463820IGu == null) {
            C1API c1api = this.LL;
            if (c1api != null) {
                c1api.LJJJJI(null);
                this.LL.LJJIJL();
                this.LL.stop();
            }
            LJJJLIIL("bindSurface");
            this.LLILZLL = null;
            Surface surface = this.LLJI;
            if (surface != null) {
                surface.release();
                this.LLJI = null;
            }
            this.LLJIJIL = null;
            if ((this.LLILZ & 2) > 0) {
                LJJZZIII(false);
                return;
            }
            return;
        }
        InterfaceC463820IGu interfaceC463820IGu2 = this.LLILZLL;
        if (interfaceC463820IGu2 == interfaceC463820IGu) {
            if (interfaceC463820IGu2 instanceof C1A7J) {
                LJJJLIIL("same RenderView bindSurface");
                LJJJJZ(this.LLILZLL);
                this.LLLLIIL = true;
                return;
            }
            return;
        }
        this.LLLLIIL = true;
        LJJJLIIL("bindSurface");
        this.LLILZLL = null;
        Surface surface2 = this.LLJI;
        if (surface2 != null) {
            surface2.release();
            this.LLJI = null;
        }
        this.LLILZLL = interfaceC463820IGu;
        LJJJJZ(this.LLILZLL);
        Object obj = this.LLILZLL;
        if (obj instanceof C1A7G) {
            if (((TextureView) obj).getSurfaceTexture() != null) {
                this.LLJI = new Surface(((TextureView) this.LLILZLL).getSurfaceTexture());
                LJJZZIII(true);
                return;
            } else {
                LJJZZIII(false);
                return;
            }
        }
        if (obj instanceof C20856616jU) {
            if (((TextureView) obj).getSurfaceTexture() != null) {
                this.LLJI = new Surface(((TextureView) this.LLILZLL).getSurfaceTexture());
                LJJZZIII(true);
                return;
            } else {
                LJJZZIII(false);
                return;
            }
        }
        if (obj instanceof C1A7I) {
            if (((SurfaceView) obj).getHolder() != null) {
                this.LLJIJIL = ((SurfaceView) this.LLILZLL).getHolder();
                LJJZZIII(true);
                return;
            } else {
                LJJZZIII(false);
                return;
            }
        }
        if (obj instanceof C1A7J) {
            if (((C1A7J) obj).getSurface() == null) {
                return;
            }
            LJJZZIII(true);
            return;
        }
        LJJZZIII(false);
    }

    public static void LJJLIL(String str, String str2, boolean z) {
        String str3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_manual_videoquality_event");
        if (z) {
            str3 = "auto_fallback_on_enter";
        } else {
            str3 = "apply_on_enter";
        }
        c474500IjALIZ.LJJII(str3, "manual_videoquality_action_type");
        c474500IjALIZ.LJJII(str2, "selected_quality");
        c474500IjALIZ.LJJII(str, "from_quality");
        c474500IjALIZ.LJJII("1", "is_manual_vq_success");
        c474500IjALIZ.LJJII(0, "error_code");
        c474500IjALIZ.LJJII(null, "manual_videoquality_sid");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC1700420uLo
    public final void LJIILJJIL(EnumC1700470uLt enumC1700470uLt, int i, Object obj) {
        Point videoSize;
        boolean z;
        boolean z2;
        int[] iArr = C1700480uLu.LIZIZ;
        switch (iArr[enumC1700470uLt.ordinal()]) {
            case 1:
                LJJZZI(true);
                break;
            case 2:
            case 3:
                LJJLJ(false);
                if (enumC1700470uLt == EnumC1700470uLt.MEDIA_ERROR) {
                    LJJJZ(EnumC1913550ztZ.MEDIA_ERROR, obj);
                } else {
                    LJJJZ(EnumC1913550ztZ.COMPLETE_PLAY, obj);
                }
                break;
            case 4:
                C1API c1api = this.LL;
                if (c1api != null && (videoSize = c1api.getVideoSize()) != null) {
                    this.LLJJLIIIJLLLLLLLZ = (videoSize.y << 16) | videoSize.x;
                }
                LJJLL(true);
                LJJJZ(EnumC1913550ztZ.PLAYER_PREPARED, obj);
                break;
            case 5:
                this.LLJJLIIIJLLLLLLLZ = i;
                LJL();
                LJJJZ(EnumC1913550ztZ.VIDEO_SIZE_CHANGED, String.valueOf(i));
                break;
            case 6:
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    if (LiveOptSeiInUIExp.enable()) {
                        C945320ahu c945320ahuLJJL = LJJL(obj);
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        if (c945320ahuLJJL != null) {
                            c945320ahuLJJL.LIZJ = jCurrentTimeMillis;
                            c945320ahuLJJL.LIZLLL = jCurrentTimeMillis2;
                            obj = c945320ahuLJJL;
                        }
                    }
                    LJJJZ(EnumC1913550ztZ.INTERACT_SEI, obj);
                } else {
                    InterfaceC480650It5 interfaceC480650It5 = this.LLJJL;
                    if (interfaceC480650It5 != null && interfaceC480650It5.LLILLIZIL()) {
                        C945320ahu c945320ahuLJJL2 = LJJL(obj);
                        if (c945320ahuLJJL2 == null) {
                            return;
                        }
                        long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                        c945320ahuLJJL2.LIZJ = jCurrentTimeMillis;
                        c945320ahuLJJL2.LIZLLL = jCurrentTimeMillis3;
                        this.LLJJJJLIIL.post(new ARunnableS102S0200000_33(c945320ahuLJJL2, this, 4));
                    } else {
                        this.LLJJJJLIIL.post(new ARunnableS102S0200000_33(obj, this, 5));
                    }
                }
                break;
            case 7:
                LJJJZ(EnumC1913550ztZ.BUFFERING_START, obj);
                break;
            case 8:
                LJJJZ(EnumC1913550ztZ.BUFFERING_END, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LJJJZ(EnumC1913550ztZ.RESOLUTION_DEGRADE, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LJJJZ(EnumC1913550ztZ.ABR_NEW_RESOLUTION, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                if (LiveCadSmoothExitSetting.INSTANCE.enable()) {
                    InterfaceC463820IGu interfaceC463820IGu = this.LLILZLL;
                    if (interfaceC463820IGu instanceof SurfaceView) {
                        if (LJJLIIIIJ() && (this.LLILZLL instanceof C1A7J)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (LJJLIIIJ() && (this.LLILZLL instanceof C1A7I)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z || z2 || obj == ((SurfaceView) this.LLILZLL).getHolder().getSurface()) {
                            LJJJZ(EnumC1913550ztZ.TEXTURE_RENDER_DRAW_FRAME, null);
                        }
                    } else if ((interfaceC463820IGu instanceof C1A7G) && obj == this.LLJI) {
                        LJJJZ(EnumC1913550ztZ.TEXTURE_RENDER_DRAW_FRAME, null);
                    }
                } else if ((this.LLILZLL instanceof SurfaceView) && ((LJJLIIIIJ() && (this.LLILZLL instanceof C1A7J)) || ((LJJLIIIJ() && (this.LLILZLL instanceof C1A7I)) || obj == ((SurfaceView) this.LLILZLL).getHolder().getSurface()))) {
                    LJJJZ(EnumC1913550ztZ.TEXTURE_RENDER_DRAW_FRAME, null);
                }
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LJJJZ(EnumC1913550ztZ.NETWORK_STATE_CHANGED, obj);
                break;
        }
        try {
            HashMap map = new HashMap();
            map.put("event_page", "live_detail");
            map.put("time", String.valueOf(SystemClock.currentThreadTimeMillis() - this.LLLJIL));
            map.put("url", this.LLJJ);
            map.put("pull_stream_data", this.LLJJI);
            map.put("default_resolution", this.LLJJIII);
            int i2 = iArr[enumC1700470uLt.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 7) {
                        if (i2 == 8) {
                            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("live_block_end", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
                            c474500IjALIZIZ.LJJIIZI(map);
                            c474500IjALIZIZ.LJIL();
                            c474500IjALIZIZ.LIZ();
                            return;
                        }
                        return;
                    }
                    C474500IjA c474500IjALIZIZ2 = C0IJT.LIZIZ("live_block_start", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
                    c474500IjALIZIZ2.LJJIIZI(map);
                    c474500IjALIZIZ2.LJIL();
                    c474500IjALIZIZ2.LIZ();
                    return;
                }
                map.put("is_success", String.valueOf(0));
                C474500IjA c474500IjALIZ = C0IJT.LIZ("live_first_play");
                c474500IjALIZ.LJJIIZI(map);
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LIZ();
                return;
            }
            map.put("is_success", String.valueOf(1));
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("live_first_play");
            c474500IjALIZ2.LJJIIZI(map);
            c474500IjALIZ2.LJIL();
            c474500IjALIZ2.LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJI("LivePlayController", th);
        }
    }

    @Override // X.InterfaceC480520Iss
    public final void LJJJJ(Context context, String str, boolean z) {
        String string;
        if (context == null) {
            string = e3.g;
        } else {
            string = context.toString();
        }
        t0(string, str, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010c A[Catch: JSONException -> 0x0112, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0112, blocks: (B:48:0x00fc, B:50:0x0102, B:51:0x010c), top: B:103:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJLL(X.C0IMA r9, boolean r10, java.lang.Long r11) {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1APH.LJJJLL(X.0IMA, boolean, java.lang.Long):void");
    }

    @Override // X.InterfaceC480510Isr
    public final void t0(String str, String str2, boolean z) {
        boolean z2;
        boolean z3 = true;
        if (C0IIG.LIZ) {
            z2 = true;
        } else {
            z2 = z;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setMute: ");
        sbLIZ.append(z2);
        sbLIZ.append(" -> playerTag=");
        sbLIZ.append(str);
        sbLIZ.append(" ,mPlayContextTag=");
        sbLIZ.append(this.LLJZ);
        sbLIZ.append(" ,player: ");
        sbLIZ.append(hashCode());
        sbLIZ.append("; mute reason=");
        sbLIZ.append(str2);
        C827750WdZ.LIZ("LivePlayController", C2188811AlT.LIZIZ(sbLIZ));
        if (!TextUtils.equals(str, this.LLJZ)) {
            return;
        }
        if (!this.LLLIIL.isEmpty()) {
            for (C1APY c1apy : this.LLLIIL) {
                if (c1apy.LIZ(z)) {
                    c1apy.isMute();
                    z2 = true;
                }
            }
        }
        if (this.LLLLILI.booleanValue() && !z2) {
            C20441214yg.LIZIZ("LivePlayController", "setMute: intercept unmute has enable 1");
        } else {
            z3 = z2;
        }
        C1API c1api = this.LL;
        if (c1api != null) {
            c1api.LJIILJJIL(z3);
            this.LLJJJJ = z3;
        }
    }

    @Override // X.InterfaceC480520Iss
    public final void LJIJJ(String str, String str2, boolean z, C0IMA c0ima) {
        C11JF c11jf;
        if (LiveInstanceOptSetting.INSTANCE.enable() && ((c11jf = this.LLLILZJ) == null || c11jf.isDisposed())) {
            AfS202S0100000_33 afS202S0100000_33 = new AfS202S0100000_33(this, 5);
            long j = this.LLLILZ;
            if (j > 0) {
                if (j < 10000) {
                    this.LLLILZ = 10000L;
                }
                this.LLLILZJ = (C11JF) C11NZ.LJJJJJL(Mp4ScreenVideoLoadTimeout.CONTROL, this.LLLILZ, TimeUnit.MILLISECONDS).LJJLL(afS202S0100000_33, new AfS131S0000000_3(1));
            }
        }
        String strValueOf = String.valueOf(C0IM9.LIZ(c0ima));
        if (this.LL == null) {
            try {
                LJJJLZIJ(strValueOf, c0ima.LIZLLL);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("prepare create player error");
                sbLIZ.append(e.getMessage());
                C20441214yg.LJ("LivePlayController", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        C1API c1api = this.LLILLJJLI;
        C1API c1api2 = this.LL;
        if (c1api == c1api2) {
            return;
        }
        c1api2.LJIJJ(str, str2, z, c0ima);
    }

    @Override // X.InterfaceC480520Iss
    public final void LJJJI(String str, String str2, String str3, C0IMA c0ima) {
        this.LLJZ = str3;
        String strValueOf = String.valueOf(C0IM9.LIZ(c0ima));
        if (this.LL == null) {
            try {
                LJJJLZIJ(strValueOf, c0ima.LIZLLL);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("prepare create player error");
                sbLIZ.append(e.getMessage());
                C20441214yg.LJ("LivePlayController", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        this.LL.LJJIIJZLJL(str, str2, c0ima);
    }

    @Override // X.InterfaceC480520Iss
    public final void LJJJJJ(String str, String str2, boolean z, String str3) {
        if (this.LL == null) {
            try {
                LJJJLZIJ(str3, false);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("create player in advance but error");
                sbLIZ.append(e.getMessage());
                C20441214yg.LJ("LivePlayController", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        this.LL.LJJJJ(str, str2, z, new C0IMA(UUID.randomUUID().toString(), Long.valueOf(C0IZJ.LIZIZ(str3)), false, ""));
        this.LLILLJJLI = this.LL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("preparedPlayer created ");
        sbLIZ2.append(this.LLILLJJLI.hashCode());
        C20441214yg.LJIIIZ("Play_Controller_Instance", C2188811AlT.LIZIZ(sbLIZ2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC480510Isr
    public final void J0(String str, InterfaceC463820IGu interfaceC463820IGu, int i, C480590Isz c480590Isz, InterfaceC480650It5 interfaceC480650It5, String str2, String str3, C0IMA c0ima) {
        boolean z;
        boolean z2;
        C1API c1api;
        String string;
        C480590Isz c480590Isz2 = c480590Isz;
        long jLIZ = C0IM9.LIZ(c0ima);
        String str4 = c0ima.LIZ;
        if (str4 == null) {
            str4 = "";
        }
        String strLIZIZ = C0IM9.LIZIZ(c0ima);
        String str5 = c0ima.LIZJ;
        if (str5 == null) {
            str5 = "";
        }
        if (str == null) {
            LIZIZ("start -> url is null");
            if (this.LL != null) {
                C827750WdZ.LIZ("LivePlayController", "the method to reset player -> wanna start play, but stream data is empty");
                this.LL.reset();
            }
            C0IX5.LJIJ(3, str4);
            return;
        }
        this.LLLJL = "";
        this.LLJJ = "";
        this.LLJJI = "";
        this.LLJLIL = LiveMode.valueOf(i);
        if (interfaceC463820IGu != 0) {
            if (interfaceC463820IGu instanceof View) {
                Context context = ((View) interfaceC463820IGu).getContext();
                if (context == null) {
                    string = e3.g;
                } else {
                    string = context.toString();
                }
            } else {
                string = null;
            }
            this.LLJZ = string;
            y0(interfaceC463820IGu, string);
        }
        if (str3 != null) {
            this.LLJZ = str3;
        }
        InterfaceC480650It5 interfaceC480650It52 = this.LLJJL;
        if (interfaceC480650It52 != null) {
            interfaceC480650It52.LLLLJ(EnumC1913550ztZ.PLAYER_DETACHED, null);
        }
        this.LLJJL = interfaceC480650It5;
        this.LLJJJIL = true;
        try {
            Uri uri = UriProtector.parse(this.LLJJ);
            Uri uri2 = UriProtector.parse(str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(uri.getHost());
            sbLIZ.append(uri.getPath());
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(uri2.getHost());
            sbLIZ2.append(uri2.getPath());
            z = !C2093608Ic.LIZJ(strLIZIZ2, C2188811AlT.LIZIZ(sbLIZ2));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            z = true;
        }
        this.LLJJ = str;
        this.LLJJIJIL = str2;
        if (c480590Isz2 == null) {
            c480590Isz2 = LLLLL;
        }
        this.LLJJJ = c480590Isz2;
        if (this.LL == null || this.LLILLL) {
            LJJJLZIJ(String.valueOf(jLIZ), c0ima.LIZLLL);
        }
        if (this.LLLF) {
            this.LL.LJJIIZI(1);
        } else {
            this.LL.LJJIIZI(0);
        }
        this.LL.LJJJI(this, this);
        this.LL.LJJII(this.LLLLII);
        LJJZ();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("start player -> playerTag: ");
        sbLIZ3.append(str3);
        sbLIZ3.append(" ,mPlayContextTag: ");
        sbLIZ3.append(this.LLJZ);
        C827750WdZ.LIZ("LivePlayController", C2188811AlT.LIZIZ(sbLIZ3));
        if (!z) {
            int i2 = this.LLILZ;
            if ((i2 & 1) > 0) {
                if ((i2 & 2) > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && (c1api = this.LL) != null) {
                    InterfaceC463820IGu interfaceC463820IGu2 = this.LLILZLL;
                    if (interfaceC463820IGu2 instanceof C1A7I) {
                        LJJLI();
                    } else if ((interfaceC463820IGu2 instanceof C1A7G) || (interfaceC463820IGu2 instanceof C20856616jU)) {
                        c1api.LJJJJI(this.LLJI);
                    }
                    C827750WdZ.LIZ("LivePlayController", "start player -> share player or reuse stream");
                    if (!this.LL.isPlaying()) {
                        C827750WdZ.LIZ("LivePlayController", "start player -> fallback: live player start pulling");
                        C0IX5.LJIJ(8, str4);
                        this.LL.LJJIJLIJ(new C0IMA(str4, Long.valueOf(jLIZ), c0ima.LIZLLL, strLIZIZ), false);
                    }
                    if ((this.LLILZ & 4) > 0) {
                        this.LLJJJJLIIL.obtainMessage(EnumC1913550ztZ.DISPLAYED_PLAY.ordinal(), "all is ready and start render.").sendToTarget();
                        return;
                    }
                    return;
                }
                C0IX5.LJIJ(4, str4);
                return;
            }
        }
        if (!this.LLLFZ) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("shouldDestroy start player -> playerTag: ");
            sbLIZ4.append(str3);
            sbLIZ4.append(" ,mPlayContextTag: ");
            sbLIZ4.append(this.LLJZ);
            C827750WdZ.LIZ("LivePlayController", C2188811AlT.LIZIZ(sbLIZ4));
            if (z) {
                if ((this.LLILZ & 1) > 0) {
                    C0IX5.LJIJ(6, str4);
                    return;
                } else {
                    C0IX5.LJIJ(7, str4);
                    return;
                }
            }
            C0IX5.LJIJ(5, str4);
            return;
        }
        C0IX5.LJIJ(8, str4);
        LJJJLL(new C0IMA(str4, Long.valueOf(jLIZ), c0ima.LIZLLL, str5), false, null);
    }

    @Override // X.InterfaceC480520Iss
    public final void LJJIJL(int i, InterfaceC480650It5 interfaceC480650It5, C480590Isz c480590Isz, C0IMA c0ima, InterfaceC464060IHs interfaceC464060IHs, Long l, String str, String str2, String str3, boolean z) {
        o0(i, interfaceC480650It5, c480590Isz, c0ima, interfaceC464060IHs, l, str, str2, str3, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC480510Isr
    public final void o0(int i, InterfaceC480650It5 interfaceC480650It5, C480590Isz c480590Isz, C0IMA c0ima, InterfaceC463820IGu interfaceC463820IGu, Long l, String str, String str2, String str3, boolean z) {
        String string;
        C480590Isz c480590Isz2 = c480590Isz;
        long jLIZ = C0IM9.LIZ(c0ima);
        String strLJ = c0ima.LIZ;
        if (strLJ == null) {
            strLJ = "";
        }
        C0IM9.LIZIZ(c0ima);
        String str4 = c0ima.LIZJ;
        if (str4 == null) {
            str4 = "";
        }
        if (str == null) {
            LIZIZ("start -> pullStreamData is null");
            if (this.LL != null) {
                C827750WdZ.LIZ("LivePlayController", "the method to reset player -> wanna start play, but stream data is empty");
                this.LL.reset();
            }
            C0IX5.LJIJ(3, strLJ);
            return;
        }
        this.LLLJL = "";
        this.LLJJ = "";
        if (this.LLLFZ) {
            C827750WdZ.LIZ("LivePlayController", "start player -> reset controller`s pullStreamData");
            this.LLJJI = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start. defaultResolution=");
        sbLIZ.append(str2);
        C20441214yg.LJ("LivePlayControllerTag", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJL = jLIZ;
        this.LLJLIL = LiveMode.valueOf(i);
        if (interfaceC463820IGu != 0) {
            if (interfaceC463820IGu instanceof View) {
                Context context = ((View) interfaceC463820IGu).getContext();
                if (context == null) {
                    string = e3.g;
                } else {
                    string = context.toString();
                }
            } else {
                string = null;
            }
            this.LLJZ = string;
            y0(interfaceC463820IGu, string);
        }
        if (str3 != null) {
            this.LLJZ = str3;
        }
        this.LLJJL = interfaceC480650It5;
        this.LLJJJIL = true;
        boolean z2 = !C2093608Ic.LIZJ(this.LLJJI, str);
        this.LLJJI = str;
        this.LLJJIII = str2;
        if (c480590Isz2 == null) {
            c480590Isz2 = LLLLL;
        }
        this.LLJJJ = c480590Isz2;
        if (this.LL == null || this.LLILLL) {
            LJJJLZIJ(String.valueOf(jLIZ), c0ima.LIZLLL);
        }
        if (this.LLLF) {
            this.LL.LJJIIZI(1);
        } else {
            this.LL.LJJIIZI(0);
        }
        this.LL.LJJJI(this, this);
        this.LL.LJJII(this.LLLLII);
        AbstractC1700380uLk abstractC1700380uLk = (AbstractC1700380uLk) this.LL;
        abstractC1700380uLk.LLIZ = jLIZ;
        C1700450uLr c1700450uLr = abstractC1700380uLk.LLILZLL;
        if (c1700450uLr != null) {
            c1700450uLr.LLILZ = jLIZ;
        }
        C1700440uLq c1700440uLq = abstractC1700380uLk.LLILZIL;
        if (c1700440uLq != null) {
            c1700440uLq.LLILZ = jLIZ;
        }
        LJJZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("start player -> playerTag: ");
        sbLIZ2.append(str3);
        sbLIZ2.append(" ,mPlayContextTag: ");
        sbLIZ2.append(this.LLJZ);
        C827750WdZ.LIZ("LivePlayController", C2188811AlT.LIZIZ(sbLIZ2));
        if (!z2) {
            int i2 = this.LLILZ;
            if ((i2 & 1) > 0) {
                if ((i2 & 2) <= 0 && 0 == 0) {
                    C0IX5.LJIJ(4, strLJ);
                    return;
                }
                C827750WdZ.LIZ("LivePlayController", "start player -> share player reuse stream");
                InterfaceC463820IGu interfaceC463820IGu2 = this.LLILZLL;
                if (interfaceC463820IGu2 instanceof C1A7I) {
                    LJJLI();
                } else if ((interfaceC463820IGu2 instanceof C1A7G) || (interfaceC463820IGu2 instanceof C20856616jU)) {
                    this.LL.LJJJJI(this.LLJI);
                }
                if (!this.LL.isPlaying()) {
                    C827750WdZ.LIZ("LivePlayController", "start player -> fallback: live player start pulling");
                    C0IX5.LJIJ(8, strLJ);
                    this.LL.LJJIJLIJ(new C0IMA(strLJ, Long.valueOf(jLIZ), c0ima.LIZLLL, str4), z);
                }
                if ((this.LLILZ & 4) <= 0) {
                    return;
                }
                this.LLJJJJLIIL.obtainMessage(EnumC1913550ztZ.DISPLAYED_PLAY.ordinal(), "all is ready and start render.").sendToTarget();
                return;
            }
        }
        if (!this.LLLFZ) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("shouldDestroy start player -> playerTag: ");
            sbLIZ3.append(str3);
            sbLIZ3.append(" ,mPlayContextTag: ");
            sbLIZ3.append(this.LLJZ);
            C827750WdZ.LIZ("LivePlayController", C2188811AlT.LIZIZ(sbLIZ3));
            if (z2) {
                if ((this.LLILZ & 1) > 0) {
                    C0IX5.LJIJ(6, strLJ);
                    return;
                } else {
                    C0IX5.LJIJ(7, strLJ);
                    return;
                }
            }
            C0IX5.LJIJ(5, strLJ);
            return;
        }
        if (TextUtils.isEmpty(strLJ)) {
            strLJ = C0IX5.LJ(jLIZ);
        }
        LJJJLL(new C0IMA(strLJ, Long.valueOf(jLIZ), c0ima.LIZLLL, str4), z, l);
        C0IX5.LJIJ(8, strLJ);
    }
}
