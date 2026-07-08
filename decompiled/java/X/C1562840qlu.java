package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qlu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1562840qlu extends C09AY implements Function1<C723650Sa3, Unit> {
    public final /* synthetic */ C1562830qlt LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1562840qlu(C1562830qlt c1562830qlt) {
        super(1);
        this.LL = c1562830qlt;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C723650Sa3 c723650Sa3) {
        Object objLJJJJZI;
        C723650Sa3 c723650Sa32 = c723650Sa3;
        List<Object> list = c723650Sa32.LIZJ;
        if (list != null && (objLJJJJZI = C13LP.LJJJJZI(list)) != null) {
            C1562830qlt c1562830qlt = this.LL;
            Class<?> cls = objLJJJJZI.getClass();
            c1562830qlt.getClass();
            if (InterfaceC1565950qqv.class.isAssignableFrom(cls)) {
                C1562870qlx c1562870qlxLIZ = this.LL.LIZ(System.identityHashCode(objLJJJJZI));
                c1562870qlxLIZ.LIZ = objLJJJJZI.getClass().getSimpleName();
                c1562870qlxLIZ.LIZIZ = c723650Sa32.LIZ;
            }
        }
        return Unit.LIZ;
    }
}
