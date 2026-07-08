package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureExtractionService;

/* JADX INFO: renamed from: X.093I, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C093I extends AbstractC2255721DQs<C093K> implements C093K, InterfaceC379610EuV {
    public static final C093J LLILLL = new Object() { // from class: X.093J
    };
    public static final int LLILZ = 8;
    public final C1DRG LL;
    public final C093K LLILLJJLI = this;

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C2269208uo.LIZ.getClass();
        C2269208uo.LIZIZ = "";
        C2269208uo.LIZJ = null;
        IMixEditingFeatureExtractionService iMixEditingFeatureExtractionService = (IMixEditingFeatureExtractionService) PluggableExtentionKt.pluggableSpi$default(IMixEditingFeatureExtractionService.class, false, false, false, 14, null);
        if (iMixEditingFeatureExtractionService != null) {
            iMixEditingFeatureExtractionService.LIZ();
        }
    }

    public C093K W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C093I(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
