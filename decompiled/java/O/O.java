package O;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class O {
    public static final ConcurrentMap instances = new ConcurrentHashMap();

    public static Object init(Class cls) {
        Object obj = instances.get(cls);
        if (obj != null) {
            return obj;
        }
        try {
            Object objCast = cls.cast(cls.getDeclaredConstructors()[0].newInstance(new Object[0]));
            instances.put(cls, objCast);
            return objCast;
        } catch (Throwable th) {
            th.printStackTrace();
            throw new RuntimeException(th.getMessage(), th.getCause());
        }
    }
}
