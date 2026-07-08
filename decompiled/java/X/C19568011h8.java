package X;

import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.11h8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19568011h8 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C19568211hA<Object, Object> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19568011h8(C19568211hA<Object, Object> c19568211hA) {
        super(0);
        this.LL = c19568211hA;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C19568211hA<Object, Object> c19568211hA = this.LL;
        c19568211hA.LJ = true;
        ((ConcurrentLinkedQueue) c19568211hA.LJFF).clear();
        for (Object obj : c19568211hA.LJIIL) {
            AbstractC19568611hE<Object, Object> abstractC19568611hE = c19568211hA.LIZ;
            AbstractC19568411hC<Object, Object> abstractC19568411hCLIZ = abstractC19568611hE.LIZ(obj, abstractC19568611hE.LIZ.LIZ());
            abstractC19568411hCLIZ.getClass();
            ((ConcurrentLinkedQueue) c19568211hA.LJFF).offer(abstractC19568411hCLIZ);
        }
        c19568211hA.LJIIL.clear();
        this.LL.LJIIIZ();
        return Unit.LIZ;
    }
}
