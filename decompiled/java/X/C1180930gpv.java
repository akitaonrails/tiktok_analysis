package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0gpv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1180930gpv {
    /* JADX WARN: Multi-variable type inference failed */
    public static final C1180920gpu LIZ(C1180920gpu c1180920gpu, Map<String, C1180920gpu> map) {
        String str = c1180920gpu.LIZ;
        Object c1180920gpu2 = ((LinkedHashMap) map).get(str);
        if (c1180920gpu2 == null) {
            c1180920gpu2 = new C1180920gpu(c1180920gpu.LIZ, c1180920gpu.LIZIZ, c1180920gpu.LIZJ, c1180920gpu.LIZLLL, c1180920gpu.LJ, c1180920gpu.LJFF, c1180920gpu.LJI, c1180920gpu.LJII);
            map.put(str, c1180920gpu2);
        }
        return (C1180920gpu) c1180920gpu2;
    }
}
