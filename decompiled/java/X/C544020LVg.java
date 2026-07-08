package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AIGCServerTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.TaskLogExtra;
import com.ss.android.ugc.aweme.aigc.asynctask.net.TaskDetail;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCResultType;
import com.ss.android.ugc.aweme.texttoimage.AiUrlInfo;
import com.ss.android.ugc.aweme.texttoimage.Text2ImageAIGCQueryResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0LVg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.aigcbusiness.text2image.Text2ImageProgressTask$requestProgress$2", f = "Text2ImageProgressTask.kt", l = {138}, m = "invokeSuspend")
public final class C544020LVg extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Text2ImageAIGCQueryResponse LLILLJJLI;
    public final /* synthetic */ C544010LVf LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C544020LVg(Text2ImageAIGCQueryResponse text2ImageAIGCQueryResponse, C544010LVf c544010LVf, InterfaceC1364105Vn<? super C544020LVg> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = text2ImageAIGCQueryResponse;
        this.LLILLL = c544010LVf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C544020LVg(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        TaskDetail taskDetail;
        Object objLJJJ;
        List<AiUrlInfo> list;
        AiUrlInfo aiUrlInfo;
        List<AiUrlInfo> list2;
        AiUrlInfo aiUrlInfo2;
        C1C7U.LIZ("Text2ImageProgressTask@31bc.requestProgress$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Text2ImageAIGCQueryResponse text2ImageAIGCQueryResponse = this.LLILLJJLI;
            String str2 = null;
            if (text2ImageAIGCQueryResponse != null && (list2 = text2ImageAIGCQueryResponse.data) != null && (aiUrlInfo2 = (AiUrlInfo) C13LP.LJJJLL(list2)) != null) {
                str = aiUrlInfo2.url;
            } else {
                str = null;
            }
            if (C123100dR.LIZ(str)) {
                taskDetail = new TaskDetail(null, 3, 0.0f, null, null, 0L, null, 0L, 0L, 0L, null, 2045, null);
            } else {
                taskDetail = new TaskDetail(null, 2, 0.0f, null, null, 0L, null, 0L, 0L, 0L, null, 2045, null);
            }
            C544010LVf c544010LVf = this.LLILLL;
            Text2ImageAIGCQueryResponse text2ImageAIGCQueryResponse2 = this.LLILLJJLI;
            if (text2ImageAIGCQueryResponse2 != null && (list = text2ImageAIGCQueryResponse2.data) != null && (aiUrlInfo = (AiUrlInfo) C13LP.LJJJLL(list)) != null) {
                str2 = aiUrlInfo.url;
            }
            this.LL = 1;
            c544010LVf.getClass();
            int jobStatus = taskDetail.getJobStatus();
            if (jobStatus != 1) {
                if (jobStatus != 2) {
                    if (jobStatus != 3) {
                        objLJJJ = C539400LDm.LIZ(c544010LVf, taskDetail.getJobStatus(), taskDetail.getStatusMessage(), null, null, this, 12);
                        if (objLJJJ != C099R.LJFF()) {
                            objLJJJ = Unit.LIZ;
                        }
                    } else {
                        if (str2 == null) {
                            str2 = "";
                        }
                        c544010LVf.LJIIIZ = str2;
                        c544010LVf.LJIIJJI = AIGCResultType.IMAGE;
                        ((ArrayList) c544010LVf.LJIIL).add(new AIGCServerTaskOutput(str2, ""));
                        c544010LVf.LJJIJIIJIL(true);
                        objLJJJ = C0LTN.LJJJ(c544010LVf, C0LSZ.LIZ(c544010LVf.LIZLLL, null, null, null, null, "FINISHED", null, null, 100, null, null, null, 0, null, null, null, 0, null, null, null, 0L, null, 0L, null, null, null, 0, null, 264241007), this);
                        if (objLJJJ != C099R.LJFF()) {
                            objLJJJ = Unit.LIZ;
                        }
                    }
                } else {
                    objLJJJ = C0LTN.LJJJ(c544010LVf, C0LSZ.LIZ(c544010LVf.LIZLLL, null, null, null, null, null, null, null, (int) Math.min((long) (((new Date().getTime() - c544010LVf.LJIILIIL) / 40000.0f) * 100), 99L), null, null, null, 0, null, null, null, 0, null, null, null, 0L, null, taskDetail.getWaitingTime(), TaskLogExtra.LIZ(c544010LVf.LIZLLL.LJJ, null, null, null, null, 2, null, null, null, null, false, null, 1044479), null, null, 0, null, 255852415), this);
                    if (objLJJJ != C099R.LJFF()) {
                        objLJJJ = Unit.LIZ;
                    }
                }
            } else {
                objLJJJ = C0LTN.LJJJ(c544010LVf, C0LSZ.LIZ(c544010LVf.LIZLLL, null, null, null, null, null, null, null, 10, null, null, null, 0, null, null, null, 0, null, null, null, 0L, taskDetail.getTaskId(), 0L, null, null, null, 0, null, 266338175), this);
                if (objLJJJ != C099R.LJFF()) {
                    objLJJJ = Unit.LIZ;
                }
            }
            if (objLJJJ == objLJFF) {
                C1C7U.LIZIZ("Text2ImageProgressTask@31bc.requestProgress$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("Text2ImageProgressTask@31bc.requestProgress$2");
        return unit;
    }
}
