package X;

import com.bytedance.android.livesdk.guide.model.TaskInfo;

/* JADX INFO: renamed from: X.0fdG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1134640fdG {
    public static final void LIZJ(TaskInfo taskInfo, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('\n');
        C20441214yg.LJIIL("IncentiveDebug", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sb = new StringBuilder();
        LIZ(taskInfo, sb, 0);
        C20441214yg.LJIIIZ("IncentiveDebug", "[Task Tree]:\n");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append((Object) sb);
        sbLIZ2.append(" \n");
        C20441214yg.LJIIIZ("IncentiveDebug", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static final void LIZLLL(TaskInfo taskInfo, String str) {
        EnumC1134460fcy enumC1134460fcyLIZIZ = C1134430fcv.LIZIZ(taskInfo.taskStatus);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('\n');
        C20441214yg.LJIIL("IncentiveDebug", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[type]:");
        sbLIZ2.append(taskInfo.taskType);
        sbLIZ2.append(", [id]:");
        sbLIZ2.append(taskInfo.taskId);
        sbLIZ2.append(", [status]:");
        sbLIZ2.append(enumC1134460fcyLIZIZ);
        C20441214yg.LJIIIZ("IncentiveDebug", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static final void LJ(C1134410fct c1134410fct, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('\n');
        C20441214yg.LJIIL("IncentiveDebug", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sb = new StringBuilder();
        LIZIZ(c1134410fct, sb, 0);
        C20441214yg.LJIIIZ("IncentiveDebug", "[Task Tree]:\n");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append((Object) sb);
        sbLIZ2.append(" \n");
        C20441214yg.LJIIIZ("IncentiveDebug", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static final void LIZ(TaskInfo taskInfo, StringBuilder sb, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(i);
        sbLIZ.append("] [type]:");
        sbLIZ.append(taskInfo.taskType);
        sbLIZ.append(", [id]:");
        sbLIZ.append(taskInfo.taskId);
        sbLIZ.append(", [status]:");
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(C1134430fcv.LIZIZ(taskInfo.taskStatus));
        sbLIZ2.append(" \n");
        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        for (TaskInfo taskInfo2 : taskInfo.subTasks) {
            if (i >= 0) {
                int i2 = 0;
                while (true) {
                    sb.append("  ");
                    if (i2 != i) {
                        i2++;
                    }
                }
            }
            sb.append("->");
            LIZ(taskInfo2, sb, i + 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZIZ(C1134410fct c1134410fct, StringBuilder sb, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(i);
        sbLIZ.append("] [type]:");
        sbLIZ.append(((TaskInfo) c1134410fct.LIZ).taskType);
        sbLIZ.append(", [id]:");
        sbLIZ.append(c1134410fct.LJI);
        sbLIZ.append(", [status]:");
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(c1134410fct.LIZJ());
        sbLIZ2.append(" \n");
        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        for (S s : c1134410fct.LJ) {
            if (i >= 0) {
                int i2 = 0;
                while (true) {
                    sb.append("  ");
                    if (i2 != i) {
                        i2++;
                    }
                }
            }
            sb.append("->");
            LIZIZ(s, sb, i + 1);
        }
    }
}
