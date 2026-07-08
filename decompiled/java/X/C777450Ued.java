package X;

/* JADX INFO: renamed from: X.0Ued, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C777450Ued extends AbstractC777950UfR {
    public final EnumC777090Ue3 LJ;
    public final EnumC777930UfP LJFF = EnumC777930UfP.PRIORITY_TYPE_P2;
    public final EnumC777480Ueg LJI = EnumC777480Ueg.FIRST_EDUCATION;
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

    public C777450Ued(EnumC777090Ue3 enumC777090Ue3) {
        String strLJIJI;
        this.LJ = enumC777090Ue3;
        if (enumC777090Ue3 == EnumC777090Ue3.FirstComment) {
            strLJIJI = C497740JfY.LJIJI(2131841801);
        } else {
            strLJIJI = C497740JfY.LJIJI(2131841803);
        }
        this.LJII = strLJIJI;
        this.LIZIZ = new AbstractC777790UfB() { // from class: X.0Ueq
            public final EnumC777770Uf9 LIZ = EnumC777770Uf9.CLOSE;

            @Override // X.AbstractC777790UfB
            public final EnumC777770Uf9 LIZ() {
                return this.LIZ;
            }
        };
    }
}
