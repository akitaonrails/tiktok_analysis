package X;

import X.C1845250y7P;
import Y.ACListenerS161S0100000_27;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.tako.otherpage.video.ui.TakoAutoPlayVideo$viewLifecycleObserver$1;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0y7P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1845250y7P extends FrameLayout {
    public InterfaceC1484830ok5 LL;
    public final FrameLayout LLILLJJLI;
    public final SmartImageView LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public final View LLILZLL;
    public final View LLIZ;
    public final TuxIconView LLIZLLLIL;
    public ViewGroup LLJ;
    public final ViewGroup LLJI;
    public C1845270y7R LLJIJIL;
    public String LLJILJIL;
    public C1845260y7Q LLJILJILJ;
    public Function1<? super C0DS7, Unit> LLJILLL;
    public Function1<? super Boolean, Unit> LLJJ;
    public Function1<? super Boolean, Unit> LLJJI;
    public final C01GW LLJJIII;
    public final C1845320y7W LLJJIJI;
    public boolean LLJJIJIIJIL;
    public Lifecycle LLJJIJIL;
    public final TakoAutoPlayVideo$viewLifecycleObserver$1 LLJJJ;

    public final void LIZJ() {
        SmartImageView smartImageView = this.LLILLL;
        if (smartImageView != null) {
            C786410Ut5.LLFF(8, smartImageView);
        }
        Function1<? super C0DS7, Unit> function1 = this.LLJILLL;
        if (function1 != null) {
            Long lValueOf = Long.valueOf(System.currentTimeMillis());
            C1845270y7R c1845270y7R = this.LLJIJIL;
            function1.invoke(new C0DS7(0, 0, lValueOf, c1845270y7R != null ? c1845270y7R.videoUrl : null, 2));
        }
    }

    public final void LIZLLL() {
        if (this.LL != null) {
            return;
        }
        InterfaceC1484530ojb interfaceC1484530ojbLIZ = C582130MsN.LIZ();
        C1478410oZj c1478410oZj = new C1478410oZj();
        c1478410oZj.LIZIZ = true;
        InterfaceC1484830ok5 interfaceC1484830ok5LIZJ = interfaceC1484530ojbLIZ.LIZJ(c1478410oZj);
        this.LL = interfaceC1484830ok5LIZJ;
        InterfaceC1483820oiS interfaceC1483820oiS = new InterfaceC1483820oiS() { // from class: X.0oqD
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

            @Override // X.InterfaceC1483820oiS
            public final /* synthetic */ void pe() {
            }

            @Override // X.InterfaceC1483820oiS
            public final HashMap getParams() {
                return new HashMap();
            }

            @Override // X.InterfaceC1483820oiS
            public final FrameLayout getPlayViewContainer() {
                return this.LL.LLILLJJLI;
            }
        };
        if (interfaceC1484830ok5LIZJ != null) {
            interfaceC1484830ok5LIZJ.LIZJ(interfaceC1483820oiS);
        }
        InterfaceC1482530ogN interfaceC1482530ogN = new InterfaceC1482530ogN() { // from class: X.0y7V
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
            public final void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
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
            public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayPrepare(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayPrepared(String str) {
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
                if (this.LL.LIZIZ(str)) {
                    C1845250y7P c1845250y7P = this.LL;
                    c1845250y7P.LLILZIL = false;
                    c1845250y7P.LJIIIZ();
                    C1845250y7P c1845250y7P2 = this.LL;
                    if (c1845250y7P2.LLJJIJIIJIL) {
                        c1845250y7P2.LLJJIJI.LIZJ();
                    }
                }
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayCompleted(String str, int i) {
                if (this.LL.LIZIZ(str)) {
                    C1845250y7P c1845250y7P = this.LL;
                    if (c1845250y7P.LLJJIJIIJIL) {
                        c1845250y7P.LLJJIJI.LIZIZ();
                    }
                }
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlaying(String str, C1480430ocz c1480430ocz) {
                String str2;
                if (this.LL.LIZIZ(str)) {
                    this.LL.LIZJ();
                    C1845250y7P c1845250y7P = this.LL;
                    c1845250y7P.LLILZIL = true;
                    c1845250y7P.LJIIIZ();
                    C1845250y7P c1845250y7P2 = this.LL;
                    if (c1845250y7P2.LLJJIJIIJIL) {
                        c1845250y7P2.LLJJIJI.LIZLLL();
                    }
                    C1845250y7P c1845250y7P3 = this.LL;
                    C1845320y7W c1845320y7W = c1845250y7P3.LLJJIJI;
                    boolean z = c1845250y7P3.LLILZ;
                    C1845340y7Y c1845340y7YLIZ = c1845320y7W.LIZ();
                    if (c1845340y7YLIZ != null) {
                        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                        String str3 = c1845340y7YLIZ.LIZ;
                        String str4 = c1845340y7YLIZ.LIZIZ;
                        String str5 = c1845340y7YLIZ.LIZJ;
                        if (str5 == null) {
                            str5 = "";
                        }
                        String str6 = c1845340y7YLIZ.LIZLLL;
                        String str7 = c1845340y7YLIZ.LJFF;
                        String str8 = c1845340y7YLIZ.LJI;
                        String str9 = c1845340y7YLIZ.LJII;
                        if (z) {
                            str2 = "off";
                        } else {
                            str2 = "on";
                        }
                        C1862330yYx.LLFF(c1862330yYx, str3, str4, str5, str6, c1845340y7YLIZ.LJ, str7, str8, str9, str2, null, null, null, 7680);
                    }
                }
            }

            @Override // X.InterfaceC1482530ogN
            public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) throws JSONException {
                if (this.LL.LIZIZ(str)) {
                    C1845330y7X takoVideoPerfTracker = this.LL.getTakoVideoPerfTracker();
                    takoVideoPerfTracker.LIZIZ.LIZIZ = System.currentTimeMillis();
                    takoVideoPerfTracker.LIZ();
                    this.LL.LIZJ();
                }
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) throws JSONException {
                Integer numValueOf;
                if (this.LL.LIZIZ(str)) {
                    C1845250y7P c1845250y7P = this.LL;
                    int i = 0;
                    c1845250y7P.LLILZIL = false;
                    C1845330y7X takoVideoPerfTracker = c1845250y7P.getTakoVideoPerfTracker();
                    EnumC048400Fm enumC048400Fm = EnumC048400Fm.PLAY_FAILED;
                    if (c1481290oeN != null) {
                        i = c1481290oeN.LJ;
                    }
                    C1845350y7Z c1845350y7Z = takoVideoPerfTracker.LIZIZ;
                    c1845350y7Z.LIZLLL = enumC048400Fm;
                    c1845350y7Z.LJ = i;
                    takoVideoPerfTracker.LIZ();
                    C1845250y7P c1845250y7P2 = this.LL;
                    if (c1481290oeN != null) {
                        numValueOf = Integer.valueOf(c1481290oeN.LJ);
                    } else {
                        numValueOf = null;
                    }
                    c1845250y7P2.LJIIIIZZ(2, numValueOf);
                }
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayProgressChange(String str, long j, long j2) {
                if (!this.LL.LIZIZ(str) || j2 <= 0) {
                    return;
                }
                this.LL.getClass();
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
                if (this.LL.LIZIZ(str)) {
                    C1845250y7P c1845250y7P = this.LL;
                    c1845250y7P.LLILZIL = false;
                    c1845250y7P.LJIIIZ();
                }
            }
        };
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LL;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.LJIIZILJ(interfaceC1482530ogN);
        }
        InterfaceC1484830ok5 interfaceC1484830ok52 = this.LL;
        if (interfaceC1484830ok52 != null) {
            interfaceC1484830ok52.LJJLIIIJL(new InterfaceC585470Mxl() { // from class: X.0oqC
                @Override // X.InterfaceC585470Mxl
                public final boolean LIZ() {
                    return true;
                }

                @Override // X.InterfaceC585470Mxl
                public final boolean LIZIZ() {
                    return true;
                }

                @Override // X.InterfaceC585470Mxl
                public final boolean LIZJ() {
                    return true;
                }

                @Override // X.InterfaceC585470Mxl
                public final /* synthetic */ HashMap LJ(String str) {
                    return null;
                }

                @Override // X.InterfaceC585470Mxl
                public final /* synthetic */ HashMap LJFF(String str) {
                    return null;
                }

                @Override // X.InterfaceC585470Mxl
                public final boolean LJI() {
                    return true;
                }

                @Override // X.InterfaceC585470Mxl
                public final boolean LJII() {
                    return true;
                }

                @Override // X.InterfaceC585470Mxl
                public final boolean LJIIIIZZ() {
                    return true;
                }

                @Override // X.InterfaceC585470Mxl
                public final boolean LJIIIZ() {
                    return true;
                }

                @Override // X.InterfaceC585470Mxl
                public final /* synthetic */ HashMap LJIIJ(String str, boolean z) {
                    return null;
                }

                @Override // X.InterfaceC585470Mxl
                public final /* synthetic */ HashMap LJIIL(String str, JSONObject jSONObject) {
                    return null;
                }

                @Override // X.InterfaceC585470Mxl
                public final boolean LJIILIIL() {
                    return true;
                }

                @Override // X.InterfaceC585470Mxl
                public final boolean LJIILJJIL() {
                    return true;
                }

                @Override // X.InterfaceC585470Mxl
                public final /* synthetic */ HashMap LJIILL(String str) {
                    return null;
                }

                @Override // X.InterfaceC585470Mxl
                public final boolean LJIILLIIL() {
                    return true;
                }

                @Override // X.InterfaceC585470Mxl
                public final /* synthetic */ HashMap LJIIZILJ(String str, boolean z) {
                    return null;
                }

                @Override // X.InterfaceC585470Mxl
                public final EnumC585580Mxw LIZLLL() {
                    return EnumC585580Mxw.DEFAULT;
                }

                @Override // X.InterfaceC585470Mxl
                public final EnumC1987207qQ LJIIJJI() {
                    return EnumC1987207qQ.VIDEO;
                }
            });
        }
    }

    public final void LJ() {
        C1845270y7R c1845270y7R;
        InterfaceC1483850oiV playState;
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LL;
        if (interfaceC1484830ok5 == null) {
            return;
        }
        InterfaceC1483850oiV playState2 = interfaceC1484830ok5.getPlayState();
        if (playState2 == null || !playState2.isPaused()) {
            InterfaceC1484830ok5 interfaceC1484830ok52 = this.LL;
            if (interfaceC1484830ok52 != null && (playState = interfaceC1484830ok52.getPlayState()) != null && playState.isPlaying()) {
                interfaceC1484830ok5.pause();
                return;
            }
            String str = this.LLJILJIL;
            if ((str == null && ((c1845270y7R = this.LLJIJIL) == null || (str = c1845270y7R.vid) == null)) || str.length() == 0) {
                interfaceC1484830ok5.stop();
            } else {
                interfaceC1484830ok5.stop(str);
            }
        }
    }

    public final void LJFF() {
        C1845270y7R c1845270y7R = this.LLJIJIL;
        if (c1845270y7R == null) {
            return;
        }
        if (C1004300cF2.LIZIZ(c1845270y7R.expireTime)) {
            LJIIIIZZ(1, null);
            return;
        }
        LIZLLL();
        C1845270y7R c1845270y7R2 = this.LLJIJIL;
        if (c1845270y7R2 != null) {
            this.LLJILJIL = c1845270y7R2.vid;
            C1845320y7W c1845320y7W = this.LLJJIJI;
            Long l = c1845270y7R2.duration;
            long jLongValue = l != null ? l.longValue() : 0L;
            Map<String, String> mapLJ = c1845270y7R2.params;
            if (mapLJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
            c1845320y7W.LIZLLL = mapLJ;
            c1845320y7W.LIZIZ = jLongValue;
            c1845320y7W.LIZJ = null;
            c1845320y7W.LIZ = "auto";
            this.LLJJIJIIJIL = c1845270y7R2.trackVideoPlayStatus;
            getTakoVideoPerfTracker().LIZIZ();
            C1845330y7X takoVideoPerfTracker = getTakoVideoPerfTracker();
            String str = c1845270y7R2.videoUrl;
            String str2 = c1845270y7R2.vid;
            takoVideoPerfTracker.LIZJ = false;
            C1845350y7Z c1845350y7Z = takoVideoPerfTracker.LIZIZ;
            c1845350y7Z.LIZ = System.currentTimeMillis();
            if (str != null) {
                c1845350y7Z.LJFF = str;
            }
            if (str2 != null) {
                c1845350y7Z.LJI = str2;
            }
            C1845330y7X takoVideoPerfTracker2 = getTakoVideoPerfTracker();
            Long l2 = c1845270y7R2.duration;
            takoVideoPerfTracker2.getClass();
            if (l2 != null) {
                l2.longValue();
                takoVideoPerfTracker2.LIZIZ.LIZJ = l2.longValue();
            }
            C1482580ogS c1482580ogS = new C1482580ogS();
            c1482580ogS.LIZ = c1845270y7R2.vid;
            C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
            c1058540deW.LIZLLL = Collections.singletonList(c1845270y7R2.videoUrl);
            C1482570ogR c1482570ogRLIZ = c1058540deW.LIZ().LIZ();
            boolean z = this.LLILZ;
            C1479570obb c1479570obb = c1482570ogRLIZ.LIZIZ;
            c1479570obb.LJJ = z;
            String str3 = c1845270y7R2.businessTag;
            if (str3 == null) {
                str3 = "Tako";
            }
            c1479570obb.LJIILL = str3;
            C1482580ogS c1482580ogS2 = c1482570ogRLIZ.LIZ;
            c1482580ogS2.LJ = c1482570ogRLIZ;
            C1482560ogQ c1482560ogQLIZ = new C1484680ojq(c1482580ogS2).LIZ();
            InterfaceC1484830ok5 interfaceC1484830ok5 = this.LL;
            if (interfaceC1484830ok5 != null) {
                interfaceC1484830ok5.LJ(c1482560ogQLIZ);
            }
        }
    }

    public final void LJI() {
        Lifecycle lifecycle = this.LLJJIJIL;
        if (lifecycle != null) {
            lifecycle.removeObserver(this.LLJJJ);
        }
        this.LLJJIJIL = null;
        View view = this.LLILZLL;
        if (view != null) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != this.LLJI && viewGroup != null) {
                C786410Ut5.LJJJLZIJ(view, viewGroup);
            }
            this.LLJ = null;
        }
        C1845320y7W c1845320y7W = this.LLJJIJI;
        c1845320y7W.LIZIZ = 0L;
        c1845320y7W.LIZJ = null;
        c1845320y7W.LIZLLL = C2097608Jq.LJ();
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LL;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.release();
        }
        this.LL = null;
        this.LLJILJIL = null;
        this.LLJILLL = null;
    }

    public final void LJII() {
        InterfaceC1483850oiV playState;
        C1845270y7R c1845270y7R = this.LLJIJIL;
        if (c1845270y7R == null) {
            return;
        }
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LL;
        if (interfaceC1484830ok5 == null) {
            LJFF();
            return;
        }
        InterfaceC1483850oiV playState2 = interfaceC1484830ok5.getPlayState();
        if (playState2 == null || !playState2.isPlaying()) {
            InterfaceC1484830ok5 interfaceC1484830ok52 = this.LL;
            if (interfaceC1484830ok52 == null || (playState = interfaceC1484830ok52.getPlayState()) == null || !playState.isPaused()) {
                LJFF();
                return;
            }
            String str = this.LLJILJIL;
            if (str == null || !Intrinsics.LJFF(str, c1845270y7R.vid)) {
                LJFF();
            } else {
                interfaceC1484830ok5.resume();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ() {
        /*
            r6 = this;
            com.bytedance.tux.icon.TuxIconView r3 = r6.LLIZLLLIL
            if (r3 != 0) goto L5
            return
        L5:
            X.0y7Q r5 = r6.LLJILJILJ
            boolean r0 = r6.LLILZIL
            r1 = 1
            if (r0 != r1) goto L80
            boolean r0 = r6.LLILZ
            if (r0 != r1) goto L7c
            r0 = 2130774714(0x7f010aba, float:1.715261E38)
        L13:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L17:
            if (r0 == 0) goto L8c
            int r1 = r0.intValue()
            android.view.View r0 = r6.LLILZLL
            if (r0 == 0) goto L24
            X.C0DSB.LIZJ(r0)
        L24:
            X.0GdJ r4 = new X.0GdJ
            r4.<init>()
            r4.LIZ = r1
            int r0 = r5.LJ
            if (r0 == 0) goto L61
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L33:
            r4.LIZLLL = r0
            android.util.Size r0 = r5.LIZ
            int r0 = r0.getWidth()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            r4.LIZIZ = r0
            android.util.Size r0 = r5.LIZ
            int r0 = r0.getHeight()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            r4.LIZJ = r0
            r3.setTuxIcon(r4)
        L60:
            return
        L61:
            android.content.Context r0 = r6.getContext()
            r2 = 0
            X.0lX0 r1 = X.C1385040m98.LIZ(r0, r2)
            r0 = 2131100592(0x7f0603b0, float:1.781357E38)
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r1)
            if (r0 == 0) goto L77
            int r2 = r0.intValue()
        L77:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L33
        L7c:
            r0 = 2130774710(0x7f010ab6, float:1.7152603E38)
            goto L13
        L80:
            boolean r0 = r5.LJI
            if (r0 != r1) goto L8c
            r0 = 2130774487(0x7f0109d7, float:1.715215E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L17
        L8c:
            android.view.View r0 = r6.LLILZLL
            if (r0 == 0) goto L60
            X.C0DSB.LIZIZ(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1845250y7P.LJIIIZ():void");
    }

    public final C1845330y7X getTakoVideoPerfTracker() {
        return (C1845330y7X) this.LLJJIII.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Lifecycle lifecycle;
        Lifecycle lifecycle2;
        super.onAttachedToWindow();
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null || (lifecycle2 = this.LLJJIJIL) == lifecycle) {
            return;
        }
        if (lifecycle2 != null) {
            lifecycle2.removeObserver(this.LLJJJ);
        }
        this.LLJJIJIL = lifecycle;
        lifecycle.addObserver(this.LLJJJ);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LJ();
    }

    public final void LIZ(C1845260y7Q c1845260y7Q) {
        FrameLayout.LayoutParams layoutParams;
        int i;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        View view = this.LLILZLL;
        View view2 = this.LLIZ;
        if (view != null && view2 != null) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                if (this.LLJ != null) {
                    layoutParams.gravity = 17;
                    layoutParams.setMarginStart(0);
                    layoutParams.setMarginEnd(0);
                    layoutParams.topMargin = 0;
                    layoutParams.bottomMargin = 0;
                } else {
                    int i2 = C1761220vvs.LIZ[c1845260y7Q.LIZIZ.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 == 4) {
                                    i = 8388693;
                                } else {
                                    throw new C1954807lC();
                                }
                            } else {
                                i = 8388691;
                            }
                        } else {
                            i = 8388661;
                        }
                    } else {
                        i = 8388659;
                    }
                    layoutParams.gravity = i;
                    List<Integer> list = c1845260y7Q.LIZJ;
                    if (list.size() > 0) {
                        obj = ListProtector.get(list, 0);
                    } else {
                        obj = 0;
                    }
                    layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) obj)));
                    if (1 < list.size()) {
                        obj2 = ListProtector.get(list, 1);
                    } else {
                        obj2 = 0;
                    }
                    layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) obj2));
                    if (2 < list.size()) {
                        obj3 = ListProtector.get(list, 2);
                    } else {
                        obj3 = 0;
                    }
                    layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) obj3)));
                    if (3 < list.size()) {
                        obj4 = ListProtector.get(list, 3);
                    } else {
                        obj4 = 0;
                    }
                    layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) obj4));
                }
                C786410Ut5.W5(view, layoutParams);
                List<Integer> list2 = c1845260y7Q.LIZLLL;
                if (list2.size() > 0) {
                    obj5 = ListProtector.get(list2, 0);
                } else {
                    obj5 = 0;
                }
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) obj5));
                if (1 < list2.size()) {
                    obj6 = ListProtector.get(list2, 1);
                } else {
                    obj6 = 0;
                }
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) obj6));
                if (2 < list2.size()) {
                    obj7 = ListProtector.get(list2, 2);
                } else {
                    obj7 = 0;
                }
                int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) obj7));
                if (3 < list2.size()) {
                    obj8 = ListProtector.get(list2, 3);
                } else {
                    obj8 = 0;
                }
                view.setPadding(iLIZIZ, iLIZIZ2, iLIZIZ3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) obj8)));
                Boolean boolValueOf = Boolean.valueOf(c1845260y7Q.LJFF);
                if (boolValueOf.booleanValue()) {
                    boolValueOf.booleanValue();
                    C12P5 c12p5 = new C12P5();
                    c12p5.LIZJ = -16777216;
                    c12p5.LJ = Float.valueOf(0.2f);
                    c12p5.LJFF = Float.valueOf(0.0f);
                    c12p5.LJII = EnumC197015126j.LINEAR;
                    c12p5.LJI = C12KQ.RADIAL;
                    view2.setBackground(c12p5.LIZ(getContext()));
                } else {
                    view2.setBackground(null);
                    C786410Ut5.W5(view2, new FrameLayout.LayoutParams(-2, -2));
                }
                if (c1845260y7Q.LJI) {
                    C0DSB.LIZJ(view);
                } else {
                    C0DSB.LIZIZ(view);
                }
            }
        }
        LJIIIZ();
    }

    public final boolean LIZIZ(String str) {
        String str2;
        C1845270y7R c1845270y7R = this.LLJIJIL;
        if (c1845270y7R != null) {
            str2 = c1845270y7R.vid;
        } else {
            str2 = null;
        }
        return TextUtils.equals(str2, str);
    }

    public final void setControlHost(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        View view = this.LLILZLL;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) parent;
        } else {
            viewGroup2 = null;
        }
        if (viewGroup2 == viewGroup) {
            return;
        }
        if (viewGroup2 != null) {
            C786410Ut5.LJJJLZIJ(view, viewGroup2);
        }
        viewGroup.addView(view, new FrameLayout.LayoutParams(-2, -2, 17));
        this.LLJ = viewGroup;
        LIZ(this.LLJILJILJ);
    }

    public final void setCoverLoadedCallback(Function1<? super Boolean, Unit> function1) {
        this.LLJJ = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.ArrayList] */
    public final void setData(C1845270y7R c1845270y7R) {
        ?? arrayList;
        int width;
        float f;
        Size size;
        Size size2;
        ColorDrawable colorDrawable;
        String str;
        List<String> list;
        int width2;
        int height;
        Size size3;
        Size size4;
        this.LLJIJIL = c1845270y7R;
        Size size5 = c1845270y7R.containerSize;
        if (size5 != null) {
            C12ES.LJIIZILJ(size5.getWidth(), size5.getHeight(), this);
            SmartImageView smartImageView = this.LLILLL;
            int height2 = 0;
            if (smartImageView != null) {
                ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
                C1845270y7R c1845270y7R2 = this.LLJIJIL;
                if (c1845270y7R2 != null && (size4 = c1845270y7R2.containerSize) != null) {
                    width2 = size4.getWidth();
                } else {
                    width2 = 0;
                }
                layoutParams.width = width2;
                C1845270y7R c1845270y7R3 = this.LLJIJIL;
                if (c1845270y7R3 != null && (size3 = c1845270y7R3.containerSize) != null) {
                    height = size3.getHeight();
                } else {
                    height = 0;
                }
                layoutParams.height = height;
                C786410Ut5.G6(smartImageView, layoutParams);
            }
            C1845270y7R c1845270y7R4 = this.LLJIJIL;
            if (c1845270y7R4 != null && (list = c1845270y7R4.urlList) != null) {
                arrayList = new ArrayList();
                for (String str2 : list) {
                    String str3 = str2;
                    if (str3 != null && !a0.LJJJIL(str3)) {
                        arrayList.add(str2);
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            if (!arrayList.isEmpty()) {
                SmartImageView smartImageView2 = this.LLILLL;
                if (smartImageView2 != null) {
                    C786410Ut5.LLFF(0, smartImageView2);
                }
                C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(arrayList));
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zn, getContext());
                if (numLIZJ != null) {
                    colorDrawable = new ColorDrawable(numLIZJ.intValue());
                } else {
                    colorDrawable = null;
                }
                c1331670kl3LJIIJ.LJJIIZI(colorDrawable);
                C1845270y7R c1845270y7R5 = this.LLJIJIL;
                if (c1845270y7R5 != null) {
                    str = c1845270y7R5.businessTag;
                } else {
                    str = null;
                }
                c1331670kl3LJIIJ.LJJJIL = new C1338340kvo(this.LLILLL, str, (String) C13LP.LJJJLL(arrayList), C2097608Jq.LJ());
                c1331670kl3LJIIJ.LJJ(this.LLILLL);
                c1331670kl3LJIIJ.LJIIL(new C1864440ycM(this, 3));
            }
            Integer num = c1845270y7R.width;
            Integer num2 = c1845270y7R.height;
            if (num != null && num2 != null && num.intValue() > 0 && num2.intValue() > 0) {
                C1845270y7R c1845270y7R6 = this.LLJIJIL;
                if (c1845270y7R6 != null && (size2 = c1845270y7R6.containerSize) != null) {
                    width = size2.getWidth();
                } else {
                    width = 0;
                }
                C1845270y7R c1845270y7R7 = this.LLJIJIL;
                if (c1845270y7R7 != null && (size = c1845270y7R7.containerSize) != null) {
                    height2 = size.getHeight();
                }
                if (width > 0 && height2 > 0) {
                    f = width / height2;
                } else {
                    f = 0.0f;
                }
                float fIntValue = num.intValue() / num2.intValue();
                C118300cf c118300cf = new C118300cf();
                C118300cf c118300cf2 = new C118300cf();
                if (fIntValue >= f) {
                    c118300cf2.element = height2;
                    c118300cf.element = (int) ((height2 * num.intValue()) / num2.intValue());
                } else {
                    c118300cf.element = width;
                    c118300cf2.element = (int) ((width * num2.intValue()) / num.intValue());
                }
                C12ES.LJIIZILJ(c118300cf.element, c118300cf2.element, this.LLILLJJLI);
            }
            if (C1004300cF2.LIZIZ(c1845270y7R.expireTime)) {
                LJIIIIZZ(1, null);
                return;
            } else {
                LIZLLL();
                return;
            }
        }
        throw new IllegalArgumentException("containerSize must not be null");
    }

    public final void setMuteClickCallback(Function1<? super Boolean, Unit> function1) {
        this.LLJJI = function1;
    }

    public final void setMuteState(boolean z) {
        InterfaceC1488100opM interfaceC1488100opMLJIILIIL;
        InterfaceC1488100opM interfaceC1488100opMLJIILIIL2;
        this.LLILZ = z;
        if (z) {
            InterfaceC1484830ok5 interfaceC1484830ok5 = this.LL;
            if (interfaceC1484830ok5 != null && (interfaceC1488100opMLJIILIIL2 = interfaceC1484830ok5.LJIILIIL()) != null) {
                interfaceC1488100opMLJIILIIL2.mute();
            }
        } else {
            InterfaceC1484830ok5 interfaceC1484830ok52 = this.LL;
            if (interfaceC1484830ok52 != null && (interfaceC1488100opMLJIILIIL = interfaceC1484830ok52.LJIILIIL()) != null) {
                interfaceC1488100opMLJIILIIL.unmute();
            }
        }
        LJIIIZ();
    }

    public final void setPlayResultCallback(Function1<? super C0DS7, Unit> function1) {
        this.LLJILLL = function1;
    }

    public final void setUIConfig(C1845260y7Q c1845260y7Q) {
        C1845260y7Q c1845260y7Q2 = c1845260y7Q;
        if (c1845260y7Q2 == null) {
            c1845260y7Q2 = new C1845260y7Q(null, null, null, null, 127);
        }
        this.LLJILJILJ = c1845260y7Q2;
        LIZ(this.LLJILJILJ);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.ss.android.ugc.aweme.tako.otherpage.video.ui.TakoAutoPlayVideo$viewLifecycleObserver$1] */
    public C1845250y7P(Context context, AttributeSet attributeSet) {
        ViewParent parent;
        super(context, attributeSet, 0);
        this.LLJILJILJ = new C1845260y7Q(null, null, null, null, 127);
        this.LLJJIII = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1418));
        this.LLJJIJI = new C1845320y7W();
        this.LLJJJ = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.tako.otherpage.video.ui.TakoAutoPlayVideo$viewLifecycleObserver$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    lifecycleOwner.getLifecycle().removeObserver(this);
                    C1845250y7P c1845250y7P = this.LL;
                    c1845250y7P.LLJJIJIL = null;
                    c1845250y7P.LJI();
                }
            }
        };
        C786410Ut5.Sd(R.layout.fr_, C786410Ut5.ne(context), this);
        this.LLILLJJLI = (FrameLayout) findViewById(R.id.video_player_container);
        this.LLILLL = (SmartImageView) findViewById(R.id.video_cover);
        View viewFindViewById = findViewById(R.id.video_control_container);
        this.LLILZLL = viewFindViewById;
        this.LLIZ = findViewById(R.id.video_control_shadow);
        this.LLIZLLLIL = (TuxIconView) findViewById(R.id.video_control_icon);
        if (viewFindViewById != null) {
            parent = viewFindViewById.getParent();
        } else {
            parent = null;
        }
        this.LLJI = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        LIZ(this.LLJILJILJ);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS161S0100000_27(this, 210), viewFindViewById);
        }
    }

    public final void LJIIIIZZ(int i, Integer num) {
        int iIntValue;
        String str;
        LJIIIZ();
        Function1<? super C0DS7, Unit> function1 = this.LLJILLL;
        if (function1 != null) {
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            C1845270y7R c1845270y7R = this.LLJIJIL;
            if (c1845270y7R != null) {
                str = c1845270y7R.videoUrl;
            } else {
                str = null;
            }
            function1.invoke(new C0DS7(i, iIntValue, null, str, 4));
        }
    }
}
