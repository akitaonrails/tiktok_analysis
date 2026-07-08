package X;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0uFk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1696660uFk extends View {
    public static final C1698010uHv LLJIJIL = new C1698010uHv(0);
    public final View LL;
    public final C1697220uGe LLILLJJLI;
    public final C1695140uDI LLILLL;
    public boolean LLILZ;
    public Outline LLILZIL;
    public boolean LLILZLL;
    public InterfaceC1690500u5o LLIZ;
    public EnumC1671200tag LLIZLLLIL;
    public Function1<? super InterfaceC1675870tiD, Unit> LLJ;
    public C1695970uEd LLJI;

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.LLILZ) {
            return;
        }
        this.LLILZ = true;
        super.invalidate();
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.LLILZLL;
    }

    public final C1697220uGe getCanvasHolder() {
        return this.LLILLJJLI;
    }

    public final View getOwnerView() {
        return this.LL;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.LLILZLL;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) throws Throwable {
        C1697220uGe c1697220uGe = this.LLILLJJLI;
        C1696880uG6 c1696880uG6 = c1697220uGe.LIZ;
        Canvas canvas2 = c1696880uG6.LIZ;
        c1696880uG6.LIZ = canvas;
        C1695140uDI c1695140uDI = this.LLILLL;
        InterfaceC1690500u5o interfaceC1690500u5o = this.LLIZ;
        EnumC1671200tag enumC1671200tag = this.LLIZLLLIL;
        float width = getWidth();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        C1695970uEd c1695970uEd = this.LLJI;
        Function1<? super InterfaceC1675870tiD, Unit> function1 = this.LLJ;
        InterfaceC1690500u5o interfaceC1690500u5oLIZLLL = c1695140uDI.LLILLJJLI.LIZLLL();
        EnumC1671200tag enumC1671200tagLJ = c1695140uDI.LLILLJJLI.LJ();
        InterfaceC1686290tz1 interfaceC1686290tz1LIZ = c1695140uDI.LLILLJJLI.LIZ();
        long jLIZIZ = c1695140uDI.LLILLJJLI.LIZIZ();
        C1695230uDR c1695230uDR = c1695140uDI.LLILLJJLI;
        C1695970uEd c1695970uEd2 = c1695230uDR.LIZIZ;
        c1695230uDR.LJI(interfaceC1690500u5o);
        c1695230uDR.LJII(enumC1671200tag);
        c1695230uDR.LJFF(c1696880uG6);
        c1695230uDR.LIZJ(jFloatToRawIntBits);
        c1695230uDR.LIZIZ = c1695970uEd;
        c1696880uG6.save();
        try {
            function1.invoke(c1695140uDI);
            c1696880uG6.LJIIJ();
            C1695230uDR c1695230uDR2 = c1695140uDI.LLILLJJLI;
            c1695230uDR2.LJI(interfaceC1690500u5oLIZLLL);
            c1695230uDR2.LJII(enumC1671200tagLJ);
            c1695230uDR2.LJFF(interfaceC1686290tz1LIZ);
            c1695230uDR2.LIZJ(jLIZIZ);
            c1695230uDR2.LIZIZ = c1695970uEd2;
            c1697220uGe.LIZ.LIZ = canvas2;
            this.LLILZ = false;
        } catch (Throwable th) {
            th = th;
            while (true) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    c1696880uG6.LJIIJ();
                    C1695230uDR c1695230uDR3 = c1695140uDI.LLILLJJLI;
                    c1695230uDR3.LJI(interfaceC1690500u5oLIZLLL);
                    c1695230uDR3.LJII(enumC1671200tagLJ);
                    c1695230uDR3.LJFF(interfaceC1686290tz1LIZ);
                    c1695230uDR3.LIZJ(jLIZIZ);
                    c1695230uDR3.LIZIZ = c1695970uEd2;
                    throw th;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z) {
        if (this.LLILZLL != z) {
            this.LLILZLL = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.LLILZ = z;
    }

    public C1696660uFk(View view, C1697220uGe c1697220uGe, C1695140uDI c1695140uDI) {
        super(view.getContext());
        this.LL = view;
        this.LLILLJJLI = c1697220uGe;
        this.LLILLL = c1695140uDI;
        setOutlineProvider(LLJIJIL);
        this.LLILZLL = true;
        this.LLIZ = C1680440tpa.LIZ;
        this.LLIZLLLIL = EnumC1671200tag.Ltr;
        InterfaceC1695980uEe.LIZ.getClass();
        this.LLJ = C1695890uEV.LIZIZ;
        setWillNotDraw(false);
        setClipBounds(null);
    }
}
