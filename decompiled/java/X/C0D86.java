package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.jsonrpc.JsonRpcRequest;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.jsonrpc.JsonRpcToolParams;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0D86, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D86 {
    public final String LIZ;
    public final Map<String, String> LIZIZ;
    public C0D8C LIZJ;
    public final C1DEV LIZLLL = C2191201ApK.LIZ();
    public final C01GW LJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4857));

    public final Map<String, String> LIZ() {
        return C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(new Pair("Accept", "application/json"), new Pair("Content-Type", "application/json")), this.LIZIZ);
    }

    public static String LIZIZ(C0D8C c0d8c) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(a0.LJLJJI(c0d8c.LIZ, '/'));
        sbLIZ.append("/api/ucp/mcp");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.InterfaceC1364105Vn<? super X.C0D8C> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C0D89
            if (r0 == 0) goto L26
            r6 = r8
            X.0D89 r6 = (X.C0D89) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r5 = r6.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r6.LLILZ
            r3 = 0
            r0 = 1
            if (r1 == 0) goto L34
            if (r1 != r0) goto L2c
            X.1DEV r2 = r6.LL
            X.C155000ia.LIZIZ(r5)
            goto L44
        L26:
            X.0D89 r6 = new X.0D89
            r6.<init>(r7, r8)
            goto L12
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r5)
            X.1DEV r2 = r7.LIZLLL
            r6.LL = r2
            r6.LLILZ = r0
            java.lang.Object r0 = r2.LIZLLL(r3, r6)
            if (r0 != r4) goto L44
            return r4
        L44:
            X.0D8C r1 = r7.LIZJ     // Catch: java.lang.Throwable -> L5a
            if (r1 != 0) goto L52
            X.0D8C r1 = new X.0D8C     // Catch: java.lang.Throwable -> L5a
            java.lang.String r0 = r7.LIZ     // Catch: java.lang.Throwable -> L5a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L5a
            r7.LIZJ = r1     // Catch: java.lang.Throwable -> L5a
            goto L56
        L52:
            java.lang.String r0 = r7.LIZ     // Catch: java.lang.Throwable -> L5a
            r1.LIZ = r0     // Catch: java.lang.Throwable -> L5a
        L56:
            r2.LIZIZ(r3)
            return r1
        L5a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L5a
            r2.LIZIZ(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D86.LJFF(X.05Vn):java.lang.Object");
    }

    public C0D86(String str, Map<String, String> map) {
        this.LIZ = str;
        this.LIZIZ = map;
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    public static String LIZJ(Object obj, String str) {
        Object c098200Yq;
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(jCurrentTimeMillis);
        String strLL = C13LN.LL(6, Integer.toHexString(C2188811AlT.LIZIZ(sbLIZ).hashCode()));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLL);
        sbLIZ2.append('-');
        sbLIZ2.append(str);
        sbLIZ2.append('-');
        sbLIZ2.append(jCurrentTimeMillis);
        try {
            c098200Yq = C051K.LIZLLL(true, false, false, new JsonRpcRequest("tools/call", C2188811AlT.LIZIZ(sbLIZ2), new JsonRpcToolParams(str, obj)));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
            return (String) c098200Yq;
        }
        throw new IllegalStateException("Failed to encode JSON-RPC request", thM5exceptionOrNullimpl);
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network.CompleteCheckoutArguments r10, X.InterfaceC1364105Vn<? super X.AbstractC333960D7i<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C0D87
            if (r0 == 0) goto L8b
            r7 = r11
            X.0D87 r7 = (X.C0D87) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8b
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r5 = r7.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r1 = r7.LLILZ
            r8 = 2
            r0 = 1
            if (r1 == 0) goto L42
            if (r1 == r0) goto L50
            if (r1 != r8) goto L91
            java.lang.Object r2 = r7.LL
            X.0D8C r2 = (X.C0D8C) r2
            X.C155000ia.LIZIZ(r5)
        L29:
            X.0D7i r5 = (X.AbstractC333960D7i) r5
            boolean r0 = r5 instanceof X.C333950D7h
            if (r0 == 0) goto L41
            r0 = r5
            X.0D7h r0 = (X.C333950D7h) r0
            T r0 = r0.LIZIZ
            com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession r0 = (com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession) r0
            java.lang.Object r1 = r0.ucp
            if (r1 == 0) goto L41
            kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> r0 = r2.LIZIZ
            if (r0 == 0) goto L41
            r0.invoke(r1)
        L41:
            return r5
        L42:
            X.C155000ia.LIZIZ(r5)
            r7.LL = r10
            r7.LLILZ = r0
            java.lang.Object r5 = r9.LJFF(r7)
            if (r5 != r6) goto L55
            return r6
        L50:
            java.lang.Object r10 = r7.LL
            X.C155000ia.LIZIZ(r5)
        L55:
            X.0D8C r5 = (X.C0D8C) r5
            X.04vl r4 = new X.04vl
            java.lang.String r2 = LIZIZ(r5)
            java.util.Map r1 = r9.LIZ()
            java.lang.String r0 = "complete_checkout"
            java.lang.String r0 = LIZJ(r10, r0)
            r4.<init>(r2, r1, r0)
            X.01GW r0 = r9.LJ
            java.lang.Object r3 = r0.getValue()
            X.0D8B r3 = (X.C0D8B) r3
            r7.LL = r5
            r7.LLILZ = r8
            r3.getClass()
            X.1DFB r2 = X.C0PEM.LIZJ
            X.0D85 r1 = new X.0D85
            r0 = 0
            r1.<init>(r3, r4, r0)
            java.lang.Object r0 = X.C23250099c.LJI(r7, r2, r1)
            if (r0 != r6) goto L88
            return r6
        L88:
            r2 = r5
            r5 = r0
            goto L29
        L8b:
            X.0D87 r7 = new X.0D87
            r7.<init>(r9, r11)
            goto L12
        L91:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D86.LIZLLL(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network.CompleteCheckoutArguments, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network.CreateCheckoutArguments r10, X.InterfaceC1364105Vn<? super X.AbstractC333960D7i<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession>> r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C0D88
            if (r0 == 0) goto L8b
            r7 = r11
            X.0D88 r7 = (X.C0D88) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8b
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r5 = r7.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r1 = r7.LLILZ
            r8 = 2
            r0 = 1
            if (r1 == 0) goto L42
            if (r1 == r0) goto L50
            if (r1 != r8) goto L91
            java.lang.Object r2 = r7.LL
            X.0D8C r2 = (X.C0D8C) r2
            X.C155000ia.LIZIZ(r5)
        L29:
            X.0D7i r5 = (X.AbstractC333960D7i) r5
            boolean r0 = r5 instanceof X.C333950D7h
            if (r0 == 0) goto L41
            r0 = r5
            X.0D7h r0 = (X.C333950D7h) r0
            T r0 = r0.LIZIZ
            com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession r0 = (com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession) r0
            java.lang.Object r1 = r0.ucp
            if (r1 == 0) goto L41
            kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> r0 = r2.LIZIZ
            if (r0 == 0) goto L41
            r0.invoke(r1)
        L41:
            return r5
        L42:
            X.C155000ia.LIZIZ(r5)
            r7.LL = r10
            r7.LLILZ = r0
            java.lang.Object r5 = r9.LJFF(r7)
            if (r5 != r6) goto L55
            return r6
        L50:
            java.lang.Object r10 = r7.LL
            X.C155000ia.LIZIZ(r5)
        L55:
            X.0D8C r5 = (X.C0D8C) r5
            X.04vl r4 = new X.04vl
            java.lang.String r2 = LIZIZ(r5)
            java.util.Map r1 = r9.LIZ()
            java.lang.String r0 = "create_checkout"
            java.lang.String r0 = LIZJ(r10, r0)
            r4.<init>(r2, r1, r0)
            X.01GW r0 = r9.LJ
            java.lang.Object r3 = r0.getValue()
            X.0D8B r3 = (X.C0D8B) r3
            r7.LL = r5
            r7.LLILZ = r8
            r3.getClass()
            X.1DFB r2 = X.C0PEM.LIZJ
            X.0D85 r1 = new X.0D85
            r0 = 0
            r1.<init>(r3, r4, r0)
            java.lang.Object r0 = X.C23250099c.LJI(r7, r2, r1)
            if (r0 != r6) goto L88
            return r6
        L88:
            r2 = r5
            r5 = r0
            goto L29
        L8b:
            X.0D88 r7 = new X.0D88
            r7.<init>(r9, r11)
            goto L12
        L91:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D86.LJ(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network.CreateCheckoutArguments, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network.UpdateCheckoutArguments r10, X.InterfaceC1364105Vn<? super X.AbstractC333960D7i<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession>> r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C0D8A
            if (r0 == 0) goto L8c
            r7 = r11
            X.0D8A r7 = (X.C0D8A) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8c
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r5 = r7.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r1 = r7.LLILZ
            r8 = 2
            r0 = 1
            if (r1 == 0) goto L42
            if (r1 == r0) goto L50
            if (r1 != r8) goto L92
            java.lang.Object r2 = r7.LL
            X.0D8C r2 = (X.C0D8C) r2
            X.C155000ia.LIZIZ(r5)
        L29:
            X.0D7i r5 = (X.AbstractC333960D7i) r5
            boolean r0 = r5 instanceof X.C333950D7h
            if (r0 == 0) goto L41
            r0 = r5
            X.0D7h r0 = (X.C333950D7h) r0
            T r0 = r0.LIZIZ
            com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession r0 = (com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession) r0
            java.lang.Object r1 = r0.ucp
            if (r1 == 0) goto L41
            kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> r0 = r2.LIZIZ
            if (r0 == 0) goto L41
            r0.invoke(r1)
        L41:
            return r5
        L42:
            X.C155000ia.LIZIZ(r5)
            r7.LL = r10
            r7.LLILZ = r0
            java.lang.Object r5 = r9.LJFF(r7)
            if (r5 != r6) goto L55
            return r6
        L50:
            java.lang.Object r10 = r7.LL
            X.C155000ia.LIZIZ(r5)
        L55:
            X.0D8C r5 = (X.C0D8C) r5
            X.04vl r4 = new X.04vl
            java.lang.String r2 = LIZIZ(r5)
            java.util.Map r1 = r9.LIZ()
            java.lang.String r0 = "update_checkout"
            java.lang.String r0 = LIZJ(r10, r0)
            r4.<init>(r2, r1, r0)
            X.01GW r0 = r9.LJ
            java.lang.Object r3 = r0.getValue()
            X.0D8B r3 = (X.C0D8B) r3
            r7.LL = r5
            r7.LLILZ = r8
            r3.getClass()
            X.1DFB r2 = X.C0PEM.LIZJ
            X.0D85 r1 = new X.0D85
            r0 = 0
            r1.<init>(r3, r4, r0)
            java.lang.Object r0 = X.C23250099c.LJI(r7, r2, r1)
            if (r0 != r6) goto L89
            return r6
        L89:
            r2 = r5
            r5 = r0
            goto L29
        L8c:
            X.0D8A r7 = new X.0D8A
            r7.<init>(r9, r11)
            goto L12
        L92:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D86.LJI(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network.UpdateCheckoutArguments, X.05Vn):java.lang.Object");
    }
}
