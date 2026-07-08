package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18Cq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21246618Cq extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ C18G6 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21246618Cq(C18G6 c18g6) {
        super(0);
        this.LL = c18g6;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0023 A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:10:0x0017, B:16:0x0023, B:17:0x002c, B:19:0x0032, B:20:0x004f), top: B:36:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke() {
        /*
            r17 = this;
            java.lang.String r5 = "singleton_cache"
            java.lang.String r4 = ""
            r6 = r17
            X.18G6 r0 = r6.LL
            r14 = 0
            r10 = 1
            if (r0 == 0) goto L16
            java.lang.String r8 = r0.LIZIZ(r5, r4)     // Catch: java.lang.Throwable -> L13
            if (r8 != 0) goto L17
            goto L16
        L13:
            r1 = move-exception
            r8 = r4
            goto L56
        L16:
            r8 = r4
        L17:
            int r0 = r8.length()     // Catch: java.lang.Throwable -> L55
            if (r0 <= 0) goto L1e
            goto L20
        L1e:
            r0 = 0
            goto L21
        L20:
            r0 = 1
        L21:
            if (r0 == 0) goto L4f
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L55
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L55
            java.util.Iterator r7 = r9.keys()     // Catch: java.lang.Throwable -> L55
        L2c:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L4f
            java.lang.Object r3 = r7.next()     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L55
            java.util.Map<java.lang.String, com.bytedance.android.btm.impl.page.model.PageInfoStack> r2 = X.C21249518Dt.LIZ     // Catch: java.lang.Throwable -> L55
            X.18Dl r0 = com.bytedance.android.btm.impl.page.model.PageInfoStack.Companion     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = r9.optString(r3)     // Catch: java.lang.Throwable -> L55
            r0.getClass()     // Catch: java.lang.Throwable -> L55
            com.bytedance.android.btm.impl.page.model.PageInfoStack r0 = new com.bytedance.android.btm.impl.page.model.PageInfoStack     // Catch: java.lang.Throwable -> L55
            r0.<init>()     // Catch: java.lang.Throwable -> L55
            r0.parse(r1)     // Catch: java.lang.Throwable -> L55
            r2.put(r3, r0)     // Catch: java.lang.Throwable -> L55
            goto L2c
        L4f:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L55
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L55
            goto L61
        L55:
            r1 = move-exception
        L56:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L61:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r0 == 0) goto L74
            java.lang.String r13 = "SingletonCache"
            X.18CE r11 = X.C18CE.LIZ
            r16 = 0
            r12 = 1122(0x462, float:1.572E-42)
            r15 = r14
            r11.LJFF(r12, r13, r14, r15, r16)
            r8 = r4
        L74:
            X.18G6 r0 = r6.LL
            if (r0 == 0) goto L7b
            r0.LIZJ(r5, r4)
        L7b:
            int r0 = r8.length()
            if (r0 > 0) goto L82
            r10 = 0
        L82:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21246618Cq.invoke():java.lang.Object");
    }
}
