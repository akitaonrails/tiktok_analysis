package X;

import Y.AAListenerS331S0100000_20;
import Y.ACallableS68S1100000_20;
import Y.ACallableS92S0400000_20;
import Y.AComparatorS39S0000000_20;
import Y.ARunnableS24S1200000_20;
import Y.AUListenerS269S0100000_20;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sdui.render.bridge.Callback;
import com.bytedance.sdui.render.bridge.ReadableMap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import z76.g$a;
import z76.g$c;
import z76.o;

/* JADX INFO: renamed from: X.0jhD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1290850jhD extends AbstractC1313520kHm<C1291330jhz> implements InterfaceC1290690jgx {
    public boolean LLLLLLLZIL;
    public boolean LLLLLLZ;
    public boolean LLLLLLZZ;
    public Set<String> LLLLLZ;
    public int LLLLLZIL;
    public int LLLLLZL;
    public int LLLLZ;
    public boolean LLLLZI;
    public String LLLLZIL;
    public String LLLLZLL;
    public boolean LLLLZLLIL;
    public boolean LLLLZLLLI;
    public boolean LLLZ;
    public String LLLZI;
    public ReadableMap LLLZIIL;
    public final List<Integer> LLLZIL;
    public final List<Integer> LLLZL;
    public final C1290940jhM LLLZLL;
    public C1291600jiQ LLLZLZ;
    public final C1290910jhJ LLLZZ;
    public String LLLZZIL;
    public final ArrayList<C1323050kX9<?>> LLZ;
    public int LLZIL;
    public int LLZILL;
    public volatile boolean LLZL;
    public g$c LLZLI;

    public static final String LJLLLLLL(String str) {
        return str;
    }

    @InterfaceC1291270jht(defaultBoolean = false, name = "only-local")
    public final void setOnlyLocal(boolean z) {
    }

    static {
        new Object() { // from class: z76.g$b
        };
    }

    public final void LJLL() {
        if (this.LLLLZIL != null) {
            this.LLLLZIL = null;
            this.LLLZ = true;
            ((C1291330jhz) this.LLLLLILLIL).setImageDrawable(null);
            C1291330jhz c1291330jhz = (C1291330jhz) this.LLLLLILLIL;
            if (c1291330jhz != null) {
                c1291330jhz.setImageAssetDelegate(null);
                c1291330jhz.cancelAnimation();
            }
        }
    }

    @Override // X.AbstractC1313520kHm, com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJIIJ() {
        super.LJIIJ();
        ((C1291330jhz) this.LLLLLILLIL).LLILLL.LLILLL.removeAllListeners();
        C1291430ji9 c1291430ji9 = ((C1291330jhz) this.LLLLLILLIL).LLILLL;
        c1291430ji9.LLILLL.removeAllUpdateListeners();
        c1291430ji9.LLILLL.addUpdateListener(c1291430ji9.LLJJ);
        ((HashSet) ((C1291330jhz) this.LLLLLILLIL).LLJI).clear();
        ((C1291330jhz) this.LLLLLILLIL).cancelAnimation();
        synchronized (this) {
            try {
                Iterator<C1323050kX9<?>> it2 = this.LLZ.iterator();
                while (it2.hasNext()) {
                    C1323050kX9.LJII(it2.next());
                }
                this.LLZ.clear();
                T t = this.LLLLLILLIL;
                C1290900jhI c1290900jhI = t instanceof C1290900jhI ? (C1290900jhI) t : null;
                if (c1290900jhI != null) {
                    c1290900jhI.setDestroyed(true);
                }
                this.LLZL = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJJLIIIJL() {
        super.LJJLIIIJL();
        if (this.LLLLLLZ && !this.LLLLLLZZ && !this.LLLLZI && this.LLLZ) {
            ((C1291330jhz) this.LLLLLILLIL).playAnimation();
        }
        this.LLLLZI = false;
    }

    @Override // X.InterfaceC1291560jiM
    public final void LJJIFFI() {
    }

    public C1290850jhD(AbstractC1317090kNX abstractC1317090kNX) {
        super(abstractC1317090kNX);
        this.LLLLLLLZIL = true;
        this.LLLLLLZ = true;
        this.LLLLLZL = -1;
        this.LLLLZLLLI = true;
        this.LLLZ = true;
        this.LLLZI = "";
        this.LLLZIL = new ArrayList();
        this.LLLZL = new ArrayList();
        this.LLLZLL = new C1290940jhM("");
        this.LLLZZ = new C1290910jhJ();
        this.LLLZZIL = "";
        this.LLZ = new ArrayList<>();
        this.LLZILL = Integer.MAX_VALUE;
    }

    public static final boolean LJLLL(String str) {
        if (!u.LJJIIJZLJL(str, "http://", false) && !u.LJJIIJZLJL(str, "https://", false)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJJLL(Map<String, C1297940jse> map) {
        Set<String> setKeySet;
        this.LLJIJIL = map;
        if (map == null) {
            setKeySet = null;
        } else {
            setKeySet = map.keySet();
        }
        this.LLLLLZ = setKeySet;
    }

    @Override // X.AbstractC1313520kHm
    public final View LJLJJL(Context context) {
        final C1290900jhI c1290900jhI = new C1290900jhI(context);
        if (!c1290900jhI.LLIZLLLIL) {
            c1290900jhI.LLIZLLLIL = true;
            c1290900jhI.LIZJ();
        }
        c1290900jhI.enableMergePathsForKitKatAndAbove(true);
        c1290900jhI.LLJ = true;
        C1291430ji9 c1291430ji9 = c1290900jhI.LLILLL;
        c1291430ji9.LLJILLL = true;
        c1291430ji9.LLILLL.addListener(new AAListenerS331S0100000_20(this, 2));
        InterfaceC1291000jhS interfaceC1291000jhS = new InterfaceC1291000jhS() { // from class: X.0jhF
            @Override // X.InterfaceC1291000jhS
            public final void LIZ(C1291600jiQ c1291600jiQ) {
                C1291600jiQ composition;
                C1291600jiQ composition2;
                ReadableMap readableMap;
                final C1290850jhD c1290850jhD = this.LIZ;
                C1290900jhI c1290900jhI2 = c1290900jhI;
                c1290850jhD.LLLZLZ = c1291600jiQ;
                C1291010jhT performanceTracker = c1290900jhI2.getPerformanceTracker();
                if (performanceTracker != null) {
                    performanceTracker.LIZ = true;
                }
                C1291010jhT performanceTracker2 = c1290900jhI2.getPerformanceTracker();
                if (performanceTracker2 != null) {
                    performanceTracker2.LIZJ.add(new InterfaceC1290980jhQ() { // from class: X.0jhL
                        @Override // X.InterfaceC1290980jhQ
                        public final void LIZ() {
                            c1290850jhD.LLLZZ.LIZIZ();
                        }
                    });
                }
                if (c1291600jiQ.LJIILIIL) {
                    C1291600jiQ c1291600jiQ2 = c1290850jhD.LLLZLZ;
                    if (c1291600jiQ2 != null && (readableMap = c1290850jhD.LLLZIIL) != null) {
                        new C1290490jgd(new ACallableS92S0400000_20(readableMap, new C1290890jhH(c1290850jhD), c1291600jiQ2, c1290850jhD, 1));
                        return;
                    }
                    return;
                }
                int frame = 0;
                float f = 0.0f;
                if (c1291600jiQ.LJIIL) {
                    C1291330jhz c1291330jhz = (C1291330jhz) c1290850jhD.LLLLLILLIL;
                    if (c1291330jhz != null) {
                        frame = c1291330jhz.getFrame();
                    }
                    C1291330jhz c1291330jhz2 = (C1291330jhz) c1290850jhD.LLLLLILLIL;
                    if (c1291330jhz2 != null && (composition2 = c1291330jhz2.getComposition()) != null) {
                        f = composition2.LJIIJ - composition2.LJIIIZ;
                    }
                    c1290850jhD.LJZ("ready", C1290850jhD.LJLLI(frame, (int) f, c1290850jhD.LLLLZ, c1290850jhD.LLLZI));
                    c1290850jhD.LLLZLL.LIZ(c1290850jhD.LLLLZLL);
                    if (!c1290850jhD.LLLLLLZ || !c1290850jhD.LLLZ) {
                        return;
                    }
                    ((C1291330jhz) c1290850jhD.LLLLLILLIL).playAnimation();
                    return;
                }
                C1291330jhz c1291330jhz3 = (C1291330jhz) c1290850jhD.LLLLLILLIL;
                if (c1291330jhz3 != null) {
                    frame = c1291330jhz3.getFrame();
                }
                C1291330jhz c1291330jhz4 = (C1291330jhz) c1290850jhD.LLLLLILLIL;
                if (c1291330jhz4 != null && (composition = c1291330jhz4.getComposition()) != null) {
                    f = composition.LJIIJ - composition.LJIIIZ;
                }
                c1290850jhD.LJZ("error", C1290850jhD.LJLLI(frame, (int) f, c1290850jhD.LLLLZ, c1290850jhD.LLLZI));
            }
        };
        C1291600jiQ c1291600jiQ = c1290900jhI.LLJILJIL;
        if (c1291600jiQ != null) {
            interfaceC1291000jhS.LIZ(c1291600jiQ);
        }
        ((HashSet) c1290900jhI.LLJI).add(interfaceC1291000jhS);
        c1290900jhI.LLILLL.LLILLL.addUpdateListener(new AUListenerS269S0100000_20(this, 29));
        return c1290900jhI;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067 A[Catch: Exception -> 0x00f1, TryCatch #0 {Exception -> 0x00f1, blocks: (B:3:0x0001, B:5:0x0010, B:7:0x001a, B:11:0x0025, B:13:0x002d, B:14:0x0045, B:23:0x0060, B:26:0x0067, B:28:0x006f, B:29:0x0073, B:31:0x0079, B:32:0x007c, B:17:0x004e, B:37:0x00a9, B:39:0x00af, B:41:0x00b5, B:42:0x00b8, B:45:0x00d4, B:46:0x00d6, B:20:0x0057, B:34:0x00a0), top: B:52:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLLLL(java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1290850jhD.LJLLLL(java.lang.String):void");
    }

    public final void LJZI(String str) {
        int iLJJJJ = a0.LJJJJ(str, '/', 0, 6);
        if (iLJJJJ > 0) {
            if (str != null) {
                this.LLLLZIL = str.substring(0, iLJJJJ);
                ((C1291330jhz) this.LLLLLILLIL).setImageAssetDelegate(this);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        Intrinsics.LJIIJJI(str, "uri is error:");
    }

    @InterfaceC1291270jht(defaultBoolean = true, name = "autoplay")
    public final void setAutoPlay(boolean z) {
        this.LLLLLLZ = z;
        T t = this.LLLLLILLIL;
        if (t != 0) {
            ((C1290900jhI) t).setMAutoPlay(z);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieAnimationView");
    }

    @InterfaceC1291270jht(name = "bid")
    public final void setBID(String str) {
        this.LLLZZIL = str;
    }

    @InterfaceC1291270jht(defaultInt = -1, name = "endframe")
    public final void setEndFrame(int i) {
        if (i < 0) {
            this.LLZILL = Integer.MAX_VALUE;
            ((C1291330jhz) this.LLLLLILLIL).setMaxFrame(Integer.MAX_VALUE);
        } else {
            this.LLZILL = i;
            ((C1291330jhz) this.LLLLLILLIL).setMaxFrame(i);
        }
    }

    @InterfaceC1291270jht(defaultInt = -1, name = "end-frame")
    public final void setEndFrame2(int i) {
        setEndFrame(i);
    }

    @InterfaceC1291270jht(defaultBoolean = false, name = "ignore-attach-status")
    public final void setIgnoreAttachStatus(boolean z) {
        C1290900jhI c1290900jhI;
        T t = this.LLLLLILLIL;
        if ((t instanceof C1290900jhI) && (c1290900jhI = (C1290900jhI) t) != null) {
            c1290900jhI.setIgnoreAttachStatus(z);
        }
    }

    @InterfaceC1291270jht(name = "json")
    public final void setJson(String str) {
        if (str != null && str.length() != 0) {
            this.LLLLZLL = str;
            ((C1291330jhz) this.LLLLLILLIL).setImageAssetDelegate(this);
            g$c g_c = new g$c(this, str);
            this.LLZLI = g_c;
            C1290610jgp.LJI(str, this, g_c);
        }
    }

    @InterfaceC1291270jht(defaultBoolean = true, name = "keeplastframe")
    public final void setKeepLastFrame(boolean z) {
        this.LLLLLLLZIL = z;
    }

    @InterfaceC1291270jht(defaultBoolean = false, name = "loop")
    public final void setLoop(boolean z) {
        if (z) {
            ((C1291330jhz) this.LLLLLILLIL).setRepeatCount(-1);
        } else {
            ((C1291330jhz) this.LLLLLILLIL).setRepeatCount(0);
        }
    }

    @InterfaceC1291270jht(defaultInt = 1, name = "loop-count")
    public final void setLoopCount(int i) {
        if (i <= 0) {
            ((C1291330jhz) this.LLLLLILLIL).setRepeatCount(-1);
        } else {
            ((C1291330jhz) this.LLLLLILLIL).setRepeatCount(i - 1);
        }
    }

    @InterfaceC1291270jht(name = "objectfit")
    public final void setObjectFit(String str) {
        ImageView.ScaleType scaleType;
        if (Intrinsics.LJFF(str, "cover")) {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        } else if (Intrinsics.LJFF(str, "contain")) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        } else {
            scaleType = ImageView.ScaleType.CENTER;
        }
        ((ImageView) this.LLLLLILLIL).setScaleType(scaleType);
    }

    @InterfaceC1291270jht(name = "playstatus")
    public final void setPlayStatus(String str) {
        if (Intrinsics.LJFF("play", str)) {
            ((C1291330jhz) this.LLLLLILLIL).playAnimation();
            this.LLLLZI = true;
            this.LLLLLLZZ = false;
        } else {
            if (!Intrinsics.LJFF("pause", str)) {
                return;
            }
            ((C1291330jhz) this.LLLLLILLIL).cancelAnimation();
            this.LLLLLLZZ = true;
        }
    }

    @InterfaceC1291270jht(name = "progress")
    public final void setProgress(float f) {
        if (f >= 0.0f || f <= 1.0f) {
            ((C1291330jhz) this.LLLLLILLIL).setProgress(f);
        }
    }

    @InterfaceC1291270jht(defaultInt = -1, name = "repetcount")
    public final void setRepeat(int i) {
        if (i < 0) {
            i = -1;
        }
        ((C1291330jhz) this.LLLLLILLIL).setRepeatCount(i);
    }

    @InterfaceC1291270jht(name = "auto-reverse")
    public final void setReverseMode(boolean z) {
        if (z) {
            ((C1291330jhz) this.LLLLLILLIL).setRepeatMode(2);
        } else {
            ((C1291330jhz) this.LLLLLILLIL).setRepeatMode(1);
        }
    }

    @InterfaceC1291270jht(name = "speed")
    public final void setSpeed(float f) {
        boolean z;
        ((C1291330jhz) this.LLLLLILLIL).setSpeed(f);
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        this.LLLLLLLZIL = z;
    }

    @InterfaceC1291270jht(name = "src")
    public final void setSrc(String str) {
        Intrinsics.LJIIJJI(str, "load lottie: ");
        if (str != null && !a0.LJJJIL(str)) {
            LJLL();
            ((C1291330jhz) this.LLLLLILLIL).setImageDrawable(null);
            synchronized (this) {
                try {
                    Iterator<C1323050kX9<?>> it2 = this.LLZ.iterator();
                    while (it2.hasNext()) {
                        C1323050kX9.LJII(it2.next());
                    }
                    this.LLZ.clear();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            ((C1291330jhz) this.LLLLLILLIL).setMinFrame(this.LLZIL);
            ((C1291330jhz) this.LLLLLILLIL).setMaxFrame(this.LLZILL);
            new C1290490jgd(new ACallableS68S1100000_20(this, str, 6));
        }
    }

    @InterfaceC1291270jht(name = "src-format")
    public final void setSrcFormat(String str) {
        if (str != null && !a0.LJJJIL(str)) {
            LJLL();
            new C1290490jgd(new ACallableS68S1100000_20(this, str, 6));
        }
    }

    @InterfaceC1291270jht(name = "src-polyfill")
    public final void setSrcPolyfill(ReadableMap readableMap) {
        this.LLLZIIL = readableMap;
        C1291600jiQ c1291600jiQ = this.LLLZLZ;
        if (c1291600jiQ != null && readableMap != null) {
            new C1290490jgd(new ACallableS92S0400000_20(readableMap, new C1290890jhH(this), c1291600jiQ, this, 1));
        }
    }

    @InterfaceC1291270jht(defaultInt = 0, name = "startframe")
    public final void setStartFrame(int i) {
        this.LLZIL = i;
        ((C1291330jhz) this.LLLLLILLIL).setMinFrame(i);
    }

    @InterfaceC1291270jht(defaultInt = 0, name = "start-frame")
    public final void setStartFrame2(int i) {
        setStartFrame(i);
    }

    public static final Map<String, Object> LJLLILLLL(int i, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("code", Integer.valueOf(i));
        linkedHashMap.put("msg", str);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00de  */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.String] */
    @Override // X.InterfaceC1290690jgx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(X.C1290800jh8 r6, final X.C1290650jgt r7) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1290850jhD.LJIJI(X.0jh8, X.0jgt):void");
    }

    public final void LJZ(String str, Map<String, Object> map) {
        C1298420jtQ c1298420jtQ;
        Set<String> set = this.LLLLLZ;
        if (set != null && set.contains(str)) {
            if (C1290750jh3.LIZ()) {
                AbstractC1317090kNX abstractC1317090kNX = this.LLILZ;
                if (abstractC1317090kNX != null && (c1298420jtQ = abstractC1317090kNX.LLILLL) != null) {
                    c1298420jtQ.LIZJ(new o(map, str, this.LLJJ));
                    return;
                }
                return;
            }
            C1290750jh3.LIZLLL(new ARunnableS24S1200000_20(map, str, this, 16));
        }
    }

    @InterfaceC1966907n9
    public final void getDuration(ReadableMap readableMap, Callback callback) {
        C1297860jsW c1297860jsW = new C1297860jsW();
        T t = this.LLLLLILLIL;
        if (t != 0) {
            c1297860jsW.putInt("data", (int) ((C1291330jhz) t).getDuration());
            callback.invoke(0, c1297860jsW);
        } else {
            c1297860jsW.putString("message", "view is not exist");
            callback.invoke(1, c1297860jsW);
        }
    }

    @InterfaceC1966907n9
    public final void isAnimating(ReadableMap readableMap, Callback callback) {
        boolean z;
        C1297860jsW c1297860jsW = new C1297860jsW();
        T t = this.LLLLLILLIL;
        if (t != 0) {
            ChoreographerFrameCallbackC1291420ji8 choreographerFrameCallbackC1291420ji8 = ((C1291330jhz) t).LLILLL.LLILLL;
            if (choreographerFrameCallbackC1291420ji8 == null) {
                z = false;
            } else {
                z = choreographerFrameCallbackC1291420ji8.LLJIJIL;
            }
            c1297860jsW.putBoolean("data", z);
            callback.invoke(0, c1297860jsW);
            return;
        }
        c1297860jsW.putString("message", "view is not exist");
        callback.invoke(1, c1297860jsW);
    }

    @InterfaceC1966907n9
    public final void listenAnimationUpdate(ReadableMap readableMap, Callback callback) {
        C1297860jsW c1297860jsW = new C1297860jsW();
        if (this.LLLLLILLIL != 0) {
            c1297860jsW.putBoolean("data", true);
            this.LLLLZLLLI = readableMap.getBoolean("isListen");
            callback.invoke(0, c1297860jsW);
        } else {
            c1297860jsW.putString("message", "view is not exist");
            callback.invoke(1, c1297860jsW);
        }
    }

    @InterfaceC1966907n9
    public final void pause(ReadableMap readableMap, Callback callback) {
        C1297860jsW c1297860jsW = new C1297860jsW();
        T t = this.LLLLLILLIL;
        if (t != 0) {
            try {
                ((C1291330jhz) t).pauseAnimation();
                callback.invoke(0, c1297860jsW);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                c1297860jsW.putString("message:", e.getMessage());
                callback.invoke(1, c1297860jsW);
                return;
            }
        }
        c1297860jsW.putString("message", "view is not exist");
        callback.invoke(1, c1297860jsW);
    }

    @InterfaceC1966907n9
    public final void play(ReadableMap readableMap, Callback callback) {
        this.LLLZI = UUID.randomUUID().toString();
        C1297860jsW c1297860jsW = new C1297860jsW();
        T t = this.LLLLLILLIL;
        if (t != 0) {
            try {
                ((C1291330jhz) t).playAnimation();
                callback.invoke(0, c1297860jsW);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                c1297860jsW.putString("message:", e.getMessage());
                callback.invoke(1, c1297860jsW);
                return;
            }
        }
        c1297860jsW.putString("message", "view is not exist");
        callback.invoke(1, c1297860jsW);
    }

    @InterfaceC1966907n9
    public final void resume(ReadableMap readableMap, Callback callback) {
        this.LLLZI = UUID.randomUUID().toString();
        C1297860jsW c1297860jsW = new C1297860jsW();
        T t = this.LLLLLILLIL;
        if (t != 0) {
            try {
                C1291330jhz c1291330jhz = (C1291330jhz) t;
                c1291330jhz.LLILLL.LJ();
                c1291330jhz.LIZJ();
                callback.invoke(0, c1297860jsW);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                c1297860jsW.putString("message:", e.getMessage());
                callback.invoke(1, c1297860jsW);
            }
        } else {
            c1297860jsW.putString("message", "view is not exist");
            callback.invoke(1, c1297860jsW);
        }
        if (this.LLLLLILLIL == 0) {
            c1297860jsW.putString("message", "view is not exist");
            callback.invoke(1, c1297860jsW);
        }
    }

    @InterfaceC1966907n9
    public final void seek(ReadableMap readableMap, Callback callback) {
        C1297860jsW c1297860jsW = new C1297860jsW();
        if (this.LLLLLILLIL != 0) {
            ((C1291330jhz) this.LLLLLILLIL).setFrame(readableMap.getInt("frame"));
            callback.invoke(0, c1297860jsW);
        } else {
            c1297860jsW.putString("message", "view is not exist");
            callback.invoke(1, c1297860jsW);
        }
    }

    @InterfaceC1966907n9
    public final void stop(ReadableMap readableMap, Callback callback) {
        C1291430ji9 c1291430ji9;
        C1297860jsW c1297860jsW = new C1297860jsW();
        T t = this.LLLLLILLIL;
        if (t != 0) {
            try {
                C1291330jhz c1291330jhz = (C1291330jhz) t;
                if (c1291330jhz != null) {
                    c1291330jhz.cancelAnimation();
                    Drawable drawable = c1291330jhz.getDrawable();
                    if ((drawable instanceof C1291430ji9) && (c1291430ji9 = (C1291430ji9) drawable) != null) {
                        c1291430ji9.stop();
                    }
                }
                callback.invoke(0, c1297860jsW);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                c1297860jsW.putString("message:", e.getMessage());
                callback.invoke(1, c1297860jsW);
                return;
            }
        }
        c1297860jsW.putString("message", "view is not exist");
        callback.invoke(1, c1297860jsW);
    }

    @InterfaceC1966907n9
    public final void subscribeUpdateEvent(ReadableMap readableMap, Callback callback) {
        int i = readableMap.getInt("frame");
        if (!((ArrayList) this.LLLZIL).contains(Integer.valueOf(i))) {
            ((ArrayList) this.LLLZIL).add(Integer.valueOf(i));
            ArrayList arrayList = (ArrayList) this.LLLZIL;
            if (arrayList.size() > 1) {
                C08XD.LJJ(arrayList, new AComparatorS39S0000000_20(20));
            }
            if (callback != null) {
                callback.invoke(0);
                return;
            }
            return;
        }
        if (callback == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("already subscribeUpdateEvent with ");
        sbLIZ.append(i);
        sbLIZ.append(" frame");
        callback.invoke(1, C2188811AlT.LIZIZ(sbLIZ));
    }

    @InterfaceC1966907n9
    public final void unsubscribeUpdateEvent(ReadableMap readableMap, Callback callback) {
        int i = readableMap.getInt("frame");
        if (((ArrayList) this.LLLZIL).contains(Integer.valueOf(i))) {
            ((ArrayList) this.LLLZIL).remove(Integer.valueOf(i));
            if (callback != null) {
                callback.invoke(0);
                return;
            }
            return;
        }
        if (callback == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append(" frame is not subscribed");
        callback.invoke(1, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJLLJ(int i, String str, String str2) throws JSONException {
        LJZ("error", LJLLILLLL(i, str));
        this.LLLZLL.LIZIZ(this.LLLLZLL, str2, str);
    }

    public static final Map<String, Object> LJLLI(int i, int i2, int i3, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("current", Integer.valueOf(i));
        linkedHashMap.put("total", Integer.valueOf(i2));
        linkedHashMap.put("loopIndex", Integer.valueOf(i3));
        linkedHashMap.put("animationID", str);
        return linkedHashMap;
    }

    public final void LJLZ(String str, final String str2, final C1290800jh8 c1290800jh8, final g$a g_a) {
        final String strLIZ = C1294030jmL.LIZ(this.LLILZ, str, false);
        Intrinsics.LJIIJJI(strLIZ, "requestBitmap: ");
        Uri uri = UriProtector.parse(strLIZ);
        if (uri != null && uri.getPath() != null) {
            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uri);
            c1325700kbQLIZLLL.LJIIL = EnumC1331380kka.HIGH;
            C1315790kLR.LIZ(c1325700kbQLIZLLL);
            final String path = uri.getPath();
            if (path != null && !c1290800jh8.LJFF) {
                c1325700kbQLIZLLL.LJIILIIL = new AbstractC1291220jho() { // from class: X.0jhO
                    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0046: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:33554502), block:B:15:0x0046 */
                    @Override // X.AbstractC1291220jho, X.InterfaceC1291910jiv
                    public final C1323050kX9<Bitmap> process(Bitmap bitmap, AbstractC1301670jyf abstractC1301670jyf) throws Throwable {
                        C1323050kX9<Bitmap> c1323050kX9LJFF;
                        C1323050kX9 c1323050kX9;
                        C1323050kX9 c1323050kX92 = null;
                        try {
                            try {
                                try {
                                    c1323050kX9LJFF = abstractC1301670jyf.LJFF(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.RGB_565);
                                } catch (Throwable th) {
                                    th = th;
                                    c1323050kX92 = c1323050kX9;
                                    TryCatchGuardChecker.doCheck(th);
                                    C1323050kX9.LJII(c1323050kX92);
                                    throw th;
                                }
                            } catch (Exception e) {
                                e = e;
                                c1323050kX9LJFF = null;
                            }
                            try {
                                new Canvas(c1323050kX9LJFF.get()).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                                C1323050kX9<Bitmap> c1323050kX9LJFF2 = C1323050kX9.LJFF(c1323050kX9LJFF);
                                C1323050kX9.LJII(c1323050kX9LJFF);
                                return c1323050kX9LJFF2;
                            } catch (Exception e2) {
                                e = e2;
                                TryCatchGuardChecker.doCheck(e);
                                this.LIZ.LJLLJ(3, Intrinsics.LJIIJJI(path, "error happened when change bitmap from ARG_8888 to RGB_565, imagePath is "), path);
                                C1323050kX9.LJII(c1323050kX9LJFF);
                                return super.process(bitmap, abstractC1301670jyf);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                };
            }
            final InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSYLJI = C1322200kVm.LIZ().LJI(c1325700kbQLIZLLL.LIZ(), "byted-lottie");
            ((AbstractC1321260kUG) interfaceC1320200kSYLJI).LIZJ(new AbstractC1290140jg4() { // from class: X.0jh7
                @Override // X.C0HWE
                public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                    String message;
                    Throwable thLIZLLL = interfaceC1320200kSY.LIZLLL();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("requestBitmap failed! url: ");
                    sbLIZ.append((Object) strLIZ);
                    sbLIZ.append(" Reason: ");
                    String message2 = null;
                    if (thLIZLLL == null) {
                        message = null;
                    } else {
                        message = thLIZLLL.getMessage();
                    }
                    sbLIZ.append((Object) message);
                    C2188811AlT.LIZIZ(sbLIZ);
                    g$a g_a2 = g_a;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(" error msg is ");
                    if (thLIZLLL != null) {
                        message2 = thLIZLLL.getMessage();
                    }
                    sbLIZ2.append((Object) message2);
                    sbLIZ2.append('}');
                    g_a2.onFailed(C2188811AlT.LIZIZ(sbLIZ2));
                    interfaceC1320200kSY.close();
                }

                /* JADX WARN: Removed duplicated region for block: B:24:0x005d A[Catch: Exception -> 0x0061, all -> 0x0087, TRY_LEAVE, TryCatch #2 {Exception -> 0x0061, blocks: (B:20:0x004e, B:22:0x0056, B:24:0x005d), top: B:42:0x004e, outer: #0 }] */
                /* JADX WARN: Removed duplicated region for block: B:32:0x0081 A[Catch: all -> 0x0087, TRY_LEAVE, TryCatch #0 {all -> 0x0087, blocks: (B:6:0x0014, B:8:0x0018, B:11:0x001f, B:12:0x0029, B:14:0x002f, B:16:0x0035, B:19:0x0049, B:20:0x004e, B:22:0x0056, B:30:0x007d, B:24:0x005d, B:29:0x0072, B:32:0x0081, B:17:0x003a, B:28:0x0064), top: B:40:0x0014, inners: #1, #2 }] */
                @Override // X.AbstractC1290140jg4
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LJI(X.C1323050kX9<android.graphics.Bitmap> r9) {
                    /*
                        r8 = this;
                        java.lang.String r1 = "requestBitmap success. url: "
                        java.lang.String r0 = r1
                        kotlin.jvm.internal.Intrinsics.LJIIJJI(r0, r1)
                        if (r9 == 0) goto L8e
                        X.0jhD r2 = r4
                        z76.g$a r3 = r2
                        X.0jh8 r1 = r5
                        java.lang.String r5 = r1
                        java.lang.String r4 = r6
                        monitor-enter(r2)
                        boolean r0 = r2.LLZL     // Catch: java.lang.Throwable -> L87
                        if (r0 == 0) goto L1f
                        java.lang.String r0 = "the lottie-view is destroyed already."
                        r3.onFailed(r0)     // Catch: java.lang.Throwable -> L87
                        monitor-exit(r2)
                        return
                    L1f:
                        int r7 = r1.LIZ     // Catch: java.lang.Throwable -> L87
                        int r6 = r1.LIZIZ     // Catch: java.lang.Throwable -> L87
                        java.lang.Object r1 = r9.get()     // Catch: java.lang.Throwable -> L87
                        android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch: java.lang.Throwable -> L87
                        int r0 = r1.getWidth()     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> L87
                        if (r0 != r7) goto L3a
                        int r0 = r1.getHeight()     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> L87
                        if (r0 != r6) goto L3a
                        X.0kX9 r1 = r9.LIZLLL()     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> L87
                        goto L47
                    L3a:
                        r0 = 0
                        android.graphics.Bitmap r1 = android.graphics.Bitmap.createScaledBitmap(r1, r7, r6, r0)     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> L87
                        X.0Kro r0 = X.C530820Kro.LIZIZ()     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> L87
                        X.0kX9 r1 = X.C1323050kX9.LJJIZ(r1, r0)     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> L87
                    L47:
                        if (r1 == 0) goto L81
                        java.util.ArrayList<X.0kX9<?>> r0 = r2.LLZ     // Catch: java.lang.Throwable -> L87
                        r0.add(r1)     // Catch: java.lang.Throwable -> L87
                        java.lang.Object r0 = r1.get()     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L87
                        android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L87
                        if (r0 == 0) goto L5d
                        r3.LIZ(r0, r4)     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L87
                        kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L87
                        if (r0 != 0) goto L7d
                    L5d:
                        r3.onFailed(r4)     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L87
                        goto L7d
                    L61:
                        r1 = move-exception
                        goto L72
                    L63:
                        r1 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L87
                        java.lang.String r0 = "scale image failed, and detail is "
                        java.lang.String r1 = kotlin.jvm.internal.Intrinsics.LJIIJJI(r1, r0)     // Catch: java.lang.Throwable -> L87
                        r0 = 2
                        r2.LJLLJ(r0, r1, r5)     // Catch: java.lang.Throwable -> L87
                        goto L81
                    L72:
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L87
                        java.lang.String r0 = "requestBitmapSync, onNewResultImpl, error is "
                        kotlin.jvm.internal.Intrinsics.LJIIJJI(r1, r0)     // Catch: java.lang.Throwable -> L87
                        r3.onFailed(r4)     // Catch: java.lang.Throwable -> L87
                    L7d:
                        kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L87
                        if (r0 != 0) goto L8d
                    L81:
                        java.lang.String r0 = "failed when scaleBitmap"
                        r3.onFailed(r0)     // Catch: java.lang.Throwable -> L87
                        goto L8d
                    L87:
                        r0 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L87
                        monitor-exit(r2)
                        throw r0
                    L8d:
                        monitor-exit(r2)
                    L8e:
                        X.0kSY<X.0kX9<X.0kej>> r0 = r3
                        r0.close()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1290790jh7.LJI(X.0kX9):void");
                }
            }, C822700WPc.LL);
            return;
        }
        this.LLLZ = false;
        g_a.onFailed(Intrinsics.LJIIJJI(uri, "uri.path is null and uri is "));
    }
}
