package X;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NRG, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "androidx.core.telecom.internal.CallSession$onEvent$1", f = "CallSession.kt", l = {333}, m = "invokeSuspend")
public final class C0NRG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1302520k02 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Bundle LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NRG(C1302520k02 c1302520k02, String str, Bundle bundle, InterfaceC1364105Vn<? super C0NRG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1302520k02;
        this.LLILLL = str;
        this.LLILZ = bundle;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NRG(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
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
            InterfaceC1631620sYq<String, Bundle, InterfaceC1364105Vn<? super Unit>, Object> interfaceC1631620sYq = this.LLILLJJLI.LLJ;
            String str = this.LLILLL;
            Bundle bundle = this.LLILZ;
            this.LL = 1;
            if (interfaceC1631620sYq.invoke(str, bundle, this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
