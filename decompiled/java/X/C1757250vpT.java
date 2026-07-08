package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceBubble;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PlaybackVideoPreviewStreamData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.livereplay.ECVideoPlaybackController;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.window.manager.SeaPdpLivePlaybackWindowManager$lifecycleObserver$1;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.player.ISeaPdpMediaControlService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vpT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1757250vpT implements InterfaceC1164530gPT {
    public final Context LL;
    public final InterfaceC665370Q7z LLILLJJLI;
    public final Fragment LLILLL;
    public InterfaceC1757550vpx LLILZ;
    public AbstractC1757620vq4 LLILZIL;
    public FrameLayout LLILZLL;
    public EntranceBubble LLIZ;
    public ECVideoPlaybackController LLIZLLLIL;
    public boolean LLJILJILJ;
    public final C1757280vpW LLJJI;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1275));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1274));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1272));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1273));
    public final C1757240vpS LLJILLL = new C1757240vpS(this);
    public final C1757260vpU LLJJ = new InterfaceC1482530ogN() { // from class: X.0vpU
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
        public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPlaying(String str, C1480430ocz c1480430ocz) {
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
        public final /* synthetic */ void tc(String str, JSONObject jSONObject) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void uv(JSONObject jSONObject) {
        }

        @Override // X.InterfaceC1482530ogN
        public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
            PlaybackVideoPreviewStreamData playbackVideoPreviewStreamData;
            Integer num;
            EntranceBubble entranceBubble = this.LL.LLIZ;
            if (entranceBubble != null && (playbackVideoPreviewStreamData = entranceBubble.previewStreamData) != null) {
                Integer num2 = playbackVideoPreviewStreamData.width;
                if (num2 != null && num2.intValue() >= 0 && (num = playbackVideoPreviewStreamData.height) != null && num.intValue() >= 0) {
                    Pair pair = new Pair(playbackVideoPreviewStreamData.width, playbackVideoPreviewStreamData.height);
                    this.LL.LJI(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue());
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("PDP_LivePlayback getVideoSize failed ");
                    sbLIZ.append(playbackVideoPreviewStreamData);
                    C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            AbstractC1757620vq4 abstractC1757620vq4 = this.LL.LLILZIL;
            if (abstractC1757620vq4 != null) {
                abstractC1757620vq4.LJIILJJIL();
            }
        }

        @Override // X.InterfaceC1482530ogN
        public final void onResumePlay(String str, C1480430ocz c1480430ocz) {
            AbstractC1757620vq4 abstractC1757620vq4 = this.LL.LLILZIL;
            if (abstractC1757620vq4 != null) {
                abstractC1757620vq4.LJIILJJIL();
            }
        }

        @Override // X.InterfaceC1482530ogN
        public final void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
            AbstractC1757620vq4 abstractC1757620vq4 = this.LL.LLILZIL;
            if (abstractC1757620vq4 != null) {
                abstractC1757620vq4.LJIILL();
            }
        }

        @Override // X.InterfaceC1482530ogN
        public final void onVideoSizeChanged(String str, int i, int i2) {
            this.LL.LJI(i, i2);
        }
    };

    public final ISeaPdpMediaControlService LIZIZ() {
        return (ISeaPdpMediaControlService) this.LLJILJIL.getValue();
    }

    public final boolean LIZLLL() {
        AbstractC1757620vq4 abstractC1757620vq4 = this.LLILZIL;
        return (abstractC1757620vq4 != null ? abstractC1757620vq4.getWindowType() : null) == EnumC1757300vpY.MICRO;
    }

    public final boolean LJ() {
        AbstractC1757620vq4 abstractC1757620vq4 = this.LLILZIL;
        return (abstractC1757620vq4 != null ? abstractC1757620vq4.getWindowType() : null) == EnumC1757300vpY.MINI;
    }

    public final void LJFF() {
        ISeaPdpCommunicationService iSeaPdpCommunicationService = (ISeaPdpCommunicationService) this.LLJIJIL.getValue();
        if (iSeaPdpCommunicationService != null) {
            iSeaPdpCommunicationService.U0(this.LLILLJJLI, "sea_pdp_mini_window_manually_close");
        }
        AnonymousClass0378.LIZ().LIZJ("small_window_status_change", this);
        this.LLIZ = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        ECVideoPlaybackController eCVideoPlaybackController = this.LLIZLLLIL;
        if (eCVideoPlaybackController != null) {
            eCVideoPlaybackController.LJFF();
        }
        this.LLIZLLLIL = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static View LIZJ(Context context, EntranceBubble entranceBubble) {
        Image icon;
        int i;
        final Function0 function0 = null;
        Object[] objArr = 0;
        View viewSd = C786410Ut5.Sd(R.layout.awm, C786410Ut5.ne(context), null);
        SmartImageView smartImageView = (SmartImageView) viewSd.findViewById(R.id.lvm);
        if (smartImageView != null) {
            Icon icon2 = entranceBubble.icon;
            if (icon2 != null) {
                icon = icon2.getIcon();
            } else {
                icon = null;
            }
            EnumC1338240kve enumC1338240kve = EnumC1338240kve.CENTER_CROP;
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(icon);
            ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
            int i2 = layoutParams.height;
            if (i2 > 0 && (i = layoutParams.width) > 0) {
                c1331670kl3LIZLLL.LJIIIIZZ = i;
                c1331670kl3LIZLLL.LJIIIZ = i2;
            }
            c1331670kl3LIZLLL.LIZLLL = true;
            c1331670kl3LIZLLL.LJJLIIIJJI = true;
            c1331670kl3LIZLLL.LJJ = enumC1338240kve;
            c1331670kl3LIZLLL.LJJ(smartImageView);
            final Object[] objArr2 = objArr == true ? 1 : 0;
            c1331670kl3LIZLLL.LJIIJ(new InterfaceC427850Gq7() { // from class: X.0DK8
                @Override // X.InterfaceC427850Gq7
                public final void A3(Uri uri, C428600GrK c428600GrK) {
                }

                @Override // X.InterfaceC427850Gq7
                public final void Bh(Uri uri, View view) {
                }

                @Override // X.InterfaceC427850Gq7
                public final void e1(Uri uri) {
                }

                @Override // X.InterfaceC427850Gq7
                public final void lg(Uri uri, Throwable th) {
                }

                @Override // X.InterfaceC427850Gq7
                public final void cm(Uri uri, View view, Throwable th) {
                    Function1<Throwable, Unit> function1 = objArr2;
                    if (function1 != null) {
                        function1.invoke(th);
                    }
                }

                @Override // X.InterfaceC427850Gq7
                public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                    Function0<Unit> function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                }
            });
        }
        TextView textView = (TextView) viewSd.findViewById(R.id.tv_text);
        if (textView != null) {
            C03C8.LIZJ(textView, entranceBubble.title, "pdp_entrance_bubble", null);
        }
        return viewSd;
    }

    public final void LJI(int i, int i2) {
        EnumC1757300vpY windowType;
        AbstractC1757620vq4 abstractC1757620vq4;
        AbstractC1757620vq4 abstractC1757620vq42 = this.LLILZIL;
        if (abstractC1757620vq42 != null && (windowType = abstractC1757620vq42.getWindowType()) != null) {
            int i3 = C1757290vpX.LIZ[windowType.ordinal()];
            if (i3 != 1) {
                if (i3 == 2 && (abstractC1757620vq4 = this.LLILZIL) != null) {
                    abstractC1757620vq4.LIZLLL(i, i2);
                    return;
                }
                return;
            }
            ECVideoPlaybackController eCVideoPlaybackController = this.LLIZLLLIL;
            if (eCVideoPlaybackController == null) {
                return;
            }
            FrameLayout frameLayout = eCVideoPlaybackController.LLJILJIL.LL.LL;
            if (frameLayout.getChildCount() == 0) {
                return;
            }
            int childCount = frameLayout.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = frameLayout.getChildAt(i4);
                if (childAt instanceof TextureView) {
                    C425050Glb.LJ(frameLayout.getContext(), childAt, i, i2, 3);
                    return;
                }
            }
        }
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        Object obj;
        if (Intrinsics.LJFF(str, "small_window_status_change") && this.LLILZIL != null) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                if (JSONObjectProtectorUtils.getBoolean(jSONObject, "manual_close")) {
                    this.LLJILLL.LIZJ();
                }
                C189200o6.m2constructorimpl(jSONObject);
                obj = jSONObject;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                obj = c098200Yq;
            }
            C189200o6.m1boximpl(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0vpW] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0vpU] */
    public C1757250vpT(Context context, InterfaceC665370Q7z interfaceC665370Q7z, SeaPdpFragment seaPdpFragment) {
        this.LL = context;
        this.LLILLJJLI = interfaceC665370Q7z;
        this.LLILLL = seaPdpFragment;
        SeaPdpLivePlaybackWindowManager$lifecycleObserver$1 seaPdpLivePlaybackWindowManager$lifecycleObserver$1 = new SeaPdpLivePlaybackWindowManager$lifecycleObserver$1(this);
        this.LLJJI = new InterfaceC1508310pLx() { // from class: X.0vpW
            @Override // X.InterfaceC1508310pLx
            public final boolean LLLLZLLIL() {
                InterfaceC1484830ok5 interfaceC1484830ok5;
                InterfaceC1483420oho interfaceC1483420ohoLJIIIZ;
                ECVideoPlaybackController eCVideoPlaybackController = this.LL.LLIZLLLIL;
                return (eCVideoPlaybackController == null || (interfaceC1484830ok5 = eCVideoPlaybackController.LLIZLLLIL) == null || (interfaceC1483420ohoLJIIIZ = interfaceC1484830ok5.LJIIIZ()) == null || !interfaceC1483420ohoLJIIIZ.isMute()) ? false : true;
            }

            @Override // X.InterfaceC1508310pLx
            public final void w4(boolean z) {
                AbstractC1757620vq4 abstractC1757620vq4 = this.LL.LLILZIL;
                if (abstractC1757620vq4 != null) {
                    abstractC1757620vq4.LJIIL(z);
                }
                ECVideoPlaybackController eCVideoPlaybackController = this.LL.LLIZLLLIL;
                if (eCVideoPlaybackController != null) {
                    eCVideoPlaybackController.LIZLLL(z);
                }
            }
        };
        seaPdpFragment.getLifecycle().addObserver(seaPdpLivePlaybackWindowManager$lifecycleObserver$1);
    }

    public static void LIZ(AbstractC1757620vq4 abstractC1757620vq4, boolean z, boolean z2) {
        int iLIZ;
        int iLIZ2;
        if (abstractC1757620vq4 == null) {
            return;
        }
        int iLIZ3 = C679280Qkg.LIZ(16);
        if (z) {
            iLIZ = C679280Qkg.LIZ(64);
        } else {
            iLIZ = iLIZ3;
        }
        if (!z2) {
            iLIZ2 = iLIZ3;
        } else {
            iLIZ2 = C679280Qkg.LIZ(72) + iLIZ3;
        }
        C1757640vq6 c1757640vq6 = abstractC1757620vq4.LLJILJIL;
        float f = iLIZ3;
        c1757640vq6.LJI = f;
        c1757640vq6.LJII = iLIZ;
        c1757640vq6.LJIIIIZZ = f;
        c1757640vq6.LJIIIZ = iLIZ2;
    }
}
