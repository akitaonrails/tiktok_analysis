package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS239S0300000_30;
import kotlin.jvm.internal.AwS274S0300000_30;
import njp.a;

/* JADX INFO: renamed from: X.13er, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", l = {221}, m = "invokeSuspend")
public final class C20063513er extends C09AX implements Function2<C112R, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1677660tl6 LLILLL;
    public final /* synthetic */ C20063313ep LLILZ;
    public final /* synthetic */ InterfaceC20063613es LLILZIL;
    public final /* synthetic */ C09AE LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20063513er(C1677660tl6 c1677660tl6, C20063313ep c20063313ep, InterfaceC20063613es interfaceC20063613es, C09AE c09ae, InterfaceC1364105Vn<? super C20063513er> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1677660tl6;
        this.LLILZ = c20063313ep;
        this.LLILZIL = interfaceC20063613es;
        this.LLILZLL = c09ae;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C20063513er c20063513er = new C20063513er(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c20063513er.LLILLJJLI = obj;
        return c20063513er;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C112R c112r = (C112R) this.LLILLJJLI;
            this.LLILLL.LJ = C20063313ep.LLJJ(this.LLILZ, this.LLILZIL);
            C1677660tl6 c1677660tl6 = this.LLILLL;
            AwS239S0300000_30 awS239S0300000_30 = new AwS239S0300000_30(this.LLILZ, this.LLILZLL, c112r, 10);
            AwS274S0300000_30 awS274S0300000_30 = new AwS274S0300000_30(this.LLILZ, this.LLILLL, this.LLILZIL, 11);
            this.LL = 1;
            if (c1677660tl6.LIZ(this, awS274S0300000_30, awS239S0300000_30) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C112R c112r, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c112r, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
