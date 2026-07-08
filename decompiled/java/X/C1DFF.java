package X;

import kotlin.Unit;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: renamed from: X.1DFF, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DFF extends AbstractC2252721DFe implements C1DFY {
    public final C13WO LLILZIL;

    @Override // X.C1DFY
    public final C09AE getParent() {
        return LJIIIIZZ();
    }

    public C1DFF(JobSupport jobSupport) {
        this.LLILZIL = jobSupport;
    }

    @Override // X.C1DFY
    public final boolean LIZJ(Throwable th) {
        return LJIIIIZZ().LJJIJL(th);
    }

    @Override // X.C1DFU
    public final void LJII(Throwable th) {
        this.LLILZIL.LJIJJLI(LJIIIIZZ());
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        LJII(th);
        return Unit.LIZ;
    }
}
