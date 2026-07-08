package X;

import Y.AgS285S0100000_4;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.tako.detail.operator.TakoInnerDetailVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CvV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.detail.operator.TakoInnerDetailVM$queryBatchAweme$1$2", f = "TakoInnerDetailVM.kt", l = {42, BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C329270CvV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoInnerDetailVM LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C329270CvV(TakoInnerDetailVM takoInnerDetailVM, String str, InterfaceC1364105Vn<? super C329270CvV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoInnerDetailVM;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C329270CvV(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoInnerDetailVM@c568.queryBatchAweme$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoInnerDetailVM@c568.queryBatchAweme$1$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC329190CvN interfaceC329190CvN = (InterfaceC329190CvN) this.LLILLJJLI.LL.getValue().getOperator();
            String str = this.LLILLL;
            this.LL = 1;
            obj = interfaceC329190CvN.queryBatchAweme(str, 0);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoInnerDetailVM@c568.queryBatchAweme$1$2");
                return objLJFF;
            }
        }
        C2501109r7 c2501109r7 = new C2501109r7(new C329280CvW(this.LLILLJJLI, null), (InterfaceC346201Wa) obj, 0);
        AgS285S0100000_4 agS285S0100000_4 = new AgS285S0100000_4(this.LLILLJJLI, 29);
        this.LL = 2;
        if (c2501109r7.collect(agS285S0100000_4, this) == objLJFF) {
            C1C7U.LIZIZ("TakoInnerDetailVM@c568.queryBatchAweme$1$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoInnerDetailVM@c568.queryBatchAweme$1$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
