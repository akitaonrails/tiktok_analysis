package X;

/* JADX INFO: renamed from: X.12yK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19929412yK<T, B> {
    public abstract void LIZ(int i, int i2, Object obj);

    public abstract void LIZIZ(int i, long j, Object obj);

    public abstract void LIZJ(int i, Object obj, Object obj2);

    public abstract void LIZLLL(B b, int i, AbstractC19922812xG abstractC19922812xG);

    public abstract void LJ(int i, long j, Object obj);

    public abstract B LJFF(Object obj);

    public abstract T LJI(Object obj);

    public abstract int LJII(T t);

    public abstract int LJIIIIZZ(T t);

    public abstract void LJIIIZ(Object obj);

    public abstract T LJIIJ(T t, T t2);

    public abstract B LJIIL();

    public abstract void LJIILIIL(Object obj, B b);

    public abstract void LJIILJJIL(Object obj, T t);

    public abstract boolean LJIILL(InterfaceC19929112yH interfaceC19929112yH);

    public abstract T LJIILLIIL(B b);

    public abstract void LJIIZILJ(T t, InterfaceC19361110or interfaceC19361110or);

    public abstract void LJIJ(T t, InterfaceC19361110or interfaceC19361110or);

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJIIJJI(int i, InterfaceC19929112yH interfaceC19929112yH, Object obj) throws C19926612xs {
        int tag = interfaceC19929112yH.getTag();
        int i2 = tag >>> 3;
        int i3 = tag & 7;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 == 5) {
                                LIZ(i2, interfaceC19929112yH.LJIIJJI(), obj);
                                return true;
                            }
                            throw C19926612xs.LIZLLL();
                        }
                        if (i != 0) {
                            return false;
                        }
                        throw C19926612xs.LIZ();
                    }
                    B bLJIIL = LJIIL();
                    int i4 = (i2 << 3) | 4;
                    int i5 = i + 1;
                    if (i5 >= 100) {
                        throw new C19926612xs("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    }
                    while (interfaceC19929112yH.LJIJ() != Integer.MAX_VALUE && LJIIJJI(i5, interfaceC19929112yH, bLJIIL)) {
                    }
                    if (i4 == interfaceC19929112yH.getTag()) {
                        LIZJ(i2, obj, LJIILLIIL(bLJIIL));
                        return true;
                    }
                    throw C19926612xs.LIZ();
                }
                LIZLLL(obj, i2, interfaceC19929112yH.LJIILL());
                return true;
            }
            LIZIZ(i2, interfaceC19929112yH.LJIJJLI(), obj);
            return true;
        }
        LJ(i2, interfaceC19929112yH.LJII(), obj);
        return true;
    }
}
