package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05qx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.serviceimpl.IMUserRepo$getLocalUserWithDBAsync$1$2", f = "IMUserRepo.kt", l = {}, m = "invokeSuspend")
public final class C1480905qx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1480505qt LL;
    public final /* synthetic */ IMUser LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1480905qx(InterfaceC1480505qt interfaceC1480505qt, IMUser iMUser, InterfaceC1364105Vn<? super C1480905qx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1480505qt;
        this.LLILLJJLI = iMUser;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1480905qx(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("IMUserRepo@4319.getLocalUserWithDBAsync$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1480505qt interfaceC1480505qt = this.LL;
        if (interfaceC1480505qt != null) {
            interfaceC1480505qt.LIZIZ(this.LLILLJJLI);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("IMUserRepo@4319.getLocalUserWithDBAsync$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
