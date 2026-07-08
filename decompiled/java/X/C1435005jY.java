package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05jY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.serviceimpl.IMUserRepo$notifyUpdate$4", f = "IMUserRepo.kt", l = {}, m = "invokeSuspend")
public final class C1435005jY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super IEvent>, Object> {
    public final /* synthetic */ IMUser LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1435005jY(IMUser iMUser, InterfaceC1364105Vn<? super C1435005jY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = iMUser;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1435005jY(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMUserRepo@4319.notifyUpdate$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1434905jX c1434905jX = new C1434905jX(this.LL, this.LL.getUid(), this.LL.getSecUid());
        C1440005kM.LIZ(c1434905jX);
        C1C7U.LIZIZ("IMUserRepo@4319.notifyUpdate$4");
        return c1434905jX;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super IEvent> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
