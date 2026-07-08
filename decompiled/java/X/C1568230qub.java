package X;

import com.bytedance.android.livesdk.model.message.FeedUserRoomMonitorMessage;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.live.FeedLiveStatusManagerComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0qub, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1568230qub extends C09AY implements Function0<C1568220qua> {
    public final /* synthetic */ FeedLiveStatusManagerComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1568230qub(FeedLiveStatusManagerComponent feedLiveStatusManagerComponent) {
        super(0);
        this.LL = feedLiveStatusManagerComponent;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0qua] */
    @Override // kotlin.jvm.functions.Function0
    public final C1568220qua invoke() {
        final FeedLiveStatusManagerComponent feedLiveStatusManagerComponent = this.LL;
        return new InterfaceC481880Iv4() { // from class: X.0qua
            @Override // X.InterfaceC481880Iv4
            public final C481790Iuv q(FeedUserRoomMonitorMessage feedUserRoomMonitorMessage) throws JSONException {
                Aweme awemeLJIIIIZZ;
                boolean z;
                Pair<Boolean, Boolean> pairLJIIIZ;
                List<Aweme> awemeList = feedLiveStatusManagerComponent.getAwemeList();
                IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) feedLiveStatusManagerComponent.LLJI.getValue();
                if (iViewPagerComponentAbility != null) {
                    awemeLJIIIIZZ = iViewPagerComponentAbility.LJIIIIZZ();
                } else {
                    awemeLJIIIIZZ = null;
                }
                FeedLiveStatusManagerComponent feedLiveStatusManagerComponent2 = feedLiveStatusManagerComponent;
                if (feedLiveStatusManagerComponent2.LLJJJJLIIL && feedLiveStatusManagerComponent2.LLJJL) {
                    z = true;
                } else {
                    z = false;
                }
                String str = feedUserRoomMonitorMessage.LL;
                int i = C1568260que.LIZ().subscribeVersion;
                if (i != 1) {
                    if (i != 2) {
                        pairLJIIIZ = feedLiveStatusManagerComponent.fo().LJIIIZ(awemeLJIIIIZZ, awemeList, feedUserRoomMonitorMessage, z, true);
                    } else if (Intrinsics.LJFF(str, "homepage_hot")) {
                        pairLJIIIZ = feedLiveStatusManagerComponent.fo().LJIIIZ(awemeLJIIIIZZ, awemeList, feedUserRoomMonitorMessage, false, true);
                    } else if (Intrinsics.LJFF(str, "fyp_preview_card")) {
                        pairLJIIIZ = feedLiveStatusManagerComponent.fo().LJIIIZ(awemeLJIIIIZZ, awemeList, feedUserRoomMonitorMessage, z, false);
                    } else {
                        Boolean bool = Boolean.FALSE;
                        pairLJIIIZ = new Pair<>(bool, bool);
                    }
                } else if (!Intrinsics.LJFF(str, "homepage_hot") && !Intrinsics.LJFF(str, "fyp_preview_card")) {
                    Boolean bool2 = Boolean.FALSE;
                    pairLJIIIZ = new Pair<>(bool2, bool2);
                } else {
                    pairLJIIIZ = feedLiveStatusManagerComponent.fo().LJIIIZ(awemeLJIIIIZZ, awemeList, feedUserRoomMonitorMessage, z, true);
                }
                return new C481790Iuv(pairLJIIIZ.getFirst().booleanValue(), pairLJIIIZ.getSecond().booleanValue(), feedLiveStatusManagerComponent.ko());
            }
        };
    }
}
