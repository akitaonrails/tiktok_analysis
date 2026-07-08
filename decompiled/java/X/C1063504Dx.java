package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04Dx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1063504Dx extends C09AY implements Function1<SeaPdpMainState, HashMap<String, Object>> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C1063604Dy LLILLL;
    public final /* synthetic */ SeaPdpViewModel LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1063504Dx(boolean z, boolean z2, C1063604Dy c1063604Dy, SeaPdpViewModel seaPdpViewModel, boolean z3) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = c1063604Dy;
        this.LLILZ = seaPdpViewModel;
        this.LLILZIL = z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.HashMap<java.lang.String, java.lang.Object> invoke(com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpMainState r12) {
        /*
            r11 = this;
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpMainState r12 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpMainState) r12
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            boolean r9 = r11.LL
            boolean r0 = r11.LLILLJJLI
            X.04Dy r1 = r11.LLILLL
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel r7 = r11.LLILZ
            boolean r5 = r11.LLILZIL
            if (r9 == 0) goto La3
            java.lang.String r8 = "able_to_buy"
        L15:
            r10 = 0
            if (r0 == 0) goto La0
            X.04Dv r0 = r12.getBottomBarVO()
            if (r0 == 0) goto L9e
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton r0 = r0.LJ
            if (r0 == 0) goto L9e
            java.lang.String r0 = r0.daInfo
        L24:
            java.util.HashMap r4 = X.C1741890vQh.LJIIJ(r0)
            r1.getClass()
            r0 = 795(0x31b, float:1.114E-42)
            kotlin.jvm.internal.AFwS228S0000000_1 r0 = kotlin.jvm.internal.AFwS228S0000000_1.get$arr$(r0)
            java.lang.Object r2 = r1.withState(r7, r0)
            java.util.Map r2 = (java.util.Map) r2
        L37:
            java.lang.String r6 = "button_type"
            if (r4 == 0) goto L3f
            java.lang.Object r10 = r4.get(r6)
        L3f:
            java.lang.String r1 = r7.LLLZZIL
            java.lang.String r0 = "pdp_unique_id"
            r3.put(r0, r1)
            if (r10 == 0) goto L49
            r8 = r10
        L49:
            r3.put(r6, r8)
            java.lang.String r1 = X.C893803eS.LIZ(r9)
            java.lang.String r0 = "is_clickable"
            r3.put(r0, r1)
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem r0 = r7.IR2()
            r6 = 0
            if (r0 == 0) goto L64
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice r0 = r0.price
            if (r0 == 0) goto L64
            java.lang.String r1 = r0.discount
            if (r1 != 0) goto L68
        L64:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
        L68:
            java.lang.String r0 = "discount_percentage"
            r3.put(r0, r1)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r0 = r7.LLJIJIL
            if (r0 == 0) goto L81
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase r0 = r0.baseInfo
            if (r0 == 0) goto L81
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice r0 = r0.priceInfo
            if (r0 == 0) goto L81
            java.lang.Boolean r1 = r0.needIcon
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r6 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
        L81:
            java.lang.String r1 = X.C893803eS.LIZ(r6)
            java.lang.String r0 = "is_buy_with_coupon"
            r3.put(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.String r0 = "if_ellipses_show"
            r3.put(r0, r1)
            if (r2 == 0) goto L98
            r3.putAll(r2)
        L98:
            if (r4 == 0) goto L9d
            r3.putAll(r4)
        L9d:
            return r3
        L9e:
            r0 = r10
            goto L24
        La0:
            r4 = r10
            r2 = r10
            goto L37
        La3:
            java.lang.String r8 = "unable_to_buy"
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1063504Dx.invoke(java.lang.Object):java.lang.Object");
    }
}
