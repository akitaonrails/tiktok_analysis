package X;

/* JADX INFO: renamed from: X.13Hb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19984113Hb implements C13HB, InterfaceC19986313Hx {
    @Override // X.C13HB
    public InterfaceC19986313Hx LIZIZ(InterfaceC19983313Gt interfaceC19983313Gt) {
        return this;
    }

    @Override // X.InterfaceC19986313Hx
    public void LJIIJJI(InterfaceC19983313Gt interfaceC19983313Gt) {
    }

    @Override // X.C13HB
    public abstract short LJIIL();

    @Override // X.C13HB
    public boolean LJIIZILJ() {
        return true;
    }

    @Override // X.C13HB
    public void LJIJI() {
    }

    @Override // X.C13HB
    public abstract byte LJJI();

    @Override // X.C13HB
    public abstract long LJJIFFI();

    @Override // X.InterfaceC19986313Hx
    public final /* synthetic */ void LJJII() {
    }

    @Override // X.C13HB
    public C13HB LJJIIJZLJL(InterfaceC19983313Gt interfaceC19983313Gt) {
        return this;
    }

    @Override // X.C13HB
    public abstract int LJJIIZ();

    public final void LJJIJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LE.LIZ(getClass()));
        sbLIZ.append(" can't retrieve untyped values");
        throw new C19981113Fx(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C13HB
    public double LJ() {
        LJJIJ();
        throw null;
    }

    @Override // X.C13HB
    public String LJIILJJIL() {
        LJJIJ();
        throw null;
    }

    @Override // X.C13HB
    public boolean LJIILLIIL() {
        LJJIJ();
        throw null;
    }

    @Override // X.C13HB
    public char LJJIII() {
        LJJIJ();
        throw null;
    }

    @Override // X.C13HB
    public float LJJIIZI() {
        LJJIJ();
        throw null;
    }

    @Override // X.C13HB
    public Object LIZLLL(InterfaceC19984213Hc interfaceC19984213Hc) {
        return interfaceC19984213Hc.deserialize(this);
    }

    @Override // X.C13HB
    public int LJIILIIL(InterfaceC19983313Gt interfaceC19983313Gt) {
        LJJIJ();
        throw null;
    }

    @Override // X.InterfaceC19986313Hx
    public final double LIZJ(InterfaceC19983313Gt interfaceC19983313Gt, int i) {
        return LJ();
    }

    @Override // X.InterfaceC19986313Hx
    public final boolean LJFF(InterfaceC19983313Gt interfaceC19983313Gt, int i) {
        return LJIILLIIL();
    }

    @Override // X.InterfaceC19986313Hx
    public final C13HB LJII(C19980213Fo c19980213Fo, int i) {
        return LJJIIJZLJL(c19980213Fo.LJIIIIZZ(i));
    }

    @Override // X.InterfaceC19986313Hx
    public final long LJIIIIZZ(InterfaceC19983313Gt interfaceC19983313Gt, int i) {
        return LJJIFFI();
    }

    @Override // X.InterfaceC19986313Hx
    public final short LJIIJ(C19980213Fo c19980213Fo, int i) {
        return LJIIL();
    }

    @Override // X.InterfaceC19986313Hx
    public final String LJIILL(InterfaceC19983313Gt interfaceC19983313Gt, int i) {
        return LJIILJJIL();
    }

    @Override // X.InterfaceC19986313Hx
    public final byte LJIJ(C19980213Fo c19980213Fo, int i) {
        return LJJI();
    }

    @Override // X.InterfaceC19986313Hx
    public final int LJIJJLI(InterfaceC19983313Gt interfaceC19983313Gt, int i) {
        return LJJIIZ();
    }

    @Override // X.InterfaceC19986313Hx
    public final float LJJ(C19980213Fo c19980213Fo, int i) {
        return LJJIIZI();
    }

    @Override // X.InterfaceC19986313Hx
    public final char LJJIIJ(C19980213Fo c19980213Fo, int i) {
        return LJJIII();
    }

    @Override // X.InterfaceC19986313Hx
    public <T> T LJI(InterfaceC19983313Gt interfaceC19983313Gt, int i, InterfaceC19984213Hc<? extends T> interfaceC19984213Hc, T t) {
        return (T) LIZLLL(interfaceC19984213Hc);
    }

    @Override // X.InterfaceC19986313Hx
    public final <T> T LJIIIZ(InterfaceC19983313Gt interfaceC19983313Gt, int i, InterfaceC19984213Hc<? extends T> interfaceC19984213Hc, T t) {
        if (!interfaceC19984213Hc.getDescriptor().LIZ() && !LJIIZILJ()) {
            LJIJI();
            return null;
        }
        return (T) LIZLLL(interfaceC19984213Hc);
    }
}
