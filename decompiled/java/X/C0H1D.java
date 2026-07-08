package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleV3VH;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H1D, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleV3VH$bindImageBackground$1$1", f = "USSESSellerModuleV3VH.kt", l = {1376}, m = "invokeSuspend")
public final class C0H1D extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Image LLILLJJLI;
    public final /* synthetic */ USSESSellerModuleV3VH LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H1D(Image image, USSESSellerModuleV3VH uSSESSellerModuleV3VH, InterfaceC1364105Vn<? super C0H1D> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = image;
        this.LLILLL = uSSESSellerModuleV3VH;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H1D(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6 A[PHI: r1
      0x00a6: PHI (r1v7 android.view.View) = (r1v6 android.view.View), (r1v15 android.view.View) binds: [B:20:0x0095, B:25:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf A[PHI: r2
      0x00bf: PHI (r2v7 android.view.View) = (r2v9 android.view.View), (r2v8 android.view.View) binds: [B:28:0x00ad, B:33:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0H1D.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
