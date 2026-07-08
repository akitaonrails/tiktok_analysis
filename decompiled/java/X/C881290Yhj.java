package X;

/* JADX INFO: renamed from: X.0Yhj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C881290Yhj extends AbstractC890090Yvv<C881290Yhj> {
    public static final C881290Yhj LIZIZ = new C881290Yhj();
    public static final int LIZJ = 1;
    public static final String LIZLLL = "CreatorInboxMessageRequestUnreadNewExp";

    @Override // X.AbstractC890090Yvv
    public final String LIZ() {
        return "message_request_count";
    }

    @Override // X.AbstractC890090Yvv
    public final boolean LIZLLL() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "creator_inbox_request_unread_new", false) >= LIZJ;
    }

    @Override // X.AbstractC890090Yvv
    public final String LIZIZ() {
        return LIZLLL;
    }

    @Override // X.AbstractC890090Yvv
    public final void LJFF(InterfaceC304970BxP interfaceC304970BxP) {
        C0C5P.LIZJ().LJIIJJI("creator_inbox_request_unread_new", interfaceC304970BxP);
    }
}
