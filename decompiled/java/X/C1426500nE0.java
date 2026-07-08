package X;

import com.ss.android.ugc.aweme.editeffect.search.middleware.result.EffectSearchResultResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0nE0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.editeffect.search.middleware.result.EffectSearchResultComponent$loadMoreData$2", f = "EffectSearchResultComponent.kt", l = {214}, m = "invokeSuspend")
public final class C1426500nE0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1426520nE2 LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1426500nE0(C1426520nE2 c1426520nE2, int i, InterfaceC1364105Vn<? super C1426500nE0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1426520nE2;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1426500nE0(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EffectSearchResultResponse effectSearchResultResponse;
        C1427010nEp c1427010nEpGW0;
        C1C7U.LIZ("EffectSearchResultComponent@1aa.loadMoreData$2");
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
            InterfaceC1426440nDu interfaceC1426440nDuO4 = this.LLILLJJLI.O4();
            if (interfaceC1426440nDuO4 != null && (c1427010nEpGW0 = interfaceC1426440nDuO4.GW0()) != null) {
                String str = this.LLILLJJLI.T2().LJIIIZ;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                int i2 = this.LLILLL;
                String str3 = this.LLILLJJLI.T2().LJIIJ;
                if (str3 != null) {
                    str2 = str3;
                }
                String str4 = this.LLILLJJLI.T2().LJIIIIZZ;
                this.LL = 1;
                obj = c1427010nEpGW0.LIZ(i2, 36, str, str2, str4, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("EffectSearchResultComponent@1aa.loadMoreData$2");
                    return objLJFF;
                }
            } else {
                effectSearchResultResponse = null;
                this.LLILLJJLI.t5(effectSearchResultResponse, true);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("EffectSearchResultComponent@1aa.loadMoreData$2");
                return unit;
            }
        }
        effectSearchResultResponse = (EffectSearchResultResponse) obj;
        this.LLILLJJLI.t5(effectSearchResultResponse, true);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EffectSearchResultComponent@1aa.loadMoreData$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
