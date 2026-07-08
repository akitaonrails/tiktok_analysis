package X;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08aQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.portal.PortalLeaf$notifyPortal$4$5", f = "PortalLeaf.kt", l = {}, m = "invokeSuspend")
public final class C2142808aQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ CountDownLatch LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2142808aQ(CountDownLatch countDownLatch, InterfaceC1364105Vn<? super C2142808aQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = countDownLatch;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2142808aQ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PortalLeaf@b89.notifyPortal$4$5");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(this.LL.await(3000L, TimeUnit.MILLISECONDS));
        C1C7U.LIZIZ("PortalLeaf@b89.notifyPortal$4$5");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
