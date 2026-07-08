package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderSnapshotV2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D6W, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderRepositoryV2$loadMore$2", f = "OrdersV2Repository.kt", l = {152, 159}, m = "invokeSuspend")
public final class C0D6W extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C333720D6k>, Object> {
    public OrderSnapshotV2 LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ C0D6E LLILZIL;
    public final /* synthetic */ OrderSnapshotV2 LLILZLL;
    public final /* synthetic */ List<LocalOrderWrapper> LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D6W(long j, C0D6E c0d6e, OrderSnapshotV2 orderSnapshotV2, List<LocalOrderWrapper> list, String str, InterfaceC1364105Vn<? super C0D6W> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = j;
        this.LLILZIL = c0d6e;
        this.LLILZLL = orderSnapshotV2;
        this.LLIZ = list;
        this.LLIZLLLIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0D6W(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c A[LOOP:0: B:11:0x0046->B:13:0x004c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a7 A[LOOP:3: B:67:0x01a1->B:69:0x01a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable, java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D6W.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C333720D6k> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
