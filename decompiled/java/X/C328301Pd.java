package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Pd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.business.usercommunication.retry.UserCommunicationRetryManager$cacheShowResponse$1", f = "UserCommunicationRetryManager.kt", l = {89}, m = "invokeSuspend")
public final class C328301Pd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ Function1<C1518310pc5, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C328301Pd(long j, Function1<? super C1518310pc5, Unit> function1, InterfaceC1364105Vn<? super C328301Pd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C328301Pd(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserCommunicationRetryManager@e1fd.cacheShowResponse$1");
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
            long j = this.LLILLJJLI * 1000;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("UserCommunicationRetryManager@e1fd.cacheShowResponse$1");
                return objLJFF;
            }
        }
        C1518310pc5 c1518310pc5 = C1518590pcX.LIZJ;
        if (c1518310pc5 != null) {
            Function1<C1518310pc5, Unit> function1 = this.LLILLL;
            C1518590pcX.LIZJ = null;
            function1.invoke(c1518310pc5);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UserCommunicationRetryManager@e1fd.cacheShowResponse$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
