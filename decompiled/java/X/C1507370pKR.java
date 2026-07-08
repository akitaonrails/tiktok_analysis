package X;

import com.ss.android.ugc.aweme.ecommerce.proto.IEcomProtobufService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0pKR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1507370pKR {
    public static final IEcomProtobufService LIZ = (IEcomProtobufService) PluggableExtentionKt.pluggableSpi$default(IEcomProtobufService.class, false, false, false, 14, null);

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZIZ(java.lang.String r7, java.lang.String r8, X.InterfaceC1364105Vn r9, byte[] r10) {
        /*
            boolean r0 = r9 instanceof X.C1507380pKS
            if (r0 == 0) goto L21
            r6 = r9
            X.0pKS r6 = (X.C1507380pKS) r6
            int r2 = r6.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r6.LLILLJJLI = r2
        L12:
            java.lang.Object r5 = r6.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L2f
            if (r0 != r2) goto L27
            goto L4f
        L21:
            X.0pKS r6 = new X.0pKS
            r6.<init>(r9)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r5)
            r1 = 0
            if (r8 == 0) goto L3e
            java.lang.String r0 = "application/x-protobuf"
            boolean r0 = kotlin.text.a0.LJJIIZI(r8, r0, r1)
            if (r0 != r2) goto L3e
            r1 = 1
        L3e:
            if (r1 == 0) goto L57
            com.ss.android.ugc.aweme.ecommerce.proto.IEcomProtobufService r1 = X.C1507370pKR.LIZ     // Catch: java.lang.Exception -> L61
            if (r1 == 0) goto L55
            X.0pKU r0 = X.C1507400pKU.LIZ     // Catch: java.lang.Exception -> L61
            r6.LLILLJJLI = r2     // Catch: java.lang.Exception -> L61
            java.lang.Object r5 = r1.LIZ(r7, r0, r10, r6)     // Catch: java.lang.Exception -> L61
            if (r5 != r4) goto L52
            return r4
        L4f:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Exception -> L61
        L52:
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Exception -> L61
            goto L5b
        L55:
            r5 = r3
            goto L5b
        L57:
            java.util.HashMap r5 = X.C1741890vQh.LJIIJJI(r10)     // Catch: java.lang.Exception -> L61
        L5b:
            X.0pKT r1 = new X.0pKT     // Catch: java.lang.Exception -> L61
            r1.<init>(r5, r3)     // Catch: java.lang.Exception -> L61
            return r1
        L61:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.03xw r0 = X.EnumC1014603xw.ERR200
            X.C1019103yf.LIZ(r0, r2, r3)
            X.0pKT r1 = new X.0pKT
            java.lang.String r0 = r2.getMessage()
            if (r0 != 0) goto L7a
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
        L7a:
            r1.<init>(r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1507370pKR.LIZIZ(java.lang.String, java.lang.String, X.05Vn, byte[]):java.lang.Object");
    }

    public static final void LIZ(long j, boolean z, String str, String str2, String str3, InterfaceC1507360pKQ<?> interfaceC1507360pKQ, String str4) {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1507310pKL(str2, str3, j, z, str, interfaceC1507360pKQ, str4, null), 2);
    }
}
