package X;

import Y.ARunnableS4S1300000_3;
import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0pDC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1502880pDC {
    public static final C1502880pDC LIZ = new C1502880pDC();

    public static Map LIZ(Map map) {
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                if ((value instanceof Integer) || (value instanceof Number) || (value instanceof Boolean) || (value instanceof String)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue().toString());
            }
            return linkedHashMap2;
        }
        return new LinkedHashMap();
    }

    public static LinkedHashMap LIZIZ(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if ((value instanceof String) && ((CharSequence) value).length() > 0) {
                    linkedHashMap.put(key, value);
                }
            }
        }
        return linkedHashMap;
    }

    public static boolean LIZJ(InterfaceC2106908Nf interfaceC2106908Nf, Integer num, Integer num2, String str, Throwable th) {
        String message = str;
        if (th == null && TextUtils.isEmpty(message)) {
            return false;
        }
        if ((message == null || message.length() <= 0) && (th == null || (message = th.getMessage()) == null)) {
            message = "";
        }
        C786410Ut5.LJJZZIII(C1502940pDI.LIZ(), new ARunnableS4S1300000_3(interfaceC2106908Nf, num, num2, message, th, 2));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010e A[PHI: r4
      0x010e: PHI (r4v13 X.0X9S<java.lang.String>) = (r4v21 X.0X9S<java.lang.String>), (r4v24 X.0X9S<java.lang.String>) binds: [B:33:0x010c, B:28:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.0pDD] */
    /* JADX WARN: Type inference failed for: r3v17, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v22, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v28, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v40, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v45, types: [T] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, X.0ozb, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, X.0ozz, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v3, types: [T, X.0ozZ, java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(java.lang.String r20, java.util.LinkedHashMap r21, java.util.LinkedHashMap r22, java.util.Map r23, X.InterfaceC2106908Nf r24, com.bytedance.sdk.xbridge.runtime.depend.IHostNetworkDepend r25) {
        /*
            Method dump skipped, instruction units count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1502880pDC.LIZLLL(java.lang.String, java.util.LinkedHashMap, java.util.LinkedHashMap, java.util.Map, X.08Nf, com.bytedance.sdk.xbridge.runtime.depend.IHostNetworkDepend):void");
    }
}
