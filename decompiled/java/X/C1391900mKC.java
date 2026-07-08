package X;

import android.widget.CompoundButton;

/* JADX INFO: renamed from: X.0mKC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1391900mKC extends AbstractC1391920mKE {
    public final CharSequence LJI;
    public final Integer LJII;
    public final CharSequence LJIIIIZZ;
    public final boolean LJIIIZ;
    public final CompoundButton.OnCheckedChangeListener LJIIJ;

    @Override // X.AbstractC1391920mKE, X.AbstractC1391880mKA
    public final Integer LIZ() {
        return this.LJII;
    }

    @Override // X.AbstractC1391920mKE, X.AbstractC1391880mKA
    public final CharSequence LIZIZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC1391920mKE, X.AbstractC1391880mKA
    public final CharSequence LIZJ() {
        return this.LJI;
    }

    public C1391900mKC(CharSequence charSequence, Integer num, CharSequence charSequence2, boolean z, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        super(charSequence, num, charSequence2);
        this.LJI = charSequence;
        this.LJII = num;
        this.LJIIIIZZ = charSequence2;
        this.LJIIIZ = z;
        this.LJIIJ = onCheckedChangeListener;
    }
}
