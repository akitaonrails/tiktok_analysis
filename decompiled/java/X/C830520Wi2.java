package X;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: X.0Wi2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C830520Wi2<K, V> implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
    public int LL;
    public int LLILLJJLI = -1;
    public boolean LLILLL;
    public final /* synthetic */ C830490Whz LLILZ;

    @Override // java.util.Map.Entry
    public final K getKey() {
        if (this.LLILLL) {
            return this.LLILZ.LJFF(this.LLILLJJLI);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        if (this.LLILLL) {
            return this.LLILZ.LJIIIIZZ(this.LLILLJJLI);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LLILLJJLI < this.LL;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.LLILLL) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        K kLJFF = this.LLILZ.LJFF(this.LLILLJJLI);
        V vLJIIIIZZ = this.LLILZ.LJIIIIZZ(this.LLILLJJLI);
        return (kLJFF == null ? 0 : kLJFF.hashCode()) ^ (vLJIIIIZZ != null ? vLJIIIIZZ.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.LLILLL) {
            throw new IllegalStateException();
        }
        this.LLILZ.LJI(this.LLILLJJLI);
        this.LLILLJJLI--;
        this.LL--;
        this.LLILLL = false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.LLILLJJLI++;
        this.LLILLL = true;
        return this;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getKey());
        sbLIZ.append("=");
        sbLIZ.append(getValue());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C830520Wi2(C830490Whz c830490Whz) {
        this.LLILZ = c830490Whz;
        this.LL = c830490Whz.LLILLL - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.LLILLL) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!Intrinsics.LJFF(entry.getKey(), this.LLILZ.LJFF(this.LLILLJJLI)) || !Intrinsics.LJFF(entry.getValue(), this.LLILZ.LJIIIIZZ(this.LLILLJJLI))) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        if (this.LLILLL) {
            return this.LLILZ.LJII(this.LLILLJJLI, v);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
}
