package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.api.UpvoteApi;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.pojo.RepostReplyListResponse;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lS5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel$fetchRepostReplyList$2", f = "RepostInteractListViewModel.kt", l = {718}, m = "invokeSuspend")
public final class C1358350lS5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super RepostReplyListResponse>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1358360lS6 LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ RepostInteractListViewModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1358350lS5(C1358360lS6 c1358360lS6, int i, RepostInteractListViewModel repostInteractListViewModel, InterfaceC1364105Vn<? super C1358350lS5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1358360lS6;
        this.LLILZ = i;
        this.LLILZIL = repostInteractListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1358350lS5 c1358350lS5 = new C1358350lS5(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1358350lS5.LLILLJJLI = obj;
        return c1358350lS5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        String aid;
        String uid;
        Object repostReplyList = obj;
        C1C7U.LIZ("RepostInteractListViewModel@3304.fetchRepostReplyList$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(repostReplyList);
            } else {
                C155000ia.LIZIZ(repostReplyList);
                C1358360lS6 c1358360lS6 = this.LLILLL;
                int i2 = this.LLILZ;
                RepostInteractListViewModel repostInteractListViewModel = this.LLILZIL;
                UpvoteApi upvoteApi = UpvoteApi.LIZIZ;
                String str = c1358360lS6.LL.upvoteId;
                Long lLJFF = C2286608xc.LJFF(c1358360lS6.LLJ);
                Integer numLJ = C2286608xc.LJ(i2);
                String strLJ = C051M.LJ(c1358360lS6.LLIZLLLIL, false);
                Integer numLJ2 = C2286608xc.LJ(c1358360lS6.LL.repostRelationType);
                Aweme aweme = repostInteractListViewModel.LL;
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                User user = c1358360lS6.LL.user;
                if (user != null) {
                    uid = user.getUid();
                } else {
                    uid = null;
                }
                this.LL = 1;
                repostReplyList = upvoteApi.getRepostReplyList(str, lLJFF, numLJ, strLJ, numLJ2, aid, uid, this);
                if (repostReplyList == objLJFF) {
                    C1C7U.LIZIZ("RepostInteractListViewModel@3304.fetchRepostReplyList$2");
                    return objLJFF;
                }
            }
            c098200Yq = (RepostReplyListResponse) repostReplyList;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            C1C7U.LIZIZ("RepostInteractListViewModel@3304.fetchRepostReplyList$2");
            return c098200Yq;
        }
        RepostInteractListViewModel repostInteractListViewModel2 = this.LLILZIL;
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            repostInteractListViewModel2.L1(R.string.txq);
            C1C7U.LIZIZ("RepostInteractListViewModel@3304.fetchRepostReplyList$2");
            return null;
        }
        C1C7U.LIZIZ("RepostInteractListViewModel@3304.fetchRepostReplyList$2");
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super RepostReplyListResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
