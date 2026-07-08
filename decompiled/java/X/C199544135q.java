package X;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: X.135q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199544135q {
    public static final ConcurrentMap<Class<?>, C199544135q> LIZLLL = new ConcurrentHashMap();
    public static final ConcurrentMap<Class<?>, C199544135q> LJ = new ConcurrentHashMap();
    public final boolean LIZ;
    public final IdentityHashMap<String, C199545135r> LIZIZ = new IdentityHashMap<>();
    public final List<String> LIZJ;

    public final C199545135r LIZ(String str) {
        if (str != null) {
            if (this.LIZ) {
                str = str.toLowerCase(Locale.US);
            }
            str = str.intern();
        }
        return this.LIZIZ.get(str);
    }

    public C199544135q(Class<?> cls, boolean z) {
        boolean z2;
        List<String> listUnmodifiableList;
        boolean z3;
        String str;
        Field field;
        this.LIZ = z;
        if (z && cls.isEnum()) {
            z2 = false;
        } else {
            z2 = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cannot ignore case on an enum: ");
        sbLIZ.append(cls);
        C19864312np.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), z2);
        TreeSet treeSet = new TreeSet(new Comparator<String>() { // from class: X.12tO
            @Override // java.util.Comparator
            public final int compare(String str2, String str3) {
                String str4 = str2;
                String str5 = str3;
                if (C19837412jU.LIZ(str4, str5)) {
                    return 0;
                }
                if (str4 == null) {
                    return -1;
                }
                if (str5 == null) {
                    return 1;
                }
                return str4.compareTo(str5);
            }
        });
        for (Field field2 : cls.getDeclaredFields()) {
            C199545135r c199545135rLIZIZ = C199545135r.LIZIZ(field2);
            if (c199545135rLIZIZ != null) {
                String strIntern = c199545135rLIZIZ.LIZLLL;
                strIntern = z ? strIntern.toLowerCase(Locale.US).intern() : strIntern;
                C199545135r c199545135r = this.LIZIZ.get(strIntern);
                if (c199545135r == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Object[] objArr = new Object[4];
                if (z) {
                    str = "case-insensitive ";
                } else {
                    str = "";
                }
                objArr[0] = str;
                objArr[1] = strIntern;
                objArr[2] = field2;
                if (c199545135r == null) {
                    field = null;
                } else {
                    field = c199545135r.LIZIZ;
                }
                objArr[3] = field;
                C2341509Fl.LIZ("two fields have the same %sname <%s>: %s and %s", z3, objArr);
                this.LIZIZ.put(strIntern, c199545135rLIZIZ);
                treeSet.add(strIntern);
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            C199544135q c199544135qLIZIZ = LIZIZ(superclass, z);
            treeSet.addAll(c199544135qLIZIZ.LIZJ);
            for (Map.Entry<String, C199545135r> entry : c199544135qLIZIZ.LIZIZ.entrySet()) {
                String key = entry.getKey();
                if (!this.LIZIZ.containsKey(key)) {
                    this.LIZIZ.put(key, entry.getValue());
                }
            }
        }
        if (treeSet.isEmpty()) {
            listUnmodifiableList = Collections.emptyList();
        } else {
            listUnmodifiableList = Collections.unmodifiableList(new ArrayList(treeSet));
        }
        this.LIZJ = listUnmodifiableList;
    }

    public static C199544135q LIZIZ(Class<?> cls, boolean z) {
        ConcurrentMap<Class<?>, C199544135q> concurrentMap;
        C199544135q c199544135qPutIfAbsent;
        if (z) {
            concurrentMap = LJ;
        } else {
            concurrentMap = LIZLLL;
        }
        C199544135q c199544135q = concurrentMap.get(cls);
        if (c199544135q == null && (c199544135qPutIfAbsent = concurrentMap.putIfAbsent(cls, (c199544135q = new C199544135q(cls, z)))) != null) {
            return c199544135qPutIfAbsent;
        }
        return c199544135q;
    }
}
