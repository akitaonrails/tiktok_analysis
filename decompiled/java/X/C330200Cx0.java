package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerListViewModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cx0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerListViewModel$refreshFromCache$1", f = "InfoStickerListViewModel.kt", l = {147}, m = "invokeSuspend")
public final class C330200Cx0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InfoStickerListViewModel LLILLJJLI;
    public final /* synthetic */ C1638730skJ<EffectCategoryResponse, Effect> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C330200Cx0(InfoStickerListViewModel infoStickerListViewModel, C1638730skJ<EffectCategoryResponse, Effect> c1638730skJ, InterfaceC1364105Vn<? super C330200Cx0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = infoStickerListViewModel;
        this.LLILLL = c1638730skJ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C330200Cx0(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        List list;
        C1C7U.LIZ("InfoStickerListViewModel@dce1.refreshFromCache$1");
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
            List<Pair<EffectCategoryResponse, List<Effect>>> listZQ2 = this.LLILLJJLI.zQ2(this.LLILLL);
            this.LLILLJJLI.LLJILJIL.postValue(listZQ2);
            InfoStickerListViewModel infoStickerListViewModel = this.LLILLJJLI;
            List<Effect> list2 = this.LLILLL.LIZ;
            Pair pair = (Pair) C13LP.LJJJLL(listZQ2);
            if (pair != null && (list = (List) pair.getSecond()) != null) {
                numLJ = C2286608xc.LJ(list.size());
            } else {
                numLJ = null;
            }
            List listAQ2 = infoStickerListViewModel.AQ2(numLJ, list2);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C330210Cx1 c330210Cx1 = new C330210Cx1(this.LLILLJJLI, listAQ2, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c330210Cx1) == objLJFF) {
                C1C7U.LIZIZ("InfoStickerListViewModel@dce1.refreshFromCache$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InfoStickerListViewModel@dce1.refreshFromCache$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
