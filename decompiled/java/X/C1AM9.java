package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;
import com.bytedance.ies.xelement.video.pro.LynxVideoUI;
import com.lynx.base.log.LynxLog;
import com.ss.android.videoshop.context.VideoContext;
import fyo.e;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1AM9, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AM9 extends FrameLayout {
    public final C1AME LL;
    public final C422780Ghw LLILLJJLI;
    public final C1486020om0 LLILLL;
    public float[] LLILZ;

    public final EnumC1486640on0 LIZ() {
        VideoContext videoContext;
        C1AME c1ame;
        C2178641AOg c2178641AOg;
        VideoContext videoContext2;
        C2178641AOg c2178641AOg2;
        InterfaceC2178671AOj interfaceC2178671AOj;
        InterfaceC2178671AOj interfaceC2178671AOj2;
        InterfaceC2178671AOj interfaceC2178671AOj3;
        C1AME c1ame2 = this.LL;
        C2178641AOg c2178641AOg3 = c1ame2.LLILLL;
        if (c2178641AOg3 == null ? (videoContext = c1ame2.LLILZIL) == null || !videoContext.LJJJJZI(c1ame2) || !c1ame2.LLILZIL.isPaused() : (interfaceC2178671AOj3 = c2178641AOg3.LLJI) == null || !interfaceC2178671AOj3.isPaused()) {
            if (!this.LL.LJ() && ((c2178641AOg = (c1ame = this.LL).LLILLL) == null ? (videoContext2 = c1ame.LLILZIL) == null || !videoContext2.LJJJJZI(c1ame) || (c2178641AOg2 = c1ame.LLILZIL.LLILLL) == null || (interfaceC2178671AOj = c2178641AOg2.LLJI) == null || !interfaceC2178671AOj.LJJIIJZLJL() : (interfaceC2178671AOj2 = c2178641AOg.LLJI) == null || !interfaceC2178671AOj2.LJJIIJZLJL())) {
                return this.LL.LIZLLL() ? EnumC1486640on0.PLAYING : EnumC1486640on0.READY;
            }
        }
        return EnumC1486640on0.STOP;
    }

    public final int getDuration() {
        return this.LL.getDuration();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            r4 = this;
            android.content.Context r0 = r4.getContext()
            android.app.Activity r0 = LIZJ(r0)
            if (r0 == 0) goto L46
            android.view.WindowManager r3 = r0.getWindowManager()
            X.0WZX r2 = new X.0WZX
            java.lang.String r1 = "dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxAuESE+l7H/sd+zSVR2xGB0YM3Mnrhl0="
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
        throw new UnsupportedOperationException("Method not decompiled: X.C1AM9.LIZIZ():void");
    }

    public static Activity LIZJ(Context context) {
        if (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (context instanceof ContextWrapper) {
                return LIZJ(((ContextWrapper) context).getBaseContext());
            }
            return null;
        }
        return null;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (canvas != null && this.LLILZ != null) {
            canvas.saveLayer(new RectF(0.0f, 0.0f, getWidth(), getHeight()), null, 31);
            Path path = new Path();
            path.addRoundRect(new RectF(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom()), this.LLILZ, Path.Direction.CW);
            canvas.clipPath(path);
            super.draw(canvas);
            canvas.restore();
            return;
        }
        super.draw(canvas);
    }

    public final void setBorderRadius(float[] fArr) {
        this.LLILZ = fArr;
        invalidate();
    }

    public final void setEngineFactory(InterfaceC1395140mPQ interfaceC1395140mPQ) {
        this.LL.setVideoEngineFactory(interfaceC1395140mPQ);
    }

    public final void setMuted(boolean z) {
        this.LL.setMute(z);
    }

    public final void setPlayEntity(C1474420oTI c1474420oTI) {
        this.LL.setPlayEntity(c1474420oTI);
    }

    public final void setUrlConstructor(InterfaceC1474390oTF interfaceC1474390oTF) {
        this.LL.setPlayUrlConstructor(interfaceC1474390oTF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0om0, java.lang.Object] */
    public C1AM9(final LynxVideoUI lynxVideoUI, Context context) {
        new LinkedHashMap();
        super(context);
        C1AME c1ame = new C1AME(context, null);
        this.LL = c1ame;
        C422780Ghw c422780Ghw = new C422780Ghw(context);
        this.LLILLJJLI = c422780Ghw;
        ?? r3 = new C2178681AOk(lynxVideoUI, this) { // from class: X.0om0
            public final LynxVideoUI LL;
            public final C1AM9 LLILLJJLI;
            public final String LLILLL = "LynxVideoPlayListener";

            {
                this.LL = lynxVideoUI;
                this.LLILLJJLI = this;
            }

            @Override // X.C2178681AOk, X.InterfaceC1474240oT0
            public final void LIZLLL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
                if (c1474420oTI != null && Intrinsics.LJFF(c1474420oTI, this.LL.LLILLJJLI)) {
                    this.LL.sendEvent("release", new HashMap());
                    String str = this.LLILLL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onVideoPreRelease: ");
                    sbLIZ.append(c1474420oTI);
                    LynxLog.i(str, C2188811AlT.LIZIZ(sbLIZ));
                }
            }

            @Override // X.C2178681AOk, X.InterfaceC1474240oT0
            public final void LJII(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
                if (c1474420oTI != null && Intrinsics.LJFF(c1474420oTI, this.LL.LLILLJJLI)) {
                    C1AM9 c1am9 = this.LLILLJJLI;
                    if (c1am9.LLILLJJLI.getVisibility() != 8) {
                        C422780Ghw c422780Ghw2 = c1am9.LLILLJJLI;
                        int visibility = c422780Ghw2.getVisibility();
                        c422780Ghw2.setVisibility(8);
                        C1602160rnK.LIZIZ(visibility, 8, c422780Ghw2);
                    }
                    this.LL.sendEvent("firstframe", new HashMap());
                    this.LL.LLILLL = EnumC1486640on0.PLAYING;
                    String str = this.LLILLL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onRenderStart: url: ");
                    sbLIZ.append(c1474420oTI.LJ);
                    sbLIZ.append(", vid: ");
                    sbLIZ.append(c1474420oTI.LIZ);
                    LynxLog.i(str, C2188811AlT.LIZIZ(sbLIZ));
                }
            }

            @Override // X.C2178681AOk, X.InterfaceC1474240oT0
            public final void LJJI(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
                if (c1474420oTI != null && Intrinsics.LJFF(c1474420oTI, this.LL.LLILLJJLI)) {
                    this.LL.sendEvent("ended", new HashMap());
                    this.LL.LLILLL = EnumC1486640on0.STOP;
                    String str = this.LLILLL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onVideoCompleted: url: ");
                    sbLIZ.append(c1474420oTI.LJ);
                    sbLIZ.append(", vid: ");
                    sbLIZ.append(c1474420oTI.LIZ);
                    LynxLog.i(str, C2188811AlT.LIZIZ(sbLIZ));
                }
            }

            @Override // X.C2178681AOk, X.InterfaceC1474240oT0
            public final void LJJIIZ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
                if (c1474420oTI != null && Intrinsics.LJFF(c1474420oTI, this.LL.LLILLJJLI)) {
                    this.LL.sendEvent("pause", new HashMap());
                    this.LL.LLILLL = EnumC1486640on0.STOP;
                    String str = this.LLILLL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onVideoPause: url: ");
                    sbLIZ.append(c1474420oTI.LJ);
                    sbLIZ.append(", vid: ");
                    sbLIZ.append(c1474420oTI.LIZ);
                    LynxLog.i(str, C2188811AlT.LIZIZ(sbLIZ));
                }
            }

            @Override // X.C2178681AOk, X.InterfaceC1474240oT0
            public final void LJJJJ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
                if (c1474420oTI != null && Intrinsics.LJFF(c1474420oTI, this.LL.LLILLJJLI)) {
                    LynxVideoUI lynxVideoUI2 = this.LL;
                    lynxVideoUI2.LLILLL = EnumC1486640on0.PLAYING;
                    lynxVideoUI2.sendEvent("play", new HashMap());
                    String str = this.LLILLL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onVideoPlay: url: ");
                    sbLIZ.append(c1474420oTI.LJ);
                    sbLIZ.append(", vid: ");
                    sbLIZ.append(c1474420oTI.LIZ);
                    LynxLog.i(str, C2188811AlT.LIZIZ(sbLIZ));
                }
            }

            @Override // X.C2178681AOk, X.InterfaceC1474240oT0
            public final void LJ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, C1467470oI5 c1467470oI5) {
                String str;
                if (c1474420oTI != null && Intrinsics.LJFF(c1474420oTI, this.LL.LLILLJJLI) && a0.LJJIIZI(c1467470oI5.LIZ, "mdlhitcachesize", false)) {
                    LynxVideoUI lynxVideoUI2 = this.LL;
                    Pair[] pairArr = new Pair[2];
                    String str2 = c1467470oI5.LIZLLL;
                    if (str2 != null && str2.length() > 0) {
                        str = c1467470oI5.LIZLLL;
                    } else {
                        str = c1474420oTI.LJI;
                    }
                    pairArr[0] = new Pair("key", str);
                    pairArr[1] = new Pair("cacheSize", Long.valueOf(c1467470oI5.LJ));
                    lynxVideoUI2.sendEvent("videoinfos", C2097608Jq.LJI(pairArr));
                }
            }

            @Override // X.C2178681AOk, X.InterfaceC1474240oT0
            public final void LJIILL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, int i) {
                if (c1474420oTI != null && Intrinsics.LJFF(c1474420oTI, this.LL.LLILLJJLI)) {
                    this.LL.sendEvent("bufferingchange", C2097608Jq.LJI(new Pair("percent", Integer.valueOf(i))));
                    String str = this.LLILLL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onBufferingUpdate: url: ");
                    sbLIZ.append(c1474420oTI.LJ);
                    sbLIZ.append(", vid: ");
                    sbLIZ.append(c1474420oTI.LIZ);
                    sbLIZ.append(", percent: ");
                    sbLIZ.append(i);
                    LynxLog.v(str, C2188811AlT.LIZIZ(sbLIZ));
                }
            }

            @Override // X.C2178681AOk, X.InterfaceC1474240oT0
            public final void LJIJI(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, int i) {
                if (c1474420oTI != null && Intrinsics.LJFF(c1474420oTI, this.LL.LLILLJJLI)) {
                    this.LL.sendEvent("loadstatechange", C2097608Jq.LJI(new Pair("loadState", Integer.valueOf(i))));
                    String str = this.LLILLL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("OnLoadStateChange: loadState ");
                    sbLIZ.append(i);
                    LynxLog.i(str, C2188811AlT.LIZIZ(sbLIZ));
                }
            }

            @Override // X.C2178681AOk, X.InterfaceC1474240oT0
            public final void LJJ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, e eVar) {
                HashMap map;
                if (c1474420oTI != null && Intrinsics.LJFF(c1474420oTI, this.LL.LLILLJJLI)) {
                    if (eVar != null) {
                        map = C2097608Jq.LJI(new Pair("errorCode", Integer.valueOf(eVar.LIZ)), new Pair("errorMsg", eVar.LIZLLL), new Pair("url", c1474420oTI.LJ));
                    } else {
                        map = new HashMap();
                    }
                    this.LL.sendEvent("error", map);
                    String str = this.LLILLL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onError: url: ");
                    sbLIZ.append(c1474420oTI.LJ);
                    sbLIZ.append(", vid: ");
                    sbLIZ.append(c1474420oTI.LIZ);
                    sbLIZ.append(", error: ");
                    sbLIZ.append(eVar);
                    LynxLog.e(str, C2188811AlT.LIZIZ(sbLIZ));
                }
            }

            @Override // X.C2178681AOk, X.InterfaceC1474240oT0
            public final void LJJJIL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, boolean z) {
                if (c1474420oTI != null && Intrinsics.LJFF(c1474420oTI, this.LL.LLILLJJLI)) {
                    this.LL.sendEvent("seek", C2097608Jq.LJI(new Pair("success", Boolean.valueOf(z))));
                }
            }

            @Override // X.C2178681AOk, X.InterfaceC1474240oT0
            public final void LJIILIIL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, int i, int i2) {
                if (c1474420oTI != null && Intrinsics.LJFF(c1474420oTI, this.LL.LLILLJJLI)) {
                    this.LL.sendEvent("timeupdate", C2097608Jq.LJI(new Pair("current", Integer.valueOf(i)), new Pair("total", Integer.valueOf(i2))));
                }
            }

            @Override // X.C2178681AOk, X.InterfaceC2178771AOt
            public final void LJJII(InterfaceC1471800oP4 interfaceC1471800oP4, C1474420oTI c1474420oTI, boolean z, int i, boolean z2, boolean z3) {
                if (c1474420oTI != null && Intrinsics.LJFF(c1474420oTI, this.LL.LLILLJJLI)) {
                    this.LL.sendEvent("fullscreenchange", C2097608Jq.LJI(new Pair("fullscreen", Integer.valueOf(z ? 1 : 0))));
                    String str = this.LLILLL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onFullScreen: fullscreen: ");
                    sbLIZ.append(z);
                    LynxLog.i(str, C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        };
        this.LLILLL = r3;
        addView(c1ame, -1, -1);
        c1ame.setAttachListener(new C1AMD() { // from class: X.1AMA
            @Override // X.C1AMD
            public final void LIZIZ(C1AME c1ame2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c1ame2);
                sbLIZ.append(" is attach");
                LynxLog.i("LynxVideoAttachListener", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.C1AMD
            public final void LIZJ(C1AME c1ame2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c1ame2);
                sbLIZ.append(" is detach");
                LynxLog.i("LynxVideoAttachListener", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.C1AMD
            public final void LIZ(C1AME c1ame2, boolean z) {
                if (z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c1ame2);
                    sbLIZ.append(" is visible");
                    LynxLog.i("LynxVideoAttachListener", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(c1ame2);
                sbLIZ2.append(" is invisible");
                LynxLog.i("LynxVideoAttachListener", C2188811AlT.LIZIZ(sbLIZ2));
            }
        });
        c1ame.setAsyncRelease(true);
        VideoContext videoContext = c1ame.LLILZIL;
        if (videoContext != null && !((CopyOnWriteArrayList) videoContext.LLJI).contains(r3)) {
            ((CopyOnWriteArrayList) videoContext.LLJI).add(r3);
        }
        addView(c422780Ghw, -1, -1);
    }

    public final void LIZLLL(long j, boolean z) {
        this.LL.LJIIIZ(j);
        if (z) {
            C1AME c1ame = this.LL;
            C2178641AOg c2178641AOg = c1ame.LLILLL;
            if (c2178641AOg != null) {
                InterfaceC2178671AOj interfaceC2178671AOj = c2178641AOg.LLJI;
                if (interfaceC2178671AOj == null || !interfaceC2178671AOj.isPaused()) {
                    return;
                }
            } else {
                VideoContext videoContext = c1ame.LLILZIL;
                if (videoContext == null || !videoContext.LJJJJZI(c1ame) || !c1ame.LLILZIL.isPaused()) {
                    return;
                }
            }
            this.LL.LJI();
            return;
        }
        if (!this.LL.LIZLLL()) {
            return;
        }
        this.LL.LJFF();
    }
}
