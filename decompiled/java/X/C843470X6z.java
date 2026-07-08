package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0X6z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C843470X6z {
    public static void LIZIZ(boolean z) {
        C843460X6y.LIZ = z;
    }

    public static void LIZ(Object obj, String str) {
        C0X70 c0x70;
        Map<String, Object> map;
        if (C843460X6y.LIZ && (c0x70 = C843460X6y.LIZIZ.get()) != null && (map = c0x70.LIZJ) != null) {
            map.put(str, obj);
        }
    }
}
