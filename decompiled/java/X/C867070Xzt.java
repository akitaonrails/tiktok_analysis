package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xzt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.updatemember.UpdateMemberUseCase$callbackResult$2", f = "UpdateMemberUseCase.kt", l = {}, m = "invokeSuspend")
public final class C867070Xzt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C867080Xzu LL;
    public final /* synthetic */ InterfaceC867020Xzo<C0YAE> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C867070Xzt(C867080Xzu c867080Xzu, InterfaceC867020Xzo<C0YAE> interfaceC867020Xzo, InterfaceC1364105Vn<? super C867070Xzt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c867080Xzu;
        this.LLILLJJLI = interfaceC867020Xzo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C867070Xzt(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UpdateMemberUseCase@2628.callbackResult$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C867080Xzu c867080Xzu = this.LL;
        C0YAE c0yae = c867080Xzu.LIZ;
        if (c0yae != null) {
            this.LLILLJJLI.LIZ(new C868810Y6l<>(c0yae, c867080Xzu.LIZIZ, c867080Xzu.LIZJ.LIZ()));
        } else {
            C0YMW c0ymw = c867080Xzu.LIZIZ;
            if (c0ymw != null) {
                this.LLILLJJLI.LIZIZ(new C0Y00(c0ymw, c867080Xzu.LIZJ.LIZ()));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UpdateMemberUseCase@2628.callbackResult$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
