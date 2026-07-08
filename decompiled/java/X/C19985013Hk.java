package X;

/* JADX INFO: renamed from: X.13Hk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19985013Hk extends AbstractC19987313Ih {
    public final AbstractC19979113Fd LJI;

    @Override // X.InterfaceC19986313Hx
    public final int LJIJJ(InterfaceC19983313Gt interfaceC19983313Gt) {
        return 0;
    }

    @Override // X.AbstractC19987313Ih
    public final AbstractC19979113Fd LJJJJLI() {
        return this.LJI;
    }

    @Override // X.AbstractC19987313Ih
    public final AbstractC19979113Fd LJJJJJL(String str) {
        if (str == "primitive") {
            return this.LJI;
        }
        "This input can only handle primitives with 'primitive' tag".toString();
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    public C19985013Hk(AbstractC19987213Ig abstractC19987213Ig, AbstractC19979113Fd abstractC19979113Fd, String str) {
        super(abstractC19987213Ig, abstractC19979113Fd, str);
        this.LJI = abstractC19979113Fd;
        this.LIZIZ.add("primitive");
    }
}
