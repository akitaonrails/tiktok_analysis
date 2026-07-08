package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05qs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.serviceimpl.IMUserRepo$fetchUser$2$user$3", f = "IMUserRepo.kt", l = {}, m = "invokeSuspend")
public final class C1480405qs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1480505qt LL;
    public final /* synthetic */ Exception LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1480405qs(InterfaceC1480505qt interfaceC1480505qt, Exception exc, InterfaceC1364105Vn<? super C1480405qs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1480505qt;
        this.LLILLJJLI = exc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1480405qs(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("IMUserRepo@4319.fetchUser$2$user$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1480505qt interfaceC1480505qt = this.LL;
        if (interfaceC1480505qt != null) {
            interfaceC1480505qt.LIZ(this.LLILLJJLI);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("IMUserRepo@4319.fetchUser$2$user$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
