package X;

import defpackage.p2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0Cjd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C321910Cjd {
    public static void LIZJ() {
        String str = C1863280yaU.LJIILLIIL;
        C1870240yli.LIZ(AFwS190S0000000_4.get$arr$(5722), true);
        AbstractC321890Cjb.LJFF = true;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C321900Cjc(null), 3);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [X.0Cjb, X.0Cjf] */
    public static AbstractC321890Cjb LIZ(p2.b bVar, final Function1 function1, final Function1 function12) {
        int i = C324730CoB.LIZ[bVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ?? r3 = new AbstractC321890Cjb(function1) { // from class: X.0Cjf
                        @Override // X.AbstractC321890Cjb
                        public final Object LIZ(C321880Cja c321880Cja) {
                            Object objInvoke = function12.invoke(c321880Cja);
                            if (objInvoke == C099R.LJFF()) {
                                return objInvoke;
                            }
                            return Unit.LIZ;
                        }
                    };
                    C23250099c.LIZLLL(C2296808zG.LIZ(AbstractC321890Cjb.LIZLLL), null, null, new C321860CjY(r3, null), 3);
                    return r3;
                }
                throw new C1954807lC();
            }
            AbstractC321890Cjb abstractC321890Cjb = new AbstractC321890Cjb(function1) { // from class: X.0Cje
                @Override // X.AbstractC321890Cjb
                public final Object LIZ(C321880Cja c321880Cja) {
                    Object objInvoke = function12.invoke(c321880Cja);
                    if (objInvoke == C099R.LJFF()) {
                        return objInvoke;
                    }
                    return Unit.LIZ;
                }
            };
            AbstractC321890Cjb.LIZJ.add(abstractC321890Cjb);
            if (AbstractC321890Cjb.LJFF) {
                return abstractC321890Cjb;
            }
            LIZJ();
            return abstractC321890Cjb;
        }
        AbstractC321890Cjb abstractC321890Cjb2 = new AbstractC321890Cjb(function1) { // from class: X.0Cjg
            @Override // X.AbstractC321890Cjb
            public final Object LIZ(C321880Cja c321880Cja) {
                Object objInvoke = function12.invoke(c321880Cja);
                if (objInvoke == C099R.LJFF()) {
                    return objInvoke;
                }
                return Unit.LIZ;
            }
        };
        AbstractC321890Cjb.LIZIZ.add(abstractC321890Cjb2);
        if (AbstractC321890Cjb.LJFF) {
            return abstractC321890Cjb2;
        }
        LIZJ();
        return abstractC321890Cjb2;
    }
}
