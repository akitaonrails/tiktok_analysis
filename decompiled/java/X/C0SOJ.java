package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.component.RecommendFeedComponent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS368S0200000_2;

/* JADX INFO: renamed from: X.0SOJ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SOJ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ RecommendFeedComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SOJ(RecommendFeedComponent recommendFeedComponent) {
        super(0);
        this.LL = recommendFeedComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Fragment fragmentLJI;
        Lifecycle lifecycle;
        try {
            Fragment fragmentLJI2 = C724240Sb0.LJI(this.LL);
            Lifecycle.State currentState = null;
            if (fragmentLJI2 != null && fragmentLJI2.getActivity() != null) {
                Fragment fragmentLJI3 = C724240Sb0.LJI(this.LL);
                if (fragmentLJI3 != null && (lifecycle = fragmentLJI3.getLifecycle()) != null) {
                    currentState = lifecycle.getCurrentState();
                }
                if (currentState != Lifecycle.State.DESTROYED && (fragmentLJI = C724240Sb0.LJI(this.LL)) != null) {
                    RecommendFeedComponent recommendFeedComponent = this.LL;
                    List<C13IQ<? extends AbstractC738140SxQ>> listLJJIFFI = C1618440sDa.LIZIZ.LJJIIJ().LJJIFFI();
                    if (listLJJIFFI != null) {
                        for (C13IQ c13iq : (ArrayList) C13LP.LJJJJLI(listLJJIFFI)) {
                            C0SOH c0sohLIZIZ = C0SOI.LIZIZ(fragmentLJI, "story_card_identify");
                            if (c0sohLIZIZ != null) {
                                C0SOG c0sog = (C0SOG) ((ConcurrentHashMap) c0sohLIZIZ.LL).get(C09R7.LIZ(c13iq));
                                if (c0sog != null) {
                                    c0sog.run();
                                }
                            }
                            C723850SaN.LIZLLL(recommendFeedComponent, new AwS368S0200000_2(recommendFeedComponent, (RecommendFeedComponent) c13iq, (C13IQ<? extends AbstractC738140SxQ>) 32));
                        }
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Unit.LIZ;
    }
}
