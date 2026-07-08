package X;

import com.ss.android.ugc.aweme.ecommerce.core.ecaction.ECActionApi;
import com.ss.android.ugc.aweme.ecommerce.network.IECRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.05Ez, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1321105Ez {
    public static final /* synthetic */ C1321105Ez LIZ = new C1321105Ez();
    public static final ECActionApi LIZIZ = (ECActionApi) ((IECRetrofitFactory) ServiceManager.get().getService(IECRetrofitFactory.class)).LIZ(C1020403ys.LIZ()).create(ECActionApi.class);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super java.lang.Integer> r8) {
        /*
            r7 = this;
            r0 = 137815(0x21a57, float:1.9312E-40)
            boolean r6 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            boolean r0 = r8 instanceof X.C058G
            if (r0 == 0) goto L34
            r5 = r8
            X.058G r5 = (X.C058G) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L34
            int r2 = r2 - r1
            r5.LLILLL = r2
        L19:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L4d
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            if (r6 == 0) goto L33
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L33:
            throw r1
        L34:
            X.058G r5 = new X.058G
            r5.<init>(r7, r8)
            goto L19
        L3a:
            X.C155000ia.LIZIZ(r4)
            com.ss.android.ugc.aweme.ecommerce.core.ecaction.ECActionApi r0 = X.C1321105Ez.LIZIZ     // Catch: java.lang.Exception -> L65
            r5.LLILLL = r2     // Catch: java.lang.Exception -> L65
            java.lang.Object r4 = r0.LIZ(r5)     // Catch: java.lang.Exception -> L65
            if (r4 != r3) goto L50
            if (r6 == 0) goto L4c
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L4c:
            return r3
        L4d:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L65
        L50:
            X.0X52 r4 = (X.C0X52) r4     // Catch: java.lang.Exception -> L65
            T r0 = r4.LIZIZ     // Catch: java.lang.Exception -> L65
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0     // Catch: java.lang.Exception -> L65
            T r0 = r0.data     // Catch: java.lang.Exception -> L65
            com.ss.android.ugc.aweme.ecommerce.core.ecaction.ECActionApi$InboxEntranceResponse r0 = (com.ss.android.ugc.aweme.ecommerce.core.ecaction.ECActionApi.InboxEntranceResponse) r0     // Catch: java.lang.Exception -> L65
            if (r0 == 0) goto L69
            java.lang.Integer r0 = r0.cartItemCount     // Catch: java.lang.Exception -> L65
            if (r0 == 0) goto L69
            int r1 = r0.intValue()     // Catch: java.lang.Exception -> L65
            goto L69
        L65:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L69:
            java.lang.Integer r0 = X.C2286608xc.LJ(r1)
            if (r6 == 0) goto L72
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L72:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1321105Ez.LIZ(X.05Vn):java.lang.Object");
    }
}
