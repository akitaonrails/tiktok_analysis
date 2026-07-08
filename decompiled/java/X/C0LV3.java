package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.aigc.asynctask.AIGCServerTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.TaskLogExtra;
import com.ss.android.ugc.aweme.aigc.asynctask.net.AIGCResultUrl;
import com.ss.android.ugc.aweme.aigc.asynctask.net.AIGCTaskResult;
import com.ss.android.ugc.aweme.aigc.asynctask.net.TaskDetail;
import com.ss.android.ugc.aweme.aigc.asynctask.net.TasksDetailResponse;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCResultType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0LV3, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.GeneralI2VServerTask$requestProgress$2", f = "GeneralI2VServerTask.kt", l = {320}, m = "invokeSuspend")
public final class C0LV3 extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TasksDetailResponse LLILLJJLI;
    public final /* synthetic */ C543820LUm LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LV3(TasksDetailResponse tasksDetailResponse, C543820LUm c543820LUm, String str, InterfaceC1364105Vn<? super C0LV3> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = tasksDetailResponse;
        this.LLILLL = c543820LUm;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LV3(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        TaskDetail next;
        Object objLJJJ;
        String str;
        AIGCResultType aIGCResultType;
        String str2;
        List<AIGCResultUrl> list;
        String str3;
        List<AIGCResultUrl> list2;
        List<AIGCResultUrl> list3;
        AIGCResultUrl aIGCResultUrl;
        C1C7U.LIZ("GeneralI2VServerTask@4e5.requestProgress$2");
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
            List<TaskDetail> taskStatuses = this.LLILLJJLI.getTaskStatuses();
            String str4 = this.LLILZ;
            Iterator<TaskDetail> it2 = taskStatuses.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.getTaskId(), str4)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            TaskDetail taskDetail = next;
            if (taskDetail == null) {
                C1C7U.LIZIZ("GeneralI2VServerTask@4e5.requestProgress$2");
                return null;
            }
            C543820LUm c543820LUm = this.LLILLL;
            this.LL = 1;
            c543820LUm.getClass();
            int jobStatus = taskDetail.getJobStatus();
            if (jobStatus != 1) {
                if (jobStatus != 2) {
                    if (jobStatus != 3) {
                        objLJJJ = C539400LDm.LIZ(c543820LUm, taskDetail.getJobStatus(), taskDetail.getStatusMessage(), null, null, this, 12);
                        if (objLJJJ != C099R.LJFF()) {
                            objLJJJ = Unit.LIZ;
                        }
                    } else {
                        AIGCTaskResult aIGCTaskResult = (AIGCTaskResult) C13LP.LJJJLZIJ(0, taskDetail.getResults());
                        String str5 = "";
                        if (aIGCTaskResult == null || (list3 = aIGCTaskResult.resultUrls) == null || (aIGCResultUrl = (AIGCResultUrl) C13LP.LJJJLZIJ(0, list3)) == null || (str = aIGCResultUrl.originalUrl) == null) {
                            str = "";
                        }
                        c543820LUm.LJIIJ = str;
                        AIGCTaskResult aIGCTaskResult2 = (AIGCTaskResult) C13LP.LJJJLL(taskDetail.getResults());
                        if (aIGCTaskResult2 == null || (aIGCResultType = aIGCTaskResult2.resultType) == null) {
                            aIGCResultType = AIGCResultType.VIDEO;
                        }
                        c543820LUm.LJIIJJI = aIGCResultType;
                        SettingsManager.LIZLLL().getClass();
                        if (!SettingsManager.LIZ("aigc_offline_process_server_task_url_killswitch", false)) {
                            if (c543820LUm.LJIIJ.length() > 0) {
                                AIGCTaskResult aIGCTaskResult3 = (AIGCTaskResult) C13LP.LJJJLZIJ(0, taskDetail.getResults());
                                if (aIGCTaskResult3 != null && (list2 = aIGCTaskResult3.resultUrls) != null) {
                                    for (AIGCResultUrl aIGCResultUrl2 : list2) {
                                        List<AIGCServerTaskOutput> list4 = c543820LUm.LJIIL;
                                        String str6 = aIGCResultUrl2.originalUrl;
                                        if (str6 == null) {
                                            str6 = "";
                                        }
                                        String str7 = aIGCResultUrl2.thumbnailUrl;
                                        if (str7 == null) {
                                            str7 = "";
                                        }
                                        ((ArrayList) list4).add(new AIGCServerTaskOutput(str6, str7));
                                    }
                                }
                                AIGCTaskResult aIGCTaskResult4 = (AIGCTaskResult) C13LP.LJJJLZIJ(0, taskDetail.getResults());
                                if (aIGCTaskResult4 != null && (str3 = aIGCTaskResult4.extra) != null) {
                                    str5 = str3;
                                }
                                c543820LUm.LJIILIIL = str5;
                                c543820LUm.LJJIJIIJIL(true);
                                objLJJJ = C0LTN.LJJJ(c543820LUm, C0LSZ.LIZ(c543820LUm.LIZLLL, null, null, null, null, "FINISHED", null, null, 100, null, null, null, 0, null, null, null, 0, null, null, null, 0L, null, 0L, null, null, null, 0, null, 264241007), this);
                                if (objLJJJ != C099R.LJFF()) {
                                    objLJJJ = Unit.LIZ;
                                }
                            } else {
                                objLJJJ = Unit.LIZ;
                            }
                        } else {
                            AIGCTaskResult aIGCTaskResult5 = (AIGCTaskResult) C13LP.LJJJLZIJ(0, taskDetail.getResults());
                            if (aIGCTaskResult5 != null && (list = aIGCTaskResult5.resultUrls) != null) {
                                for (AIGCResultUrl aIGCResultUrl3 : list) {
                                    List<AIGCServerTaskOutput> list5 = c543820LUm.LJIIL;
                                    String str8 = aIGCResultUrl3.originalUrl;
                                    if (str8 == null) {
                                        str8 = "";
                                    }
                                    String str9 = aIGCResultUrl3.thumbnailUrl;
                                    if (str9 == null) {
                                        str9 = "";
                                    }
                                    ((ArrayList) list5).add(new AIGCServerTaskOutput(str8, str9));
                                }
                            }
                            AIGCTaskResult aIGCTaskResult6 = (AIGCTaskResult) C13LP.LJJJLZIJ(0, taskDetail.getResults());
                            if (aIGCTaskResult6 != null && (str2 = aIGCTaskResult6.extra) != null) {
                                str5 = str2;
                            }
                            c543820LUm.LJIILIIL = str5;
                            c543820LUm.LJJIJIIJIL(true);
                            objLJJJ = C0LTN.LJJJ(c543820LUm, C0LSZ.LIZ(c543820LUm.LIZLLL, null, null, null, null, "FINISHED", null, null, 100, null, null, null, 0, null, null, null, 0, null, null, null, 0L, null, 0L, null, null, null, 0, null, 264241007), this);
                            if (objLJJJ != C099R.LJFF()) {
                                objLJJJ = Unit.LIZ;
                            }
                        }
                    }
                } else {
                    objLJJJ = C0LTN.LJJJ(c543820LUm, C0LSZ.LIZ(c543820LUm.LIZLLL, null, null, null, null, null, null, null, (int) (((double) 10) + (((double) taskDetail.getCompletePercentage()) * 0.9d)), null, null, null, 0, null, null, null, 0, null, null, null, 0L, null, taskDetail.getWaitingTime(), TaskLogExtra.LIZ(c543820LUm.LIZLLL.LJJ, null, null, null, null, 2, null, null, null, null, false, null, 1044479), null, null, 0, null, 255852415), this);
                    if (objLJJJ != C099R.LJFF()) {
                        objLJJJ = Unit.LIZ;
                    }
                }
            } else {
                objLJJJ = C0LTN.LJJJ(c543820LUm, C0LSZ.LIZ(c543820LUm.LIZLLL, null, null, null, null, null, null, null, 10, null, null, null, 0, null, null, null, 0, null, null, null, 0L, taskDetail.getTaskId(), 0L, null, null, null, 0, null, 266338175), this);
                if (objLJJJ != C099R.LJFF()) {
                    objLJJJ = Unit.LIZ;
                }
            }
            if (objLJJJ == objLJFF) {
                C1C7U.LIZIZ("GeneralI2VServerTask@4e5.requestProgress$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GeneralI2VServerTask@4e5.requestProgress$2");
        return unit;
    }
}
