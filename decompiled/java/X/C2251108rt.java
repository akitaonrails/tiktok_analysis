package X;

import com.ss.android.ugc.aweme.music.understanding.ContentPipelineContext;
import com.ss.android.ugc.aweme.music.understanding.ContentPipelineTags;
import com.ss.android.ugc.aweme.music.understanding.ContentUnderstandingRequest;
import com.ss.android.ugc.aweme.music.understanding.ContentUnderstandingResult;
import com.ss.android.ugc.aweme.music.understanding.ICacheAccessor;
import com.ss.android.ugc.aweme.music.understanding.PipelineTag;
import java.util.Iterator;

/* JADX INFO: renamed from: X.08rt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2251108rt extends C1D8B {
    @Override // X.C1D8B
    public final void LJFF(C1404610meh c1404610meh, C1D85 c1d85) {
        ContentUnderstandingResult.RequestResult requestResult;
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (next instanceof ContentPipelineContext) {
                if (next != null) {
                    ContentPipelineContext contentPipelineContext = (ContentPipelineContext) next;
                    Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next2 = it3.next();
                        if (next2 instanceof ContentUnderstandingResult.ZipBundle) {
                            if (next2 != null) {
                                ContentUnderstandingResult.ZipBundle zipBundle = (ContentUnderstandingResult.ZipBundle) next2;
                                ICacheAccessor iCacheAccessor = contentPipelineContext.cacheAccessor;
                                PipelineTag pipelineTag = contentPipelineContext.pipelineTag;
                                ContentPipelineTags contentPipelineTags = ContentPipelineTags.INSTANCE;
                                ContentUnderstandingResult contentUnderstandingResultMo13getCrossRunZMYo8sw = iCacheAccessor.mo13getCrossRunZMYo8sw(pipelineTag, contentPipelineTags.m276getNODE_REQUESTq0GeycQ(), zipBundle.getZipFilePath());
                                if (contentUnderstandingResultMo13getCrossRunZMYo8sw instanceof ContentUnderstandingResult.RequestResult) {
                                    requestResult = (ContentUnderstandingResult.RequestResult) contentUnderstandingResultMo13getCrossRunZMYo8sw;
                                } else {
                                    requestResult = null;
                                }
                                if (requestResult != null) {
                                    C201955140j.LJIILJJIL(C1673840tew.LIZIZ, "RequestTask use cross-run");
                                    contentPipelineContext.cacheAccessor.mo14putZMYo8sw(contentPipelineContext.pipelineTag, contentPipelineTags.m276getNODE_REQUESTq0GeycQ(), requestResult.copy(requestResult.understandingKey, requestResult.understandingType, requestResult.models, requestResult.statusCode, requestResult.statusMsg, null, requestResult.initRequest));
                                    c1d85.LIZJ(requestResult.copy(requestResult.understandingKey, requestResult.understandingType, requestResult.models, requestResult.statusCode, requestResult.statusMsg, null, requestResult.initRequest), true);
                                    return;
                                }
                                ContentUnderstandingRequest contentUnderstandingRequest = contentPipelineContext.request;
                                String str = contentUnderstandingRequest.creationId;
                                if (str == null) {
                                    str = "";
                                }
                                String str2 = contentUnderstandingRequest.understandingKey;
                                if (str2 != null && str2.length() != 0) {
                                    C201955140j.LJIILJJIL(C1673840tew.LIZIZ, "RequestTask begin");
                                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2251008rs(contentPipelineContext, str2, zipBundle, c1d85, str, null), 3);
                                    return;
                                } else {
                                    c1d85.LJ(1, new IllegalStateException("understandingKey is empty"));
                                    return;
                                }
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.music.understanding.ContentUnderstandingResult.ZipBundle");
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.music.understanding.ContentPipelineContext");
    }
}
