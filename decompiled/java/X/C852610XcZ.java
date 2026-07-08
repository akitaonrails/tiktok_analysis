package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.account.token.TTTokenUtils;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0XcZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C852610XcZ {
    public static final /* synthetic */ C852610XcZ LIZ = new C852610XcZ();
    public static final InterfaceC852600XcY LIZIZ = (InterfaceC852600XcY) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(InterfaceC852600XcY.class);

    public static C15O7 LIZ(EnumC852630Xcb enumC852630Xcb) {
        InterfaceC852600XcY interfaceC852600XcY = LIZIZ;
        String strLIZ = C08HN.LIZ(String.valueOf(enumC852630Xcb.getValue()));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0CQT.LIZJ);
        sbLIZ.append("/passport/shark/safe_verify/v2/");
        return interfaceC852600XcY.LIZIZ(strLIZ, 1, TTTokenUtils.LIZ(C2188811AlT.LIZIZ(sbLIZ)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.EnumC852630Xcb r8, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.account.model.SafeEnvV2Response> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C852620Xca
            if (r0 == 0) goto L20
            r6 = r9
            X.0Xca r6 = (X.C852620Xca) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r2 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 1
            if (r0 == 0) goto L2e
            if (r0 != r4) goto L26
            goto L62
        L20:
            X.0Xca r6 = new X.0Xca
            r6.<init>(r7, r9)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r2)
            X.0XcY r3 = X.C852610XcZ.LIZIZ     // Catch: java.lang.Exception -> L68
            int r0 = r8.getValue()     // Catch: java.lang.Exception -> L68
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> L68
            java.lang.String r2 = X.C08HN.LIZ(r0)     // Catch: java.lang.Exception -> L68
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L68
            java.lang.String r0 = X.C0CQT.LIZJ     // Catch: java.lang.Exception -> L68
            r1.append(r0)     // Catch: java.lang.Exception -> L68
            java.lang.String r0 = "/passport/shark/safe_verify/v2/"
            r1.append(r0)     // Catch: java.lang.Exception -> L68
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L68
            java.lang.String r1 = com.ss.android.account.token.TTTokenUtils.LIZ(r0)     // Catch: java.lang.Exception -> L68
            r6.LLILLL = r4     // Catch: java.lang.Exception -> L68
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L68
            java.lang.Object r2 = r3.LIZ(r2, r0, r1, r6)     // Catch: java.lang.Exception -> L68
            if (r2 != r5) goto L65
            return r5
        L62:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L68
        L65:
            com.ss.android.ugc.aweme.account.model.SafeEnvV2Response r2 = (com.ss.android.ugc.aweme.account.model.SafeEnvV2Response) r2     // Catch: java.lang.Exception -> L68
            return r2
        L68:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.account.model.SafeEnvV2Response r2 = new com.ss.android.ugc.aweme.account.model.SafeEnvV2Response
            java.lang.String r1 = r0.getMessage()
            if (r1 != 0) goto L76
            java.lang.String r1 = ""
        L76:
            r0 = 0
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C852610XcZ.LIZIZ(X.0Xcb, X.05Vn):java.lang.Object");
    }
}
