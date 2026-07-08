package X;

import com.bytedance.android.livesdk.aireply.AIReplyAnchorManagerService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: renamed from: X.0JOA, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.aireply.AIReplyAnchorManagerService", f = "AIReplyAnchorManagerService.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "getAiCommentReplySwitch$suspendImpl")
public final class C0JOA extends AbstractC23140094w {
    public AIReplyAnchorManagerService LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AIReplyAnchorManagerService LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JOA(AIReplyAnchorManagerService aIReplyAnchorManagerService, InterfaceC1364105Vn<? super C0JOA> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = aIReplyAnchorManagerService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIReplyAnchorManagerService@da98.getAiCommentReplySwitch$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = AIReplyAnchorManagerService.LIZ(this.LLILLL, null, this);
        C1C7U.LIZIZ("AIReplyAnchorManagerService@da98.getAiCommentReplySwitch$1");
        return objLIZ;
    }
}
