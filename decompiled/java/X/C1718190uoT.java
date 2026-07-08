package X;

import com.ss.android.ugc.aweme.biz.wallet.biz.commonpage.WalletCommonStepFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0uoT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1718190uoT extends AbstractC1718270uob {
    public final String LJ;
    public final Function0<String> LJFF;

    @Override // X.InterfaceC1717200ums
    public final String LJI() {
        return "CREATE_USER";
    }

    public C1718190uoT(String str, Function0 function0) {
        this.LJ = str;
        this.LJFF = function0;
    }

    @Override // X.InterfaceC1717200ums
    public final void LJII(C19EG c19eg, final C1717190umr c1717190umr, final String str) {
        String str2 = WalletCommonStepFragment._pnsPageId;
        C1222080huI.LIZ(c19eg, "CREATE_USER", this.LJ, new InterfaceC1221990hu9() { // from class: X.0uof
            @Override // X.InterfaceC1221990hu9
            public final void onSuccess(String str3) {
            }

            @Override // X.InterfaceC1221990hu9
            public final void onCancel() {
                c1717190umr.LIZ(null);
            }

            @Override // X.InterfaceC1221990hu9
            public final void onSuccess() {
                c1717190umr.LIZJ(null, str, null);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // X.AbstractC1718270uob
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(X.C19EG r7, X.InterfaceC1718330uoh r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C1718240uoY
            if (r0 == 0) goto L22
            r5 = r9
            X.0uoY r5 = (X.C1718240uoY) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 != r2) goto L28
            X.0uoh r8 = r5.LL
            goto L4e
        L22:
            X.0uoY r5 = new X.0uoY
            r5.<init>(r6, r9)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r4)
            X.0uoI r0 = new X.0uoI     // Catch: java.lang.Exception -> L7c
            r0.<init>()     // Catch: java.lang.Exception -> L7c
            java.lang.String r1 = r6.LJ     // Catch: java.lang.Exception -> L7c
            X.0uoL r0 = X.C1718110uoL.LIZ     // Catch: java.lang.Exception -> L7c
            r0.getClass()     // Catch: java.lang.Exception -> L7c
            java.lang.String r0 = X.C1718110uoL.LIZ(r1)     // Catch: java.lang.Exception -> L7c
            r5.LL = r8     // Catch: java.lang.Exception -> L7c
            r5.LLILZ = r2     // Catch: java.lang.Exception -> L7c
            java.lang.Object r4 = X.C1718070uoH.LJLZ(r1, r0, r5)     // Catch: java.lang.Exception -> L7c
            if (r4 != r3) goto L51
            return r3
        L4e:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L7c
        L51:
            X.0X52 r4 = (X.C0X52) r4     // Catch: java.lang.Exception -> L7c
            T r2 = r4.LIZIZ     // Catch: java.lang.Exception -> L7c
            com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse r2 = (com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse) r2     // Catch: java.lang.Exception -> L7c
            boolean r0 = r4.LIZJ()     // Catch: java.lang.Exception -> L7c
            r1 = 0
            if (r0 == 0) goto L6a
            boolean r0 = r2.LIZ()     // Catch: java.lang.Exception -> L7c
            if (r0 == 0) goto L6a
            X.0JCm r0 = X.EnumC488180JCm.SUCCESS     // Catch: java.lang.Exception -> L7c
            r8.LIZ(r0, r1)     // Catch: java.lang.Exception -> L7c
            goto L98
        L6a:
            boolean r0 = r4.LIZJ()     // Catch: java.lang.Exception -> L7c
            if (r0 == 0) goto L76
            T r0 = r4.LIZIZ     // Catch: java.lang.Exception -> L7c
            com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse r0 = (com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse) r0     // Catch: java.lang.Exception -> L7c
            java.lang.String r1 = r0.errorContent     // Catch: java.lang.Exception -> L7c
        L76:
            X.0JCm r0 = X.EnumC488180JCm.FAIL     // Catch: java.lang.Exception -> L7c
            r8.LIZ(r0, r1)     // Catch: java.lang.Exception -> L7c
            goto L98
        L7c:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.0uus r0 = X.C1717770unn.LIZJ()
            android.content.Context r1 = r0.getApplicationContext()
            boolean r0 = r2 instanceof X.C1494450ozb
            if (r0 == 0) goto L9b
            r0 = 2131832572(0x7f112efc, float:1.9298202E38)
        L8f:
            java.lang.String r1 = r1.getString(r0)
            X.0JCm r0 = X.EnumC488180JCm.FAIL
            r8.LIZ(r0, r1)
        L98:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L9b:
            r0 = 2131832569(0x7f112ef9, float:1.9298196E38)
            goto L8f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1718190uoT.LJIIL(X.19EG, X.0uoh, X.05Vn):java.lang.Object");
    }
}
