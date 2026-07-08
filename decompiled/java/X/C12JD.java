package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.12JD, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12JD {
    public final HashMap<Class<?>, Object> LIZ = new HashMap<>();

    public final <T> T LIZ(Class<T> cls) {
        T t = (T) this.LIZ.get(cls);
        if (t != null) {
            return t;
        }
        return null;
    }

    public final void LIZIZ(Class<?> cls, Object obj) {
        this.LIZ.put(cls, obj);
    }
}
