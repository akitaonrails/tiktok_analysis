package X;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: X.07oV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1975307oV {
    public static final Object[] LIZ = new Object[0];

    @InterfaceC1294060jmO
    public static final Object[] LIZ(Collection<?> collection) {
        int size = collection.size();
        Object[] objArrCopyOf = LIZ;
        if (size != 0) {
            Iterator<?> it2 = collection.iterator();
            if (it2.hasNext()) {
                objArrCopyOf = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it2.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                    } else if (!it2.hasNext()) {
                        return Arrays.copyOf(objArrCopyOf, i2);
                    }
                    i = i2;
                }
            }
        }
        return objArrCopyOf;
    }

    @InterfaceC1294060jmO
    public static final Object[] LIZIZ(Collection<?> collection, Object[] objArr) {
        Object[] objArrCopyOf;
        if (objArr != null) {
            int size = collection.size();
            int i = 0;
            if (size == 0) {
                if (objArr.length > 0) {
                    objArr[0] = null;
                }
            } else {
                Iterator<?> it2 = collection.iterator();
                if (!it2.hasNext()) {
                    if (objArr.length > 0) {
                        objArr[0] = null;
                        return objArr;
                    }
                } else {
                    if (size <= objArr.length) {
                        objArrCopyOf = objArr;
                    } else {
                        objArrCopyOf = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
                    }
                    while (true) {
                        int i2 = i + 1;
                        objArrCopyOf[i] = it2.next();
                        if (i2 >= objArrCopyOf.length) {
                            if (!it2.hasNext()) {
                                return objArrCopyOf;
                            }
                            int i3 = ((i2 * 3) + 1) >>> 1;
                            if (i3 <= i2) {
                                i3 = 2147483645;
                                if (i2 >= 2147483645) {
                                    throw new OutOfMemoryError();
                                }
                            }
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                        } else if (!it2.hasNext()) {
                            if (objArrCopyOf == objArr) {
                                objArr[i2] = null;
                                return objArr;
                            }
                            return Arrays.copyOf(objArrCopyOf, i2);
                        }
                        i = i2;
                    }
                }
            }
            return objArr;
        }
        throw null;
    }
}
