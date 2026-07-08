package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.AiReplySingleChatRoomViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Qc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1604806Qc extends C2217421BqW implements Function1<AbstractC1702506lb, Unit> {
    public C1604806Qc(AiReplySingleChatRoomViewModel aiReplySingleChatRoomViewModel) {
        super(1, aiReplySingleChatRoomViewModel, AiReplySingleChatRoomViewModel.class, "onConversationEvent", "onConversationEvent$im_ai_impl_release(Lcom/ss/android/ugc/aweme/im/messagelist/api/data/ConversationEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1702506lb abstractC1702506lb) {
        AbstractC1702506lb abstractC1702506lb2 = abstractC1702506lb;
        AiReplySingleChatRoomViewModel aiReplySingleChatRoomViewModel = (AiReplySingleChatRoomViewModel) this.receiver;
        aiReplySingleChatRoomViewModel.getClass();
        if (abstractC1702506lb2 instanceof C1702406la) {
            C1702406la c1702406la = (C1702406la) abstractC1702506lb2;
            if (Intrinsics.LJFF(c1702406la.LIZ.getConversationId(), aiReplySingleChatRoomViewModel.vQ2())) {
                AnonymousClass0956 anonymousClass0956 = aiReplySingleChatRoomViewModel.LLILLJJLI;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                aiReplySingleChatRoomViewModel.LLILLJJLI = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(aiReplySingleChatRoomViewModel), null, null, new C1604906Qd(aiReplySingleChatRoomViewModel, c1702406la, null), 3);
            }
        }
        return Unit.LIZ;
    }
}
