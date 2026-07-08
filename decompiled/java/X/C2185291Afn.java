package X;

import com.ss.android.ugc.aweme.boost.ThreadBoostConfig;
import com.ss.android.ugc.aweme.boost.ThreadBoostConfigs;
import com.ss.android.ugc.aweme.boost.ThreadCpuCoreConfig;
import com.ss.android.ugc.aweme.boost.ThreadPriorityConfig;
import com.ss.android.ugc.aweme.boost.ThreadSuspendConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.1Afn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2185291Afn {
    public static final List<C2185491Ag7> LIZ(ThreadBoostConfigs threadBoostConfigs) {
        ArrayList arrayList = new ArrayList();
        if (threadBoostConfigs.enableStrategy && ((!threadBoostConfigs.residentThreadConfig.threadPriorityConfigs.isEmpty()) || (!threadBoostConfigs.residentThreadConfig.threadCpuCoreConfigs.isEmpty()) || (!threadBoostConfigs.residentThreadConfig.threadSuspendConfigs.isEmpty()))) {
            ThreadBoostConfig threadBoostConfig = threadBoostConfigs.residentThreadConfig;
            long j = threadBoostConfig.holdTime;
            long j2 = threadBoostConfig.timeout;
            boolean z = threadBoostConfig.reFetchAfterPolling;
            boolean z2 = threadBoostConfig.reBoostAfterPolling;
            boolean z3 = threadBoostConfig.enablePollingAfterStop;
            boolean z4 = threadBoostConfig.reFetchThreadInfo;
            long j3 = threadBoostConfig.boostStopInterval;
            List<ThreadPriorityConfig> list = threadBoostConfig.threadPriorityConfigs;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (ThreadPriorityConfig threadPriorityConfig : list) {
                arrayList2.add(new C2185521AgA(threadPriorityConfig.threadName, threadPriorityConfig.threadValueDiff));
            }
            List<ThreadCpuCoreConfig> list2 = threadBoostConfigs.residentThreadConfig.threadCpuCoreConfigs;
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (ThreadCpuCoreConfig threadCpuCoreConfig : list2) {
                arrayList3.add(new C2185471Ag5(threadCpuCoreConfig.threadName, threadCpuCoreConfig.cpuBindCoreType));
            }
            List<ThreadSuspendConfig> list3 = threadBoostConfigs.residentThreadConfig.threadSuspendConfigs;
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list3, 10));
            Iterator<ThreadSuspendConfig> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(new C2185421Ag0(it2.next().threadName));
            }
            arrayList.add(new C2185491Ag7(1, arrayList2, arrayList3, arrayList4, j2, j, z, z2, z3, z4, j3));
        }
        if (threadBoostConfigs.enableStrategy && ((!threadBoostConfigs.nonResidentThreadConfig.threadPriorityConfigs.isEmpty()) || (!threadBoostConfigs.nonResidentThreadConfig.threadCpuCoreConfigs.isEmpty()) || (!threadBoostConfigs.nonResidentThreadConfig.threadSuspendConfigs.isEmpty()))) {
            ThreadBoostConfig threadBoostConfig2 = threadBoostConfigs.nonResidentThreadConfig;
            long j4 = threadBoostConfig2.timeout;
            List<ThreadPriorityConfig> list4 = threadBoostConfig2.threadPriorityConfigs;
            ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(list4, 10));
            for (ThreadPriorityConfig threadPriorityConfig2 : list4) {
                arrayList5.add(new C2185521AgA(threadPriorityConfig2.threadName, threadPriorityConfig2.threadValueDiff));
            }
            List<ThreadCpuCoreConfig> list5 = threadBoostConfigs.nonResidentThreadConfig.threadCpuCoreConfigs;
            ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(list5, 10));
            for (ThreadCpuCoreConfig threadCpuCoreConfig2 : list5) {
                arrayList6.add(new C2185471Ag5(threadCpuCoreConfig2.threadName, threadCpuCoreConfig2.cpuBindCoreType));
            }
            List<ThreadSuspendConfig> list6 = threadBoostConfigs.nonResidentThreadConfig.threadSuspendConfigs;
            ArrayList arrayList7 = new ArrayList(C15438062q.LJIJJ(list6, 10));
            Iterator<ThreadSuspendConfig> it3 = list6.iterator();
            while (it3.hasNext()) {
                arrayList7.add(new C2185421Ag0(it3.next().threadName));
            }
            arrayList.add(new C2185491Ag7(2, arrayList5, arrayList6, arrayList7, j4, 0L, false, false, false, 2016));
        }
        return arrayList;
    }
}
