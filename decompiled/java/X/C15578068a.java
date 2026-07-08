package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseSingleChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.viewmodel.SingleChatNoticeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.068a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C15578068a extends C2217421BqW implements Function1<AbstractC1702506lb, Unit> {
    public C15578068a(SingleChatNoticeViewModel singleChatNoticeViewModel) {
        super(1, singleChatNoticeViewModel, SingleChatNoticeViewModel.class, "onConversationEvent", "onConversationEvent(Lcom/ss/android/ugc/aweme/im/messagelist/api/data/ConversationEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1702506lb abstractC1702506lb) {
        AbstractC1702506lb abstractC1702506lb2 = abstractC1702506lb;
        BaseSingleChatNoticeViewModel baseSingleChatNoticeViewModel = (BaseSingleChatNoticeViewModel) this.receiver;
        C909290Zln c909290ZlnZQ2 = baseSingleChatNoticeViewModel.zQ2();
        if (c909290ZlnZQ2 != null) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(baseSingleChatNoticeViewModel), null, null, new C068Z(abstractC1702506lb2, c909290ZlnZQ2, baseSingleChatNoticeViewModel, null), 3);
        }
        return Unit.LIZ;
    }
}
