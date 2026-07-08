package X;

import com.ss.android.ugc.aweme.pipo.cashier.common.autofill.business.AutofillHostContent;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0udi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1711520udi {
    public static final C1711520udi LIZ = new C1711520udi();
    public static final HashMap<String, AutofillHostContent> LIZIZ = new HashMap<>();

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r12, X.InterfaceC1364105Vn<? super java.lang.String> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.C1711540udk
            if (r0 == 0) goto L21
            r4 = r13
            X.0udk r4 = (X.C1711540udk) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            r10 = 0
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L27
            goto L4c
        L21:
            X.0udk r4 = new X.0udk
            r4.<init>(r11, r13)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r3)
            java.lang.Class<com.ss.android.ugc.aweme.poi.transaction.IPoiTransactionService> r5 = com.ss.android.ugc.aweme.poi.transaction.IPoiTransactionService.class
            r6 = 0
            r9 = 14
            r7 = r6
            r8 = r6
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L76
            com.ss.android.ugc.aweme.poi.transaction.IPoiTransactionService r0 = (com.ss.android.ugc.aweme.poi.transaction.IPoiTransactionService) r0     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L4a
            r4.LLILLL = r1     // Catch: java.lang.Throwable -> L76
            java.lang.Object r3 = r0.LLFZ(r12, r4)     // Catch: java.lang.Throwable -> L76
            if (r3 != r2) goto L4f
            return r2
        L4a:
            r2 = r10
            goto L57
        L4c:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L76
        L4f:
            com.ss.android.ugc.aweme.poi_api.model.AutoFillCertificateResp r3 = (com.ss.android.ugc.aweme.poi_api.model.AutoFillCertificateResp) r3     // Catch: java.lang.Throwable -> L76
            if (r3 == 0) goto L4a
            java.lang.String r2 = r3.getClientCertificate()     // Catch: java.lang.Throwable -> L76
        L57:
            boolean r0 = X.C123100dR.LIZ(r2)     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L75
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L76
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = "biz_info_resp"
            java.lang.String r0 = r1.optString(r0)     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L75
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L76
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = "certificate"
            java.lang.String r10 = r1.optString(r0)     // Catch: java.lang.Throwable -> L76
        L75:
            return r10
        L76:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r0 == 0) goto L89
            return r10
        L89:
            X.08jB r0 = new X.08jB
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1711520udi.LIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0 A[Catch: all -> 0x00e6, TRY_LEAVE, TryCatch #1 {all -> 0x00e6, blocks: (B:31:0x008e, B:32:0x0091, B:35:0x0099, B:37:0x009f, B:44:0x00e0, B:42:0x00dc, B:34:0x0095, B:15:0x0036, B:17:0x0056, B:19:0x005e, B:20:0x0062, B:25:0x0072, B:27:0x0081), top: B:51:0x001c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r13, java.lang.String r14, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.pipo.cashier.common.autofill.business.AutofillHostContent> r15) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1711520udi.LIZIZ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
