package X;

/* JADX INFO: renamed from: X.0YOw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C873600YOw extends AbstractC873650YPb {
    public final C0YH7 LIZIZ;
    public final String LIZJ;

    public C873600YOw(C0YH7 c0yh7, String str) {
        super("media-ensure-conversation");
        this.LIZIZ = c0yh7;
        this.LIZJ = str;
    }

    @Override // X.AbstractC873650YPb
    public final Object LIZ(C873910YQb c873910YQb, InterfaceC1364105Vn<? super InterfaceC873770YPn> interfaceC1364105Vn) {
        C868780Y6i.LJIILJJIL(this.LIZIZ.LIZLLL(), "im-media-sending-step", "execute EnsureConversationStep", 4);
        C0Y8T c0y8tLJIL = this.LIZIZ.LIZJ().LJ().LJIL(this.LIZJ);
        if (c0y8tLJIL == null) {
            if (C2124408Ty.LIZIZ(this.LIZIZ.getConfig().LIZIZ(), this.LIZJ) <= 0) {
                return LIZLLL(c873910YQb, interfaceC1364105Vn);
            }
            return LIZJ(c873910YQb, interfaceC1364105Vn);
        }
        c873910YQb.LIZIZ = c0y8tLJIL;
        return C873780YPo.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C873910YQb r9, X.InterfaceC1364105Vn<? super X.InterfaceC873770YPn> r10) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C873600YOw.LIZJ(X.0YQb, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C873910YQb r12, X.InterfaceC1364105Vn<? super X.InterfaceC873770YPn> r13) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C873600YOw.LIZLLL(X.0YQb, X.05Vn):java.lang.Object");
    }
}
