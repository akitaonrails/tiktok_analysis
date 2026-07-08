package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.component.RecommendFeedComponent;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rSF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1589090rSF extends C09AY implements Function0<Unit> {
    public final /* synthetic */ RecommendFeedComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1589090rSF(RecommendFeedComponent recommendFeedComponent) {
        super(0);
        this.LL = recommendFeedComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        Lifecycle lifecycle;
        try {
            Fragment fragmentLJI = C724240Sb0.LJI(this.LL);
            Lifecycle.State currentState = null;
            if (fragmentLJI != null && fragmentLJI.getActivity() != null) {
                Fragment fragmentLJI2 = C724240Sb0.LJI(this.LL);
                if (fragmentLJI2 != null && (lifecycle = fragmentLJI2.getLifecycle()) != null) {
                    currentState = lifecycle.getCurrentState();
                }
                if (currentState != Lifecycle.State.DESTROYED) {
                    if (C1594980rbk.LIZ().avatarType > 0 || C278330AvX.LIZIZ()) {
                        ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
                        if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null) {
                            interfaceC20673515v3K4.LLIZLLLIL(new C1589100rSG(this.LL));
                        }
                    } else {
                        this.LL.Jo();
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJ(e.getMessage());
        }
        return Unit.LIZ;
    }
}
