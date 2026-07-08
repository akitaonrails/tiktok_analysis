package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0lX5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1361450lX5 implements InterfaceC1361520lXC<Object> {
    public final /* synthetic */ ConcurrentHashMap<String, Object> LIZ;

    public C1361450lX5(ConcurrentHashMap<String, Object> concurrentHashMap) {
        this.LIZ = concurrentHashMap;
    }

    @Override // X.InterfaceC1361520lXC
    public final Object get(String str) {
        return this.LIZ.get(str);
    }

    @Override // X.InterfaceC1361520lXC
    public final void LIZIZ(String str, Object obj) {
        this.LIZ.put(str, obj);
    }
}
