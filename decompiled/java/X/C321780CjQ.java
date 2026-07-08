package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0CjQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C321780CjQ {
    public static void LIZJ() {
        C320870Chx.LIZ(AFwS190S0000000_4.get$arr$(464), true);
        AbstractC321800CjS.LJFF = true;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C321790CjR(null), 3);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [X.0CjS, X.0CjW] */
    public static AbstractC321800CjS LIZ(EnumC320940Ci4 enumC320940Ci4, final Function1 function1, final Function1 function12) {
        int i = C320930Ci3.LIZ[enumC320940Ci4.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ?? r3 = new AbstractC321800CjS(function1) { // from class: X.0CjW
                        @Override // X.AbstractC321800CjS
                        public final Object LIZ(C321820CjU c321820CjU) {
                            Object objInvoke = function12.invoke(c321820CjU);
                            if (objInvoke == C099R.LJFF()) {
                                return objInvoke;
                            }
                            return Unit.LIZ;
                        }
                    };
                    C23250099c.LIZLLL(C2296808zG.LIZ(AbstractC321800CjS.LIZLLL), null, null, new C321770CjP(r3, null), 3);
                    return r3;
                }
                throw new C1954807lC();
            }
            AbstractC321800CjS abstractC321800CjS = new AbstractC321800CjS(function1) { // from class: X.0CjV
                @Override // X.AbstractC321800CjS
                public final Object LIZ(C321820CjU c321820CjU) {
                    Object objInvoke = function12.invoke(c321820CjU);
                    if (objInvoke == C099R.LJFF()) {
                        return objInvoke;
                    }
                    return Unit.LIZ;
                }
            };
            AbstractC321800CjS.LIZJ.add(abstractC321800CjS);
            if (AbstractC321800CjS.LJFF) {
                return abstractC321800CjS;
            }
            LIZJ();
            return abstractC321800CjS;
        }
        AbstractC321800CjS abstractC321800CjS2 = new AbstractC321800CjS(function1) { // from class: X.0CjX
            @Override // X.AbstractC321800CjS
            public final Object LIZ(C321820CjU c321820CjU) {
                Object objInvoke = function12.invoke(c321820CjU);
                if (objInvoke == C099R.LJFF()) {
                    return objInvoke;
                }
                return Unit.LIZ;
            }
        };
        AbstractC321800CjS.LIZIZ.add(abstractC321800CjS2);
        if (AbstractC321800CjS.LJFF) {
            return abstractC321800CjS2;
        }
        LIZJ();
        return abstractC321800CjS2;
    }
}
