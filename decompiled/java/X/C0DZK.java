package X;

import com.ss.android.ugc.aweme.social.thought.api.model.FriendsThoughtFeedResponse;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtAggregatedModel;
import com.ss.android.ugc.aweme.social.thought.ui.aggregated.SocialThoughtAggregatedVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0DZK, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.ui.aggregated.SocialThoughtAggregatedVM$loadFirstPage$2", f = "SocialThoughtAggregatedVM.kt", l = {130}, m = "invokeSuspend")
public final class C0DZK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SocialThoughtAggregatedVM LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DZK(SocialThoughtAggregatedVM socialThoughtAggregatedVM, String str, InterfaceC1364105Vn<? super C0DZK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = socialThoughtAggregatedVM;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DZK(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        boolean zLJFF;
        Object value4;
        Object objLJFF = obj;
        C1C7U.LIZ("SocialThoughtAggregatedVM@9f7c.loadFirstPage$2");
        Object objLJFF2 = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJFF);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJFF);
            C0DZM c0dzm = C0DZM.LIZ;
            this.LL = 1;
            objLJFF = c0dzm.LJFF(this);
            if (objLJFF == objLJFF2) {
                C1C7U.LIZIZ("SocialThoughtAggregatedVM@9f7c.loadFirstPage$2");
                return objLJFF2;
            }
        }
        C0DZV c0dzv = (C0DZV) objLJFF;
        SocialThoughtAggregatedVM socialThoughtAggregatedVM = this.LLILLJJLI;
        socialThoughtAggregatedVM.LLIZ = false;
        if (!Intrinsics.LJFF(socialThoughtAggregatedVM.getCurrentUid(), this.LLILLL)) {
            C2252321DDq c2252321DDq = this.LLILLJJLI.LL;
            do {
                value4 = c2252321DDq.getValue();
            } while (!c2252321DDq.compareAndSet(value4, C0DZJ.LIZ((C0DZJ) value4, null, false, false, false, 11)));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SocialThoughtAggregatedVM@9f7c.loadFirstPage$2");
            return unit;
        }
        if (c0dzv instanceof C0DZP) {
            FriendsThoughtFeedResponse friendsThoughtFeedResponse = ((C0DZP) c0dzv).LIZ;
            List<ThoughtAggregatedModel> feedItems = friendsThoughtFeedResponse.getFeedItems();
            if (feedItems == null) {
                feedItems = C13BV.INSTANCE;
            }
            SocialThoughtAggregatedVM socialThoughtAggregatedVM2 = this.LLILLJJLI;
            String nextPageToken = friendsThoughtFeedResponse.getNextPageToken();
            if (nextPageToken == null) {
                nextPageToken = "";
            }
            socialThoughtAggregatedVM2.LLILZLL = nextPageToken;
            C2252321DDq c2252321DDq2 = this.LLILLJJLI.LL;
            do {
                value3 = c2252321DDq2.getValue();
                zLJFF = Intrinsics.LJFF(friendsThoughtFeedResponse.getHasMore(), true);
                value3.getClass();
            } while (!c2252321DDq2.compareAndSet(value3, new C0DZJ(feedItems, zLJFF, false, false)));
            this.LLILLJJLI.yQ2(feedItems);
        } else if (c0dzv instanceof C0DZR) {
            C2252321DDq c2252321DDq3 = this.LLILLJJLI.LL;
            do {
                value2 = c2252321DDq3.getValue();
            } while (!c2252321DDq3.compareAndSet(value2, C0DZJ.LIZ((C0DZJ) value2, null, false, false, true, 3)));
            this.LLILLJJLI.LLILLL.LJIIIIZZ(C0DZE.LIZ);
        } else if (Intrinsics.LJFF(c0dzv, C0DZW.LIZ)) {
            C2252321DDq c2252321DDq4 = this.LLILLJJLI.LL;
            do {
                value = c2252321DDq4.getValue();
            } while (!c2252321DDq4.compareAndSet(value, C0DZJ.LIZ((C0DZJ) value, null, false, false, false, 11)));
        } else {
            throw new C1954807lC();
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SocialThoughtAggregatedVM@9f7c.loadFirstPage$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
