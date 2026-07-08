package X;

/* JADX INFO: renamed from: X.12vG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19910412vG extends C19856212mW {
    public static final boolean LIZIZ = C19907112uj.LIZLLL;
    public C19909512v7 LIZ;

    public /* synthetic */ AbstractC19910412vG(int i) {
    }

    public abstract int LIZIZ();

    public abstract void LIZJ(byte b);

    public abstract void LIZLLL(int i, boolean z);

    public abstract void LJ(byte[] bArr, int i);

    public abstract void LJFF(int i, AbstractC19855612mQ abstractC19855612mQ);

    public abstract void LJI(AbstractC19855612mQ abstractC19855612mQ);

    public abstract void LJII(int i, int i2);

    public abstract void LJIIIIZZ(int i);

    public abstract void LJIIIZ(int i, long j);

    public abstract void LJIIJ(long j);

    public abstract void LJIIJJI(int i, int i2);

    public abstract void LJIIL(int i);

    public abstract void LJIILIIL(InterfaceC19911612vS interfaceC19911612vS);

    public abstract void LJIILJJIL(int i, InterfaceC19911612vS interfaceC19911612vS);

    public abstract void LJIILL(int i, AbstractC19855612mQ abstractC19855612mQ);

    public abstract void LJIILLIIL(int i, String str);

    public abstract void LJIIZILJ(String str);

    public abstract void LJIJ(int i, int i2);

    public abstract void LJIJI(int i, int i2);

    public abstract void LJIJJ(int i);

    public abstract void LJIJJLI(int i, long j);

    public abstract void LJIL(long j);

    public final void LIZ() {
        if (LIZIZ() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public static int LJJ(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int LJJI(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }
}
