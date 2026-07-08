package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0IHZ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IHZ {
    public static final Map<Class<?>, C0IGK<?>> LIZ = new HashMap();

    public static C0IGK LIZ(Class cls) {
        return (C0IGK) cls.cast(((HashMap) LIZ).get(cls));
    }
}
