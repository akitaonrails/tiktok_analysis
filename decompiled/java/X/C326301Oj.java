package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.interest.network.InterestNetworkApi;
import com.ss.android.ugc.aweme.service.interest.model.InterestTag;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Oj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.interest.network.InterestNetworkUtils$postIsTagsUpdateAsync$2", f = "InterestNetworkApi.kt", l = {61}, m = "invokeSuspend")
public final class C326301Oj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<InterestTag> LLILLJJLI;
    public final /* synthetic */ Function1<Boolean, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C326301Oj(List list, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C326301Oj(this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InterestNetworkUtils@1823.postIsTagsUpdateAsync$2");
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
                C358501aJ.LIZ.getClass();
                InterestNetworkApi interestNetworkApi = C358501aJ.LIZIZ;
                String strLIZ = C1722110uun.LIZ(this.LLILLJJLI);
                this.LL = 1;
                obj = interestNetworkApi.postLatestInterestTags(strLIZ, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("InterestNetworkUtils@1823.postIsTagsUpdateAsync$2");
                    return objLJFF;
                }
            }
            C2487409ou.LIZJ(new RunnableC514501zT(this.LLILLL, (BaseResponse) obj, 35));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Function1<Boolean, Unit> function1 = this.LLILLL;
            if (function1 != null) {
                function1.invoke(false);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InterestNetworkUtils@1823.postIsTagsUpdateAsync$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
