package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0w1J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1764590w1J implements InterfaceC1066204Ey {
    public final ConcurrentHashMap<String, Object> LIZ = new ConcurrentHashMap<>();

    @Override // X.InterfaceC1066204Ey
    public final Object getValue(String str) {
        return this.LIZ.get(str);
    }
}
