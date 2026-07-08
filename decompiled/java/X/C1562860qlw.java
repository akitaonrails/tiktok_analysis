package X;

import Y.ARunnableS124S0100000_24;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qlw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1562860qlw extends C09AY implements Function1<C738510Sy1, Unit> {
    public final /* synthetic */ C1562830qlt LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1562860qlw(C1562830qlt c1562830qlt) {
        super(1);
        this.LL = c1562830qlt;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C738510Sy1 c738510Sy1) {
        C1562870qlx c1562870qlx;
        String eventType;
        InterfaceC1565950qqv interfaceC1565950qqv;
        C0RJN panelContext;
        C2189821An6 c2189821An6;
        C738510Sy1 c738510Sy12 = c738510Sy1;
        Class<?> cls = c738510Sy12.LIZJ.getClass();
        int iIdentityHashCode = System.identityHashCode(c738510Sy12.LIZJ);
        this.LL.getClass();
        if (InterfaceC1565950qqv.class.isAssignableFrom(cls)) {
            int i = C738170SxT.LIZ[c738510Sy12.LIZLLL.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5 && (c1562870qlx = this.LL.LIZIZ.get(Integer.valueOf(iIdentityHashCode))) != null) {
                                Object obj = c738510Sy12.LIZJ;
                                if (!(obj instanceof InterfaceC1565950qqv) || (interfaceC1565950qqv = (InterfaceC1565950qqv) obj) == null || (panelContext = interfaceC1565950qqv.getPanelContext()) == null || (c2189821An6 = panelContext.LIZJ) == null || (eventType = c2189821An6.getEventType()) == null) {
                                    eventType = this.LL.LIZ;
                                }
                                c1562870qlx.LJI = eventType;
                                this.LL.LIZIZ.remove(Integer.valueOf(iIdentityHashCode));
                                C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS124S0100000_24(c1562870qlx, 163));
                            }
                        } else {
                            C1562870qlx c1562870qlxLIZ = this.LL.LIZ(iIdentityHashCode);
                            c1562870qlxLIZ.LIZ = cls.getSimpleName();
                            c1562870qlxLIZ.LJFF = c738510Sy12.LIZ;
                        }
                    } else {
                        C1562870qlx c1562870qlxLIZ2 = this.LL.LIZ(iIdentityHashCode);
                        c1562870qlxLIZ2.LIZ = cls.getSimpleName();
                        c1562870qlxLIZ2.LJ = c738510Sy12.LIZ;
                    }
                } else {
                    C1562870qlx c1562870qlxLIZ3 = this.LL.LIZ(iIdentityHashCode);
                    c1562870qlxLIZ3.LIZ = cls.getSimpleName();
                    c1562870qlxLIZ3.LIZLLL = c738510Sy12.LIZ;
                }
            } else {
                C1562870qlx c1562870qlxLIZ4 = this.LL.LIZ(iIdentityHashCode);
                c1562870qlxLIZ4.LIZ = cls.getSimpleName();
                c1562870qlxLIZ4.LIZJ = c738510Sy12.LIZ;
            }
        }
        return Unit.LIZ;
    }
}
