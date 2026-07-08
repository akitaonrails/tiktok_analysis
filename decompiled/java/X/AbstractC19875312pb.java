package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: X.12pb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19875312pb<E> extends AbstractC19876412pm<E> {
    public Object[] LIZ;
    public int LIZIZ;
    public boolean LIZJ;

    public AbstractC19875312pb(int i) {
        C19863912nl.LIZIZ(i, "initialCapacity");
        this.LIZ = new Object[i];
        this.LIZIZ = 0;
    }

    public final AbstractC19875312pb LIZJ(Object... objArr) {
        int length = objArr.length;
        C1702230uOj.LIZ(length, objArr);
        LJFF(this.LIZIZ + length);
        System.arraycopy(objArr, 0, this.LIZ, this.LIZIZ, length);
        this.LIZIZ += length;
        return this;
    }

    public final void LIZLLL(Object obj) {
        obj.getClass();
        LJFF(this.LIZIZ + 1);
        Object[] objArr = this.LIZ;
        int i = this.LIZIZ;
        this.LIZIZ = i + 1;
        objArr[i] = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJ(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            LJFF(this.LIZIZ + collection.size());
            if (collection instanceof AbstractC19875812pg) {
                this.LIZIZ = ((AbstractC19875812pg) collection).LIZJ(this.LIZIZ, this.LIZ);
                return;
            }
        }
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            LIZ(it2.next());
        }
    }

    public final void LJFF(int i) {
        Object[] objArr = this.LIZ;
        if (objArr.length < i) {
            this.LIZ = Arrays.copyOf(objArr, AbstractC19876412pm.LIZIZ(objArr.length, i));
            this.LIZJ = false;
        } else {
            if (!this.LIZJ) {
                return;
            }
            this.LIZ = (Object[]) objArr.clone();
            this.LIZJ = false;
        }
    }
}
