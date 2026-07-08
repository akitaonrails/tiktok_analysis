package X;

/* JADX INFO: renamed from: X.11Pm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19496411Pm<T> extends AbstractC19495811Pg<T> {
    public static final long serialVersionUID = 4127754106204442833L;

    public abstract void LJ();

    public AbstractC19496411Pm(C11M9<? super T> c11m9) {
        super(c11m9);
    }

    @Override // X.AbstractC19495811Pg, X.InterfaceC947803nA
    public final void onNext(T t) {
        if (isCancelled()) {
            return;
        }
        if (t == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else if (get() != 0) {
            this.LL.onNext(t);
            C19492311Nx.LIZJ(this, 1L);
        } else {
            LJ();
        }
    }
}
