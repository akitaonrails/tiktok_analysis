package X;

/* JADX INFO: renamed from: X.0uJ0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1698680uJ0 {
    public final C1698950uJR LIZ = new C1698950uJR();
    public final C1698890uJL LIZIZ = new C1698890uJL();

    public final void LIZ(EnumC1699210uJr enumC1699210uJr, EnumC1699200uJq enumC1699200uJq) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[updateOnFail] - context=");
        sbLIZ.append(enumC1699210uJr);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        if (enumC1699210uJr == EnumC1699210uJr.IN_FEED) {
            C1698950uJR c1698950uJR = this.LIZ;
            c1698950uJR.LIZIZ++;
            c1698950uJR.LIZJ++;
            return;
        }
        int i = C1698880uJK.LIZ[enumC1699200uJq.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.LIZIZ.LJFF++;
                }
            } else {
                this.LIZIZ.LIZLLL++;
            }
        } else {
            this.LIZIZ.LIZIZ++;
        }
        C1698890uJL c1698890uJL = this.LIZIZ;
        c1698890uJL.LJII++;
        c1698890uJL.LJIIIIZZ++;
    }

    public final void LIZIZ(EnumC1699210uJr enumC1699210uJr, EnumC1699200uJq enumC1699200uJq) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[updateOnSuccess] - context=");
        sbLIZ.append(enumC1699210uJr);
        sbLIZ.append(", switchType=");
        sbLIZ.append(enumC1699200uJq);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        if (enumC1699210uJr == EnumC1699210uJr.IN_FEED) {
            C1698950uJR c1698950uJR = this.LIZ;
            c1698950uJR.LIZ++;
            c1698950uJR.LIZJ++;
            return;
        }
        int i = C1698880uJK.LIZ[enumC1699200uJq.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.LIZIZ.LJ++;
                }
            } else {
                this.LIZIZ.LIZJ++;
            }
        } else {
            this.LIZIZ.LIZ++;
        }
        C1698890uJL c1698890uJL = this.LIZIZ;
        c1698890uJL.LJI++;
        c1698890uJL.LJIIIIZZ++;
    }
}
