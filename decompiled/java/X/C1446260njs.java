package X;

import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0njs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1446260njs extends C2217421BqW implements Function1<CompileProbeResult, Unit> {
    public final /* synthetic */ VideoPublishEditModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1446260njs(VideoPublishEditModel videoPublishEditModel) {
        super(1, C1449605lu.class, "onResult", "tryInitData$onResult(Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;Lcom/ss/android/ugc/aweme/shortvideo/edit/CompileProbeResult;)V", 0);
        this.LL = videoPublishEditModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(CompileProbeResult compileProbeResult) {
        CompileProbeResult compileProbeResult2 = compileProbeResult;
        VideoPublishEditModel videoPublishEditModel = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SWCompileProbe ; onResult: ");
        sbLIZ.append(compileProbeResult2);
        C564000MAc.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        videoPublishEditModel.setCompileProbeResult(compileProbeResult2);
        return Unit.LIZ;
    }
}
