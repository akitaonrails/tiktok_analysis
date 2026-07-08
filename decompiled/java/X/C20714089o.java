package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.089o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20714089o {
    public static List LIZ(Object obj) {
        ArrayList arrayList = new ArrayList();
        C089E c089e = new C089E(obj.getClass().getDeclaredFields());
        while (c089e.hasNext()) {
            Field field = (Field) c089e.next();
            if (!field.isSynthetic() && !field.getType().isPrimitive() && !field.isAnnotationPresent(C040G.class)) {
                field.setAccessible(true);
                try {
                    if (field.get(obj) == null) {
                        arrayList.add(field.getName());
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return arrayList;
    }
}
