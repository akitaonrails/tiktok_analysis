package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05LL, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.analytics.IMB2CAnalytics$getExtraB2CUserAccountTags$2", f = "IMB2CAnalytics.kt", l = {129, 132}, m = "invokeSuspend")
public final class C05LL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05LL(long j, InterfaceC1364105Vn<? super C05LL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05LL(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "IMB2CAnalytics@8870.getExtraB2CUserAccountTags$2"
            X.C1C7U.LIZ(r7)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r8.LL
            r3 = 2
            r6 = 1
            java.lang.String r5 = ""
            if (r0 == 0) goto L2b
            if (r0 == r6) goto L4e
            if (r0 != r3) goto L8d
            X.C155000ia.LIZIZ(r9)
        L18:
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo r9 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo) r9
            if (r9 == 0) goto L89
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo r0 = r9.getUserB2CAccountInfo()
            if (r0 == 0) goto L27
            java.lang.String r0 = r0.userTags
            if (r0 == 0) goto L27
            r5 = r0
        L27:
            X.C1C7U.LIZIZ(r7)
            return r5
        L2b:
            X.C155000ia.LIZIZ(r9)
            X.069P r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()
            X.1BGS r2 = r0.LJ()
            long r0 = r8.LLILLJJLI
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r8.LL = r6
            r0 = 0
            java.lang.Object r9 = r2.LJIJ(r1, r0, r8)
            if (r9 != r4) goto L51
            X.C1C7U.LIZIZ(r7)
            return r4
        L4e:
            X.C155000ia.LIZIZ(r9)
        L51:
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r9 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) r9
            if (r9 == 0) goto L6a
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo r0 = r9.getImUserBizInfo()
            if (r0 == 0) goto L66
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo r0 = r0.getUserB2CAccountInfo()
            if (r0 == 0) goto L66
            java.lang.String r0 = r0.userTags
            if (r0 == 0) goto L66
            r5 = r0
        L66:
            X.C1C7U.LIZIZ(r7)
            return r5
        L6a:
            X.069P r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()
            X.06pF r2 = r0.LIZ()
            long r0 = r8.LLILLJJLI
            java.lang.Long r0 = X.C2286608xc.LJFF(r0)
            r8.LL = r3
            java.lang.Object r9 = r2.LJIILIIL(r0, r8)
            if (r9 != r4) goto L18
            X.C1C7U.LIZIZ(r7)
            return r4
        L89:
            X.C1C7U.LIZIZ(r7)
            return r5
        L8d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05LL.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
