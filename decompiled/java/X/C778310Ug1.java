package X;

/* JADX INFO: renamed from: X.0Ug1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C778310Ug1 extends AbstractC777950UfR {
    public final EnumC778330Ug3 LJ;
    public final EnumC777930UfP LJFF = EnumC777930UfP.PRIORITY_TYPE_P2;
    public final EnumC777480Ueg LJI = EnumC777480Ueg.LOW_PERFORMANCE;
    public final CharSequence LJII;

    @Override // X.AbstractC777950UfR
    public final EnumC777930UfP LIZJ() {
        return this.LJFF;
    }

    @Override // X.AbstractC777950UfR
    public final CharSequence LIZLLL() {
        return this.LJII;
    }

    @Override // X.AbstractC777950UfR
    public final EnumC777480Ueg LJ() {
        return this.LJI;
    }

    public C778310Ug1(EnumC778330Ug3 enumC778330Ug3) {
        String strLJIJI;
        this.LJ = enumC778330Ug3;
        int i = C778340Ug4.LIZ[enumC778330Ug3.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        strLJIJI = C497740JfY.LJIJI(2131843104);
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    strLJIJI = C497740JfY.LJIJI(2131843108);
                }
            } else {
                strLJIJI = C497740JfY.LJIJI(2131843102);
            }
        } else {
            strLJIJI = C497740JfY.LJIJI(2131843103);
        }
        this.LJII = strLJIJI;
        this.LIZ = new AbstractC777790UfB() { // from class: X.0UgI
            public final EnumC777770Uf9 LIZ = EnumC777770Uf9.CIRCLE_WARNING_RED;

            @Override // X.AbstractC777790UfB
            public final EnumC777770Uf9 LIZ() {
                return this.LIZ;
            }
        };
        this.LIZIZ = new AbstractC777790UfB() { // from class: X.0UgJ
            public final EnumC777770Uf9 LIZ = EnumC777770Uf9.CLOSE;

            @Override // X.AbstractC777790UfB
            public final EnumC777770Uf9 LIZ() {
                return this.LIZ;
            }
        };
    }
}
