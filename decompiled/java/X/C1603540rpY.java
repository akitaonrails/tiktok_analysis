package X;

import com.ss.android.ugc.aweme.repostfeed.model.RepostFeed;
import com.ss.android.ugc.aweme.repostfeed.model.RepostFeedResponse;
import com.ss.android.ugc.aweme.repostfeed.viewmodel.RepostFeedViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0rpY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.repostfeed.viewmodel.RepostFeedViewModel$whenLoadMore$3", f = "RepostFeedViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1603540rpY extends C09AX implements Function2<Integer, InterfaceC1364105Vn<? super AbstractC1264080j02<RepostFeed>>, Object> {
    public /* synthetic */ int LL;
    public final /* synthetic */ RepostFeedViewModel LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ List<String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1603540rpY(RepostFeedViewModel repostFeedViewModel, List<String> list, List<String> list2, List<String> list3, InterfaceC1364105Vn<? super C1603540rpY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = repostFeedViewModel;
        this.LLILLL = list;
        this.LLILZ = list2;
        this.LLILZIL = list3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1603540rpY c1603540rpY = new C1603540rpY(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1603540rpY.LL = ((Number) obj).intValue();
        return c1603540rpY;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RepostFeedViewModel@b1b9.whenLoadMore$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = this.LL;
        InterfaceC1603680rpm interfaceC1603680rpm = (InterfaceC1603680rpm) this.LLILLJJLI.LLILLL.getValue().getOperator();
        int i2 = this.LLILLJJLI.LLILZLL;
        EnumC1603630rph enumC1603630rph = EnumC1603630rph.LOADMORE;
        int type = enumC1603630rph.getType();
        List<String> list = this.LLILLL;
        List<String> list2 = this.LLILZ;
        List<String> list3 = this.LLILZIL;
        C1360680lVq.LIZ.getClass();
        RepostFeedResponse repostFeedResponseG0 = interfaceC1603680rpm.g0(i2, type, null, null, null, list, list2, list3, C1360680lVq.LIZJ());
        RepostFeedViewModel repostFeedViewModel = this.LLILLJJLI;
        repostFeedViewModel.LLJ.LIZ();
        repostFeedViewModel.LLJ.LIZLLL(repostFeedResponseG0);
        AbstractC1264080j02<RepostFeed> abstractC1264080j02AQ2 = this.LLILLJJLI.AQ2(enumC1603630rph, repostFeedResponseG0, i);
        C1C7U.LIZIZ("RepostFeedViewModel@b1b9.whenLoadMore$3");
        return abstractC1264080j02AQ2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, InterfaceC1364105Vn<? super AbstractC1264080j02<RepostFeed>> interfaceC1364105Vn) {
        return ((a) create(Integer.valueOf(num.intValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
