package X;

import android.os.Process;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.boost.CpusetManager;
import com.ss.android.ugc.aweme.ecommerce.mixmall.settings.ECMixMallJatoConfigModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService;

/* JADX INFO: renamed from: X.1Adf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2183971Adf {
    public static void LIZ(ECMixMallJatoConfigModel eCMixMallJatoConfigModel) {
        IOptimizerHelperService iOptimizerHelperService = (IOptimizerHelperService) PluggableExtentionKt.pluggableSpi$default(IOptimizerHelperService.class, false, false, false, 14, null);
        if (eCMixMallJatoConfigModel.startDoFrame && iOptimizerHelperService != null) {
            iOptimizerHelperService.LJIILL();
        }
        if (eCMixMallJatoConfigModel.blockLog && iOptimizerHelperService != null) {
            iOptimizerHelperService.LJIIJJI();
        }
        if (eCMixMallJatoConfigModel.blockJit && iOptimizerHelperService != null) {
            iOptimizerHelperService.LJIILIIL();
        }
        if (eCMixMallJatoConfigModel.blockGc && iOptimizerHelperService != null) {
            iOptimizerHelperService.LIZIZ();
        }
        if (eCMixMallJatoConfigModel.bindBigCore) {
            CpusetManager.resetCoreBind();
        }
        if (eCMixMallJatoConfigModel.threadPriority) {
            JatoXL.resetPriority(Process.myTid());
        }
    }

    public static void LIZIZ(ECMixMallJatoConfigModel eCMixMallJatoConfigModel) {
        IOptimizerHelperService iOptimizerHelperService = (IOptimizerHelperService) PluggableExtentionKt.pluggableSpi$default(IOptimizerHelperService.class, false, false, false, 14, null);
        if (eCMixMallJatoConfigModel.startDoFrame && iOptimizerHelperService != null) {
            iOptimizerHelperService.LJ(eCMixMallJatoConfigModel.startDoFrameDuration);
        }
        if (eCMixMallJatoConfigModel.blockLog && iOptimizerHelperService != null) {
            iOptimizerHelperService.LJIIIZ(eCMixMallJatoConfigModel.blockLogDuration);
        }
        if (eCMixMallJatoConfigModel.blockJit && iOptimizerHelperService != null) {
            iOptimizerHelperService.LJIIIIZZ();
        }
        if (eCMixMallJatoConfigModel.blockGc && iOptimizerHelperService != null) {
            iOptimizerHelperService.LJIIL(eCMixMallJatoConfigModel.blockGcDuration);
        }
        if (eCMixMallJatoConfigModel.bindBigCore) {
            CpusetManager.bindBigCore();
        }
        if (eCMixMallJatoConfigModel.threadPriority) {
            JatoXL.setPriority(Process.myTid(), -20);
        }
    }
}
