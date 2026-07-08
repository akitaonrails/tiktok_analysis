package X;

import android.os.SystemClock;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v1.CommerceMusicSubstituteMusicVideoViewModel;
import com.ss.android.ugc.aweme.commercialize.media.impl.logging.CommerceMusicLogger;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS141S1100000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0xxH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1838970xxH extends RecyclerView.ViewHolder implements InterfaceC1483820oiS, InterfaceC1482530ogN {
    public final View LL;
    public final LifecycleOwner LLILLJJLI;
    public final CommerceMusicLogger LLILLL;
    public final CommerceMusicSubstituteMusicVideoViewModel LLILZ;
    public final Function1<MusicModel, Unit> LLILZIL;
    public Long LLILZLL;
    public final C01GW LLIZ;
    public final C2252321DDq LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void Au(Surface surface) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void Gk1(C1284720jXK c1284720jXK) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void LLZZLLIL(C1281010jRL c1281010jRL) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void Qe2(C1700490uLv c1700490uLv) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void VK() {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void W1(String str) {
    }

    @Override // X.InterfaceC1483820oiS
    public final boolean bn() {
        return true;
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ InterfaceC1473950oSX getCustomSurfaceLifecycleListener() {
        return null;
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ Surface getSurface() {
        return null;
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ void hj() {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onBrightnessChanged(String str, float f) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onBufferedPercent(String str, long j, int i) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onCompleteLoaded(String str, boolean z) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onCrosstalkHappened(String str, List list) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onLoopPlay(String str, int i) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPlayCompleted(String str, int i) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPlayPause(String str) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPlayPrepare(String str) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPlayPrepared(String str) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPlayRelease(String str) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener
    public final /* synthetic */ void onPreRenderReady(String str) {
        C490850JMt.LIZ(this, str);
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPreRenderSessionMissed(String str) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onSeekEnd(String str, boolean z) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onSeekStart(String str, int i, float f) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onSpeedChanged(String str, float f) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onStopPlay(String str) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onVideoSecondFrame(String str) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ void pe() {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void tc(String str, JSONObject jSONObject) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void uv(JSONObject jSONObject) {
    }

    @Override // X.InterfaceC1483820oiS
    public final HashMap getParams() {
        return new HashMap();
    }

    @Override // X.InterfaceC1483820oiS
    public final FrameLayout getPlayViewContainer() {
        return (FrameLayout) this.LLJ.getValue();
    }

    @Override // X.InterfaceC1482530ogN
    public final void onPlaying(String str, C1480430ocz c1480430ocz) {
        this.LLILZLL = Long.valueOf(SystemClock.uptimeMillis());
    }

    @Override // X.InterfaceC1482530ogN
    public final void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
        CommerceMusicLogger commerceMusicLogger = this.LLILLL;
        C1850180yFM.LIZ.getClass();
        commerceMusicLogger.log(C1850180yFM.LJIIIIZZ, new AwS141S1100000_27(this, str, 22));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1838970xxH(View view, LifecycleOwner lifecycleOwner, CommerceMusicLogger commerceMusicLogger, CommerceMusicSubstituteMusicVideoViewModel commerceMusicSubstituteMusicVideoViewModel, Function1<? super MusicModel, Unit> function1) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = commerceMusicLogger;
        this.LLILZ = commerceMusicSubstituteMusicVideoViewModel;
        this.LLILZIL = function1;
        this.LLIZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1349));
        this.LLIZLLLIL = C1BNE.LIZ(-1);
        this.LLJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1350));
        this.LLJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1351));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1348));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1347));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1346));
    }
}
