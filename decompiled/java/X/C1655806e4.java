package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.group.GroupChatVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: renamed from: X.06e4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1655806e4 extends C2217421BqW implements Function1<AbstractC1702506lb, Unit> {
    public C1655806e4(GroupChatVM groupChatVM) {
        super(1, groupChatVM, GroupChatVM.class, "onConversationEvent", "onConversationEvent(Lcom/ss/android/ugc/aweme/im/messagelist/api/data/ConversationEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1702506lb abstractC1702506lb) {
        C0Y8T c0y8t;
        AbstractC1702506lb abstractC1702506lb2 = abstractC1702506lb;
        GroupChatVM groupChatVM = (GroupChatVM) this.receiver;
        groupChatVM.getClass();
        if (abstractC1702506lb2 instanceof C1702406la) {
            C1702406la c1702406la = (C1702406la) abstractC1702506lb2;
            if (c1702406la.LIZIZ != 10) {
                C0Y8T c0y8t2 = c1702406la.LIZ;
                groupChatVM.yQ2(c0y8t2);
                groupChatVM.setState(new AwS581S0100000_2(c0y8t2, 592));
            }
        } else if (abstractC1702506lb2 instanceof C1702706ld) {
            C1711306n1 c1711306n1 = ((C1702706ld) abstractC1702506lb2).LIZ;
            if (c1711306n1 != null && (c0y8t = c1711306n1.LIZIZ) != null) {
                groupChatVM.yQ2(c0y8t);
                groupChatVM.setState(new AwS581S0100000_2(c0y8t, 592));
            }
        } else if (abstractC1702506lb2 instanceof C1702306lZ) {
            groupChatVM.setState(new AwS581S0100000_2(((C1702306lZ) abstractC1702506lb2).LIZ, 592));
        }
        return Unit.LIZ;
    }
}
