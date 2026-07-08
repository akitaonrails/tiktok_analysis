package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.12ov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19871112ov<K, V> {
    public Object[] LIZ;
    public int LIZIZ;

    public final C19869812oi LIZ() {
        return C19869812oi.LJFF(this.LIZIZ, this.LIZ);
    }

    public C19871112ov(int i) {
        this.LIZ = new Object[i * 2];
    }

    public final void LIZJ(Iterable iterable) {
        if (iterable instanceof Collection) {
            int size = (this.LIZIZ + ((Collection) iterable).size()) * 2;
            Object[] objArr = this.LIZ;
            if (size > objArr.length) {
                this.LIZ = Arrays.copyOf(objArr, AbstractC19876412pm.LIZIZ(objArr.length, size));
            }
        }
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            LIZIZ(entry.getKey(), entry.getValue());
        }
    }

    public final void LIZIZ(Object obj, Object obj2) {
        int i = (this.LIZIZ + 1) * 2;
        Object[] objArr = this.LIZ;
        if (i > objArr.length) {
            this.LIZ = Arrays.copyOf(objArr, AbstractC19876412pm.LIZIZ(objArr.length, i));
        }
        C19863912nl.LIZ(obj, obj2);
        Object[] objArr2 = this.LIZ;
        int i2 = this.LIZIZ;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.LIZIZ = i2 + 1;
    }
}
