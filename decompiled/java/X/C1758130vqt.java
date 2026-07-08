package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vqt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.sku.PdpSkuCacheManager$putCache$1", f = "PdpSkuCacheManager.kt", l = {}, m = "invokeSuspend")
public final class C1758130vqt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ ProductPackStruct LLILLJJLI;
    public final /* synthetic */ EnumC1756020vnU LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1758130vqt(String str, ProductPackStruct productPackStruct, EnumC1756020vnU enumC1756020vnU, Function0<Unit> function0, InterfaceC1364105Vn<? super C1758130vqt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = productPackStruct;
        this.LLILLL = enumC1756020vnU;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1758130vqt(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "PdpSkuCacheManager@29b8.putCache$1"
            X.C1C7U.LIZ(r5)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r7)
            X.054G r0 = X.C1758140vqu.LIZ
            java.lang.String r4 = r6.LL
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r3 = r6.LLILLJJLI
            X.0vnU r2 = r6.LLILLL
            X.0vnU r0 = X.EnumC1756020vnU.PREFETCH_PART
            if (r2 != r0) goto L34
            kotlin.Pair r0 = X.C1758140vqu.LIZJ(r4)
            if (r0 == 0) goto L32
            java.lang.Object r1 = r0.getSecond()
        L21:
            X.0vnU r0 = X.EnumC1756020vnU.LAST_USED_CACHE
            if (r1 != r0) goto L34
        L25:
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r6.LLILZ
            if (r0 == 0) goto L2c
            r0.invoke()
        L2c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L32:
            r1 = 0
            goto L21
        L34:
            X.0vsK r1 = X.C1758140vqu.LIZIZ()
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r3, r2)
            r1.LIZLLL(r4, r0)
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1758130vqt.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
