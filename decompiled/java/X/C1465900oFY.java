package X;

import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0oFY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1465900oFY {
    public final Function0<Unit> LIZ;
    public final Function0<Unit> LIZIZ;
    public final Function1<CompileProbeResult, Unit> LIZJ;
    public AbstractC1465920oFa LIZLLL = C1465940oFc.LIZ;

    public final void LIZ(AbstractC1465970oFf abstractC1465970oFf) {
        CompileProbeResult compileProbeResult;
        if (Intrinsics.LJFF(this.LIZLLL, C1465950oFd.LIZ)) {
            this.LIZLLL = abstractC1465970oFf;
            Function1<CompileProbeResult, Unit> function1 = this.LIZJ;
            if (!(abstractC1465970oFf instanceof C1466020oFk) && !(abstractC1465970oFf instanceof C1466030oFl)) {
                if (abstractC1465970oFf instanceof C1466000oFi) {
                    CompileProbeResult.State state = CompileProbeResult.State.ERROR;
                    int i = abstractC1465970oFf.LIZ;
                    compileProbeResult = new CompileProbeResult(new CompileProbeResult.ResultStatus(state, i, i, ((C1466000oFi) abstractC1465970oFf).LIZIZ), null, 1);
                } else if (abstractC1465970oFf instanceof C1466010oFj) {
                    compileProbeResult = new CompileProbeResult(new CompileProbeResult.ResultStatus(CompileProbeResult.State.CANCEL, abstractC1465970oFf.LIZ, 0, ""), null, 1);
                } else if (Intrinsics.LJFF(abstractC1465970oFf, C1466040oFm.LIZIZ)) {
                    C564000MAc.LIZIZ("CompileProbe ;OuterCancel on inner Failed");
                    CompileProbeResult.State state2 = CompileProbeResult.State.CANCEL;
                    int i2 = abstractC1465970oFf.LIZ;
                    compileProbeResult = new CompileProbeResult(new CompileProbeResult.ResultStatus(state2, i2, i2, "OuterCancel"), null, 1);
                } else {
                    throw new C1954807lC();
                }
            } else {
                compileProbeResult = new CompileProbeResult(new CompileProbeResult.ResultStatus(CompileProbeResult.State.ERROR, abstractC1465970oFf.LIZ, 0, ""), null, 1);
            }
            function1.invoke(compileProbeResult);
            return;
        }
        C564000MAc.LIZIZ("CompileProbe ;Failed on not running");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1465900oFY(Function0<Unit> function0, Function0<Unit> function02, Function1<? super CompileProbeResult, Unit> function1) {
        this.LIZ = function0;
        this.LIZIZ = function02;
        this.LIZJ = function1;
    }
}
