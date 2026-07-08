package X;

import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0oFZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC1465910oFZ implements InterfaceC1439290nYd {
    public C1465900oFY LIZ;

    public abstract boolean LIZ(VideoPublishEditModel videoPublishEditModel);

    public abstract void LIZLLL(VideoPublishEditModel videoPublishEditModel);

    public final void LIZIZ() {
        C1465900oFY c1465900oFY = this.LIZ;
        if (c1465900oFY != null && Intrinsics.LJFF(c1465900oFY.LIZLLL, C1465950oFd.LIZ)) {
            C1466040oFm c1466040oFm = C1466040oFm.LIZIZ;
            c1465900oFY.LIZLLL = c1466040oFm;
            c1465900oFY.LIZIZ.invoke();
            Function1<CompileProbeResult, Unit> function1 = c1465900oFY.LIZJ;
            CompileProbeResult.State state = CompileProbeResult.State.CANCEL;
            int i = c1466040oFm.LIZ;
            function1.invoke(new CompileProbeResult(new CompileProbeResult.ResultStatus(state, i, i, "OuterCancel"), null, 1));
        }
        C1465900oFY c1465900oFY2 = this.LIZ;
        if (c1465900oFY2 != null) {
            AbstractC1465920oFa abstractC1465920oFa = c1465900oFY2.LIZLLL;
            C1465940oFc c1465940oFc = C1465940oFc.LIZ;
            if (Intrinsics.LJFF(abstractC1465920oFa, c1465940oFc) || Intrinsics.LJFF(abstractC1465920oFa, C1465960oFe.LIZ) || (abstractC1465920oFa instanceof AbstractC1465970oFf)) {
                c1465900oFY2.LIZLLL = c1465940oFc;
            } else {
                if (!Intrinsics.LJFF(abstractC1465920oFa, C1465950oFd.LIZ)) {
                    throw new C1954807lC();
                }
                C564000MAc.LIZJ("CompileProbe ; clear on running");
            }
        }
    }

    public final void LIZJ(VideoPublishEditModel videoPublishEditModel) {
        if (!LIZ(videoPublishEditModel)) {
            C564000MAc.LIZJ("CompileProbe ; Need not start");
            return;
        }
        LIZLLL(videoPublishEditModel);
        C1465900oFY c1465900oFY = this.LIZ;
        if (c1465900oFY != null && Intrinsics.LJFF(c1465900oFY.LIZLLL, C1465940oFc.LIZ)) {
            c1465900oFY.LIZLLL = C1465950oFd.LIZ;
            c1465900oFY.LIZ.invoke();
        }
    }
}
