package X;

import android.content.Context;
import android.graphics.Matrix;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Qy0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C687540Qy0 extends C1473870oSP implements OnUIPlayListener, InterfaceC1885140z9k {
    public Aweme LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C687560Qy2 LLJIJIL;
    public View LLJILJIL;
    public View LLJILJILJ;
    public boolean LLJILLL;
    public View LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public String LLJJIJIIJIL;
    public Map<String, String> LLJJIJIL;
    public long LLJJJ;
    public boolean LLJJJIL;

    @Override // X.C1473870oSP, X.InterfaceC1474060oSi
    public /* bridge */ /* synthetic */ String getStackTraceString() {
        return C1474050oSh.LIZ();
    }

    @Override // X.InterfaceC1885140z9k
    public View getVideoView() {
        return this;
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
    public final /* synthetic */ void onPausePlay(String str) {
        C583620Mum.LJIIZILJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJIJ(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompleted(String str) {
        C583620Mum.LJIJI(this, str);
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
    public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
        C583620Mum.LJJIIZ(this, str, j, j2);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayRelease(String str) {
        C583620Mum.LJJIIZI(this, str);
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
    public final /* synthetic */ void onPreparePlay(String str) {
        C583620Mum.LJJJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJI(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        C583620Mum.LJJJIL(this, str, c1480420ocy);
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

    @Override // X.InterfaceC1885140z9k
    public final void pause() {
        String groupId;
        this.LLJJIII = false;
        this.LLJJI = true;
        C586970N0l playVideoHelper = getPlayVideoHelper();
        playVideoHelper.LJFF = 1;
        C0N0Y c0n0y = playVideoHelper.LJI;
        if (c0n0y != null) {
            c0n0y.LIZ();
        }
        C687560Qy2 c687560Qy2 = this.LLJIJIL;
        if (c687560Qy2.LIZ > 0 && c687560Qy2.LJ == 0) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            Aweme aweme = this.LLIZ;
            if (aweme == null || (groupId = aweme.getGroupId()) == null) {
                groupId = "";
            }
            c2344009Gk.LJIIIIZZ("video_id", groupId);
            c2344009Gk.LIZJ(this.LLJIJIL.LIZJ, "playing_success");
            c2344009Gk.LIZLLL(this.LLJIJIL.LIZ(), "play_buffering_time");
            c2344009Gk.LJIIIIZZ("fail_reason", this.LLJIJIL.LIZLLL);
            c2344009Gk.LIZJ(this.LLJIJIL.LJ, "error_code");
            String str = this.LLJJIJIL.get("index");
            if (str == null) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("index", str);
            String str2 = this.LLJJIJIL.get("tab_class");
            c2344009Gk.LJIIIIZZ("tab_class", str2 != null ? str2 : "");
            C20684815ws.LJIILLIIL("ttlive_game_partnership_video_auto_play_trace", c2344009Gk.LIZ);
            this.LLJIJIL.LIZIZ();
        }
        View view = this.LLJILJILJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(4, view);
        }
        View view2 = this.LLJILJIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(4, view2);
        }
    }

    @Override // X.InterfaceC1885140z9k
    public final void play() {
        this.LLJJIII = true;
        if (!this.LLJILLL) {
            LJIJI(this.LLIZ);
        }
        if (this.LLJJI) {
            getPlayVideoHelper().LJIIIIZZ();
        } else {
            LJJ();
            getPlayVideoHelper().LJIIJJI();
        }
        if (this.LLJJJIL) {
            getPlayVideoHelper().LJFF();
        }
        C687560Qy2 c687560Qy2 = this.LLJIJIL;
        if (c687560Qy2.LIZ <= 0) {
            c687560Qy2.LIZ = System.currentTimeMillis();
        }
    }

    private final C586920N0g getPlayStateHelper() {
        return (C586920N0g) this.LLJ.getValue();
    }

    private final C586970N0l getPlayVideoHelper() {
        return (C586970N0l) this.LLIZLLLIL.getValue();
    }

    private final C0N0Y getPlayer() {
        return (C0N0Y) this.LLJI.getValue();
    }

    public final void LJJ() {
        String aid;
        View view;
        Aweme aweme;
        Video video;
        Video video2;
        float f;
        float f2;
        String aid2;
        String str = this.LLJJIJIIJIL;
        Aweme aweme2 = this.LLIZ;
        if (aweme2 == null || (aid = aweme2.getAid()) == null) {
            aid = "x";
        }
        if (Intrinsics.LJFF(str, aid)) {
            return;
        }
        Object parent = getParent();
        if (!(parent instanceof View) || (view = (View) parent) == null || (aweme = this.LLIZ) == null || (video = aweme.getVideo()) == null) {
            return;
        }
        float width = video.getWidth();
        Aweme aweme3 = this.LLIZ;
        if (aweme3 == null || (video2 = aweme3.getVideo()) == null) {
            return;
        }
        float height = video2.getHeight();
        float width2 = view.getWidth();
        float height2 = view.getHeight();
        List listLJIIJJI = C1697810uHb.LJIIJJI(Float.valueOf(width), Float.valueOf(height), Float.valueOf(width2), Float.valueOf(height2));
        if (!(listLJIIJJI instanceof Collection) || !listLJIIJJI.isEmpty()) {
            Iterator it2 = listLJIIJJI.iterator();
            while (it2.hasNext()) {
                if (((Number) it2.next()).floatValue() <= 0.0f) {
                    return;
                }
            }
        }
        float f3 = width / height;
        if (f3 >= width2 / height2) {
            f2 = f3 * height2;
            f = height2;
        } else {
            f = width2 / f3;
            f2 = width2;
        }
        float f4 = f2 / width2;
        float f5 = f / height2;
        float f6 = 2;
        float f7 = width2 / f6;
        float f8 = height2 / f6;
        Matrix matrix = new Matrix();
        matrix.setScale(f4, f5, f7, f8);
        setTransform(matrix);
        Aweme aweme4 = this.LLIZ;
        if (aweme4 == null || (aid2 = aweme4.getAid()) == null) {
            aid2 = "";
        }
        this.LLJJIJIIJIL = aid2;
        C20441214yg.LIZIZ("GameMixVideoPlayerCore", "updateSurfaceSize");
    }

    @Override // X.InterfaceC1885140z9k
    public final void release() {
        if (this.LLJJIJI) {
            return;
        }
        this.LLJJIJI = true;
        getPlayVideoHelper().LJIIJ(null);
        getPlayer().release();
    }

    @Override // X.InterfaceC1885140z9k
    public final float LJFF() {
        return getPlayer().getCurrentPosition() / getPlayer().getDuration();
    }

    @Override // X.InterfaceC1885140z9k
    public final boolean isPlaying() {
        C0N0Y c0n0y = getPlayVideoHelper().LJI;
        return c0n0y != null && c0n0y.isPlaying();
    }

    @Override // X.InterfaceC1885140z9k
    public final boolean isMute() {
        return this.LLJJJIL;
    }

    public C687540Qy0(Context context) {
        super(context, null, 0);
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1119));
        this.LLJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(586));
        this.LLJI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(587));
        this.LLJIJIL = new C687560Qy2();
        this.LLJJIJIIJIL = "";
        this.LLJJIJIL = C2097608Jq.LJ();
        this.LLJJJ = System.currentTimeMillis();
    }

    private final void setMute(boolean z) {
        this.LLJJJIL = z;
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

    @Override // X.InterfaceC1885140z9k
    public final void LIZ(boolean z) {
        setMute(z);
    }

    @Override // X.InterfaceC1885140z9k
    public final void LIZLLL(long j) {
        this.LLJJIII = true;
        if (!this.LLJILLL) {
            LJIJI(this.LLIZ);
        }
        LJJ();
        getPlayVideoHelper().LJIIL((int) j);
        if (this.LLJJJIL) {
            getPlayVideoHelper().LJFF();
        }
        C687560Qy2 c687560Qy2 = this.LLJIJIL;
        if (c687560Qy2.LIZ <= 0) {
            c687560Qy2.LIZ = System.currentTimeMillis();
        }
    }

    @Override // X.InterfaceC1885140z9k
    public final void LJIIJ(Object obj) {
        if (!Intrinsics.LJFF(this.LLIZ, obj) && (obj instanceof Aweme)) {
            this.LLJJI = false;
            getPlayer().LIZ();
            Aweme aweme = (Aweme) obj;
            this.LLIZ = aweme;
            LJIJI(aweme);
        }
    }

    public final void LJIJI(Aweme aweme) {
        this.LLJILLL = true;
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
        getPlayVideoHelper().LJIIIZ(aweme);
        this.LLIZ = aweme;
        HashMap<String, Object> map = new HashMap<>();
        map.put("is_fullscreen", 0);
        map.put("enter_from", "");
        getPlayVideoHelper().LJII = map;
        getPlayStateHelper().LIZ = 0;
        getPlayVideoHelper().LJIIJ(getPlayer());
        getPlayVideoHelper().LJIIJ = EnumC2281141EQm.Standard;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPause(String str) {
        Object objValueOf;
        Video video;
        View view = this.LLJILJILJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(4, view);
        }
        View view2 = this.LLJILJIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(4, view2);
        }
        if (this.LLJJJ > 0) {
            Pair[] pairArr = new Pair[2];
            Aweme aweme = this.LLIZ;
            if (aweme != null && (video = aweme.getVideo()) != null) {
                objValueOf = Integer.valueOf(video.getDuration());
            } else {
                objValueOf = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[0] = new Pair("item_duration", objValueOf.toString());
            pairArr[1] = new Pair("duration", String.valueOf(System.currentTimeMillis() - this.LLJJJ));
            LJIL("play_time", C2097608Jq.LJIIIIZZ(pairArr));
            this.LLJJJ = 0L;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        if (this.LLJJIII) {
            View view = this.LLJILJILJ;
            if (view != null) {
                C339190DRl.LIZLLL(view);
            }
        } else {
            View view2 = this.LLJILJILJ;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(4, view2);
            }
        }
        View view3 = this.LLJILJIL;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(4, view3);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
        if (!this.LLJJIII) {
            return;
        }
        this.LLJIJIL.LIZJ = 1;
        this.LLJJJ = System.currentTimeMillis();
        View view = this.LLJJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(4, view);
        }
        View view2 = this.LLJILJILJ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(4, view2);
        }
        if (this.LLJJIII) {
            View view3 = this.LLJILJIL;
            if (view3 != null) {
                C339190DRl.LIZLLL(view3);
            }
        } else {
            View view4 = this.LLJILJIL;
            if (view4 != null) {
                C339190DRl.LIZIZ(view4);
            }
        }
        LJIL("video_play", C2097608Jq.LJ());
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        C687560Qy2 c687560Qy2 = this.LLJIJIL;
        c687560Qy2.LIZJ = 1;
        if (c687560Qy2.LIZIZ <= 0) {
            c687560Qy2.LIZIZ = System.currentTimeMillis();
        }
    }

    @Override // X.InterfaceC1885140z9k
    public void setLogExtras(Map<String, String> map) {
        this.LLJJIJIL = map;
    }

    public void setVideoCover(View view) {
        this.LLJJ = view;
    }

    @Override // X.InterfaceC1885140z9k
    public final void LIZJ(TuxIconView tuxIconView, View view) {
        this.LLJILJIL = tuxIconView;
        this.LLJILJILJ = view;
    }

    public final void LJIL(String str, Map<String, String> map) {
        String groupId;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "gamecp_page_preview_videos_tab");
        Aweme aweme = this.LLIZ;
        if (aweme == null || (groupId = aweme.getGroupId()) == null) {
            groupId = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", groupId);
        c2344009Gk.LJII(map);
        c2344009Gk.LJII(this.LLJJIJIL);
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z) {
        if (z) {
            if (this.LLJJIII) {
                View view = this.LLJILJILJ;
                if (view != null) {
                    C339190DRl.LIZLLL(view);
                }
            } else {
                View view2 = this.LLJILJILJ;
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(4, view2);
                }
            }
            View view3 = this.LLJILJIL;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(4, view3);
                return;
            }
            return;
        }
        View view4 = this.LLJILJILJ;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(4, view4);
        }
        if (this.LLJJIII) {
            View view5 = this.LLJILJIL;
            if (view5 == null) {
                return;
            }
            C339190DRl.LIZLLL(view5);
            return;
        }
        View view6 = this.LLJILJIL;
        if (view6 == null) {
            return;
        }
        C339190DRl.LIZIZ(view6);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str, int i) {
        if (i <= 1) {
            LJIL("video_play_finish", C2097608Jq.LJ());
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, C1481290oeN c1481290oeN) {
        String string;
        Object obj;
        C687560Qy2 c687560Qy2 = this.LLJIJIL;
        int i = 0;
        c687560Qy2.LIZJ = 0;
        if (c1481290oeN == null || (obj = c1481290oeN.LJI) == null || (string = obj.toString()) == null) {
            string = "";
        }
        c687560Qy2.LIZLLL = string;
        C687560Qy2 c687560Qy22 = this.LLJIJIL;
        if (c1481290oeN != null) {
            i = c1481290oeN.LJ;
        }
        c687560Qy22.LJ = i;
    }
}
