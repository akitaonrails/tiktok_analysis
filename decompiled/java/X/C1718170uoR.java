package X;

import com.ss.android.ugc.aweme.biz.wallet.biz.commonpage.WalletCommonStepFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0uoR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1718170uoR extends AbstractC1718270uob {
    public final String LJ;
    public final Function0<String> LJFF;

    @Override // X.InterfaceC1717200ums
    public final String LJI() {
        return "CREATE_MOBILE";
    }

    public C1718170uoR(String str, Function0 function0) {
        this.LJ = str;
        this.LJFF = function0;
    }

    @Override // X.InterfaceC1717200ums
    public final void LJII(C19EG c19eg, final C1717190umr c1717190umr, final String str) {
        String str2 = WalletCommonStepFragment._pnsPageId;
        C1222080huI.LIZ(c19eg, "CREATE_MOBILE", this.LJ, new InterfaceC1221990hu9() { // from class: X.0uoe
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
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    @Override // X.AbstractC1718270uob
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(X.C19EG r9, X.InterfaceC1718330uoh r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C1718230uoX
            if (r0 == 0) goto L24
            r6 = r11
            X.0uoX r6 = (X.C1718230uoX) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r2 = r6.LLILLJJLI
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            java.lang.String r4 = ""
            r5 = 1
            if (r0 == 0) goto L32
            if (r0 != r5) goto L2a
            X.0uoh r10 = r6.LL
            goto L6e
        L24:
            X.0uoX r6 = new X.0uoX
            r6.<init>(r8, r11)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r2)
            X.0uoI r0 = new X.0uoI     // Catch: java.lang.Exception -> L9d
            r0.<init>()     // Catch: java.lang.Exception -> L9d
            X.0uoH r1 = r0.LL     // Catch: java.lang.Exception -> L9d
            java.lang.String r3 = r8.LJ     // Catch: java.lang.Exception -> L9d
            X.0uoL r0 = X.C1718110uoL.LIZ     // Catch: java.lang.Exception -> L9d
            r0.getClass()     // Catch: java.lang.Exception -> L9d
            java.lang.String r2 = X.C1718110uoL.LIZ(r3)     // Catch: java.lang.Exception -> L9d
            r6.LL = r10     // Catch: java.lang.Exception -> L9d
            r6.LLILZ = r5     // Catch: java.lang.Exception -> L9d
            r1.getClass()     // Catch: java.lang.Exception -> L9d
            X.0unU r1 = com.ss.android.ugc.aweme.foundation.network.PipoAccountApi.LIZ     // Catch: java.lang.Exception -> L9d
            X.0ulp r0 = X.C1716550ulp.LIZ     // Catch: java.lang.Exception -> L9d
            r0.getClass()     // Catch: java.lang.Exception -> L9d
            java.lang.String r0 = X.C1716550ulp.LIZJ(r3)     // Catch: java.lang.Exception -> L9d
            r1.getClass()     // Catch: java.lang.Exception -> L9d
            com.ss.android.ugc.aweme.foundation.network.PipoAccountApi r1 = X.C1717580unU.LIZ(r0)     // Catch: java.lang.Exception -> L9d
            java.lang.String r0 = X.C1716550ulp.LJ(r3)     // Catch: java.lang.Exception -> L9d
            if (r0 != 0) goto L67
            r0 = r4
        L67:
            java.lang.Object r2 = r1.createMobile(r0, r2, r6)     // Catch: java.lang.Exception -> L9d
            if (r2 != r7) goto L71
            return r7
        L6e:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L9d
        L71:
            X.0X52 r2 = (X.C0X52) r2     // Catch: java.lang.Exception -> L9d
            T r1 = r2.LIZIZ     // Catch: java.lang.Exception -> L9d
            com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse r1 = (com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse) r1     // Catch: java.lang.Exception -> L9d
            boolean r0 = r2.LIZJ()     // Catch: java.lang.Exception -> L9d
            if (r0 == 0) goto L89
            boolean r0 = r1.LIZ()     // Catch: java.lang.Exception -> L9d
            if (r0 == 0) goto L89
            X.0JCm r0 = X.EnumC488180JCm.SUCCESS     // Catch: java.lang.Exception -> L9d
            r10.LIZ(r0, r4)     // Catch: java.lang.Exception -> L9d
            goto Lb9
        L89:
            boolean r0 = r2.LIZJ()     // Catch: java.lang.Exception -> L9d
            if (r0 == 0) goto L9b
            T r0 = r2.LIZIZ     // Catch: java.lang.Exception -> L9d
            com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse r0 = (com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse) r0     // Catch: java.lang.Exception -> L9d
            java.lang.String r1 = r0.errorContent     // Catch: java.lang.Exception -> L9d
        L95:
            X.0JCm r0 = X.EnumC488180JCm.FAIL     // Catch: java.lang.Exception -> L9d
            r10.LIZ(r0, r1)     // Catch: java.lang.Exception -> L9d
            goto Lb9
        L9b:
            r1 = 0
            goto L95
        L9d:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.0uus r0 = X.C1717770unn.LIZJ()
            android.content.Context r1 = r0.getApplicationContext()
            boolean r0 = r2 instanceof X.C1494450ozb
            if (r0 == 0) goto Lbc
            r0 = 2131832572(0x7f112efc, float:1.9298202E38)
        Lb0:
            java.lang.String r1 = r1.getString(r0)
            X.0JCm r0 = X.EnumC488180JCm.FAIL
            r10.LIZ(r0, r1)
        Lb9:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Lbc:
            r0 = 2131832569(0x7f112ef9, float:1.9298196E38)
            goto Lb0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1718170uoR.LJIIL(X.19EG, X.0uoh, X.05Vn):java.lang.Object");
    }
}
