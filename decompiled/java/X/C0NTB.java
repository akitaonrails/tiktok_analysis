package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0NTB, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C0NTB extends C2217421BqW implements Function2<Map<String, ? extends Object>, Map<String, ? extends Object>, Unit> {
    public C0NTB(C1767950w6j c1767950w6j) {
        super(2, c1767950w6j, C1767950w6j.class, "sendCartEntryShowTestEvent", "sendCartEntryShowTestEvent(Ljava/util/Map;Ljava/util/Map;)V", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0058 A[LOOP:0: B:9:0x0052->B:11:0x0058, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(java.util.Map<java.lang.String, ? extends java.lang.Object> r6, java.util.Map<java.lang.String, ? extends java.lang.Object> r7) {
        /*
            r5 = this;
            java.util.Map r6 = (java.util.Map) r6
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r0 = r5.receiver
            r0.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> r2 = X.C1767950w6j.LIZIZ
            java.lang.String r4 = "tiktokec_cart_entrance_show_test"
            java.lang.Object r0 = r2.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == 0) goto L29
            int r0 = r0.intValue()
            if (r0 <= 0) goto L8f
            if (r0 == r1) goto L29
            int r0 = r0 + (-1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.put(r4, r0)
        L29:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r1 = "EVENT_ORIGIN_FEATURE"
            java.lang.String r0 = "TEMAI"
            r3.put(r1, r0)
            X.0w6j r0 = X.C1767950w6j.LIZ
            r0.getClass()
            java.lang.String r1 = X.C1767950w6j.LJFF()
            java.lang.String r0 = "enter_from"
            r3.put(r0, r1)
            java.lang.String r1 = "page_name"
            java.lang.String r0 = "mall"
            r3.put(r1, r0)
            java.util.Set r0 = r6.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L52:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r3.put(r1, r0)
            goto L52
        L6a:
            if (r7 == 0) goto L8c
            java.util.Set r0 = r7.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L74:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L8c
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r3.put(r1, r0)
            goto L74
        L8c:
            X.C1767950w6j.LJIILLIIL(r4, r3)
        L8f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NTB.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
