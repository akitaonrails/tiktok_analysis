package X;

import com.ss.android.ugc.aweme.story.feed.immersive.panel.component.StoryImmersiveUserFeedComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: renamed from: X.0Rzq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C714160Rzq extends C2217421BqW implements Function0<Unit> {
    public C714160Rzq(StoryImmersiveUserFeedComponent storyImmersiveUserFeedComponent) {
        super(0, storyImmersiveUserFeedComponent, StoryImmersiveUserFeedComponent.class, "subscribeSidebarListVMEvent", "subscribeSidebarListVMEvent()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC712570RxH interfaceC712570RxH;
        StoryImmersiveUserFeedComponent storyImmersiveUserFeedComponent = (StoryImmersiveUserFeedComponent) this.receiver;
        InterfaceC1603360rpG interfaceC1603360rpGEp = storyImmersiveUserFeedComponent.Ep();
        if ((interfaceC1603360rpGEp instanceof InterfaceC712570RxH) && (interfaceC712570RxH = (InterfaceC712570RxH) interfaceC1603360rpGEp) != null) {
            interfaceC712570RxH.zc1(storyImmersiveUserFeedComponent, new AwS590S0100000_11(storyImmersiveUserFeedComponent, 482), null, new AwS590S0100000_11(storyImmersiveUserFeedComponent, 483));
        }
        return Unit.LIZ;
    }
}
