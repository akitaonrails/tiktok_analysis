package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.12OI, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12OI extends AbstractC1098520eh0 {
    public final C12O8 LIZIZ;
    public final Function1<C12OI, Unit> LIZJ;

    @Override // X.InterfaceC1102300en6
    public final boolean LJIILIIL() {
        return true;
    }

    @Override // X.InterfaceC1102300en6
    public final void Yc() {
    }

    @Override // X.InterfaceC1102300en6
    public final void Zc(int i) {
    }

    @Override // X.InterfaceC1102300en6
    public final int LJIILJJIL() {
        return this.LIZIZ.LIZIZ();
    }

    @Override // X.InterfaceC1102300en6
    public final long ad() {
        return this.LIZIZ.LJIIIIZZ();
    }

    @Override // X.InterfaceC1102300en6
    public final void bd() {
        this.LIZJ.invoke(this);
    }

    @Override // X.InterfaceC1102300en6
    public final int getBiz() {
        return this.LIZIZ.LJII();
    }

    @Override // X.InterfaceC1102300en6
    public final int getScene() {
        return this.LIZIZ.LJIIIZ();
    }

    @Override // X.InterfaceC1102300en6
    public final EnumC1100250ejn Xc() {
        return EnumC1100250ejn.EFFECT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12OI(C12O8 c12o8, Function1<? super C12OI, Unit> function1) {
        this.LIZIZ = c12o8;
        this.LIZJ = function1;
    }
}
