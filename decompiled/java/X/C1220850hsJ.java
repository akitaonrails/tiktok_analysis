package X;

/* JADX INFO: renamed from: X.0hsJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1220850hsJ implements InterfaceC736910SvR<InterfaceC1220660hs0> {
    public final C1220840hsI LL = new InterfaceC1220660hs0() { // from class: X.0hsI
        @Override // X.InterfaceC1220660hs0
        public final C11NZ LLLLZIL(int i, long j) {
            return C1255960imw.LIZIZ.LIZ(j, i);
        }

        @Override // X.InterfaceC1220660hs0
        public final C11NZ LLZLLLL(int i, long j, String str) {
            String strLIZIZ;
            C1255960imw c1255960imw = C1255960imw.LIZIZ;
            this.LL.getClass();
            int[] iArrLIZ = C422830Gi1.LIZ(101);
            String strLIZIZ2 = null;
            if (iArrLIZ != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(iArrLIZ[0]);
                sbLIZ.append('_');
                sbLIZ.append(iArrLIZ[1]);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLIZIZ = null;
            }
            this.LL.getClass();
            int[] iArrLIZ2 = C422830Gi1.LIZ(200);
            if (iArrLIZ2 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(iArrLIZ2[0]);
                sbLIZ2.append('_');
                sbLIZ2.append(iArrLIZ2[1]);
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            }
            return c1255960imw.LIZIZ(0, strLIZIZ, strLIZIZ2, 1, j, str, i, Boolean.valueOf(C1601690rmZ.LIZJ()));
        }

        @Override // X.InterfaceC1220660hs0
        public final Object S(int i, long j, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
            return C1255960imw.LIZIZ.LIZLLL(str, j, i, 0);
        }

        @Override // X.InterfaceC1220660hs0
        public final C11NZ LLZZZZ(int i, int i2, int i3, long j, String str) {
            return C1255960imw.LIZIZ.LIZJ(i, i2, j, str, i3);
        }
    };

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LL;
    }
}
