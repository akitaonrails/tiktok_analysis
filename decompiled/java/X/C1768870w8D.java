package X;

import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0w8D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2$handleShopTabClick$1", f = "CustomDotVMV2.kt", l = {373}, m = "invokeSuspend")
public final class C1768870w8D extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1769030w8T LL;
    public int LLILLJJLI;
    public final /* synthetic */ CustomDotVMV2 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1768870w8D(CustomDotVMV2 customDotVMV2, InterfaceC1364105Vn<? super C1768870w8D> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = customDotVMV2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1768870w8D(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007e A[PHI: r1
      0x007e: PHI (r1v9 X.0w8E) = (r1v6 X.0w8E), (r1v5 X.0w8E), (r1v4 X.0w8E) binds: [B:51:0x00e0, B:46:0x00cb, B:26:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1768870w8D.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
