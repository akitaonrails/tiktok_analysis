package X;

import com.ss.android.ugc.aweme.aigc.graph.net.CreateTaskResponse;
import com.ss.android.ugc.aweme.aigc.graph.net.LogPB;
import com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Ll1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C552090Ll1<OUT> implements InterfaceC552870LmH {
    public static final C552090Ll1<OUT> LIZ = new C552090Ll1<>();

    @Override // X.InterfaceC552870LmH
    public final Object LIZ(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String imprId;
        CreateTaskResponse createTaskResponse = (CreateTaskResponse) obj;
        Pair[] pairArr = new Pair[3];
        C552640Llu.INSTANCE.getClass();
        String str = createTaskResponse.taskId;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("server_task_id", ((AIGCWorkflowArtifactFactory) ServiceManager.get().getService(AIGCWorkflowArtifactFactory.class, false, false)).LIZ(str));
        C552570Lln.INSTANCE.getClass();
        LogPB logPB = createTaskResponse.logPb;
        if (logPB != null && (imprId = logPB.getImprId()) != null) {
            str2 = imprId;
        }
        pairArr[1] = new Pair("log_id", ((AIGCWorkflowArtifactFactory) ServiceManager.get().getService(AIGCWorkflowArtifactFactory.class, false, false)).LIZ(str2));
        C552500Llg.INSTANCE.getClass();
        Object obj2 = createTaskResponse.remainQuotas;
        if (obj2 == null) {
            obj2 = C13BV.INSTANCE;
        }
        pairArr[2] = new Pair("server_remain_quotas", ((AIGCWorkflowArtifactFactory) ServiceManager.get().getService(AIGCWorkflowArtifactFactory.class, false, false)).LIZ(obj2));
        return C2097608Jq.LJIIIIZZ(pairArr);
    }
}
