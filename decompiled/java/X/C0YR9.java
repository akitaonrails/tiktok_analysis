package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0YR9, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YR9 extends AbstractC873650YPb {
    public final Function2<C0Y8T, C869590Y9l, Unit> LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C0YR9(Function2<? super C0Y8T, ? super C869590Y9l, Unit> function2) {
        super("camera-on-send-start-callback");
        this.LIZIZ = function2;
    }

    @Override // X.AbstractC873650YPb
    public final Object LIZ(C873910YQb c873910YQb, InterfaceC1364105Vn<? super InterfaceC873770YPn> interfaceC1364105Vn) {
        this.LIZIZ.invoke(c873910YQb.LIZIZ, c873910YQb.LIZ);
        return C873780YPo.LIZ;
    }
}
