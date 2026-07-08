package X;

import android.os.IBinder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0832, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0832 {
    public final Map<String, AnonymousClass0830> LIZ = new HashMap();

    public final void LIZ() throws NoSuchFieldException, NoSuchMethodException, ClassNotFoundException {
        if (((HashMap) this.LIZ).size() == 0) {
            return;
        }
        Class<?> cls = Class.forName("android.os.ServiceManager");
        Method declaredMethod = cls.getDeclaredMethod("getService", String.class);
        Field declaredField = cls.getDeclaredField("sCache");
        declaredField.setAccessible(true);
        Map map = (Map) declaredField.get(null);
        for (Map.Entry entry : ((HashMap) this.LIZ).entrySet()) {
            Object key = entry.getKey();
            AnonymousClass0830 anonymousClass0830 = (AnonymousClass0830) entry.getValue();
            C20543082z c20543082z = new C20543082z((IBinder) declaredMethod.invoke(null, key), anonymousClass0830);
            IBinder iBinder = (IBinder) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{IBinder.class}, c20543082z);
            c20543082z.LLILLJJLI = iBinder;
            map.put(key, iBinder);
        }
    }
}
