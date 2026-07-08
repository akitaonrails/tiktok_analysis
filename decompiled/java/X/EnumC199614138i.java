package X;

import java.lang.ref.ReferenceQueue;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.138i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class EnumC199614138i {
    public static final EnumC199614138i[] LL;
    public static final /* synthetic */ EnumC199614138i[] LLILLJJLI;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC199614138i EF17;

    public EnumC199614138i() {
        throw null;
    }

    public abstract InterfaceC199613138h LJII(int i, C199610138e c199610138e, InterfaceC199613138h interfaceC199613138h, Object obj);

    static {
        EnumC199614138i enumC199614138i = new EnumC199614138i() { // from class: X.139A
            @Override // X.EnumC199614138i
            public final InterfaceC199613138h LJII(int i, C199610138e c199610138e, InterfaceC199613138h interfaceC199613138h, Object obj) {
                return new C199621138p(obj, i, interfaceC199613138h);
            }
        };
        EnumC199614138i enumC199614138i2 = new EnumC199614138i() { // from class: X.138s
            @Override // X.EnumC199614138i
            public final <K, V> InterfaceC199613138h<K, V> LJFF(C199610138e<K, V> c199610138e, InterfaceC199613138h<K, V> interfaceC199613138h, InterfaceC199613138h<K, V> interfaceC199613138h2) {
                InterfaceC199613138h<K, V> interfaceC199613138hLJFF = super.LJFF(c199610138e, interfaceC199613138h, interfaceC199613138h2);
                EnumC199614138i.LIZJ(interfaceC199613138h, interfaceC199613138hLJFF);
                return interfaceC199613138hLJFF;
            }

            @Override // X.EnumC199614138i
            public final InterfaceC199613138h LJII(final int i, C199610138e c199610138e, final InterfaceC199613138h interfaceC199613138h, final Object obj) {
                return new C199621138p<K, V>(obj, i, interfaceC199613138h) { // from class: X.138y
                    public volatile long LLILZIL = Long.MAX_VALUE;
                    public InterfaceC199613138h<K, V> LLILZLL;
                    public InterfaceC199613138h<K, V> LLIZ;

                    @Override // X.AbstractC199629138x, X.InterfaceC199613138h
                    public final InterfaceC199613138h<K, V> LJFF() {
                        return this.LLIZ;
                    }

                    @Override // X.AbstractC199629138x, X.InterfaceC199613138h
                    public final InterfaceC199613138h<K, V> LJIIL() {
                        return this.LLILZLL;
                    }

                    @Override // X.AbstractC199629138x, X.InterfaceC199613138h
                    public final long LJIILJJIL() {
                        return this.LLILZIL;
                    }

                    @Override // X.AbstractC199629138x, X.InterfaceC199613138h
                    public final void LJIIIZ(long j) {
                        this.LLILZIL = j;
                    }

                    @Override // X.AbstractC199629138x, X.InterfaceC199613138h
                    public final void LJIJ(InterfaceC199613138h<K, V> interfaceC199613138h2) {
                        this.LLIZ = interfaceC199613138h2;
                    }

                    @Override // X.AbstractC199629138x, X.InterfaceC199613138h
                    public final void LJIJI(InterfaceC199613138h<K, V> interfaceC199613138h2) {
                        this.LLILZLL = interfaceC199613138h2;
                    }

                    {
                        EnumC199623138r enumC199623138r = EnumC199623138r.LL;
                        this.LLILZLL = enumC199623138r;
                        this.LLIZ = enumC199623138r;
                    }
                };
            }
        };
        EnumC199614138i enumC199614138i3 = new EnumC199614138i() { // from class: X.138t
            @Override // X.EnumC199614138i
            public final <K, V> InterfaceC199613138h<K, V> LJFF(C199610138e<K, V> c199610138e, InterfaceC199613138h<K, V> interfaceC199613138h, InterfaceC199613138h<K, V> interfaceC199613138h2) {
                InterfaceC199613138h<K, V> interfaceC199613138hLJFF = super.LJFF(c199610138e, interfaceC199613138h, interfaceC199613138h2);
                EnumC199614138i.LJI(interfaceC199613138h, interfaceC199613138hLJFF);
                return interfaceC199613138hLJFF;
            }

            @Override // X.EnumC199614138i
            public final InterfaceC199613138h LJII(final int i, C199610138e c199610138e, final InterfaceC199613138h interfaceC199613138h, final Object obj) {
                return new C199621138p<K, V>(obj, i, interfaceC199613138h) { // from class: X.1390
                    public volatile long LLILZIL = Long.MAX_VALUE;
                    public InterfaceC199613138h<K, V> LLILZLL;
                    public InterfaceC199613138h<K, V> LLIZ;

                    @Override // X.AbstractC199629138x, X.InterfaceC199613138h
                    public final InterfaceC199613138h<K, V> LJI() {
                        return this.LLILZLL;
                    }

                    @Override // X.AbstractC199629138x, X.InterfaceC199613138h
                    public final long LJII() {
                        return this.LLILZIL;
                    }

                    @Override // X.AbstractC199629138x, X.InterfaceC199613138h
                    public final InterfaceC199613138h<K, V> LJIIJ() {
                        return this.LLIZ;
                    }

                    @Override // X.AbstractC199629138x, X.InterfaceC199613138h
                    public final void LJIIJJI(long j) {
                        this.LLILZIL = j;
                    }

                    @Override // X.AbstractC199629138x, X.InterfaceC199613138h
                    public final void LJIILLIIL(InterfaceC199613138h<K, V> interfaceC199613138h2) {
                        this.LLIZ = interfaceC199613138h2;
                    }

                    @Override // X.AbstractC199629138x, X.InterfaceC199613138h
                    public final void LJIIZILJ(InterfaceC199613138h<K, V> interfaceC199613138h2) {
                        this.LLILZLL = interfaceC199613138h2;
                    }

                    {
                        EnumC199623138r enumC199623138r = EnumC199623138r.LL;
                        this.LLILZLL = enumC199623138r;
                        this.LLIZ = enumC199623138r;
                    }
                };
            }
        };
        EnumC199614138i enumC199614138i4 = new EnumC199614138i() { // from class: X.138q
            @Override // X.EnumC199614138i
            public final <K, V> InterfaceC199613138h<K, V> LJFF(C199610138e<K, V> c199610138e, InterfaceC199613138h<K, V> interfaceC199613138h, InterfaceC199613138h<K, V> interfaceC199613138h2) {
                InterfaceC199613138h<K, V> interfaceC199613138hLJFF = super.LJFF(c199610138e, interfaceC199613138h, interfaceC199613138h2);
                EnumC199614138i.LIZJ(interfaceC199613138h, interfaceC199613138hLJFF);
                EnumC199614138i.LJI(interfaceC199613138h, interfaceC199613138hLJFF);
                return interfaceC199613138hLJFF;
            }

            @Override // X.EnumC199614138i
            public final InterfaceC199613138h LJII(final int i, C199610138e c199610138e, final InterfaceC199613138h interfaceC199613138h, final Object obj) {
                return new C199621138p<K, V>(obj, i, interfaceC199613138h) { // from class: X.138z
                    public volatile long LLILZIL = Long.MAX_VALUE;
                    public InterfaceC199613138h<K, V> LLILZLL;
                    public InterfaceC199613138h<K, V> LLIZ;
                    public volatile long LLIZLLLIL;
                    public InterfaceC199613138h<K, V> LLJ;
                    public InterfaceC199613138h<K, V> LLJI;

                    @Override // X.AbstractC199629138x, X.InterfaceC199613138h
                    public final InterfaceC199613138h<K, V> LJFF() {
                        return this.LLIZ;
                    }

                    @Override // X.AbstractC199629138x, X.InterfaceC199613138h
                    public final InterfaceC199613138h<K, V> LJI() {
                        return this.LLJ;
                    }

                    @Override // X.AbstractC199629138x, X.InterfaceC199613138h
                    public final long LJII() {
                        return this.LLIZLLLIL;
                    }

                    @Override // X.AbstractC199629138x, X.InterfaceC199613138h
                    public final InterfaceC199613138h<K, V> LJIIJ() {
                        return this.LLJI;
                    }

                    @Override // X.AbstractC199629138x, X.InterfaceC199613138h
                    public final InterfaceC199613138h<K, V> LJIIL() {
                        return this.LLILZLL;
                    }

                    @Override // X.AbstractC199629138x, X.InterfaceC199613138h
                    public final long LJIILJJIL() {
                        return this.LLILZIL;
                    }

                    @Override // X.AbstractC199629138x, X.InterfaceC199613138h
                    public final void LJIIIZ(long j) {
                        this.LLILZIL = j;
                    }

                    @Override // X.AbstractC199629138x, X.InterfaceC199613138h
                    public final void LJIIJJI(long j) {
                        this.LLIZLLLIL = j;
                    }

                    @Override // X.AbstractC199629138x, X.InterfaceC199613138h
                    public final void LJIILLIIL(InterfaceC199613138h<K, V> interfaceC199613138h2) {
                        this.LLJI = interfaceC199613138h2;
                    }

                    @Override // X.AbstractC199629138x, X.InterfaceC199613138h
                    public final void LJIIZILJ(InterfaceC199613138h<K, V> interfaceC199613138h2) {
                        this.LLJ = interfaceC199613138h2;
                    }

                    @Override // X.AbstractC199629138x, X.InterfaceC199613138h
                    public final void LJIJ(InterfaceC199613138h<K, V> interfaceC199613138h2) {
                        this.LLIZ = interfaceC199613138h2;
                    }

                    @Override // X.AbstractC199629138x, X.InterfaceC199613138h
                    public final void LJIJI(InterfaceC199613138h<K, V> interfaceC199613138h2) {
                        this.LLILZLL = interfaceC199613138h2;
                    }

                    {
                        EnumC199623138r enumC199623138r = EnumC199623138r.LL;
                        this.LLILZLL = enumC199623138r;
                        this.LLIZ = enumC199623138r;
                        this.LLIZLLLIL = Long.MAX_VALUE;
                        this.LLJ = enumC199623138r;
                        this.LLJI = enumC199623138r;
                    }
                };
            }
        };
        EnumC199614138i enumC199614138i5 = new EnumC199614138i() { // from class: X.1395
            @Override // X.EnumC199614138i
            public final InterfaceC199613138h LJII(int i, C199610138e c199610138e, InterfaceC199613138h interfaceC199613138h, Object obj) {
                return new C199611138f(i, interfaceC199613138h, obj, c199610138e.LLIZLLLIL);
            }
        };
        EnumC199614138i enumC199614138i6 = new EnumC199614138i() { // from class: X.138n
            @Override // X.EnumC199614138i
            public final <K, V> InterfaceC199613138h<K, V> LJFF(C199610138e<K, V> c199610138e, InterfaceC199613138h<K, V> interfaceC199613138h, InterfaceC199613138h<K, V> interfaceC199613138h2) {
                InterfaceC199613138h<K, V> interfaceC199613138hLJFF = super.LJFF(c199610138e, interfaceC199613138h, interfaceC199613138h2);
                EnumC199614138i.LIZJ(interfaceC199613138h, interfaceC199613138hLJFF);
                return interfaceC199613138hLJFF;
            }

            @Override // X.EnumC199614138i
            public final InterfaceC199613138h LJII(final int i, C199610138e c199610138e, final InterfaceC199613138h interfaceC199613138h, final Object obj) {
                final ReferenceQueue<K> referenceQueue = c199610138e.LLIZLLLIL;
                return new C199611138f<K, V>(i, interfaceC199613138h, obj, referenceQueue) { // from class: X.138v
                    public volatile long LLILZ = Long.MAX_VALUE;
                    public InterfaceC199613138h<K, V> LLILZIL;
                    public InterfaceC199613138h<K, V> LLILZLL;

                    @Override // X.C199611138f, X.InterfaceC199613138h
                    public final InterfaceC199613138h<K, V> LJFF() {
                        return this.LLILZLL;
                    }

                    @Override // X.C199611138f, X.InterfaceC199613138h
                    public final InterfaceC199613138h<K, V> LJIIL() {
                        return this.LLILZIL;
                    }

                    @Override // X.C199611138f, X.InterfaceC199613138h
                    public final long LJIILJJIL() {
                        return this.LLILZ;
                    }

                    @Override // X.C199611138f, X.InterfaceC199613138h
                    public final void LJIIIZ(long j) {
                        this.LLILZ = j;
                    }

                    @Override // X.C199611138f, X.InterfaceC199613138h
                    public final void LJIJ(InterfaceC199613138h<K, V> interfaceC199613138h2) {
                        this.LLILZLL = interfaceC199613138h2;
                    }

                    @Override // X.C199611138f, X.InterfaceC199613138h
                    public final void LJIJI(InterfaceC199613138h<K, V> interfaceC199613138h2) {
                        this.LLILZIL = interfaceC199613138h2;
                    }

                    {
                        EnumC199623138r enumC199623138r = EnumC199623138r.LL;
                        this.LLILZIL = enumC199623138r;
                        this.LLILZLL = enumC199623138r;
                    }
                };
            }
        };
        EnumC199614138i enumC199614138i7 = new EnumC199614138i() { // from class: X.138o
            @Override // X.EnumC199614138i
            public final <K, V> InterfaceC199613138h<K, V> LJFF(C199610138e<K, V> c199610138e, InterfaceC199613138h<K, V> interfaceC199613138h, InterfaceC199613138h<K, V> interfaceC199613138h2) {
                InterfaceC199613138h<K, V> interfaceC199613138hLJFF = super.LJFF(c199610138e, interfaceC199613138h, interfaceC199613138h2);
                EnumC199614138i.LJI(interfaceC199613138h, interfaceC199613138hLJFF);
                return interfaceC199613138hLJFF;
            }

            @Override // X.EnumC199614138i
            public final InterfaceC199613138h LJII(final int i, C199610138e c199610138e, final InterfaceC199613138h interfaceC199613138h, final Object obj) {
                final ReferenceQueue<K> referenceQueue = c199610138e.LLIZLLLIL;
                return new C199611138f<K, V>(i, interfaceC199613138h, obj, referenceQueue) { // from class: X.138u
                    public volatile long LLILZ = Long.MAX_VALUE;
                    public InterfaceC199613138h<K, V> LLILZIL;
                    public InterfaceC199613138h<K, V> LLILZLL;

                    @Override // X.C199611138f, X.InterfaceC199613138h
                    public final InterfaceC199613138h<K, V> LJI() {
                        return this.LLILZIL;
                    }

                    @Override // X.C199611138f, X.InterfaceC199613138h
                    public final long LJII() {
                        return this.LLILZ;
                    }

                    @Override // X.C199611138f, X.InterfaceC199613138h
                    public final InterfaceC199613138h<K, V> LJIIJ() {
                        return this.LLILZLL;
                    }

                    @Override // X.C199611138f, X.InterfaceC199613138h
                    public final void LJIIJJI(long j) {
                        this.LLILZ = j;
                    }

                    @Override // X.C199611138f, X.InterfaceC199613138h
                    public final void LJIILLIIL(InterfaceC199613138h<K, V> interfaceC199613138h2) {
                        this.LLILZLL = interfaceC199613138h2;
                    }

                    @Override // X.C199611138f, X.InterfaceC199613138h
                    public final void LJIIZILJ(InterfaceC199613138h<K, V> interfaceC199613138h2) {
                        this.LLILZIL = interfaceC199613138h2;
                    }

                    {
                        EnumC199623138r enumC199623138r = EnumC199623138r.LL;
                        this.LLILZIL = enumC199623138r;
                        this.LLILZLL = enumC199623138r;
                    }
                };
            }
        };
        EnumC199614138i enumC199614138i8 = new EnumC199614138i() { // from class: X.138l
            @Override // X.EnumC199614138i
            public final <K, V> InterfaceC199613138h<K, V> LJFF(C199610138e<K, V> c199610138e, InterfaceC199613138h<K, V> interfaceC199613138h, InterfaceC199613138h<K, V> interfaceC199613138h2) {
                InterfaceC199613138h<K, V> interfaceC199613138hLJFF = super.LJFF(c199610138e, interfaceC199613138h, interfaceC199613138h2);
                EnumC199614138i.LIZJ(interfaceC199613138h, interfaceC199613138hLJFF);
                EnumC199614138i.LJI(interfaceC199613138h, interfaceC199613138hLJFF);
                return interfaceC199613138hLJFF;
            }

            @Override // X.EnumC199614138i
            public final InterfaceC199613138h LJII(final int i, C199610138e c199610138e, final InterfaceC199613138h interfaceC199613138h, final Object obj) {
                final ReferenceQueue<K> referenceQueue = c199610138e.LLIZLLLIL;
                return new C199611138f<K, V>(i, interfaceC199613138h, obj, referenceQueue) { // from class: X.138w
                    public volatile long LLILZ = Long.MAX_VALUE;
                    public InterfaceC199613138h<K, V> LLILZIL;
                    public InterfaceC199613138h<K, V> LLILZLL;
                    public volatile long LLIZ;
                    public InterfaceC199613138h<K, V> LLIZLLLIL;
                    public InterfaceC199613138h<K, V> LLJ;

                    @Override // X.C199611138f, X.InterfaceC199613138h
                    public final InterfaceC199613138h<K, V> LJFF() {
                        return this.LLILZLL;
                    }

                    @Override // X.C199611138f, X.InterfaceC199613138h
                    public final InterfaceC199613138h<K, V> LJI() {
                        return this.LLIZLLLIL;
                    }

                    @Override // X.C199611138f, X.InterfaceC199613138h
                    public final long LJII() {
                        return this.LLIZ;
                    }

                    @Override // X.C199611138f, X.InterfaceC199613138h
                    public final InterfaceC199613138h<K, V> LJIIJ() {
                        return this.LLJ;
                    }

                    @Override // X.C199611138f, X.InterfaceC199613138h
                    public final InterfaceC199613138h<K, V> LJIIL() {
                        return this.LLILZIL;
                    }

                    @Override // X.C199611138f, X.InterfaceC199613138h
                    public final long LJIILJJIL() {
                        return this.LLILZ;
                    }

                    @Override // X.C199611138f, X.InterfaceC199613138h
                    public final void LJIIIZ(long j) {
                        this.LLILZ = j;
                    }

                    @Override // X.C199611138f, X.InterfaceC199613138h
                    public final void LJIIJJI(long j) {
                        this.LLIZ = j;
                    }

                    @Override // X.C199611138f, X.InterfaceC199613138h
                    public final void LJIILLIIL(InterfaceC199613138h<K, V> interfaceC199613138h2) {
                        this.LLJ = interfaceC199613138h2;
                    }

                    @Override // X.C199611138f, X.InterfaceC199613138h
                    public final void LJIIZILJ(InterfaceC199613138h<K, V> interfaceC199613138h2) {
                        this.LLIZLLLIL = interfaceC199613138h2;
                    }

                    @Override // X.C199611138f, X.InterfaceC199613138h
                    public final void LJIJ(InterfaceC199613138h<K, V> interfaceC199613138h2) {
                        this.LLILZLL = interfaceC199613138h2;
                    }

                    @Override // X.C199611138f, X.InterfaceC199613138h
                    public final void LJIJI(InterfaceC199613138h<K, V> interfaceC199613138h2) {
                        this.LLILZIL = interfaceC199613138h2;
                    }

                    {
                        EnumC199623138r enumC199623138r = EnumC199623138r.LL;
                        this.LLILZIL = enumC199623138r;
                        this.LLILZLL = enumC199623138r;
                        this.LLIZ = Long.MAX_VALUE;
                        this.LLIZLLLIL = enumC199623138r;
                        this.LLJ = enumC199623138r;
                    }
                };
            }
        };
        LLILLJJLI = new EnumC199614138i[]{enumC199614138i, enumC199614138i2, enumC199614138i3, enumC199614138i4, enumC199614138i5, enumC199614138i6, enumC199614138i7, enumC199614138i8};
        LL = new EnumC199614138i[]{enumC199614138i, enumC199614138i2, enumC199614138i3, enumC199614138i4, enumC199614138i5, enumC199614138i6, enumC199614138i7, enumC199614138i8};
    }

    public static EnumC199614138i[] values() {
        return (EnumC199614138i[]) LLILLJJLI.clone();
    }

    public static EnumC199614138i valueOf(String str) {
        return (EnumC199614138i) C08FF.LIZ(EnumC199614138i.class, str);
    }

    public EnumC199614138i(String str, int i) {
    }

    public static void LIZJ(InterfaceC199613138h interfaceC199613138h, InterfaceC199613138h interfaceC199613138h2) {
        interfaceC199613138h2.LJIIIZ(interfaceC199613138h.LJIILJJIL());
        InterfaceC199613138h interfaceC199613138hLJFF = interfaceC199613138h.LJFF();
        interfaceC199613138hLJFF.LJIJI(interfaceC199613138h2);
        interfaceC199613138h2.LJIJ(interfaceC199613138hLJFF);
        InterfaceC199613138h interfaceC199613138hLJIIL = interfaceC199613138h.LJIIL();
        interfaceC199613138h2.LJIJI(interfaceC199613138hLJIIL);
        interfaceC199613138hLJIIL.LJIJ(interfaceC199613138h2);
        EnumC199623138r enumC199623138r = EnumC199623138r.LL;
        interfaceC199613138h.LJIJI(enumC199623138r);
        interfaceC199613138h.LJIJ(enumC199623138r);
    }

    public static void LJI(InterfaceC199613138h interfaceC199613138h, InterfaceC199613138h interfaceC199613138h2) {
        interfaceC199613138h2.LJIIJJI(interfaceC199613138h.LJII());
        InterfaceC199613138h interfaceC199613138hLJIIJ = interfaceC199613138h.LJIIJ();
        interfaceC199613138hLJIIJ.LJIIZILJ(interfaceC199613138h2);
        interfaceC199613138h2.LJIILLIIL(interfaceC199613138hLJIIJ);
        InterfaceC199613138h interfaceC199613138hLJI = interfaceC199613138h.LJI();
        interfaceC199613138h2.LJIIZILJ(interfaceC199613138hLJI);
        interfaceC199613138hLJI.LJIILLIIL(interfaceC199613138h2);
        EnumC199623138r enumC199623138r = EnumC199623138r.LL;
        interfaceC199613138h.LJIIZILJ(enumC199623138r);
        interfaceC199613138h.LJIILLIIL(enumC199623138r);
    }

    public <K, V> InterfaceC199613138h<K, V> LJFF(C199610138e<K, V> c199610138e, InterfaceC199613138h<K, V> interfaceC199613138h, InterfaceC199613138h<K, V> interfaceC199613138h2) {
        return LJII(interfaceC199613138h.getHash(), c199610138e, interfaceC199613138h2, interfaceC199613138h.getKey());
    }
}
