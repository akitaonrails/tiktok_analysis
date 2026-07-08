package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0KNV, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public abstract class C0KNV implements InterfaceC518120KTq {
    public final C0KNY LIZ;
    public final C0KNW LIZIZ;
    public final long LIZJ = System.currentTimeMillis();
    public final Map<String, String> LIZLLL;

    public C0KNV(C0KNY c0kny, C0KNW c0knw) {
        this.LIZ = c0kny;
        this.LIZIZ = c0knw;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> map = c0kny.LJ;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        this.LIZLLL = linkedHashMap;
    }
}
