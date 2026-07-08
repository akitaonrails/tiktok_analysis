package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.trill.feedback.api.CSPPageApi;
import com.ss.android.ugc.trill.feedback.api.FaqResponse;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NMe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.trill.feedback.control.RequestManager$fetchTopicDetailWithEntrance$1", f = "RequestManager.kt", l = {103}, m = "invokeSuspend")
public final class C592620NMe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function1<FaqResponse, Unit> LLILZ;
    public final /* synthetic */ Function1<Throwable, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C592620NMe(String str, Function1<? super FaqResponse, Unit> function1, Function1<? super Throwable, Unit> function12, InterfaceC1364105Vn<? super C592620NMe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = function1;
        this.LLILZIL = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C592620NMe c592620NMe = new C592620NMe(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c592620NMe.LLILLJJLI = obj;
        return c592620NMe;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("RequestManager@5ba.fetchTopicDetailWithEntrance$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                String str = this.LLILLL;
                CSPPageApi.FaqRequestBody.Factory.getClass();
                CSPPageApi.FaqRequestBody faqRequestBodyLIZ = C1689100u3Y.LIZ();
                faqRequestBodyLIZ.setEntrance(str);
                Map<String, String> mapLIZ = C1689120u3a.LIZ(faqRequestBodyLIZ);
                CSPPageApi cSPPageApi = (CSPPageApi) C592650NMh.LIZ.getValue();
                this.LL = 1;
                obj = cSPPageApi.LIZ(mapLIZ, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("RequestManager@5ba.fetchTopicDetailWithEntrance$1");
                    return objLJFF;
                }
            }
            c098200Yq = (FaqResponse) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Function1<FaqResponse, Unit> function1 = this.LLILZ;
        if (C189200o6.m8isSuccessimpl(c098200Yq) && function1 != null) {
            function1.invoke((FaqResponse) c098200Yq);
        }
        Function1<Throwable, Unit> function12 = this.LLILZIL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null && function12 != null) {
            function12.invoke(thM5exceptionOrNullimpl);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RequestManager@5ba.fetchTopicDetailWithEntrance$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
