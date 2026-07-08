package X;

import Y.ARunnableS97S0200000_28;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.api.IActivityStackService;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.components.video.playbox.IAwemeParseService;
import com.ss.android.ugc.aweme.components.video.playbox.IVideoPlayService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS144S1100000_30;
import kotlin.jvm.internal.AwS17S0111000_26;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14TT, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C14TT extends AbstractC21340218fI implements OnUIPlayListener, GenericLifecycleObserver {
    public static SoftReference<C0N0Y> LLJZIJLIL;
    public boolean LLILLJJLI;
    public Uri LLILLL;
    public Aweme LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public String LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public int LLJI;
    public boolean LLJIJIL;
    public String LLJILJIL;
    public boolean LLJILJILJ;
    public float LLJILLL;
    public float LLJJ;
    public boolean LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public String LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public String LLJJJIL;
    public final IResourceLoaderService LLJJJJ;
    public boolean LLJJJJJIL;
    public int LLJJJJLIIL;
    public boolean LLJJL;
    public C586940N0i LLJJLIIIJLLLLLLLZ;
    public InterfaceC1631620sYq<? super String, ? super Map<String, ? extends Object>, ? super AbstractC21340218fI, Unit> LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public C1473870oSP LLJLLIL;
    public C1473870oSP LLJLLL;
    public final RemoteImageView LLJZ;

    public C0N0Y LJIIIZ() {
        return null;
    }

    public boolean LJIJ() {
        return false;
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
            onHostDestroy();
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

    @Override // X.AbstractC21340218fI
    public void setDeviceChangeAware(boolean z) {
    }

    @Override // X.AbstractC21340218fI
    public void setPreload(boolean z) {
    }

    private final void LJI() {
        C0N0Y c0n0y;
        if (this.LLILZIL) {
            C586940N0i c586940N0i = this.LLJJLIIIJLLLLLLLZ;
            if (c586940N0i == null || (c0n0y = c586940N0i.LIZIZ) == null) {
                return;
            }
            c0n0y.LJFF();
            return;
        }
        C586940N0i c586940N0i2 = this.LLJJLIIIJLLLLLLLZ;
        if (c586940N0i2 != null) {
            float f = this.LLJILLL;
            C0N0Y c0n0y2 = c586940N0i2.LIZIZ;
            if (c0n0y2 != null) {
                c0n0y2.LJJLIL(f, f);
            }
        }
    }

    private final C0N0Y getMPlayer() {
        return (C0N0Y) this.LLJLIL.getValue();
    }

    private final String getMReactSessionId() {
        return (String) this.LLJLL.getValue();
    }

    private final C14TX getSurfaceListener() {
        return (C14TX) this.LLJLILLLLZIIL.getValue();
    }

    @Override // X.AbstractC21340218fI
    public void LIZIZ() {
        if (this.LLJJI) {
            LJIILLIIL();
        }
    }

    @Override // X.AbstractC21340218fI
    public void LIZJ() {
        if (this.LLILZ != null) {
            LJIIJ();
            if (getPlayer() != null) {
                LJIIL("onZoomChange", C2097608Jq.LJI(new Pair("zoom", 1)));
                return;
            }
            return;
        }
        Uri uri = this.LLILLL;
        if (uri == null || !uri.isHierarchical()) {
            return;
        }
        LJIIJ();
        IVideoPlayService iVideoPlayService = (IVideoPlayService) PluggableExtentionKt.pluggableSpi$default(IVideoPlayService.class, false, false, false, 14, null);
        if (iVideoPlayService != null) {
            Context context = getContext();
            String str = this.LLJJJIL;
            iVideoPlayService.LIZIZ(context, str, this.LLJIJIL, str, C08HM.LIZJ(str), this.LLJJ);
        }
        this.LLJJ = 0.0f;
    }

    @Override // X.AbstractC21340218fI
    public void LIZLLL() {
        Activity topActivity;
        IActivityStackService iActivityStackService = (IActivityStackService) PluggableExtentionKt.pluggableSpi$default(IActivityStackService.class, false, false, false, 14, null);
        if (iActivityStackService == null || (topActivity = iActivityStackService.getTopActivity()) == null) {
            return;
        }
        topActivity.finish();
    }

    public void LJIIIIZZ() {
        C0N0Y player;
        if (this.LLILZLL > 0 && (player = getPlayer()) != null) {
            player.LJJIIZI();
        }
        C586940N0i c586940N0i = this.LLJJLIIIJLLLLLLLZ;
        if (c586940N0i != null) {
            c586940N0i.LJ();
        }
        C586940N0i c586940N0i2 = this.LLJJLIIIJLLLLLLLZ;
        if (c586940N0i2 != null) {
            c586940N0i2.LIZJ();
        }
    }

    public final void LJIIJ() {
        C0N0Y player;
        C586940N0i c586940N0i = this.LLJJLIIIJLLLLLLLZ;
        if (c586940N0i != null) {
            c586940N0i.LJ();
        }
        if (this.LLILZLL <= 0 || (player = getPlayer()) == null) {
            return;
        }
        player.LJJIIZI();
    }

    public void LJIILL() {
        C0N0Y c0n0y;
        C586940N0i c586940N0i = this.LLJJLIIIJLLLLLLLZ;
        if (c586940N0i == null || (c0n0y = c586940N0i.LIZIZ) == null) {
            return;
        }
        c0n0y.release();
    }

    public final void LJIILLIIL() {
        if (this.LLILLJJLI) {
            LJIIIIZZ();
            this.LLJLLL = this.LLJLLIL;
            C1473870oSP c1473870oSP = new C1473870oSP(getContext(), null);
            C786410Ut5.Q5(c1473870oSP, 0.0f);
            this.LLJLLIL = c1473870oSP;
            addView(c1473870oSP, -1, -1);
            C586940N0i c586940N0i = new C586940N0i(this.LLJLLIL, this);
            this.LLJJLIIIJLLLLLLLZ = c586940N0i;
            c586940N0i.LIZIZ = getMPlayer();
            C1473870oSP c1473870oSP2 = this.LLJLLIL;
            if (c1473870oSP2 != null) {
                c1473870oSP2.setSurfaceTextureListener(getSurfaceListener());
            }
            C586940N0i c586940N0i2 = this.LLJJLIIIJLLLLLLLZ;
            if (c586940N0i2 != null) {
                c586940N0i2.LJFF = this.LLJIJIL;
                Uri uri = this.LLILLL;
                if (uri == null || !uri.isHierarchical()) {
                    c586940N0i2.LIZLLL = this.LLILZ;
                    c586940N0i2.LJI = getVideoEnterFrom();
                    c586940N0i2.LJII = getVideoTag();
                    c586940N0i2.LJIIIIZZ = getVideoSceneTag();
                } else {
                    c586940N0i2.LJ = this.LLJJJIL;
                }
            }
            requestLayout();
            String str = this.LLJILJIL;
            if (this.LLJZ.getTag() == null && C123100dR.LIZ(this.LLJILJIL) && str != null) {
                RemoteImageView remoteImageView = this.LLJZ;
                C786410Ut5.I5(remoteImageView, 1.0f);
                C1331070kk5 hierarchy = remoteImageView.getHierarchy();
                String str2 = this.LLIZ;
                hierarchy.LJIIZILJ(Intrinsics.LJFF(str2, "contain") ? InterfaceC1320380kSq.LIZJ : Intrinsics.LJFF(str2, "cover") ? InterfaceC1320380kSq.LJI : InterfaceC1320380kSq.LIZ);
                LJIIJJI(remoteImageView, this.LLJILJIL);
                remoteImageView.setTag(this.LLJILJIL);
            }
        } else {
            LJI();
        }
        if (!LJIJ()) {
            LJ(new AwS574S0100000_30(this, 31));
        }
        this.LLJJI = false;
        this.LLILLJJLI = false;
    }

    public final String getOrigSourceId() {
        String aid;
        Aweme aweme = this.LLILZ;
        return (aweme == null || (aid = aweme.getAid()) == null) ? this.LLJJJIL : aid;
    }

    public final Long getCurrentPosition() {
        C0N0Y player = getPlayer();
        if (player != null) {
            return Long.valueOf(player.getCurrentPosition());
        }
        return null;
    }

    public C0N0Y getPlayer() {
        return getMPlayer();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJJJJJIL = true;
        LJIIIIZZ();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onHostDestroy() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        ContextWrapper contextWrapper;
        Context context = getContext();
        Object baseContext = null;
        if ((context instanceof ContextWrapper) && (contextWrapper = (ContextWrapper) context) != null) {
            baseContext = contextWrapper.getBaseContext();
        }
        if (!(baseContext instanceof LifecycleOwner) || (lifecycleOwner = (LifecycleOwner) baseContext) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            return;
        }
        lifecycle.removeObserver(this);
    }

    @Override // X.AbstractC21340218fI
    public void pause() {
        LJIIJ();
        this.LLJJL = true;
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

    @Override // X.AbstractC21340218fI
    public final void LIZ() {
        LJIILL();
    }

    public final int getCompleteCount() {
        return this.LLJJJJLIIL;
    }

    public final C1473870oSP getMTextureView() {
        return this.LLJLLIL;
    }

    public final C586940N0i getMVideoControl() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final String getSrc() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.AbstractC21340218fI
    public void LJ(Function0<Unit> function0) {
        Boolean boolValueOf;
        if (this.LLJJJ) {
            LJIILJJIL(function0);
            return;
        }
        C586940N0i c586940N0i = this.LLJJLIIIJLLLLLLLZ;
        if (c586940N0i != null) {
            boolValueOf = Boolean.valueOf(c586940N0i.LJII());
        } else {
            boolValueOf = null;
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE) && !this.LLJJJJJIL) {
            HandlerHook.viewPostDelay(this, new ARunnableS97S0200000_28(this, function0, 16), 100L);
            return;
        }
        if (this.LLJJIJIL) {
            this.LLJJIJIL = false;
            C586940N0i c586940N0i2 = this.LLJJLIIIJLLLLLLLZ;
            if (c586940N0i2 != null) {
                c586940N0i2.LJFF(this.LLJI);
            }
            LJI();
        } else {
            C586940N0i c586940N0i3 = this.LLJJLIIIJLLLLLLLZ;
            if (c586940N0i3 != null) {
                C586940N0i.LJI(c586940N0i3);
            }
        }
        this.LLJJL = false;
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    public Aweme LJIILIIL(String str) {
        IAwemeParseService iAwemeParseService = (IAwemeParseService) PluggableExtentionKt.pluggableSpi$default(IAwemeParseService.class, false, false, false, 14, null);
        if (iAwemeParseService != null) {
            return iAwemeParseService.parseAwemeJSONStr(str);
        }
        return null;
    }

    public final void LJIILJJIL(Function0<Unit> function0) {
        C0N0Y player;
        C586940N0i c586940N0i = this.LLJJLIIIJLLLLLLLZ;
        if (c586940N0i != null) {
            if (!c586940N0i.LIZIZ(this.LLJI) && !this.LLJJJJJIL) {
                HandlerHook.viewPostDelay(this, new ARunnableS97S0200000_28(this, function0, 15), 100L);
                return;
            }
            this.LLJI = 0;
            LJI();
            if (this.LLILZLL > 0 && (player = getPlayer()) != null) {
                player.LJJIJIIJI(this.LLILZLL);
            }
            this.LLJJL = false;
            if (function0 == null) {
                return;
            }
            function0.invoke();
        }
    }

    public final boolean LJIIZILJ(String str) {
        String aid;
        if (!Intrinsics.LJFF(str, this.LLJJJIL)) {
            Aweme aweme = this.LLILZ;
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
        LJIIL("onBuffering", C2097608Jq.LJI(new Pair("buffer", Integer.valueOf(z ? 1 : 0))));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onHostPause(LifecycleOwner lifecycleOwner) {
        C0N0Y player = getPlayer();
        if (player != null && player.isPlaying() && this.LLJILJILJ && !this.LLIZLLLIL) {
            LJIIJ();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onHostResume(LifecycleOwner lifecycleOwner) {
        C0N0Y player = getPlayer();
        if (player != null && !player.isPlaying() && this.LLJILJILJ && !this.LLJJL && !this.LLIZLLLIL) {
            LJ(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        if (LJIIZILJ(str)) {
            LJIIL("onPause", new HashMap());
        }
    }

    public void onPlayCompleted(String str) {
        if (LJIIZILJ(str)) {
            int i = this.LLJJJJLIIL;
            this.LLJJJJLIIL = i + 1;
            LJIIL("onCompleted", C2097608Jq.LJI(new Pair("times", Integer.valueOf(i))));
            if (!this.LLJIJIL && this.LLJJJ) {
                LJFF(0, false);
                LJIIJ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        if (LJIIZILJ(str)) {
            LJIIL("onFirstCompleted", new HashMap());
        }
    }

    public void onPlayFailed(C1481290oeN c1481290oeN) {
        if (LJIIZILJ(c1481290oeN.LIZ)) {
            LJIIL("onPlayFailed", new HashMap());
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        long currentPosition;
        this.LLJJ = f;
        Pair[] pairArr = new Pair[1];
        C0N0Y player = getPlayer();
        if (player != null) {
            currentPosition = player.getCurrentPosition();
        } else {
            currentPosition = 0;
        }
        pairArr[0] = new Pair("progress", Integer.valueOf((int) currentPosition));
        LJIIL("onProgressChange", C2097608Jq.LJI(pairArr));
    }

    public void onPlaying(String str) {
        if (LJIIZILJ(str)) {
            C1473870oSP c1473870oSP = this.LLJLLIL;
            if (c1473870oSP != null) {
                C786410Ut5.Q5(c1473870oSP, 1.0f);
            }
            C786410Ut5.I5(this.LLJZ, 0.0f);
            C1473870oSP c1473870oSP2 = this.LLJLLL;
            if (c1473870oSP2 != null) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, c1473870oSP2);
                removeView(c1473870oSP2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        if (LJIIZILJ(str)) {
            LJIIL("onPreparePlay", new HashMap());
        }
    }

    public void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        if (LJIIZILJ(c1480420ocy.getSourceId())) {
            C1473870oSP c1473870oSP = this.LLJLLIL;
            if (c1473870oSP != null) {
                C786410Ut5.Q5(c1473870oSP, 1.0f);
            }
            C786410Ut5.I5(this.LLJZ, 0.0f);
            C1473870oSP c1473870oSP2 = this.LLJLLL;
            if (c1473870oSP2 != null) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, c1473870oSP2);
                removeView(c1473870oSP2);
            }
            this.LLJJ = 0.0f;
            LJIIL("onFirstFrame", new HashMap());
            LJIIL("onPlay", new HashMap());
            if (this.LLJJL) {
                pause();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(C1480430ocz c1480430ocz) {
        if (LJIIZILJ(c1480430ocz.LIZ)) {
            LJIIL("onRenderReady", new HashMap());
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        if (LJIIZILJ(str)) {
            LJIIL("onPlay", new HashMap());
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(C1481290oeN c1481290oeN) {
        LJIIL("onError", C2097608Jq.LJI(new Pair("message", c1481290oeN.toString())));
    }

    @Override // X.AbstractC21340218fI
    public void setAutoLifecycle(boolean z) {
        this.LLJILJILJ = z;
    }

    @Override // X.AbstractC21340218fI
    public void setAutoPlay(boolean z) {
        this.LLJ = z;
    }

    public final void setCompleteCount(int i) {
        this.LLJJJJLIIL = i;
    }

    @Override // X.AbstractC21340218fI
    public void setInitTime(int i) {
        if (this.LLJI != i) {
            this.LLJJI = true;
        }
        this.LLJI = i;
    }

    @Override // X.AbstractC21340218fI
    public void setLoop(boolean z) {
        boolean z2;
        if (z != this.LLJIJIL) {
            z2 = true;
            this.LLJJI = true;
        } else {
            z2 = false;
        }
        this.LLILLJJLI = z2;
        this.LLJIJIL = z;
    }

    public final void setMTextureView(C1473870oSP c1473870oSP) {
        this.LLJLLIL = c1473870oSP;
    }

    public final void setMVideoControl(C586940N0i c586940N0i) {
        this.LLJJLIIIJLLLLLLLZ = c586940N0i;
    }

    public final void setManuallyPaused(boolean z) {
        this.LLJJL = z;
    }

    @Override // X.AbstractC21340218fI
    public void setMuted(boolean z) {
        if (this.LLILZIL != z) {
            this.LLJJI = true;
        }
        this.LLILZIL = z;
    }

    @Override // X.AbstractC21340218fI
    public void setObjectFit(String str) {
        this.LLIZ = str;
    }

    @Override // X.AbstractC21340218fI
    public void setPoster(String str) {
        boolean z = !Intrinsics.LJFF(this.LLJILJIL, str);
        if (z) {
            this.LLJJI = true;
        }
        this.LLILLJJLI = z;
        this.LLJILJIL = str;
    }

    @Override // X.AbstractC21340218fI
    public void setRate(int i) {
        this.LLILZLL = i;
    }

    @Override // X.AbstractC21340218fI
    public void setSinglePlayer(boolean z) {
        this.LLIZLLLIL = z;
    }

    @Override // X.AbstractC21340218fI
    public void setSrc(String str) {
        Object c098200Yq;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        int iIntValue;
        int iIntValue2;
        Integer numLJIIJJI;
        Integer numLJIIJJI2;
        if (!Intrinsics.LJFF(this.LLJJIJIIJIL, str)) {
            this.LLJJIJIIJIL = str;
            this.LLJJIJIL = true;
        }
        String aid = null;
        if (str != null) {
            try {
                if (u.LJJIIJZLJL(str, "video://", false)) {
                    c098200Yq = UriProtector.parse(str);
                } else {
                    c098200Yq = LJIILIIL(str);
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
                if (!Intrinsics.LJFF(this.LLILLL, c098200Yq)) {
                    this.LLJJI = true;
                    this.LLILLJJLI = true;
                }
                Uri uri = (Uri) c098200Yq;
                this.LLILLL = uri;
                if (Intrinsics.LJFF("false", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "play_legacy"))) {
                    this.LLJJJ = false;
                } else {
                    this.LLJJJ = true;
                }
                Uri uri2 = this.LLILLL;
                this.LLJJIII = 0;
                this.LLJJIJI = 0;
                if (uri2 != null && uri2.isHierarchical()) {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "width");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) != null) {
                        iIntValue = numLJIIJJI2.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    this.LLJJIII = iIntValue;
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "height");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3)) != null) {
                        iIntValue2 = numLJIIJJI.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    this.LLJJIJI = iIntValue2;
                }
                Uri uri3 = this.LLILLL;
                if (uri3 == null || !uri3.isHierarchical() || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri3, "play_url")) == null) {
                    return;
                }
                if (this.LLJJJ) {
                    boolean z = !Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, this.LLJJJIL);
                    if (z) {
                        this.LLJJI = true;
                    }
                    this.LLILLJJLI = z;
                    this.LLJJIJIL = z;
                    this.LLJJJIL = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                    LJIILLIIL();
                    return;
                }
                IResourceLoaderService iResourceLoaderService = this.LLJJJJ;
                if (iResourceLoaderService == null) {
                    return;
                }
                C20116013nK c20116013nK = new C20116013nK("");
                C1154750g9h c1154750g9h = new C1154750g9h();
                c1154750g9h.LIZ = C1697810uHb.LJIILJJIL(EnumC1154710g9d.GECKO, EnumC1154710g9d.BUILTIN);
                c20116013nK.LIZIZ = c1154750g9h;
                iResourceLoaderService.loadAsync(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, c20116013nK, new AwS144S1100000_30(this, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, 15), new AwS144S1100000_30(this, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, 16));
                return;
            }
            if (!(c098200Yq instanceof Aweme)) {
                return;
            }
            if (this.LLILLL == null) {
                Aweme aweme = this.LLILZ;
                if (aweme != null) {
                    aid = aweme.getAid();
                }
                if (!Intrinsics.LJFF(aid, ((Aweme) c098200Yq).getAid())) {
                    this.LLJJI = true;
                    this.LLILLJJLI = true;
                }
            }
            this.LLILZ = (Aweme) c098200Yq;
        }
    }

    @Override // X.AbstractC21340218fI
    public void setStateChangeReporter(InterfaceC1631620sYq<? super String, ? super Map<String, ? extends Object>, ? super AbstractC21340218fI, Unit> interfaceC1631620sYq) {
        this.LLJL = interfaceC1631620sYq;
    }

    @Override // X.AbstractC21340218fI
    public void setVolume(float f) {
        if (this.LLJILLL != f) {
            this.LLJJI = true;
        }
        this.LLJILLL = f;
    }

    @Override // X.AbstractC21340218fI
    public final void LJFF(int i, boolean z) {
        this.LLJJIJIL = true;
        this.LLJI = i;
        LJ(new AwS17S0111000_26(this, z, i, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(int r8, int r9) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LLILZ
            if (r0 == 0) goto L67
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            if (r0 == 0) goto L67
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LLILZ
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            int r6 = r0.getWidth()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LLILZ
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            int r3 = r0.getHeight()
        L1e:
            X.0oSP r5 = r7.LLJLLIL
            java.lang.String r2 = r7.LLIZ
            if (r9 <= 0) goto L55
            if (r8 <= 0) goto L55
            if (r6 <= 0) goto L55
            if (r3 <= 0) goto L55
            float r1 = (float) r9
            float r0 = (float) r8
            float r1 = r1 / r0
            float r4 = (float) r3
            float r0 = (float) r6
            float r4 = r4 / r0
            java.lang.String r0 = "cover"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L56
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L62
        L3e:
            float r1 = r1 / r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r3 = r1
        L42:
            if (r5 == 0) goto L55
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            int r0 = r8 >> 1
            float r1 = (float) r0
            int r0 = r9 >> 1
            float r0 = (float) r0
            r2.setScale(r3, r4, r1, r0)
            r5.setTransform(r2)
        L55:
            return
        L56:
            java.lang.String r0 = "contain"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L64
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L3e
        L62:
            float r4 = r4 / r1
            goto L42
        L64:
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L42
        L67:
            android.net.Uri r0 = r7.LLILLL
            if (r0 == 0) goto L70
            int r6 = r7.LLJJIII
            int r3 = r7.LLJJIJI
            goto L1e
        L70:
            r6 = 0
            r3 = 0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14TT.LJII(int, int):void");
    }

    public void LJIIJJI(RemoteImageView remoteImageView, String str) {
        C1324840ka2.LJIIJ(remoteImageView, str, -1, -1);
    }

    public final void LJIIL(String str, Map<String, ? extends Object> map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeclarativeVideoPlayBox- ");
        sbLIZ.append(str);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1631620sYq<? super String, ? super Map<String, ? extends Object>, ? super AbstractC21340218fI, Unit> interfaceC1631620sYq = this.LLJL;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(str, map, this);
        }
    }

    public C14TT(Context context, AttributeSet attributeSet, int i) {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        ContextWrapper contextWrapper;
        super(context, attributeSet, i);
        this.LLILZLL = 166;
        this.LLIZ = "fill";
        this.LLJILJIL = "";
        this.LLJILLL = 1.0f;
        this.LLJJIJIIJIL = "";
        this.LLJJJ = true;
        this.LLJJJIL = "";
        this.LLJJJJ = (IResourceLoaderService) C20113813my.LIZIZ().LIZIZ(IResourceLoaderService.class);
        this.LLJJJJLIIL = 1;
        this.LLJJL = true;
        this.LLJLIL = C452501pT.LIZIZ(new C14TV(this));
        this.LLJLILLLLZIIL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS574S0100000_30(this, 32));
        this.LLJLL = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(63));
        RemoteImageView remoteImageView = new RemoteImageView(context);
        this.LLJZ = remoteImageView;
        addView(remoteImageView, -1, -1);
        Object baseContext = null;
        if ((context instanceof ContextWrapper) && (contextWrapper = (ContextWrapper) context) != null) {
            baseContext = contextWrapper.getBaseContext();
        }
        if ((baseContext instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) baseContext) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
    }
}
