package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.port.internal.IInternalDraftSizeCalculator;
import com.ss.android.ugc.aweme.port.internal.IPublishGuideDraftService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import g3a.a;
import kotlin.jvm.internal.AFwS239S0000000_8;

/* JADX INFO: renamed from: X.0Mgl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C574930Mgl extends a implements InterfaceC379610EuV {
    public final C1DRG LLIZLLLIL;
    public final VideoPublishEditModel LLJ;

    @Override // X.AbstractRunnableC21377818lM
    public final void LJII() {
        IInternalDraftSizeCalculator iInternalDraftSizeCalculatorLIZIZ;
        IInternalDraftSizeCalculator iInternalDraftSizeCalculatorLIZIZ2;
        try {
            IPublishGuideDraftService iPublishGuideDraftService = (IPublishGuideDraftService) PluggableExtentionKt.pluggableSpi$default(IPublishGuideDraftService.class, false, false, false, 14, null);
            if (iPublishGuideDraftService != null && (iInternalDraftSizeCalculatorLIZIZ2 = iPublishGuideDraftService.LIZIZ()) != null) {
                iInternalDraftSizeCalculatorLIZIZ2.LJFF(this.LLJ);
            }
            IPublishGuideDraftService iPublishGuideDraftService2 = (IPublishGuideDraftService) PluggableExtentionKt.pluggableSpi$default(IPublishGuideDraftService.class, false, false, false, 14, null);
            C189200o6.m2constructorimpl((iPublishGuideDraftService2 == null || (iInternalDraftSizeCalculatorLIZIZ = iPublishGuideDraftService2.LIZIZ()) == null) ? null : Long.valueOf(iInternalDraftSizeCalculatorLIZIZ.LJII()));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLIZLLLIL;
    }

    public C574930Mgl(C1DRG c1drg, VideoPublishEditModel videoPublishEditModel) {
        this.LLIZLLLIL = c1drg;
        this.LLJ = videoPublishEditModel;
        LJ(AFwS239S0000000_8.get$arr$(207));
    }
}
