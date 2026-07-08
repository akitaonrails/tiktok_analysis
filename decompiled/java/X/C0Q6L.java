package X;

import android.content.Context;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Q6L, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q6L extends C1473870oSP implements OnUIPlayListener, C0Q6M {
    public C0Q6M LLIZ;
    public Aweme LLIZLLLIL;
    public String LLJ;
    public final boolean LLJI;
    public C0N0Y LLJIJIL;
    public boolean LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public boolean LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public long LLJJIJI;

    public C0Q6L(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // X.C0Q6M
    public final void LJII() {
    }

    @Override // X.C0Q6M
    public final void LJJIJIIJIL() {
    }

    @Override // X.C0Q6M
    public final void a1(C1481290oeN c1481290oeN) {
    }

    @Override // X.C1473870oSP, X.InterfaceC1474060oSi
    public /* bridge */ /* synthetic */ String getStackTraceString() {
        return C1474050oSh.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
        return C583620Mum.LIZ(this);
    }

    @Override // X.C0Q6M
    public final void i9() {
    }

    @Override // X.C0Q6M
    public final void nd() {
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
    public final /* synthetic */ void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
        C583620Mum.LJFF(this, str, z, c1480430ocz);
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
    public final /* synthetic */ void onPausePlay(String str) {
        C583620Mum.LJIIZILJ(this, str);
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

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayProgressChange(float f) {
        C583620Mum.LJJIIJZLJL(this, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
        C583620Mum.LJJIIZ(this, str, j, j2);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayRelease(String str) {
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
    public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
        C583620Mum.LJJJJI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderReady(C1480430ocz c1480430ocz) {
        C583620Mum.LJJJJIZL(this, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str) {
        C583620Mum.LJJJJJ(this, str);
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

    private final C586920N0g getPlayStateHelper() {
        return (C586920N0g) this.LLJJI.getValue();
    }

    private final C586970N0l getPlayVideoHelper() {
        return (C586970N0l) this.LLJILLL.getValue();
    }

    private final String getPlayerInstanceInfo() {
        C0N0Y c0n0y = this.LLJIJIL;
        if (c0n0y == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Player{");
            sbLIZ.append(Integer.toHexString(hashCode()));
            sbLIZ.append(" player=null}");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Player{");
        sbLIZ2.append(Integer.toHexString(hashCode()));
        sbLIZ2.append(" player=");
        sbLIZ2.append(Integer.toHexString(c0n0y.hashCode()));
        sbLIZ2.append('}');
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final void LLJJJ() {
        C0N0Y c0n0y;
        VideoUrlModel videoUrlModelLJJIII;
        if (this.LLIZLLLIL != null) {
            String str = this.LLJ;
            if (str != null && (c0n0y = this.LLJIJIL) != null && c0n0y.LJJIII() != null) {
                C0N0Y c0n0y2 = this.LLJIJIL;
                if (!TextUtils.equals(str, (c0n0y2 == null || (videoUrlModelLJJIII = c0n0y2.LJJIII()) == null) ? null : videoUrlModelLJJIII.getSourceId())) {
                    return;
                }
            }
            if (C0Q6P.LIZJ() != null) {
                C0Q6P.LIZLLL(null);
                C0Q6P.LIZJ = true;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pauseVideo aid: ");
            Aweme aweme = this.LLIZLLLIL;
            sbLIZ.append(aweme != null ? aweme.getAid() : null);
            C2188811AlT.LIZIZ(sbLIZ);
            C586970N0l playVideoHelper = getPlayVideoHelper();
            playVideoHelper.LJFF = 1;
            C0N0Y c0n0y3 = playVideoHelper.LJI;
            if (c0n0y3 != null) {
                c0n0y3.LIZ();
            }
        }
    }

    public final void O4() {
        if (this.LLIZLLLIL != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getPlayerInstanceInfo());
            sbLIZ.append(" onDestroy. aid: ");
            Aweme aweme = this.LLIZLLLIL;
            sbLIZ.append(aweme != null ? aweme.getAid() : null);
            C2188811AlT.LIZIZ(sbLIZ);
            this.LLJJIJI = getPlayVideoHelper().LIZLLL();
            LLJJJ();
            C0N0Y c0n0y = this.LLJIJIL;
            if (c0n0y != null) {
                c0n0y.LJJIIJZLJL();
                try {
                    c0n0y.release();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                getPlayVideoHelper().LIZJ();
                this.LLJIJIL = null;
            }
        }
    }

    public final InterfaceC1482650ogZ getSurfaceHolder() {
        return (InterfaceC1482650ogZ) this.LLJILJILJ.getValue();
    }

    public final InterfaceC1473950oSX getVideoSurfaceLifecycleListener() {
        return (InterfaceC1473950oSX) this.LLJJIII.getValue();
    }

    @Override // X.C1473870oSP, android.view.View
    public final void onDetachedFromWindow() {
        if (this.LLJI) {
            super.onDetachedFromWindow();
            this.LLJILJIL = false;
            C0Q6M c0q6m = this.LLIZ;
            if (c0q6m != null) {
                c0q6m.i9();
            }
        }
    }

    public final boolean LJIL() {
        C0N0Y c0n0y = getPlayVideoHelper().LJI;
        if (c0n0y == null || !c0n0y.isPlaying()) {
            return false;
        }
        int i = getPlayVideoHelper().LJFF;
        return i == 2 || i == 0;
    }

    public final void LLLLLIL() {
        if (C0Q6P.LIZJ() != null) {
            C0Q6P.LIZLLL(null);
            C0Q6P.LIZJ = true;
        }
        if (this.LLJILJIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("playVideo, aid: ");
            Aweme aweme = this.LLIZLLLIL;
            sbLIZ.append(aweme != null ? aweme.getAid() : null);
            C2188811AlT.LIZIZ(sbLIZ);
            getPlayStateHelper().LIZ = 4;
            C0N0Y c0n0y = this.LLJIJIL;
            if (c0n0y != null) {
                String strLJJJLIIL = c0n0y.LJJJLIIL();
                Aweme aweme2 = this.LLIZLLLIL;
                if (!Intrinsics.LJFF(strLJJJLIIL, aweme2 != null ? aweme2.getAid() : null)) {
                    LLJJJ();
                    C0N0Y c0n0y2 = this.LLJIJIL;
                    if (c0n0y2 != null) {
                        c0n0y2.LJJIIJZLJL();
                        try {
                            c0n0y2.release();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    getPlayVideoHelper().LIZJ();
                    this.LLJIJIL = null;
                }
            }
            if (this.LLJIJIL == null) {
                C1483410ohn c1483410ohn = new C1483410ohn();
                C586970N0l playVideoHelper = getPlayVideoHelper();
                if (playVideoHelper != null) {
                    playVideoHelper.LJIIJ(c1483410ohn);
                }
                this.LLJIJIL = c1483410ohn;
            }
            C586970N0l playVideoHelper2 = getPlayVideoHelper();
            if (playVideoHelper2 != null) {
                playVideoHelper2.LJIIJ(this.LLJIJIL);
            }
            getPlayVideoHelper().LJIIIIZZ();
        }
    }

    @Override // X.C1473870oSP, android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLJILJIL = true;
        C0Q6M c0q6m = this.LLIZ;
        if (c0q6m != null) {
            c0q6m.nd();
        }
    }

    public final Aweme getAweme() {
        return this.LLIZLLLIL;
    }

    public final long getCurrentPosition() {
        return this.LLJJIJI;
    }

    public final boolean getMute() {
        return this.LLJJ;
    }

    public final C0N0Y getPlayer() {
        return this.LLJIJIL;
    }

    public final C0Q6M getPlayerViewListener() {
        return this.LLIZ;
    }

    public final String getSourceId() {
        return this.LLJ;
    }

    public final void LJIJI(Aweme aweme) {
        this.LLJ = null;
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
        getPlayVideoHelper().LJIIIZ(aweme);
        this.LLIZLLLIL = aweme;
        getPlayStateHelper().LIZ = 0;
    }

    public final boolean LJJ(String str) {
        Aweme aweme = this.LLIZLLLIL;
        if (aweme != null && TextUtils.equals(str, aweme.getAid())) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        C0Q6M c0q6m;
        if (LJJ(str) && (c0q6m = this.LLIZ) != null) {
            c0q6m.LJJIJIIJIL();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        LJJ(str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
        LJJ(str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        if (!LJJ(c1480420ocy.getSourceId())) {
            return;
        }
        C0Q6M c0q6m = this.LLIZ;
        if (c0q6m != null) {
            c0q6m.LJII();
        }
        C0N0Y c0n0y = this.LLJIJIL;
        if (c0n0y != null) {
            c0n0y.setSpeed(1.0f);
        }
    }

    public final void setAweme(Aweme aweme) {
        this.LLIZLLLIL = aweme;
    }

    public final void setCurrentPosition(long j) {
        this.LLJJIJI = j;
    }

    public final void setMute(boolean z) {
        this.LLJJ = z;
        if (z) {
            getPlayVideoHelper().LJFF();
            return;
        }
        C0N0Y c0n0y = getPlayVideoHelper().LJI;
        if (c0n0y == null) {
            return;
        }
        c0n0y.LJIJJ();
    }

    public final void setPlayer(C0N0Y c0n0y) {
        this.LLJIJIL = c0n0y;
    }

    public final void setPlayerViewListener(C0Q6M c0q6m) {
        this.LLIZ = c0q6m;
    }

    public final void setSourceId(String str) {
        this.LLJ = str;
    }

    public final void LJJI(int i, int i2) {
        Aweme aweme;
        Aweme aweme2;
        Video video;
        float f;
        if (i > 0 && i2 > 0 && (aweme = this.LLIZLLLIL) != null && aweme.getVideo() != null && (aweme2 = this.LLIZLLLIL) != null && (video = aweme2.getVideo()) != null) {
            int width = video.getWidth();
            int height = video.getHeight();
            if (width > 0 && height > 0) {
                float f2 = height / width;
                if (f2 > 0.0f) {
                    float f3 = i2 / i;
                    float f4 = 1.0f;
                    if (f3 > f2) {
                        float f5 = f3 / f2;
                        f = 1.0f;
                        f4 = f5;
                    } else {
                        f = f2 / f3;
                    }
                    Matrix matrix = new Matrix();
                    matrix.setScale(f4, f, i / 2, i2 / 2);
                    setTransform(matrix);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z) {
        LJJ(str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z) {
        LJJ(str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, C1481290oeN c1481290oeN) {
        C0Q6M c0q6m;
        if (LJJ(str) && (c0q6m = this.LLIZ) != null) {
            c0q6m.a1(c1481290oeN);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, boolean z) {
        LJJ(str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        if (!LJJ(str)) {
            return;
        }
        getPlayStateHelper().LIZ = 2;
        C0N0Y c0n0y = this.LLJIJIL;
        if (c0n0y != null) {
            c0n0y.setSpeed(1.0f);
        }
    }

    public C0Q6L(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLJI = true;
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 187));
        this.LLJILLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 186));
        this.LLJJ = true;
        this.LLJJI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(130));
        this.LLJJIII = C452501pT.LIZIZ(new AwS554S0100000_10(this, 188));
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
        LJJ(str);
    }
}
