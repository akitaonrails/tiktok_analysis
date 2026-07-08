package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0IyI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C483880IyI {
    public final String LIZ;
    public final String LIZIZ;
    public final Map<String, String> LIZJ;
    public final long LIZLLL;
    public final InterfaceC483890IyJ LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C483880IyI() {
        this((String) null, (String) (0 == true ? 1 : 0), (Map) (0 == true ? 1 : 0), (InterfaceC483890IyJ) (0 == true ? 1 : 0), 31);
    }

    public static C483880IyI LIZ(C483880IyI c483880IyI, Map map) {
        String str = c483880IyI.LIZ;
        String str2 = c483880IyI.LIZIZ;
        long j = c483880IyI.LIZLLL;
        InterfaceC483890IyJ interfaceC483890IyJ = c483880IyI.LJ;
        c483880IyI.getClass();
        return new C483880IyI(str, str2, (Map<String, String>) map, j, interfaceC483890IyJ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C483880IyI(String str, String str2, Map map, InterfaceC483890IyJ interfaceC483890IyJ, int i) {
        long j;
        InterfaceC483890IyJ interfaceC483890IyJ2 = interfaceC483890IyJ;
        Map linkedHashMap = map;
        String str3 = str2;
        String str4 = (i & 1) != 0 ? "" : str;
        str3 = (i & 2) != 0 ? "live_bottom_bar" : str3;
        linkedHashMap = (i & 4) != 0 ? new LinkedHashMap() : linkedHashMap;
        if ((i & 8) != 0) {
            j = -1;
        } else {
            j = 0;
        }
        this(str4, str3, (Map<String, String>) linkedHashMap, j, (i & 16) != 0 ? null : interfaceC483890IyJ2);
    }

    public C483880IyI(String str, String str2, Map<String, String> map, long j, InterfaceC483890IyJ interfaceC483890IyJ) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = map;
        this.LIZLLL = j;
        this.LJ = interfaceC483890IyJ;
    }
}
