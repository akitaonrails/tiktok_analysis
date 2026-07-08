package X;

import com.ss.android.ugc.aweme.ecommerce.preloader.experiment.ECDispatchResourceCondition;
import com.ss.android.ugc.aweme.ecommerce.preloader.experiment.ECDispatchResourceConditionItem;
import com.ss.android.ugc.aweme.ecommerce.preloader.experiment.ECPreloadDispatchGlobalConfig;
import com.ss.android.ugc.aweme.ecommerce.preloader.experiment.ECPreloadTaskResource;
import java.util.List;

/* JADX INFO: renamed from: X.0pLV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1508030pLV {
    public final Integer LIZ;
    public final Integer LIZIZ;
    public final ECDispatchResourceCondition LIZJ;
    public final List<ECPreloadTaskResource> LIZLLL;

    public C1508030pLV() {
        Integer numValueOf;
        ECDispatchResourceConditionItem eCDispatchResourceConditionItem;
        ECPreloadDispatchGlobalConfig eCPreloadDispatchGlobalConfig = C1508080pLa.LIZ().preloadConfig;
        Integer numValueOf2 = null;
        ECDispatchResourceCondition eCDispatchResourceCondition = eCPreloadDispatchGlobalConfig != null ? eCPreloadDispatchGlobalConfig.dispatchResourceCondition : null;
        this.LIZJ = eCDispatchResourceCondition;
        ECPreloadDispatchGlobalConfig eCPreloadDispatchGlobalConfig2 = C1508080pLa.LIZ().preloadConfig;
        this.LIZLLL = eCPreloadDispatchGlobalConfig2 != null ? eCPreloadDispatchGlobalConfig2.taskTypeResource : null;
        ECDispatchResourceConditionItem eCDispatchResourceConditionItem2 = eCDispatchResourceCondition != null ? eCDispatchResourceCondition.cpu : null;
        if (eCDispatchResourceConditionItem2 != null) {
            numValueOf = Integer.valueOf(C1508090pLb.LIZIZ() ? eCDispatchResourceConditionItem2.lowParallelLimit : C1508090pLb.LIZ() == 3 ? eCDispatchResourceConditionItem2.highParallelLimit : eCDispatchResourceConditionItem2.parallelLimit);
        } else {
            numValueOf = null;
        }
        this.LIZ = numValueOf;
        if (eCDispatchResourceCondition != null && (eCDispatchResourceConditionItem = eCDispatchResourceCondition.memory) != null) {
            numValueOf2 = Integer.valueOf(C1508090pLb.LIZIZ() ? eCDispatchResourceConditionItem.lowParallelLimit : C1508090pLb.LIZ() == 3 ? eCDispatchResourceConditionItem.highParallelLimit : eCDispatchResourceConditionItem.parallelLimit);
        }
        this.LIZIZ = numValueOf2;
    }
}
