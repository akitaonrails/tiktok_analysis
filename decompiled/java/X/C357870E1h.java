package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0E1h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357870E1h {
    public final ConcurrentHashMap<String, Object> LIZ;

    public C357870E1h(ConcurrentHashMap<String, Object> concurrentHashMap) {
        this.LIZ = concurrentHashMap;
    }

    public final <T> void LIZ(EnumC357850E1f enumC357850E1f, T t) {
        this.LIZ.put(enumC357850E1f.name(), t);
    }
}
