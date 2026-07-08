package X;

import com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseSingleChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.viewmodel.SingleChatNoticeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06aS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1633406aS extends C1696260uF6 implements Function1<InterfaceC904740ZeS, Unit> {
    public C1633406aS(SingleChatNoticeViewModel singleChatNoticeViewModel) {
        super(1, singleChatNoticeViewModel, SingleChatNoticeViewModel.class, "onMessageEvent", "onMessageEvent(Lcom/ss/android/ugc/aweme/im/messagelist/api/data/MessageEvent;)Lkotlinx/coroutines/Job;", 8);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC904740ZeS interfaceC904740ZeS) {
        ((BaseSingleChatNoticeViewModel) this.receiver).BQ2(interfaceC904740ZeS);
        return Unit.LIZ;
    }
}
