package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11EG, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11EG<S> implements C11EH<S> {
    public final C11EH<S> LIZ;

    @Override // X.C11EH
    public final C11NZ<S> LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // X.C11EH
    public final S getState() {
        return this.LIZ.getState();
    }

    public C11EG(C11EH<S> c11eh) {
        this.LIZ = c11eh;
    }

    @Override // X.C11EH
    public final void LIZ(Function1<? super S, ? extends S> function1) {
        this.LIZ.LIZ(function1);
    }

    @Override // X.C11EH
    public final void LIZJ(Function1<? super S, ? extends S> function1) {
        this.LIZ.LIZJ(function1);
    }

    @Override // X.C11EH
    public final void LIZLLL(Function1<? super S, Unit> function1) {
        this.LIZ.LIZLLL(function1);
    }
}
