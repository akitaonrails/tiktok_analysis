package X;

/* JADX INFO: renamed from: X.0Yvu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C890080Yvu extends AbstractC890090Yvv<C890080Yvu> {
    public static final C890080Yvu LIZIZ = new C890080Yvu();
    public static final int LIZJ = 1;
    public static final String LIZLLL = "ProfessionalCreatorInboxExp";

    @Override // X.AbstractC890090Yvv
    public final String LIZ() {
        return "professional_creator_inbox";
    }

    @Override // X.AbstractC890090Yvv
    public final boolean LIZLLL() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "professional_creator_inbox", false) >= LIZJ;
    }

    @Override // X.AbstractC890090Yvv
    public final void LJ() {
        super.LJ();
        AnonymousClass0555.LIZ(C1665806fg.LIZJ);
    }

    @Override // X.AbstractC890090Yvv
    public final String LIZIZ() {
        return LIZLLL;
    }

    @Override // X.AbstractC890090Yvv
    public final boolean LIZJ(boolean z) {
        C889930Yvf.LIZ.getClass();
        Object obj = C889930Yvf.LJIIIIZZ().LIZ().get("professional_creator_inbox");
        if (obj == null) {
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            if (z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(LIZLLL);
                sbLIZ.append(" Use Memory Cache isEnable = ");
                sbLIZ.append(bool);
                C1618770sE7.LJ(C2188811AlT.LIZIZ(sbLIZ));
            }
            return bool.booleanValue();
        }
        C1952907kt.LIZ.getClass();
        boolean z2 = C1952907kt.LIZ().getBoolean("professional_creator_inbox", false);
        if (!this.LIZ) {
            LJ();
            this.LIZ = true;
        }
        if (z) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(LIZLLL);
            sbLIZ2.append(" no buffer, get last keva value, isEnable = ");
            sbLIZ2.append(z2);
            C1618770sE7.LJ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        C890070Yvt c890070YvtLJIIIIZZ = C889930Yvf.LJIIIIZZ();
        c890070YvtLJIIIIZZ.LIZ().put("professional_creator_inbox", Boolean.valueOf(z2));
        return z2;
    }

    @Override // X.AbstractC890090Yvv
    public final void LJFF(InterfaceC304970BxP interfaceC304970BxP) {
        C0C5P.LIZJ().LJIIJJI("professional_creator_inbox", interfaceC304970BxP);
    }
}
