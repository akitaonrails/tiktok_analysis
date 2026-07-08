package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RS5, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RS5 extends C09AY implements Function0<C0RS4> {
    public final /* synthetic */ FeedBottomButtonContainer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RS5(FeedBottomButtonContainer feedBottomButtonContainer) {
        super(0);
        this.LL = feedBottomButtonContainer;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0RS4] */
    @Override // kotlin.jvm.functions.Function0
    public final C0RS4 invoke() {
        final FeedBottomButtonContainer feedBottomButtonContainer = this.LL;
        return new C0RY9() { // from class: X.0RS4
            @Override // X.C0RY9
            public final void LIZ(PriorityProtocol priorityProtocol) {
            }

            @Override // X.C0RY9
            public final Set<String> LIZJ() {
                FeedBottomButtonContainer feedBottomButtonContainer2 = feedBottomButtonContainer;
                FeedComponentPriorityData feedComponentPriorityDataAp = feedBottomButtonContainer2.Ap();
                String str = (String) feedBottomButtonContainer2.LLLIIII.getValue();
                C724270Sb3 c724270Sb3 = feedBottomButtonContainer2.LLJI;
                return C0RZ5.LIZJ(str, AwemeExtKt.getGenreType(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme()), feedComponentPriorityDataAp);
            }

            @Override // X.C0RY9
            public final Set<String> LIZIZ() {
                return (C300940Bqu.LIZ() || ((Boolean) C276950AtJ.LIZ.getValue()).booleanValue()) ? feedBottomButtonContainer.LLLI : C08CX.INSTANCE;
            }

            @Override // X.C0RY9
            public final LifecycleOwner getLifecycleOwner() {
                return feedBottomButtonContainer;
            }
        };
    }
}
