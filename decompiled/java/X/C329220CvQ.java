package X;

import com.ss.android.ugc.aweme.tako.aivideo.detail.page.TakoAiVideoDetailPageFragment;
import com.ss.android.ugc.aweme.tako.detail.operator.BatchDetailList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CvQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.page.TakoAiVideoDetailPageFragment$handlePushFeedsInsertData$1", f = "TakoAiVideoDetailPageFragment.kt", l = {981, 983}, m = "invokeSuspend")
public final class C329220CvQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ TakoAiVideoDetailPageFragment LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C329220CvQ(List<String> list, TakoAiVideoDetailPageFragment takoAiVideoDetailPageFragment, int i, InterfaceC1364105Vn<? super C329220CvQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = takoAiVideoDetailPageFragment;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C329220CvQ(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List list;
        C1C7U.LIZ("TakoAiVideoDetailPageFragment@9183.handlePushFeedsInsertData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoAiVideoDetailPageFragment@9183.handlePushFeedsInsertData$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            String string = this.LLILLJJLI.toString();
            C329200CvO c329200CvO = this.LLILLL.LLJJIJIIJIL;
            this.LL = 1;
            obj = c329200CvO.LIZ(string, 0, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoAiVideoDetailPageFragment@9183.handlePushFeedsInsertData$1");
                return objLJFF;
            }
        }
        BatchDetailList batchDetailList = (BatchDetailList) obj;
        if (batchDetailList == null || (list = batchDetailList.items) == null) {
            list = C13BV.INSTANCE;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1222780hvQ c1222780hvQ = new C1222780hvQ(list, this.LLILLL, this.LLILZ, this.LLILLJJLI, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1222780hvQ) == objLJFF) {
            C1C7U.LIZIZ("TakoAiVideoDetailPageFragment@9183.handlePushFeedsInsertData$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoAiVideoDetailPageFragment@9183.handlePushFeedsInsertData$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
