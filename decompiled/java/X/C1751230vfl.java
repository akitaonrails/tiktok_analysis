package X;

import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.SellerMessageListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vfl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.messagecenter.SellerMessageListViewModel$onRefresh$2", f = "SellerMessageListViewModel.kt", l = {265, 266}, m = "invokeSuspend")
public final class C1751230vfl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AbstractC316870CbV<C1751300vfs>>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ SellerMessageListViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1751230vfl(SellerMessageListViewModel sellerMessageListViewModel, InterfaceC1364105Vn<? super C1751230vfl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = sellerMessageListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1751230vfl c1751230vfl = new C1751230vfl(this.LLILZ, interfaceC1364105Vn);
        c1751230vfl.LLILLL = obj;
        return c1751230vfl;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1751230vfl.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC316870CbV<C1751300vfs>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
