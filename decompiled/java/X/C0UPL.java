package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0UPL, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.CreateInfoCache$requestCreateInfoFromTools$1$2$1", f = "CreateInfoCache.kt", l = {}, m = "invokeSuspend")
public final class C0UPL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0UPO LL;
    public final /* synthetic */ Throwable LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UPL(C0UPO c0upo, Throwable th, InterfaceC1364105Vn<? super C0UPL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0upo;
        this.LLILLJJLI = th;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0UPL(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("CreateInfoCache@cc22.requestCreateInfoFromTools$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0UPO c0upo = this.LL;
        if (c0upo != null) {
            Throwable th = this.LLILLJJLI;
            C0UPN c0upn = ((C783970Up9) c0upo).LIZ;
            if (c0upn != null) {
                c0upn.onFailed(th);
            }
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("CreateInfoCache@cc22.requestCreateInfoFromTools$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
