package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.understanding.ContentUnderstandingRequest;
import com.ss.android.ugc.aweme.music.understanding.ContentUnderstandingResult;
import com.ss.android.ugc.aweme.music.understanding.IContentUnderstandingServiceWrap;
import com.ss.android.ugc.aweme.music.understanding.PipelineTag;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08sF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2253308sF extends C09AY implements InterfaceC1631620sYq<PipelineTag, ContentUnderstandingRequest, ContentUnderstandingResult, Boolean> {
    public final /* synthetic */ ContentUnderstandingRequest LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2253308sF(ContentUnderstandingRequest contentUnderstandingRequest, String str) {
        super(3);
        this.LL = contentUnderstandingRequest;
        this.LLILLJJLI = str;
    }

    @Override // X.InterfaceC1631620sYq
    public final Boolean invoke(PipelineTag pipelineTag, ContentUnderstandingRequest contentUnderstandingRequest, ContentUnderstandingResult contentUnderstandingResult) {
        String str;
        ContentUnderstandingResult.RequestResult requestResult;
        PipelineTag pipelineTag2 = pipelineTag;
        ContentUnderstandingRequest contentUnderstandingRequest2 = contentUnderstandingRequest;
        ContentUnderstandingResult contentUnderstandingResult2 = contentUnderstandingResult;
        C1673840tew c1673840tew = C1673840tew.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startOrObservePipeline check cache,pipelineTag=");
        sbLIZ.append(pipelineTag2.getValue());
        sbLIZ.append(", itemRequest=");
        sbLIZ.append(contentUnderstandingRequest2);
        sbLIZ.append(", request=");
        sbLIZ.append(this.LL);
        C201955140j.LJIILJJIL(c1673840tew, C2188811AlT.LIZIZ(sbLIZ));
        boolean z = false;
        if (Intrinsics.LJFF(pipelineTag2, C2253208sE.LIZ) && Intrinsics.LJFF(contentUnderstandingRequest2.creationId, this.LL.creationId)) {
            C13EL c13elLIZIZ = null;
            IContentUnderstandingServiceWrap iContentUnderstandingServiceWrap = (IContentUnderstandingServiceWrap) PluggableExtentionKt.pluggableSpi$default(IContentUnderstandingServiceWrap.class, false, false, false, 14, null);
            String understandingKey = null;
            if (iContentUnderstandingServiceWrap != null) {
                c13elLIZIZ = iContentUnderstandingServiceWrap.LIZIZ();
            }
            if ((contentUnderstandingResult2 instanceof ContentUnderstandingResult.RequestResult) && (requestResult = (ContentUnderstandingResult.RequestResult) contentUnderstandingResult2) != null) {
                understandingKey = requestResult.getUnderstandingKey();
            }
            if ((c13elLIZIZ == null || !(!c13elLIZIZ.isEmpty()) || (((str = this.LLILLJJLI) != null && str.length() != 0) || !C13LP.LJJJJ(understandingKey, c13elLIZIZ))) && Intrinsics.LJFF(contentUnderstandingRequest2.sources, this.LL.sources) && contentUnderstandingRequest2.firstSourceLength == this.LL.firstSourceLength) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
