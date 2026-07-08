package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.story.feed.guidecard.viewmodel.StoryGuideCardShareViewModel;
import com.ss.android.ugc.aweme.story.feed.immersive.panel.component.StoryImmersiveUserFeedComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: renamed from: X.0Rzo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C714140Rzo extends C2217421BqW implements Function0<Unit> {
    public C714140Rzo(StoryImmersiveUserFeedComponent storyImmersiveUserFeedComponent) {
        super(0, storyImmersiveUserFeedComponent, StoryImmersiveUserFeedComponent.class, "subscribeGuideCardEvent", "subscribeGuideCardEvent()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        StoryGuideCardShareViewModel storyGuideCardShareViewModel;
        StoryImmersiveUserFeedComponent storyImmersiveUserFeedComponent = (StoryImmersiveUserFeedComponent) this.receiver;
        BaseDetailShareVM<?, ?, ?> baseDetailShareVMEp = storyImmersiveUserFeedComponent.Ep();
        if ((baseDetailShareVMEp instanceof StoryGuideCardShareViewModel) && (storyGuideCardShareViewModel = (StoryGuideCardShareViewModel) baseDetailShareVMEp) != null) {
            AssemViewModel.asyncSubscribe$default(storyGuideCardShareViewModel, new C2217381BqS() { // from class: X.0CxI
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    C326330Cql c326330Cql = (C326330Cql) obj;
                    c326330Cql.getClass();
                    return C627260Oiy.LIZLLL(c326330Cql);
                }
            }, storyImmersiveUserFeedComponent, C736820SvI.LIZLLL(), null, null, new AwS377S0200000_11(storyGuideCardShareViewModel, storyImmersiveUserFeedComponent, 136), 24, null);
        }
        BaseDetailShareVM<?, ?, ?> baseDetailShareVMEp2 = storyImmersiveUserFeedComponent.Ep();
        if ((baseDetailShareVMEp2 instanceof StoryGuideCardShareViewModel) && baseDetailShareVMEp2 != null) {
            AssemViewModel.asyncSubscribe$default(baseDetailShareVMEp2, new C2217381BqS() { // from class: X.0Sie
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    C326330Cql c326330Cql = (C326330Cql) obj;
                    c326330Cql.getClass();
                    return C627260Oiy.LIZJ(c326330Cql);
                }
            }, storyImmersiveUserFeedComponent, C736820SvI.LIZLLL(), new AwS590S0100000_11(storyImmersiveUserFeedComponent, 480), null, new AwS590S0100000_11(storyImmersiveUserFeedComponent, 481), 16, null);
        }
        return Unit.LIZ;
    }
}
