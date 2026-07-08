package X;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13D6, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13D6<K, V> implements Map.Entry<K, V>, C08J0 {
    public final C13DA<K, V> LL;
    public final int LLILLJJLI;
    public final int LLILLL;

    public final void LIZ() {
        if (this.LL.modCount != this.LLILLL) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        LIZ();
        return this.LL.keysArray[this.LLILLJJLI];
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        LIZ();
        return this.LL.valuesArray[this.LLILLJJLI];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        K key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        V value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getKey());
        sbLIZ.append('=');
        sbLIZ.append(getValue());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (Intrinsics.LJFF(entry.getKey(), getKey()) && Intrinsics.LJFF(entry.getValue(), getValue())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        LIZ();
        this.LL.checkIsMutable$kotlin_stdlib();
        V[] vArrAllocateValuesArray = this.LL.allocateValuesArray();
        int i = this.LLILLJJLI;
        V v2 = vArrAllocateValuesArray[i];
        vArrAllocateValuesArray[i] = v;
        return v2;
    }

    public C13D6(C13DA<K, V> c13da, int i) {
        this.LL = c13da;
        this.LLILLJJLI = i;
        this.LLILLL = c13da.modCount;
    }
}
