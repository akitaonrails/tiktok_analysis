package X;

import com.ss.android.ugc.aweme.verify.BaseVerifyFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08qM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.verify.BaseVerifyFragment$onViewCreated$1$1$1", f = "BaseVerifyFragment.kt", l = {150}, m = "invokeSuspend")
public final class C2241608qM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BaseVerifyFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2241608qM(BaseVerifyFragment baseVerifyFragment, InterfaceC1364105Vn<? super C2241608qM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = baseVerifyFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2241608qM(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseVerifyFragment@4f77.onViewCreated$1$1$1");
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
            C1713570uh1 c1713570uh1SR = this.LLILLJJLI.SR();
            if (c1713570uh1SR != null) {
                String eventName = EnumC2242008qQ.PAGE_RENDERED.getEventName();
                this.LL = 1;
                if (c1713570uh1SR.LJIILIIL(eventName, null, this) == objLJFF) {
                    C1C7U.LIZIZ("BaseVerifyFragment@4f77.onViewCreated$1$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseVerifyFragment@4f77.onViewCreated$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
