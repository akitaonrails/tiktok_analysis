package X;

import java.util.Iterator;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.12s1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19890312s1<E> implements Iterable<E> {
    public final AbstractC19852312lt<Iterable<E>> LL;

    public final String toString() {
        Iterator<E> it2 = this.LL.or(this).iterator();
        StringBuilder sb = new StringBuilder(e3.e);
        boolean z = true;
        while (it2.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it2.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public AbstractC19890312s1() {
        this.LL = AbstractC19852312lt.absent();
    }

    public AbstractC19890312s1(Iterable<E> iterable) {
        this.LL = AbstractC19852312lt.of(iterable);
    }

    public static <E> AbstractC19890312s1<E> LJ(final Iterable<E> iterable) {
        if (iterable instanceof AbstractC19890312s1) {
            return (AbstractC19890312s1) iterable;
        }
        return new AbstractC19890312s1<E>(iterable) { // from class: X.12s5
            @Override // java.lang.Iterable
            public final Iterator<E> iterator() {
                return iterable.iterator();
            }
        };
    }

    public final AbstractC19890312s1<E> LIZJ(InterfaceC1394580mOW<? super E> interfaceC1394580mOW) {
        Iterable<E> iterableOr = this.LL.or(this);
        iterableOr.getClass();
        return LJ(new C19890512s3(iterableOr, interfaceC1394580mOW));
    }
}
