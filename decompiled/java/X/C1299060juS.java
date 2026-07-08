package X;

import com.lynx.react.bridge.PiperData;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0juS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1299060juS {
    public static final boolean LIZ(Map<?, ?> map) {
        Iterator<Map.Entry<?, ?>> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Object value = it2.next().getValue();
            if (value instanceof PiperData) {
                return true;
            }
            if ((value instanceof Map) && LIZ((Map) value)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZIZ(com.lynx.react.bridge.PiperData r2) {
        /*
            int r1 = r2.getDataType()
            X.0juT r0 = X.EnumC1299070juT.String
            int r0 = r0.ordinal()
            if (r1 != r0) goto L19
            java.lang.Object r1 = r2.LJ
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L16
            java.lang.String r1 = (java.lang.String) r1
        L14:
            if (r1 != 0) goto L18
        L16:
            java.lang.String r1 = ""
        L18:
            return r1
        L19:
            X.0juT r0 = X.EnumC1299070juT.Map
            int r0 = r0.ordinal()
            if (r1 != r0) goto L16
            java.lang.Object r1 = r2.LJ
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L16
            org.json.JSONObject r0 = new org.json.JSONObject
            java.util.Map r1 = (java.util.Map) r1
            r0.<init>(r1)
            java.lang.String r1 = X.C786410Ut5.J3(r0)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1299060juS.LIZIZ(com.lynx.react.bridge.PiperData):java.lang.String");
    }
}
