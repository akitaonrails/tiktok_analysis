package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomBannerComponent;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: renamed from: X.0RXh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C697430RXh extends C09AY implements Function0<C697370RXb> {
    public final /* synthetic */ InteractBottomBannerComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C697430RXh(InteractBottomBannerComponent interactBottomBannerComponent) {
        super(0);
        this.LL = interactBottomBannerComponent;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0RXb] */
    @Override // kotlin.jvm.functions.Function0
    public final C697370RXb invoke() {
        final InteractBottomBannerComponent interactBottomBannerComponent = this.LL;
        return new C0RY9() { // from class: X.0RXb
            @Override // X.C0RY9
            public final void LIZ(PriorityProtocol priorityProtocol) {
            }

            @Override // X.C0RY9
            public final Set<String> LIZJ() {
                InteractBottomBannerComponent interactBottomBannerComponent2 = interactBottomBannerComponent;
                FeedComponentPriorityData feedComponentPriorityDataTp = interactBottomBannerComponent2.tp();
                String str = (String) interactBottomBannerComponent2.LLLFF.getValue();
                C724270Sb3 c724270Sb3 = interactBottomBannerComponent2.LLJI;
                return C0RZ5.LIZIZ(str, AwemeExtKt.getGenreType(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme()), feedComponentPriorityDataTp, new AwS590S0100000_11(interactBottomBannerComponent2, 395));
            }

            @Override // X.C0RY9
            public final Set<String> LIZIZ() {
                return C08CX.INSTANCE;
            }

            @Override // X.C0RY9
            public final LifecycleOwner getLifecycleOwner() {
                return interactBottomBannerComponent;
            }
        };
    }
}
