package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qlz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1562890qlz {
    public final List<C1562930qm3> LIZ;
    public int LIZIZ;
    public int LIZJ;

    public final AbstractC1557160qck LIZ() {
        AbstractC1557160qck c1557170qcl;
        int i = this.LIZJ + 1;
        this.LIZJ = i;
        if (i > 32) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DSL depth exceeded: depth=");
            sbLIZ.append(this.LIZJ);
            sbLIZ.append(", max=32");
            throw new C1562940qm4(C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            final AbstractC1557160qck abstractC1557160qckLJIIIZ = LJIIIZ();
            if (abstractC1557160qckLJIIIZ == null) {
                this.LIZJ--;
                return null;
            }
            while (true) {
                if (LJII(EnumC1562910qm1.DOT)) {
                    C1562930qm3 c1562930qm3LIZJ = LIZJ(EnumC1562910qm1.IDENT);
                    if (c1562930qm3LIZJ == null) {
                        this.LIZJ--;
                        return null;
                    }
                    if (!Intrinsics.LJFF(c1562930qm3LIZJ.LIZIZ, "startWith") && !Intrinsics.LJFF(c1562930qm3LIZJ.LIZIZ, "endWith")) {
                        this.LIZJ--;
                        return null;
                    }
                    if (LIZJ(EnumC1562910qm1.LEFT_PAREN) == null) {
                        this.LIZJ--;
                        return null;
                    }
                    AbstractC1557160qck abstractC1557160qckLJ = LJ();
                    if (abstractC1557160qckLJ == null) {
                        this.LIZJ--;
                        return null;
                    }
                    if (LIZJ(EnumC1562910qm1.RIGHT_PAREN) == null) {
                        this.LIZJ--;
                        return null;
                    }
                    c1557170qcl = new C1557170qcl(abstractC1557160qckLJIIIZ, abstractC1557160qckLJ, c1562930qm3LIZJ);
                } else {
                    if (!LJII(EnumC1562910qm1.LEFT_BRACKET)) {
                        this.LIZJ--;
                        return abstractC1557160qckLJIIIZ;
                    }
                    final AbstractC1557160qck abstractC1557160qckLJ2 = LJ();
                    if (abstractC1557160qckLJ2 == null) {
                        this.LIZJ--;
                        return null;
                    }
                    final C1562930qm3 c1562930qm3LIZJ2 = LIZJ(EnumC1562910qm1.RIGHT_BRACKET);
                    if (c1562930qm3LIZJ2 == null) {
                        this.LIZJ--;
                        return null;
                    }
                    c1557170qcl = new AbstractC1557160qck(abstractC1557160qckLJIIIZ, abstractC1557160qckLJ2, c1562930qm3LIZJ2) { // from class: X.0qcj
                        public final AbstractC1557160qck LIZ;
                        public final AbstractC1557160qck LIZIZ;
                        public final C1562930qm3 LIZJ;

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof C1557150qcj)) {
                                return false;
                            }
                            C1557150qcj c1557150qcj = (C1557150qcj) obj;
                            return Intrinsics.LJFF(this.LIZ, c1557150qcj.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1557150qcj.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1557150qcj.LIZJ);
                        }

                        public final int hashCode() {
                            return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
                        }

                        public final String toString() {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("SubscriptGet(obj=");
                            sbLIZ2.append(this.LIZ);
                            sbLIZ2.append(", index=");
                            sbLIZ2.append(this.LIZIZ);
                            sbLIZ2.append(", bracket=");
                            sbLIZ2.append(this.LIZJ);
                            sbLIZ2.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ2);
                        }

                        {
                            this.LIZ = abstractC1557160qckLJIIIZ;
                            this.LIZIZ = abstractC1557160qckLJ2;
                            this.LIZJ = c1562930qm3LIZJ2;
                        }
                    };
                }
                abstractC1557160qckLJIIIZ = c1557170qcl;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ--;
            throw th;
        }
    }

    public final AbstractC1557160qck LIZIZ() {
        int i = this.LIZJ + 1;
        this.LIZJ = i;
        if (i > 32) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DSL depth exceeded: depth=");
            sbLIZ.append(this.LIZJ);
            sbLIZ.append(", max=32");
            throw new C1562940qm4(C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            AbstractC1557160qck abstractC1557160qckLJIIJ = LJIIJ();
            if (abstractC1557160qckLJIIJ == null) {
                this.LIZJ--;
                return null;
            }
            while (LJII(EnumC1562910qm1.GREATER, EnumC1562910qm1.GREATER_EQUAL, EnumC1562910qm1.LESS, EnumC1562910qm1.LESS_EQUAL)) {
                C1562930qm3 c1562930qm3LJIIIIZZ = LJIIIIZZ();
                AbstractC1557160qck abstractC1557160qckLJIIJ2 = LJIIJ();
                if (abstractC1557160qckLJIIJ2 == null) {
                    this.LIZJ--;
                    return null;
                }
                abstractC1557160qckLJIIJ = new C1557190qcn(abstractC1557160qckLJIIJ, abstractC1557160qckLJIIJ2, c1562930qm3LJIIIIZZ);
            }
            this.LIZJ--;
            return abstractC1557160qckLJIIJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ--;
            throw th;
        }
    }

    public final AbstractC1557160qck LIZLLL() {
        int i = this.LIZJ + 1;
        this.LIZJ = i;
        if (i > 32) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DSL depth exceeded: depth=");
            sbLIZ.append(this.LIZJ);
            sbLIZ.append(", max=32");
            throw new C1562940qm4(C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            AbstractC1557160qck abstractC1557160qckLIZIZ = LIZIZ();
            if (abstractC1557160qckLIZIZ == null) {
                this.LIZJ--;
                return null;
            }
            while (LJII(EnumC1562910qm1.BANG_EQUAL, EnumC1562910qm1.EQUAL_EQUAL)) {
                C1562930qm3 c1562930qm3LJIIIIZZ = LJIIIIZZ();
                AbstractC1557160qck abstractC1557160qckLIZIZ2 = LIZIZ();
                if (abstractC1557160qckLIZIZ2 == null) {
                    this.LIZJ--;
                    return null;
                }
                abstractC1557160qckLIZIZ = new C1557190qcn(abstractC1557160qckLIZIZ, abstractC1557160qckLIZIZ2, c1562930qm3LJIIIIZZ);
            }
            this.LIZJ--;
            return abstractC1557160qckLIZIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ--;
            throw th;
        }
    }

    public final AbstractC1557160qck LJ() {
        int i = this.LIZJ + 1;
        this.LIZJ = i;
        if (i > 32) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DSL depth exceeded: depth=");
            sbLIZ.append(this.LIZJ);
            sbLIZ.append(", max=32");
            throw new C1562940qm4(C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            this.LIZJ--;
            return LJIIJJI();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ--;
            throw th;
        }
    }

    public final AbstractC1557160qck LJFF() {
        int i = this.LIZJ + 1;
        this.LIZJ = i;
        if (i > 32) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DSL depth exceeded: depth=");
            sbLIZ.append(this.LIZJ);
            sbLIZ.append(", max=32");
            throw new C1562940qm4(C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            AbstractC1557160qck abstractC1557160qckLJIIL = LJIIL();
            if (abstractC1557160qckLJIIL == null) {
                this.LIZJ--;
                return null;
            }
            while (LJII(EnumC1562910qm1.SLASH, EnumC1562910qm1.STAR, EnumC1562910qm1.PERCENT)) {
                C1562930qm3 c1562930qm3LJIIIIZZ = LJIIIIZZ();
                AbstractC1557160qck abstractC1557160qckLJIIL2 = LJIIL();
                if (abstractC1557160qckLJIIL2 == null) {
                    this.LIZJ--;
                    return null;
                }
                abstractC1557160qckLJIIL = new C1557190qcn(abstractC1557160qckLJIIL, abstractC1557160qckLJIIL2, c1562930qm3LJIIIIZZ);
            }
            this.LIZJ--;
            return abstractC1557160qckLJIIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ--;
            throw th;
        }
    }

    public final AbstractC1557160qck LJI() {
        int i = this.LIZJ + 1;
        this.LIZJ = i;
        if (i > 32) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DSL depth exceeded: depth=");
            sbLIZ.append(this.LIZJ);
            sbLIZ.append(", max=32");
            throw new C1562940qm4(C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            AbstractC1557160qck abstractC1557160qckLIZLLL = LIZLLL();
            if (abstractC1557160qckLIZLLL == null) {
                this.LIZJ--;
                return null;
            }
            while (LJII(EnumC1562910qm1.AND_AND)) {
                C1562930qm3 c1562930qm3LJIIIIZZ = LJIIIIZZ();
                AbstractC1557160qck abstractC1557160qckLIZLLL2 = LIZLLL();
                if (abstractC1557160qckLIZLLL2 == null) {
                    this.LIZJ--;
                    return null;
                }
                abstractC1557160qckLIZLLL = new C1557200qco(abstractC1557160qckLIZLLL, abstractC1557160qckLIZLLL2, c1562930qm3LJIIIIZZ);
            }
            this.LIZJ--;
            return abstractC1557160qckLIZLLL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ--;
            throw th;
        }
    }

    public final C1562930qm3 LJIIIIZZ() {
        return (C1562930qm3) ListProtector.get(this.LIZ, this.LIZIZ - 1);
    }

    public final AbstractC1557160qck LJIIIZ() {
        int i = this.LIZJ + 1;
        this.LIZJ = i;
        if (i > 32) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DSL depth exceeded: depth=");
            sbLIZ.append(this.LIZJ);
            sbLIZ.append(", max=32");
            throw new C1562940qm4(C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            if (LJII(EnumC1562910qm1.NUMBER, EnumC1562910qm1.STRING)) {
                this.LIZJ--;
                return new C1557120qcg(LJIIIIZZ().LIZJ);
            }
            if (LJII(EnumC1562910qm1.VARIABLE)) {
                this.LIZJ--;
                return new C1557140qci(LJIIIIZZ());
            }
            if (!LJII(EnumC1562910qm1.LEFT_PAREN)) {
                this.LIZJ--;
                return null;
            }
            AbstractC1557160qck abstractC1557160qckLJ = LJ();
            if (abstractC1557160qckLJ == null) {
                this.LIZJ--;
                return null;
            }
            if (LIZJ(EnumC1562910qm1.RIGHT_PAREN) == null) {
                this.LIZJ--;
                return null;
            }
            this.LIZJ--;
            return new C1557110qcf(abstractC1557160qckLJ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ--;
            throw th;
        }
    }

    public final AbstractC1557160qck LJIIJ() {
        int i = this.LIZJ + 1;
        this.LIZJ = i;
        if (i > 32) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DSL depth exceeded: depth=");
            sbLIZ.append(this.LIZJ);
            sbLIZ.append(", max=32");
            throw new C1562940qm4(C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            AbstractC1557160qck abstractC1557160qckLJFF = LJFF();
            if (abstractC1557160qckLJFF == null) {
                this.LIZJ--;
                return null;
            }
            while (LJII(EnumC1562910qm1.MINUS, EnumC1562910qm1.PLUS)) {
                C1562930qm3 c1562930qm3LJIIIIZZ = LJIIIIZZ();
                AbstractC1557160qck abstractC1557160qckLJFF2 = LJFF();
                if (abstractC1557160qckLJFF2 == null) {
                    this.LIZJ--;
                    return null;
                }
                abstractC1557160qckLJFF = new C1557190qcn(abstractC1557160qckLJFF, abstractC1557160qckLJFF2, c1562930qm3LJIIIIZZ);
            }
            this.LIZJ--;
            return abstractC1557160qckLJFF;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ--;
            throw th;
        }
    }

    public final AbstractC1557160qck LJIIJJI() {
        AbstractC1557160qck abstractC1557160qckLJ;
        int i = this.LIZJ + 1;
        this.LIZJ = i;
        if (i > 32) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DSL depth exceeded: depth=");
            sbLIZ.append(this.LIZJ);
            sbLIZ.append(", max=32");
            throw new C1562940qm4(C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            AbstractC1557160qck abstractC1557160qckLJI = LJI();
            if (abstractC1557160qckLJI == null) {
                this.LIZJ--;
                return null;
            }
            while (LJII(EnumC1562910qm1.OR_OR)) {
                C1562930qm3 c1562930qm3LJIIIIZZ = LJIIIIZZ();
                AbstractC1557160qck abstractC1557160qckLJI2 = LJI();
                if (abstractC1557160qckLJI2 == null) {
                    this.LIZJ--;
                    return null;
                }
                abstractC1557160qckLJI = new C1557200qco(abstractC1557160qckLJI, abstractC1557160qckLJI2, c1562930qm3LJIIIIZZ);
            }
            this.LIZJ--;
            if (!LJII(EnumC1562910qm1.QUESTION)) {
                return abstractC1557160qckLJI;
            }
            AbstractC1557160qck abstractC1557160qckLJ2 = LJ();
            if (abstractC1557160qckLJ2 == null || LIZJ(EnumC1562910qm1.COLON) == null || (abstractC1557160qckLJ = LJ()) == null) {
                return null;
            }
            return new C1557130qch(abstractC1557160qckLJI, abstractC1557160qckLJ2, abstractC1557160qckLJ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ--;
            throw th;
        }
    }

    public final AbstractC1557160qck LJIIL() {
        int i = this.LIZJ + 1;
        this.LIZJ = i;
        if (i > 32) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DSL depth exceeded: depth=");
            sbLIZ.append(this.LIZJ);
            sbLIZ.append(", max=32");
            throw new C1562940qm4(C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            if (!LJII(EnumC1562910qm1.BANG, EnumC1562910qm1.MINUS)) {
                this.LIZJ--;
                return LIZ();
            }
            C1562930qm3 c1562930qm3LJIIIIZZ = LJIIIIZZ();
            AbstractC1557160qck abstractC1557160qckLJIIL = LJIIL();
            if (abstractC1557160qckLJIIL == null) {
                this.LIZJ--;
                return null;
            }
            this.LIZJ--;
            return new C1557180qcm(c1562930qm3LJIIIIZZ, abstractC1557160qckLJIIL);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ--;
            throw th;
        }
    }

    public C1562890qlz(List<C1562930qm3> list) {
        this.LIZ = list;
    }

    public final C1562930qm3 LIZJ(EnumC1562910qm1 enumC1562910qm1) {
        EnumC1562910qm1 enumC1562910qm12 = ((C1562930qm3) ListProtector.get(this.LIZ, this.LIZIZ)).LIZ;
        EnumC1562910qm1 enumC1562910qm13 = EnumC1562910qm1.EOF;
        if (enumC1562910qm12 != enumC1562910qm13 && ((C1562930qm3) ListProtector.get(this.LIZ, this.LIZIZ)).LIZ == enumC1562910qm1) {
            if (((C1562930qm3) ListProtector.get(this.LIZ, this.LIZIZ)).LIZ != enumC1562910qm13) {
                this.LIZIZ++;
            }
            return LJIIIIZZ();
        }
        return null;
    }

    public final boolean LJII(EnumC1562910qm1... enumC1562910qm1Arr) {
        for (EnumC1562910qm1 enumC1562910qm1 : enumC1562910qm1Arr) {
            EnumC1562910qm1 enumC1562910qm12 = ((C1562930qm3) ListProtector.get(this.LIZ, this.LIZIZ)).LIZ;
            EnumC1562910qm1 enumC1562910qm13 = EnumC1562910qm1.EOF;
            if (enumC1562910qm12 != enumC1562910qm13 && ((C1562930qm3) ListProtector.get(this.LIZ, this.LIZIZ)).LIZ == enumC1562910qm1) {
                if (((C1562930qm3) ListProtector.get(this.LIZ, this.LIZIZ)).LIZ != enumC1562910qm13) {
                    this.LIZIZ++;
                }
                LJIIIIZZ();
                return true;
            }
        }
        return false;
    }
}
