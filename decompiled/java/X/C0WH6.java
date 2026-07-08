package X;

import android.os.IBinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.0WH6, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WH6<T> extends AbstractBinderC828770WfD {
    public final Object LL;

    public C0WH6(Object obj) {
        this.LL = obj;
    }

    public static <T> T LLLIIL(InterfaceC820590WGz interfaceC820590WGz) {
        if (interfaceC820590WGz instanceof C0WH6) {
            return (T) ((C0WH6) interfaceC820590WGz).LL;
        }
        IBinder iBinderAsBinder = interfaceC820590WGz.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            C0W3J.LJIIIIZZ(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return (T) field.get(iBinderAsBinder);
                } catch (IllegalAccessException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
                } catch (NullPointerException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    throw new IllegalArgumentException("Binder object is null.", e2);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
    }
}
