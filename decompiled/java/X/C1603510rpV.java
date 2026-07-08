package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.repostfeed.model.RepostFeed;
import com.ss.android.ugc.aweme.repostfeed.model.RepostFeedResponse;
import com.ss.android.ugc.aweme.repostfeed.viewmodel.RepostFeedViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0rpV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.repostfeed.viewmodel.RepostFeedViewModel$whenRefresh$3", f = "RepostFeedViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1603510rpV extends C09AX implements Function2<Integer, InterfaceC1364105Vn<? super AbstractC1264080j02<RepostFeed>>, Object> {
    public /* synthetic */ int LL;
    public final /* synthetic */ RepostFeedViewModel LLILLJJLI;
    public final /* synthetic */ C1586880rOg LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ List<String> LLILZIL;
    public final /* synthetic */ List<String> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1603510rpV(RepostFeedViewModel repostFeedViewModel, C1586880rOg c1586880rOg, List<String> list, List<String> list2, List<String> list3, InterfaceC1364105Vn<? super C1603510rpV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = repostFeedViewModel;
        this.LLILLL = c1586880rOg;
        this.LLILZ = list;
        this.LLILZIL = list2;
        this.LLILZLL = list3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1603510rpV c1603510rpV = new C1603510rpV(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1603510rpV.LL = ((Number) obj).intValue();
        return c1603510rpV;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String aid;
        RepostFeed repostFeed;
        Aweme aweme;
        C1C7U.LIZ("RepostFeedViewModel@b1b9.whenRefresh$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = this.LL;
        InterfaceC1603680rpm interfaceC1603680rpm = (InterfaceC1603680rpm) this.LLILLJJLI.LLILLL.getValue().getOperator();
        int dataLevel = EnumC1581150rFR.SORT.getDataLevel();
        int type = EnumC1603630rph.REFRESH.getType();
        String strLIZLLL = C08JS.LIZLLL(this.LLILLL.LIZ);
        String strLIZLLL2 = C08JS.LIZLLL(this.LLILLL.LIZIZ);
        List<String> list = this.LLILZ;
        List<String> list2 = this.LLILZIL;
        List<String> list3 = this.LLILZLL;
        C1360680lVq.LIZ.getClass();
        RepostFeedResponse repostFeedResponseG0 = interfaceC1603680rpm.g0(dataLevel, type, strLIZLLL, strLIZLLL2, list, list2, null, list3, C1360680lVq.LIZJ());
        int i2 = 0;
        this.LLILLJJLI.LLIZ = false;
        if (!this.LLILLL.LIZ.isEmpty()) {
            C1603560rpa c1603560rpa = this.LLILLJJLI.LLJ;
            int size = ((ArrayList) C1586870rOf.LIZJ).size();
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    List<RepostFeed> repostFeedData = repostFeedResponseG0.getRepostFeedData();
                    if (repostFeedData != null && (repostFeed = (RepostFeed) C13LP.LJJJLZIJ(i3, repostFeedData)) != null && (aweme = repostFeed.aweme) != null) {
                        aid = aweme.getAid();
                    } else {
                        aid = null;
                    }
                    if (!Intrinsics.LJFF(aid, C13LP.LJJJLZIJ(i3, C1586870rOf.LIZJ))) {
                        break;
                    }
                    i3++;
                } else {
                    i2 = 1;
                    break;
                }
            }
            c1603560rpa.LIZIZ(Integer.valueOf(i2), "insert_result");
        }
        RepostFeedViewModel repostFeedViewModel = this.LLILLJJLI;
        repostFeedViewModel.LLJ.LIZ();
        repostFeedViewModel.LLJ.LIZLLL(repostFeedResponseG0);
        AbstractC1264080j02<RepostFeed> abstractC1264080j02AQ2 = this.LLILLJJLI.AQ2(EnumC1603630rph.REFRESH, repostFeedResponseG0, i);
        C1C7U.LIZIZ("RepostFeedViewModel@b1b9.whenRefresh$3");
        return abstractC1264080j02AQ2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, InterfaceC1364105Vn<? super AbstractC1264080j02<RepostFeed>> interfaceC1364105Vn) {
        return ((a) create(Integer.valueOf(num.intValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
