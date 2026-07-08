package X;

import com.ss.android.ugc.aweme.aigc.graph.net.AIGCWorkflowNetApi;
import com.ss.android.ugc.aweme.aigc.graph.net.CreateTaskBody;
import com.ss.android.ugc.aweme.aigc.graph.net.GenerateTaskBody;
import com.ss.android.ugc.aweme.aigc.graph.net.TaskDiscardBody;
import java.util.List;

/* JADX INFO: renamed from: X.0LuG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C557820LuG {
    public static Object LIZ(AIGCWorkflowNetApi aIGCWorkflowNetApi, TaskDiscardBody taskDiscardBody, C557790LuD c557790LuD) {
        AIGCWorkflowNetApi.LIZ.getClass();
        return aIGCWorkflowNetApi.cancelAIGCTask(C557830LuH.LIZIZ, taskDiscardBody, c557790LuD);
    }

    public static Object LIZIZ(AIGCWorkflowNetApi aIGCWorkflowNetApi, CreateTaskBody createTaskBody, C557770LuB c557770LuB) {
        AIGCWorkflowNetApi.LIZ.getClass();
        return aIGCWorkflowNetApi.createAIGCTaskWithTimeout(C557830LuH.LIZIZ, createTaskBody, c557770LuB);
    }

    public static Object LIZJ(AIGCWorkflowNetApi aIGCWorkflowNetApi, GenerateTaskBody generateTaskBody, C557780LuC c557780LuC) {
        AIGCWorkflowNetApi.LIZ.getClass();
        return aIGCWorkflowNetApi.generateAIGCTaskWithTimeout(C557830LuH.LIZIZ, generateTaskBody, c557780LuC);
    }

    public static Object LIZLLL(AIGCWorkflowNetApi aIGCWorkflowNetApi, String str, String str2, C557810LuF c557810LuF) {
        AIGCWorkflowNetApi.LIZ.getClass();
        return aIGCWorkflowNetApi.getAIGCQuota(C557830LuH.LIZIZ, null, str, str2, c557810LuF);
    }

    public static Object LJ(AIGCWorkflowNetApi aIGCWorkflowNetApi, List list, Boolean bool, C557800LuE c557800LuE) {
        AIGCWorkflowNetApi.LIZ.getClass();
        return aIGCWorkflowNetApi.getAIGCTaskList(C557830LuH.LIZIZ, list, null, null, null, null, bool, null, null, c557800LuE);
    }
}
