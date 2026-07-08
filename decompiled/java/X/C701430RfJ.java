package X;

import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RfJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701430RfJ extends C09AY implements Function1<C700260RdQ, Unit> {
    public final /* synthetic */ C701370RfD LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C701430RfJ(C701370RfD c701370RfD) {
        super(1);
        this.LL = c701370RfD;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C700260RdQ c700260RdQ) {
        C700260RdQ c700260RdQ2 = c700260RdQ;
        InterfaceC700020Rd2<?> interfaceC700020Rd2 = this.LL.LLILLL;
        if (interfaceC700020Rd2 != null) {
            interfaceC700020Rd2.LJLI();
        }
        C701370RfD c701370RfD = this.LL;
        C701810Rfv c701810Rfv = c701370RfD.LLILZLL;
        C700950ReX c700950ReXLIZIZ = null;
        if (c701810Rfv != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            new C701600Rfa(jCurrentTimeMillis, c701370RfD);
            C0T6L.LIZLLL();
            if (C299840Bp8.LIZ()) {
                InterfaceC1449905lx<C701270Rf3> interfaceC1449905lx = c701810Rfv.LIZIZ;
                if (interfaceC1449905lx != null) {
                    interfaceC1449905lx.LIZ().invoke(new C702430Rgv("fcp_execute_exchange_action", null));
                }
            } else {
                InterfaceC703670Riv<C701270Rf3> interfaceC703670Riv = c701810Rfv.LIZ;
                if (interfaceC703670Riv != null) {
                    interfaceC703670Riv.LIZ().invoke(new C702560Rh8("fcp_execute_exchange_action", null));
                }
            }
            new C701720Rfm(System.currentTimeMillis(), c701370RfD, jCurrentTimeMillis);
            C0T6L.LIZLLL();
        }
        C701370RfD c701370RfD2 = this.LL;
        c701370RfD2.getClass();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        new C701640Rfe(jCurrentTimeMillis2, c701370RfD2);
        C0T6L.LIZLLL();
        C700170RdH c700170RdH = c701370RfD2.LLIZLLLIL;
        if (c700170RdH != null) {
            c700950ReXLIZIZ = C700960ReY.LIZIZ(c700170RdH);
        }
        ArrayList arrayList = (ArrayList) c701370RfD2.LLJJL;
        if (!arrayList.isEmpty()) {
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (listIterator.hasPrevious()) {
                ((InterfaceC702410Rgt) listIterator.previous()).vg(c700950ReXLIZIZ);
            }
        }
        new C701770Rfr(System.currentTimeMillis(), c701370RfD2, jCurrentTimeMillis2);
        C0T6L.LIZLLL();
        new C701520RfS(this.LL, c700260RdQ2);
        C0T6L.LIZLLL();
        return Unit.LIZ;
    }
}
