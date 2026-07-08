package X;

import com.ss.android.ugc.aweme.im.service.viewmodel.ChatRoomStreakViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS368S0200000_2;

/* JADX INFO: renamed from: X.06Pc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1602206Pc extends C2217421BqW implements Function1<AbstractC1702506lb, Unit> {
    public C1602206Pc(Object obj) {
        super(1, obj, ChatRoomStreakViewModel.class, "onConversationEvent", "onConversationEvent(Lcom/ss/android/ugc/aweme/im/messagelist/api/data/ConversationEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1702506lb abstractC1702506lb) {
        ChatRoomStreakViewModel chatRoomStreakViewModel = (ChatRoomStreakViewModel) this.receiver;
        chatRoomStreakViewModel.getClass();
        chatRoomStreakViewModel.withState(new AwS368S0200000_2(abstractC1702506lb, chatRoomStreakViewModel, 170));
        return Unit.LIZ;
    }
}
