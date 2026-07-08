package X;

import com.bytedance.android.livesdk.model.message.FeedUserRoomMonitorMessage;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.live.FeedLiveStatusManagerComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0quZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1568210quZ extends C09AY implements Function0<C1568200quY> {
    public final /* synthetic */ FeedLiveStatusManagerComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1568210quZ(FeedLiveStatusManagerComponent feedLiveStatusManagerComponent) {
        super(0);
        this.LL = feedLiveStatusManagerComponent;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0quY] */
    @Override // kotlin.jvm.functions.Function0
    public final C1568200quY invoke() {
        final FeedLiveStatusManagerComponent feedLiveStatusManagerComponent = this.LL;
        return new InterfaceC481880Iv4() { // from class: X.0quY
            @Override // X.InterfaceC481880Iv4
            public final C481790Iuv q(FeedUserRoomMonitorMessage feedUserRoomMonitorMessage) throws JSONException {
                Aweme awemeLJIIIIZZ;
                List<Aweme> awemeList = feedLiveStatusManagerComponent.getAwemeList();
                IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) feedLiveStatusManagerComponent.LLJI.getValue();
                if (iViewPagerComponentAbility != null) {
                    awemeLJIIIIZZ = iViewPagerComponentAbility.LJIIIIZZ();
                } else {
                    awemeLJIIIIZZ = null;
                }
                Pair<Boolean, Boolean> pairLJIIIZ = feedLiveStatusManagerComponent.fo().LJIIIZ(awemeLJIIIIZZ, awemeList, feedUserRoomMonitorMessage, false, true);
                return new C481790Iuv(pairLJIIIZ.getFirst().booleanValue(), pairLJIIIZ.getSecond().booleanValue(), feedLiveStatusManagerComponent.ko());
            }
        };
    }
}
