package X;

/* JADX INFO: renamed from: X.1DDv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2252371DDv extends C2252331DDr<Integer> implements C05YD<Integer> {
    @Override // X.C05YD
    public final Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(((Number) this.LLIZLLLIL[((int) ((this.LLJ + ((long) ((int) ((LJIILJJIL() + ((long) this.LLJIJIL)) - this.LLJ)))) - 1)) & (r6.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public C2252371DDv(int i) {
        super(1, Integer.MAX_VALUE, EnumC2252401DDy.DROP_OLDEST);
        LIZJ(Integer.valueOf(i));
    }

    public final void LJIJJLI(int i) {
        synchronized (this) {
            LIZJ(Integer.valueOf(((Number) this.LLIZLLLIL[((int) ((this.LLJ + ((long) ((int) ((LJIILJJIL() + ((long) this.LLJIJIL)) - this.LLJ)))) - 1)) & (r6.length - 1)]).intValue() + i));
        }
    }
}
