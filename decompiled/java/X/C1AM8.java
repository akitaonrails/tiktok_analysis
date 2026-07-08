package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.Surface;
import android.widget.FrameLayout;
import com.lynx.base.log.LynxLog;
import com.ss.android.ugc.aweme.base.xelements.xvideo.LynxUgVideoUI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AM8, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AM8 extends FrameLayout {
    public final LynxUgVideoUI LL;
    public final InterfaceC1484830ok5 LLILLJJLI;
    public boolean LLILLL;
    public final C01GW LLILZ;
    public float[] LLILZIL;
    public InterfaceC1479620obg LLILZLL;

    private final C422780Ghw getPosterView() {
        return (C422780Ghw) this.LLILZ.getValue();
    }

    public final EnumC1486640on0 LIZ() {
        InterfaceC1484830ok5 interfaceC1484830ok5;
        InterfaceC1484830ok5 interfaceC1484830ok52;
        InterfaceC1483850oiV playState;
        InterfaceC1483850oiV playState2;
        InterfaceC1483850oiV playState3;
        InterfaceC1483850oiV playState4;
        InterfaceC1484830ok5 interfaceC1484830ok53 = this.LLILLJJLI;
        if ((interfaceC1484830ok53 != null && (playState4 = interfaceC1484830ok53.getPlayState()) != null && playState4.isPaused()) || (((interfaceC1484830ok5 = this.LLILLJJLI) != null && (playState3 = interfaceC1484830ok5.getPlayState()) != null && playState3.getState() == 7) || ((interfaceC1484830ok52 = this.LLILLJJLI) != null && (playState2 = interfaceC1484830ok52.getPlayState()) != null && playState2.getState() == 0))) {
            return EnumC1486640on0.STOP;
        }
        InterfaceC1484830ok5 interfaceC1484830ok54 = this.LLILLJJLI;
        return (interfaceC1484830ok54 == null || (playState = interfaceC1484830ok54.getPlayState()) == null || !playState.isPlaying()) ? EnumC1486640on0.READY : EnumC1486640on0.PLAYING;
    }

    public final void LIZIZ() {
        C422780Ghw posterView;
        if (this.LLILLL) {
            C422780Ghw posterView2 = getPosterView();
            if ((posterView2 == null || posterView2.getVisibility() != 8) && (posterView = getPosterView()) != null) {
                int visibility = posterView.getVisibility();
                posterView.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, posterView);
            }
        }
    }

    public final Long getDuration() {
        InterfaceC1483420oho interfaceC1483420ohoLJIIIZ;
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLILLJJLI;
        return Long.valueOf((interfaceC1484830ok5 == null || (interfaceC1483420ohoLJIIIZ = interfaceC1484830ok5.LJIIIZ()) == null) ? 0L : interfaceC1483420ohoLJIIIZ.getDuration());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            r4 = this;
            android.content.Context r0 = r4.getContext()
            android.app.Activity r0 = LIZLLL(r0)
            if (r0 == 0) goto L46
            android.view.WindowManager r3 = r0.getWindowManager()
            X.0WZX r2 = new X.0WZX
            java.lang.String r1 = "dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOipcJqAxDfy9whPETbieeHGTtL++VurzSy8S9isynDllLwPmuc="
            r0 = 0
            r2.<init>(r1, r0)
            android.view.Display r0 = X.C2204961BRm.LLILZIL(r3, r2)
            int r1 = r0.getRotation()
            r3 = 0
            r0 = 1
            if (r1 == 0) goto L4e
            if (r1 == r0) goto L4c
            r0 = 2
            if (r1 == r0) goto L49
            r0 = 3
            if (r1 != r0) goto L4e
            r2 = 8
        L2c:
            android.content.Context r0 = r4.getContext()
            com.ss.android.videoshop.context.VideoContext r0 = com.ss.android.videoshop.context.VideoContext.LJJJJLL(r0)
            X.1AOh r1 = r0.LL
            r1.LLJILJIL = r2
            boolean r0 = X.C1486280omQ.LJ(r2)
            if (r0 != 0) goto L47
            boolean r0 = X.C1486280omQ.LJFF(r2)
            if (r0 != 0) goto L47
        L44:
            r1.LLJIJIL = r3
        L46:
            return
        L47:
            r3 = 1
            goto L44
        L49:
            r2 = 9
            goto L2c
        L4c:
            r2 = 0
            goto L2c
        L4e:
            r2 = 1
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AM8.LIZJ():void");
    }

    public static Activity LIZLLL(Context context) {
        if (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (context instanceof ContextWrapper) {
                return LIZLLL(((ContextWrapper) context).getBaseContext());
            }
            return null;
        }
        return null;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.LLILZIL == null) {
            super.draw(canvas);
            return;
        }
        canvas.saveLayer(new RectF(0.0f, 0.0f, getWidth(), getHeight()), null, 31);
        Path path = new Path();
        float[] fArr = this.LLILZIL;
        if (fArr != null) {
            path.addRoundRect(new RectF(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom()), fArr, Path.Direction.CW);
        }
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }

    public final void setBorderRadius(float[] fArr) {
        this.LLILZIL = fArr;
        invalidate();
    }

    public final void setMuted(boolean z) {
        InterfaceC1488100opM interfaceC1488100opMLJIILIIL;
        InterfaceC1488100opM interfaceC1488100opMLJIILIIL2;
        if (z) {
            InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLILLJJLI;
            if (interfaceC1484830ok5 != null && (interfaceC1488100opMLJIILIIL2 = interfaceC1484830ok5.LJIILIIL()) != null) {
                interfaceC1488100opMLJIILIIL2.mute();
                return;
            }
            return;
        }
        InterfaceC1484830ok5 interfaceC1484830ok52 = this.LLILLJJLI;
        if (interfaceC1484830ok52 == null || (interfaceC1488100opMLJIILIIL = interfaceC1484830ok52.LJIILIIL()) == null) {
            return;
        }
        interfaceC1488100opMLJIILIIL.unmute();
    }

    public final void setPlayEntity(InterfaceC1479620obg interfaceC1479620obg) {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLILLJJLI;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.LIZJ(this.LL);
        }
        this.LLILZLL = interfaceC1479620obg;
    }

    public C1AM8(final LynxUgVideoUI lynxUgVideoUI, Context context) {
        super(context);
        this.LL = lynxUgVideoUI;
        C1478410oZj c1478410oZj = new C1478410oZj();
        c1478410oZj.LIZIZ = true;
        InterfaceC1484830ok5 interfaceC1484830ok5LIZJ = C582130MsN.LIZ().LIZJ(c1478410oZj);
        this.LLILLJJLI = interfaceC1484830ok5LIZJ;
        this.LLILZ = C452501pT.LIZIZ(new AwS577S0100000_33(context, 4057));
        InterfaceC1482530ogN interfaceC1482530ogN = new InterfaceC1482530ogN(lynxUgVideoUI, this) { // from class: X.0oly
            public final LynxUgVideoUI LL;
            public final C1AM8 LLILLJJLI;

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
            public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayPrepared(String str) {
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
            public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
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
                this.LL.sendEvent("pause", new HashMap());
                this.LL.LL = EnumC1486640on0.STOP;
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayPrepare(String str) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPlayPrepare！！ sourceId = ");
                sbLIZ.append(str);
                sbLIZ.append(' ');
                LynxLog.i("LynxUgVideoListener", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayRelease(String str) {
                this.LL.sendEvent("release", new HashMap());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onVideoPreRelease: sourceId: ");
                sbLIZ.append(str);
                LynxLog.i("LynxUgVideoListener", C2188811AlT.LIZIZ(sbLIZ));
            }

            {
                this.LL = lynxUgVideoUI;
                this.LLILLJJLI = this;
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayCompleted(String str, int i) {
                this.LL.sendEvent("ended", C2097608Jq.LJI(new Pair("playCount", Integer.valueOf(i))));
                this.LL.LL = EnumC1486640on0.STOP;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onVideoCompleted: sourceId: ");
                sbLIZ.append(str);
                sbLIZ.append(", playCount: ");
                sbLIZ.append(i);
                LynxLog.i("LynxUgVideoListener", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlaying(String str, C1480430ocz c1480430ocz) {
                LynxUgVideoUI lynxUgVideoUI2 = this.LL;
                lynxUgVideoUI2.LL = EnumC1486640on0.PLAYING;
                lynxUgVideoUI2.sendEvent("play", new HashMap());
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPreparePlay(String str, C1480430ocz c1480430ocz) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPreparePlay！！ key = ");
                sbLIZ.append(str);
                sbLIZ.append(' ');
                LynxLog.i("LynxUgVideoListener", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC1482530ogN
            public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
                this.LLILLJJLI.LIZIZ();
                this.LL.sendEvent("firstframe", new HashMap());
                this.LL.LL = EnumC1486640on0.PLAYING;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onRenderStart: sourceId: ");
                sbLIZ.append(str);
                LynxLog.i("LynxUgVideoListener", C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onRenderStart: videoUI.getPreloadKey() = ");
                sbLIZ2.append(this.LL.LLJILJILJ);
                LynxLog.i("LynxUgVideoListener", C2188811AlT.LIZIZ(sbLIZ2));
                if (this.LL.LLJILJILJ.length() > 0) {
                    C582130MsN.LIZ().LJ().getClass();
                    C1482860ogu c1482860ogu = C1014030cUj.LIZ;
                    if (C1482860ogu.LJL(this.LL.LLJILJILJ) > 0) {
                        LynxUgVideoUI lynxUgVideoUI2 = this.LL;
                        C582130MsN.LIZ().LJ().getClass();
                        lynxUgVideoUI2.sendEvent("videoinfos", C2097608Jq.LJI(new Pair("key", lynxUgVideoUI2.LLJILJILJ), new Pair("cacheSize", Long.valueOf(C1482860ogu.LJL(this.LL.LLJILJILJ)))));
                    }
                }
            }

            @Override // X.InterfaceC1482530ogN
            public final void onSeekEnd(String str, boolean z) {
                this.LL.sendEvent("seek", C2097608Jq.LJI(new Pair("success", Boolean.valueOf(z))));
            }

            @Override // X.InterfaceC1482530ogN
            public final void onBufferedPercent(String str, long j, int i) {
                this.LL.sendEvent("bufferingchange", C2097608Jq.LJI(new Pair("percent", Integer.valueOf(i))));
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
                HashMap map;
                Integer numValueOf;
                Integer numValueOf2;
                if (c1481290oeN != null) {
                    map = C2097608Jq.LJI(new Pair("errorCode", Integer.valueOf(c1481290oeN.LJ)), new Pair("errorMsg", Integer.valueOf(c1481290oeN.LJFF)), new Pair("url", null));
                } else {
                    map = new HashMap();
                }
                this.LL.sendEvent("error", map);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onError: errorCode = ");
                if (c1481290oeN != null) {
                    numValueOf = Integer.valueOf(c1481290oeN.LJ);
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                sbLIZ.append(" ;errorMsg = $");
                if (c1481290oeN != null) {
                    numValueOf2 = Integer.valueOf(c1481290oeN.LJFF);
                } else {
                    numValueOf2 = null;
                }
                sbLIZ.append(numValueOf2);
                sbLIZ.append("; url = ");
                sbLIZ.append((String) null);
                LynxLog.e("LynxUgVideoListener", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayProgressChange(String str, long j, long j2) {
                this.LL.sendEvent("timeupdate", C2097608Jq.LJI(new Pair("current", Long.valueOf(j)), new Pair("total", Long.valueOf(j2))));
            }
        };
        if (interfaceC1484830ok5LIZJ != null) {
            interfaceC1484830ok5LIZJ.LJIILLIIL(interfaceC1482530ogN);
        }
    }

    public final void LJ(long j, boolean z) {
        InterfaceC1483850oiV playState;
        InterfaceC1484830ok5 interfaceC1484830ok5;
        InterfaceC1483850oiV playState2;
        InterfaceC1484830ok5 interfaceC1484830ok52;
        InterfaceC1484830ok5 interfaceC1484830ok53 = this.LLILLJJLI;
        if (interfaceC1484830ok53 != null) {
            interfaceC1484830ok53.seek(j);
        }
        if (z) {
            InterfaceC1484830ok5 interfaceC1484830ok54 = this.LLILLJJLI;
            if (interfaceC1484830ok54 != null && (playState2 = interfaceC1484830ok54.getPlayState()) != null && playState2.isPaused() && (interfaceC1484830ok52 = this.LLILLJJLI) != null) {
                interfaceC1484830ok52.resume();
                return;
            }
            return;
        }
        InterfaceC1484830ok5 interfaceC1484830ok55 = this.LLILLJJLI;
        if (interfaceC1484830ok55 == null || (playState = interfaceC1484830ok55.getPlayState()) == null || !playState.isPlaying() || (interfaceC1484830ok5 = this.LLILLJJLI) == null) {
            return;
        }
        interfaceC1484830ok5.pause();
    }

    public final void LJFF(String str, String str2) {
        C422780Ghw posterView;
        C1331070kk5 hierarchy;
        InterfaceC1320380kSq interfaceC1320380kSq;
        if (str != null && str.length() != 0) {
            if (!this.LLILLL) {
                this.LLILLL = true;
                addView(getPosterView(), -1, -1);
            }
            C422780Ghw posterView2 = getPosterView();
            if (posterView2 != null && (hierarchy = posterView2.getHierarchy()) != null) {
                if (Intrinsics.LJFF(str2, "contain")) {
                    interfaceC1320380kSq = InterfaceC1320380kSq.LIZJ;
                } else if (Intrinsics.LJFF(str2, "cover")) {
                    interfaceC1320380kSq = InterfaceC1320380kSq.LJI;
                } else {
                    interfaceC1320380kSq = InterfaceC1320380kSq.LIZ;
                }
                hierarchy.LJIIZILJ(interfaceC1320380kSq);
            }
            C446240Heg.LIZ(getPosterView(), str);
            C422780Ghw posterView3 = getPosterView();
            if ((posterView3 != null && posterView3.getVisibility() == 0) || (posterView = getPosterView()) == null) {
                return;
            }
            int visibility = posterView.getVisibility();
            posterView.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, posterView);
            return;
        }
        LIZIZ();
    }
}
