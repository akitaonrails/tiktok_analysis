package X;

/* JADX INFO: renamed from: X.18ts, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21430618ts<Target> extends AbstractC21430218to {
    public final Target LJFF;

    public C21430618ts() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C21430618ts(AbstractC21430218to abstractC21430218to) {
        this.LJFF = abstractC21430218to;
    }

    @Override // X.AbstractC21430218to
    public final void LIZ(InterfaceC21437318ux interfaceC21437318ux) {
        InterfaceC21427218tK interfaceC21427218tK;
        InterfaceC21427718tP<AbstractC21430218to> interfaceC21427718tPLJIIJJI;
        if ((interfaceC21437318ux instanceof InterfaceC21427218tK) && (interfaceC21427718tPLJIIJJI = (interfaceC21427218tK = (InterfaceC21427218tK) interfaceC21437318ux).LJIIJJI(this)) != null) {
            interfaceC21427718tPLJIIJJI.LIZ(interfaceC21427218tK, this);
            return;
        }
        AbstractC21430218to abstractC21430218to = this.LIZIZ;
        while (abstractC21430218to != null) {
            AbstractC21430218to abstractC21430218to2 = abstractC21430218to.LJ;
            abstractC21430218to.LIZ(interfaceC21437318ux);
            abstractC21430218to = abstractC21430218to2;
        }
    }
}
