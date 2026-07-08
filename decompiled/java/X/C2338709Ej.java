package X;

import Y.AComparatorS22S0000000_3;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.n;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: X.09Ej, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2338709Ej {
    public static String LIZIZ(Field field) {
        C09CT c09ct = (C09CT) field.getAnnotation(C09CT.class);
        if (c09ct != null) {
            return c09ct.value();
        }
        return field.getName();
    }

    public static n LIZ(Object obj, TreeTypeAdapter.a aVar) {
        boolean z;
        n nVar = new n();
        ArrayList<Field> arrayList = new ArrayList();
        for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
            arrayList.addAll(Arrays.asList(superclass.getDeclaredFields()));
        }
        ArrayList<Field> arrayList2 = new ArrayList();
        for (Field field : arrayList) {
            if (field.getAnnotation(C09DE.class) != null) {
                z = true;
            } else {
                z = false;
            }
            boolean zIsTransient = Modifier.isTransient(field.getModifiers());
            if (!z && !zIsTransient) {
                arrayList2.add(field);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            arrayList2.sort(new AComparatorS22S0000000_3(47));
        }
        for (Field field2 : arrayList2) {
            try {
                nVar.LJJIFFI(LIZIZ(field2), aVar.LIZIZ(field2.get(obj)));
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return nVar;
    }
}
