package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteCacheState;
import com.ss.android.ugc.aweme.upvote.detail.notice.RepostQuickActionRepliedRegistry;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostSyncViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0lPY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostSyncViewModel$publishReplyServer$2$2$1", f = "RepostSyncViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1356780lPY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ RepostSyncViewModel LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ RepostReplyStruct LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C1356730lPT LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1356780lPY(RepostSyncViewModel repostSyncViewModel, String str, RepostReplyStruct repostReplyStruct, String str2, C1356730lPT c1356730lPT, String str3, InterfaceC1364105Vn<? super C1356780lPY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = repostSyncViewModel;
        this.LLILLJJLI = str;
        this.LLILLL = repostReplyStruct;
        this.LLILZ = str2;
        this.LLILZIL = c1356730lPT;
        this.LLILZLL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1356780lPY(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String aid;
        C1C7U.LIZ("RepostSyncViewModel@ea3b.publishReplyServer$2$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        RepostSyncViewModel repostSyncViewModel = this.LL;
        String str = this.LLILLJJLI;
        RepostReplyStruct repostReplyStruct = this.LLILLL;
        if (repostReplyStruct != null) {
            repostSyncViewModel.wQ2(str, repostReplyStruct, UpvoteCacheState.PUBLISH_SUCCESS, null, this.LLILZ);
            C1358380lS8 c1358380lS8 = C1358380lS8.LIZ;
            Aweme aweme = this.LLILZIL.LJ;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            RepostReplyStruct repostReplyStruct2 = this.LLILLL;
            c1358380lS8.getClass();
            C1358380lS8.LIZ(repostReplyStruct2, aid);
            RepostQuickActionRepliedRegistry.LL.LJFF(this.LLILZLL, this.LLILLL.replyId);
            C1356730lPT c1356730lPT = this.LLILZIL;
            if (Intrinsics.LJFF(c1356730lPT.LJI, "inbox_fast_reply") || Intrinsics.LJFF(c1356730lPT.LJIIIIZZ, "inbox_fast_reply")) {
                this.LL.L1(2131825001);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("RepostSyncViewModel@ea3b.publishReplyServer$2$2$1");
            return unit;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
