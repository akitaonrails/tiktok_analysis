package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0CmK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C323580CmK {
    public final ArrayList<Object> LIZ;

    public final int LIZJ() {
        return this.LIZ.size();
    }

    public C323580CmK(int i) {
        this.LIZ = new ArrayList<>(i);
    }

    public final void LIZ(Object obj) {
        this.LIZ.add(obj);
    }

    public final void LIZIZ(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.LIZ;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.LIZ, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.LIZ.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it2 = ((Iterable) obj).iterator();
            while (it2.hasNext()) {
                this.LIZ.add(it2.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it3 = (Iterator) obj;
            while (it3.hasNext()) {
                this.LIZ.add(it3.next());
            }
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Don't know how to spread ");
            sbLIZ.append(obj.getClass());
            throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final Object[] LIZLLL(Object[] objArr) {
        return this.LIZ.toArray(objArr);
    }
}
