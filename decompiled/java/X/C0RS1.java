package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.FcpMetaTagContainer;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS294S0000000_11;

/* JADX INFO: renamed from: X.0RS1, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RS1 extends C09AY implements Function0<C0RS0> {
    public final /* synthetic */ FcpMetaTagContainer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RS1(FcpMetaTagContainer fcpMetaTagContainer) {
        super(0);
        this.LL = fcpMetaTagContainer;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0RS0] */
    @Override // kotlin.jvm.functions.Function0
    public final C0RS0 invoke() {
        final FcpMetaTagContainer fcpMetaTagContainer = this.LL;
        return new C0RY9() { // from class: X.0RS0
            @Override // X.C0RY9
            public final Set<String> LIZJ() {
                FcpMetaTagContainer fcpMetaTagContainer2 = fcpMetaTagContainer;
                FeedComponentPriorityData feedComponentPriorityDataUp = fcpMetaTagContainer2.up();
                String str = (String) fcpMetaTagContainer2.LLJLLIL.getValue();
                C724270Sb3 c724270Sb3 = fcpMetaTagContainer2.LLJI;
                return C0RZ5.LIZJ(str, AwemeExtKt.getGenreType(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme()), feedComponentPriorityDataUp);
            }

            @Override // X.C0RY9
            public final Set<String> LIZIZ() {
                return C08CX.INSTANCE;
            }

            @Override // X.C0RY9
            public final LifecycleOwner getLifecycleOwner() {
                return fcpMetaTagContainer;
            }

            @Override // X.C0RY9
            public final void LIZ(PriorityProtocol priorityProtocol) {
                C694040RKg.LIZ(fcpMetaTagContainer, true, AFwS294S0000000_11.get$arr$(213));
            }
        };
    }
}
