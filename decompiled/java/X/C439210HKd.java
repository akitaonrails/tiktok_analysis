package X;

import com.ss.android.ugc.aweme.socialavatar.network.AIGCTask;
import com.ss.android.ugc.aweme.socialavatar.network.AIGCTaskResponse;
import java.util.List;

/* JADX INFO: renamed from: X.0HKd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C439210HKd {
    public static final boolean LIZ(AIGCTaskResponse aIGCTaskResponse) {
        AIGCTask aIGCTask;
        Integer status;
        List<AIGCTask> taskStatusList = aIGCTaskResponse.getTaskStatusList();
        if (taskStatusList != null && (aIGCTask = (AIGCTask) C13LP.LJJJJZI(taskStatusList)) != null && (status = aIGCTask.getStatus()) != null && status.intValue() == 3) {
            return true;
        }
        return false;
    }
}
