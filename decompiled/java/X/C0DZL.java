package X;

import com.ss.android.ugc.aweme.social.thought.api.model.FriendsThoughtFeedResponse;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtAggregatedModel;
import com.ss.android.ugc.aweme.social.thought.ui.aggregated.SocialThoughtAggregatedVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0DZL, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.ui.aggregated.SocialThoughtAggregatedVM$loadMore$1", f = "SocialThoughtAggregatedVM.kt", l = {167}, m = "invokeSuspend")
public final class C0DZL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ SocialThoughtAggregatedVM LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DZL(String str, SocialThoughtAggregatedVM socialThoughtAggregatedVM, String str2, InterfaceC1364105Vn<? super C0DZL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = socialThoughtAggregatedVM;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DZL(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        C1C7U.LIZ("SocialThoughtAggregatedVM@9f7c.loadMore$1");
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
            C0DZM c0dzm = C0DZM.LIZ;
            String str = this.LLILLJJLI;
            this.LL = 1;
            obj = c0dzm.LJI(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SocialThoughtAggregatedVM@9f7c.loadMore$1");
                return objLJFF;
            }
        }
        C0DZV c0dzv = (C0DZV) obj;
        SocialThoughtAggregatedVM socialThoughtAggregatedVM = this.LLILLL;
        socialThoughtAggregatedVM.LLIZ = false;
        if (!Intrinsics.LJFF(socialThoughtAggregatedVM.getCurrentUid(), this.LLILZ)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SocialThoughtAggregatedVM@9f7c.loadMore$1");
            return unit;
        }
        if (c0dzv instanceof C0DZP) {
            FriendsThoughtFeedResponse friendsThoughtFeedResponse = ((C0DZP) c0dzv).LIZ;
            SocialThoughtAggregatedVM socialThoughtAggregatedVM2 = this.LLILLL;
            String nextPageToken = friendsThoughtFeedResponse.getNextPageToken();
            if (nextPageToken == null) {
                nextPageToken = "";
            }
            socialThoughtAggregatedVM2.LLILZLL = nextPageToken;
            List<ThoughtAggregatedModel> list = ((C0DZJ) this.LLILLL.LL.getValue()).LIZ;
            List<ThoughtAggregatedModel> feedItems = friendsThoughtFeedResponse.getFeedItems();
            if (feedItems == null) {
                feedItems = C13BV.INSTANCE;
            }
            List<ThoughtAggregatedModel> listLJLIL = C13LP.LJLIL(feedItems, list);
            C2252321DDq c2252321DDq = this.LLILLL.LL;
            do {
                value = c2252321DDq.getValue();
            } while (!c2252321DDq.compareAndSet(value, C0DZJ.LIZ((C0DZJ) value, listLJLIL, Intrinsics.LJFF(friendsThoughtFeedResponse.getHasMore(), true), false, false, 12)));
            this.LLILLL.yQ2(listLJLIL);
        } else if (c0dzv instanceof C0DZR) {
            this.LLILLL.LLILLL.LJIIIIZZ(C0DZE.LIZ);
        } else if (!Intrinsics.LJFF(c0dzv, C0DZW.LIZ)) {
            throw new C1954807lC();
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SocialThoughtAggregatedVM@9f7c.loadMore$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
