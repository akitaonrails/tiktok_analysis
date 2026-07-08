package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.09gn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2437109gn {
    public final Map<String, AbstractC2437009gm<C2436109gd>> LIZ = new HashMap();
    public final Map<String, AbstractC2437009gm<C2436109gd>> LIZIZ;

    public C2437109gn() {
        HashMap map = new HashMap();
        this.LIZIZ = map;
        C2437309gp c2437309gp = C2437309gp.LIZIZ;
        map.put("http", c2437309gp);
        map.put("https", c2437309gp);
    }

    public final void LIZIZ(AbstractC2437009gm<? extends C2436109gd> abstractC2437009gm) {
        Iterator<String> it2 = abstractC2437009gm.LIZIZ().iterator();
        while (it2.hasNext()) {
            ((HashMap) this.LIZ).put(it2.next(), abstractC2437009gm);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(android.content.Context r8, android.net.Uri r9, boolean r10, java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
            r7 = this;
            r0 = 71979(0x1192b, float:1.00864E-40)
            boolean r6 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            java.lang.String r5 = r9.getHost()
            java.util.Map<java.lang.String, X.09gm<X.09gd>> r0 = r7.LIZ
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r1 = r0.get(r5)
            X.09gm r1 = (X.AbstractC2437009gm) r1
            java.lang.String r3 = "handler_path_live"
            r4 = 1
            if (r1 == 0) goto L33
            boolean r0 = r1.LIZ(r9)
            if (r0 == 0) goto L33
            X.09gd r0 = X.C2436509gh.LIZ(r1, r9, r11)
            boolean r0 = r1.LIZJ(r8, r0, r11)
            if (r0 == 0) goto L33
            X.C2436609gi.LIZ(r9, r3)
            if (r6 == 0) goto L32
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L32:
            return r4
        L33:
            r1 = 0
            if (r10 == 0) goto L91
            java.lang.String r2 = r9.getScheme()
            java.lang.String r0 = "null"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L48
            if (r6 == 0) goto L47
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L47:
            return r1
        L48:
            java.util.Map<java.lang.String, X.09gm<X.09gd>> r0 = r7.LIZIZ
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r1 = r0.get(r5)
            X.09gm r1 = (X.AbstractC2437009gm) r1
            if (r1 != 0) goto L60
            java.util.Map<java.lang.String, X.09gm<X.09gd>> r0 = r7.LIZIZ
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r1 = r0.get(r2)
            X.09gm r1 = (X.AbstractC2437009gm) r1
            if (r1 == 0) goto L79
        L60:
            boolean r0 = r1.LIZ(r9)
            if (r0 == 0) goto L79
            X.09gd r0 = X.C2436509gh.LIZ(r1, r9, r11)
            boolean r0 = r1.LIZJ(r8, r0, r11)
            if (r0 == 0) goto L79
            X.C2436609gi.LIZ(r9, r3)
            if (r6 == 0) goto L78
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L78:
            return r4
        L79:
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostAction> r0 = com.bytedance.android.livesdkapi.host.IHostAction.class
            X.006A r2 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdkapi.host.IHostAction r2 = (com.bytedance.android.livesdkapi.host.IHostAction) r2
            java.lang.String r1 = r9.toString()
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            boolean r0 = r2.handleSchema(r8, r1, r0)
            if (r0 == 0) goto L91
            goto L92
        L91:
            r4 = 0
        L92:
            if (r6 == 0) goto L97
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L97:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2437109gn.LIZ(android.content.Context, android.net.Uri, boolean, java.util.Map):boolean");
    }
}
