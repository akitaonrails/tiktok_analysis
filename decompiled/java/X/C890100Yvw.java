package X;

/* JADX INFO: renamed from: X.0Yvw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C890100Yvw extends AbstractC890090Yvv<C890100Yvw> {
    public static boolean LJFF;
    public static final C890100Yvw LIZIZ = new C890100Yvw();
    public static final String LIZJ = "CreatorInboxDmTabNameExp";
    public static final int LIZLLL = 1;
    public static final int LJ = 2;
    public static final String LJI = "key_tab_name";

    @Override // X.AbstractC890090Yvv
    public final void LJ() {
        if (LJFF) {
            return;
        }
        int iLJI = LJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZJ);
        sbLIZ.append(" manual = ");
        sbLIZ.append(iLJI);
        C1618770sE7.LJ(C2188811AlT.LIZIZ(sbLIZ));
        C1952907kt c1952907kt = C1952907kt.LIZ;
        String str = LJI;
        c1952907kt.getClass();
        C1952907kt.LIZ().storeInt(str, iLJI);
        LJFF(new InterfaceC304970BxP() { // from class: X.0Yw0
            @Override // X.InterfaceC304970BxP
            public final void LIZ() {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                C890100Yvw.LIZIZ.getClass();
                sbLIZ2.append(C890100Yvw.LIZJ);
                sbLIZ2.append(" callback = ");
                sbLIZ2.append(C890100Yvw.LJI());
                C1618770sE7.LJ(C2188811AlT.LIZIZ(sbLIZ2));
                C1952907kt c1952907kt2 = C1952907kt.LIZ;
                String str2 = C890100Yvw.LJI;
                int iLJI2 = C890100Yvw.LJI();
                c1952907kt2.getClass();
                C1952907kt.LIZ().storeInt(str2, iLJI2);
            }
        });
        LJFF = true;
    }

    public final int LJIIIIZZ() {
        if (C889930Yvf.LIZ.LJIIL()) {
            return 2131845349;
        }
        return LJII(this) >= LJ ? 2131830253 : 2131830247;
    }

    public final int LJIIIZ() {
        if (C889930Yvf.LIZ.LJIIL()) {
            return 2131845332;
        }
        return LJII(this) >= LIZLLL ? 2131830248 : 2131830249;
    }

    public static int LJI() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "creator_inbox_dm_tab_name", false);
    }

    @Override // X.AbstractC890090Yvv
    public final boolean LIZLLL() {
        return LJI() > 0;
    }

    @Override // X.AbstractC890090Yvv
    public final String LIZ() {
        return LJI;
    }

    @Override // X.AbstractC890090Yvv
    public final String LIZIZ() {
        return LIZJ;
    }

    public static int LJII(C890100Yvw c890100Yvw) {
        c890100Yvw.getClass();
        C889930Yvf.LIZ.getClass();
        C890070Yvt c890070YvtLJIIIIZZ = C889930Yvf.LJIIIIZZ();
        String str = LJI;
        Object obj = c890070YvtLJIIIIZZ.LIZ().get(str);
        if (obj == null) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZJ);
            sbLIZ.append(" Use Memory Cache value = ");
            sbLIZ.append(num);
            C1618770sE7.LJ(C2188811AlT.LIZIZ(sbLIZ));
            return num.intValue();
        }
        c890100Yvw.LJ();
        C1952907kt.LIZ.getClass();
        int i = C1952907kt.LIZ().getInt(str, 0);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(LIZJ);
        sbLIZ2.append(" Use First Init value = ");
        sbLIZ2.append(i);
        C1618770sE7.LJ(C2188811AlT.LIZIZ(sbLIZ2));
        C890070Yvt c890070YvtLJIIIIZZ2 = C889930Yvf.LJIIIIZZ();
        c890070YvtLJIIIIZZ2.LIZ().put(str, Integer.valueOf(i));
        return i;
    }

    @Override // X.AbstractC890090Yvv
    public final void LJFF(InterfaceC304970BxP interfaceC304970BxP) {
        C0C5P.LIZJ().LJIIJJI("creator_inbox_dm_tab_name", interfaceC304970BxP);
    }
}
