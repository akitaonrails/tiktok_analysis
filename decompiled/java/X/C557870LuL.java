package X;

import com.ss.android.ugc.aweme.aigc.asynctask.net.AIGCTaskNetApiV2;
import com.ss.android.ugc.aweme.aigc.asynctask.net.CreateTaskBody;
import com.ss.android.ugc.aweme.aigc.asynctask.net.TaskDiscardBody;
import java.util.List;

/* JADX INFO: renamed from: X.0LuL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C557870LuL {
    public static Object LIZ(AIGCTaskNetApiV2 aIGCTaskNetApiV2, TaskDiscardBody taskDiscardBody, C557940LuS c557940LuS) {
        AIGCTaskNetApiV2.LIZ.getClass();
        return aIGCTaskNetApiV2.cancelAIGCTask(C558020Lua.LIZIZ, taskDiscardBody, c557940LuS);
    }

    public static Object LIZIZ(AIGCTaskNetApiV2 aIGCTaskNetApiV2, CreateTaskBody createTaskBody, C557900LuO c557900LuO) {
        AIGCTaskNetApiV2.LIZ.getClass();
        return aIGCTaskNetApiV2.createAIGCTask(C558020Lua.LIZIZ, createTaskBody, c557900LuO);
    }

    public static Object LIZJ(AIGCTaskNetApiV2 aIGCTaskNetApiV2, CreateTaskBody createTaskBody, C557880LuM c557880LuM) {
        AIGCTaskNetApiV2.LIZ.getClass();
        return aIGCTaskNetApiV2.createAIGCTaskWithTimeout(C558020Lua.LIZIZ, createTaskBody, c557880LuM);
    }

    public static Object LJ(AIGCTaskNetApiV2 aIGCTaskNetApiV2, List list, Boolean bool, C557960LuU c557960LuU) {
        AIGCTaskNetApiV2.LIZ.getClass();
        return aIGCTaskNetApiV2.getAIGCTaskList(C558020Lua.LIZIZ, list, null, null, null, null, bool, null, null, c557960LuU);
    }

    public static Object LIZLLL(AIGCTaskNetApiV2 aIGCTaskNetApiV2, List list, String str, String str2, C557950LuT c557950LuT) {
        AIGCTaskNetApiV2.LIZ.getClass();
        return aIGCTaskNetApiV2.getAIGCQuota(C558020Lua.LIZIZ, list, str, str2, c557950LuT);
    }
}
