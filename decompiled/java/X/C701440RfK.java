package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS66S0100100_11;

/* JADX INFO: renamed from: X.0RfK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701440RfK extends C09AY implements Function1<C700260RdQ, Unit> {
    public final /* synthetic */ C701370RfD LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C701440RfK(C701370RfD c701370RfD) {
        super(1);
        this.LL = c701370RfD;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C700260RdQ c700260RdQ) {
        C700260RdQ c700260RdQ2 = c700260RdQ;
        AbstractC701310Rf7 abstractC701310Rf7 = c700260RdQ2.LIZIZ;
        if (abstractC701310Rf7 instanceof C701300Rf6) {
            C701370RfD c701370RfD = this.LL;
            C701810Rfv c701810Rfv = c701370RfD.LLILZLL;
            if (c701810Rfv != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                new C701620Rfc(jCurrentTimeMillis, c701370RfD);
                C0T6L.LIZLLL();
                if (C299840Bp8.LIZ()) {
                    InterfaceC1449905lx<C701270Rf3> interfaceC1449905lx = c701810Rfv.LIZIZ;
                    if (interfaceC1449905lx != null) {
                        interfaceC1449905lx.LIZ().invoke(new C702430Rgv("fcp_modify_node_action", c700260RdQ2));
                    }
                } else {
                    InterfaceC703670Riv<C701270Rf3> interfaceC703670Riv = c701810Rfv.LIZ;
                    if (interfaceC703670Riv != null) {
                        interfaceC703670Riv.LIZ().invoke(new C702560Rh8("fcp_modify_node_action", c700260RdQ2));
                    }
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                new C701650Rff(jCurrentTimeMillis2, c701370RfD);
                C0T6L.LIZLLL();
                if (C299840Bp8.LIZ()) {
                    InterfaceC1449905lx<C701270Rf3> interfaceC1449905lx2 = c701810Rfv.LIZIZ;
                    if (interfaceC1449905lx2 != null) {
                        interfaceC1449905lx2.LIZ().invoke(new C702430Rgv("fcp_modify_tree_action", null));
                    }
                } else {
                    InterfaceC703670Riv<C701270Rf3> interfaceC703670Riv2 = c701810Rfv.LIZ;
                    if (interfaceC703670Riv2 != null) {
                        interfaceC703670Riv2.LIZ().invoke(new C702560Rh8("fcp_modify_tree_action", null));
                    }
                }
                new C701740Rfo(System.currentTimeMillis(), c701370RfD, jCurrentTimeMillis2);
                C0T6L.LIZLLL();
                new C701750Rfp(System.currentTimeMillis(), c701370RfD, jCurrentTimeMillis);
                C0T6L.LIZLLL();
            }
            C701370RfD c701370RfD2 = this.LL;
            C701810Rfv c701810Rfv2 = c701370RfD2.LLILZLL;
            if (c701810Rfv2 != null) {
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                new C701630Rfd(jCurrentTimeMillis3, c701370RfD2);
                C0T6L.LIZLLL();
                C08TN.LIZ().LJ("FcpRootContainer$doExecuteFcpPolicy$3:call", true);
                if (C299840Bp8.LIZ()) {
                    InterfaceC1449905lx<C701270Rf3> interfaceC1449905lx3 = c701810Rfv2.LIZIZ;
                    if (interfaceC1449905lx3 != null) {
                        interfaceC1449905lx3.LIZ().invoke(new C702430Rgv("fcp_execute_policy_action", c700260RdQ2));
                    }
                } else {
                    InterfaceC703670Riv<C701270Rf3> interfaceC703670Riv3 = c701810Rfv2.LIZ;
                    if (interfaceC703670Riv3 != null) {
                        interfaceC703670Riv3.LIZ().invoke(new C702560Rh8("fcp_execute_policy_action", c700260RdQ2));
                    }
                }
                C08TN.LIZ().LJI("FcpRootContainer$doExecuteFcpPolicy$3:call");
                new C701760Rfq(System.currentTimeMillis(), c701370RfD2, jCurrentTimeMillis3);
                C0T6L.LIZLLL();
            }
        } else if (abstractC701310Rf7 instanceof C701320Rf8) {
            C701370RfD c701370RfD3 = this.LL;
            c701370RfD3.getClass();
            new AwS66S0100100_11(System.currentTimeMillis(), c701370RfD3, 1);
            C0T6L.LIZLLL();
            C701810Rfv c701810Rfv3 = c701370RfD3.LLILZLL;
            if (c701810Rfv3 != null) {
                if (C299840Bp8.LIZ()) {
                    InterfaceC1449905lx<C701270Rf3> interfaceC1449905lx4 = c701810Rfv3.LIZIZ;
                    if (interfaceC1449905lx4 != null) {
                        interfaceC1449905lx4.LIZ().invoke(new C702430Rgv("fcp_recover_policy_action", c700260RdQ2));
                    }
                } else {
                    InterfaceC703670Riv<C701270Rf3> interfaceC703670Riv4 = c701810Rfv3.LIZ;
                    if (interfaceC703670Riv4 != null) {
                        interfaceC703670Riv4.LIZ().invoke(new C702560Rh8("fcp_recover_policy_action", c700260RdQ2));
                    }
                }
            }
            new AwS66S0100100_11(System.currentTimeMillis(), c701370RfD3, 2);
            C0T6L.LIZLLL();
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }
}
