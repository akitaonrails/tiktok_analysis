package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderSnapshotV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D6X, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderRepositoryV2$refresh$2", f = "OrdersV2Repository.kt", l = {38, 46, 113, 116}, m = "invokeSuspend")
public final class C0D6X extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super OrderSnapshotV2>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C0D6E LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D6X(C0D6E c0d6e, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = c0d6e;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0D6X c0d6x = new C0D6X(this.LLILZ, this.LLILLL, interfaceC1364105Vn);
        c0d6x.LLILLJJLI = obj;
        return c0d6x;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0189  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D6X.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super OrderSnapshotV2> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
