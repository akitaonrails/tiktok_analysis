package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oMb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1470270oMb {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new LinkedHashMap<String, C1470240oMY>() { // from class: X.084f
            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<String, C1470240oMY>> entrySet() {
                return getEntries();
            }

            public /* bridge */ Set<Map.Entry<String, C1470240oMY>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<String> getKeys() {
                return super.keySet();
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<C1470240oMY> getValues() {
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
            public final /* bridge */ Collection<C1470240oMY> values() {
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
                if (!(obj instanceof C1470240oMY)) {
                    return false;
                }
                return containsValue((C1470240oMY) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ C1470240oMY get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ C1470240oMY remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, C1470240oMY> entry) {
                if (size() > ((Number) C1474810oTv.E0.getValue()).intValue()) {
                    return true;
                }
                return false;
            }

            public /* bridge */ boolean containsKey(String str) {
                return super.containsKey((Object) str);
            }

            public /* bridge */ boolean containsValue(C1470240oMY c1470240oMY) {
                return super.containsValue((Object) c1470240oMY);
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

            public /* bridge */ C1470240oMY get(String str) {
                return (C1470240oMY) super.get((Object) str);
            }

            public /* bridge */ C1470240oMY remove(String str) {
                return (C1470240oMY) super.remove((Object) str);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                if (!(obj instanceof String)) {
                    return obj2;
                }
                return getOrDefault((String) obj, (C1470240oMY) obj2);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if (!(obj instanceof String) || !(obj2 instanceof C1470240oMY)) {
                    return false;
                }
                return remove((String) obj, (C1470240oMY) obj2);
            }

            public final /* bridge */ C1470240oMY getOrDefault(Object obj, C1470240oMY c1470240oMY) {
                if (!(obj instanceof String)) {
                    return c1470240oMY;
                }
                return getOrDefault((String) obj, c1470240oMY);
            }

            public /* bridge */ boolean remove(String str, C1470240oMY c1470240oMY) {
                return super.remove((Object) str, (Object) c1470240oMY);
            }

            public /* bridge */ C1470240oMY getOrDefault(String str, C1470240oMY c1470240oMY) {
                return (C1470240oMY) super.getOrDefault((Object) str, c1470240oMY);
            }
        };
    }

    public static void LIZ(C1473400oRe c1473400oRe) {
        List<C1474520oTS> listLJIIJ;
        int iLJI = c1473400oRe.LJI(3);
        if (iLJI > 0 && (listLJIIJ = c1473400oRe.LJIIJ()) != null) {
            for (C1474520oTS c1474520oTS : listLJIIJ) {
                if (c1474520oTS != null) {
                    c1474520oTS.LJIIJJI((int) ((c1474520oTS.LJIIIZ(12) * 8.0d) / ((double) iLJI)));
                }
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0041: MOVE (r4 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:16777281), block:B:17:0x0041 */
    public static C1470240oMY LIZIZ(String str) {
        C1470240oMY c1470240oMY;
        C1470240oMY c1470240oMY2 = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                try {
                    if (jSONObject.optInt("enable_video_dash_reconstruct", 0) == 1) {
                        C1470240oMY c1470240oMY3 = new C1470240oMY();
                        c1470240oMY3.LJJIJIIJIL(jSONObject);
                        return c1470240oMY3;
                    }
                    C1473400oRe c1473400oRe = new C1473400oRe();
                    c1473400oRe.LIZJ(new JSONObject(str));
                    C1470240oMY c1470240oMY4 = new C1470240oMY();
                    c1470240oMY4.LJJIJLIJ(c1473400oRe);
                    if (C1474810oTv.LJIJJLI()) {
                        LIZ(c1473400oRe);
                    }
                    return c1470240oMY4;
                } catch (Throwable th) {
                    th = th;
                    c1470240oMY2 = c1470240oMY;
                    TryCatchGuardChecker.doCheck(th);
                    return c1470240oMY2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return c1470240oMY2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:14:0x001b, B:15:0x001f, B:17:0x0029, B:20:0x0032, B:12:0x0013), top: B:36:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1470240oMY LIZJ(java.util.Map r5) {
        /*
            r4 = 0
            r2 = 1
            if (r5 == 0) goto L11
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L11
            r0 = 0
        Lb:
            r3 = 0
            if (r0 != 0) goto L5c
            if (r5 == 0) goto L1b
            goto L13
        L11:
            r0 = 1
            goto Lb
        L13:
            java.lang.String r0 = "enable_video_dash_reconstruct"
            java.lang.Object r1 = r5.get(r0)     // Catch: java.lang.Throwable -> L54
            if (r1 != 0) goto L1f
        L1b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L54
        L1f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L54
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L32
            X.0oMY r1 = new X.0oMY     // Catch: java.lang.Throwable -> L54
            r1.<init>()     // Catch: java.lang.Throwable -> L54
            r1.LJJIJIL(r5)     // Catch: java.lang.Throwable -> L56
            return r1
        L32:
            X.0oRe r2 = new X.0oRe     // Catch: java.lang.Throwable -> L54
            r2.<init>()     // Catch: java.lang.Throwable -> L54
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L54
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L54
            r2.LIZJ(r0)     // Catch: java.lang.Throwable -> L54
            X.0oMY r1 = new X.0oMY     // Catch: java.lang.Throwable -> L54
            r1.<init>()     // Catch: java.lang.Throwable -> L54
            r1.LJJIJLIJ(r2)     // Catch: java.lang.Throwable -> L54
            boolean r0 = X.C1474810oTv.LJIJJLI()     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L50
            LIZ(r2)     // Catch: java.lang.Throwable -> L51
        L50:
            return r1
        L51:
            r0 = move-exception
            r3 = r1
            goto L58
        L54:
            r0 = move-exception
            goto L58
        L56:
            r0 = move-exception
            r3 = r1
        L58:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r3
        L5c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1470270oMb.LIZJ(java.util.Map):X.0oMY");
    }
}
