package X;

/* JADX INFO: renamed from: X.0YwG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C890300YwG extends AbstractC890090Yvv<C890300YwG> {
    public static final C890300YwG LIZIZ = new C890300YwG();
    public static final int LIZJ = 1;
    public static final String LIZLLL = "InboxClassificationExperiment";

    @Override // X.AbstractC890090Yvv
    public final String LIZ() {
        return "enable_activity_classification";
    }

    @Override // X.AbstractC890090Yvv
    public final boolean LIZLLL() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_inbox_activity_classification", false) >= LIZJ;
    }

    @Override // X.AbstractC890090Yvv
    public final String LIZIZ() {
        return LIZLLL;
    }

    @Override // X.AbstractC890090Yvv
    public final void LJFF(InterfaceC304970BxP interfaceC304970BxP) {
        C0C5P.LIZJ().LJIIJJI("enable_inbox_activity_classification", interfaceC304970BxP);
    }
}
