package X;

/* JADX INFO: renamed from: X.0mKB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1391890mKB extends AbstractC1391880mKA {
    public final CharSequence LIZLLL;
    public final Integer LJ;
    public final CharSequence LJFF;

    @Override // X.AbstractC1391880mKA
    public final Integer LIZ() {
        return this.LJ;
    }

    @Override // X.AbstractC1391880mKA
    public final CharSequence LIZIZ() {
        return this.LJFF;
    }

    @Override // X.AbstractC1391880mKA
    public final CharSequence LIZJ() {
        return this.LIZLLL;
    }

    public C1391890mKB(CharSequence charSequence, Integer num, CharSequence charSequence2) {
        super(charSequence, num, charSequence2);
        this.LIZLLL = charSequence;
        this.LJ = num;
        this.LJFF = charSequence2;
    }

    public /* synthetic */ C1391890mKB(CharSequence charSequence, Integer num, CharSequence charSequence2, int i) {
        this(charSequence, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : charSequence2);
    }
}
