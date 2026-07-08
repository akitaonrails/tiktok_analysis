package X;

import com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.viewmodel.SeriesPanelSquareViewModel;
import com.ss.android.ugc.aweme.model.PaidCollectionPanelResponse;
import com.ss.android.ugc.aweme.model.PaidCollectionRecommendResponse;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mpR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.viewmodel.SeriesPanelSquareViewModel$fetchBothData$2", f = "SeriesPanelSquareViewModel.kt", l = {283, 283}, m = "invokeSuspend")
public final class C1411270mpR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends PaidCollectionPanelResponse, ? extends PaidCollectionRecommendResponse>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SeriesPanelSquareViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1411270mpR(SeriesPanelSquareViewModel seriesPanelSquareViewModel, InterfaceC1364105Vn<? super C1411270mpR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = seriesPanelSquareViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1411270mpR c1411270mpR = new C1411270mpR(this.LLILLL, interfaceC1364105Vn);
        c1411270mpR.LLILLJJLI = obj;
        return c1411270mpR;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0957 anonymousClass0957LIZIZ;
        Object obj2;
        C1C7U.LIZ("SeriesPanelSquareViewModel@be88.fetchBothData$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    obj2 = this.LLILLJJLI;
                    C155000ia.LIZIZ(obj);
                    Pair pair = new Pair(obj2, obj);
                    C1C7U.LIZIZ("SeriesPanelSquareViewModel@be88.fetchBothData$2");
                    return pair;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            anonymousClass0957LIZIZ = (AnonymousClass0957) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C099G c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1411290mpT(this.LLILLL, null), 3);
            anonymousClass0957LIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1411280mpS(this.LLILLL, null), 3);
            this.LLILLJJLI = anonymousClass0957LIZIZ;
            this.LL = 1;
            obj = c099gLIZIZ.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SeriesPanelSquareViewModel@be88.fetchBothData$2");
                return objLJFF;
            }
        }
        this.LLILLJJLI = obj;
        this.LL = 2;
        Object objLJLIIIL = anonymousClass0957LIZIZ.LJLIIIL(this);
        if (objLJLIIIL == objLJFF) {
            C1C7U.LIZIZ("SeriesPanelSquareViewModel@be88.fetchBothData$2");
            return objLJFF;
        }
        obj2 = obj;
        obj = objLJLIIIL;
        Pair pair2 = new Pair(obj2, obj);
        C1C7U.LIZIZ("SeriesPanelSquareViewModel@be88.fetchBothData$2");
        return pair2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends PaidCollectionPanelResponse, ? extends PaidCollectionRecommendResponse>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
