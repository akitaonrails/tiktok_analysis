package X;

import com.ss.android.ugc.aweme.aigc.asynctask.models.AutoPickTaskResponse;
import com.ss.android.ugc.aweme.aigc.asynctask.models.TaskProgressInfo;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L03, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.AutoCut2MAETask$buildAutoPickTemplateInfosWithAVMusic$2$deferredResults$1$1", f = "AutoCut2MAETask.kt", l = {860}, m = "invokeSuspend")
public final class C0L03 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AutoPickTaskResponse>, Object> {
    public int LL;
    public final /* synthetic */ C541110LKb LLILLJJLI;
    public final /* synthetic */ TaskProgressInfo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L03(C541110LKb c541110LKb, TaskProgressInfo taskProgressInfo, InterfaceC1364105Vn<? super C0L03> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c541110LKb;
        this.LLILLL = taskProgressInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0L03(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AutoPickTaskResponse autoPickTaskResponse;
        Object objLJIJ = obj;
        C1C7U.LIZ("AutoCut2MAETask@5514.buildAutoPickTemplateInfosWithAVMusic$2$deferredResults$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJIJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIJ);
            final C541110LKb c541110LKb = this.LLILLJJLI;
            String str = this.LLILLL.musicId;
            this.LL = 1;
            c541110LKb.getClass();
            final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            C1403010mc7.LIZ.getMusicService().requestMusic(str, new InterfaceC1416890myV() { // from class: X.0L04
                @Override // X.InterfaceC1416890myV
                public final void LIZIZ(Exception exc) {
                    String message;
                    C541110LKb c541110LKb2 = c541110LKb;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("requestMusicById failed: ");
                    if (exc != null) {
                        message = exc.getMessage();
                    } else {
                        message = null;
                    }
                    sbLIZ.append(message);
                    c541110LKb2.LJJJJIZL(C2188811AlT.LIZIZ(sbLIZ));
                    if (c2252611DEt.isActive()) {
                        InterfaceC20236714Gf<AVMusic> interfaceC20236714Gf = c2252611DEt;
                        C189200o6.m2constructorimpl(null);
                        interfaceC20236714Gf.resumeWith(null);
                    }
                }

                @Override // X.InterfaceC1416890myV
                public final void LIZLLL(AVMusic aVMusic) {
                    if (c2252611DEt.isActive()) {
                        InterfaceC20236714Gf<AVMusic> interfaceC20236714Gf = c2252611DEt;
                        C189200o6.m2constructorimpl(aVMusic);
                        interfaceC20236714Gf.resumeWith(aVMusic);
                    }
                }
            });
            objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("AutoCut2MAETask@5514.buildAutoPickTemplateInfosWithAVMusic$2$deferredResults$1$1");
                return objLJFF;
            }
        }
        AVMusic aVMusic = (AVMusic) objLJIJ;
        if (aVMusic != null) {
            TaskProgressInfo taskProgressInfo = this.LLILLL;
            autoPickTaskResponse = new AutoPickTaskResponse(taskProgressInfo.taskId, taskProgressInfo.nleDraft, taskProgressInfo.musicId, aVMusic, taskProgressInfo.title);
        } else {
            C541110LKb c541110LKb2 = this.LLILLJJLI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("buildAutoPickTemplateInfosWithAVMusic: skipping secondary task index=");
            sbLIZ.append(this.LLILLL.index);
            sbLIZ.append(", musicId=");
            sbLIZ.append(this.LLILLL.musicId);
            sbLIZ.append(" (AVMusic request failed)");
            c541110LKb2.LJJJJIZL(C2188811AlT.LIZIZ(sbLIZ));
            autoPickTaskResponse = null;
        }
        C1C7U.LIZIZ("AutoCut2MAETask@5514.buildAutoPickTemplateInfosWithAVMusic$2$deferredResults$1$1");
        return autoPickTaskResponse;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AutoPickTaskResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
