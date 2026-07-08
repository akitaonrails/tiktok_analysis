package X;

import com.ss.android.ugc.aweme.setting.AccountAttributesApi;
import com.ss.android.ugc.aweme.setting.AccountAttributesApiResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08ju, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.setting.AccountAttributesApi$getAccountAttributesWithCallback$1", f = "AccountAttributesApi.kt", l = {29}, m = "invokeSuspend")
public final class C2201608ju extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Function1 LL;
    public int LLILLJJLI;
    public final /* synthetic */ Function1<AccountAttributesApiResponse, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2201608ju(Function1<? super AccountAttributesApiResponse, Unit> function1, InterfaceC1364105Vn<? super C2201608ju> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2201608ju(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        C1C7U.LIZ("AccountAttributesApi@8708.getAccountAttributesWithCallback$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                function1 = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            function1 = this.LLILLL;
            AccountAttributesApi accountAttributesApi = AccountAttributesApi.LIZ;
            this.LL = function1;
            this.LLILLJJLI = 1;
            obj = accountAttributesApi.LIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AccountAttributesApi@8708.getAccountAttributesWithCallback$1");
                return objLJFF;
            }
        }
        function1.invoke(obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AccountAttributesApi@8708.getAccountAttributesWithCallback$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
