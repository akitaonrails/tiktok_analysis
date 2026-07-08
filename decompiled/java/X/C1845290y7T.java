package X;

import Y.ACListenerS139S0100000_4;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import avg.f;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import mf.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0y7T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1845290y7T extends FrameLayout {
    public InterfaceC1484830ok5 LL;
    public final FrameLayout LLILLJJLI;
    public final SmartImageView LLILLL;
    public final TuxSpinner LLILZ;
    public final FrameLayout LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public final TuxTextView LLIZLLLIL;
    public final TuxIconView LLJ;
    public boolean LLJI;
    public C1845270y7R LLJIJIL;
    public Function1<? super Float, Unit> LLJILJIL;
    public Function1<? super C0DS7, Unit> LLJILJILJ;
    public final C1845320y7W LLJILLL;
    public Function2<? super Integer, ? super Integer, Unit> LLJJ;

    public final void LIZIZ() {
        this.LLIZ = false;
        TuxSpinner tuxSpinner = this.LLILZ;
        if (tuxSpinner != null) {
            C786410Ut5.LLZILL(tuxSpinner, 8);
        }
    }

    public final boolean LIZJ() {
        InterfaceC1483850oiV playState;
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LL;
        return (interfaceC1484830ok5 == null || (playState = interfaceC1484830ok5.getPlayState()) == null || !playState.isPaused()) ? false : true;
    }

    public final boolean LIZLLL() {
        InterfaceC1483850oiV playState;
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LL;
        return (interfaceC1484830ok5 == null || (playState = interfaceC1484830ok5.getPlayState()) == null || !playState.isPlaying()) ? false : true;
    }

    public final void LJ() {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LL;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.release();
        }
        this.LL = null;
        this.LLJILJILJ = null;
        this.LLIZ = false;
        TuxSpinner tuxSpinner = this.LLILZ;
        if (tuxSpinner != null) {
            C786410Ut5.LLZILL(tuxSpinner, 8);
        }
        C1845320y7W c1845320y7W = this.LLJILLL;
        c1845320y7W.LIZIZ = 0L;
        c1845320y7W.LIZJ = null;
        c1845320y7W.LIZLLL = C2097608Jq.LJ();
    }

    public final void LJFF() {
        InterfaceC1484830ok5 interfaceC1484830ok5;
        TuxIconView tuxIconView = this.LLJ;
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
        if (!LIZJ() || (interfaceC1484830ok5 = this.LL) == null) {
            return;
        }
        interfaceC1484830ok5.resume();
    }

    public final boolean LIZ(String str) {
        String str2;
        C1845270y7R c1845270y7R = this.LLJIJIL;
        if (c1845270y7R != null) {
            str2 = c1845270y7R.vid;
        } else {
            str2 = null;
        }
        return TextUtils.equals(str2, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    public final void setData(C1845270y7R c1845270y7R) {
        ?? arrayList;
        long jLongValue;
        List<String> list;
        this.LLJIJIL = c1845270y7R;
        if (c1845270y7R != null && (list = c1845270y7R.urlList) != null) {
            arrayList = new ArrayList();
            for (String str : list) {
                String str2 = str;
                if (str2 != null && !a0.LJJJIL(str2)) {
                    arrayList.add(str);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        if (!arrayList.isEmpty()) {
            SmartImageView smartImageView = this.LLILLL;
            if (smartImageView != null) {
                C786410Ut5.LLFF(0, smartImageView);
            }
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(arrayList));
            c1331670kl3LJIIJ.LJJ(this.LLILLL);
            c1331670kl3LJIIJ.LJIIJJI();
        }
        this.LLIZ = true;
        if (!this.LLILZLL) {
            TuxSpinner tuxSpinner = this.LLILZ;
            if (tuxSpinner != null) {
                C786410Ut5.LLZILL(tuxSpinner, 0);
            }
        } else {
            TuxSpinner tuxSpinner2 = this.LLILZ;
            if (tuxSpinner2 != null) {
                C786410Ut5.LLZILL(tuxSpinner2, 8);
            }
        }
        Integer num = c1845270y7R.width;
        Integer num2 = c1845270y7R.height;
        if (num != null && num2 != null && num.intValue() > 0 && num2.intValue() > 0) {
            int screenWidth = ScreenUtils.getScreenWidth(getContext());
            int fullScreenHeight = ScreenUtils.getFullScreenHeight(getContext());
            float fIntValue = (screenWidth * num2.intValue()) / num.intValue();
            float f = fullScreenHeight;
            if (fIntValue >= f) {
                screenWidth = (int) ((f * num.intValue()) / num2.intValue());
            } else {
                fullScreenHeight = (int) fIntValue;
            }
            C12ES.LJIIZILJ(screenWidth, fullScreenHeight, this);
            Function2<? super Integer, ? super Integer, Unit> function2 = this.LLJJ;
            if (function2 != null) {
                function2.invoke(Integer.valueOf(screenWidth), Integer.valueOf(fullScreenHeight));
            }
        }
        if (C1004300cF2.LIZIZ(c1845270y7R.expireTime)) {
            LIZIZ();
            LJI(1, null);
            return;
        }
        InterfaceC1484530ojb interfaceC1484530ojbLIZ = C582130MsN.LIZ();
        C1478410oZj c1478410oZj = new C1478410oZj();
        c1478410oZj.LIZIZ = true;
        InterfaceC1484830ok5 interfaceC1484830ok5LIZJ = interfaceC1484530ojbLIZ.LIZJ(c1478410oZj);
        this.LL = interfaceC1484830ok5LIZJ;
        InterfaceC1483820oiS interfaceC1483820oiS = new InterfaceC1483820oiS() { // from class: X.0y7a
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
        InterfaceC1482530ogN interfaceC1482530ogN = new InterfaceC1482530ogN() { // from class: X.0y7U
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
            public final /* synthetic */ void W1(String str3) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onBrightnessChanged(String str3, float f2) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onBufferedPercent(String str3, long j, int i) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onBufferedTimeMs(String str3, long j) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onCompleteLoaded(String str3, boolean z) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onCrosstalkHappened(String str3, List list2) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onDecoderBuffering(String str3, boolean z, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onLiveRenderFirstFrame(String str3, C1480420ocy c1480420ocy) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onLoopPlay(String str3, int i) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onMaskInfoCallback(String str3, C1480290ocl c1480290ocl) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPausePlay(String str3, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayCompletedFirstTime(String str3, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayPrepare(String str3) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayPrepared(String str3) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayRelease(String str3) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayStop(String str3, JSONObject jSONObject, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayerInternalEvent(String str3, int i, JSONObject jSONObject) {
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener
            public final /* synthetic */ void onPreRenderReady(String str3) {
                C490850JMt.LIZ(this, str3);
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPreRenderSessionMissed(String str3) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPreparePlay(String str3, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onResumePlay(String str3, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onRetryOnError(String str3, C1481290oeN c1481290oeN) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onSeekEnd(String str3, boolean z) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onSeekStart(String str3, int i, float f2) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onSpeedChanged(String str3, float f2) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onStopPlay(String str3) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onVideoBitrateChanged(String str3, EnumC2281141EQm enumC2281141EQm, int i) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onVideoSecondFrame(String str3) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onVideoSizeChanged(String str3, int i, int i2) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void tc(String str3, JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void uv(JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayPause(String str3) {
                if (this.LL.LIZ(str3)) {
                    this.LL.LLJILLL.LIZJ();
                }
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayCompleted(String str3, int i) {
                if (this.LL.LIZ(str3)) {
                    this.LL.LLJILLL.LIZIZ();
                }
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlaying(String str3, C1480430ocz c1480430ocz) {
                if (this.LL.LIZ(str3)) {
                    this.LL.LIZIZ();
                    this.LL.LLJILLL.LIZLLL();
                }
            }

            @Override // X.InterfaceC1482530ogN
            public final void onRenderFirstFrame(String str3, C1480420ocy c1480420ocy) {
                String str4;
                if (this.LL.LIZ(str3)) {
                    C1845290y7T c1845290y7T = this.LL;
                    SmartImageView smartImageView2 = c1845290y7T.LLILLL;
                    if (smartImageView2 != null) {
                        C786410Ut5.LLFF(8, smartImageView2);
                    }
                    Function1<? super C0DS7, Unit> function1 = c1845290y7T.LLJILJILJ;
                    if (function1 != null) {
                        Long lValueOf = Long.valueOf(System.currentTimeMillis());
                        C1845270y7R c1845270y7R2 = c1845290y7T.LLJIJIL;
                        if (c1845270y7R2 != null) {
                            str4 = c1845270y7R2.videoUrl;
                        } else {
                            str4 = null;
                        }
                        function1.invoke(new C0DS7(0, 0, lValueOf, str4, 2));
                    }
                }
            }

            @Override // X.InterfaceC1482530ogN
            public final void onBuffering(String str3, boolean z, C1480430ocz c1480430ocz) {
                if (this.LL.LIZ(str3)) {
                    if (z) {
                        C1845290y7T c1845290y7T = this.LL;
                        c1845290y7T.LLIZ = true;
                        if (!c1845290y7T.LLILZLL) {
                            TuxSpinner tuxSpinner3 = c1845290y7T.LLILZ;
                            if (tuxSpinner3 != null) {
                                C786410Ut5.LLZILL(tuxSpinner3, 0);
                                return;
                            }
                            return;
                        }
                        TuxSpinner tuxSpinner4 = c1845290y7T.LLILZ;
                        if (tuxSpinner4 == null) {
                            return;
                        }
                        C786410Ut5.LLZILL(tuxSpinner4, 8);
                        return;
                    }
                    this.LL.LIZIZ();
                }
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayFailed(String str3, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
                Integer numValueOf;
                if (this.LL.LIZ(str3)) {
                    this.LL.LIZIZ();
                    C1845290y7T c1845290y7T = this.LL;
                    if (c1481290oeN != null) {
                        numValueOf = Integer.valueOf(c1481290oeN.LJ);
                    } else {
                        numValueOf = null;
                    }
                    c1845290y7T.LJI(2, numValueOf);
                }
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayProgressChange(String str3, long j, long j2) {
                if (this.LL.LIZ(str3)) {
                    float f2 = (j / j2) * 100;
                    Function1<? super Float, Unit> function1 = this.LL.LLJILJIL;
                    if (function1 != null) {
                        function1.invoke(Float.valueOf(f2));
                    }
                }
            }
        };
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LL;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.LJIIZILJ(interfaceC1482530ogN);
        }
        InterfaceC1484830ok5 interfaceC1484830ok52 = this.LL;
        if (interfaceC1484830ok52 != null) {
            interfaceC1484830ok52.LJJLIIIJL(new InterfaceC585470Mxl() { // from class: X.0My5
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
                public final /* synthetic */ HashMap LJ(String str3) {
                    return null;
                }

                @Override // X.InterfaceC585470Mxl
                public final /* synthetic */ HashMap LJFF(String str3) {
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
                public final /* synthetic */ HashMap LJIIJ(String str3, boolean z) {
                    return null;
                }

                @Override // X.InterfaceC585470Mxl
                public final /* synthetic */ HashMap LJIIL(String str3, JSONObject jSONObject) {
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
                public final /* synthetic */ HashMap LJIILL(String str3) {
                    return null;
                }

                @Override // X.InterfaceC585470Mxl
                public final boolean LJIILLIIL() {
                    return true;
                }

                @Override // X.InterfaceC585470Mxl
                public final /* synthetic */ HashMap LJIIZILJ(String str3, boolean z) {
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
        C1845270y7R c1845270y7R2 = this.LLJIJIL;
        if (c1845270y7R2 == null) {
            return;
        }
        C1845320y7W c1845320y7W = this.LLJILLL;
        Long l = c1845270y7R2.duration;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Map<String, String> mapLJ = c1845270y7R2.params;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        c1845320y7W.LIZLLL = mapLJ;
        c1845320y7W.LIZIZ = jLongValue;
        c1845320y7W.LIZJ = null;
        c1845320y7W.LIZ = "post_panel";
        C1482580ogS c1482580ogS = new C1482580ogS();
        c1482580ogS.LIZ = c1845270y7R2.vid;
        C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
        c1058540deW.LIZLLL = Collections.singletonList(c1845270y7R2.videoUrl);
        C1482570ogR c1482570ogRLIZ = c1058540deW.LIZ().LIZ();
        String str3 = c1845270y7R2.businessTag;
        if (str3 == null) {
            str3 = "Tako";
        }
        c1482570ogRLIZ.LIZIZ.LJIILL = str3;
        C1482580ogS c1482580ogS2 = c1482570ogRLIZ.LIZ;
        c1482580ogS2.LJ = c1482570ogRLIZ;
        C1482560ogQ c1482560ogQLIZ = new C1484680ojq(c1482580ogS2).LIZ();
        InterfaceC1484830ok5 interfaceC1484830ok53 = this.LL;
        if (interfaceC1484830ok53 == null) {
            return;
        }
        interfaceC1484830ok53.LJ(c1482560ogQLIZ);
    }

    public final void setLoadingSuppressed(boolean z) {
        int i;
        this.LLILZLL = z;
        TuxSpinner tuxSpinner = this.LLILZ;
        if (tuxSpinner != null) {
            if (!z && this.LLIZ) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLZILL(tuxSpinner, i);
        }
    }

    public final void setOnVideoSizeChangedListener(Function2<? super Integer, ? super Integer, Unit> function2) {
        this.LLJJ = function2;
    }

    public final void setPlayResultCallback(Function1<? super C0DS7, Unit> function1) {
        this.LLJILJILJ = function1;
    }

    public final void setProgressListener(Function1<? super Float, Unit> function1) {
        this.LLJILJIL = function1;
    }

    public final void setTogglePlayOnClickEnabled(boolean z) {
        this.LLJI = z;
    }

    public C1845290y7T(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJI = true;
        this.LLJILLL = new C1845320y7W();
        C786410Ut5.Sd(R.layout.fru, C786410Ut5.ne(context), this);
        this.LLILLJJLI = (FrameLayout) findViewById(R.id.eqx);
        this.LLILLL = (SmartImageView) findViewById(R.id.video_cover);
        this.LLILZ = (TuxSpinner) findViewById(R.id.video_loading);
        this.LLILZIL = (FrameLayout) findViewById(R.id.video_error);
        this.LLIZLLLIL = (TuxTextView) findViewById(R.id.hc1);
        this.LLJ = (TuxIconView) findViewById(R.id.qmu);
        View.OnClickListener aCListenerS139S0100000_4 = new ACListenerS139S0100000_4(this, 113);
        a aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS139S0100000_4) : aCListenerS139S0100000_4);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    public final void LJI(int i, Integer num) {
        String string;
        int iIntValue;
        String str;
        Function1<? super C0DS7, Unit> function1 = this.LLJILJILJ;
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
        FrameLayout frameLayout = this.LLILZIL;
        if (frameLayout != null) {
            C786410Ut5.LJZ(0, frameLayout);
        }
        if (i == 1 || i != 2) {
            string = getContext().getString(2131849912);
        } else {
            string = getContext().getString(2131849656);
        }
        TuxTextView tuxTextView = this.LLIZLLLIL;
        if (tuxTextView != null) {
            tuxTextView.setText(string);
        }
    }
}
