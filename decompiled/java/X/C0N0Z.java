package X;

import android.graphics.SurfaceTexture;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS195S0000000_9;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0N0Z, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N0Z implements OnUIPlayListener {
    public final ViewGroup LL;
    public final VideoViewComponent LLILZ;
    public final C586860N0a LLILZIL;
    public final View LLIZ;
    public final C586870N0b LLIZLLLIL;
    public final ArrayList<OnUIPlayListener> LLILLJJLI = new ArrayList<>();
    public final C586920N0g LLILLL = new C586920N0g();
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(496));

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

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
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
    public final /* synthetic */ void onPlaying(String str) {
        C583620Mum.LJJIJLIJ(this, str);
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

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
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

    public final C0N0Y LIZ() {
        return (C0N0Y) this.LLILZLL.getValue();
    }

    public final void LIZIZ() {
        C0N0Y c0n0y = this.LLILZIL.LJFF;
        if (c0n0y != null) {
            c0n0y.LIZ();
        }
        this.LLILLL.LIZ = 3;
        C1483410ohn c1483410ohn = C1483410ohn.LJIILJJIL;
        LIZ().LJJIIZI();
    }

    public final void LIZJ() {
        C0N0Y c0n0y;
        C0N0Y c0n0y2 = this.LLILZIL.LJFF;
        if (c0n0y2 != null) {
            c0n0y2.LJJIIZ();
        }
        C586860N0a c586860N0a = this.LLILZIL;
        if (c586860N0a.LIZIZ() && c586860N0a.LIZ() != null && (c0n0y = c586860N0a.LJFF) != null) {
            c0n0y.LJJIJ(c586860N0a.LIZLLL);
            C1482640ogY c1482640ogY = c586860N0a.LIZJ;
            if (c1482640ogY != null) {
                c586860N0a.LJFF.setSurface(c1482640ogY.getSurface());
            }
            C0N0Y c0n0y3 = c586860N0a.LJFF;
            InterfaceC586890N0d interfaceC586890N0d = c586860N0a.LJ;
            Aweme aweme = c586860N0a.LIZ;
            interfaceC586890N0d.getClass();
            c0n0y3.LJIILIIL(aweme == null ? null : aweme.getVideo(), c586860N0a.LIZLLL);
        }
        this.LLILLL.LIZ = 4;
    }

    public final void LIZLLL(int i) {
        C0N0Y c0n0y;
        Video video;
        C586860N0a c586860N0a = this.LLILZIL;
        if (c586860N0a.LIZIZ() && c586860N0a.LIZ() != null && (c0n0y = c586860N0a.LJFF) != null) {
            c0n0y.LJJIJ(c586860N0a.LIZLLL);
            C1482640ogY c1482640ogY = c586860N0a.LIZJ;
            if (c1482640ogY != null) {
                c586860N0a.LJFF.setSurface(c1482640ogY.getSurface());
            }
            C0N0Y c0n0y2 = c586860N0a.LJFF;
            InterfaceC586890N0d interfaceC586890N0d = c586860N0a.LJ;
            Aweme aweme = c586860N0a.LIZ;
            interfaceC586890N0d.getClass();
            if (aweme == null) {
                video = null;
            } else {
                video = aweme.getVideo();
            }
            c0n0y2.LJIJJLI(video, i);
        }
        C0N0Y c0n0y3 = this.LLILZIL.LJFF;
        if (c0n0y3 != null) {
            c0n0y3.LJJIIZ();
        }
        this.LLILLL.LIZ = 2;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        Iterator<OnUIPlayListener> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onBuffering(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z) {
        Iterator<OnUIPlayListener> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onDecoderBuffering(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        Iterator<OnUIPlayListener> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onPausePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        Iterator<OnUIPlayListener> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onPlayCompleted(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        Iterator<OnUIPlayListener> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onPlayCompletedFirstTime(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(C1481290oeN c1481290oeN) {
        Iterator<OnUIPlayListener> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onPlayFailed(c1481290oeN);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        Iterator<OnUIPlayListener> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onPlayProgressChange(f);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        Iterator<OnUIPlayListener> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onPreparePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        Iterator<OnUIPlayListener> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onRenderFirstFrame(c1480420ocy);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(C1480430ocz c1480430ocz) {
        Iterator<OnUIPlayListener> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onRenderReady(c1480430ocz);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        Iterator<OnUIPlayListener> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onResumePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(C1481290oeN c1481290oeN) {
        Iterator<OnUIPlayListener> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onRetryOnError(c1481290oeN);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0N0c] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0N0b, X.0oSX] */
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
    public C0N0Z(ViewGroup viewGroup, Aweme aweme) {
        this.LL = viewGroup;
        ?? r4 = new InterfaceC1473950oSX() { // from class: X.0N0b
            @Override // X.InterfaceC1473950oSX
            public final void LIZ() {
            }

            @Override // X.InterfaceC1473950oSX
            public final /* synthetic */ void LLF(int i, int i2) {
            }

            @Override // X.InterfaceC1473950oSX
            public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override // X.InterfaceC1473950oSX
            public final void LLILLIZIL(int i, int i2) {
                this.LL.getClass();
            }
        };
        this.LLIZLLLIL = r4;
        LIZ().LJJJJ(new C0Q6Q() { // from class: X.0N0c
            @Override // X.C0Q6Q
            public final void LIZ() {
            }

            @Override // X.C0Q6Q
            public final void LIZIZ() {
            }
        });
        VideoViewComponent videoViewComponent = new VideoViewComponent();
        this.LLILZ = videoViewComponent;
        videoViewComponent.LIZIZ(viewGroup);
        this.LLIZ = videoViewComponent.LLILLL.getView();
        C586860N0a c586860N0a = new C586860N0a(videoViewComponent, this);
        this.LLILZIL = c586860N0a;
        C1483410ohn c1483410ohn = C1483410ohn.LJIILJJIL;
        c586860N0a.LJFF = LIZ();
        if (aweme != null) {
            if (aweme.getAwemeType() == 13) {
                c586860N0a.LIZIZ = aweme;
                c586860N0a.LIZ = aweme.getForwardItem();
            } else {
                c586860N0a.LIZIZ = null;
                c586860N0a.LIZ = aweme;
            }
        }
        videoViewComponent.LLILLL.Dn(r4);
    }
}
