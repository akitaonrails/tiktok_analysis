package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.19d9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21581719d9 {
    public static final ConcurrentHashMap<String, InterfaceC21582019dC> LIZ;

    static {
        ConcurrentHashMap<String, InterfaceC21582019dC> concurrentHashMap = new ConcurrentHashMap<>();
        C21581919dB c21581919dB = new InterfaceC21582019dC() { // from class: X.19dB
            @Override // X.InterfaceC21582019dC
            public final void LIZ() {
            }
        };
        concurrentHashMap.put("default", c21581919dB);
        concurrentHashMap.put("light", c21581919dB);
        LIZ = concurrentHashMap;
    }
}
