package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.00cE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C115600cE {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZIZ(String str) {
        List listLJJLIIIJILLIZJL;
        if (str != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6)) != null) {
            if (!listLJJLIIIJILLIZJL.isEmpty()) {
                if (!listLJJLIIIJILLIZJL.isEmpty()) {
                    Iterator it2 = listLJJLIIIJILLIZJL.iterator();
                    while (it2.hasNext()) {
                        if (((String) it2.next()).length() == 0) {
                        }
                    }
                }
                return listLJJLIIIJILLIZJL;
            }
            Map<String, Object> map = C1338270kvh.LIZ;
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
    
        r0 = X.C1338270kvh.LIZ;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject LIZ(java.util.List r7, org.json.JSONObject r8) throws org.json.JSONException {
        /*
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.util.Iterator r7 = r7.iterator()
        L9:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L9c
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r6 = LIZIZ(r0)
            if (r6 == 0) goto L9
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L9
            r0 = 0
            r5 = 0
            if (r0 != 0) goto L9
            java.util.Iterator r2 = r6.iterator()
            r4 = r8
        L2a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = r4 instanceof org.json.JSONObject
            if (r0 == 0) goto L41
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            java.lang.Object r4 = r4.opt(r1)
            goto L2a
        L41:
            boolean r0 = r4 instanceof org.json.JSONArray
            if (r0 == 0) goto L9a
            java.lang.Integer r0 = X.C2095008Iq.LJIIJJI(r1)
            if (r0 == 0) goto L94
            org.json.JSONArray r4 = (org.json.JSONArray) r4
            int r0 = r0.intValue()
            java.lang.Object r4 = r4.opt(r0)
        L55:
            int r0 = r6.size()
            java.util.ListIterator r2 = r6.listIterator(r0)
        L5d:
            boolean r0 = r2.hasPrevious()
            if (r0 == 0) goto L96
            java.lang.Object r1 = r2.previous()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Integer r0 = X.C2095008Iq.LJIIJJI(r0)
            if (r0 != 0) goto L5d
            if (r1 == 0) goto L96
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r1, r4)
            java.lang.Object r0 = r2.getFirst()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r3.has(r0)
            if (r0 == 0) goto L85
            java.util.Map<java.lang.String, java.lang.Object> r0 = X.C1338270kvh.LIZ
        L85:
            java.lang.Object r1 = r2.getFirst()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r2.getSecond()
            r3.put(r1, r0)
            goto L9
        L94:
            r4 = r5
            goto L55
        L96:
            java.util.Map<java.lang.String, java.lang.Object> r0 = X.C1338270kvh.LIZ
            goto L9
        L9a:
            r4 = r5
            goto L2a
        L9c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115600cE.LIZ(java.util.List, org.json.JSONObject):org.json.JSONObject");
    }
}
