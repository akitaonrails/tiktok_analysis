package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.136l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class EnumC199565136l {
    public static final EnumC199565136l[] LL;
    public static final /* synthetic */ EnumC199565136l[] LLILLJJLI;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC199565136l EF17;

    public EnumC199565136l() {
        throw null;
    }

    public abstract InterfaceC199564136k LJII(int i, C199595137p c199595137p, InterfaceC199564136k interfaceC199564136k, Object obj);

    static {
        EnumC199565136l enumC199565136l = new EnumC199565136l() { // from class: X.136t
            @Override // X.EnumC199565136l
            public final InterfaceC199564136k LJII(int i, C199595137p c199595137p, InterfaceC199564136k interfaceC199564136k, Object obj) {
                return new C135F(obj, i, interfaceC199564136k);
            }
        };
        EnumC199565136l enumC199565136l2 = new EnumC199565136l() { // from class: X.136q
            @Override // X.EnumC199565136l
            public final <K, V> InterfaceC199564136k<K, V> LJFF(C199595137p<K, V> c199595137p, InterfaceC199564136k<K, V> interfaceC199564136k, InterfaceC199564136k<K, V> interfaceC199564136k2) {
                InterfaceC199564136k<K, V> interfaceC199564136kLJFF = super.LJFF(c199595137p, interfaceC199564136k, interfaceC199564136k2);
                EnumC199565136l.LIZJ(interfaceC199564136k, interfaceC199564136kLJFF);
                return interfaceC199564136kLJFF;
            }

            @Override // X.EnumC199565136l
            public final InterfaceC199564136k LJII(int i, C199595137p c199595137p, InterfaceC199564136k interfaceC199564136k, Object obj) {
                return new C135F<K, V>(obj, i, interfaceC199564136k) { // from class: X.135K
                    public volatile long LLILZIL = Long.MAX_VALUE;
                    public InterfaceC199564136k<K, V> LLILZLL;
                    public InterfaceC199564136k<K, V> LLIZ;

                    @Override // X.C135E, X.InterfaceC199564136k
                    public final InterfaceC199564136k<K, V> LJFF() {
                        return this.LLIZ;
                    }

                    @Override // X.C135E, X.InterfaceC199564136k
                    public final InterfaceC199564136k<K, V> LJIIL() {
                        return this.LLILZLL;
                    }

                    @Override // X.C135E, X.InterfaceC199564136k
                    public final long LJIILJJIL() {
                        return this.LLILZIL;
                    }

                    @Override // X.C135E, X.InterfaceC199564136k
                    public final void LJIIIZ(long j) {
                        this.LLILZIL = j;
                    }

                    @Override // X.C135E, X.InterfaceC199564136k
                    public final void LJIILLIIL(InterfaceC199564136k<K, V> interfaceC199564136k2) {
                        this.LLILZLL = interfaceC199564136k2;
                    }

                    @Override // X.C135E, X.InterfaceC199564136k
                    public final void LJIIZILJ(InterfaceC199564136k<K, V> interfaceC199564136k2) {
                        this.LLIZ = interfaceC199564136k2;
                    }

                    {
                        C135G c135g = C135G.LL;
                        this.LLILZLL = c135g;
                        this.LLIZ = c135g;
                    }
                };
            }
        };
        EnumC199565136l enumC199565136l3 = new EnumC199565136l() { // from class: X.136r
            @Override // X.EnumC199565136l
            public final <K, V> InterfaceC199564136k<K, V> LJFF(C199595137p<K, V> c199595137p, InterfaceC199564136k<K, V> interfaceC199564136k, InterfaceC199564136k<K, V> interfaceC199564136k2) {
                InterfaceC199564136k<K, V> interfaceC199564136kLJFF = super.LJFF(c199595137p, interfaceC199564136k, interfaceC199564136k2);
                EnumC199565136l.LJI(interfaceC199564136k, interfaceC199564136kLJFF);
                return interfaceC199564136kLJFF;
            }

            @Override // X.EnumC199565136l
            public final InterfaceC199564136k LJII(int i, C199595137p c199595137p, InterfaceC199564136k interfaceC199564136k, Object obj) {
                return new C135F<K, V>(obj, i, interfaceC199564136k) { // from class: X.135M
                    public volatile long LLILZIL = Long.MAX_VALUE;
                    public InterfaceC199564136k<K, V> LLILZLL;
                    public InterfaceC199564136k<K, V> LLIZ;

                    @Override // X.C135E, X.InterfaceC199564136k
                    public final InterfaceC199564136k<K, V> LJI() {
                        return this.LLILZLL;
                    }

                    @Override // X.C135E, X.InterfaceC199564136k
                    public final long LJII() {
                        return this.LLILZIL;
                    }

                    @Override // X.C135E, X.InterfaceC199564136k
                    public final InterfaceC199564136k<K, V> LJIIJ() {
                        return this.LLIZ;
                    }

                    @Override // X.C135E, X.InterfaceC199564136k
                    public final void LJIIJJI(long j) {
                        this.LLILZIL = j;
                    }

                    @Override // X.C135E, X.InterfaceC199564136k
                    public final void LJIJ(InterfaceC199564136k<K, V> interfaceC199564136k2) {
                        this.LLILZLL = interfaceC199564136k2;
                    }

                    @Override // X.C135E, X.InterfaceC199564136k
                    public final void LJIJI(InterfaceC199564136k<K, V> interfaceC199564136k2) {
                        this.LLIZ = interfaceC199564136k2;
                    }

                    {
                        C135G c135g = C135G.LL;
                        this.LLILZLL = c135g;
                        this.LLIZ = c135g;
                    }
                };
            }
        };
        EnumC199565136l enumC199565136l4 = new EnumC199565136l() { // from class: X.136p
            @Override // X.EnumC199565136l
            public final <K, V> InterfaceC199564136k<K, V> LJFF(C199595137p<K, V> c199595137p, InterfaceC199564136k<K, V> interfaceC199564136k, InterfaceC199564136k<K, V> interfaceC199564136k2) {
                InterfaceC199564136k<K, V> interfaceC199564136kLJFF = super.LJFF(c199595137p, interfaceC199564136k, interfaceC199564136k2);
                EnumC199565136l.LIZJ(interfaceC199564136k, interfaceC199564136kLJFF);
                EnumC199565136l.LJI(interfaceC199564136k, interfaceC199564136kLJFF);
                return interfaceC199564136kLJFF;
            }

            @Override // X.EnumC199565136l
            public final InterfaceC199564136k LJII(int i, C199595137p c199595137p, InterfaceC199564136k interfaceC199564136k, Object obj) {
                return new C135F<K, V>(obj, i, interfaceC199564136k) { // from class: X.135L
                    public volatile long LLILZIL = Long.MAX_VALUE;
                    public InterfaceC199564136k<K, V> LLILZLL;
                    public InterfaceC199564136k<K, V> LLIZ;
                    public volatile long LLIZLLLIL;
                    public InterfaceC199564136k<K, V> LLJ;
                    public InterfaceC199564136k<K, V> LLJI;

                    @Override // X.C135E, X.InterfaceC199564136k
                    public final InterfaceC199564136k<K, V> LJFF() {
                        return this.LLIZ;
                    }

                    @Override // X.C135E, X.InterfaceC199564136k
                    public final InterfaceC199564136k<K, V> LJI() {
                        return this.LLJ;
                    }

                    @Override // X.C135E, X.InterfaceC199564136k
                    public final long LJII() {
                        return this.LLIZLLLIL;
                    }

                    @Override // X.C135E, X.InterfaceC199564136k
                    public final InterfaceC199564136k<K, V> LJIIJ() {
                        return this.LLJI;
                    }

                    @Override // X.C135E, X.InterfaceC199564136k
                    public final InterfaceC199564136k<K, V> LJIIL() {
                        return this.LLILZLL;
                    }

                    @Override // X.C135E, X.InterfaceC199564136k
                    public final long LJIILJJIL() {
                        return this.LLILZIL;
                    }

                    @Override // X.C135E, X.InterfaceC199564136k
                    public final void LJIIIZ(long j) {
                        this.LLILZIL = j;
                    }

                    @Override // X.C135E, X.InterfaceC199564136k
                    public final void LJIIJJI(long j) {
                        this.LLIZLLLIL = j;
                    }

                    @Override // X.C135E, X.InterfaceC199564136k
                    public final void LJIILLIIL(InterfaceC199564136k<K, V> interfaceC199564136k2) {
                        this.LLILZLL = interfaceC199564136k2;
                    }

                    @Override // X.C135E, X.InterfaceC199564136k
                    public final void LJIIZILJ(InterfaceC199564136k<K, V> interfaceC199564136k2) {
                        this.LLIZ = interfaceC199564136k2;
                    }

                    @Override // X.C135E, X.InterfaceC199564136k
                    public final void LJIJ(InterfaceC199564136k<K, V> interfaceC199564136k2) {
                        this.LLJ = interfaceC199564136k2;
                    }

                    @Override // X.C135E, X.InterfaceC199564136k
                    public final void LJIJI(InterfaceC199564136k<K, V> interfaceC199564136k2) {
                        this.LLJI = interfaceC199564136k2;
                    }

                    {
                        C135G c135g = C135G.LL;
                        this.LLILZLL = c135g;
                        this.LLIZ = c135g;
                        this.LLIZLLLIL = Long.MAX_VALUE;
                        this.LLJ = c135g;
                        this.LLJI = c135g;
                    }
                };
            }
        };
        EnumC199565136l enumC199565136l5 = new EnumC199565136l() { // from class: X.136s
            @Override // X.EnumC199565136l
            public final InterfaceC199564136k LJII(int i, C199595137p c199595137p, InterfaceC199564136k interfaceC199564136k, Object obj) {
                return new C135B(i, interfaceC199564136k, obj, c199595137p.LLIZLLLIL);
            }
        };
        EnumC199565136l enumC199565136l6 = new EnumC199565136l() { // from class: X.136n
            @Override // X.EnumC199565136l
            public final <K, V> InterfaceC199564136k<K, V> LJFF(C199595137p<K, V> c199595137p, InterfaceC199564136k<K, V> interfaceC199564136k, InterfaceC199564136k<K, V> interfaceC199564136k2) {
                InterfaceC199564136k<K, V> interfaceC199564136kLJFF = super.LJFF(c199595137p, interfaceC199564136k, interfaceC199564136k2);
                EnumC199565136l.LIZJ(interfaceC199564136k, interfaceC199564136kLJFF);
                return interfaceC199564136kLJFF;
            }

            @Override // X.EnumC199565136l
            public final InterfaceC199564136k LJII(int i, C199595137p c199595137p, InterfaceC199564136k interfaceC199564136k, Object obj) {
                return new C135B<K, V>(i, interfaceC199564136k, obj, c199595137p.LLIZLLLIL) { // from class: X.135H
                    public volatile long LLILZ = Long.MAX_VALUE;
                    public InterfaceC199564136k<K, V> LLILZIL;
                    public InterfaceC199564136k<K, V> LLILZLL;

                    @Override // X.C135B, X.InterfaceC199564136k
                    public final InterfaceC199564136k<K, V> LJFF() {
                        return this.LLILZLL;
                    }

                    @Override // X.C135B, X.InterfaceC199564136k
                    public final InterfaceC199564136k<K, V> LJIIL() {
                        return this.LLILZIL;
                    }

                    @Override // X.C135B, X.InterfaceC199564136k
                    public final long LJIILJJIL() {
                        return this.LLILZ;
                    }

                    @Override // X.C135B, X.InterfaceC199564136k
                    public final void LJIIIZ(long j) {
                        this.LLILZ = j;
                    }

                    @Override // X.C135B, X.InterfaceC199564136k
                    public final void LJIILLIIL(InterfaceC199564136k<K, V> interfaceC199564136k2) {
                        this.LLILZIL = interfaceC199564136k2;
                    }

                    @Override // X.C135B, X.InterfaceC199564136k
                    public final void LJIIZILJ(InterfaceC199564136k<K, V> interfaceC199564136k2) {
                        this.LLILZLL = interfaceC199564136k2;
                    }

                    {
                        C135G c135g = C135G.LL;
                        this.LLILZIL = c135g;
                        this.LLILZLL = c135g;
                    }
                };
            }
        };
        EnumC199565136l enumC199565136l7 = new EnumC199565136l() { // from class: X.136o
            @Override // X.EnumC199565136l
            public final <K, V> InterfaceC199564136k<K, V> LJFF(C199595137p<K, V> c199595137p, InterfaceC199564136k<K, V> interfaceC199564136k, InterfaceC199564136k<K, V> interfaceC199564136k2) {
                InterfaceC199564136k<K, V> interfaceC199564136kLJFF = super.LJFF(c199595137p, interfaceC199564136k, interfaceC199564136k2);
                EnumC199565136l.LJI(interfaceC199564136k, interfaceC199564136kLJFF);
                return interfaceC199564136kLJFF;
            }

            @Override // X.EnumC199565136l
            public final InterfaceC199564136k LJII(int i, C199595137p c199595137p, InterfaceC199564136k interfaceC199564136k, Object obj) {
                return new C135B<K, V>(i, interfaceC199564136k, obj, c199595137p.LLIZLLLIL) { // from class: X.135J
                    public volatile long LLILZ = Long.MAX_VALUE;
                    public InterfaceC199564136k<K, V> LLILZIL;
                    public InterfaceC199564136k<K, V> LLILZLL;

                    @Override // X.C135B, X.InterfaceC199564136k
                    public final InterfaceC199564136k<K, V> LJI() {
                        return this.LLILZIL;
                    }

                    @Override // X.C135B, X.InterfaceC199564136k
                    public final long LJII() {
                        return this.LLILZ;
                    }

                    @Override // X.C135B, X.InterfaceC199564136k
                    public final InterfaceC199564136k<K, V> LJIIJ() {
                        return this.LLILZLL;
                    }

                    @Override // X.C135B, X.InterfaceC199564136k
                    public final void LJIIJJI(long j) {
                        this.LLILZ = j;
                    }

                    @Override // X.C135B, X.InterfaceC199564136k
                    public final void LJIJ(InterfaceC199564136k<K, V> interfaceC199564136k2) {
                        this.LLILZIL = interfaceC199564136k2;
                    }

                    @Override // X.C135B, X.InterfaceC199564136k
                    public final void LJIJI(InterfaceC199564136k<K, V> interfaceC199564136k2) {
                        this.LLILZLL = interfaceC199564136k2;
                    }

                    {
                        C135G c135g = C135G.LL;
                        this.LLILZIL = c135g;
                        this.LLILZLL = c135g;
                    }
                };
            }
        };
        EnumC199565136l enumC199565136l8 = new EnumC199565136l() { // from class: X.136m
            @Override // X.EnumC199565136l
            public final <K, V> InterfaceC199564136k<K, V> LJFF(C199595137p<K, V> c199595137p, InterfaceC199564136k<K, V> interfaceC199564136k, InterfaceC199564136k<K, V> interfaceC199564136k2) {
                InterfaceC199564136k<K, V> interfaceC199564136kLJFF = super.LJFF(c199595137p, interfaceC199564136k, interfaceC199564136k2);
                EnumC199565136l.LIZJ(interfaceC199564136k, interfaceC199564136kLJFF);
                EnumC199565136l.LJI(interfaceC199564136k, interfaceC199564136kLJFF);
                return interfaceC199564136kLJFF;
            }

            @Override // X.EnumC199565136l
            public final InterfaceC199564136k LJII(int i, C199595137p c199595137p, InterfaceC199564136k interfaceC199564136k, Object obj) {
                return new C135B<K, V>(i, interfaceC199564136k, obj, c199595137p.LLIZLLLIL) { // from class: X.135I
                    public volatile long LLILZ = Long.MAX_VALUE;
                    public InterfaceC199564136k<K, V> LLILZIL;
                    public InterfaceC199564136k<K, V> LLILZLL;
                    public volatile long LLIZ;
                    public InterfaceC199564136k<K, V> LLIZLLLIL;
                    public InterfaceC199564136k<K, V> LLJ;

                    @Override // X.C135B, X.InterfaceC199564136k
                    public final InterfaceC199564136k<K, V> LJFF() {
                        return this.LLILZLL;
                    }

                    @Override // X.C135B, X.InterfaceC199564136k
                    public final InterfaceC199564136k<K, V> LJI() {
                        return this.LLIZLLLIL;
                    }

                    @Override // X.C135B, X.InterfaceC199564136k
                    public final long LJII() {
                        return this.LLIZ;
                    }

                    @Override // X.C135B, X.InterfaceC199564136k
                    public final InterfaceC199564136k<K, V> LJIIJ() {
                        return this.LLJ;
                    }

                    @Override // X.C135B, X.InterfaceC199564136k
                    public final InterfaceC199564136k<K, V> LJIIL() {
                        return this.LLILZIL;
                    }

                    @Override // X.C135B, X.InterfaceC199564136k
                    public final long LJIILJJIL() {
                        return this.LLILZ;
                    }

                    @Override // X.C135B, X.InterfaceC199564136k
                    public final void LJIIIZ(long j) {
                        this.LLILZ = j;
                    }

                    @Override // X.C135B, X.InterfaceC199564136k
                    public final void LJIIJJI(long j) {
                        this.LLIZ = j;
                    }

                    @Override // X.C135B, X.InterfaceC199564136k
                    public final void LJIILLIIL(InterfaceC199564136k<K, V> interfaceC199564136k2) {
                        this.LLILZIL = interfaceC199564136k2;
                    }

                    @Override // X.C135B, X.InterfaceC199564136k
                    public final void LJIIZILJ(InterfaceC199564136k<K, V> interfaceC199564136k2) {
                        this.LLILZLL = interfaceC199564136k2;
                    }

                    @Override // X.C135B, X.InterfaceC199564136k
                    public final void LJIJ(InterfaceC199564136k<K, V> interfaceC199564136k2) {
                        this.LLIZLLLIL = interfaceC199564136k2;
                    }

                    @Override // X.C135B, X.InterfaceC199564136k
                    public final void LJIJI(InterfaceC199564136k<K, V> interfaceC199564136k2) {
                        this.LLJ = interfaceC199564136k2;
                    }

                    {
                        C135G c135g = C135G.LL;
                        this.LLILZIL = c135g;
                        this.LLILZLL = c135g;
                        this.LLIZ = Long.MAX_VALUE;
                        this.LLIZLLLIL = c135g;
                        this.LLJ = c135g;
                    }
                };
            }
        };
        LLILLJJLI = new EnumC199565136l[]{enumC199565136l, enumC199565136l2, enumC199565136l3, enumC199565136l4, enumC199565136l5, enumC199565136l6, enumC199565136l7, enumC199565136l8};
        LL = new EnumC199565136l[]{enumC199565136l, enumC199565136l2, enumC199565136l3, enumC199565136l4, enumC199565136l5, enumC199565136l6, enumC199565136l7, enumC199565136l8};
    }

    public static EnumC199565136l[] values() {
        return (EnumC199565136l[]) LLILLJJLI.clone();
    }

    public static EnumC199565136l valueOf(String str) {
        return (EnumC199565136l) C08FF.LIZ(EnumC199565136l.class, str);
    }

    public EnumC199565136l(String str, int i) {
    }

    public static void LIZJ(InterfaceC199564136k interfaceC199564136k, InterfaceC199564136k interfaceC199564136k2) {
        interfaceC199564136k2.LJIIIZ(interfaceC199564136k.LJIILJJIL());
        InterfaceC199564136k interfaceC199564136kLJFF = interfaceC199564136k.LJFF();
        interfaceC199564136kLJFF.LJIILLIIL(interfaceC199564136k2);
        interfaceC199564136k2.LJIIZILJ(interfaceC199564136kLJFF);
        InterfaceC199564136k interfaceC199564136kLJIIL = interfaceC199564136k.LJIIL();
        interfaceC199564136k2.LJIILLIIL(interfaceC199564136kLJIIL);
        interfaceC199564136kLJIIL.LJIIZILJ(interfaceC199564136k2);
        C135G c135g = C135G.LL;
        interfaceC199564136k.LJIILLIIL(c135g);
        interfaceC199564136k.LJIIZILJ(c135g);
    }

    public static void LJI(InterfaceC199564136k interfaceC199564136k, InterfaceC199564136k interfaceC199564136k2) {
        interfaceC199564136k2.LJIIJJI(interfaceC199564136k.LJII());
        InterfaceC199564136k interfaceC199564136kLJIIJ = interfaceC199564136k.LJIIJ();
        interfaceC199564136kLJIIJ.LJIJ(interfaceC199564136k2);
        interfaceC199564136k2.LJIJI(interfaceC199564136kLJIIJ);
        InterfaceC199564136k interfaceC199564136kLJI = interfaceC199564136k.LJI();
        interfaceC199564136k2.LJIJ(interfaceC199564136kLJI);
        interfaceC199564136kLJI.LJIJI(interfaceC199564136k2);
        C135G c135g = C135G.LL;
        interfaceC199564136k.LJIJ(c135g);
        interfaceC199564136k.LJIJI(c135g);
    }

    public <K, V> InterfaceC199564136k<K, V> LJFF(C199595137p<K, V> c199595137p, InterfaceC199564136k<K, V> interfaceC199564136k, InterfaceC199564136k<K, V> interfaceC199564136k2) {
        return LJII(interfaceC199564136k.getHash(), c199595137p, interfaceC199564136k2, interfaceC199564136k.getKey());
    }
}
