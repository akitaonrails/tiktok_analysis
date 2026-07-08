package X;

import Y.AObserverS123S0300000_10;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel.SearchRefreshPredictMobCanShowVM;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1D6Q, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D6Q implements InterfaceC2250311D5x {
    public boolean LIZ;
    public boolean LIZIZ;
    public final Set<C1D61> LIZJ = C13LQ.LJLIIL(new C1D61[]{EnumC1905410zgR.ON_ATTACH, C1D6D.ON_RELOAD, C1D6C.ON_FIRST_DRAW, C1D6C.ON_RUNTIME_READY});

    @Override // X.InterfaceC2250311D5x
    public final void destroy() {
    }

    @Override // X.InterfaceC2250311D5x
    public final int getPriority() {
        return 10;
    }

    @Override // X.InterfaceC2250311D5x
    public final Set<C13IQ<? extends InterfaceC2250311D5x>> getDependencies() {
        return C08CX.INSTANCE;
    }

    @Override // X.InterfaceC2250311D5x
    public final Set<C1D61> getLifecycleStages() {
        return this.LIZJ;
    }

    public final void LIZ(C1537720q7O c1537720q7O) {
        C1537720q7O c1537720q7O2;
        SearchRefreshPredictMobCanShowVM searchRefreshPredictMobCanShowVMLIZ;
        if (c1537720q7O != null) {
            c1537720q7O2 = c1537720q7O;
        } else {
            c1537720q7O2 = null;
        }
        Fragment fragmentLIZ = C946803n0.LIZ(c1537720q7O2);
        if (fragmentLIZ != null && (searchRefreshPredictMobCanShowVMLIZ = C0P72.LIZ(fragmentLIZ)) != null) {
            if (Intrinsics.LJFF(searchRefreshPredictMobCanShowVMLIZ.LLILLJJLI.getValue(), Boolean.FALSE)) {
                searchRefreshPredictMobCanShowVMLIZ.LLILLJJLI.observe(fragmentLIZ, new AObserverS123S0300000_10(c1537720q7O, searchRefreshPredictMobCanShowVMLIZ, this, 1));
                return;
            }
            if (c1537720q7O != null) {
                c1537720q7O.LIZ("cardShow", new JSONObject());
            }
            this.LIZ = true;
        }
    }

    @Override // X.InterfaceC2250311D5x
    public final AbstractC1156450gCR<?> executeDependencyReady(C1D63 c1d63) {
        return C1156460gCS.LIZ;
    }

    @Override // X.InterfaceC2250311D5x
    public final AbstractC1156450gCR<?> executeImmediate(C1D63 c1d63) {
        InterfaceC1541990qEH interfaceC1541990qEHLJIJJ;
        C1537720q7O c1537720q7O;
        C1537480q70 c1537480q70 = c1d63.LIZJ;
        Integer numValueOf = null;
        if (c1537480q70 != null) {
            interfaceC1541990qEHLJIJJ = c1537480q70.LJIJJ();
        } else {
            interfaceC1541990qEHLJIJJ = null;
        }
        if (interfaceC1541990qEHLJIJJ instanceof C1537720q7O) {
            c1537720q7O = (C1537720q7O) interfaceC1541990qEHLJIJJ;
        } else {
            c1537720q7O = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lynxView render thread: ");
        if (c1537720q7O != null) {
            c1537720q7O.getLynxView();
            EnumC665490Q8l threadStrategyForRendering = c1537720q7O.getThreadStrategyForRendering();
            if (threadStrategyForRendering != null) {
                numValueOf = Integer.valueOf(threadStrategyForRendering.id());
            }
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        C1D61 c1d61 = c1d63.LIZ.LIZ;
        if (c1d61 == EnumC1905410zgR.ON_ATTACH) {
            if (this.LIZ && c1537720q7O != null) {
                c1537720q7O.LIZ("cardShow", new JSONObject());
            }
            return new C1156440gCQ(EnumC115000c8.SUCCESS);
        }
        if (c1d61 == C1D6C.ON_FIRST_DRAW) {
            if (!this.LIZ && this.LIZIZ) {
                LIZ(c1537720q7O);
            }
            return new C1156440gCQ(EnumC115000c8.SUCCESS);
        }
        if (c1d61 == C1D6C.ON_RUNTIME_READY) {
            LIZ(c1537720q7O);
            return new C1156440gCQ(EnumC115000c8.SUCCESS);
        }
        if (c1d61 == C1D6D.ON_RELOAD) {
            this.LIZ = false;
            this.LIZIZ = true;
            return new C1156440gCQ(EnumC115000c8.SUCCESS);
        }
        return C1156460gCS.LIZ;
    }
}
