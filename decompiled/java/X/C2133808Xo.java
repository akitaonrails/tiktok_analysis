package X;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: X.08Xo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2133808Xo extends C2133708Xn {
    public final void LIZJ(Collection collection) {
        int length;
        Object[] objArr = (Object[]) LIZ();
        if (objArr == null) {
            length = 0;
        } else {
            length = objArr.length;
        }
        Object[] objArr2 = (Object[]) Array.newInstance(this.LIZIZ.getType().getComponentType(), collection.size() + length);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr2[length] = it2.next();
            length++;
        }
        LIZIZ(objArr2);
    }

    public final void LIZLLL(Collection collection) {
        int length;
        Object[] objArr = (Object[]) LIZ();
        int i = 0;
        if (objArr == null) {
            length = 0;
        } else {
            length = objArr.length;
        }
        Object[] objArr2 = (Object[]) Array.newInstance(this.LIZIZ.getType().getComponentType(), length + collection.size());
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, collection.size(), objArr.length);
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr2[i] = it2.next();
            i++;
        }
        LIZIZ(objArr2);
    }

    public C2133808Xo(Class cls, Object obj, Field field) {
        super(Array.newInstance((Class<?>) cls, 0).getClass(), obj, field);
    }
}
