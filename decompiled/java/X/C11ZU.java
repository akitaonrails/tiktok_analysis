package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.11ZU, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11ZU {
    public final ConcurrentHashMap<String, C11ZT<?>> LIZ = new ConcurrentHashMap<>();

    public final void LIZ(Integer num, String str, Object obj) {
        this.LIZ.put(str, new C11ZT<>(num, obj));
    }
}
