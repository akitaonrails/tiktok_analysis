package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0gJU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1160820gJU implements InterfaceC1156720gCs {
    public final /* synthetic */ C1162990gMz LIZ;
    public final /* synthetic */ Function1<AbstractC1156680gCo, Unit> LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1160820gJU(C1162990gMz c1162990gMz, Function1<? super AbstractC1156680gCo, Unit> function1) {
        this.LIZ = c1162990gMz;
        this.LIZIZ = function1;
    }

    @Override // X.InterfaceC1156720gCs
    public final void onEvent(AbstractC1156680gCo abstractC1156680gCo) {
        if (!this.LIZ.LJIIIIZZ) {
            this.LIZIZ.invoke(abstractC1156680gCo);
        }
    }
}
