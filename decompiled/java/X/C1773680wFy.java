package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0wFy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1773680wFy implements InterfaceC1773890wGJ {
    public final ConcurrentHashMap<Class<? extends Object>, InterfaceC1768150w73> LIZ;

    public C1773680wFy(ConcurrentHashMap<Class<? extends Object>, InterfaceC1768150w73> concurrentHashMap) {
        this.LIZ = concurrentHashMap;
    }

    @Override // X.InterfaceC1773890wGJ
    public final <T extends InterfaceC1768150w73> T getService(Class<? extends T> cls) {
        return cls.cast(this.LIZ.get(cls));
    }

    @Override // X.InterfaceC1773890wGJ
    public final <T extends InterfaceC1768150w73> void LIZ(Class<T> cls, T t) {
        this.LIZ.put(cls, t);
    }
}
