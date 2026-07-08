package X;

import Y.AObjectS245S0100000_22;
import Y.AObserverS220S0100000_16;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0oAo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC1462960oAo extends AbstractC2255721DQs<InterfaceC1457600o2A> implements InterfaceC379610EuV, InterfaceC1457600o2A {
    public static final int LLJILLL = 8;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(268));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(267));
    public final MutableLiveData<Boolean> LLILZIL = new MutableLiveData<>(null);
    public final h0<Boolean> LLILZLL = new h0<>(null);
    public final h0<String> LLIZ = new h0<>(null);
    public final C560530Lyd<Unit> LLIZLLLIL = new C560530Lyd<>();
    public final h0<Integer> LLJ = new h0<>(null);
    public final h0<Integer> LLJI = new h0<>(null);
    public final LiveEvent<Unit> LLJIJIL = new C560530Lyd();
    public final LiveData<Boolean> LLJILJIL = X1();
    public final LiveData<Boolean> LLJILJILJ = Z1();

    public InterfaceC1457600o2A W1() {
        return this;
    }

    private final MutableLiveData<Boolean> X1() {
        return (MutableLiveData) this.LLILLL.getValue();
    }

    private final MutableLiveData<Boolean> Z1() {
        return (MutableLiveData) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC1457610o2B
    public int n2() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Integer numValueOf;
        C1457580o28 c1457580o28 = (C1457580o28) getParentScene().findSceneByTag("SideToolbarScene");
        if (c1457580o28 == null) {
            return 0;
        }
        ConstraintLayout constraintLayout = c1457580o28.LLJIJIL;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null || (numValueOf = Integer.valueOf(marginLayoutParams.topMargin)) == null) {
            return 0;
        }
        return numValueOf.intValue();
    }

    @Override // X.InterfaceC1457600o2A
    public void rZ() {
        ((C560530Lyd) ak()).LJIIJ(Unit.LIZ);
    }

    @Override // X.InterfaceC1457600o2A
    public LiveData<Boolean> Wr() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC1457600o2A
    public LiveEvent<Unit> ak() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C19A3 getParentScene() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1457600o2A
    public LiveData<Boolean> x8() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1457600o2A
    public void Hp1(String str) {
        this.LLIZ.LJII(str);
    }

    @Override // X.InterfaceC1457600o2A
    public void I60(boolean z) {
        Z1().setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1457610o2B
    public void Kj(int i) {
        this.LLJ.LJII(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1457600o2A
    public void Wb2(int i) {
        this.LLJI.LJII(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1457610o2B
    public void nf1(boolean z) {
        this.LLILZIL.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1457600o2A
    public void rT(boolean z) {
        X1().setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1457600o2A
    public void zz0(boolean z) {
        this.LLILZLL.LJII(Boolean.valueOf(z));
    }

    public AbstractC1462960oAo(C1DRG c1drg, C19A3 c19a3) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
    }

    @Override // X.InterfaceC1457600o2A
    public void FW(LifecycleOwner lifecycleOwner, Function1<? super Boolean, Unit> function1) {
        this.LLILZLL.LIZ(this, new AObjectS245S0100000_22(function1, 234));
    }

    @Override // X.InterfaceC1457610o2B
    public void In0(LifecycleOwner lifecycleOwner, Function1<? super Integer, Unit> function1) {
        this.LLJ.LIZ(this, new AObjectS245S0100000_22(function1, 236));
    }

    @Override // X.InterfaceC1457600o2A
    public void PP0(LifecycleOwner lifecycleOwner, Function1<? super Integer, Unit> function1) {
        this.LLJI.LIZ(this, new AObjectS245S0100000_22(function1, 235));
    }

    @Override // X.InterfaceC1457600o2A
    public void WP(LifecycleOwner lifecycleOwner, Function1<? super Boolean, Unit> function1) {
        this.LLILZIL.observe(this, new AObserverS220S0100000_16(function1, 11));
    }

    @Override // X.InterfaceC1457600o2A
    public void zq0(LifecycleOwner lifecycleOwner, Function1<? super String, Unit> function1) {
        this.LLIZ.LIZ(this, new AObjectS245S0100000_22(function1, 233));
    }
}
