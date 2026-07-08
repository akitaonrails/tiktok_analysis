package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07oC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1973407oC {
    public final String LIZ;
    public final LinkedHashMap<String, Object> LIZIZ = new LinkedHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            r6 = this;
            X.07oB r0 = X.C1973307oB.LIZ
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r1 = r6.LIZIZ
            r0.getClass()
            boolean r0 = r1.isEmpty()
            r4 = 0
            if (r0 == 0) goto L27
            java.util.Map r3 = X.C2097608Jq.LJ()
        L12:
            java.lang.String r0 = r6.LIZ
            X.C20684815ws.LJIILLIIL(r0, r3)
            java.lang.String r3 = r6.LIZ
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r2 = r6.LIZIZ
            X.07oB r0 = X.C1973307oB.LIZ
            r0.getClass()
            r1 = 4
            java.lang.String r0 = "PGCSubsLog"
            X.C1973307oB.LIZJ(r1, r0, r3, r4, r2)
            return
        L27:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            int r0 = r1.size()
            r3.<init>(r0)
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r5 = r0.iterator()
        L38:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L12
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r0.getValue()
            boolean r0 = kotlin.text.a0.LJJJIL(r2)
            if (r0 != 0) goto L38
            X.07oB r0 = X.C1973307oB.LIZ
            r0.getClass()
            if (r1 == 0) goto L38
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L6e
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L38
        L6a:
            r3.put(r2, r1)
            goto L38
        L6e:
            boolean r0 = r1 instanceof java.lang.CharSequence
            if (r0 == 0) goto L81
            java.lang.String r1 = r1.toString()
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L38
        L7e:
            if (r1 != 0) goto L6a
            goto L38
        L81:
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 != 0) goto L9a
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 != 0) goto L9a
            boolean r0 = r1 instanceof java.lang.Character
            if (r0 != 0) goto L9a
            java.lang.String r1 = r1.toString()
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L38
            goto L7e
        L9a:
            java.lang.String r1 = r1.toString()
            goto L7e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1973407oC.LIZJ():void");
    }

    public C1973407oC(String str) {
        this.LIZ = str;
    }

    public final void LIZIZ(Map map) {
        String string;
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key == null || (string = key.toString()) == null) {
                string = "";
            }
            if ((!a0.LJJJIL(string)) && value != null) {
                this.LIZIZ.put(string, value);
            }
        }
    }

    public final void LIZ(Object obj, String str) {
        if (!a0.LJJJIL(str) && obj != null) {
            this.LIZIZ.put(str, obj);
        }
    }
}
