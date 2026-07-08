package X;

import com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol.AlbumAiContentService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KlS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AbstractWorkflowManagerParentTask$stepForward2AlbumForAIGCWorkflow$2", f = "AbstractWorkflowManagerParentTask.kt", l = {}, m = "invokeSuspend")
public final class C526880KlS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C535020Kya>, Object> {
    public final /* synthetic */ AlbumAiContentService LL;
    public final /* synthetic */ C535020Kya LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C526880KlS(AlbumAiContentService albumAiContentService, C535020Kya c535020Kya, InterfaceC1364105Vn<? super C526880KlS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = albumAiContentService;
        this.LLILLJJLI = c535020Kya;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C526880KlS(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbstractWorkflowManagerParentTask@9441.stepForward2AlbumForAIGCWorkflow$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C535020Kya c535020KyaLJFF = this.LL.LJFF(this.LLILLJJLI);
        C1C7U.LIZIZ("AbstractWorkflowManagerParentTask@9441.stepForward2AlbumForAIGCWorkflow$2");
        return c535020KyaLJFF;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C535020Kya> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
