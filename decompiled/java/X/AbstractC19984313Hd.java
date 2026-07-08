package X;

/* JADX INFO: renamed from: X.13Hd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19984313Hd implements C13HD, InterfaceC19986513Hz {
    @Override // X.C13HD
    public abstract C13HD LIZJ(InterfaceC19983313Gt interfaceC19983313Gt);

    @Override // X.C13HD
    public abstract void LJI(short s);

    @Override // X.C13HD
    public abstract void LJII(boolean z);

    @Override // X.C13HD
    public abstract void LJIIIIZZ(String str);

    @Override // X.C13HD
    public abstract void LJIIL(int i);

    @Override // X.C13HD
    public abstract void LJIILL(long j);

    @Override // X.C13HD
    public abstract void LJIJ(char c);

    @Override // X.C13HD
    public abstract void LJIJJLI(byte b);

    @Override // X.C13HD
    public abstract void LJJ(float f);

    @Override // X.C13HD
    public abstract void LJJI(InterfaceC19984413He interfaceC19984413He, Object obj);

    @Override // X.C13HD
    public abstract void LJJIFFI(double d);

    @Override // X.C13HD
    public final /* synthetic */ void LJJIIZ() {
    }

    public abstract void LJJIIZI(InterfaceC19983313Gt interfaceC19983313Gt, int i);

    @Override // X.C13HD
    public final InterfaceC19986513Hz LJIJI(InterfaceC19983313Gt interfaceC19983313Gt) {
        return LIZIZ(interfaceC19983313Gt);
    }

    @Override // X.InterfaceC19986513Hz
    public final C13HD LJJIII(C19980213Fo c19980213Fo, int i) {
        LJJIIZI(c19980213Fo, i);
        return LIZJ(c19980213Fo.LJIIIIZZ(i));
    }

    @Override // X.InterfaceC19986513Hz
    public final void LJ(int i, int i2, InterfaceC19983313Gt interfaceC19983313Gt) {
        LJJIIZI(interfaceC19983313Gt, i);
        LJIIL(i2);
    }

    @Override // X.InterfaceC19986513Hz
    public final void LJFF(InterfaceC19983313Gt interfaceC19983313Gt, int i, long j) {
        LJJIIZI(interfaceC19983313Gt, i);
        LJIILL(j);
    }

    @Override // X.InterfaceC19986513Hz
    public final void LJIIIZ(C19980213Fo c19980213Fo, int i, short s) {
        LJJIIZI(c19980213Fo, i);
        LJI(s);
    }

    @Override // X.InterfaceC19986513Hz
    public final void LJIIJ(InterfaceC19983313Gt interfaceC19983313Gt, int i, boolean z) {
        LJJIIZI(interfaceC19983313Gt, i);
        LJII(z);
    }

    @Override // X.InterfaceC19986513Hz
    public final void LJIIJJI(InterfaceC19983313Gt interfaceC19983313Gt, int i, double d) {
        LJJIIZI(interfaceC19983313Gt, i);
        LJJIFFI(d);
    }

    @Override // X.InterfaceC19986513Hz
    public final void LJIILIIL(InterfaceC19983313Gt interfaceC19983313Gt, int i, String str) {
        LJJIIZI(interfaceC19983313Gt, i);
        LJIIIIZZ(str);
    }

    @Override // X.InterfaceC19986513Hz
    public final void LJIILLIIL(C19980213Fo c19980213Fo, int i, char c) {
        LJJIIZI(c19980213Fo, i);
        LJIJ(c);
    }

    @Override // X.InterfaceC19986513Hz
    public final void LJIL(C19980213Fo c19980213Fo, int i, byte b) {
        LJJIIZI(c19980213Fo, i);
        LJIJJLI(b);
    }

    @Override // X.InterfaceC19986513Hz
    public final void LJJII(C19980213Fo c19980213Fo, int i, float f) {
        LJJIIZI(c19980213Fo, i);
        LJJ(f);
    }

    @Override // X.InterfaceC19986513Hz
    public <T> void LJIIZILJ(InterfaceC19983313Gt interfaceC19983313Gt, int i, InterfaceC19984413He<? super T> interfaceC19984413He, T t) {
        LJJIIZI(interfaceC19983313Gt, i);
        if (interfaceC19984413He.getDescriptor().LIZ()) {
            LJJI(interfaceC19984413He, t);
        } else if (t == null) {
            LJJIIJZLJL();
        } else {
            LJJI(interfaceC19984413He, t);
        }
    }

    @Override // X.InterfaceC19986513Hz
    public final <T> void LJJIIJ(InterfaceC19983313Gt interfaceC19983313Gt, int i, InterfaceC19984413He<? super T> interfaceC19984413He, T t) {
        LJJIIZI(interfaceC19983313Gt, i);
        LJJI(interfaceC19984413He, t);
    }
}
