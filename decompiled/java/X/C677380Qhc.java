package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Qhc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.page.mix.container.capability.MixNetworkAbility$streamResultHandler$1$1$2", f = "MixNetworkAbility.kt", l = {}, m = "invokeSuspend")
public final class C677380Qhc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C677390Qhd LL;
    public final /* synthetic */ Throwable LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C677380Qhc(C677390Qhd c677390Qhd, Throwable th, InterfaceC1364105Vn<? super C677380Qhc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c677390Qhd;
        this.LLILLJJLI = th;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C677380Qhc(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC675320QeI interfaceC675320QeI;
        C1C7U.LIZ("MixNetworkAbility@fff1.streamResultHandler$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C676510QgD c676510QgD = this.LL.LL;
        Unit unit = null;
        if (c676510QgD != null && (interfaceC675320QeI = c676510QgD.LIZ) != null) {
            interfaceC675320QeI.LIZ(null, this.LLILLJJLI);
            unit = Unit.LIZ;
        }
        C1C7U.LIZIZ("MixNetworkAbility@fff1.streamResultHandler$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
