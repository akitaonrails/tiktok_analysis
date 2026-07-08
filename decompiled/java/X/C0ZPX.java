package X;

import com.ss.android.ugc.aweme.titlebar.viewmodel.GroupTitleBarViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: renamed from: X.0ZPX, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C0ZPX extends C2217421BqW implements Function1<AbstractC1702506lb, Unit> {
    public C0ZPX(GroupTitleBarViewModel groupTitleBarViewModel) {
        super(1, groupTitleBarViewModel, GroupTitleBarViewModel.class, "onConversationEvent", "onConversationEvent$im_group_chat_release(Lcom/ss/android/ugc/aweme/im/messagelist/api/data/ConversationEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1702506lb abstractC1702506lb) {
        AbstractC1702506lb abstractC1702506lb2 = abstractC1702506lb;
        GroupTitleBarViewModel groupTitleBarViewModel = (GroupTitleBarViewModel) this.receiver;
        groupTitleBarViewModel.getClass();
        List<Long> memberIds = null;
        if (abstractC1702506lb2 instanceof C1702406la) {
            if (((C1702406la) abstractC1702506lb2).LIZIZ != 10) {
                groupTitleBarViewModel.EQ2();
                C0Y8T c0y8tZQ2 = groupTitleBarViewModel.zQ2();
                if (c0y8tZQ2 != null) {
                    memberIds = c0y8tZQ2.getMemberIds();
                }
                groupTitleBarViewModel.FQ2(groupTitleBarViewModel.wQ2(memberIds));
                groupTitleBarViewModel.setState(new AwS593S0100000_14(groupTitleBarViewModel, 219));
            }
        } else if (abstractC1702506lb2 instanceof C1702306lZ) {
            C0Y8T c0y8tZQ22 = groupTitleBarViewModel.zQ2();
            if (c0y8tZQ22 != null) {
                memberIds = c0y8tZQ22.getMemberIds();
            }
            groupTitleBarViewModel.FQ2(groupTitleBarViewModel.wQ2(memberIds));
            groupTitleBarViewModel.setState(new AwS593S0100000_14(groupTitleBarViewModel, 219));
        }
        return Unit.LIZ;
    }
}
