package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0XOg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C847960XOg {
    public static final /* synthetic */ C847960XOg LIZ = new C847960XOg();

    public static List LIZIZ(String str, String str2, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(new C080U("x-tt-bypass-dp", "1"));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        String strLIZ = C838780WvM.LIZ(C2188811AlT.LIZIZ(sbLIZ), "IRegionApi");
        if (strLIZ.length() > 0) {
            arrayList.add(new C080U("x-tt-passport-csrf-token", strLIZ));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, X.InterfaceC1364105Vn<? super com.bytedance.sdk.account.api.IgnoredResponse> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C847970XOh
            if (r0 == 0) goto L20
            r5 = r9
            X.0XOh r5 = (X.C847970XOh) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L4a
        L20:
            X.0XOh r5 = new X.0XOh
            r5.<init>(r6, r9)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r4)
            X.0Wg7 r0 = com.ss.android.account.TTAccountInit.LIZ()     // Catch: java.lang.Exception -> L50
            X.0XOk r0 = (X.C848000XOk) r0     // Catch: java.lang.Exception -> L50
            com.bytedance.sdk.account.api.IRegionApi r1 = X.C848000XOk.LIZIZ(r7)     // Catch: java.lang.Exception -> L50
            java.lang.String r0 = "/passport/app/auth_broadcast/"
            java.util.List r0 = LIZIZ(r7, r0, r2)     // Catch: java.lang.Exception -> L50
            r5.LLILLL = r2     // Catch: java.lang.Exception -> L50
            java.lang.Object r4 = r1.authBroadcast(r8, r0, r5)     // Catch: java.lang.Exception -> L50
            if (r4 != r3) goto L4d
            return r3
        L4a:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L50
        L4d:
            com.bytedance.sdk.account.api.IgnoredResponse r4 = (com.bytedance.sdk.account.api.IgnoredResponse) r4     // Catch: java.lang.Exception -> L50
            return r4
        L50:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.bytedance.sdk.account.api.IgnoredResponse r4 = new com.bytedance.sdk.account.api.IgnoredResponse
            java.lang.String r1 = "auth broadcast network error"
            r0 = 0
            r4.<init>(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C847960XOg.LIZ(java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, X.InterfaceC1364105Vn r12, boolean r13) {
        /*
            r7 = this;
            r0 = 137790(0x21a3e, float:1.93085E-40)
            boolean r6 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            boolean r0 = r12 instanceof X.C847980XOi
            if (r0 == 0) goto L33
            r4 = r12
            X.0XOi r4 = (X.C847980XOi) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L33
            int r2 = r2 - r1
            r4.LLILLL = r2
        L19:
            java.lang.Object r2 = r4.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r3 = 1
            if (r0 == 0) goto L39
            if (r0 == r3) goto L81
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            if (r6 == 0) goto L32
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L32:
            throw r1
        L33:
            X.0XOi r4 = new X.0XOi
            r4.<init>(r7, r12)
            goto L19
        L39:
            X.C155000ia.LIZIZ(r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r0 = "hashed_id"
            r2.put(r0, r10)
            java.lang.String r1 = "type"
            java.lang.String r0 = java.lang.String.valueOf(r8)
            r2.put(r1, r0)
            if (r11 == 0) goto L61
            int r0 = r11.length()
            if (r0 == 0) goto L61
            r0 = 0
        L59:
            if (r0 != 0) goto L63
            java.lang.String r0 = "platform_app_id"
            r2.put(r0, r11)
            goto L63
        L61:
            r0 = 1
            goto L59
        L63:
            X.0Wg7 r0 = com.ss.android.account.TTAccountInit.LIZ()     // Catch: java.lang.Exception -> L87
            X.0XOk r0 = (X.C848000XOk) r0     // Catch: java.lang.Exception -> L87
            com.bytedance.sdk.account.api.IRegionApi r1 = X.C848000XOk.LIZIZ(r9)     // Catch: java.lang.Exception -> L87
            java.lang.String r0 = "/passport/app/region/"
            java.util.List r0 = LIZIZ(r9, r0, r13)     // Catch: java.lang.Exception -> L87
            r4.LLILLL = r3     // Catch: java.lang.Exception -> L87
            java.lang.Object r2 = r1.getRegion(r2, r0, r4)     // Catch: java.lang.Exception -> L87
            if (r2 != r5) goto L84
            if (r6 == 0) goto L80
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L80:
            return r5
        L81:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L87
        L84:
            com.bytedance.sdk.account.api.GetRegionResponse r2 = (com.bytedance.sdk.account.api.GetRegionResponse) r2     // Catch: java.lang.Exception -> L87
            goto L93
        L87:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.bytedance.sdk.account.api.GetRegionResponse r2 = new com.bytedance.sdk.account.api.GetRegionResponse
            java.lang.String r1 = "get region network error"
            r0 = 0
            r2.<init>(r1, r0)
        L93:
            if (r6 == 0) goto L98
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L98:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C847960XOg.LIZJ(int, java.lang.String, java.lang.String, java.lang.String, X.05Vn, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, X.InterfaceC1364105Vn r12) {
        /*
            r6 = this;
            boolean r0 = r12 instanceof X.C847990XOj
            if (r0 == 0) goto L20
            r4 = r12
            X.0XOj r4 = (X.C847990XOj) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r2 = r4.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r3 = 1
            if (r0 == 0) goto L2e
            if (r0 != r3) goto L26
            goto L76
        L20:
            X.0XOj r4 = new X.0XOj
            r4.<init>(r6, r12)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r0 = "hashed_id"
            r2.put(r0, r9)
            java.lang.String r1 = "type"
            java.lang.String r0 = java.lang.String.valueOf(r7)
            r2.put(r1, r0)
            java.lang.String r0 = "result"
            r2.put(r0, r11)
            if (r10 == 0) goto L5b
            int r0 = r10.length()
            if (r0 == 0) goto L5b
            r0 = 0
        L53:
            if (r0 != 0) goto L5d
            java.lang.String r0 = "platform_app_id"
            r2.put(r0, r10)
            goto L5d
        L5b:
            r0 = 1
            goto L53
        L5d:
            X.0Wg7 r0 = com.ss.android.account.TTAccountInit.LIZ()     // Catch: java.lang.Exception -> L7c
            X.0XOk r0 = (X.C848000XOk) r0     // Catch: java.lang.Exception -> L7c
            com.bytedance.sdk.account.api.IRegionApi r1 = X.C848000XOk.LIZIZ(r8)     // Catch: java.lang.Exception -> L7c
            java.lang.String r0 = "/passport/app/region_alert/"
            java.util.List r0 = LIZIZ(r8, r0, r3)     // Catch: java.lang.Exception -> L7c
            r4.LLILLL = r3     // Catch: java.lang.Exception -> L7c
            java.lang.Object r2 = r1.regionAlert(r2, r0, r4)     // Catch: java.lang.Exception -> L7c
            if (r2 != r5) goto L79
            return r5
        L76:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L7c
        L79:
            com.bytedance.sdk.account.api.IgnoredResponse r2 = (com.bytedance.sdk.account.api.IgnoredResponse) r2     // Catch: java.lang.Exception -> L7c
            return r2
        L7c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.bytedance.sdk.account.api.IgnoredResponse r2 = new com.bytedance.sdk.account.api.IgnoredResponse
            java.lang.String r1 = "region alert network error"
            r0 = 0
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C847960XOg.LIZLLL(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
