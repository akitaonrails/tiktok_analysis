package X;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0Qlm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C679960Qlm {
    public static final HashMap<String, InterfaceC1532940pzg> LIZ = new HashMap<>();
    public static volatile HashSet<String> LIZIZ = new HashSet<>();

    public static void LIZIZ(HashSet hashSet) {
        LIZIZ = hashSet;
    }

    public static void LIZ(String str, InterfaceC1532940pzg interfaceC1532940pzg) {
        if (LIZIZ.contains(str)) {
            LIZ.put(str, interfaceC1532940pzg);
        }
    }
}
