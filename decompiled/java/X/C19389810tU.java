package X;

import X.C036E;
import X.C0H62;
import X.C0O0L;
import X.C2020507vn;
import X.C2213508lp;
import X.C2213608lq;
import X.C786410Ut5;
import X.C804440Vh4;
import X.C844470XAv;
import Y.AObserverS231S0100000_29;
import Y.ARunnableS104S0100000_4;
import Y.ARunnableS14S2100000_29;
import Y.ARunnableS33S1100000_29;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipfeed.PipFeedManager;
import com.ss.android.ugc.aweme.pipfeed.components.single.ControlOverlayViewModel;
import com.ss.android.ugc.aweme.pipfeed.components.single.PipStatusViewViewModel;
import com.ss.android.ugc.aweme.pipfeed.vm.PipFeedWindowVM;
import com.ss.android.ugc.aweme.pipfeed.vm.shared.FeedPipViewModel;
import com.ss.android.ugc.aweme.pipfeed.vm.shared.FeedPipViewModel$currentAweme$1;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.AwS113S1000000_29;
import kotlin.jvm.internal.AwS178S1100000_29;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS94S1000000_9;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.10tU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19389810tU extends AbstractC19390410ta implements InterfaceC19383810sW, OnUIPlayListener, AudioManager.OnAudioFocusChangeListener {
    public C19390010tW LLILZLL;
    public C1482640ogY LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;
    public final C19286610cq LLJI;
    public final C19391010tg LLJIJIL;
    public final C19391010tg LLJILJIL;
    public final C19391010tg LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public boolean LLJJI;
    public SmartImageView LLJJIII;
    public EnumC1002150cBZ LLJJIJI;
    public String LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public ARunnableS14S2100000_29 LLJJJIL;
    public final Keva LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;

    @Override // X.AbstractC19390410ta
    public final void LJIIJ() {
        C19393210u2.LLIZLLLIL = null;
        C1482640ogY c1482640ogY = this.LLIZ;
        if (c1482640ogY != null) {
            c1482640ogY.release();
        }
        C19390010tW c19390010tW = this.LLILZLL;
        if (c19390010tW != null) {
            c19390010tW.LIZJ.LL.remove(this);
        }
    }

    public final Map<String, String> LJIILLIIL() {
        return C2097608Jq.LJIIIIZZ(new Pair("enter_method", this.LLJJIJI.getMob()), new Pair("is_floating_window", "1"));
    }

    public final Map<String, Object> LJIJ() {
        String groupId;
        Integer numValueOf;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("enter_from", LJIJJLI().LIZ);
        Aweme value = LJIL().LL.getValue();
        Long lValueOf = null;
        if (value == null || (groupId = value.getGroupId()) == null) {
            groupId = null;
        }
        pairArr[1] = new Pair("group_id", groupId);
        Aweme value2 = LJIL().LL.getValue();
        pairArr[2] = new Pair("author_id", value2 != null ? AwemeExtKt.getAuthorUid(value2) : null);
        C19390010tW c19390010tW = this.LLILZLL;
        if (c19390010tW != null) {
            C0N3R c0n3r = c19390010tW.LIZLLL;
            numValueOf = Integer.valueOf(c0n3r != null ? c0n3r.LLILLL.size() : c19390010tW.LJFF);
        } else {
            numValueOf = null;
        }
        pairArr[3] = new Pair("video_cnt", numValueOf);
        C19390010tW c19390010tW2 = this.LLILZLL;
        if (c19390010tW2 != null) {
            C0N3R c0n3r2 = c19390010tW2.LIZLLL;
            lValueOf = Long.valueOf(c0n3r2 != null ? c0n3r2.LIZJ() : c19390010tW2.LJI);
        }
        pairArr[4] = new Pair("duration", lValueOf);
        PipFeedManager.Companion.getClass();
        pairArr[5] = new Pair("enter_method", C1620120sGI.LIZ.getExitReason$pipfeed_release());
        return C2097608Jq.LJIIIIZZ(pairArr);
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
    public final /* synthetic */ void onBuffering(boolean z) {
        C583620Mum.LJI(this, z);
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
    public final /* synthetic */ void onDecoderBuffering(boolean z) {
        C583620Mum.LJIIL(this, z);
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

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJIJ(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompleted(String str, int i) {
        C583620Mum.LJIJJ(this, str, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str) {
        C583620Mum.LJIJJLI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJIL(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(C1481290oeN c1481290oeN) {
        C583620Mum.LJJIFFI(this, c1481290oeN);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
        C583620Mum.LJJI(this, str, c1481290oeN, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepare(String str) {
        C583620Mum.LJJIII(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepared(String str) {
        C583620Mum.LJJIIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayProgressChange(float f) {
        C583620Mum.LJJIIJZLJL(this, f);
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
    public final /* synthetic */ void onPreparePlay(String str) {
        C583620Mum.LJJJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJI(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        C583620Mum.LJJJJ(this, c1480420ocy);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
        C583620Mum.LJJJJI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderReady(C1480430ocz c1480430ocz) {
        C583620Mum.LJJJJIZL(this, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJJJL(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(C1481290oeN c1481290oeN) {
        C583620Mum.LJJJJLI(this, c1481290oeN);
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

    @Override // X.InterfaceC19383810sW
    public final void LIZIZ() {
        if (this.LLJJJ) {
            return;
        }
        Aweme value = LJIL().LL.getValue();
        FeedPipViewModel feedPipViewModelLJIL = LJIL();
        LJJI(true, value, (Aweme) C13LP.LJJJLZIJ(feedPipViewModelLJIL.LLJJIJI + 1, feedPipViewModelLJIL.wQ2()));
        LJIILL(EnumC1002150cBZ.CLICK);
        LJIJI().LJIIJJI(AFwS218S0000000_29.get$arr$(343));
    }

    @Override // X.InterfaceC19383810sW
    public final void LIZJ() {
        if (this.LLJJJ) {
            return;
        }
        C19390010tW c19390010tW = this.LLILZLL;
        if ((c19390010tW != null ? c19390010tW.LJ.LL : null) == EnumC585150MxF.PAUSED) {
            LJIIZILJ().LLIZ.setValue(Boolean.FALSE);
            return;
        }
        if (c19390010tW != null) {
            c19390010tW.LIZ();
        }
        C19393210u2 c19393210u2 = C19393210u2.LL;
        C19393210u2.LIZ();
        LJIJI().LJIIJJI(AFwS218S0000000_29.get$arr$(342));
    }

    @Override // X.InterfaceC19383810sW
    public final void LIZLLL() {
        if (this.LLJJJ) {
            return;
        }
        C19390010tW c19390010tW = this.LLILZLL;
        if ((c19390010tW != null ? c19390010tW.LJ.LL : null) == EnumC585150MxF.PLAYING) {
            LJIIZILJ().LLIZ.setValue(Boolean.TRUE);
        } else {
            LJJIII(null);
            LJIJI().LJIIJJI(AFwS218S0000000_29.get$arr$(345));
        }
    }

    @Override // X.InterfaceC19383810sW
    public final void LJFF() {
        if (this.LLJJJ) {
            return;
        }
        LJJI(false, LJIL().LL.getValue(), (Aweme) C13LP.LJJJLZIJ(r0.LLJJIJI - 1, LJIL().wQ2()));
        C19390010tW c19390010tW = this.LLILZLL;
        if (c19390010tW != null) {
            c19390010tW.LIZ();
        }
        LJIIZILJ().LLIZLLLIL.setValue(Float.valueOf(0.0f));
        LJJ().vQ2(EnumC19385810sq.TRANSITION);
        FeedPipViewModel feedPipViewModelLJIL = LJIL();
        feedPipViewModelLJIL.LLJILLL.setValue(Boolean.TRUE);
        feedPipViewModelLJIL.yQ2(feedPipViewModelLJIL.LLJJIJI - 1);
        feedPipViewModelLJIL.LLJJ.setValue(Boolean.valueOf(feedPipViewModelLJIL.LLJJIJI > 0));
        FeedPipViewModel$currentAweme$1 feedPipViewModel$currentAweme$1 = feedPipViewModelLJIL.LL;
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(feedPipViewModelLJIL.LLJJIJI, feedPipViewModelLJIL.wQ2());
        if (objLJJJLZIJ != null) {
            feedPipViewModel$currentAweme$1.setValue(objLJJJLZIJ);
        }
        LJIJI().LJIIJJI(AFwS218S0000000_29.get$arr$(344));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.09jx] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.09jv] */
    @Override // X.AbstractC19390410ta
    public final void LJIIIZ() {
        this.LLILZLL = new C19390010tW(C1483410ohn.LJLJJI());
        Lifecycle lifecycle = ((C194451115t) LJIIIIZZ()).getLifecycle();
        final AwS608S0100000_29 awS608S0100000_29 = new AwS608S0100000_29(this, 632);
        final ?? r0 = new InterfaceC2456609jw() { // from class: X.09jx
            @Override // X.InterfaceC2456609jw
            public final void LIZ(boolean z) {
                awS608S0100000_29.invoke(Boolean.valueOf(z));
            }
        };
        final ?? r2 = new BroadcastReceiver(r0) { // from class: X.09jv
            public final InterfaceC2456609jw LIZ;

            {
                this.LIZ = r0;
            }

            public final void LIZ(Intent intent) {
                String action;
                if (intent != null && (action = intent.getAction()) != null) {
                    int iHashCode = action.hashCode();
                    if (iHashCode != -2128145023) {
                        if (iHashCode == -1454123155 && action.equals("android.intent.action.SCREEN_ON")) {
                            this.LIZ.LIZ(true);
                            return;
                        }
                        return;
                    }
                    if (!action.equals("android.intent.action.SCREEN_OFF")) {
                        return;
                    }
                    this.LIZ.LIZ(false);
                }
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                if (!C2214201BlK.LJIIJJI && intent != null) {
                    if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                        C2188191AkT.LIZIZ();
                    }
                }
                if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    LIZ(intent);
                } else {
                    C2408409cA.LIZ();
                    LIZ(intent);
                }
            }
        };
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.pipfeed.components.util.ExtensionsKt$registerScreenInteractiveStateListener$1
            public final Context LL;

            {
                C844470XAv.LIZ.getClass();
                this.LL = C844470XAv.LIZ();
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) throws Exception {
                int i = C2020507vn.LIZ[event.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        C786410Ut5.LJJIFFI(this.LL, r2);
                        return;
                    }
                    return;
                }
                C786410Ut5.LJIJJ(this.LL, r2, intentFilter);
            }
        });
        Lifecycle lifecycle2 = ((C194451115t) LJIIIIZZ()).getLifecycle();
        AwS573S0100000_29 awS573S0100000_29 = new AwS573S0100000_29(this, 885);
        C844470XAv.LIZ.getClass();
        final Context contextLIZ = C844470XAv.LIZ();
        final IntentFilter intentFilter2 = new IntentFilter("android.media.AUDIO_BECOMING_NOISY");
        final C2499609qs c2499609qs = new C2499609qs(awS573S0100000_29, 3);
        lifecycle2.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.pipfeed.components.util.ExtensionsKt$registerEarphoneUnplugListener$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) throws Exception {
                int i = C2213508lp.LIZ[event.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        C786410Ut5.LJJIFFI(contextLIZ, c2499609qs);
                        return;
                    }
                    return;
                }
                C786410Ut5.LJIJJ(contextLIZ, c2499609qs, intentFilter2);
            }
        });
        Lifecycle lifecycle3 = ((C194451115t) LJIIIIZZ()).getLifecycle();
        final AFwS292S0000000_9 aFwS292S0000000_9 = AFwS292S0000000_9.get$arr$(47);
        lifecycle3.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.pipfeed.components.util.NetworkUtilsKt$whenNetworkTypeChange$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                int i = C2213608lq.LIZ[event.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        C804440Vh4 c804440Vh4 = C036E.LIZ;
                        final Function2<C0O0L, C0O0L, Unit> function2 = aFwS292S0000000_9;
                        c804440Vh4.LIZLLL(new C0H62() { // from class: X.0O0K
                            @Override // X.C0H62
                            public final /* synthetic */ void onChange(C0O0L c0o0l, C0O0L c0o0l2) {
                                function2.invoke(c0o0l, c0o0l2);
                            }
                        });
                        return;
                    }
                    return;
                }
                C804440Vh4 c804440Vh42 = C036E.LIZ;
                final Function2<C0O0L, C0O0L, Unit> function22 = aFwS292S0000000_9;
                c804440Vh42.LIZ(new C0H62() { // from class: X.0O0K
                    @Override // X.C0H62
                    public final /* synthetic */ void onChange(C0O0L c0o0l, C0O0L c0o0l2) {
                        function22.invoke(c0o0l, c0o0l2);
                    }
                });
            }
        });
        LJIL().LLJJJ = true;
    }

    @Override // X.AbstractC19390410ta
    public final void LJIILIIL() {
        C19393210u2 c19393210u2 = C19393210u2.LL;
        C19393210u2.LIZ();
        FeedPipViewModel feedPipViewModelLJIL = LJIL();
        Boolean value = LJIIZILJ().LLIZ.getValue();
        feedPipViewModelLJIL.LLJJIJIL.LIZIZ = (value == null || value.booleanValue()) ? false : true;
        C19390010tW c19390010tW = this.LLILZLL;
        if (c19390010tW != null) {
            c19390010tW.LJ.LL = EnumC585150MxF.IDLE;
            C0N3R c0n3r = c19390010tW.LIZLLL;
            if (c0n3r != null) {
                c19390010tW.LIZJ.LL.remove(c0n3r);
            }
            C0N3R c0n3r2 = c19390010tW.LIZLLL;
            if (c0n3r2 != null) {
                c0n3r2.LJ(c0n3r2.LLILZIL, null);
                c0n3r2.LLILZ.clear();
            }
            C0N3R c0n3r3 = c19390010tW.LIZLLL;
            c19390010tW.LJFF = c0n3r3 != null ? c0n3r3.LLILLL.size() : 0;
            C0N3R c0n3r4 = c19390010tW.LIZLLL;
            c19390010tW.LJI = c0n3r4 != null ? c0n3r4.LIZJ() : 0L;
            c19390010tW.LIZLLL = null;
            c19390010tW.LIZJ.LL.clear();
            c19390010tW.LIZIZ.pause();
            c19390010tW.LIZIZ.setLoop(true);
        }
        PipFeedManager.Companion.getClass();
        C1620120sGI.LIZ.reportExitFloatingWindow$pipfeed_release(LJIJ());
        FeedPipViewModel feedPipViewModelLJIL2 = LJIL();
        feedPipViewModelLJIL2.LL.removeObserver(feedPipViewModelLJIL2.LLILZ);
        feedPipViewModelLJIL2.xQ2(feedPipViewModelLJIL2.LL.getValue());
    }

    public final ControlOverlayViewModel LJIIZILJ() {
        return (ControlOverlayViewModel) this.LLJILJIL.getValue();
    }

    public final AbstractC1604130rqV LJIJI() {
        return (AbstractC1604130rqV) this.LLJJJJJIL.getValue();
    }

    public final C0N3W LJIJJLI() {
        return (C0N3W) this.LLJJJJLIIL.getValue();
    }

    public final FeedPipViewModel LJIL() {
        return (FeedPipViewModel) this.LLJI.getValue();
    }

    public final PipStatusViewViewModel LJJ() {
        return (PipStatusViewViewModel) this.LLJILJILJ.getValue();
    }

    public final void LJJII() {
        C19390010tW c19390010tW;
        C19390010tW c19390010tW2 = this.LLILZLL;
        if (c19390010tW2 != null) {
            int i = C585140MxE.LIZ[c19390010tW2.LJ.LL.ordinal()];
            if ((i == 6 || i == 7) && (c19390010tW = this.LLILZLL) != null) {
                c19390010tW.LIZ();
            }
        }
    }

    public C19389810tU() {
        super(R.id.wq2);
        this.LLJI = new C19286610cq(C452501pT.LIZIZ(new AwS573S0100000_29((AbstractC19390410ta) this, 1082)), C13LE.LIZ(FeedPipViewModel.class));
        this.LLJIJIL = new C19391010tg(C452501pT.LIZIZ(new AwS573S0100000_29((AbstractC19390410ta) this, 1083)), C13LE.LIZ(PipFeedWindowVM.class));
        this.LLJILJIL = new C19391010tg(C452501pT.LIZIZ(new AwS573S0100000_29((AbstractC19390410ta) this, 1083)), C13LE.LIZ(ControlOverlayViewModel.class));
        this.LLJILJILJ = new C19391010tg(C452501pT.LIZIZ(new AwS573S0100000_29((AbstractC19390410ta) this, 1083)), C13LE.LIZ(PipStatusViewViewModel.class));
        this.LLJILLL = "";
        this.LLJJ = "";
        this.LLJJIJI = EnumC1002150cBZ.CLICK;
        this.LLJJIJIIJIL = "";
        this.LLJJIJIL = true;
        PipFeedManager.Companion.getClass();
        this.LLJJJJ = C1620120sGI.LIZ.getKeva();
        this.LLJJJJJIL = C587650N3b.LIZ("PipPlayerVC");
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1724));
    }

    @Override // X.AbstractC19390410ta
    public final void LJIIJJI() {
        LJIJI().LJIIIZ("onScreenOff");
        C19390010tW c19390010tW = this.LLILZLL;
        if ((c19390010tW != null ? c19390010tW.LJ.LL : null) != EnumC585150MxF.PLAYING || c19390010tW == null) {
            return;
        }
        c19390010tW.LIZ();
    }

    @Override // X.AbstractC19390410ta
    public final void LJIIL() {
        C582130MsN.LIZ().LJ();
        C1476910oXJ.LJFF(false);
    }

    @Override // X.AbstractC19390410ta
    public final View LJI(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        SmartImageView smartImageView = new SmartImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 48;
        C786410Ut5.G6(smartImageView, layoutParams);
        smartImageView.setClickable(false);
        C786410Ut5.LLFF(4, smartImageView);
        smartImageView.setPlaceholderImage(new ColorDrawable(LJII(R.attr.e1)));
        this.LLJJIII = smartImageView;
        frameLayout.addView(smartImageView);
        return frameLayout;
    }

    @Override // X.AbstractC19390410ta
    public final void LJIILJJIL(View view) {
        int duration;
        Video video;
        AFwS218S0000000_29 aFwS218S0000000_29 = AFwS218S0000000_29.get$arr$(346);
        if (view.getViewTreeObserver().isAlive() && view.isAttachedToWindow()) {
            C786410Ut5.w3(view.getViewTreeObserver(), new C0T6E(view, aFwS218S0000000_29));
        } else {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC786060UsW(view, aFwS218S0000000_29, 2));
        }
        C19390010tW c19390010tW = this.LLILZLL;
        if (c19390010tW != null) {
            C0N3R c0n3r = new C0N3R(LJIJJLI());
            c19390010tW.LIZJ.LL.add(c0n3r);
            c19390010tW.LIZLLL = c0n3r;
            c19390010tW.LJI = 0L;
            c19390010tW.LJFF = 0;
        }
        C19390010tW c19390010tW2 = this.LLILZLL;
        if (c19390010tW2 != null) {
            c19390010tW2.LIZJ.LL.add(this);
        }
        C19390010tW c19390010tW3 = this.LLILZLL;
        if (c19390010tW3 != null) {
            C0N3S c0n3s = new C0N3S() { // from class: X.10t1
                @Override // X.C0N3S
                public final Map LIZ() {
                    return this.LIZ.LJIILLIIL();
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
                @Override // X.C0N3S
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final kotlin.Pair LIZIZ() {
                    /*
                        r3 = this;
                        X.10tU r1 = r3.LIZ
                        boolean r0 = r1.LLJJIJIL
                        if (r0 == 0) goto L31
                        com.ss.android.ugc.aweme.pipfeed.vm.shared.FeedPipViewModel r0 = r1.LJIL()
                        com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LLILLL
                        if (r0 == 0) goto L2f
                        java.lang.String r1 = X.C19386310sv.LIZIZ(r0)
                    L12:
                        X.10tU r0 = r3.LIZ
                        java.lang.String r0 = r0.LLJILLL
                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                        if (r0 == 0) goto L31
                        r0 = 1
                    L1d:
                        r0 = r0 ^ 1
                        java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
                        X.10tU r0 = r3.LIZ
                        java.util.Map r1 = r0.LJIILLIIL()
                        kotlin.Pair r0 = new kotlin.Pair
                        r0.<init>(r2, r1)
                        return r0
                    L2f:
                        r1 = 0
                        goto L12
                    L31:
                        r0 = 0
                        goto L1d
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C19386910t1.LIZIZ():kotlin.Pair");
                }

                @Override // X.C0N3S
                public final Map LIZJ() {
                    return this.LIZ.LJIILLIIL();
                }

                @Override // X.C0N3S
                public final Map LIZLLL() {
                    return this.LIZ.LJIILLIIL();
                }

                @Override // X.C0N3S
                public final Aweme LJ() {
                    return this.LIZ.LJIL().LL.getValue();
                }

                @Override // X.C0N3S
                public final Map LJFF() {
                    return this.LIZ.LJIILLIIL();
                }

                @Override // X.C0N3S
                public final Map LJI() {
                    return this.LIZ.LJIILLIIL();
                }
            };
            C0N3R c0n3r2 = c19390010tW3.LIZLLL;
            if (c0n3r2 != null) {
                c0n3r2.LLILZ.add(c0n3s);
            }
        }
        if (C19393210u2.LLIZLLLIL == null) {
            C19393210u2.LLIZLLLIL = this;
            FeedPipViewModel feedPipViewModelLJIL = LJIL();
            feedPipViewModelLJIL.LL.observeForever(feedPipViewModelLJIL.LLILZ);
            LJIIZILJ().LL = this;
            LJJ().vQ2(EnumC19385810sq.LOADING_BLACKOUT);
            final C1482640ogY c1482640ogYLIZIZ = C1482640ogY.LIZIZ((ViewGroup) view, false);
            c1482640ogYLIZIZ.Dn(new InterfaceC1473950oSX() { // from class: X.10tV
                @Override // X.InterfaceC1473950oSX
                public final /* synthetic */ void LLF(int i, int i2) {
                }

                @Override // X.InterfaceC1473950oSX
                public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                }

                @Override // X.InterfaceC1473950oSX
                public final void LIZ() {
                    this.LL.LJIJI().LJIIJJI(new AwS567S0100000_23(c1482640ogYLIZIZ, 159));
                }

                @Override // X.InterfaceC1473950oSX
                public final void LLILLIZIL(int i, int i2) {
                    Surface surface;
                    C19390010tW c19390010tW4 = this.LL.LLILZLL;
                    if (c19390010tW4 != null && (surface = c1482640ogYLIZIZ.getSurface()) != null) {
                        c19390010tW4.LIZIZ.setSurface(surface);
                    }
                    C19389810tU c19389810tU = this.LL;
                    if (c19389810tU.LLIZLLLIL) {
                        c19389810tU.LLIZLLLIL = false;
                        c19389810tU.LJIJI().LJIIJJI(new AwS567S0100000_23(c1482640ogYLIZIZ, 158));
                        Aweme value = this.LL.LJIL().LL.getValue();
                        if (value != null) {
                            this.LL.LJJIFFI(value);
                        }
                    }
                    c1482640ogYLIZIZ.u(true, false);
                }
            });
            this.LLIZ = c1482640ogYLIZIZ;
            C19393210u2.LIZIZ();
            LJIL().LLJJ.observe(LJIIIIZZ(), new AObserverS231S0100000_29(this, 148));
            LJIL().LLJILLL.observe(LJIIIIZZ(), new AObserverS231S0100000_29(this, 149));
            LJIL().LL.observe(LJIIIIZZ(), new AObserverS231S0100000_29(this, 150));
            LJIL().LLJJI.observe(LJIIIIZZ(), new AObserverS231S0100000_29(this, 151));
            float f = LJIL().LLJJIJIL.LIZ;
            Aweme value = LJIL().LL.getValue();
            if (value != null && (video = value.getVideo()) != null) {
                duration = video.getDuration();
            } else {
                duration = 0;
            }
            this.LLJ = C814420VxA.LIZIZ(f * duration);
            Aweme value2 = LJIL().LL.getValue();
            if (value2 != null) {
                C20684815ws.LJIJI("enter_floating_window_mode", new Pair(LJIJJLI().LIZ, "enter_from"), new Pair(value2.getGroupId(), "group_id"), new Pair(AwemeExtKt.getAuthorUid(value2), "author_id"));
            }
            ((PipFeedWindowVM) this.LLJIJIL.getValue()).LLILLL.observe(LJIIIIZZ(), new AObserverS231S0100000_29(this, 152));
            LJJ().LLILLJJLI.observe(LJIIIIZZ(), new AObserverS231S0100000_29(this, 147));
            IEarphonePlayerControlService iEarphonePlayerControlService = (IEarphonePlayerControlService) ServiceManager.get().getService(IEarphonePlayerControlService.class);
            if (iEarphonePlayerControlService.LJ()) {
                iEarphonePlayerControlService.LJI(LJIIIIZZ(), new InterfaceC2217831BrB() { // from class: X.10t2
                    @Override // X.InterfaceC2217831BrB
                    public final String getScenario() {
                        return "pip";
                    }

                    @Override // X.InterfaceC2217831BrB
                    public final void LIZ() {
                        C19390010tW c19390010tW4 = this.LIZ.LLILZLL;
                        EnumC585150MxF enumC585150MxF = c19390010tW4 != null ? c19390010tW4.LJ.LL : null;
                        EnumC585150MxF enumC585150MxF2 = EnumC585150MxF.PLAYING;
                        if (enumC585150MxF != enumC585150MxF2) {
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJIIIIZZ("enter_from", this.LIZ.LJIJJLI().LIZJ);
                            Aweme value3 = this.LIZ.LJIL().LL.getValue();
                            c2344009Gk.LJIIIIZZ("group_id", value3 != null ? value3.getAid() : null);
                            Aweme value4 = this.LIZ.LJIL().LL.getValue();
                            c2344009Gk.LJIIIIZZ("author_id", value4 != null ? AwemeExtKt.getAuthorUid(value4) : null);
                            C20684815ws.LJIILLIIL("earphone_play_continue", c2344009Gk.LIZ);
                            C722880SXe.LIZLLL("pip");
                            this.LIZ.LJJIII(null);
                            C19390010tW c19390010tW5 = this.LIZ.LLILZLL;
                            C722880SXe.LIZJ(Boolean.valueOf((c19390010tW5 != null ? c19390010tW5.LJ.LL : null) == enumC585150MxF2), "pip");
                        }
                    }
                });
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Last consumer ");
        sbLIZ.append(C19393210u2.LLIZLLLIL);
        sbLIZ.append(" has not been unbound");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.0sGA] */
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
    public final void LJIILL(EnumC1002150cBZ enumC1002150cBZ) {
        boolean z;
        LJJII();
        LJIIZILJ().LLIZLLLIL.setValue(Float.valueOf(0.0f));
        LJJ().vQ2(EnumC19385810sq.TRANSITION);
        final FeedPipViewModel feedPipViewModelLJIL = LJIL();
        feedPipViewModelLJIL.LLJJ.setValue(Boolean.TRUE);
        MutableLiveData<Boolean> mutableLiveData = feedPipViewModelLJIL.LLJILLL;
        if (feedPipViewModelLJIL.LLJJIJI + 2 >= ((ArrayList) feedPipViewModelLJIL.wQ2()).size() && !feedPipViewModelLJIL.LLJILJILJ) {
            z = false;
        } else {
            z = true;
        }
        mutableLiveData.setValue(Boolean.valueOf(z));
        if (feedPipViewModelLJIL.LLJJIJI + 1 == ((ArrayList) feedPipViewModelLJIL.wQ2()).size()) {
            EnumC1620090sGF value = feedPipViewModelLJIL.LLJJI.getValue();
            EnumC1620090sGF enumC1620090sGF = EnumC1620090sGF.LOADING;
            if (value != enumC1620090sGF) {
                feedPipViewModelLJIL.LLJJI.setValue(enumC1620090sGF);
                InterfaceC1620010sG7 interfaceC1620010sG7 = feedPipViewModelLJIL.LLJ;
                if (interfaceC1620010sG7 != 0) {
                    interfaceC1620010sG7.Fa(new C0O0H() { // from class: X.0sGA
                        @Override // X.C0O0H
                        public final void onEmpty() {
                            feedPipViewModelLJIL.LLJJI.setValue(EnumC1620090sGF.SUCCEED);
                            FeedPipViewModel feedPipViewModel = feedPipViewModelLJIL;
                            feedPipViewModel.LLJILJILJ = false;
                            feedPipViewModel.LLJILLL.setValue(Boolean.FALSE);
                            feedPipViewModelLJIL.LLILLJJLI.LJ("[onEmpty]");
                        }

                        @Override // X.C0O0H
                        public final void LIZ(Exception exc) {
                            feedPipViewModelLJIL.LLJJI.setValue(EnumC1620090sGF.LOAD_ERROR);
                            feedPipViewModelLJIL.LLILLJJLI.LJI("onError", exc);
                        }

                        @Override // X.C0O0H
                        public final void LIZIZ(List<? extends Aweme> list, boolean z2) {
                            feedPipViewModelLJIL.LLJJI.setValue(EnumC1620090sGF.SUCCEED);
                            if (list.isEmpty()) {
                                FeedPipViewModel feedPipViewModel = feedPipViewModelLJIL;
                                feedPipViewModel.LLJILJILJ = false;
                                feedPipViewModel.LLJILLL.setValue(Boolean.FALSE);
                            } else {
                                ((ArrayList) feedPipViewModelLJIL.LLJI).clear();
                                ((ArrayList) feedPipViewModelLJIL.LLJI).addAll(list);
                                feedPipViewModelLJIL.zQ2(list);
                                int size = ((ArrayList) feedPipViewModelLJIL.wQ2()).size();
                                FeedPipViewModel feedPipViewModel2 = feedPipViewModelLJIL;
                                if (size <= feedPipViewModel2.LLJJIJI + 1) {
                                    return;
                                }
                                feedPipViewModel2.LLJILJIL.setValue(feedPipViewModel2.wQ2());
                                FeedPipViewModel feedPipViewModel3 = feedPipViewModelLJIL;
                                feedPipViewModel3.yQ2(feedPipViewModel3.LLJJIJI + 1);
                                FeedPipViewModel feedPipViewModel4 = feedPipViewModelLJIL;
                                feedPipViewModel4.LL.setValue(ListProtector.get(feedPipViewModel4.wQ2(), feedPipViewModelLJIL.LLJJIJI));
                                feedPipViewModelLJIL.LLJILJILJ = z2;
                            }
                            FeedPipViewModel feedPipViewModel5 = feedPipViewModelLJIL;
                            feedPipViewModel5.LLILLJJLI.LJIIJJI(new AwS420S0200000_19(feedPipViewModel5, (FeedPipViewModel) list, (List<? extends Aweme>) 94));
                        }
                    });
                }
            }
        } else {
            feedPipViewModelLJIL.yQ2(feedPipViewModelLJIL.LLJJIJI + 1);
            FeedPipViewModel$currentAweme$1 feedPipViewModel$currentAweme$1 = feedPipViewModelLJIL.LL;
            Object objLJJJLZIJ = C13LP.LJJJLZIJ(feedPipViewModelLJIL.LLJJIJI, feedPipViewModelLJIL.wQ2());
            if (objLJJJLZIJ != null) {
                feedPipViewModel$currentAweme$1.setValue(objLJJJLZIJ);
            }
        }
        this.LLJJIJI = enumC1002150cBZ;
    }

    public final void LJJIFFI(final Aweme aweme) {
        float fLIZ;
        EnumC19384110sZ enumC19384110sZ;
        C1482640ogY c1482640ogY;
        Surface surface;
        if (aweme.getVideo() != null && !TextUtils.isEmpty(aweme.getAid())) {
            C1482640ogY c1482640ogY2 = this.LLIZ;
            if (c1482640ogY2 != null && !c1482640ogY2.Da()) {
                this.LLIZLLLIL = true;
                LJIJI().LJII(new AwS410S0200000_9(aweme, this, 80));
                return;
            }
            if (C19386310sv.LIZ(this.LLILLJJLI)) {
                return;
            }
            if (!C19393210u2.LLILZ) {
                C19393210u2.LIZIZ();
            }
            if (this.LLJJIJIL) {
                fLIZ = LJIL().LLJJIJIL.LIZJ;
            } else {
                LJIL().LLJJIJIL.LIZJ = C585860MyO.LIZ(aweme);
                LJIL().LLJJIJIL.LIZLLL = 1.0f;
                fLIZ = C585860MyO.LIZ(aweme);
            }
            aweme.getVideo().setSourceId(C19386310sv.LIZIZ(aweme));
            if (!Intrinsics.LJFF(this.LLJJIJIIJIL, aweme.getAid())) {
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(aweme.getVideo().getCover()));
                Context context = this.LLILZIL;
                if (context == null) {
                    context = null;
                }
                c1331670kl3LJIIIIZZ.LJJIJL(context);
                c1331670kl3LJIIIIZZ.LIZLLL("PipPlayerVC");
                SmartImageView smartImageView = this.LLJJIII;
                if (smartImageView == null) {
                    smartImageView = null;
                }
                c1331670kl3LJIIIIZZ.LJJ(smartImageView);
                c1331670kl3LJIIIIZZ.LJIIJ(new C19390310tZ() { // from class: X.10tX
                    @Override // X.InterfaceC427850Gq7
                    public final void cm(Uri uri, View view, Throwable th) {
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                        C19389810tU c19389810tU = this;
                        String aid = aweme.getAid();
                        if (aid == null) {
                            aid = this.LLJJIJIIJIL;
                        }
                        c19389810tU.LLJJIJIIJIL = aid;
                    }
                });
            }
            if (aweme.getVideo().getDuration() - this.LLJ < 1) {
                this.LLJ = 0;
                LJIILL(EnumC1002150cBZ.AUTO);
                return;
            }
            MutableLiveData<EnumC19384110sZ> mutableLiveData = LJIIZILJ().LLILZLL;
            if (((FeedCommonService) ServiceManager.get().getService(FeedCommonService.class)).LJIIJJI(aweme)) {
                enumC19384110sZ = EnumC19384110sZ.VISIBLE;
            } else {
                enumC19384110sZ = EnumC19384110sZ.GONE;
            }
            mutableLiveData.setValue(enumC19384110sZ);
            C1479720obq c1479720obq = new C1479720obq();
            SimVideo simVideoLJI = C1481230oeH.LJI(aweme.getVideo());
            C1479530obX c1479530obX = c1479720obq.LIZ;
            c1479530obX.LIZLLL = simVideoLJI;
            c1479530obX.LJIILLIIL = true;
            c1479530obX.LJJII = fLIZ;
            c1479530obX.LJJIII = true;
            c1479530obX.LJJJLL = true;
            c1479530obX.LJZI = true;
            EnumC2281141EQm resolution = EnumC2281131EQl.SuperHigh.getResolution();
            C1479530obX c1479530obX2 = c1479720obq.LIZ;
            c1479530obX2.LJI = resolution;
            c1479530obX2.LJIIJJI = this.LLJ;
            c1479720obq.LIZ.LJ = Audio.Companion.convertToSimAudio(aweme.getVideo(), aweme.getAudio(), "startPlay", aweme.getAid());
            c1479720obq.LIZ.LJFF = C20702715zl.LJ(aweme);
            C581750Mrl c581750MrlLJFF = C20702715zl.LJFF(aweme, null);
            if (c581750MrlLJFF != null) {
                boolean z = c581750MrlLJFF.LIZ;
                C1479530obX c1479530obX3 = c1479720obq.LIZ;
                c1479530obX3.LJJJIL = z;
                c1479530obX3.LJJJJ = c581750MrlLJFF.LIZIZ;
                c1479530obX3.LJJJJI = c581750MrlLJFF.LIZJ;
                c1479530obX3.LJJJJIZL = c581750MrlLJFF.LJ;
                c1479530obX3.LJJJI = c581750MrlLJFF.LIZLLL;
            }
            AbstractC1604130rqV abstractC1604130rqVLJIJI = LJIJI();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[VideoPlay]: request, aid ");
            sbLIZ.append(aweme.getAid());
            sbLIZ.append(" progress ");
            sbLIZ.append(this.LLJ);
            sbLIZ.append('/');
            sbLIZ.append(aweme.getVideo().getDuration());
            sbLIZ.append(" playSpeed ");
            sbLIZ.append(fLIZ);
            abstractC1604130rqVLJIJI.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
            C19390010tW c19390010tW = this.LLILZLL;
            if (c19390010tW != null && (c1482640ogY = this.LLIZ) != null && (surface = c1482640ogY.getSurface()) != null) {
                c19390010tW.LIZIZ.setSurface(surface);
            }
            C19390010tW c19390010tW2 = this.LLILZLL;
            if (c19390010tW2 != null) {
                C1479530obX c1479530obXLIZ = c1479720obq.LIZ();
                if (c19390010tW2.LJ.LL != EnumC585150MxF.FINISHED) {
                    c19390010tW2.LIZIZ.stop();
                }
                c19390010tW2.LIZIZ.LJJJJJL(c1479530obXLIZ);
                InterfaceC1481730of5 interfaceC1481730of5LJIIIZ = c19390010tW2.LIZIZ.LJIIIZ();
                if (interfaceC1481730of5LJIIIZ != null) {
                    interfaceC1481730of5LJIIIZ.LJJIJIIJI(100);
                }
                c19390010tW2.LJ.LL = EnumC585150MxF.PREPARED;
            }
            this.LLJ = 0;
            String strLIZIZ = C19386310sv.LIZIZ(aweme);
            this.LLJILLL = strLIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append('_');
            sbLIZ2.append(System.currentTimeMillis());
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            this.LLJJ = strLIZIZ2;
            this.LLJJI = false;
            String str = new String(strLIZIZ2);
            this.LLJJJ = true;
            View view = this.LLILLJJLI;
            if (view != null) {
                HandlerHook.viewPostDelay(view, new ARunnableS33S1100000_29(this, str, 8), 2000L);
            }
            this.LLJJJIL = new ARunnableS14S2100000_29(this, new String(this.LLJJ), "Reaching start play network check", 1);
            View view2 = this.LLILLJJLI;
            if (view2 != null) {
                HandlerHook.viewPostDelay(view2, this.LLJJJIL, Mp4ScreenVideoLoadTimeout.CONTROL);
            }
        }
    }

    public final void LJJIII(Aweme aweme) {
        C19390010tW c19390010tW;
        SimVideoUrlModel simVideoUrlModelLJJIII;
        String sourceId;
        SimVideoUrlModel simVideoUrlModelLJJIII2;
        String sourceId2;
        if (aweme == null && (aweme = LJIL().LL.getValue()) == null) {
            return;
        }
        if (!C19393210u2.LLILZ) {
            C19393210u2.LIZIZ();
        }
        if (!C19386310sv.LIZ(this.LLILLJJLI) && (c19390010tW = this.LLILZLL) != null) {
            IEarphonePlayerControlService iEarphonePlayerControlService = (IEarphonePlayerControlService) ServiceManager.get().getService(IEarphonePlayerControlService.class);
            if (iEarphonePlayerControlService.LJ()) {
                iEarphonePlayerControlService.LIZJ("pip", false);
            }
            String str = "";
            switch (C585140MxE.LIZ[c19390010tW.LJ.LL.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    LJJIFFI(aweme);
                    return;
                case 4:
                    String strLIZIZ = C19386310sv.LIZIZ(aweme);
                    InterfaceC1481730of5 interfaceC1481730of5LJIIIZ = c19390010tW.LIZIZ.LJIIIZ();
                    if (interfaceC1481730of5LJIIIZ != null && (simVideoUrlModelLJJIII2 = interfaceC1481730of5LJIIIZ.LJJIII()) != null && (sourceId2 = simVideoUrlModelLJJIII2.getSourceId()) != null) {
                        str = sourceId2;
                    }
                    if (Intrinsics.LJFF(strLIZIZ, str)) {
                        c19390010tW.LIZIZ.resume();
                        InterfaceC1481730of5 interfaceC1481730of5LJIIIZ2 = c19390010tW.LIZIZ.LJIIIZ();
                        if (interfaceC1481730of5LJIIIZ2 != null) {
                            interfaceC1481730of5LJIIIZ2.LJJIJIIJI(100);
                            return;
                        }
                        return;
                    }
                    LJJIFFI(aweme);
                    return;
                case 5:
                case 6:
                case 7:
                    String strLIZIZ2 = C19386310sv.LIZIZ(aweme);
                    InterfaceC1481730of5 interfaceC1481730of5LJIIIZ3 = c19390010tW.LIZIZ.LJIIIZ();
                    if (interfaceC1481730of5LJIIIZ3 != null && (simVideoUrlModelLJJIII = interfaceC1481730of5LJIIIZ3.LJJIII()) != null && (sourceId = simVideoUrlModelLJJIII.getSourceId()) != null) {
                        str = sourceId;
                    }
                    if (!Intrinsics.LJFF(strLIZIZ2, str)) {
                        C19390010tW c19390010tW2 = this.LLILZLL;
                        if (c19390010tW2 != null) {
                            c19390010tW2.LIZ();
                        }
                        LJJIFFI(aweme);
                        return;
                    }
                    return;
                default:
                    throw new C1954807lC();
            }
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        C19393210u2 c19393210u2 = C19393210u2.LL;
        if (i != -2) {
            if (i != -1) {
                if (i == 1) {
                    if (C19393210u2.LLILZIL || C19393210u2.LLILZLL) {
                        LJJIII(null);
                        return;
                    }
                    return;
                }
                return;
            }
            LJJII();
            return;
        }
        LJJII();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        LJIJI().LIZIZ(new AwS178S1100000_29(this, str, 6));
        if (C279750Axp.LIZ()) {
            if (Intrinsics.LJFF(str, this.LLJILLL) || this.LLJILLL.length() == 0) {
                LJIIZILJ().LLIZ.setValue(Boolean.FALSE);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        if (Intrinsics.LJFF(str, this.LLJILLL)) {
            LJIIZILJ().LLIZ.setValue(Boolean.FALSE);
            C19390010tW c19390010tW = this.LLILZLL;
            if (c19390010tW != null) {
                c19390010tW.LIZ();
            }
            LJIILL(EnumC1002150cBZ.AUTO);
        }
        LJIJI().LJIIJJI(new AwS113S1000000_29(str, 5));
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPause(String str) {
        LJIJI().LIZIZ(new AwS113S1000000_29(str, 6));
        if (Intrinsics.LJFF(str, this.LLJILLL)) {
            LJIIZILJ().LLIZ.setValue(Boolean.FALSE);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
        if (C279750Axp.LIZ()) {
            if (str != null) {
                if (this.LLJILLL.length() == 0) {
                    this.LLJILLL = str;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append('_');
                    sbLIZ.append(System.currentTimeMillis());
                    this.LLJJ = C2188811AlT.LIZIZ(sbLIZ);
                }
                if (Intrinsics.LJFF(str, this.LLJILLL)) {
                    if (!this.LLJJI) {
                        onRenderFirstFrame(str, null);
                    } else {
                        LJIIZILJ().LLIZ.setValue(Boolean.TRUE);
                    }
                }
                LJJ().vQ2(EnumC19385810sq.NO_STATUS);
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(str, this.LLJILLL)) {
            if (!this.LLJJI) {
                onRenderFirstFrame(str, null);
            }
            LJIIZILJ().LLIZ.setValue(Boolean.TRUE);
        }
        LJJ().vQ2(EnumC19385810sq.NO_STATUS);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, C1481290oeN c1481290oeN) {
        AbstractC1604130rqV abstractC1604130rqVLJIJI = LJIJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlayFailed. sourceId:");
        sbLIZ.append(str);
        sbLIZ.append(", error:");
        sbLIZ.append(c1481290oeN);
        abstractC1604130rqVLJIJI.LJ(C2188811AlT.LIZIZ(sbLIZ));
        C583620Mum.LJJ(this, str, c1481290oeN);
        LJJ().vQ2(EnumC19385810sq.NET_ERROR);
        LJIIZILJ().LLIZ.setValue(Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        Handler handler;
        String aid;
        AbstractC1604130rqV abstractC1604130rqVLJIJI = LJIJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRenderFF: sourceId: ");
        sbLIZ.append(str);
        sbLIZ.append(" willPause: ");
        sbLIZ.append(LJIL().LLJJIJIL.LIZIZ);
        sbLIZ.append(", hasCalled: ");
        sbLIZ.append(this.LLJJI);
        abstractC1604130rqVLJIJI.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLJJI && Intrinsics.LJFF(str, this.LLJILLL)) {
            this.LLJJI = true;
            if (this.LLJJIJIL) {
                this.LLJJIJIL = false;
                PipFeedManager.Companion.getClass();
                C1620120sGI.LIZ.reportFirstVideoReady$pipfeed_release();
            }
            this.LLJJJ = false;
            LJJ().vQ2(EnumC19385810sq.NO_STATUS);
            SmartImageView smartImageView = this.LLJJIII;
            if (smartImageView == null) {
                smartImageView = null;
            }
            C786410Ut5.LLFF(4, smartImageView);
            if (!LJIL().LLJJIJIL.LIZIZ && !C19386310sv.LIZ(this.LLILLJJLI)) {
                LJIIZILJ().LLIZ.setValue(Boolean.TRUE);
            } else {
                C19390010tW c19390010tW = this.LLILZLL;
                if (c19390010tW != null) {
                    c19390010tW.LIZ();
                }
                LJIL().LLJJIJIL.LIZIZ = false;
                LJIIZILJ().LLIZ.setValue(Boolean.FALSE);
            }
            FeedPipViewModel feedPipViewModelLJIL = LJIL();
            final Aweme aweme = (Aweme) C13LP.LJJJLZIJ(feedPipViewModelLJIL.LLJJIJI + 1, feedPipViewModelLJIL.wQ2());
            if (aweme != null && aweme.getVideo() != null && (aid = aweme.getAid()) != null && aid.length() != 0) {
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(aweme.getVideo().getCover()));
                Context context = this.LLILZIL;
                if (context == null) {
                    context = null;
                }
                c1331670kl3LJIIIIZZ.LJJIJL(context);
                c1331670kl3LJIIIIZZ.LIZLLL("PipPlayerVC");
                SmartImageView smartImageView2 = this.LLJJIII;
                if (smartImageView2 == null) {
                    smartImageView2 = null;
                }
                c1331670kl3LJIIIIZZ.LJJ(smartImageView2);
                c1331670kl3LJIIIIZZ.LJIIJ(new C19390310tZ() { // from class: X.10tY
                    @Override // X.InterfaceC427850Gq7
                    public final void cm(Uri uri, View view, Throwable th) {
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                        C19389810tU c19389810tU = this;
                        String aid2 = aweme.getAid();
                        if (aid2 == null) {
                            aid2 = this.LLJJIJIIJIL;
                        }
                        c19389810tU.LLJJIJIIJIL = aid2;
                    }
                });
            }
            View view = this.LLILLJJLI;
            if (view != null && (handler = view.getHandler()) != null) {
                C786410Ut5.LJLIIL(100L, handler, new ARunnableS104S0100000_4(this, 81));
            }
        }
    }

    public final void LJJI(boolean z, Aweme aweme, Aweme aweme2) {
        String str;
        if (aweme == null || aweme2 == null || !Intrinsics.LJFF(LJIL().LLILZIL, "For You")) {
            return;
        }
        if (z) {
            str = "homepage_hot_slide_up";
        } else {
            str = "homepage_hot_slide_down";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJIILLIIL());
        linkedHashMap.put("enter_from", "homepage_hot");
        linkedHashMap.put("play_mode", "normal");
        linkedHashMap.put("auto_mode", "auto");
        String groupId = aweme.getGroupId();
        String str2 = "";
        if (groupId == null) {
            groupId = "";
        }
        linkedHashMap.put("from_group_id", groupId);
        String groupId2 = aweme2.getGroupId();
        if (groupId2 != null) {
            str2 = groupId2;
        }
        linkedHashMap.put("to_group_id", str2);
        linkedHashMap.put("is_finish", CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.remove("enter_method");
        C109300bD.LIZ(str, linkedHashMap);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
        View view;
        Handler handler;
        if (Intrinsics.LJFF(str, this.LLJILLL)) {
            ARunnableS14S2100000_29 aRunnableS14S2100000_29 = this.LLJJJIL;
            if (aRunnableS14S2100000_29 != null && (view = this.LLILLJJLI) != null && (handler = view.getHandler()) != null) {
                handler.removeCallbacks(aRunnableS14S2100000_29);
            }
            if (z) {
                this.LLJJJIL = new ARunnableS14S2100000_29(this, new String(this.LLJJ), "Reaching buffering checkpoint", 1);
                View view2 = this.LLILLJJLI;
                if (view2 != null) {
                    HandlerHook.viewPostDelay(view2, this.LLJJJIL, Mp4ScreenVideoLoadTimeout.CONTROL);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        String strLIZIZ;
        Aweme value = LJIL().LL.getValue();
        if (value != null) {
            strLIZIZ = C19386310sv.LIZIZ(value);
        } else {
            strLIZIZ = null;
        }
        if (!Intrinsics.LJFF(str, strLIZIZ)) {
            return;
        }
        float f = j / j2;
        LJIIZILJ().LLIZLLLIL.setValue(Float.valueOf(f));
        LJIL().LLJJIJIL.LIZ = f;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
        LJIJI().LIZIZ(new AwS94S1000000_9(str, 2));
        if (Intrinsics.LJFF(str, this.LLJILLL)) {
            LJIIZILJ().LLIZ.setValue(Boolean.FALSE);
        }
        if (C279750Axp.LIZ() && !this.LLJJI && this.LLJJJ) {
            this.LLJJJ = false;
        }
    }
}
