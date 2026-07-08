package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.config.VisualSearchOcrConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0QBr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C666330QBr extends C09AY implements Function0<VisualSearchOcrConfig> {
    public C666330QBr() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final VisualSearchOcrConfig invoke() {
        Object obj;
        try {
            VisualSearchOcrConfig visualSearchOcrConfig = (VisualSearchOcrConfig) C0C64.LJIILLIIL().LJJII(VisualSearchOcrConfig.class, C666340QBs.LIZIZ, "visual_search_support_ocr_config", true);
            C189200o6.m2constructorimpl(visualSearchOcrConfig);
            obj = visualSearchOcrConfig;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        C666340QBs.LIZ.getClass();
        VisualSearchOcrConfig visualSearchOcrConfig2 = C666340QBs.LIZIZ;
        boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
        VisualSearchOcrConfig visualSearchOcrConfig3 = obj;
        if (zM7isFailureimpl) {
            visualSearchOcrConfig3 = visualSearchOcrConfig2;
        }
        return visualSearchOcrConfig3 != 0 ? visualSearchOcrConfig3 : visualSearchOcrConfig2;
    }
}
