package X;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: X.12lr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19852112lr<T> extends AbstractC19852312lt<T> {
    public static final long serialVersionUID = 0;
    public final T LL;

    @Override // X.AbstractC19852312lt
    public final boolean isPresent() {
        return true;
    }

    @Override // X.AbstractC19852312lt
    public final Set<T> asSet() {
        return Collections.singleton(this.LL);
    }

    @Override // X.AbstractC19852312lt
    public final int hashCode() {
        return this.LL.hashCode() + 1502476572;
    }

    @Override // X.AbstractC19852312lt
    public final String toString() {
        String strValueOf = String.valueOf(this.LL);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }

    @Override // X.AbstractC19852312lt
    public final T get() {
        return this.LL;
    }

    @Override // X.AbstractC19852312lt
    public final T orNull() {
        return this.LL;
    }

    public C19852112lr(T t) {
        this.LL = t;
    }

    @Override // X.AbstractC19852312lt
    public final boolean equals(Object obj) {
        if (obj instanceof C19852112lr) {
            return this.LL.equals(((C19852112lr) obj).LL);
        }
        return false;
    }

    @Override // X.AbstractC19852312lt
    public final T or(T t) {
        C19864312np.LJI(t, "use Optional.orNull() instead of Optional.or(null)");
        return this.LL;
    }

    @Override // X.AbstractC19852312lt
    public final <V> AbstractC19852312lt<V> transform(InterfaceC19882712qn<? super T, V> interfaceC19882712qn) {
        V vApply = interfaceC19882712qn.apply(this.LL);
        C19864312np.LJI(vApply, "the Function passed to Optional.transform() must not return null.");
        return new C19852112lr(vApply);
    }

    @Override // X.AbstractC19852312lt
    public final T or(InterfaceC1456340o08<? extends T> interfaceC1456340o08) {
        interfaceC1456340o08.getClass();
        return this.LL;
    }

    @Override // X.AbstractC19852312lt
    public final AbstractC19852312lt<T> or(AbstractC19852312lt<? extends T> abstractC19852312lt) {
        abstractC19852312lt.getClass();
        return this;
    }
}
