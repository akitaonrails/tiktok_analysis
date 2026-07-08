package X;

import com.bytedance.android.livesdk.guide.model.TaskInfo;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0fcv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1134430fcv {
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final C1134410fct LIZ(TaskInfo taskInfo) {
        if (taskInfo.taskStatus == 0) {
            return null;
        }
        C1134410fct c1134410fct = new C1134410fct(taskInfo);
        EnumC1134460fcy enumC1134460fcyLIZIZ = LIZIZ(taskInfo.taskStatus);
        if (enumC1134460fcyLIZIZ != null) {
            c1134410fct.LJIIL(enumC1134460fcyLIZIZ);
        }
        Iterator<TaskInfo> it2 = taskInfo.subTasks.iterator();
        while (it2.hasNext()) {
            C1134410fct c1134410fctLIZ = LIZ(it2.next());
            if (c1134410fctLIZ != null) {
                c1134410fct.LJ.add(c1134410fctLIZ);
                c1134410fctLIZ.LJFF = c1134410fct;
            }
        }
        return c1134410fct;
    }

    public static final EnumC1134460fcy LIZIZ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return EnumC1134460fcy.TASK_EXPIRED;
                        }
                        return EnumC1134460fcy.TASK_EXIT;
                    }
                    return EnumC1134460fcy.TASK_TO_REWARD;
                }
                return EnumC1134460fcy.TASK_IN_PROGRESS;
            }
            return EnumC1134460fcy.TASK_ENTER;
        }
        return EnumC1134460fcy.TASK_UNKNOWN;
    }

    public static final int LIZJ(EnumC1134460fcy enumC1134460fcy) {
        switch (C1134470fcz.LIZ[enumC1134460fcy.ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
            case 4:
                return 3;
            case 5:
            case 6:
                return 4;
            case 7:
                return 5;
            default:
                return 0;
        }
    }
}
