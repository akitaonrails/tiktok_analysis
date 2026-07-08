package X;

import com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.SmartReplySuggestedReplyViewModel;

/* JADX INFO: renamed from: X.05v9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.SmartReplySuggestedReplyViewModel", f = "SmartReplySuggestedReplyViewModel.kt", l = {370}, m = "ableToRequestSuggestedReply")
public final class C1506905v9 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SmartReplySuggestedReplyViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1506905v9(SmartReplySuggestedReplyViewModel smartReplySuggestedReplyViewModel, InterfaceC1364105Vn<? super C1506905v9> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = smartReplySuggestedReplyViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SmartReplySuggestedReplyViewModel@aef2.ableToRequestSuggestedReply$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLJJLI.vQ2(null, this);
        C1C7U.LIZIZ("SmartReplySuggestedReplyViewModel@aef2.ableToRequestSuggestedReply$1");
        return objVQ2;
    }
}
