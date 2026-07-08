package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cPW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1010800cPW {
    public AbstractC1010890cPf LIZ = C1010940cPk.LIZ;
    public final C2252331DDr LIZIZ;
    public final AnonymousClass0950 LIZJ;

    public C1010800cPW() {
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 7);
        this.LIZIZ = c2252331DDrLIZIZ;
        this.LIZJ = C09IC.LIZ(c2252331DDrLIZIZ);
    }

    public final Object LIZ(AbstractC1010890cPf abstractC1010890cPf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        if (!(abstractC1010890cPf instanceof C1010930cPj)) {
            if (abstractC1010890cPf instanceof C1010910cPh) {
                if (!Intrinsics.LJFF(this.LIZ, C1010930cPj.LIZ) && !Intrinsics.LJFF(this.LIZ, C1010920cPi.LIZ)) {
                    return Unit.LIZ;
                }
            } else if (!(abstractC1010890cPf instanceof C1010920cPi) && !(abstractC1010890cPf instanceof C1010900cPg) && !(abstractC1010890cPf instanceof C1010940cPk)) {
                throw new C1954807lC();
            }
        }
        this.LIZ = abstractC1010890cPf;
        Object objEmit = this.LIZIZ.emit(abstractC1010890cPf, interfaceC1364105Vn);
        if (objEmit == C099R.LJFF()) {
            return objEmit;
        }
        return Unit.LIZ;
    }
}
