package X;

import com.bytedance.android.livesdk.guide.model.TaskInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0fd2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1134500fd2 {
    public static int LIZ;
    public static int LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ(List<? extends C1134410fct> list, List<C1134410fct> list2) {
        for (C1134410fct c1134410fct : list) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Checking task: id=");
            sbLIZ.append(c1134410fct.LJI);
            sbLIZ.append(", type=");
            sbLIZ.append(((TaskInfo) c1134410fct.LIZ).taskType);
            sbLIZ.append(", targetType=");
            sbLIZ.append(((TaskInfo) c1134410fct.LIZ).targetType);
            sbLIZ.append(", hasSub=");
            sbLIZ.append(!c1134410fct.LJ.isEmpty());
            sbLIZ.append(", targetNum=");
            sbLIZ.append(((TaskInfo) c1134410fct.LIZ).taskCompleteTargetNum);
            C20441214yg.LJIIIZ("TaskPostProcess", C2188811AlT.LIZIZ(sbLIZ));
            if (!c1134410fct.LJ.isEmpty()) {
                LIZ(c1134410fct.LJ, list2);
            } else if (C1134900fdg.LIZIZ(c1134410fct)) {
                TaskInfo taskInfo = (TaskInfo) c1134410fct.LIZ;
                if (taskInfo.targetType == 1) {
                    long j = taskInfo.taskCompleteTargetNum;
                    if (j > 0 && taskInfo.taskType != 1 && taskInfo.taskCompletedNum < j) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("WatchLiveDurationTask matched: taskId=");
                        sbLIZ2.append(c1134410fct.LJI);
                        sbLIZ2.append(", targetTime=");
                        sbLIZ2.append(((TaskInfo) c1134410fct.LIZ).taskCompleteTargetNum);
                        C20441214yg.LJIIIZ("TaskPostProcess", C2188811AlT.LIZIZ(sbLIZ2));
                        ((ArrayList) list2).add(c1134410fct);
                    }
                }
            }
        }
    }
}
