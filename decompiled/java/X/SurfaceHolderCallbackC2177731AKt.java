package X;

import android.os.Handler;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AKt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class SurfaceHolderCallbackC2177731AKt extends AbstractC2255721DQs<InterfaceC1452360nti> implements InterfaceC1452360nti, SurfaceHolder.Callback {
    public static final C2177791AKz LLIZLLLIL = new Object() { // from class: X.1AKz
    };
    public final FrameLayout LL;
    public InterfaceC2177771AKx LLILZ;
    public SurfaceHolder LLILZIL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS567S0100000_23(this, 213));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 544));
    public final Map<InterfaceC2177771AKx, C2177751AKv> LLILZLL = new LinkedHashMap();
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(262));

    public InterfaceC1452360nti W1() {
        return this;
    }

    private final Handler Z1() {
        return (Handler) this.LLIZ.getValue();
    }

    private final SurfaceView o2() {
        return (SurfaceView) this.LLILLJJLI.getValue();
    }

    public final FrameLayout X1() {
        return (FrameLayout) this.LLILLL.getValue();
    }

    @Override // X.InterfaceC1452360nti
    public SurfaceView LJIJJLI() {
        return o2();
    }

    @Override // X.InterfaceC1452360nti
    public void vh() {
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReuseSurfaceCoreComponent unBindCurrentConsumer consumer=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(" surface=");
        SurfaceHolder surfaceHolder = this.LLILZIL;
        sbLIZ.append(surfaceHolder != null ? surfaceHolder.getSurface() : null);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC2177771AKx interfaceC2177771AKx = this.LLILZ;
        if (interfaceC2177771AKx != null) {
            H2(interfaceC2177771AKx);
            interfaceC2177771AKx.LLJLIL();
        }
        this.LLILZ = null;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    public SurfaceHolderCallbackC2177731AKt(FrameLayout frameLayout) {
        this.LL = frameLayout;
    }

    private final void G2(InterfaceC2177771AKx interfaceC2177771AKx) {
        interfaceC2177771AKx.M0();
        C2177751AKv c2177751AKv = this.LLILZLL.get(interfaceC2177771AKx);
        if (c2177751AKv != null) {
            o2().setPivotX(c2177751AKv.LIZ);
            o2().setPivotY(c2177751AKv.LIZIZ);
            C786410Ut5.Nb(o2(), c2177751AKv.LIZJ);
            C786410Ut5.oc(o2(), c2177751AKv.LIZLLL);
            C786410Ut5.Ic(o2(), c2177751AKv.LJ);
            C786410Ut5.dd(o2(), c2177751AKv.LJFF);
            C786410Ut5.U5(o2(), c2177751AKv.LJI);
            C786410Ut5.a6(X1(), c2177751AKv.LJII);
        }
    }

    private final void H2(InterfaceC2177771AKx interfaceC2177771AKx) {
        if (interfaceC2177771AKx != null) {
            interfaceC2177771AKx.l2();
            this.LLILZLL.put(interfaceC2177771AKx, new C2177751AKv(o2().getPivotX(), o2().getPivotY(), o2().getScaleX(), o2().getScaleY(), o2().getTranslationX(), o2().getTranslationY(), o2().getLayoutParams(), X1().getLayoutParams()));
        }
    }

    private final void w2(InterfaceC2177771AKx interfaceC2177771AKx) {
        Surface surface;
        Pair pair;
        SurfaceHolder surfaceHolder = this.LLILZIL;
        if (surfaceHolder != null && (surface = surfaceHolder.getSurface()) != null) {
            if (o2().getLayoutParams().width > 0 && o2().getLayoutParams().height > 0) {
                pair = new Pair(Integer.valueOf(o2().getLayoutParams().width), Integer.valueOf(o2().getLayoutParams().height));
            } else {
                pair = new Pair(Integer.valueOf(o2().getWidth()), Integer.valueOf(o2().getHeight()));
            }
            int iIntValue = ((Number) pair.getFirst()).intValue();
            int iIntValue2 = ((Number) pair.getSecond()).intValue();
            InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ReuseSurfaceCoreComponent onBindSurface ");
            sbLIZ.append(this.LLILZIL);
            sbLIZ.append(' ');
            sbLIZ.append(iIntValue);
            sbLIZ.append(' ');
            sbLIZ.append(iIntValue2);
            interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
            interfaceC2177771AKx.WB(surface);
            interfaceC2177771AKx.LLIIZ(iIntValue, iIntValue2, surface);
        }
    }

    @Override // X.InterfaceC1452360nti
    public void Wn2(InterfaceC2177771AKx interfaceC2177771AKx) {
        Surface surface;
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReuseSurfaceCoreComponent unBindSurface consumer=");
        sbLIZ.append(interfaceC2177771AKx);
        sbLIZ.append(" current=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(" surface=");
        SurfaceHolder surfaceHolder = this.LLILZIL;
        if (surfaceHolder != null) {
            surface = surfaceHolder.getSurface();
        } else {
            surface = null;
        }
        sbLIZ.append(surface);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZLL.remove(interfaceC2177771AKx);
        if (Intrinsics.LJFF(this.LLILZ, interfaceC2177771AKx)) {
            interfaceC2177771AKx.LLJLIL();
            this.LLILZ = null;
        }
    }

    @Override // X.InterfaceC1452360nti
    public void d12(InterfaceC2177771AKx interfaceC2177771AKx) {
        Surface surface;
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReuseSurfaceCoreComponent bindSurface new=");
        sbLIZ.append(interfaceC2177771AKx);
        sbLIZ.append(" current=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(" surface=");
        SurfaceHolder surfaceHolder = this.LLILZIL;
        if (surfaceHolder != null) {
            surface = surfaceHolder.getSurface();
        } else {
            surface = null;
        }
        sbLIZ.append(surface);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        if (!Intrinsics.LJFF(interfaceC2177771AKx, this.LLILZ)) {
            H2(this.LLILZ);
            InterfaceC2177771AKx interfaceC2177771AKx2 = this.LLILZ;
            if (interfaceC2177771AKx2 != null) {
                interfaceC2177771AKx2.LLJLIL();
            }
            G2(interfaceC2177771AKx);
            w2(interfaceC2177771AKx);
            Z1().removeCallbacksAndMessages(null);
            this.LLILZ = interfaceC2177771AKx;
        }
    }

    @Override // X.InterfaceC1452360nti
    public void i9(Integer num) {
        if (num == null) {
            X1().setBackground(null);
        } else {
            X1().setBackgroundColor(num.intValue());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.LLILZIL = surfaceHolder;
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReuseSurfaceCoreComponent surfaceCreated holder=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(" surface=");
        sbLIZ.append(surfaceHolder.getSurface());
        sbLIZ.append(" consumer=");
        sbLIZ.append(this.LLILZ);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC2177771AKx interfaceC2177771AKx = this.LLILZ;
        if (interfaceC2177771AKx != null) {
            Surface surface = surfaceHolder.getSurface();
            o2().getWidth();
            o2().getHeight();
            interfaceC2177771AKx.WB(surface);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReuseSurfaceCoreComponent surfaceDestroyed holder=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(" surface=");
        sbLIZ.append(surfaceHolder.getSurface());
        sbLIZ.append(" consumer=");
        sbLIZ.append(this.LLILZ);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC2177771AKx interfaceC2177771AKx = this.LLILZ;
        if (interfaceC2177771AKx != null) {
            interfaceC2177771AKx.LLJLIL();
        }
        this.LLILZIL = null;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.LLILZIL = surfaceHolder;
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReuseSurfaceCoreComponent surfaceChanged holder=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(" surface=");
        sbLIZ.append(surfaceHolder.getSurface());
        sbLIZ.append(' ');
        sbLIZ.append(i2);
        sbLIZ.append('x');
        sbLIZ.append(i3);
        sbLIZ.append(" consumer=");
        sbLIZ.append(this.LLILZ);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC2177771AKx interfaceC2177771AKx = this.LLILZ;
        if (interfaceC2177771AKx != null) {
            interfaceC2177771AKx.LLIIZ(i2, i3, surfaceHolder.getSurface());
        }
    }
}
