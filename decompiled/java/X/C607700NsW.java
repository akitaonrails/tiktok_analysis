package X;

import com.ss.android.ugc.aweme.detail.vm.FollowInnerFeedVM;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS588S0100000_9;
import njp.a;

/* JADX INFO: renamed from: X.0NsW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.detail.vm.FollowInnerFeedVM$clearReadDataWhenInnerFeedOnDestroyed$1", f = "FollowInnerFeedVM.kt", l = {}, m = "invokeSuspend")
public final class C607700NsW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FollowInnerFeedVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C607700NsW(FollowInnerFeedVM followInnerFeedVM, InterfaceC1364105Vn<? super C607700NsW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = followInnerFeedVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C607700NsW(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowInnerFeedVM@437f.clearReadDataWhenInnerFeedOnDestroyed$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Set<Map.Entry<String, C607720NsY>> setEntrySet = this.LL.BQ2().entrySet();
        FollowInnerFeedVM followInnerFeedVM = this.LL;
        Iterator<T> it2 = setEntrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            List<FollowFeed> list = ((C607720NsY) entry.getValue()).LIZ;
            List listSingletonList = null;
            if (list != null) {
                Iterator<FollowFeed> it3 = list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        FollowFeed next = it3.next();
                        if (!((CopyOnWriteArraySet) followInnerFeedVM.LLILZLL.getValue()).contains(next.getAweme().getAid())) {
                            if (next != null) {
                                listSingletonList = Collections.singletonList(next);
                            }
                        }
                    }
                }
            }
            followInnerFeedVM.BQ2().put(entry.getKey(), C607720NsY.LIZ((C607720NsY) entry.getValue(), listSingletonList, new C607740Nsa(0), false, 0, 12));
        }
        ((CopyOnWriteArraySet) this.LL.LLILZLL.getValue()).clear();
        ((CopyOnWriteArraySet) this.LL.LLIZ.getValue()).clear();
        FollowInnerFeedVM followInnerFeedVM2 = this.LL;
        followInnerFeedVM2.setState(new AwS588S0100000_9(followInnerFeedVM2, 596));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowInnerFeedVM@437f.clearReadDataWhenInnerFeedOnDestroyed$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
