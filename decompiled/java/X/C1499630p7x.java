package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0p7x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1499630p7x {
    public static InterfaceC1499640p7y LIZIZ;
    public static InterfaceC1499650p7z LIZJ;
    public static long LIZLLL;
    public static final Map<String, InterfaceC1499640p7y> LIZ = new LinkedHashMap();
    public static final AtomicInteger LJ = new AtomicInteger(0);
    public static final ThreadLocal<Long> LJFF = new ThreadLocal<>();
    public static final ThreadLocal<Long> LJI = new ThreadLocal<>();
    public static final Regex LJII = new Regex("https?://[^/]+/");

    public static void LIZ(String str, InterfaceC1499650p7z interfaceC1499650p7z) {
        InterfaceC1499640p7y interfaceC1499640p7y = (InterfaceC1499640p7y) ((LinkedHashMap) LIZ).get(str);
        if (interfaceC1499640p7y != null) {
            LIZIZ = interfaceC1499640p7y;
        }
        LIZJ = interfaceC1499650p7z;
    }
}
