package X;

import Y.ACListenerS146S0100000_11;
import Y.AObjectS386S0100000_11;
import Y.AObserverS215S0100000_11;
import android.view.Surface;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.mediabox.arch.viewmodel.SimArchLiveData;
import com.ss.android.ugc.mediabox.playerui.viewmodel.GestureViewModel;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0S3B, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S3B extends C0S34 {
    public final C01GW LJI = C452501pT.LIZIZ(new AObjectS386S0100000_11(this, 1));
    public final C01GW LJII = C452501pT.LIZIZ(new AObjectS386S0100000_11(this, 2));
    public final C0S3H LJIIIIZZ = new InterfaceC1482530ogN() { // from class: X.0S3H
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
        public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
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

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void tc(String str, JSONObject jSONObject) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void uv(JSONObject jSONObject) {
        }

        @Override // X.InterfaceC1482530ogN
        public final void onPlayPause(String str) {
            this.LL.getClass();
            View view = (View) this.LL.LJI.getValue();
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
                C786410Ut5.T4(view, 0.0f);
                view.animate().alpha(0.3f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            }
        }

        @Override // X.InterfaceC1482530ogN
        public final void onPlaying(String str, C1480430ocz c1480430ocz) {
            this.LL.getClass();
            View view = (View) this.LL.LJI.getValue();
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
        }
    };
    public final AObserverS215S0100000_11 LJIIIZ = new AObserverS215S0100000_11(this, 26);

    @Override // X.C0S34, X.C0S3C
    public final void LJII() {
        SimArchLiveData<Unit> simArchLiveData;
        C714880S2k c714880S2kLIZIZ;
        InterfaceC1484830ok5 player;
        InterfaceC690370R6d interfaceC690370R6d = this.LJ;
        if (interfaceC690370R6d != null && (c714880S2kLIZIZ = interfaceC690370R6d.LIZIZ()) != null && (player = c714880S2kLIZIZ.getPlayer()) != null) {
            player.LJJIIZ(this.LJIIIIZZ);
        }
        GestureViewModel gestureViewModel = (GestureViewModel) this.LJII.getValue();
        if (gestureViewModel == null || (simArchLiveData = gestureViewModel.LLILLJJLI) == null) {
            return;
        }
        simArchLiveData.removeObserver(this.LJIIIZ);
    }

    public final void LJIIIIZZ() {
        C714880S2k c714880S2kLIZIZ;
        InterfaceC1484830ok5 player;
        InterfaceC690370R6d interfaceC690370R6d;
        C714880S2k c714880S2kLIZIZ2;
        InterfaceC1484830ok5 player2;
        C714880S2k c714880S2kLIZIZ3;
        InterfaceC1484830ok5 player3;
        InterfaceC1483850oiV playState;
        InterfaceC690370R6d interfaceC690370R6d2 = this.LJ;
        int state = (interfaceC690370R6d2 == null || (c714880S2kLIZIZ3 = interfaceC690370R6d2.LIZIZ()) == null || (player3 = c714880S2kLIZIZ3.getPlayer()) == null || (playState = player3.getPlayState()) == null) ? -1 : playState.getState();
        if (state == 1 || state == 2 || state == 3 || state == 4) {
            InterfaceC690370R6d interfaceC690370R6d3 = this.LJ;
            if (interfaceC690370R6d3 == null || (c714880S2kLIZIZ = interfaceC690370R6d3.LIZIZ()) == null || (player = c714880S2kLIZIZ.getPlayer()) == null) {
                return;
            }
            player.pause();
            return;
        }
        if (5 != state || (interfaceC690370R6d = this.LJ) == null || (c714880S2kLIZIZ2 = interfaceC690370R6d.LIZIZ()) == null || (player2 = c714880S2kLIZIZ2.getPlayer()) == null) {
            return;
        }
        player2.resume();
    }

    @Override // X.C0S34, X.C0S3C
    public final void LJI(InterfaceC690390R6f interfaceC690390R6f) {
        C714880S2k c714880S2kLIZIZ;
        InterfaceC1484830ok5 player;
        LifecycleOwner lifecycleOwnerLLILLIZIL;
        GestureViewModel gestureViewModel;
        SimArchLiveData<Unit> simArchLiveData;
        C0S3E c0s3e;
        super.LJI(interfaceC690390R6f);
        C0S3D c0s3d = null;
        if ((interfaceC690390R6f instanceof C0S3E) && (c0s3e = (C0S3E) interfaceC690390R6f) != null) {
            c0s3e.LIZ();
        }
        InterfaceC715010S2x interfaceC715010S2x = this.LIZ;
        if (interfaceC715010S2x != null && (lifecycleOwnerLLILLIZIL = interfaceC715010S2x.LLILLIZIL()) != null && (gestureViewModel = (GestureViewModel) this.LJII.getValue()) != null && (simArchLiveData = gestureViewModel.LLILLJJLI) != null) {
            simArchLiveData.observe(lifecycleOwnerLLILLIZIL, this.LJIIIZ);
        }
        C0S3D c0s3d2 = this.LIZIZ;
        if (c0s3d2 != null) {
            c0s3d = c0s3d2;
        }
        ACListenerS146S0100000_11 aCListenerS146S0100000_11 = new ACListenerS146S0100000_11(this, 48);
        View view = c0s3d.LIZ;
        if (view != null) {
            C786410Ut5.I7(aCListenerS146S0100000_11, view);
        }
        InterfaceC690370R6d interfaceC690370R6d = this.LJ;
        if (interfaceC690370R6d != null && (c714880S2kLIZIZ = interfaceC690370R6d.LIZIZ()) != null && (player = c714880S2kLIZIZ.getPlayer()) != null) {
            player.LJIIZILJ(this.LJIIIIZZ);
        }
    }
}
