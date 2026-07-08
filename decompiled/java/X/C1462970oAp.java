package X;

import android.graphics.Rect;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0oAp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1462970oAp extends AbstractC2255721DQs<InterfaceC1461350o8D> implements InterfaceC1461350o8D {
    public C1462070o9N LL;
    public Function0<Rect> LLJLLL;
    public final LiveEvent<Pair<Float, Long>> LLILLJJLI = new C560530Lyd();
    public final LiveEvent<C443120HZe<Float, Float, Float>> LLILLL = new C560530Lyd();
    public final LiveEvent<Pair<Float, Long>> LLILZ = new C560530Lyd();
    public final LiveEvent<C443120HZe<Float, Float, Float>> LLILZIL = new C560530Lyd();
    public final LiveEvent<C443120HZe<Float, Float, Float>> LLILZLL = new C560530Lyd();
    public final LiveEvent<Integer> LLIZ = new C560530Lyd();
    public final LiveEvent<Unit> LLIZLLLIL = new C560530Lyd();
    public final LiveEvent<Pair<Effect, String>> LLJ = new C560530Lyd();
    public final LiveEvent<Unit> LLJI = new C560530Lyd();
    public final LiveEvent<Unit> LLJIJIL = new C560530Lyd();
    public final LiveEvent<Boolean> LLJILJIL = new C560530Lyd();
    public final LiveEvent<C443120HZe<Boolean, Boolean, Function0<Unit>>> LLJILJILJ = new C560530Lyd();
    public final LiveEvent<Boolean> LLJILLL = new C560530Lyd();
    public final LiveEvent<Pair<Integer, Integer>> LLJJ = new C560530Lyd();
    public final LiveEvent<Unit> LLJJI = new C560530Lyd();
    public final LiveEvent<Pair<Integer, Boolean>> LLJJIII = new C560530Lyd();
    public final LiveEvent<Unit> LLJJIJI = new C560530Lyd();
    public final LiveEvent<Unit> LLJJIJIIJIL = new C560530Lyd();
    public final LiveEvent<Boolean> LLJJIJIL = new C560530Lyd();
    public final C560530Lyd<Unit> LLJJJ = new C560530Lyd<>();
    public final LiveEvent<Unit> LLJJJIL = new C560530Lyd();
    public final C01GW LLJJJJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(249));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(248));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(243));
    public final C01GW LLJJL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(242));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(241));
    public final C01GW LLJL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(240));
    public final C01GW LLJLIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(247));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(237));
    public final C01GW LLJLL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(246));
    public final MutableLiveData<Integer> LLJLLIL = new MutableLiveData<>();
    public final C01GW LLJZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(238));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(239));
    public final C01GW LLL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(244));
    public final C01GW LLLF = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(245));

    public InterfaceC1461350o8D W1() {
        return this;
    }

    public void hide() {
    }

    public void show() {
    }

    public void vi1() {
    }

    @Override // X.InterfaceC1461350o8D
    public MutableLiveData<Unit> Bd0() {
        return (MutableLiveData) this.LLJLL.getValue();
    }

    @Override // X.InterfaceC1455010nxz
    public boolean C1() {
        C1462070o9N c1462070o9N = this.LL;
        if (c1462070o9N != null) {
            return c1462070o9N.C1();
        }
        return false;
    }

    @Override // X.InterfaceC1461350o8D
    public C560530Lyd<Boolean> CP2() {
        return (C560530Lyd) this.LLL.getValue();
    }

    @Override // X.InterfaceC1461350o8D
    public MutableLiveData<Boolean> CQ0() {
        return (MutableLiveData) this.LLJJJJJIL.getValue();
    }

    @Override // X.InterfaceC1461350o8D
    public C560530Lyd<Boolean> DO2() {
        return (C560530Lyd) this.LLLF.getValue();
    }

    @Override // X.InterfaceC1461350o8D
    public void E92() {
        C1462070o9N c1462070o9N = this.LL;
        if (c1462070o9N != null) {
            FrameLayout frameLayout = c1462070o9N.LLLFZ;
            if (frameLayout == null) {
                frameLayout = null;
            }
            C786410Ut5.LJZ(0, frameLayout);
        }
    }

    @Override // X.InterfaceC1461350o8D
    public void Ic1() {
        C122Q c122q;
        C1462070o9N c1462070o9N = this.LL;
        if (c1462070o9N == null || (c122q = c1462070o9N.LLLLLJLJLL) == null) {
            return;
        }
        c122q.Eu(false);
    }

    @Override // X.InterfaceC1461350o8D
    public MutableLiveData<Boolean> Mk0() {
        return (MutableLiveData) this.LLJJL.getValue();
    }

    @Override // X.InterfaceC1461350o8D
    public void N00() {
        C122Q c122q;
        C1462070o9N c1462070o9N = this.LL;
        if (c1462070o9N == null || (c122q = c1462070o9N.LLLLLJLJLL) == null) {
            return;
        }
        c122q.Eu(true);
    }

    @Override // X.InterfaceC1461350o8D
    public InterfaceC1465230oET Nn1() {
        C1462070o9N c1462070o9N = this.LL;
        if (c1462070o9N != null) {
            return c1462070o9N.LLLLLLIL;
        }
        return null;
    }

    @Override // X.InterfaceC1461350o8D
    public MutableLiveData<Unit> Pn() {
        return (MutableLiveData) this.LLJLILLLLZIIL.getValue();
    }

    @Override // X.InterfaceC1461350o8D
    public MutableLiveData<Boolean> QE2() {
        return (MutableLiveData) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // X.InterfaceC1461350o8D
    public InterfaceC1459040o4U Qr2() {
        C1462070o9N c1462070o9N = this.LL;
        if (c1462070o9N != null) {
            return (InterfaceC1459040o4U) c1462070o9N.LLLIZZ.getValue();
        }
        return null;
    }

    @Override // X.InterfaceC1461350o8D
    public void TJ() {
        InterfaceC391240FVq interfaceC391240FVqLLLLLLIL;
        C1462070o9N c1462070o9N = this.LL;
        if (c1462070o9N == null || (interfaceC391240FVqLLLLLLIL = c1462070o9N.LLLLLLIL()) == null) {
            return;
        }
        interfaceC391240FVqLLLLLLIL.hide();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    @Override // X.InterfaceC1461350o8D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C0EZ1 WM2() {
        /*
            r2 = this;
            X.0o9N r0 = r2.LL
            if (r0 == 0) goto L23
            boolean r0 = r0.mViewDestroyed
            r1 = 1
            if (r0 != r1) goto L23
        L9:
            r0 = 0
            if (r1 != 0) goto L22
            X.0o9N r1 = r2.LL
            if (r1 == 0) goto L22
            android.content.Context r1 = X.C545820Lau.LIZIZ(r1)
            if (r1 == 0) goto L22
            X.0o9N r1 = r2.LL
            if (r1 == 0) goto L22
            X.01GW r0 = r1.LLLJ
            java.lang.Object r0 = r0.getValue()
            X.0EZ1 r0 = (X.C0EZ1) r0
        L22:
            return r0
        L23:
            r1 = 0
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1462970oAp.WM2():X.0EZ1");
    }

    @Override // X.InterfaceC1461350o8D
    public MutableLiveData<Boolean> cY() {
        return (MutableLiveData) this.LLJL.getValue();
    }

    @Override // X.InterfaceC1455010nxz
    public MutableLiveData<Boolean> fz0() {
        return (MutableLiveData) this.LLJLIL.getValue();
    }

    @Override // X.InterfaceC1461350o8D
    public C560530Lyd<Unit> hq0() {
        return (C560530Lyd) this.LLJZIJLIL.getValue();
    }

    @Override // X.InterfaceC1461350o8D
    public MutableLiveData<Boolean> rb() {
        return (MutableLiveData) this.LLJJJJLIIL.getValue();
    }

    @Override // X.InterfaceC1461350o8D
    public void t41() {
        C1462070o9N c1462070o9N = this.LL;
        if (c1462070o9N != null) {
            FrameLayout frameLayout = c1462070o9N.LLLFZ;
            if (frameLayout == null) {
                frameLayout = null;
            }
            C786410Ut5.LJZ(4, frameLayout);
        }
    }

    @Override // X.InterfaceC1455010nxz
    public String tB2() {
        C122Q c122q;
        String textContent;
        C1462070o9N c1462070o9N = this.LL;
        return (c1462070o9N == null || (c122q = c1462070o9N.LLLLLJLJLL) == null || (textContent = c122q.getTextContent()) == null) ? "" : textContent;
    }

    @Override // X.InterfaceC1461350o8D
    public InterfaceC391240FVq u30() {
        C1462070o9N c1462070o9N = this.LL;
        if (c1462070o9N != null) {
            return c1462070o9N.LLLLLLIL();
        }
        return null;
    }

    @Override // X.InterfaceC1461350o8D
    public MutableLiveData<Unit> wU1() {
        return (MutableLiveData) this.LLJZ.getValue();
    }

    @Override // X.InterfaceC1461350o8D
    public MutableLiveData<Boolean> zP1() {
        return (MutableLiveData) this.LLJJJJ.getValue();
    }

    @Override // X.InterfaceC1461350o8D
    public InterfaceC1465010oE7 zi0() {
        C1462070o9N c1462070o9N = this.LL;
        if (c1462070o9N != null) {
            return (InterfaceC1465010oE7) c1462070o9N.LLLILZJ.getValue();
        }
        return null;
    }

    @Override // X.InterfaceC1461350o8D
    public void Bl() {
        ((C560530Lyd) kx1()).LJIIJ(Unit.LIZ);
    }

    @Override // X.InterfaceC1461350o8D
    public void HO2() {
        ((C560530Lyd) ia1()).LJIIJ(Unit.LIZ);
    }

    @Override // X.InterfaceC1461350o8D
    public void Ho() {
        ((C560530Lyd) Vk2()).LJIIJ(Unit.LIZ);
    }

    @Override // X.InterfaceC1461350o8D
    public void LLJJIJIL() {
        ((C560530Lyd) Aa()).LJIIJ(Unit.LIZ);
    }

    @Override // X.InterfaceC1461350o8D
    public void RB2() {
        hq0().LJIIJ(Unit.LIZ);
    }

    @Override // X.InterfaceC1461350o8D
    public void U4() {
        ((C560530Lyd) Vo()).LJIIJ(Unit.LIZ);
    }

    @Override // X.InterfaceC1461350o8D
    public void Xc0() {
        cY().setValue(Boolean.TRUE);
    }

    @Override // X.InterfaceC1461350o8D
    public void hD() {
        wU1().setValue(Unit.LIZ);
    }

    @Override // X.InterfaceC1455010nxz
    public void u1() {
        ((C560530Lyd) wq()).LJIIJ(Unit.LIZ);
    }

    @Override // X.InterfaceC1461350o8D
    public void wT0() {
        ((C560530Lyd) AJ2()).LJIIJ(Unit.LIZ);
    }

    @Override // X.InterfaceC1461350o8D
    public LiveEvent<Pair<Float, Long>> AB0() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1461350o8D
    public LiveEvent<Unit> AJ2() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1461350o8D
    public LiveEvent<Unit> Aa() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC1461350o8D
    public LiveEvent<Boolean> Go1() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC1461350o8D
    public MutableLiveData<Integer> Pr0() {
        return this.LLJLLIL;
    }

    @Override // X.InterfaceC1461350o8D
    public LiveEvent<C443120HZe<Float, Float, Float>> QR0() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1461350o8D
    public LiveEvent<Integer> RW() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1461350o8D
    public Function0<Rect> Rn0() {
        return this.LLJLLL;
    }

    @Override // X.InterfaceC1461350o8D
    public LiveEvent<C443120HZe<Boolean, Boolean, Function0<Unit>>> UK0() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1461350o8D
    public LiveEvent<Unit> Vk2() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1461350o8D
    public LiveEvent<Unit> Vo() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC1461350o8D
    public LiveEvent<Pair<Integer, Boolean>> c6() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC1461350o8D
    public LiveEvent<C443120HZe<Float, Float, Float>> dk2() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1461350o8D
    public LiveEvent<Pair<Integer, Integer>> ep2() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC1461350o8D
    public LiveEvent<Pair<Effect, String>> gD0() {
        return this.LLJ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC1461350o8D
    public LiveEvent<Boolean> i71() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC1461350o8D
    public C560530Lyd<Unit> iV() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC1461350o8D
    public LiveEvent<Unit> ia1() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC1461350o8D
    public LiveEvent<Pair<Float, Long>> kg0() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1461350o8D
    public LiveEvent<Unit> kx1() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1461350o8D
    public LiveEvent<Boolean> pk2() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1461350o8D
    public LiveEvent<Unit> wq() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC1461350o8D
    public LiveEvent<C443120HZe<Float, Float, Float>> yH0() {
        return this.LLILLL;
    }

    public C1462970oAp(C1DRG c1drg) {
    }

    @Override // X.InterfaceC1461350o8D
    public void CU(boolean z) {
        C1462070o9N c1462070o9N;
        InterfaceC391240FVq interfaceC391240FVqLLLLLLIL;
        InterfaceC391240FVq interfaceC391240FVqLLLLLLIL2;
        C1462070o9N c1462070o9N2 = this.LL;
        if (c1462070o9N2 != null && (interfaceC391240FVqLLLLLLIL2 = c1462070o9N2.LLLLLLIL()) != null) {
            interfaceC391240FVqLLLLLLIL2.show();
        }
        if (z && (c1462070o9N = this.LL) != null && (interfaceC391240FVqLLLLLLIL = c1462070o9N.LLLLLLIL()) != null) {
            interfaceC391240FVqLLLLLLIL.Vv();
        }
    }

    @Override // X.InterfaceC1461350o8D
    public void KL(boolean z) {
        ((C560530Lyd) Go1()).LJIIJ(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1461350o8D
    public void Xe2(int i) {
        ((C560530Lyd) RW()).LJIIJ(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1455010nxz
    public void a92(boolean z) {
        ((C560530Lyd) pk2()).LJIIJ(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1461350o8D
    public void f61(Function0<Rect> function0) {
        this.LLJLLL = function0;
    }

    @Override // X.InterfaceC1455010nxz
    public void l0(Pair<Integer, Integer> pair) {
        ((C560530Lyd) ep2()).LJIIJ(pair);
    }

    @Override // X.InterfaceC1461350o8D
    public void mF1(C1462070o9N c1462070o9N) {
        this.LL = c1462070o9N;
    }

    @Override // X.InterfaceC1461350o8D
    public void xA2(boolean z) {
        ((C560530Lyd) i71()).LJIIJ(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1461350o8D
    public void Ph(Effect effect, String str) {
        ((C560530Lyd) gD0()).LJIIJ(new Pair(effect, str));
    }

    @Override // X.InterfaceC1455010nxz
    public void Qi0(float f, long j) {
        ((C560530Lyd) AB0()).LJIIJ(new Pair(Float.valueOf(f), Long.valueOf(j)));
    }

    @Override // X.InterfaceC1461350o8D
    public void uQ(float f, long j) {
        ((C560530Lyd) kg0()).LJIIJ(new Pair(Float.valueOf(f), Long.valueOf(j)));
    }

    @Override // X.InterfaceC1455010nxz
    public void v1(int i, boolean z) {
        ((C560530Lyd) c6()).LJIIJ(new Pair(Integer.valueOf(i), Boolean.valueOf(z)));
    }

    @Override // X.InterfaceC1461350o8D
    public void XW1(float f, float f2, float f3) {
        ((C560530Lyd) QR0()).LJIIJ(new C443120HZe(Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)));
    }

    @Override // X.InterfaceC1461350o8D
    public void YR1(boolean z, boolean z2, Function0<Unit> function0) {
        ((C560530Lyd) UK0()).LJIIJ(new C443120HZe(Boolean.valueOf(z), Boolean.valueOf(z2), function0));
    }

    @Override // X.InterfaceC1455010nxz
    public void jJ(float f, float f2, float f3) {
        ((C560530Lyd) yH0()).LJIIJ(new C443120HZe(Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)));
    }

    @Override // X.InterfaceC1461350o8D
    public void o70(float f, float f2, float f3) {
        ((C560530Lyd) dk2()).LJIIJ(new C443120HZe(Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)));
    }
}
