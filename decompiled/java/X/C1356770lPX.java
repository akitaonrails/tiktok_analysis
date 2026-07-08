package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteCacheState;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostSyncViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0lPX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostSyncViewModel$publishReplyServer$2$3$1", f = "RepostSyncViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1356770lPX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ RepostSyncViewModel LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1356730lPT LLILLL;
    public final /* synthetic */ Throwable LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ RepostReplyStruct LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1356770lPX(RepostSyncViewModel repostSyncViewModel, String str, C1356730lPT c1356730lPT, Throwable th, String str2, RepostReplyStruct repostReplyStruct, InterfaceC1364105Vn<? super C1356770lPX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = repostSyncViewModel;
        this.LLILLJJLI = str;
        this.LLILLL = c1356730lPT;
        this.LLILZ = th;
        this.LLILZIL = str2;
        this.LLILZLL = repostReplyStruct;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1356770lPX(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        C23112093u c23112093u;
        C1C7U.LIZ("RepostSyncViewModel@ea3b.publishReplyServer$2$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        RepostSyncViewModel repostSyncViewModel = this.LL;
        String str = this.LLILLJJLI;
        RepostReplyStruct repostReplyStruct = this.LLILLL.LIZ;
        UpvoteCacheState upvoteCacheState = UpvoteCacheState.PUBLISH_FAILED;
        Throwable th = this.LLILZ;
        String aid = null;
        if ((th instanceof C0XIR) && (c23112093u = (C23112093u) th) != null) {
            numLJ = C2286608xc.LJ(c23112093u.getErrorCode());
        } else {
            numLJ = null;
        }
        repostSyncViewModel.wQ2(str, repostReplyStruct, upvoteCacheState, numLJ, this.LLILZIL);
        C1358380lS8 c1358380lS8 = C1358380lS8.LIZ;
        Aweme aweme = this.LLILLL.LJ;
        if (aweme != null) {
            aid = aweme.getAid();
        }
        RepostReplyStruct repostReplyStruct2 = this.LLILZLL;
        c1358380lS8.getClass();
        C1358380lS8.LIZJ(aid, repostReplyStruct2);
        C1356730lPT c1356730lPT = this.LLILLL;
        if (Intrinsics.LJFF(c1356730lPT.LJI, "inbox_fast_reply") || Intrinsics.LJFF(c1356730lPT.LJIIIIZZ, "inbox_fast_reply")) {
            this.LL.L1(2131825000);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RepostSyncViewModel@ea3b.publishReplyServer$2$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
