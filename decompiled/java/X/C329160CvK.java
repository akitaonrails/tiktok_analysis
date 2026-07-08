package X;

import com.ss.android.ugc.aweme.tako.detail.operator.BatchDetailList;
import com.ss.android.ugc.aweme.tako.detail.operator.TakoInnerApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CvK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.detail.operator.TakoInnerDetailRepository$operator$1$requestInnerFlow$2", f = "TakoInnerDetailRepository.kt", l = {42, 52}, m = "invokeSuspend")
public final class C329160CvK extends C09AX implements Function2<InterfaceC346701Wf<? super BatchDetailList>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C329170CvL LLILLL;
    public final /* synthetic */ C329180CvM LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C329160CvK(C329170CvL c329170CvL, C329180CvM c329180CvM, InterfaceC1364105Vn<? super C329160CvK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c329170CvL;
        this.LLILZ = c329180CvM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C329160CvK c329160CvK = new C329160CvK(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c329160CvK.LLILLJJLI = obj;
        return c329160CvK;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346701Wf interfaceC346701Wf;
        C1C7U.LIZ("TakoInnerDetailRepository@d882.operator$1$requestInnerFlow$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoInnerDetailRepository@d882.operator$1$requestInnerFlow$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            TakoInnerApi takoInnerApi = (TakoInnerApi) this.LLILLL.LL.getValue();
            C329180CvM c329180CvM = this.LLILZ;
            String str = c329180CvM.LIZ;
            String str2 = c329180CvM.LIZIZ;
            String str3 = c329180CvM.LIZJ;
            String str4 = c329180CvM.LIZLLL;
            String str5 = c329180CvM.LJ;
            String str6 = c329180CvM.LJFF;
            String str7 = c329180CvM.LJI;
            this.LLILLJJLI = interfaceC346701Wf;
            this.LL = 1;
            obj = takoInnerApi.innerFlow(str, str2, str3, str4, str5, str6, str7, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoInnerDetailRepository@d882.operator$1$requestInnerFlow$2");
                return objLJFF;
            }
        }
        this.LLILLJJLI = null;
        this.LL = 2;
        if (interfaceC346701Wf.emit(obj, this) == objLJFF) {
            C1C7U.LIZIZ("TakoInnerDetailRepository@d882.operator$1$requestInnerFlow$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoInnerDetailRepository@d882.operator$1$requestInnerFlow$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super BatchDetailList> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
