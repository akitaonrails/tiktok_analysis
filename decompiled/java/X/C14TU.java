package X;

import Y.ARunnableS95S0200000_26;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.ecommerce.dependency.aweme.main.AwemeMainDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.legacy.LegacyDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.aweme.main.IAwemeMainDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.legacy.ILegacyDependencyService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS17S0111000_26;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14TU, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C14TU extends RelativeLayout implements InterfaceC20270014Ta, OnUIPlayListener, GenericLifecycleObserver {
    public static SoftReference<C0N0Y> LLJZIJLIL;
    public boolean LL;
    public Uri LLILLJJLI;
    public Aweme LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public String LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;
    public String LLJIJIL;
    public boolean LLJILJIL;
    public float LLJILJILJ;
    public float LLJILLL;
    public boolean LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public String LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public String LLJJJ;
    public boolean LLJJJIL;
    public int LLJJJJ;
    public boolean LLJJJJJIL;
    public C586940N0i LLJJJJLIIL;
    public InterfaceC1631620sYq<? super String, ? super Map<String, ? extends Object>, ? super InterfaceC20270014Ta, Unit> LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public C1473870oSP LLJLIL;
    public C1473870oSP LLJLILLLLZIIL;
    public final RemoteImageView LLJLL;
    public LifecycleOwner LLJLLIL;
    public final C01GW LLJLLL;
    public Function1<? super Aweme, Unit> LLJZ;

    public C0N0Y LJ() {
        return null;
    }

    public boolean LJIILLIIL() {
        return this instanceof C1766620w4a;
    }

    public String getVideoEnterFrom() {
        return null;
    }

    public Map<String, String> getVideoSceneTag() {
        return null;
    }

    public String getVideoTag() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
        return C583620Mum.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBrightnessChanged(String str, float f) {
        C583620Mum.LIZIZ(this, str, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBufferedPercent(String str, long j, int i) {
        C583620Mum.LIZJ(this, str, j, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
        C583620Mum.LIZLLL(this, str, j);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(String str, boolean z) {
        C583620Mum.LJ(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
        C583620Mum.LJFF(this, str, z, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onCompleteLoaded(String str, boolean z) {
        C583620Mum.LJII(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onCrosstalkHappened(String str) {
        C583620Mum.LJIIIIZZ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onCrosstalkHappened(String str, List list) {
        C583620Mum.LJIIIZ(this, str, list);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z) {
        C583620Mum.LJIIJ(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
        C583620Mum.LJIIJJI(this, str, z, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
        C583620Mum.LJIILIIL(this, i, j, j2, map);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        C583620Mum.LJIILJJIL(this, str, c1480420ocy);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onLoopPlay(String str, int i) {
        C583620Mum.LJIILL(this, str, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
        C583620Mum.LJIILLIIL(this, str, c1480290ocl);
    }

    public /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJIJ(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompleted(String str, int i) {
        C583620Mum.LJIJJ(this, str, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJIL(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN) {
        C583620Mum.LJJ(this, str, c1481290oeN);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
        C583620Mum.LJJI(this, str, c1481290oeN, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPause(String str) {
        C583620Mum.LJJII(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepare(String str) {
        C583620Mum.LJJIII(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepared(String str) {
        C583620Mum.LJJIIJ(this, str);
    }

    public /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
        C583620Mum.LJJIIZ(this, str, j, j2);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayRelease(String str) {
        C583620Mum.LJJIIZI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str) {
        C583620Mum.LJJIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject) {
        C583620Mum.LJJIJIIJI(this, str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
        C583620Mum.LJJIJIIJIL(this, str, jSONObject, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, boolean z) {
        C583620Mum.LJJIJIL(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
        C583620Mum.LJJIJL(this, str, i, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlaying(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJIL(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreRenderSessionMissed(String str) {
        C583620Mum.LJJIZ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJI(this, str, c1480430ocz);
    }

    public /* synthetic */ void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        C583620Mum.LJJJIL(this, str, c1480420ocy);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
        C583620Mum.LJJJJI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJJJL(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
        C583620Mum.LJJJJL(this, str, c1481290oeN);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSeekEnd(String str, boolean z) {
        C583620Mum.LJJJJLL(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSeekStart(String str, int i, float f) {
        C583620Mum.LJJJJZ(this, str, i, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSpeedChanged(String str, float f) {
        C583620Mum.LJJJJZI(this, str, f);
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onHostResume(lifecycleOwner);
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onHostPause(lifecycleOwner);
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onHostDestroy(lifecycleOwner);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onStopPlay(String str) {
        C583620Mum.LJJJLIIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i) {
        C583620Mum.LJJJLL(this, str, enumC2281141EQm, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoSecondFrame(String str) {
        C583620Mum.LJJJLZIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
        C583620Mum.LJJJZ(this, str, i, i2);
    }

    public void setBorderRadius(float[] fArr) {
    }

    public void setDeviceChangeAware(boolean z) {
    }

    public void setLogExtra(HashMap<String, Object> map) {
    }

    public void setPreload(boolean z) {
    }

    public void setSinglePlayerScene(String str) {
    }

    public void setVideoHeight(int i) {
    }

    public void setVideoWidth(int i) {
    }

    private final void LJIILJJIL() {
        if (this.LL) {
            LIZLLL();
            this.LLJLILLLLZIIL = this.LLJLIL;
            C1473870oSP c1473870oSP = new C1473870oSP(getContext(), null);
            C786410Ut5.Q5(c1473870oSP, 0.0f);
            this.LLJLIL = c1473870oSP;
            addView(c1473870oSP, -1, -1);
            C586940N0i c586940N0i = new C586940N0i(this.LLJLIL, this);
            this.LLJJJJLIIL = c586940N0i;
            c586940N0i.LIZIZ = getPlayer();
            C1473870oSP c1473870oSP2 = this.LLJLIL;
            if (c1473870oSP2 != null) {
                c1473870oSP2.setSurfaceTextureListener(getSurfaceListener());
            }
            C586940N0i c586940N0i2 = this.LLJJJJLIIL;
            if (c586940N0i2 != null) {
                c586940N0i2.LJFF = this.LLJI;
                Uri uri = this.LLILLJJLI;
                if (uri == null || !uri.isHierarchical()) {
                    c586940N0i2.LIZLLL = this.LLILLL;
                    c586940N0i2.LJI = getVideoEnterFrom();
                    c586940N0i2.LJII = getVideoTag();
                    c586940N0i2.LJIIIIZZ = getVideoSceneTag();
                } else {
                    c586940N0i2.LJ = this.LLJJJ;
                }
            }
            requestLayout();
            String str = this.LLJIJIL;
            if (this.LLJLL.getTag() == null && C770702zh.LIZIZ(this.LLJIJIL) && str != null) {
                RemoteImageView remoteImageView = this.LLJLL;
                C786410Ut5.I5(remoteImageView, 1.0f);
                C1331070kk5 hierarchy = remoteImageView.getHierarchy();
                String str2 = this.LLILZLL;
                hierarchy.LJIIZILJ(Intrinsics.LJFF(str2, "contain") ? InterfaceC1320380kSq.LIZJ : Intrinsics.LJFF(str2, "cover") ? InterfaceC1320380kSq.LJI : InterfaceC1320380kSq.LIZ);
                LJI(remoteImageView, this.LLJIJIL);
                remoteImageView.setTag(this.LLJIJIL);
            }
        } else {
            LIZIZ();
        }
        if (!LJIILLIIL()) {
            LIZ(new AwS574S0100000_30(this, 48));
        }
        this.LLJJ = false;
        this.LL = false;
    }

    private final C0N0Y getPlayer() {
        return (C0N0Y) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    private final String getReactSessionId() {
        return (String) this.LLJL.getValue();
    }

    private final C14TY getSurfaceListener() {
        return (C14TY) this.LLJLLL.getValue();
    }

    public final void LIZIZ() {
        C0N0Y c0n0y;
        if (this.LLILZ) {
            C586940N0i c586940N0i = this.LLJJJJLIIL;
            if (c586940N0i == null || (c0n0y = c586940N0i.LIZIZ) == null) {
                return;
            }
            c0n0y.LJFF();
            return;
        }
        C586940N0i c586940N0i2 = this.LLJJJJLIIL;
        if (c586940N0i2 != null) {
            float f = this.LLJILJILJ;
            C0N0Y c0n0y2 = c586940N0i2.LIZIZ;
            if (c0n0y2 != null) {
                c0n0y2.LJJLIL(f, f);
            }
        }
    }

    public void LIZLLL() {
        C0N0Y videoPlayer;
        if (this.LLILZIL > 0 && (videoPlayer = getVideoPlayer()) != null) {
            videoPlayer.LJJIIZI();
        }
        C586940N0i c586940N0i = this.LLJJJJLIIL;
        if (c586940N0i != null) {
            c586940N0i.LJ();
        }
        C586940N0i c586940N0i2 = this.LLJJJJLIIL;
        if (c586940N0i2 != null) {
            c586940N0i2.LIZJ();
        }
    }

    public final void LJFF() {
        C0N0Y videoPlayer;
        C586940N0i c586940N0i = this.LLJJJJLIIL;
        if (c586940N0i != null) {
            c586940N0i.LJ();
        }
        if (this.LLILZIL <= 0 || (videoPlayer = getVideoPlayer()) == null) {
            return;
        }
        videoPlayer.LJJIIZI();
    }

    public void LJIIIIZZ() {
        if (this.LLJJ) {
            LJIILJJIL();
        }
    }

    public final void LJIIJ() {
        AnonymousClass0317 anonymousClass0317CreateIAwemeMainDependencyServicebyMonsterPlugin;
        if (this.LLILLL != null) {
            LJFF();
            if (getVideoPlayer() != null) {
                LJII("onZoomChange", C2097608Jq.LJI(new Pair("zoom", 1)));
                return;
            }
            return;
        }
        Uri uri = this.LLILLJJLI;
        if (uri != null) {
            if (uri.isHierarchical()) {
                LJFF();
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIAwemeMainDependencyServicebyMonsterPlugin = AwemeMainDependencyService.createIAwemeMainDependencyServicebyMonsterPlugin(false);
                    C1AQS.LIZJ(jElapsedRealtime, 1, IAwemeMainDependencyService.class.getName(), anonymousClass0317CreateIAwemeMainDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIAwemeMainDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIAwemeMainDependencyServicebyMonsterPlugin != null);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIAwemeMainDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAwemeMainDependencyService.class);
                }
                Context context = getContext();
                String str = this.LLJJJ;
                ((IAwemeMainDependencyService) anonymousClass0317CreateIAwemeMainDependencyServicebyMonsterPlugin).startVideoPlayActivity(context, str, "", this.LLJI, str, C08HM.LIZJ(str), "hybrid", "", this.LLJILLL);
                this.LLJILLL = 0.0f;
            }
        }
    }

    public void LJIILIIL() {
        C0N0Y c0n0y;
        C586940N0i c586940N0i = this.LLJJJJLIIL;
        if (c586940N0i == null || (c0n0y = c586940N0i.LIZIZ) == null) {
            return;
        }
        c0n0y.release();
    }

    public int getDuration() {
        Video video;
        Aweme aweme = this.LLILLL;
        if (aweme == null || (video = aweme.getVideo()) == null) {
            return 0;
        }
        return video.getDuration();
    }

    public final String getOrigSourceId() {
        String aid;
        Aweme aweme = this.LLILLL;
        return (aweme == null || (aid = aweme.getAid()) == null) ? this.LLJJJ : aid;
    }

    public final void LJIIJJI() {
        IECommerceHostService iECommerceHostService;
        C928103jz top;
        Context context;
        Activity activityLIZ;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
        if (rootPageMonitor == null || (top = rootPageMonitor.getTop()) == null || (context = top.LIZ) == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return;
        }
        activityLIZ.finish();
    }

    public final Long getCurrentPosition() {
        C0N0Y videoPlayer = getVideoPlayer();
        if (videoPlayer != null) {
            return Long.valueOf(videoPlayer.getCurrentPosition());
        }
        return null;
    }

    public C0N0Y getVideoPlayer() {
        return getPlayer();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJJJIL = true;
        LIZLLL();
    }

    public void pause() {
        LJFF();
        this.LLJJJJJIL = true;
    }

    @Override // android.widget.RelativeLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
        layout(getPaddingLeft() + getLeft(), getPaddingTop() + getTop(), getWidth() + getPaddingLeft() + getLeft(), getHeight() + getPaddingTop() + getTop());
    }

    public final Aweme getAweme() {
        return this.LLILLL;
    }

    public final int getCompleteCount() {
        return this.LLJJJJ;
    }

    public final boolean getNeedPlay() {
        return this.LLJJIJIIJIL;
    }

    public final String getSrc() {
        return this.LLJJIJI;
    }

    public final C1473870oSP getTextureView() {
        return this.LLJLIL;
    }

    public final C586940N0i getVideoControl() {
        return this.LLJJJJLIIL;
    }

    public void LIZ(Function0<Unit> function0) {
        Boolean boolValueOf;
        if (this.LLJJIJIL) {
            LJIIL(function0);
            return;
        }
        C586940N0i c586940N0i = this.LLJJJJLIIL;
        if (c586940N0i != null) {
            boolValueOf = Boolean.valueOf(c586940N0i.LJII());
        } else {
            boolValueOf = null;
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE) && !this.LLJJJIL) {
            HandlerHook.viewPostDelay(this, new ARunnableS95S0200000_26(this, function0, 16), 100L);
            return;
        }
        if (this.LLJJIJIIJIL) {
            this.LLJJIJIIJIL = false;
            C586940N0i c586940N0i2 = this.LLJJJJLIIL;
            if (c586940N0i2 != null) {
                c586940N0i2.LJFF(this.LLJ);
            }
            LIZIZ();
        } else {
            C586940N0i c586940N0i3 = this.LLJJJJLIIL;
            if (c586940N0i3 != null) {
                C586940N0i.LJI(c586940N0i3);
            }
        }
        this.LLJJJJJIL = false;
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    public Aweme LJIIIZ(String str) {
        AnonymousClass0317 anonymousClass0317CreateILegacyDependencyServicebyMonsterPlugin;
        String name;
        try {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                boolean z = false;
                anonymousClass0317CreateILegacyDependencyServicebyMonsterPlugin = LegacyDependencyService.createILegacyDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateILegacyDependencyServicebyMonsterPlugin != null) {
                    z = true;
                }
                String name2 = ILegacyDependencyService.class.getName();
                if (anonymousClass0317CreateILegacyDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateILegacyDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILegacyDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILegacyDependencyService.class);
            }
            return ((ILegacyDependencyService) anonymousClass0317CreateILegacyDependencyServicebyMonsterPlugin).parseAwemeJSONStr(str);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public final void LJIIL(Function0<Unit> function0) {
        C0N0Y videoPlayer;
        C586940N0i c586940N0i = this.LLJJJJLIIL;
        if (c586940N0i != null) {
            if (!c586940N0i.LIZIZ(this.LLJ) && !this.LLJJJIL) {
                HandlerHook.viewPostDelay(this, new ARunnableS95S0200000_26(this, function0, 15), 100L);
                return;
            }
            this.LLJ = 0;
            LIZIZ();
            if (this.LLILZIL > 0 && (videoPlayer = getVideoPlayer()) != null) {
                videoPlayer.LJJIJIIJI(this.LLILZIL);
            }
            this.LLJJJJJIL = false;
            if (function0 == null) {
                return;
            }
            function0.invoke();
        }
    }

    public final boolean LJIILL(String str) {
        String aid;
        if (!Intrinsics.LJFF(str, this.LLJJJ)) {
            Aweme aweme = this.LLILLL;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            if (!Intrinsics.LJFF(str, aid)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        LJII("onBuffering", C2097608Jq.LJI(new Pair("buffer", Integer.valueOf(z ? 1 : 0))));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onHostDestroy(LifecycleOwner lifecycleOwner) {
        if (C1832807Fu.LIZ()) {
            LJIILIIL();
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
        this.LLJLLIL = null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onHostPause(LifecycleOwner lifecycleOwner) {
        C0N0Y videoPlayer = getVideoPlayer();
        if (videoPlayer != null && videoPlayer.isPlaying() && this.LLJILJIL && !this.LLIZ) {
            LJFF();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onHostResume(LifecycleOwner lifecycleOwner) {
        C0N0Y videoPlayer = getVideoPlayer();
        if (videoPlayer != null && !videoPlayer.isPlaying() && this.LLJILJIL && !this.LLJJJJJIL && !this.LLIZ) {
            LIZ(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        if (LJIILL(str)) {
            LJII("onPause", new HashMap());
        }
    }

    public void onPlayCompleted(String str) {
        if (LJIILL(str)) {
            int i = this.LLJJJJ;
            this.LLJJJJ = i + 1;
            LJII("onCompleted", C2097608Jq.LJI(new Pair("times", Integer.valueOf(i))));
            if (!this.LLJI && this.LLJJIJIL) {
                this.LLJJIJIIJIL = true;
                this.LLJ = 0;
                LIZ(new AwS17S0111000_26(this, false, 0, 1));
                LJFF();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        if (LJIILL(str)) {
            LJII("onFirstCompleted", new HashMap());
        }
    }

    public void onPlayFailed(C1481290oeN c1481290oeN) {
        if (LJIILL(c1481290oeN.LIZ)) {
            LJII("onPlayFailed", new HashMap());
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        long currentPosition;
        this.LLJILLL = f;
        Pair[] pairArr = new Pair[1];
        C0N0Y videoPlayer = getVideoPlayer();
        if (videoPlayer != null) {
            currentPosition = videoPlayer.getCurrentPosition();
        } else {
            currentPosition = 0;
        }
        pairArr[0] = new Pair("progress", Integer.valueOf((int) currentPosition));
        LJII("onProgressChange", C2097608Jq.LJI(pairArr));
    }

    public void onPlaying(String str) {
        if (LJIILL(str)) {
            C1473870oSP c1473870oSP = this.LLJLIL;
            if (c1473870oSP != null) {
                C786410Ut5.Q5(c1473870oSP, 1.0f);
            }
            C786410Ut5.I5(this.LLJLL, 0.0f);
            C1473870oSP c1473870oSP2 = this.LLJLILLLLZIIL;
            if (c1473870oSP2 != null) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, c1473870oSP2);
                removeView(c1473870oSP2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        if (LJIILL(str)) {
            LJII("onPreparePlay", new HashMap());
        }
    }

    public void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        if (LJIILL(c1480420ocy.getSourceId())) {
            C1473870oSP c1473870oSP = this.LLJLIL;
            if (c1473870oSP != null) {
                C786410Ut5.Q5(c1473870oSP, 1.0f);
            }
            C786410Ut5.I5(this.LLJLL, 0.0f);
            C1473870oSP c1473870oSP2 = this.LLJLILLLLZIIL;
            if (c1473870oSP2 != null) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, c1473870oSP2);
                removeView(c1473870oSP2);
            }
            this.LLJILLL = 0.0f;
            LJII("onFirstFrame", new HashMap());
            LJII("onPlay", new HashMap());
            if (this.LLJJJJJIL) {
                pause();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(C1480430ocz c1480430ocz) {
        if (LJIILL(c1480430ocz.LIZ)) {
            LJII("onRenderReady", new HashMap());
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        if (LJIILL(str)) {
            LJII("onPlay", new HashMap());
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(C1481290oeN c1481290oeN) {
        LJII("onError", C2097608Jq.LJI(new Pair("message", c1481290oeN.toString())));
    }

    public void setAutoLifecycle(boolean z) {
        this.LLJILJIL = z;
    }

    public void setAutoPlay(boolean z) {
        this.LLIZLLLIL = z;
    }

    public final void setAweme(Aweme aweme) {
        this.LLILLL = aweme;
    }

    public final void setCompleteCount(int i) {
        this.LLJJJJ = i;
    }

    public void setId(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void setInitTime(int i) {
        if (this.LLJ != i) {
            this.LLJJ = true;
        }
        this.LLJ = i;
    }

    public void setLoop(boolean z) {
        boolean z2;
        if (z != this.LLJI) {
            z2 = true;
            this.LLJJ = true;
        } else {
            z2 = false;
        }
        this.LL = z2;
        this.LLJI = z;
    }

    public final void setManuallyPaused(boolean z) {
        this.LLJJJJJIL = z;
    }

    public void setMuted(boolean z) {
        if (this.LLILZ != z) {
            this.LLJJ = true;
        }
        this.LLILZ = z;
    }

    public final void setNeedPlay(boolean z) {
        this.LLJJIJIIJIL = z;
    }

    public void setObjectFit(String str) {
        this.LLILZLL = str;
    }

    public final void setOnAwemeParsedListener(Function1<? super Aweme, Unit> function1) {
        this.LLJZ = function1;
    }

    public final void setPlayLegacy(boolean z) {
        this.LLJJIJIL = z;
    }

    public void setPoster(String str) {
        boolean z = !Intrinsics.LJFF(this.LLJIJIL, str);
        if (z) {
            this.LLJJ = true;
        }
        this.LL = z;
        this.LLJIJIL = str;
    }

    public void setRate(int i) {
        this.LLILZIL = i;
    }

    public void setSinglePlayer(boolean z) {
        this.LLIZ = z;
    }

    public void setSrc(String str) {
        Object c098200Yq;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        int iIntValue;
        Integer numLJIIJJI;
        Integer numLJIIJJI2;
        if (!Intrinsics.LJFF(this.LLJJIJI, str)) {
            this.LLJJIJI = str;
            this.LLJJIJIIJIL = true;
        }
        int iIntValue2 = 0;
        String aid = null;
        if (str != null) {
            try {
                if (u.LJJIIJZLJL(str, "video://", false)) {
                    c098200Yq = UriProtector.parse(str);
                } else {
                    c098200Yq = LJIIIZ(str);
                }
                if (c098200Yq == null) {
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    return;
                }
            }
            if (c098200Yq instanceof Uri) {
                if (!Intrinsics.LJFF(this.LLILLJJLI, c098200Yq)) {
                    this.LLJJ = true;
                    this.LL = true;
                }
                Uri uri = (Uri) c098200Yq;
                this.LLILLJJLI = uri;
                if (Intrinsics.LJFF("false", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "play_legacy"))) {
                    this.LLJJIJIL = false;
                } else {
                    this.LLJJIJIL = true;
                }
                Uri uri2 = this.LLILLJJLI;
                this.LLJJI = 0;
                this.LLJJIII = 0;
                if (uri2 != null && uri2.isHierarchical()) {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "width");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) != null) {
                        iIntValue = numLJIIJJI2.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    this.LLJJI = iIntValue;
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "height");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3)) != null) {
                        iIntValue2 = numLJIIJJI.intValue();
                    }
                    this.LLJJIII = iIntValue2;
                }
                Uri uri3 = this.LLILLJJLI;
                if (uri3 == null || !uri3.isHierarchical() || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri3, "play_url")) == null || !this.LLJJIJIL) {
                    return;
                }
                boolean z = !Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, this.LLJJJ);
                if (z) {
                    this.LLJJ = true;
                }
                this.LL = z;
                this.LLJJIJIIJIL = z;
                this.LLJJJ = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                LJIILJJIL();
                return;
            }
            if (!(c098200Yq instanceof Aweme)) {
                return;
            }
            if (this.LLILLJJLI == null) {
                Aweme aweme = this.LLILLL;
                if (aweme != null) {
                    aid = aweme.getAid();
                }
                if (!Intrinsics.LJFF(aid, ((Aweme) c098200Yq).getAid())) {
                    this.LLJJ = true;
                    this.LL = true;
                }
            }
            this.LLILLL = (Aweme) c098200Yq;
            Function1<? super Aweme, Unit> function1 = this.LLJZ;
            if (function1 == null) {
                return;
            }
            function1.invoke(c098200Yq);
        }
    }

    public void setStateChangeReporter(InterfaceC1631620sYq<? super String, ? super Map<String, ? extends Object>, ? super InterfaceC20270014Ta, Unit> interfaceC1631620sYq) {
        this.LLJJL = interfaceC1631620sYq;
    }

    public final void setTextureView(C1473870oSP c1473870oSP) {
        this.LLJLIL = c1473870oSP;
    }

    public final void setVideoControl(C586940N0i c586940N0i) {
        this.LLJJJJLIIL = c586940N0i;
    }

    public void setVolume(float f) {
        if (this.LLJILJILJ != f) {
            this.LLJJ = true;
        }
        this.LLJILJILJ = f;
    }

    public C14TU(Context context, AttributeSet attributeSet) {
        this(0, context, attributeSet, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(int r8, int r9) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LLILLL
            r6 = 0
            if (r0 == 0) goto La6
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            if (r0 == 0) goto La6
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LLILLL
            if (r0 == 0) goto La3
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            if (r0 == 0) goto La3
            int r1 = r0.getWidth()
        L19:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LLILLL
            if (r0 == 0) goto L27
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            if (r0 == 0) goto L27
            int r6 = r0.getHeight()
        L27:
            r0 = r6
            r6 = r1
        L29:
            X.0oSP r4 = r7.LLJLIL
            java.lang.String r5 = r7.LLILZLL
            if (r4 == 0) goto L91
            if (r9 <= 0) goto L91
            if (r8 <= 0) goto L91
            if (r6 <= 0) goto L91
            if (r0 <= 0) goto L91
            int r3 = r4.getWidth()
            int r1 = r4.getHeight()
            float r2 = (float) r1
            float r1 = (float) r3
            float r2 = r2 / r1
            float r3 = (float) r0
            float r0 = (float) r6
            float r3 = r3 / r0
            java.lang.String r0 = "cover"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L92
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 <= 0) goto L9e
        L53:
            float r2 = r2 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            r1 = r2
        L57:
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.Float r0 = java.lang.Float.valueOf(r3)
            r2.<init>(r1, r0)
            java.lang.Object r0 = r2.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            float r5 = r0.floatValue()
            java.lang.Object r0 = r2.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            float r3 = r0.floatValue()
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            int r0 = r4.getWidth()
            int r0 = r0 >> 1
            float r1 = (float) r0
            int r0 = r4.getHeight()
            int r0 = r0 >> 1
            float r0 = (float) r0
            r2.setScale(r5, r3, r1, r0)
            r4.setTransform(r2)
        L91:
            return
        L92:
            java.lang.String r0 = "contain"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)
            if (r0 == 0) goto La0
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 <= 0) goto L53
        L9e:
            float r3 = r3 / r2
            goto L57
        La0:
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L57
        La3:
            r1 = 0
            goto L19
        La6:
            android.net.Uri r0 = r7.LLILLJJLI
            if (r0 == 0) goto Lb0
            int r6 = r7.LLJJI
            int r0 = r7.LLJJIII
            goto L29
        Lb0:
            r0 = 0
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14TU.LIZJ(int, int):void");
    }

    public void LJI(RemoteImageView remoteImageView, String str) {
        C1324840ka2.LJIIJ(remoteImageView, str, -1, -1);
    }

    public final void LJII(String str, Map<String, ? extends Object> map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeclarativeVideoPlayBox- ");
        sbLIZ.append(str);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1631620sYq<? super String, ? super Map<String, ? extends Object>, ? super InterfaceC20270014Ta, Unit> interfaceC1631620sYq = this.LLJJL;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(str, map, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C14TU(int i, Context context, AttributeSet attributeSet, boolean z) {
        Object baseContext;
        LifecycleOwner lifecycleOwner;
        ContextWrapper contextWrapper;
        Lifecycle lifecycle;
        super(context, attributeSet, i);
        this.LLILZIL = 166;
        this.LLILZLL = "fill";
        this.LLJIJIL = "";
        this.LLJILJILJ = 1.0f;
        this.LLJJIJI = "";
        this.LLJJIJIL = true;
        this.LLJJJ = "";
        this.LLJJJJ = 1;
        this.LLJJJJJIL = true;
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new C14TW(this));
        this.LLJL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(350));
        RemoteImageView remoteImageView = new RemoteImageView(context);
        this.LLJLL = remoteImageView;
        try {
            addView(remoteImageView, -1, -1);
            if (z) {
                if (context instanceof LifecycleOwner) {
                    lifecycleOwner = (LifecycleOwner) context;
                } else {
                    if ((context instanceof ContextWrapper) && (contextWrapper = (ContextWrapper) context) != null) {
                        baseContext = contextWrapper.getBaseContext();
                    } else {
                        baseContext = null;
                    }
                    if (baseContext instanceof LifecycleOwner) {
                        lifecycleOwner = (LifecycleOwner) baseContext;
                    } else {
                        lifecycleOwner = null;
                        this.LLJLLIL = lifecycleOwner;
                    }
                }
                if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                    lifecycle.addObserver(this);
                }
                this.LLJLLIL = lifecycleOwner;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "init EcVideoPlayBox error");
        }
        this.LLJLLL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS574S0100000_30(this, 321));
    }
}
