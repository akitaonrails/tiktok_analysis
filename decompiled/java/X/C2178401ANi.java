package X;

import ge.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.1ANi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2178401ANi extends i<C18YD, C1ANM, C1ANT, C1ANV> implements C18YD, InterfaceC379610EuV {
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final C2178411ANj LLJJ;

    public C18YD F4() {
        return this;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1ANT> o2() {
        return new AwS577S0100000_33(this, 4162);
    }

    @Override // X.C18YD
    public void pause() {
        i3(AFwS279S0000000_33.get$arr$(428));
    }

    @Override // X.C18YD
    public void resume() {
        i3(AFwS279S0000000_33.get$arr$(429));
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1ANV> w2() {
        return new AwS577S0100000_33(this, 4163);
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        i3(AFwS279S0000000_33.get$arr$(426));
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        i3(AFwS279S0000000_33.get$arr$(427));
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        F4();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final C19A3 getParentScene() {
        return this.LLJILJILJ;
    }

    public C2178401ANi(C19A3 c19a3, C1DRG c1drg, C2178411ANj c2178411ANj) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = c2178411ANj;
    }
}
