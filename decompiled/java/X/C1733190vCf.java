package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vCf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.billboard.SeaLiveBillboardContentView$handelBillboard$1", f = "SeaLiveBillboardContentView.kt", l = {}, m = "invokeSuspend")
public final class C1733190vCf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1733170vCd LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1733200vCg LLILLL;
    public final /* synthetic */ InterfaceC1732650vBn LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1733190vCf(C1733170vCd c1733170vCd, String str, C1733200vCg c1733200vCg, InterfaceC1732650vBn interfaceC1732650vBn, InterfaceC1364105Vn<? super C1733190vCf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1733170vCd;
        this.LLILLJJLI = str;
        this.LLILLL = c1733200vCg;
        this.LLILZ = interfaceC1732650vBn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1733190vCf(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "SeaLiveBillboardContentView@7802.handelBillboard$1"
            X.C1C7U.LIZ(r10)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r12)
            X.0vCd r6 = r11.LL
            X.0vuU r0 = r6.LLIZ
            r2 = 1
            if (r0 == 0) goto L96
            r9 = 1
        L13:
            java.lang.String r8 = r11.LLILLJJLI
            X.0vCg r7 = r11.LLILLL
            X.0vBn r5 = r11.LLILZ
            if (r0 == 0) goto L45
            android.view.View r0 = r0.getView()
            r6.LIZ(r0)
            X.0vuU r3 = r6.LLIZ
            if (r3 == 0) goto L3f
        L26:
            X.0vCd r0 = r11.LL
            java.lang.String r4 = r11.LLILLJJLI
            X.0vCg r2 = r11.LLILLL
            X.0vBn r1 = r11.LLILZ
            if (r9 == 0) goto L3f
            boolean r0 = r0.LLILZ
            if (r0 == 0) goto L3f
            r3.LIZJ(r4)
            X.C1733170vCd.LJ(r2)
            if (r1 == 0) goto L3f
            r1.onSuccess()
        L3f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        L45:
            X.01GW r0 = X.C2504809ri.LIZ
            java.lang.Object r4 = r0.getValue()
            java.lang.String r4 = (java.lang.String) r4
            int r0 = r4.length()
            if (r0 == 0) goto L54
            r2 = 0
        L54:
            r1 = 0
            if (r2 == 0) goto L62
            java.lang.String r0 = "schema is null or empty"
            X.C1733170vCd.LJFF(r7, r0)
            if (r5 == 0) goto L3f
            r5.LIZ(r0)
            goto L3f
        L62:
            X.0vuU r3 = new X.0vuU
            com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.ISeaLiveContextAbility r0 = r6.LLJI
            if (r0 == 0) goto L6c
            X.0Nf6 r1 = r0.MF()
        L6c:
            r3.<init>(r1)
            X.0qjb r2 = new X.0qjb
            java.lang.String r0 = "sea_billboard_template"
            r2.<init>(r0)
            com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.ISeaLiveContextAbility r1 = r6.LLJI
            java.util.Map r0 = X.C2097608Jq.LJ()
            X.0vds r2 = X.C1733370vCx.LIZ(r4, r8, r2, r1, r0)
            X.0vCi r1 = new X.0vCi
            r1.<init>()
            android.content.Context r0 = r6.getContext()
            android.view.View r0 = r3.LIZIZ(r0, r2, r1)
            r6.LIZ(r0)
            r3.load()
            r6.LLIZ = r3
            goto L26
        L96:
            r9 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1733190vCf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
