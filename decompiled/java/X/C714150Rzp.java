package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.story.feed.immersive.panel.component.StoryImmersiveUserFeedComponent;
import com.ss.android.ugc.aweme.story.group.GroupChatWithStoryShareViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: renamed from: X.0Rzp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C714150Rzp extends C2217421BqW implements Function0<Unit> {
    public C714150Rzp(StoryImmersiveUserFeedComponent storyImmersiveUserFeedComponent) {
        super(0, storyImmersiveUserFeedComponent, StoryImmersiveUserFeedComponent.class, "subscribeGroupChatEvent", "subscribeGroupChatEvent()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        GroupChatWithStoryShareViewModel groupChatWithStoryShareViewModel;
        StoryImmersiveUserFeedComponent storyImmersiveUserFeedComponent = (StoryImmersiveUserFeedComponent) this.receiver;
        BaseDetailShareVM<?, ?, ?> baseDetailShareVMEp = storyImmersiveUserFeedComponent.Ep();
        if ((baseDetailShareVMEp instanceof GroupChatWithStoryShareViewModel) && (groupChatWithStoryShareViewModel = (GroupChatWithStoryShareViewModel) baseDetailShareVMEp) != null) {
            AssemViewModel.asyncSubscribe$default(groupChatWithStoryShareViewModel, new C2217381BqS() { // from class: X.0CxJ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    C326280Cqg c326280Cqg = (C326280Cqg) obj;
                    c326280Cqg.getClass();
                    return C627260Oiy.LIZLLL(c326280Cqg);
                }
            }, storyImmersiveUserFeedComponent, null, null, null, new AwS377S0200000_11(storyImmersiveUserFeedComponent, groupChatWithStoryShareViewModel, 134), 28, null);
            AssemViewModel.asyncSubscribe$default(groupChatWithStoryShareViewModel, new C2217381BqS() { // from class: X.0Sif
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    C326280Cqg c326280Cqg = (C326280Cqg) obj;
                    c326280Cqg.getClass();
                    return C627260Oiy.LIZJ(c326280Cqg);
                }
            }, storyImmersiveUserFeedComponent, C736820SvI.LIZLLL(), new AwS590S0100000_11(storyImmersiveUserFeedComponent, 478), null, new AwS590S0100000_11(storyImmersiveUserFeedComponent, 479), 16, null);
        }
        return Unit.LIZ;
    }
}
