package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: X.13EL, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13EL<T> extends AbstractC19974313Dh<T> {
    public final List<T> LLILLJJLI;

    @Override // X.AbstractC2253808sK
    public final int LIZJ() {
        return this.LLILLJJLI.size();
    }

    @Override // X.AbstractC19974313Dh, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new C13EM(this, 0);
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final ListIterator<T> listIterator() {
        return new C13EM(this, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13EL(List<? extends T> list) {
        this.LLILLJJLI = list;
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final T get(int i) {
        return (T) ListProtector.get(this.LLILLJJLI, C13EP.LJJIJIIJIL(i, this));
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new C13EM(this, i);
    }
}
