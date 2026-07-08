package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.feed.immersive.panel.component.StoryImmersiveUserFeedComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rwf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C712190Rwf extends C09AY implements Function0<Unit> {
    public final /* synthetic */ StoryImmersiveUserFeedComponent LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C712190Rwf(StoryImmersiveUserFeedComponent storyImmersiveUserFeedComponent, int i, Aweme aweme, boolean z) {
        super(0);
        this.LL = storyImmersiveUserFeedComponent;
        this.LLILLJJLI = i;
        this.LLILLL = aweme;
        this.LLILZ = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC712570RxH interfaceC712570RxH;
        InterfaceC1603360rpG interfaceC1603360rpGEp = this.LL.Ep();
        if ((interfaceC1603360rpGEp instanceof InterfaceC712570RxH) && (interfaceC712570RxH = (InterfaceC712570RxH) interfaceC1603360rpGEp) != null) {
            interfaceC712570RxH.h21(this.LLILLL, this.LLILLJJLI, this.LLILZ);
        }
        return Unit.LIZ;
    }
}
