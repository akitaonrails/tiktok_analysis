package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0C9d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C308950C9d extends C09AY implements Function0<C0C9U> {
    public C308950C9d() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0C9U] */
    @Override // kotlin.jvm.functions.Function0
    public final C0C9U invoke() {
        return new AbstractC308980C9g() { // from class: X.0C9U
            public final C01GW LIZ = C452501pT.LIZIZ(new C308920C9a());
            public final C01GW LIZIZ = C452501pT.LIZIZ(new C0C9Z());
            public final C01GW LIZJ = C452501pT.LIZIZ(new C290010BYh());
            public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1728));
            public final C01GW LJ = C452501pT.LIZIZ(new C0C9Y());

            @Override // X.AbstractC308980C9g
            public final boolean LIZ() {
                return ((Boolean) this.LIZLLL.getValue()).booleanValue();
            }

            @Override // X.AbstractC308980C9g
            public final boolean LIZIZ() {
                return ((Boolean) this.LIZJ.getValue()).booleanValue();
            }

            @Override // X.AbstractC308980C9g
            public final C308940C9c LIZJ() {
                return (C308940C9c) this.LIZIZ.getValue();
            }

            @Override // X.AbstractC308980C9g
            public final InterfaceC20605715k7 LIZLLL() {
                return (InterfaceC20605715k7) this.LIZ.getValue();
            }

            @Override // X.AbstractC308980C9g
            public final Function2<String, Boolean, InterfaceC1563050qmF> LJ() {
                return (Function2) this.LJ.getValue();
            }

            @Override // X.AbstractC308980C9g
            public final void LJFF() {
                long j = C285050BFf.LIZ;
                if (j != -1) {
                    C0CN5.LIZIZ(Long.valueOf(j), new Runnable() { // from class: X.0C9V
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("PowerInitTaskKt@31c3.powerListInitializer$2$1$onInitialize$1");
                            try {
                                C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.0C9W
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean zLIZ2;
                                        C1C7U.LIZ("PowerInitTaskKt@31c3.powerListInitializer$2$1$onInitialize$1$1");
                                        try {
                                            C1562100qki.LIZIZ.getClass();
                                            C1562100qki.LIZIZ();
                                        } finally {
                                            if (!zLIZ2) {
                                            }
                                        }
                                        C1C7U.LIZIZ("PowerInitTaskKt@31c3.powerListInitializer$2$1$onInitialize$1$1");
                                    }
                                });
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("PowerInitTaskKt@31c3.powerListInitializer$2$1$onInitialize$1");
                        }
                    });
                } else {
                    C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.0C9X
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("PowerInitTaskKt@31c3.powerListInitializer$2$1$onInitialize$2");
                            try {
                                C1562100qki.LIZIZ.getClass();
                                C1562100qki.LIZIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("PowerInitTaskKt@31c3.powerListInitializer$2$1$onInitialize$2");
                        }
                    });
                }
            }
        };
    }
}
