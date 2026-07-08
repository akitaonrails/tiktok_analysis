package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0COE, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0COE extends C09AY implements Function0<C0CMG> {
    public C0COE() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0CMG] */
    @Override // kotlin.jvm.functions.Function0
    public final C0CMG invoke() {
        return new InterfaceC1006670cIr<C1602200rnO>() { // from class: X.0CMG
            @Override // X.InterfaceC1006670cIr
            public final void LJIIJ(C1602200rnO c1602200rnO, C1602200rnO c1602200rnO2) {
                if (c1602200rnO2.LIZJ()) {
                    if (C12877052d.LIZ()) {
                        C0CNB.LIZ();
                    }
                    if (((Boolean) C0B4L.LIZIZ.getValue()).booleanValue()) {
                        C805950VjV.LIZ();
                    }
                    if (((Number) C1230804ri.LIZIZ.getValue()).longValue() > 0) {
                        C312230CLt.LJII = new C0CMC() { // from class: X.052W
                            public final C01GW LIZ = C452501pT.LIZIZ(new C052V());

                            @Override // X.C0CMC
                            public final boolean LIZ() {
                                return false;
                            }

                            @Override // X.C0CMC
                            public final long LIZIZ() {
                                return ((Number) C1230804ri.LIZIZ.getValue()).longValue();
                            }

                            @Override // X.C0CMC
                            public final boolean LIZJ() {
                                return ((Boolean) this.LIZ.getValue()).booleanValue();
                            }
                        };
                    }
                }
            }
        };
    }
}
