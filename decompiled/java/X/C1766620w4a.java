package X;

import Y.ARunnableS126S0100000_26;
import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Size;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.player.ISeaPdpMediaControlService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0w4a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1766620w4a extends C1766640w4c implements InterfaceC1508310pLx {
    public static final boolean LLLJIL = Keva.getRepo("ecom_keva_store").getBoolean("_debug_mix_mall_live_video_debug_view", false);
    public final C01GW LLLFF;
    public volatile boolean LLLFFI;
    public InterfaceC1766630w4b LLLFZ;
    public InterfaceC1764820w1g LLLI;
    public Integer LLLII;
    public String LLLIIII;
    public String LLLIIIIL;
    public String LLLIIIL;
    public boolean LLLIIL;
    public boolean LLLIILIL;
    public int LLLIL;
    public Boolean LLLILZ;
    public boolean LLLILZJ;
    public String LLLILZLLLI;
    public String LLLIZZ;
    public final String LLLJ;

    public C1766620w4a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // X.C1766640w4c, X.C14TU
    public final void LJIILIIL() {
        this.LLLFFI = false;
        C1832807Fu.LIZ();
        super.LJIILIIL();
        if (LLLJIL) {
            LJIJJLI("release");
        }
    }

    public final C1766620w4a getItemView() {
        return this;
    }

    @Override // X.C1766640w4c, X.C14TU, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void setClickPlayWhenHalfScreen(boolean z) {
    }

    public final void setDuration(Double d) {
    }

    public final void setPlayEnd(boolean z) {
    }

    private final ISeaPdpMediaControlService getMediaPlayManager() {
        return (ISeaPdpMediaControlService) this.LLLFF.getValue();
    }

    @Override // X.C1766640w4c, X.C14TU
    public final void LIZLLL() {
        if (this.LLLFFI) {
            super.LIZLLL();
        }
    }

    public final void LJJIFFI() {
        if (LLLJIL) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("trigger:");
            sbLIZ.append(this.LLLIZZ);
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
            sb.append("\n");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("status:");
            sbLIZ2.append(this.LLLILZLLLI);
            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
            sb.append("\n");
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("ratio:");
            sbLIZ3.append(this.LLLJ);
            sb.append(C2188811AlT.LIZIZ(sbLIZ3));
            sb.append("\n");
        }
    }

    @Override // X.C14TU
    public Map<String, String> getVideoSceneTag() {
        if (!C770702zh.LIZIZ(this.LLLIIIL)) {
            return null;
        }
        Pair[] pairArr = new Pair[1];
        String str = this.LLLIIIL;
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("gec", str);
        return C2097608Jq.LJIIJ(pairArr);
    }

    @Override // X.C1766640w4c, X.C14TU
    public final void pause() {
        if (LLLJIL) {
            LJIJJLI("pause");
        }
        super.pause();
    }

    public final void LJJ() {
        Integer num;
        if (getVideoPlayer() != null) {
            String videoId = getVideoId();
            int iIntValue = (videoId == null || (num = (Integer) ((LinkedHashMap) C1845607Ks.LIZ).get(videoId)) == null) ? 0 : num.intValue();
            if (iIntValue <= 0) {
                LIZ(null);
                return;
            }
            setInitTime(iIntValue);
            LIZ(null);
            C19719512Dh.LIZJ(C1845607Ks.LIZ).remove(getVideoId());
        }
    }

    public final String getMediaSrc() {
        return getSrc();
    }

    public final String getVideoId() {
        Aweme aweme = getAweme();
        if (aweme != null) {
            return aweme.getAid();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLLIIL = true;
        if ((this.LLLIL & 2) != 0) {
            this.LLLIL = 0;
            LJJ();
        }
        if (LLLJIL) {
            LJIJJLI("onAttachedToWindow");
        }
        if (getHeight() == 0) {
            HandlerHook.viewPost(this, new ARunnableS126S0100000_26(this, 30));
        }
    }

    @Override // X.C1766640w4c, X.C14TU, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLLIIL = false;
        if (LJIJ()) {
            this.LLLIL = 2;
            LJIL(EnumC1308950kAP.PASSIVE);
        }
        if (LLLJIL) {
            LJIJJLI("onDetachedFromWindow");
        }
    }

    @Override // X.C1766640w4c, X.C14TU
    public final void LJIIIIZZ() {
        super.LJIIIIZZ();
    }

    @Override // X.InterfaceC1508310pLx
    public final boolean LLLLZLLIL() {
        return this.LLILZ;
    }

    @Override // X.C1766640w4c
    public InterfaceC1766650w4d getEcVideoSingleManager() {
        return C1766600w4Y.LIZ;
    }

    public final String getEnterFrom() {
        return this.LLLIIII;
    }

    public final int getPauseReason() {
        return this.LLLIL;
    }

    @Override // X.C14TU
    public String getVideoEnterFrom() {
        return this.LLLIIII;
    }

    @Override // X.C14TU
    public String getVideoTag() {
        return this.LLLIIIIL;
    }

    public final String getVodSceneTag() {
        return this.LLLIIIL;
    }

    public final String getVodTag() {
        return this.LLLIIIIL;
    }

    @Override // X.C1766640w4c, X.C14TU, X.InterfaceC20270014Ta
    public final void LIZ(Function0<Unit> function0) {
        super.LIZ(function0);
        ISeaPdpMediaControlService mediaPlayManager = getMediaPlayManager();
        if (mediaPlayManager != null) {
            mediaPlayManager.MC2(this, true, null);
        }
    }

    @Override // X.C1766640w4c, X.C14TU
    public final Aweme LJIIIZ(String str) {
        return (Aweme) LJIJI(str);
    }

    public final void LJIJJLI(String str) {
        this.LLLIZZ = str;
        LJJIFFI();
    }

    public final void LJIL(EnumC1308950kAP enumC1308950kAP) {
        SystemClock.elapsedRealtime();
        if (LLLJIL) {
            LJIJJLI("pauseMedia");
        }
        pause();
        SystemClock.elapsedRealtime();
        ISeaPdpMediaControlService mediaPlayManager = getMediaPlayManager();
        if (mediaPlayManager != null) {
            mediaPlayManager.MC2(this, false, enumC1308950kAP);
        }
    }

    public final void LJJII(String str) {
        this.LLLILZLLLI = str;
        LJJIFFI();
    }

    @Override // X.C14TU
    public final void onHostDestroy(LifecycleOwner lifecycleOwner) {
        super.onHostDestroy(lifecycleOwner);
        getEcVideoSingleManager().LIZLLL(getScene());
    }

    @Override // X.C14TU
    public final void onHostPause(LifecycleOwner lifecycleOwner) {
        ISeaPdpMediaControlService mediaPlayManager = getMediaPlayManager();
        if (mediaPlayManager != null) {
            mediaPlayManager.oU(EnumC1486810onH.PAUSE);
        }
        if (this.LLLIIL) {
            LJIJ();
        }
        if (this.LLLILZ == null) {
            this.LLLILZ = Boolean.valueOf(LJIJ());
        }
        if (LJIJ()) {
            this.LLLIL = 4;
            if (getVideoPlayer() != null) {
                LJFF();
                LJIL(EnumC1308950kAP.PASSIVE);
            }
        }
        InterfaceC1766630w4b interfaceC1766630w4b = this.LLLFZ;
        if (interfaceC1766630w4b != null) {
            interfaceC1766630w4b.LIZ();
        }
    }

    @Override // X.C14TU
    public final void onHostResume(LifecycleOwner lifecycleOwner) {
        InterfaceC1766630w4b interfaceC1766630w4b = this.LLLFZ;
        if (interfaceC1766630w4b != null) {
            interfaceC1766630w4b.LIZIZ();
        }
        if (Intrinsics.LJFF(this.LLLILZ, Boolean.FALSE)) {
            LJJ();
            return;
        }
        if ((this.LLLIL & 4) == 0) {
            return;
        }
        if (this.LLLILZJ) {
            this.LLLIL = 1;
        } else {
            this.LLLIL = 0;
            LJJ();
        }
    }

    @Override // X.C1766640w4c, X.C14TU, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        LJJII("onPlayCompleted");
        if (LJIILL(str)) {
            int completeCount = getCompleteCount();
            setCompleteCount(completeCount + 1);
            LJII("onCompleted", C2097608Jq.LJI(new Pair("times", Integer.valueOf(completeCount))));
            if (!getEcVideoSingleManager().LIZJ(getScene()) && !this.LLJI) {
                LJFF();
                LJIL(EnumC1308950kAP.ACTIVE);
                C0N0Y videoPlayer = getVideoPlayer();
                if (videoPlayer != null) {
                    videoPlayer.seek(0.0f);
                }
            }
        }
    }

    @Override // X.C1766640w4c, X.C14TU, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(C1481290oeN c1481290oeN) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlayFailed  ");
        sbLIZ.append(c1481290oeN);
        LJJII(C2188811AlT.LIZIZ(sbLIZ));
        super.onPlayFailed(c1481290oeN);
        LJIILL(c1481290oeN.LIZ);
    }

    @Override // X.C14TU, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
        LJJII("onPlaying");
        super.onPlaying(str);
        if (Intrinsics.LJFF(this.LLLILZ, Boolean.FALSE)) {
            LJIL(EnumC1308950kAP.PASSIVE);
            this.LLLILZ = null;
        } else {
            LJIILL(str);
        }
    }

    @Override // X.C14TU, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        LJJII("onRenderFirstFrame");
        setManuallyPaused(false);
        super.onRenderFirstFrame(c1480420ocy);
    }

    public final void setEnterFrom(String str) {
        this.LLLIIII = str;
    }

    public final void setPauseReason(int i) {
        this.LLLIL = i;
    }

    public final void setPdpVideoViewLifecycleListener(InterfaceC1766630w4b interfaceC1766630w4b) {
        this.LLLFZ = interfaceC1766630w4b;
    }

    public final void setPlayingWhenHostPause(Boolean bool) {
        this.LLLILZ = bool;
    }

    @Override // X.C14TU
    public void setPoster(String str) {
        if (!Intrinsics.LJFF(this.LLJIJIL, str)) {
            this.LLJLL.setTag(null);
            C786410Ut5.I5(this.LLJLL, 0.0f);
            C1473870oSP c1473870oSP = this.LLJLIL;
            if (c1473870oSP != null) {
                C786410Ut5.Q5(c1473870oSP, 0.0f);
            }
        }
        super.setPoster(str);
    }

    public final void setScrollInVisibleByBlack(boolean z) {
        this.LLLILZJ = z;
    }

    public final void setScrollObservable(boolean z) {
        this.LLLIILIL = z;
    }

    @Override // X.C14TU
    public void setSinglePlayer(boolean z) {
        super.setSinglePlayer(z);
    }

    @Override // X.C1766640w4c, X.C14TU
    public void setSinglePlayerScene(String str) {
        super.setSinglePlayerScene(str);
    }

    @Override // X.C14TU
    public void setSrc(String str) {
        SystemClock.elapsedRealtime();
        if (!Intrinsics.LJFF(getSrc(), str)) {
            this.LLLFFI = false;
        }
        super.setSrc(str);
        SystemClock.elapsedRealtime();
    }

    public final void setVideoStateChangedCallback(InterfaceC1764820w1g interfaceC1764820w1g) {
        this.LLLI = interfaceC1764820w1g;
    }

    public final void setVodSceneTag(String str) {
        this.LLLIIIL = str;
    }

    public final void setVodTag(String str) {
        this.LLLIIIIL = str;
    }

    @Override // X.InterfaceC1508310pLx
    public final void w4(boolean z) {
        setMuted(z);
        LIZIZ();
        InterfaceC1764820w1g interfaceC1764820w1g = this.LLLI;
        if (interfaceC1764820w1g != null) {
            interfaceC1764820w1g.LIZ(z);
        }
    }

    @Override // X.C14TU
    public final void LJI(RemoteImageView remoteImageView, String str) {
        Size size;
        remoteImageView.LIZ();
        EnumC1769850w9n enumC1769850w9n = EnumC1769850w9n.SHOP_MALL_VIDEO_CARD;
        C1334210kp9.LIZIZ(str, enumC1769850w9n, null, null, false, false, null, null);
        String value = enumC1769850w9n.getValue();
        if (C314740CVk.LIZ.enableLynxForceResize) {
            size = (Size) C20160313uT.LIZIZ().get(value);
        } else {
            size = null;
        }
        C1326790kdB.LIZ.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
        if (size != null) {
            int width = size.getWidth();
            int height = size.getHeight();
            c1331670kl3LIZLLL.LJIIIIZZ = width;
            c1331670kl3LIZLLL.LJIIIZ = height;
        }
        c1331670kl3LIZLLL.LJJI(remoteImageView);
        C786410Ut5.h3(c1331670kl3LIZLLL);
    }

    public final void LJJI(boolean z, EnumC1308950kAP enumC1308950kAP) {
        setMuted(z);
        ISeaPdpMediaControlService mediaPlayManager = getMediaPlayManager();
        if (mediaPlayManager != null) {
            mediaPlayManager.Zk1(this, z, enumC1308950kAP);
        }
    }

    @Override // X.C14TU, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str, C1480430ocz c1480430ocz) {
        LJJII("onPausePlay");
        C583620Mum.LJIJ(this, str, c1480430ocz);
        LJIILL(str);
    }

    @Override // X.C14TU, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        C583620Mum.LJJJIL(this, str, c1480420ocy);
        LJIILL(str);
    }

    public C1766620w4a(Context context, AttributeSet attributeSet, int i) {
        super(0, context, (i & 2) != 0 ? null : attributeSet, false);
        this.LLLFF = C452501pT.LIZIZ(new AwS570S0100000_26(this, 413));
        this.LLLILZLLLI = "__unknow__";
        this.LLLIZZ = "__unknow__";
        this.LLLJ = "__unknow__";
    }

    @Override // X.C14TU, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        int iValueOf;
        C583620Mum.LJJIIZ(this, str, j, j2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlayProgressChange ");
        sbLIZ.append(j);
        LJJII(C2188811AlT.LIZIZ(sbLIZ));
        if (LJIILL(str)) {
            int i = 0;
            if (this.LLLII == null) {
                try {
                    iValueOf = Integer.valueOf((int) (j2 / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("updateCountdownTime error: ");
                    sbLIZ2.append(j2);
                    C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
                    iValueOf = 0;
                }
                this.LLLII = iValueOf;
            }
            long j3 = 0;
            if (j > 0) {
                long j4 = j2 - j;
                if (j4 >= 0) {
                    j3 = j4;
                }
                try {
                    i = (int) (j3 / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("updateCountdownTime error: ");
                    sbLIZ3.append(j4);
                    C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ3));
                }
                Integer num = this.LLLII;
                if (num != null && Math.abs(i - num.intValue()) >= 1) {
                    this.LLLII = Integer.valueOf(i);
                }
            }
        }
    }
}
