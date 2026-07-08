package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveGiftThroughputQueueSetting;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0eq6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1104160eq6 {
    public final LinkedList<Long> LIZ = new LinkedList<>();
    public final LinkedList<Long> LIZIZ = new LinkedList<>();

    public final synchronized void LIZ() {
        if (LiveGiftThroughputQueueSetting.INSTANCE.isEnabled()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("msg display, ");
            sbLIZ.append(C13LP.LJJJLL(this.LIZIZ));
            C20441214yg.LIZIZ("LiveGiftThroughputQueue", C2188811AlT.LIZIZ(sbLIZ));
            this.LIZIZ.add(Long.valueOf(C158B.LIZ()));
        }
    }

    public final synchronized int LIZIZ() {
        int i = 0;
        if (!LiveGiftThroughputQueueSetting.INSTANCE.isEnabled()) {
            return 0;
        }
        LinkedList<Long> linkedList = this.LIZ;
        if (linkedList.isEmpty()) {
            return 0;
        }
        long jLIZ = C158B.LIZ();
        while ((!linkedList.isEmpty()) && jLIZ - ((Number) C13LP.LJJJJZI(linkedList)).longValue() >= 60000) {
            i++;
            C19719612Di.LJJIIZI(linkedList);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onThroughputArrivalQueue, arrival num");
        sbLIZ.append(i);
        sbLIZ.append(" queuesize");
        sbLIZ.append(this.LIZ.size());
        C20441214yg.LIZIZ("LiveGiftThroughputQueue", C2188811AlT.LIZIZ(sbLIZ));
        return linkedList.size();
    }

    public final synchronized int LIZJ() {
        int i = 0;
        if (!LiveGiftThroughputQueueSetting.INSTANCE.isEnabled()) {
            return 0;
        }
        LinkedList<Long> linkedList = this.LIZIZ;
        if (linkedList.isEmpty()) {
            return 0;
        }
        long jLIZ = C158B.LIZ();
        while ((!linkedList.isEmpty()) && jLIZ - ((Number) C13LP.LJJJJZI(linkedList)).longValue() >= 60000) {
            i++;
            C19719612Di.LJJIIZI(linkedList);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onThroughputDisplayQueue,displayNum:");
        sbLIZ.append(i);
        sbLIZ.append(" ,queue number");
        sbLIZ.append(this.LIZIZ.size());
        C20441214yg.LIZIZ("LiveGiftThroughputQueue", C2188811AlT.LIZIZ(sbLIZ));
        return linkedList.size();
    }
}
