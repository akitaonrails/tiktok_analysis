package X;

import com.ss.android.ugc.aweme.creatorcenter.InspirationSettingApi;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0zJO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1891120zJO {
    public static final C1891120zJO LIZ = new C1891120zJO();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C05G4
            if (r0 == 0) goto L57
            r4 = r6
            X.05G4 r4 = (X.C05G4) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L57
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L23
            if (r0 != r2) goto L5d
            X.C155000ia.LIZIZ(r1)
        L22:
            return r1
        L23:
            X.C155000ia.LIZIZ(r1)
            X.0zJP r0 = com.ss.android.ugc.aweme.creatorcenter.InspirationSettingApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.creatorcenter.InspirationSettingApi r0 = X.C1891130zJP.LIZ()
            X.11NZ r1 = r0.LIZ()
            X.11RO r0 = X.C11S5.LIZ()
            X.11Hw r1 = r1.LJL(r0)
            X.11RO r0 = X.C11S5.LIZ()
            X.11O8 r0 = r1.LJJJLZIJ(r0)
            X.11Hh r1 = new X.11Hh
            r1.<init>(r0)
            X.0XHF<T, R> r0 = new X.InterfaceC1487280oo2() { // from class: X.0XHF
                static {
                    /*
                        X.0XHF r0 = new X.0XHF
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0XHF<T, R>) X.0XHF.LL X.0XHF
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0XHF.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0XHF.<init>():void");
                }

                @Override // X.InterfaceC1487280oo2
                public final java.lang.Object apply(java.lang.Object r2) {
                    /*
                        r1 = this;
                        com.ss.android.ugc.aweme.creatorcenter.InspirationSettingApi$InspirationSetting r2 = (com.ss.android.ugc.aweme.creatorcenter.InspirationSettingApi.InspirationSetting) r2
                        boolean r0 = r2.isEnabled
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0XHF.apply(java.lang.Object):java.lang.Object");
                }
            }
            X.11Jy r0 = r1.LJIL(r0)
            r4.LLILLL = r2
            java.lang.Object r1 = X.C11UD.LIZIZ(r0, r4)
            if (r1 != r3) goto L22
            return r3
        L57:
            X.05G4 r4 = new X.05G4
            r4.<init>(r5, r6)
            goto L12
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1891120zJO.LIZIZ(X.05Vn):java.lang.Object");
    }

    public static void LIZ(Function1 function1, boolean z) {
        InspirationSettingApi.LIZ.getClass();
        C1891130zJP.LIZ().LIZIZ(new InspirationSettingApi.InspirationSetting(z)).LJL(C11S5.LIZ()).LJJLL(new C515501zd(function1, z, 14), new C515501zd(function1, z, 15));
    }
}
