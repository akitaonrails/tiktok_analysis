package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0egh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1098330egh implements InterfaceC1102300en6, InterfaceC1102060emi {
    public final C1098290egd LIZ;
    public final Function0<Unit> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Function1<Integer, Unit> LIZLLL;

    @Override // X.InterfaceC1102300en6
    public final void LJIIL() {
    }

    @Override // X.InterfaceC1102300en6
    public final boolean LJIILIIL() {
        return true;
    }

    @Override // X.InterfaceC1102300en6
    public final String LJIILL() {
        return null;
    }

    @Override // X.InterfaceC1102300en6
    public final String Wc() {
        return null;
    }

    @Override // X.InterfaceC1102300en6
    public final String cd() {
        return null;
    }

    @Override // X.InterfaceC1102300en6
    public final int LJIILJJIL() {
        return this.LIZ.LIZIZ;
    }

    @Override // X.InterfaceC1102300en6
    public final void Yc() {
        this.LIZJ.invoke();
    }

    @Override // X.InterfaceC1102300en6
    public final long ad() {
        return this.LIZ.LJ;
    }

    @Override // X.InterfaceC1102300en6
    public final void bd() {
        this.LIZIZ.invoke();
    }

    @Override // X.InterfaceC1102300en6
    public final int getBiz() {
        return this.LIZ.LIZJ;
    }

    @Override // X.InterfaceC1102060emi
    public final String getId() {
        return this.LIZ.LIZ;
    }

    @Override // X.InterfaceC1102300en6
    public final int getScene() {
        return this.LIZ.LIZLLL;
    }

    @Override // X.InterfaceC1102300en6
    public final EnumC1100250ejn Xc() {
        return EnumC1100250ejn.EFFECT;
    }

    @Override // X.InterfaceC1102300en6
    public final void Zc(int i) {
        this.LIZLLL.invoke(Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1098330egh(C1098290egd c1098290egd, Function0<Unit> function0, Function0<Unit> function02, Function1<? super Integer, Unit> function1) {
        this.LIZ = c1098290egd;
        this.LIZIZ = function0;
        this.LIZJ = function02;
        this.LIZLLL = function1;
    }
}
