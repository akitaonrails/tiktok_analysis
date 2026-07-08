package X;

import com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol.AlbumAiContentService;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aicontent.aiofflineeffect.workflow.AiI2VWorkflowPlugin;

/* JADX INFO: renamed from: X.0Lmn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aicontent.aiofflineeffect.workflow.AiI2VWorkflowPlugin", f = "AiI2VWorkflowPlugin.kt", l = {63, 104, 109}, m = "handleWorkflowFinished")
public final class C553190Lmn extends AbstractC23140094w {
    public AlbumAiContentService LL;
    public C553220Lmq LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ AiI2VWorkflowPlugin LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C553190Lmn(AiI2VWorkflowPlugin aiI2VWorkflowPlugin, InterfaceC1364105Vn<? super C553190Lmn> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = aiI2VWorkflowPlugin;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiI2VWorkflowPlugin@eca3.handleWorkflowFinished$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILZLL.LIZLLL(null, this);
        C1C7U.LIZIZ("AiI2VWorkflowPlugin@eca3.handleWorkflowFinished$1");
        return objLIZLLL;
    }
}
