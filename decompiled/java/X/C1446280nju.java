package X;

import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeConfigV2;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0nju, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1446280nju extends AbstractC1465910oFZ {
    public final Function1<VideoPublishEditModel, InterfaceC1444130ngR> LIZIZ;
    public CompileProbeConfigV2 LIZJ;

    public C1446280nju(C1437210nVH c1437210nVH) {
        this.LIZIZ = c1437210nVH;
    }

    @Override // X.AbstractC1465910oFZ
    public final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        CompileProbeConfigV2 compileProbeConfigV2LIZ = C0APM.LIZ();
        this.LIZJ = compileProbeConfigV2LIZ;
        if (compileProbeConfigV2LIZ == null) {
            return false;
        }
        return C1428470nHB.LL(videoPublishEditModel);
    }

    @Override // X.AbstractC1465910oFZ
    public final void LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        C259800zU c259800zU = new C259800zU();
        if (this.LIZ == null) {
            this.LIZ = new C1465900oFY(new C1446330njz(videoPublishEditModel, this, c259800zU), new C1446310njx(c259800zU), new C1446270njt(videoPublishEditModel));
        }
    }
}
