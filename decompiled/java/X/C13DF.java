package X;

import java.util.ConcurrentModificationException;

/* JADX INFO: renamed from: X.13DF, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C13DF<K, V> {
    public final C13DA<K, V> LL;
    public int LLILLJJLI;
    public int LLILLL = -1;
    public int LLILZ;

    public final void LIZ() {
        if (this.LL.modCount != this.LLILZ) {
            throw new ConcurrentModificationException();
        }
    }

    public final void LIZIZ() {
        while (true) {
            int i = this.LLILLJJLI;
            C13DA<K, V> c13da = this.LL;
            if (i >= c13da.length || c13da.presenceArray[i] >= 0) {
                return;
            } else {
                this.LLILLJJLI = i + 1;
            }
        }
    }

    public final boolean hasNext() {
        return this.LLILLJJLI < this.LL.length;
    }

    public final void remove() {
        LIZ();
        if (this.LLILLL == -1) {
            "Call next() before removing element from the iterator.".toString();
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        this.LL.checkIsMutable$kotlin_stdlib();
        this.LL.removeEntryAt(this.LLILLL);
        this.LLILLL = -1;
        this.LLILZ = this.LL.modCount;
    }

    public C13DF(C13DA<K, V> c13da) {
        this.LL = c13da;
        this.LLILZ = c13da.modCount;
        LIZIZ();
    }
}
