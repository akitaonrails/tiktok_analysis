package X;

import com.bytedance.android.livesdk.guide.model.RewardProcess;
import com.bytedance.android.livesdk.guide.model.TaskInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0fdg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1134900fdg {
    public static final boolean LIZIZ(C1134410fct c1134410fct) {
        if (c1134410fct.LIZJ() != EnumC1134460fcy.TASK_IN_PROGRESS) {
            return false;
        }
        List<S> list = c1134410fct.LJ;
        if (!list.isEmpty()) {
            if (list.isEmpty()) {
                return false;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (LIZIZ((C1134410fct) it2.next())) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int LIZ(C1134410fct c1134410fct, Integer num) {
        int i;
        List<RewardProcess> list = ((TaskInfo) c1134410fct.LIZ).rewardList;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<RewardProcess> it2 = list.iterator();
            while (true) {
                i = 0;
                if (!it2.hasNext()) {
                    break;
                }
                RewardProcess next = it2.next();
                RewardProcess rewardProcess = next;
                if (num == null || rewardProcess.rewardType == num.intValue()) {
                    arrayList.add(next);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                i += (int) ((RewardProcess) it3.next()).rewardAmount;
            }
            return i;
        }
        return (int) ((TaskInfo) c1134410fct.LIZ).rewardAmount;
    }
}
