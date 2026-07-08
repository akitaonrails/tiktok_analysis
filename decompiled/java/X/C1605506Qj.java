package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.BotChatRoomViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Qj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1605506Qj extends C2217421BqW implements Function1<AbstractC1702506lb, Unit> {
    public C1605506Qj(BotChatRoomViewModel botChatRoomViewModel) {
        super(1, botChatRoomViewModel, BotChatRoomViewModel.class, "onConversationEvent", "onConversationEvent$im_ai_impl_release(Lcom/ss/android/ugc/aweme/im/messagelist/api/data/ConversationEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1702506lb abstractC1702506lb) {
        AbstractC1702506lb abstractC1702506lb2 = abstractC1702506lb;
        BotChatRoomViewModel botChatRoomViewModel = (BotChatRoomViewModel) this.receiver;
        botChatRoomViewModel.getClass();
        if (abstractC1702506lb2 instanceof C1702406la) {
            C1702406la c1702406la = (C1702406la) abstractC1702506lb2;
            if (Intrinsics.LJFF(c1702406la.LIZ.getConversationId(), botChatRoomViewModel.vQ2())) {
                AnonymousClass0956 anonymousClass0956 = botChatRoomViewModel.LLILLJJLI;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                botChatRoomViewModel.LLILLJJLI = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(botChatRoomViewModel), null, null, new C1605406Qi(botChatRoomViewModel, c1702406la, null), 3);
            }
        }
        return Unit.LIZ;
    }
}
