package X;

import com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseSingleChatNoticeViewModel;

/* JADX INFO: renamed from: X.068m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseSingleChatNoticeViewModel", f = "BaseSingleChatNoticeViewModel.kt", l = {177}, m = "addChatRequestTaskIfNotExists")
public final class C15590068m extends AbstractC23140094w {
    public EnumC1596306Mv LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ BaseSingleChatNoticeViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15590068m(BaseSingleChatNoticeViewModel baseSingleChatNoticeViewModel, InterfaceC1364105Vn<? super C15590068m> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = baseSingleChatNoticeViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseSingleChatNoticeViewModel@e9d5.addChatRequestTaskIfNotExists$2");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILLL.wQ2(null, null, this);
        C1C7U.LIZIZ("BaseSingleChatNoticeViewModel@e9d5.addChatRequestTaskIfNotExists$2");
        return objWQ2;
    }
}
