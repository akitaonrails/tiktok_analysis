package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.profile.model.User;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Nc7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C597530Nc7 implements InterfaceC586170Myt, InterfaceC1164530gPT {
    public static volatile Boolean LLILLL;
    public static final C597530Nc7 LL = new C597530Nc7();
    public static final Keva LLILLJJLI = Keva.getRepo("toko_account_auth_sp");
    public static int LLILZ = 3;

    public static boolean LIZIZ() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        Keva keva = LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("toko_data_authorized_");
        sbLIZ.append(curUserId);
        boolean z = keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
        LLILLL = Boolean.valueOf(z);
        return z;
    }

    public static void LIZLLL() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        Keva keva = LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("toko_data_authorized_");
        sbLIZ.append(curUserId);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Boolean bool = LLILLL;
        keva.storeBoolean(strLIZIZ, bool != null ? bool.booleanValue() : false);
    }

    public final void LIZJ() {
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(this);
        AnonymousClass0378.LIZ().LIZLLL("toko_data_authorise_change", this);
        LLILLL = null;
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C597510Nc5(null), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super java.lang.Boolean> r9) {
        /*
            r8 = this;
            r0 = 137957(0x21ae5, float:1.93319E-40)
            boolean r7 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            boolean r0 = r9 instanceof X.C597520Nc6
            if (r0 == 0) goto L37
            r6 = r9
            X.0Nc6 r6 = (X.C597520Nc6) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L37
            int r2 = r2 - r1
            r6.LLILLL = r2
        L19:
            java.lang.Object r5 = r6.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r3 = 0
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L3d
            if (r0 == r1) goto L55
            if (r0 == r2) goto Laf
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            if (r7 == 0) goto L36
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L36:
            throw r1
        L37:
            X.0Nc6 r6 = new X.0Nc6
            r6.<init>(r8, r9)
            goto L19
        L3d:
            X.C155000ia.LIZIZ(r5)
            X.0Nc8 r0 = com.ss.android.ugc.aweme.ecommerce.mall.toko.repository.TTDataAuthApi.LIZ     // Catch: java.lang.Exception -> Lb8
            r0.getClass()     // Catch: java.lang.Exception -> Lb8
            com.ss.android.ugc.aweme.ecommerce.mall.toko.repository.TTDataAuthApi r0 = X.C597540Nc8.LIZIZ     // Catch: java.lang.Exception -> Lb8
            r6.LLILLL = r1     // Catch: java.lang.Exception -> Lb8
            java.lang.Object r5 = r0.getTTDataAuthStatus(r1, r1, r6)     // Catch: java.lang.Exception -> Lb8
            if (r5 != r4) goto L58
            if (r7 == 0) goto L54
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L54:
            return r4
        L55:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Exception -> Lb8
        L58:
            X.0X52 r5 = (X.C0X52) r5     // Catch: java.lang.Exception -> Lb8
            boolean r0 = r5.LIZJ()
            if (r0 == 0) goto L99
            T r0 = r5.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0
            boolean r0 = r0.isCodeOK()
            if (r0 == 0) goto L99
            T r0 = r5.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0
            T r0 = r0.data
            com.ss.android.ugc.aweme.ecommerce.mall.toko.repository.TTDataAuthApi$UserDataAuthInfoData r0 = (com.ss.android.ugc.aweme.ecommerce.mall.toko.repository.TTDataAuthApi.UserDataAuthInfoData) r0
            if (r0 == 0) goto L97
            int r0 = r0.authStatus
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
        L7a:
            if (r0 == 0) goto L83
            int r0 = r0.intValue()
            if (r0 != r2) goto L83
            r3 = 1
        L83:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            X.C597530Nc7.LLILLL = r0
            LIZLLL()
            r3 = 1
        L8d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            if (r7 == 0) goto L96
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L96:
            return r0
        L97:
            r0 = 0
            goto L7a
        L99:
            int r1 = X.C597530Nc7.LLILZ
            int r0 = r1 + (-1)
            X.C597530Nc7.LLILZ = r0
            if (r1 <= 0) goto L8d
            r6.LLILLL = r2
            java.lang.Object r5 = r8.LIZ(r6)
            if (r5 != r4) goto Lb2
            if (r7 == 0) goto Lae
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        Lae:
            return r4
        Laf:
            X.C155000ia.LIZIZ(r5)
        Lb2:
            if (r7 == 0) goto Lb7
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        Lb7:
            return r5
        Lb8:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            if (r7 == 0) goto Lc5
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        Lc5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C597530Nc7.LIZ(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        LLILLL = Boolean.valueOf(new JSONObject(str2).optBoolean("authorised"));
        LIZLLL();
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        LIZJ();
    }
}
