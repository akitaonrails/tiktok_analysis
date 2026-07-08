package X;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.08g0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2177408g0 {
    public static final AtomicLong LIZ = new AtomicLong(1);
    public static final Map<String, C1200030hKj> LIZIZ = Collections.synchronizedMap(new LinkedHashMap<String, C1200030hKj>() { // from class: X.084p
        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<String, C1200030hKj>> entrySet() {
            return getEntries();
        }

        public /* bridge */ Set<Map.Entry<String, C1200030hKj>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set<String> getKeys() {
            return super.keySet();
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection<C1200030hKj> getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<String> keySet() {
            return getKeys();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<C1200030hKj> values() {
            return getValues();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsKey((String) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj != null && !(obj instanceof C1200030hKj)) {
                return false;
            }
            return containsValue((C1200030hKj) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ C1200030hKj get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ C1200030hKj remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, C1200030hKj> entry) {
            if (size() >= 100) {
                return true;
            }
            return false;
        }

        public /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public /* bridge */ boolean containsValue(C1200030hKj c1200030hKj) {
            return super.containsValue((Object) c1200030hKj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        public /* bridge */ C1200030hKj get(String str) {
            return (C1200030hKj) super.get((Object) str);
        }

        public /* bridge */ C1200030hKj remove(String str) {
            return (C1200030hKj) super.remove((Object) str);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            if (!(obj instanceof String)) {
                return obj2;
            }
            return getOrDefault((String) obj, (C1200030hKj) obj2);
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (!(obj instanceof String)) {
                return false;
            }
            if (obj2 != null && !(obj2 instanceof C1200030hKj)) {
                return false;
            }
            return remove((String) obj, (C1200030hKj) obj2);
        }

        public final /* bridge */ C1200030hKj getOrDefault(Object obj, C1200030hKj c1200030hKj) {
            if (!(obj instanceof String)) {
                return c1200030hKj;
            }
            return getOrDefault((String) obj, c1200030hKj);
        }

        public /* bridge */ boolean remove(String str, C1200030hKj c1200030hKj) {
            return super.remove((Object) str, (Object) c1200030hKj);
        }

        public /* bridge */ C1200030hKj getOrDefault(String str, C1200030hKj c1200030hKj) {
            return (C1200030hKj) super.getOrDefault((Object) str, c1200030hKj);
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LIZIZ(java.lang.Throwable r5) {
        /*
            boolean r0 = r5 instanceof X.C0XIR
            java.lang.String r4 = "net_unknown"
            if (r0 == 0) goto L3f
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "net_server_"
            r1.append(r0)
            r0 = r5
            X.093u r0 = (X.C23112093u) r0
            int r0 = r0.getErrorCode()
            r1.append(r0)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r1)
        L1d:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r4)
            java.lang.String r2 = ""
            if (r0 == 0) goto L39
            java.lang.String r0 = r5.getMessage()
            if (r0 == 0) goto L2c
            r2 = r0
        L2c:
            int r0 = r2.length()
            r1 = 300(0x12c, float:4.2E-43)
            if (r0 <= r1) goto L39
            r0 = 0
            java.lang.String r2 = r2.substring(r0, r1)
        L39:
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r3, r2)
            return r0
        L3f:
            boolean r0 = r5 instanceof X.C0XIO
            if (r0 != 0) goto Lc2
            java.lang.Throwable r0 = r5.getCause()
            boolean r0 = r0 instanceof X.C0XIO
            if (r0 != 0) goto Lc2
            boolean r0 = r5 instanceof com.google.gson.s
            if (r0 != 0) goto Lc2
            java.lang.Throwable r0 = r5.getCause()
            boolean r0 = r0 instanceof com.google.gson.s
            if (r0 != 0) goto Lc2
            boolean r0 = r5 instanceof X.C1494690ozz
            java.lang.String r3 = "net_http_"
            if (r0 == 0) goto L8a
            r2 = r5
            X.0ozz r2 = (X.C1494690ozz) r2
            int r1 = r2.getStatusCode()
            if (r1 <= 0) goto L75
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r3)
            r0.append(r1)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r0)
            goto L1d
        L75:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "net_cronet_"
            r1.append(r0)
            int r0 = r2.getCronetInternalErrorCode()
            r1.append(r0)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r1)
            goto L1d
        L8a:
            boolean r0 = r5 instanceof X.C1494430ozZ
            if (r0 == 0) goto La7
            r0 = r5
            X.0ozZ r0 = (X.C1494430ozZ) r0
            int r1 = r0.getStatusCode()
            if (r1 <= 0) goto Lbf
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r3)
            r0.append(r1)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r0)
            goto L1d
        La7:
            boolean r0 = r5 instanceof X.C1494450ozb
            if (r0 == 0) goto Laf
            java.lang.String r3 = "net_no_network"
            goto L1d
        Laf:
            boolean r0 = r5 instanceof java.util.concurrent.TimeoutException
            if (r0 == 0) goto Lb7
            java.lang.String r3 = "net_timeout"
            goto L1d
        Lb7:
            boolean r0 = r5 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto Lbf
            java.lang.String r3 = "net_cancel"
            goto L1d
        Lbf:
            r3 = r4
            goto L1d
        Lc2:
            java.lang.String r3 = "net_json_parse"
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2177408g0.LIZIZ(java.lang.Throwable):kotlin.Pair");
    }

    public static String LIZ(String str, String str2, String str3) {
        String strValueOf = String.valueOf(LIZ.getAndIncrement());
        LIZIZ.put(strValueOf, new C1200030hKj(str, str2, str3));
        return strValueOf;
    }
}
