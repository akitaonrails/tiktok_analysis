package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: X.08S6, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public abstract class C08S6 {
    public static final Object sLock = new Object();
    public static final Map<Class<?>, List<Field>> sRequiredMap = Collections.synchronizedMap(new C830490Whz());

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T checkValid() {
        Class<?> cls = getClass();
        initRequiredFieldMap(cls);
        List<Field> list = sRequiredMap.get(cls);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                Field field = (Field) ListProtector.get(list, i);
                if (field.get(this) == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unexpected null value in ");
                    sbLIZ.append(cls.getName());
                    sbLIZ.append(", required field: ");
                    sbLIZ.append(field.getName());
                    throw new s(C2188811AlT.LIZIZ(sbLIZ));
                }
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new AssertionError();
            }
        }
        return this;
    }

    public static RuntimeException getCompatibleException(ExecutionException executionException) throws Throwable {
        Throwable cause = executionException.getCause();
        if (cause instanceof C1161320gKI) {
            return (RuntimeException) cause;
        }
        throw cause;
    }

    public static void initRequiredFieldMap(Class<?> cls) {
        if (sRequiredMap.get(cls) == null) {
            synchronized (sLock) {
                try {
                    Field[] declaredFields = cls.getDeclaredFields();
                    ArrayList arrayList = new ArrayList(declaredFields.length);
                    for (Field field : declaredFields) {
                        if (field.getAnnotation(C08S7.class) != null) {
                            field.setAccessible(true);
                            arrayList.add(field);
                        }
                    }
                    sRequiredMap.put(cls, Collections.unmodifiableList(arrayList));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
