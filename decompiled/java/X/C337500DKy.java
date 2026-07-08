package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0DKy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C337500DKy implements InterfaceC1500900pA0 {
    public static Object LIZ(Object obj) {
        int iIntValue;
        if (!((Boolean) C261080ALa.LIZ.getValue()).booleanValue()) {
            return obj;
        }
        Object obj2 = ((Map) obj).get("timeout_ms");
        if ((obj2 instanceof Number) && (iIntValue = ((Number) obj2).intValue()) > 0) {
            C1493620oyG c1493620oyG = new C1493620oyG();
            c1493620oyG.LJIIIIZZ = iIntValue;
            return c1493620oyG;
        }
        return obj;
    }
}
