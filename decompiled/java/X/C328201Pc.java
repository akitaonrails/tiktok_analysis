package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Pc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.business.usercommunication.retry.UserCommunicationRetryManager$retryTriggerUserCommunication$1", f = "UserCommunicationRetryManager.kt", l = {60}, m = "invokeSuspend")
public final class C328201Pc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Function2<Integer, Object, Unit> LLILZ;
    public final /* synthetic */ Object LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C328201Pc(long j, int i, Function2<? super Integer, Object, Unit> function2, Object obj, InterfaceC1364105Vn<? super C328201Pc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = i;
        this.LLILZ = function2;
        this.LLILZIL = obj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C328201Pc(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserCommunicationRetryManager@e1fd.retryTriggerUserCommunication$1");
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
                C1C7U.LIZIZ("UserCommunicationRetryManager@e1fd.retryTriggerUserCommunication$1");
                return objLJFF;
            }
        }
        C1518590pcX.LIZIZ.remove(C2286608xc.LJ(this.LLILLL));
        this.LLILZ.invoke(C2286608xc.LJ(this.LLILLL), this.LLILZIL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UserCommunicationRetryManager@e1fd.retryTriggerUserCommunication$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
