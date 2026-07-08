package X;

import com.ss.android.ugc.aweme.im.saas.host.impl.story.GroupChatStoryFeatureImpl;

/* JADX INFO: renamed from: X.05G7, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.saas.host.impl.story.GroupChatStoryFeatureImpl", f = "GroupChatStoryFeatureImpl.kt", l = {40}, m = "fetchGroupStoryStatus")
public final class C05G7 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ GroupChatStoryFeatureImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05G7(GroupChatStoryFeatureImpl groupChatStoryFeatureImpl, InterfaceC1364105Vn<? super C05G7> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = groupChatStoryFeatureImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupChatStoryFeatureImpl@8be3.fetchGroupStoryStatus$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZLLL(null, null, this);
        C1C7U.LIZIZ("GroupChatStoryFeatureImpl@8be3.fetchGroupStoryStatus$1");
        return objLIZLLL;
    }
}
