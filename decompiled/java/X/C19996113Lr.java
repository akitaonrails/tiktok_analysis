package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.13Lr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19996113Lr {
    public final ConcurrentHashMap<String, C13MA<?>> LIZ = new ConcurrentHashMap<>();

    public final <T> C13MA<T> LIZ(String str) {
        C13MA<T> c13ma;
        Object obj = this.LIZ.get(str);
        if (!(obj instanceof C13MA) || (c13ma = (C13MA) obj) == null) {
            return null;
        }
        return c13ma;
    }

    public final void LIZJ(String str) {
        this.LIZ.remove(str);
    }

    public final <T> void LIZIZ(String str, C13MA<T> c13ma) {
        this.LIZ.put(str, c13ma);
    }
}
