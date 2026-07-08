package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RenderEffect;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.0uGX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1697150uGX extends View implements InterfaceC20054313dN {
    public static final AFwS311S0000000_25 LLJJI = AFwS311S0000000_25.get$arr$(2);
    public static final C1698010uHv LLJJIII = new C1698010uHv(1);
    public static Method LLJJIJI;
    public static Field LLJJIJIIJIL;
    public static boolean LLJJIJIL;
    public static boolean LLJJJ;
    public final AndroidComposeView LL;
    public final C1697200uGc LLILLJJLI;
    public Function2<? super InterfaceC1686290tz1, ? super C1695970uEd, Unit> LLILLL;
    public Function0<Unit> LLILZ;
    public final C1683000tti LLILZIL;
    public boolean LLILZLL;
    public Rect LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public final C1697220uGe LLJI;
    public final C1697180uGa<View> LLJIJIL;
    public long LLJILJIL;
    public boolean LLJILJILJ;
    public final long LLJILLL;
    public int LLJJ;

    @Override // X.InterfaceC20054313dN
    public final void destroy() {
        setInvalidated(false);
        AndroidComposeView androidComposeView = this.LL;
        androidComposeView.LLJLLIL = true;
        this.LLILLL = null;
        this.LLILZ = null;
        androidComposeView.LJJJJJL(this);
        C1697200uGc c1697200uGc = this.LLILLJJLI;
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1697200uGc, this);
        c1697200uGc.removeViewInLayout(this);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // X.InterfaceC20054313dN
    public final void LJIIIIZZ() {
        if (!this.LLIZLLLIL || LLJJJ) {
            return;
        }
        C1697210uGd.LIZ(this);
        setInvalidated(false);
    }

    public final void LJIIJJI() {
        Rect rect;
        if (this.LLILZLL) {
            Rect rect2 = this.LLIZ;
            if (rect2 == null) {
                this.LLIZ = new Rect(0, 0, getWidth(), getHeight());
            } else {
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.LLIZ;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return this.LL.getUniqueDrawingId();
        }
        return -1L;
    }

    @Override // X.InterfaceC20054313dN
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo67getUnderlyingMatrixsQKQjiQ() {
        return this.LLJIJIL.LIZIZ(this);
    }

    @Override // android.view.View, X.InterfaceC20054313dN
    public final void invalidate() {
        if (this.LLIZLLLIL) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.LL.invalidate();
    }

    private final InterfaceC1680960tqQ getManualClipPath() {
        if (!getClipToOutline()) {
            return null;
        }
        C1683000tti c1683000tti = this.LLILZIL;
        if (!c1683000tti.LJI) {
            return null;
        }
        c1683000tti.LJ();
        return c1683000tti.LJ;
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final C1697200uGc getContainer() {
        return this.LLILLJJLI;
    }

    public long getLayerId() {
        return this.LLJILLL;
    }

    public final AndroidComposeView getOwnerView() {
        return this.LL;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.LLJILJILJ;
    }

    private final void setInvalidated(boolean z) {
        if (z != this.LLIZLLLIL) {
            this.LLIZLLLIL = z;
            this.LL.LJJJIL(this, z);
        }
    }

    @Override // X.InterfaceC20054313dN
    public final void LIZ(long j) {
        int i = (int) (j >> 32);
        if (i != getLeft()) {
            offsetLeftAndRight(i - getLeft());
            this.LLJIJIL.LIZJ();
        }
        int iLIZJ = C1676820tjk.LIZJ(j);
        if (iLIZJ != getTop()) {
            offsetTopAndBottom(iLIZJ - getTop());
            this.LLJIJIL.LIZJ();
        }
    }

    @Override // X.InterfaceC20054313dN
    public final void LIZJ(long j) {
        C1698010uHv c1698010uHv;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (i != getWidth() || i2 != getHeight()) {
            setPivotX(C1676680tjW.LIZIZ(this.LLJILJIL) * i);
            setPivotY(C1676680tjW.LIZJ(this.LLJILJIL) * i2);
            if (this.LLILZIL.LIZIZ() != null) {
                c1698010uHv = LLJJIII;
            } else {
                c1698010uHv = null;
            }
            setOutlineProvider(c1698010uHv);
            layout(getLeft(), getTop(), getLeft() + i, getTop() + i2);
            LJIIJJI();
            this.LLJIJIL.LIZJ();
        }
    }

    @Override // X.InterfaceC20054313dN
    public final void LJ(float[] fArr) {
        C1696000uEg.LJFF(fArr, this.LLJIJIL.LIZIZ(this));
    }

    @Override // X.InterfaceC20054313dN
    public final boolean LJI(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j));
        if (this.LLILZLL) {
            if (0.0f <= fIntBitsToFloat && fIntBitsToFloat < getWidth() && 0.0f <= fIntBitsToFloat2 && fIntBitsToFloat2 < getHeight()) {
                return true;
            }
            return false;
        }
        if (!getClipToOutline()) {
            return true;
        }
        return this.LLILZIL.LIZJ(j);
    }

    @Override // X.InterfaceC20054313dN
    public final void LJII(float[] fArr) {
        float[] fArrLIZ = this.LLJIJIL.LIZ(this);
        if (fArrLIZ != null) {
            C1696000uEg.LJFF(fArr, fArrLIZ);
        }
    }

    @Override // X.InterfaceC20054313dN
    public final void LJIIIZ(C1696110uEr c1696110uEr) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        RenderEffect renderEffectLIZ;
        Function0<Unit> function0;
        C1698010uHv c1698010uHv;
        boolean z5;
        int i = c1696110uEr.LL | this.LLJJ;
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            long j = c1696110uEr.LLJILLL;
            this.LLJILJIL = j;
            setPivotX(C1676680tjW.LIZIZ(j) * getWidth());
            setPivotY(C1676680tjW.LIZJ(this.LLJILJIL) * getHeight());
        }
        if ((i & 1) != 0) {
            float f = c1696110uEr.LLILLJJLI;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setScaleX(f);
        }
        if ((i & 2) != 0) {
            float f2 = c1696110uEr.LLILLL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setScaleY(f2);
        }
        if ((i & 4) != 0) {
            float f3 = c1696110uEr.LLILZ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setAlpha(f3);
        }
        if ((i & 8) != 0) {
            float f4 = c1696110uEr.LLILZIL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setTranslationX(f4);
        }
        if ((i & 16) != 0) {
            float f5 = c1696110uEr.LLILZLL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setTranslationY(f5);
        }
        if ((i & 32) != 0) {
            setElevation(c1696110uEr.LLIZ);
        }
        if ((i & 1024) != 0) {
            float f6 = c1696110uEr.LLJILJIL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setRotation(f6);
        }
        if ((i & 256) != 0) {
            float f7 = c1696110uEr.LLJI;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setRotationX(f7);
        }
        if ((i & 512) != 0) {
            float f8 = c1696110uEr.LLJIJIL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setRotationY(f8);
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            setCameraDistancePx(c1696110uEr.LLJILJILJ);
        }
        boolean z6 = true;
        if (getManualClipPath() != null) {
            z = true;
        } else {
            z = false;
        }
        boolean z7 = c1696110uEr.LLJJI;
        if (z7 && c1696110uEr.LLJJ != C1669430tXp.LIZ) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 24576) != 0) {
            if (z7 && c1696110uEr.LLJJ == C1669430tXp.LIZ) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.LLILZLL = z5;
            LJIIJJI();
            setClipToOutline(z2);
        }
        boolean zLIZLLL = this.LLILZIL.LIZLLL(c1696110uEr.LLJJJIL, c1696110uEr.LLILZ, z2, c1696110uEr.LLIZ, c1696110uEr.LLJJIJI);
        C1683000tti c1683000tti = this.LLILZIL;
        if (c1683000tti.LJFF) {
            if (c1683000tti.LIZIZ() != null) {
                c1698010uHv = LLJJIII;
            } else {
                c1698010uHv = null;
            }
            setOutlineProvider(c1698010uHv);
        }
        if (getManualClipPath() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z != z3 || (z3 && zLIZLLL)) {
            invalidate();
        }
        if (!this.LLJ && getElevation() > 0.0f && (function0 = this.LLILZ) != null) {
            function0.invoke();
        }
        if ((i & 7963) != 0) {
            this.LLJIJIL.LIZJ();
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            if ((i & 64) != 0) {
                setOutlineAmbientShadowColor(C1685850tyJ.LJIIIZ(c1696110uEr.LLIZLLLIL));
            }
            if ((i & 128) != 0) {
                setOutlineSpotShadowColor(C1685850tyJ.LJIIIZ(c1696110uEr.LLJ));
            }
            if (i2 >= 31 && (131072 & i) != 0) {
                AbstractC1683790tuz abstractC1683790tuz = c1696110uEr.LLJJJ;
                if (abstractC1683790tuz != null) {
                    renderEffectLIZ = abstractC1683790tuz.LIZ();
                } else {
                    renderEffectLIZ = null;
                }
                setRenderEffect(renderEffectLIZ);
            }
        }
        if ((i & 32768) != 0) {
            int i3 = c1696110uEr.LLJJIII;
            if (i3 == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                setLayerType(2, null);
            } else if (i3 == 2) {
                setLayerType(0, null);
                z6 = false;
            } else {
                setLayerType(0, null);
            }
            this.LLJILJILJ = z6;
        }
        this.LLJJ = c1696110uEr.LL;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        C1697220uGe c1697220uGe = this.LLJI;
        C1696880uG6 c1696880uG6 = c1697220uGe.LIZ;
        Canvas canvas2 = c1696880uG6.LIZ;
        c1696880uG6.LIZ = canvas;
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z = false;
        } else {
            c1696880uG6.save();
            this.LLILZIL.LIZ(c1696880uG6);
            z = true;
        }
        Function2<? super InterfaceC1686290tz1, ? super C1695970uEd, Unit> function2 = this.LLILLL;
        if (function2 != null) {
            function2.invoke(c1696880uG6, null);
        }
        if (z) {
            c1696880uG6.LJIIJ();
        }
        c1697220uGe.LIZ.LIZ = canvas2;
        setInvalidated(false);
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // X.InterfaceC20054313dN
    public final void LIZIZ(AwS574S0100000_30 awS574S0100000_30, Function2 function2) {
        this.LLILLJJLI.addView(this);
        C1697180uGa<View> c1697180uGa = this.LLJIJIL;
        c1697180uGa.LJ = false;
        c1697180uGa.LJFF = false;
        c1697180uGa.LJII = true;
        c1697180uGa.LJI = true;
        C1696000uEg.LIZLLL(c1697180uGa.LIZJ);
        C1696000uEg.LIZLLL(c1697180uGa.LIZLLL);
        this.LLILZLL = false;
        this.LLJ = false;
        this.LLJILJIL = C1676680tjW.LIZIZ;
        this.LLILLL = function2;
        this.LLILZ = awS574S0100000_30;
        setInvalidated(false);
    }

    @Override // X.InterfaceC20054313dN
    public final void LIZLLL(InterfaceC1686290tz1 interfaceC1686290tz1, C1695970uEd c1695970uEd) {
        boolean z;
        if (getElevation() > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        this.LLJ = z;
        if (z) {
            interfaceC1686290tz1.LJIILLIIL();
        }
        this.LLILLJJLI.LIZ(interfaceC1686290tz1, this, getDrawingTime());
        if (this.LLJ) {
            interfaceC1686290tz1.LIZ();
        }
    }

    @Override // X.InterfaceC20054313dN
    public final long LJFF(long j, boolean z) {
        if (z) {
            C1697180uGa<View> c1697180uGa = this.LLJIJIL;
            float[] fArrLIZ = c1697180uGa.LIZ(this);
            if (fArrLIZ == null) {
                return 9187343241974906880L;
            }
            if (c1697180uGa.LJII) {
                return j;
            }
            return C1696000uEg.LIZIZ(j, fArrLIZ);
        }
        C1697180uGa<View> c1697180uGa2 = this.LLJIJIL;
        float[] fArrLIZIZ = c1697180uGa2.LIZIZ(this);
        if (c1697180uGa2.LJII) {
            return j;
        }
        return C1696000uEg.LIZIZ(j, fArrLIZIZ);
    }

    @Override // X.InterfaceC20054313dN
    public final void LJIIJ(C1696010uEh c1696010uEh, boolean z) {
        if (z) {
            C1697180uGa<View> c1697180uGa = this.LLJIJIL;
            float[] fArrLIZ = c1697180uGa.LIZ(this);
            if (fArrLIZ == null) {
                c1696010uEh.LIZ = 0.0f;
                c1696010uEh.LIZIZ = 0.0f;
                c1696010uEh.LIZJ = 0.0f;
                c1696010uEh.LIZLLL = 0.0f;
                return;
            }
            if (c1697180uGa.LJII) {
                return;
            }
            C1696000uEg.LIZJ(fArrLIZ, c1696010uEh);
            return;
        }
        C1697180uGa<View> c1697180uGa2 = this.LLJIJIL;
        float[] fArrLIZIZ = c1697180uGa2.LIZIZ(this);
        if (c1697180uGa2.LJII) {
            return;
        }
        C1696000uEg.LIZJ(fArrLIZIZ, c1696010uEh);
    }

    public C1697150uGX(AndroidComposeView androidComposeView, C1697200uGc c1697200uGc, Function2 function2, AwS574S0100000_30 awS574S0100000_30) {
        super(androidComposeView.getContext());
        this.LL = androidComposeView;
        this.LLILLJJLI = c1697200uGc;
        this.LLILLL = function2;
        this.LLILZ = awS574S0100000_30;
        this.LLILZIL = new C1683000tti();
        this.LLJI = new C1697220uGe();
        this.LLJIJIL = new C1697180uGa<>(LLJJI);
        this.LLJILJIL = C1676680tjW.LIZIZ;
        this.LLJILJILJ = true;
        setWillNotDraw(false);
        c1697200uGc.addView(this);
        this.LLJILLL = View.generateViewId();
    }
}
