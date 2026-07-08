package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeConfigV1;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0njv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1446290njv extends AbstractC1465910oFZ {
    public final Function1<VideoPublishEditModel, InterfaceC1444130ngR> LIZIZ;
    public CompileProbeConfigV1 LIZJ;

    public C1446290njv(C1437220nVI c1437220nVI) {
        this.LIZIZ = c1437220nVI;
    }

    @Override // X.AbstractC1465910oFZ
    public final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        CompileProbeConfigV1 compileProbeConfigV1;
        String strLJJ = C0C64.LJIILLIIL().LJJ(31744, "compile_probe_config", "", true);
        if (strLJJ != null && strLJJ.length() != 0) {
            try {
                compileProbeConfigV1 = (CompileProbeConfigV1) C0CHQ.LIZ().getGson().LJII(strLJJ, CompileProbeConfigV1.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SWCompileProbe ; solveCompileProbeConfig failed: ");
                sbLIZ.append(strLJJ);
                C564000MAc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                compileProbeConfigV1 = null;
            }
        } else {
            compileProbeConfigV1 = null;
        }
        this.LIZJ = compileProbeConfigV1;
        if (compileProbeConfigV1 != null && C1428470nHB.LL(videoPublishEditModel)) {
            InterfaceC1444130ngR interfaceC1444130ngRInvoke = this.LIZIZ.invoke(videoPublishEditModel);
            if (videoPublishEditModel.videoWidth() + videoPublishEditModel.videoHeight() == interfaceC1444130ngRInvoke.LIZLLL() + interfaceC1444130ngRInvoke.LJI()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.AbstractC1465910oFZ
    public final void LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        C259800zU c259800zU = new C259800zU();
        if (this.LIZ == null) {
            this.LIZ = new C1465900oFY(new C1446320njy(videoPublishEditModel, this, c259800zU), new C1446300njw(c259800zU), new C1446260njs(videoPublishEditModel));
        }
    }
}
