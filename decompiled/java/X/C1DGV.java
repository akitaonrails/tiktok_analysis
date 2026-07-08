package X;

import an3.l;
import java.lang.Enum;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1DGV, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DGV<KEY extends Enum<KEY>> {
    public final Function1<C1DGZ<KEY>, Unit> LIZ;
    public l<KEY> LIZIZ;

    public final l<KEY> LIZ() {
        l<KEY> lVar = this.LIZIZ;
        if (lVar != null) {
            return lVar;
        }
        l<KEY> lVar2 = new l<>(0);
        this.LIZ.invoke(lVar2);
        this.LIZIZ = lVar2;
        return lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1DGV(Function1<? super C1DGZ<KEY>, Unit> function1) {
        this.LIZ = function1;
    }
}
