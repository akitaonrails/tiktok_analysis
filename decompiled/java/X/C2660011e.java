package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.011e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2660011e {
    public final Map<Class<? extends AnonymousClass0101>, AnonymousClass0101> LIZ = new ConcurrentHashMap();

    public final <T extends AnonymousClass0101> T LIZ(Class<T> cls) {
        Object obj = ((ConcurrentHashMap) this.LIZ).get(cls);
        if (obj instanceof AnonymousClass0101) {
            return (T) obj;
        }
        return null;
    }
}
