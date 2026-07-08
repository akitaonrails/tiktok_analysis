package X;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.07oo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1977207oo {
    public final Class<?> LIZ;
    public final ArrayList<Object> LIZIZ = new ArrayList<>();

    public final Object LIZ() {
        ArrayList<Object> arrayList = this.LIZIZ;
        Class<?> cls = this.LIZ;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance(cls, arrayList.size()));
        }
        Object objNewInstance = Array.newInstance(cls, arrayList.size());
        Iterator<Object> it2 = arrayList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            Array.set(objNewInstance, i, it2.next());
            i++;
        }
        return objNewInstance;
    }

    public C1977207oo(Class<?> cls) {
        this.LIZ = cls;
    }
}
