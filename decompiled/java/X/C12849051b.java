package X;

import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.051b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12849051b<T> {
    public final Keva LIZ;
    public final String LIZIZ;
    public final T LIZJ;
    public Object LIZLLL;

    public final Object LIZ() {
        Object stringSet;
        if (Intrinsics.LJFF(this.LIZLLL, this.LIZJ)) {
            T t = this.LIZJ;
            if (t instanceof Boolean) {
                stringSet = Boolean.valueOf(this.LIZ.getBoolean(this.LIZIZ, ((Boolean) t).booleanValue()));
            } else if (t instanceof Double) {
                stringSet = Double.valueOf(this.LIZ.getDouble(this.LIZIZ, ((Number) t).doubleValue()));
            } else if (t instanceof Float) {
                stringSet = Float.valueOf(this.LIZ.getFloat(this.LIZIZ, ((Number) t).floatValue()));
            } else if (t instanceof Integer) {
                stringSet = Integer.valueOf(this.LIZ.getInt(this.LIZIZ, ((Number) t).intValue()));
            } else if (t instanceof Long) {
                stringSet = Long.valueOf(this.LIZ.getLong(this.LIZIZ, ((Number) t).longValue()));
            } else if (t instanceof String) {
                stringSet = this.LIZ.getString(this.LIZIZ, (String) t);
            } else if (t instanceof byte[]) {
                stringSet = this.LIZ.getBytes(this.LIZIZ, (byte[]) t);
            } else if (t instanceof Object[]) {
                Keva keva = this.LIZ;
                String str = this.LIZIZ;
                Object[] objArr = (Object[]) t;
                ArrayList arrayList = new ArrayList(objArr.length);
                for (Object obj : objArr) {
                    arrayList.add(String.valueOf(obj));
                }
                stringSet = keva.getStringArray(str, (String[]) arrayList.toArray(new String[0]));
            } else {
                if (!(t instanceof Set)) {
                    final T t2 = this.LIZJ;
                    throw new IllegalArgumentException(t2) { // from class: X.051c
                        /* JADX WARN: Illegal instructions before constructor call */
                        {
                            String canonicalName;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Keva unsupported the type: ");
                            if (t2 != null) {
                                canonicalName = t2.getClass().getCanonicalName();
                            } else {
                                canonicalName = null;
                            }
                            sbLIZ.append(canonicalName);
                            super(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    };
                }
                Keva keva2 = this.LIZ;
                String str2 = this.LIZIZ;
                Iterable iterable = (Iterable) t;
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(iterable, 10));
                Iterator<T> it2 = iterable.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(String.valueOf(it2.next()));
                }
                stringSet = keva2.getStringSet(str2, C13LP.LLIIJI(arrayList2));
            }
            this.LIZLLL = stringSet;
        }
        return this.LIZLLL;
    }

    public final void LIZIZ(Object obj) {
        this.LIZLLL = obj;
        if (obj instanceof Boolean) {
            this.LIZ.storeBoolean(this.LIZIZ, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Double) {
            this.LIZ.storeDouble(this.LIZIZ, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Float) {
            this.LIZ.storeFloat(this.LIZIZ, ((Number) obj).floatValue());
            return;
        }
        if (obj instanceof Integer) {
            this.LIZ.storeInt(this.LIZIZ, ((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            this.LIZ.storeLong(this.LIZIZ, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            this.LIZ.storeString(this.LIZIZ, (String) obj);
            return;
        }
        if (obj instanceof byte[]) {
            this.LIZ.storeBytes(this.LIZIZ, (byte[]) obj);
            return;
        }
        if (obj instanceof Object[]) {
            Keva keva = this.LIZ;
            String str = this.LIZIZ;
            Object[] objArr = (Object[]) obj;
            ArrayList arrayList = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                arrayList.add(String.valueOf(obj2));
            }
            keva.storeStringArray(str, (String[]) arrayList.toArray(new String[0]));
            return;
        }
        if (!(obj instanceof Set)) {
            return;
        }
        Keva keva2 = this.LIZ;
        String str2 = this.LIZIZ;
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(iterable, 10));
        Iterator<T> it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList2.add(String.valueOf(it2.next()));
        }
        keva2.storeStringSet(str2, C13LP.LLIIJI(arrayList2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12849051b(Keva keva, Object obj, String str) {
        this.LIZ = keva;
        this.LIZIZ = str;
        this.LIZJ = obj;
        this.LIZLLL = obj;
    }
}
