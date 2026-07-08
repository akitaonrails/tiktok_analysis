package X;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0pa2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517040pa2 {
    public static final C1517040pa2 LIZ = new C1517040pa2();
    public static final List<InterfaceC1517070pa5> LIZIZ = Collections.singletonList(new C1517030pa1());

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005c -> B:22:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r14, boolean r15, X.InterfaceC1364105Vn<? super X.InterfaceC1516890pZn> r16) {
        /*
            r13 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C1517050pa3
            if (r0 == 0) goto L2d
            r6 = r3
            X.0pa3 r6 = (X.C1517050pa3) r6
            int r2 = r6.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2d
            int r2 = r2 - r1
            r6.LLILZLL = r2
        L14:
            java.lang.Object r0 = r6.LLILZ
            java.lang.Object r5 = X.C099R.LJFF()
            int r1 = r6.LLILZLL
            r4 = 1
            r12 = 0
            if (r1 == 0) goto L3b
            if (r1 != r4) goto L33
            boolean r15 = r6.LLILLL
            java.lang.Object r3 = r6.LLILLJJLI
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r14 = r6.LL
            java.lang.String r14 = (java.lang.String) r14
            goto L5f
        L2d:
            X.0pa3 r6 = new X.0pa3
            r6.<init>(r13, r3)
            goto L14
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3b:
            X.C155000ia.LIZIZ(r0)
            java.util.List<X.0pa5> r0 = X.C1517040pa2.LIZIZ
            java.util.Iterator r3 = r0.iterator()
        L44:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L84
            java.lang.Object r0 = r3.next()
            X.0pa5 r0 = (X.InterfaceC1517070pa5) r0
            r6.LL = r14     // Catch: java.lang.Exception -> L65
            r6.LLILLJJLI = r3     // Catch: java.lang.Exception -> L65
            r6.LLILLL = r15     // Catch: java.lang.Exception -> L65
            r6.LLILZLL = r4     // Catch: java.lang.Exception -> L65
            java.lang.Object r0 = r0.LIZ(r14, r15, r6)     // Catch: java.lang.Exception -> L65
            if (r0 != r5) goto L62
            goto L83
        L5f:
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Exception -> L67
        L62:
            X.0pZn r0 = (X.InterfaceC1516890pZn) r0     // Catch: java.lang.Exception -> L67
            goto L80
        L65:
            r2 = move-exception
            goto L68
        L67:
            r2 = move-exception
        L68:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.service.IEcErrorCollectService> r7 = com.ss.android.ugc.aweme.ecommerce.service.IEcErrorCollectService.class
            r8 = 0
            r11 = 14
            r9 = r8
            r10 = r8
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r7, r8, r9, r10, r11, r12)
            com.ss.android.ugc.aweme.ecommerce.service.IEcErrorCollectService r1 = (com.ss.android.ugc.aweme.ecommerce.service.IEcErrorCollectService) r1
            if (r1 == 0) goto L7f
            java.lang.String r0 = "DefinitionsProviders getDefinitions failed"
            r1.LIZ(r0, r2, r12)
        L7f:
            r0 = r12
        L80:
            if (r0 == 0) goto L44
            return r0
        L83:
            return r5
        L84:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1517040pa2.LIZ(java.lang.String, boolean, X.05Vn):java.lang.Object");
    }
}
