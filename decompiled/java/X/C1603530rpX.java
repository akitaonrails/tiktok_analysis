package X;

import com.ss.android.ugc.aweme.repostfeed.model.RepostFeedResponse;
import com.ss.android.ugc.aweme.repostfeed.viewmodel.RepostFeedDetailViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0rpX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.repostfeed.viewmodel.RepostFeedDetailViewModel$onLoadMore$3", f = "RepostFeedDetailViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1603530rpX extends C09AX implements Function2<Integer, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>>, Object> {
    public /* synthetic */ int LL;
    public final /* synthetic */ RepostFeedDetailViewModel LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ List<String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1603530rpX(RepostFeedDetailViewModel repostFeedDetailViewModel, List<String> list, List<String> list2, List<String> list3, InterfaceC1364105Vn<? super C1603530rpX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = repostFeedDetailViewModel;
        this.LLILLL = list;
        this.LLILZ = list2;
        this.LLILZIL = list3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1603530rpX c1603530rpX = new C1603530rpX(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1603530rpX.LL = ((Number) obj).intValue();
        return c1603530rpX;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RepostFeedDetailViewModel@279b.onLoadMore$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = this.LL;
        InterfaceC1603680rpm interfaceC1603680rpm = (InterfaceC1603680rpm) this.LLILLJJLI.LLILZLL.getValue().getOperator();
        int i2 = this.LLILLJJLI.LLJ;
        EnumC1603630rph enumC1603630rph = EnumC1603630rph.LOADMORE;
        int type = enumC1603630rph.getType();
        List<String> list = this.LLILLL;
        List<String> list2 = this.LLILZ;
        List<String> list3 = this.LLILZIL;
        C1360680lVq.LIZ.getClass();
        RepostFeedResponse repostFeedResponseG0 = interfaceC1603680rpm.g0(i2, type, null, null, null, list, list2, list3, C1360680lVq.LIZJ());
        RepostFeedDetailViewModel repostFeedDetailViewModel = this.LLILLJJLI;
        repostFeedDetailViewModel.LLJIJIL.LIZ();
        repostFeedDetailViewModel.LLJIJIL.LIZLLL(repostFeedResponseG0);
        AbstractC316870CbV<Long> abstractC316870CbVHQ2 = this.LLILLJJLI.HQ2(enumC1603630rph, repostFeedResponseG0, i);
        C1C7U.LIZIZ("RepostFeedDetailViewModel@279b.onLoadMore$3");
        return abstractC316870CbVHQ2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return ((a) create(Integer.valueOf(num.intValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
