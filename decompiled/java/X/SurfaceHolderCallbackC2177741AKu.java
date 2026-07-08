package X;

import android.os.Handler;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AKu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class SurfaceHolderCallbackC2177741AKu extends AbstractC2255721DQs<C1AKZ> implements C1AKZ, SurfaceHolder.Callback {
    public static final C1AL0 LLIZLLLIL = new Object() { // from class: X.1AL0
    };
    public final FrameLayout LL;
    public InterfaceC2177781AKy LLILZ;
    public SurfaceHolder LLILZIL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS567S0100000_23(this, 191));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS567S0100000_23(this, 192));
    public final Map<InterfaceC2177781AKy, C2177761AKw> LLILZLL = new LinkedHashMap();
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(237));

    public C1AKZ W1() {
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

    @Override // X.C1AKZ
    public SurfaceView LJIJJLI() {
        return o2();
    }

    @Override // X.C1AKZ
    public void vh() {
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveAnchorReuseSurfaceCoreComponent unBindCurrentConsumer ");
        sbLIZ.append((Object) null);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    public SurfaceHolderCallbackC2177741AKu(FrameLayout frameLayout) {
        this.LL = frameLayout;
    }

    private final void G2(InterfaceC2177781AKy interfaceC2177781AKy) {
        interfaceC2177781AKy.M0();
        C2177761AKw c2177761AKw = this.LLILZLL.get(interfaceC2177781AKy);
        if (c2177761AKw != null) {
            o2().setPivotX(c2177761AKw.LIZ);
            o2().setPivotY(c2177761AKw.LIZIZ);
            C786410Ut5.Nb(o2(), c2177761AKw.LIZJ);
            C786410Ut5.oc(o2(), c2177761AKw.LIZLLL);
            C786410Ut5.Ic(o2(), c2177761AKw.LJ);
            C786410Ut5.dd(o2(), c2177761AKw.LJFF);
            C786410Ut5.U5(o2(), c2177761AKw.LJI);
            C786410Ut5.a6(X1(), c2177761AKw.LJII);
        }
    }

    private final void H2(InterfaceC2177781AKy interfaceC2177781AKy) {
        if (interfaceC2177781AKy != null) {
            interfaceC2177781AKy.l2();
            this.LLILZLL.put(interfaceC2177781AKy, new C2177761AKw(o2().getPivotX(), o2().getPivotY(), o2().getScaleX(), o2().getScaleY(), o2().getTranslationX(), o2().getTranslationY(), o2().getLayoutParams(), X1().getLayoutParams()));
        }
    }

    private final void w2(InterfaceC2177781AKy interfaceC2177781AKy) {
        Pair pair;
        SurfaceHolder surfaceHolder = this.LLILZIL;
        if (surfaceHolder != null && surfaceHolder.getSurface() != null) {
            if (o2().getLayoutParams().width > 0 && o2().getLayoutParams().height > 0) {
                pair = new Pair(Integer.valueOf(o2().getLayoutParams().width), Integer.valueOf(o2().getLayoutParams().height));
            } else {
                pair = new Pair(Integer.valueOf(o2().getWidth()), Integer.valueOf(o2().getHeight()));
            }
            int iIntValue = ((Number) pair.getFirst()).intValue();
            int iIntValue2 = ((Number) pair.getSecond()).intValue();
            InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LiveAnchorReuseSurfaceCoreComponent onBindSurface ");
            sbLIZ.append(this.LLILZIL);
            sbLIZ.append(' ');
            sbLIZ.append(iIntValue);
            sbLIZ.append(' ');
            sbLIZ.append(iIntValue2);
            interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
            interfaceC2177781AKy.m2();
            interfaceC2177781AKy.n2();
        }
    }

    @Override // X.C1AKZ
    public void F82(InterfaceC2177781AKy interfaceC2177781AKy) {
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveAnchorReuseSurfaceCoreComponent unBindSurface ");
        sbLIZ.append(interfaceC2177781AKy);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZLL.remove(interfaceC2177781AKy);
        if (Intrinsics.LJFF(null, interfaceC2177781AKy)) {
            interfaceC2177781AKy.LLJLIL();
        }
    }

    @Override // X.C1AKZ
    public void i9(Integer num) {
        if (num == null) {
            X1().setBackground(null);
        } else {
            X1().setBackgroundColor(num.intValue());
        }
    }

    @Override // X.C1AKZ
    public void nH2(InterfaceC2177781AKy interfaceC2177781AKy) {
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveAnchorReuseSurfaceCoreComponent bindSurface ");
        sbLIZ.append(interfaceC2177781AKy);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        if (!Intrinsics.LJFF(interfaceC2177781AKy, null)) {
            H2(null);
            G2(interfaceC2177781AKy);
            w2(interfaceC2177781AKy);
            Z1().removeCallbacksAndMessages(null);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.LLILZIL = surfaceHolder;
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveAnchorReuseSurfaceCoreComponent surfaceCreated ");
        sbLIZ.append(this.LLILZIL);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveAnchorReuseSurfaceCoreComponent surfaceDestroyed ");
        sbLIZ.append(this.LLILZIL);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZIL = null;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.LLILZIL = surfaceHolder;
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveAnchorReuseSurfaceCoreComponent surfaceChanged ");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(' ');
        sbLIZ.append(i2);
        sbLIZ.append(' ');
        sbLIZ.append(i3);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
    }
}
