package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xzp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.addmember.AddMembersUseCase$callbackResult$2", f = "AddMembersUseCase.kt", l = {}, m = "invokeSuspend")
public final class C867030Xzp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C867040Xzq LL;
    public final /* synthetic */ InterfaceC867020Xzo<List<C0YAE>> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C867030Xzp(C867040Xzq c867040Xzq, InterfaceC867020Xzo<List<C0YAE>> interfaceC867020Xzo, InterfaceC1364105Vn<? super C867030Xzp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c867040Xzq;
        this.LLILLJJLI = interfaceC867020Xzo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C867030Xzp(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddMembersUseCase@665e.callbackResult$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C867040Xzq c867040Xzq = this.LL;
        List<C0YAE> list = c867040Xzq.LIZ;
        if (list != null) {
            this.LLILLJJLI.LIZ(new C868810Y6l<>(list, c867040Xzq.LIZIZ, c867040Xzq.LIZJ.LIZ()));
        } else {
            C0YMW c0ymw = c867040Xzq.LIZIZ;
            if (c0ymw != null) {
                this.LLILLJJLI.LIZIZ(new C0Y00(c0ymw, c867040Xzq.LIZJ.LIZ()));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddMembersUseCase@665e.callbackResult$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
