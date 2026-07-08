package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05eT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.livesdk.game.broadcast.stream.quality.preschedule.GamePreScheduleRequest$requestAsync$2", f = "GamePreScheduleRequest.kt", l = {}, m = "invokeSuspend")
public final class C1403505eT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AnonymousClass0957<? extends C783680Uog>>, Object> {
    public /* synthetic */ Object LL;

    public C1403505eT(InterfaceC1364105Vn<? super C1403505eT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1403505eT c1403505eT = new C1403505eT(interfaceC1364105Vn);
        c1403505eT.LL = obj;
        return c1403505eT;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GamePreScheduleRequest@966d.requestAsync$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C099G c099gLIZIZ = C23250099c.LIZIZ((InterfaceC497601wk) this.LL, null, null, new C328010CtT(null), 3);
        C1C7U.LIZIZ("GamePreScheduleRequest@966d.requestAsync$2");
        return c099gLIZIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AnonymousClass0957<? extends C783680Uog>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
