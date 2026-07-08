package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.08Xp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2133908Xp implements C08T3 {
    @Override // X.C08T3
    public final void LIZ(ClassLoader classLoader, Set set) {
        LIZJ(classLoader, set, new C2134708Xx());
    }

    public static void LIZJ(ClassLoader classLoader, Set set, C08Y2 c08y2) {
        if (set.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            hashSet.add(((File) it2.next()).getParentFile());
        }
        Object objLIZ = new C2133708Xn(Object.class, classLoader, C2133408Xk.LIZLLL(classLoader, "pathList")).LIZ();
        C2133708Xn c2133708Xn = new C2133708Xn(List.class, objLIZ, C2133408Xk.LIZLLL(objLIZ, "nativeLibraryDirectories"));
        synchronized (C08Y3.class) {
            try {
                ArrayList arrayList = new ArrayList((Collection) c2133708Xn.LIZ());
                hashSet.removeAll(arrayList);
                arrayList.addAll(hashSet);
                c2133708Xn.LIZIZ(arrayList);
            } finally {
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Object[] objArrLIZ = c08y2.LIZ(objLIZ, new ArrayList(hashSet), arrayList2);
        if (!arrayList2.isEmpty()) {
            C08T4 c08t4 = new C08T4("Error in makePathElements");
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(c08t4, ListProtector.get(arrayList2, i));
                } catch (Exception e) {
                }
            }
            throw c08t4;
        }
        synchronized (C08Y3.class) {
            try {
                new C2133808Xo(Object.class, objLIZ, C2133408Xk.LIZLLL(objLIZ, "nativeLibraryPathElements")).LIZLLL(Arrays.asList(objArrLIZ));
            } finally {
            }
        }
    }

    public static boolean LIZLLL(ClassLoader classLoader, C0VSJ c0vsj, File file, boolean z) {
        return C2134008Xq.LIZJ(classLoader, c0vsj, file, z, new C2134608Xw(), "zip", new C08Y1() { // from class: X.08Xl
            @Override // X.C08Y1
            public final boolean LIZ(Object obj, File file2, C0VSJ c0vsj2) {
                Class<?> cls = obj.getClass();
                try {
                    return new C0VSJ((String) String.class.cast(C2204961BRm.a0(C2133408Xk.LJ(cls, "optimizedPathFor", File.class, File.class), null, new Object[]{file2, c0vsj2}, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Byp57XuyfVlZixpfIbNzG9/9o7Treipzs2kcKp7BnK9idVSvGg==", new String[]{"016a9"})))).exists();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new C2133208Xi(C786410Ut5.j4("Failed to invoke static method %s on type %s", new Object[]{"optimizedPathFor", cls}), e);
                }
            }
        });
    }

    @Override // X.C08T3
    public final boolean LIZIZ(ClassLoader classLoader, C0VSJ c0vsj, File file, boolean z) {
        return LIZLLL(classLoader, c0vsj, file, z);
    }
}
