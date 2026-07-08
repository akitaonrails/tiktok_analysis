package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0JO7, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JO7 extends FrameLayout implements OnUIPlayListener {
    public static final /* synthetic */ int LLJ = 0;
    public C0JNZ LL;
    public C489780JIq LLILLJJLI;
    public FrameLayout LLILLL;
    public C0JN1 LLILZ;
    public C0JNE LLILZIL;
    public C0JNK LLILZLL;
    public final C054G LLIZ;
    public final List<C0JNP> LLIZLLLIL;

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
        return C583620Mum.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBrightnessChanged(String str, float f) {
        C583620Mum.LIZIZ(this, str, f);
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
    public final /* synthetic */ void onPreparePlay(String str) {
        C583620Mum.LJJJ(this, str);
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
    public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJJJL(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(C1481290oeN c1481290oeN) {
        C583620Mum.LJJJJLI(this, c1481290oeN);
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

    public final int getCurrentDuration() {
        return (int) ((this.LLILZIL.LIZIZ() * this.LLILZIL.LIZJ.getValue().floatValue()) / 100);
    }

    public final String getCurrentSourceID() {
        return this.LLILZIL.LIZ();
    }

    public final C489780JIq getGestureLayout() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.iuv);
            this.LLILLJJLI = (C489780JIq) callbackFindViewById;
        }
        return (C489780JIq) callbackFindViewById;
    }

    public final FrameLayout getOverlayLayoutContainer() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pwr);
            this.LLILLL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final C0JNZ getVideoLayout() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.video_layout);
            this.LL = (C0JNZ) callbackFindViewById;
        }
        return (C0JNZ) callbackFindViewById;
    }

    public final TextureView getTextureView() {
        C0JNZ videoLayout = getVideoLayout();
        if (videoLayout != null) {
            return videoLayout.getTextureView();
        }
        return null;
    }

    public final C0JN1 getOverlayLayout() {
        return this.LLILZ;
    }

    public final C0JNK getPlayer() {
        return this.LLILZLL;
    }

    public final C0JNE getPlayerChannel() {
        return this.LLILZIL;
    }

    public final void LIZIZ(int i) {
        AbstractC490940JNc c490900JMy;
        if (C500260Jjc.LJJII(i)) {
            c490900JMy = new C490990JNh(getContext());
        } else {
            c490900JMy = new C490900JMy(getContext());
        }
        c490900JMy.setClipChildren(false);
        c490900JMy.setClipToPadding(false);
        c490900JMy.LIZJ(this, this.LLIZ);
        FrameLayout overlayLayoutContainer = getOverlayLayoutContainer();
        if (overlayLayoutContainer != null) {
            C786410Ut5.LJJJJIZL(overlayLayoutContainer);
        }
        FrameLayout overlayLayoutContainer2 = getOverlayLayoutContainer();
        if (overlayLayoutContainer2 != null) {
            overlayLayoutContainer2.addView(c490900JMy);
        }
        this.LLILZ = c490900JMy;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        if (Intrinsics.LJFF(str, this.LLILZIL.LIZ()) && this.LLILZIL.LJ.getValue().LIZ) {
            this.LLILZIL.LJ.setValue(new C0JNF(false, false));
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        Intrinsics.LJFF(str, this.LLILZIL.LIZ());
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        if (Intrinsics.LJFF(str, this.LLILZIL.LIZ()) && !this.LLILZIL.LJ.getValue().LIZ) {
            this.LLILZIL.LJ.setValue(new C0JNF(true, false));
        }
    }

    public final void setGestureLayout(C489780JIq c489780JIq) {
        this.LLILLJJLI = c489780JIq;
    }

    public final void setIsFadingMode(boolean z) {
        this.LLILZIL.LJIIIIZZ.setValue(Boolean.valueOf(z));
    }

    public final void setOverlayLayout(C0JN1 c0jn1) {
        this.LLILZ = c0jn1;
    }

    public final void setOverlayLayoutContainer(FrameLayout frameLayout) {
        this.LLILLL = frameLayout;
    }

    public final void setPlayer(C0JNK c0jnk) {
        this.LLILZLL = c0jnk;
    }

    public final void setPlayerChannel(C0JNE c0jne) {
        this.LLILZIL = c0jne;
    }

    public final void setVideoLayout(C0JNZ c0jnz) {
        this.LL = c0jnz;
    }

    public C0JO7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZIL = new C0JNE(null, null, null, 131071);
        this.LLIZ = C2296808zG.LIZ(C0PEM.LIZ.plus(C2296908zH.LIZ()));
        this.LLIZLLLIL = new ArrayList();
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.dfd, this, true);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z) {
        if (!Intrinsics.LJFF(str, this.LLILZIL.LIZ())) {
            return;
        }
        this.LLILZIL.LJFF.setValue(Boolean.valueOf(z));
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z) {
        if (!Intrinsics.LJFF(str, this.LLILZIL.LIZ())) {
            return;
        }
        this.LLILZIL.LJFF.setValue(Boolean.valueOf(z));
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, C1481290oeN c1481290oeN) {
        if (!Intrinsics.LJFF(str, this.LLILZIL.LIZ())) {
            return;
        }
        Iterator<C0JNP> it2 = this.LLIZLLLIL.iterator();
        while (it2.hasNext()) {
            it2.next().IO(c1481290oeN, this.LLILZIL.LIZJ.getValue().floatValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str, C1480430ocz c1480430ocz) {
        Intrinsics.LJFF(str, this.LLILZIL.LIZ());
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        if (!Intrinsics.LJFF(str, this.LLILZIL.LIZ())) {
            return;
        }
        C23250099c.LIZLLL(this.LLIZ, null, null, new C0JNV(this, null), 3);
        Iterator it2 = ((ArrayList) this.LLIZLLLIL).iterator();
        while (it2.hasNext()) {
            ((C0JNP) it2.next()).Cq();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(String str, C1481290oeN c1481290oeN) {
        Intrinsics.LJFF(str, this.LLILZIL.LIZ());
    }

    public final void LIZ(Video video, int i, C0JIX c0jix) {
        this.LLILZIL = new C0JNE(video, c0jix, C1BNE.LIZ(Integer.valueOf(i)), 130044);
        C0JNZ videoLayout = getVideoLayout();
        if (videoLayout != null) {
            videoLayout.LIZJ(this, this.LLIZ);
        }
        C489780JIq gestureLayout = getGestureLayout();
        if (gestureLayout != null) {
            gestureLayout.LIZJ(this, this.LLIZ);
        }
        LIZIZ(i);
        C23250099c.LIZLLL(this.LLIZ, null, null, new C0JNN(this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j, int i) {
        if (!Intrinsics.LJFF(str, this.LLILZIL.LIZ())) {
            return;
        }
        this.LLILZIL.LIZLLL.setValue(Integer.valueOf(i));
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        if (Intrinsics.LJFF(str, this.LLILZIL.LIZ()) && j >= 0) {
            float f = j;
            float f2 = j2;
            float f3 = 100;
            float f4 = ((1.0f * f) / f2) * f3;
            float fFloatValue = (this.LLILZIL.LIZJ.getValue().floatValue() / f3) * f2;
            if (fFloatValue >= f && fFloatValue - f <= 500.0f) {
                return;
            }
            C23250099c.LIZLLL(this.LLIZ, null, null, new C0JNL(this, str, f4, null), 3);
        }
    }
}
