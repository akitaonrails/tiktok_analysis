package X;

/* JADX INFO: renamed from: X.0Yvv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC890090Yvv<T> {
    public boolean LIZ;

    public abstract String LIZ();

    public abstract String LIZIZ();

    public abstract boolean LIZLLL();

    public abstract void LJFF(InterfaceC304970BxP interfaceC304970BxP);

    public void LJ() {
        boolean zLIZLLL = LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZIZ());
        sbLIZ.append(" onInit, ABManager value = ");
        sbLIZ.append(zLIZLLL);
        C1618770sE7.LJ(C2188811AlT.LIZIZ(sbLIZ));
        C1952907kt c1952907kt = C1952907kt.LIZ;
        String strLIZ = LIZ();
        c1952907kt.getClass();
        C1952907kt.LIZ().storeBoolean(strLIZ, zLIZLLL);
        LJFF(new InterfaceC304970BxP(this) { // from class: X.0Yvz
            public final /* synthetic */ AbstractC890090Yvv<T> LL;

            {
                this.LL = this;
            }

            @Override // X.InterfaceC304970BxP
            public final void LIZ() {
                boolean zLIZLLL2 = this.LL.LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(this.LL.LIZIZ());
                sbLIZ2.append(" callback, newValue = ");
                sbLIZ2.append(zLIZLLL2);
                C1618770sE7.LJ(C2188811AlT.LIZIZ(sbLIZ2));
                C1952907kt c1952907kt2 = C1952907kt.LIZ;
                String strLIZ2 = this.LL.LIZ();
                c1952907kt2.getClass();
                C1952907kt.LIZ().storeBoolean(strLIZ2, zLIZLLL2);
            }
        });
    }

    public boolean LIZJ(boolean z) {
        C889930Yvf.LIZ.getClass();
        C890070Yvt c890070YvtLJIIIIZZ = C889930Yvf.LJIIIIZZ();
        Object obj = c890070YvtLJIIIIZZ.LIZ().get(LIZ());
        if (obj == null) {
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            if (z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(LIZIZ());
                sbLIZ.append(" Use Memory Cache isEnable = ");
                sbLIZ.append(bool);
                C1618770sE7.LJ(C2188811AlT.LIZIZ(sbLIZ));
            }
            return bool.booleanValue();
        }
        if (!this.LIZ) {
            LJ();
            this.LIZ = true;
        }
        C1952907kt c1952907kt = C1952907kt.LIZ;
        String strLIZ = LIZ();
        c1952907kt.getClass();
        boolean z2 = C1952907kt.LIZ().getBoolean(strLIZ, false);
        if (z) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(LIZIZ());
            sbLIZ2.append(" Use First Init isEnable = ");
            sbLIZ2.append(z2);
            C1618770sE7.LJ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        C890070Yvt c890070YvtLJIIIIZZ2 = C889930Yvf.LJIIIIZZ();
        c890070YvtLJIIIIZZ2.LIZ().put(LIZ(), Boolean.valueOf(z2));
        return z2;
    }
}
