package X;

/* JADX INFO: renamed from: X.11Ig, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19477611Ig<T> extends AbstractC19486711Lt implements C01G8<T> {
    public final C11ID<T> LL;

    @Override // X.C01G8
    public final C19477711Ih LIZ() {
        final C11ID<T> c11id = this.LL;
        return new AbstractC19477911Ij<T, T>(c11id) { // from class: X.11Ih
            @Override // X.AbstractC19483511Kn
            public final void LJIJI(C11IH<? super T> c11ih) {
                this.LL.LIZ(new C11IP(c11ih));
            }
        };
    }

    public C19477611Ig(C19479411Iy c19479411Iy) {
        this.LL = c19479411Iy;
    }

    @Override // X.AbstractC19486711Lt
    public final void LJIJJ(C11IY c11iy) {
        this.LL.LIZ(new C19477511If(c11iy));
    }
}
