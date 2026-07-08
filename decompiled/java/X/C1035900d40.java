package X;

import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.0d40, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1035900d40 implements Serializable {
    public AtomicInteger cancelByDurationCount;
    public AtomicInteger cancelByMaxReuseCount;
    public AtomicInteger cancelByStatusCount;
    public AtomicInteger cancelByTypeCount;
    public final ConcurrentHashMap<String, C1533910q1F> operationMap;
    public InterfaceC1040070dAj prefetchTaskMonitor;
    public transient C1533900q1E resourceGroup;
    public AtomicLong totalDuration;

    public C1035900d40() {
        this(new ConcurrentHashMap(), null, null, new AtomicInteger(0), new AtomicInteger(0), new AtomicInteger(0), new AtomicInteger(0), new AtomicLong(0L));
    }

    public final C1035900d40 copy(ConcurrentHashMap<String, C1533910q1F> concurrentHashMap, InterfaceC1040070dAj interfaceC1040070dAj, C1533900q1E c1533900q1E, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, AtomicInteger atomicInteger3, AtomicInteger atomicInteger4, AtomicLong atomicLong) {
        return new C1035900d40(concurrentHashMap, interfaceC1040070dAj, c1533900q1E, atomicInteger, atomicInteger2, atomicInteger3, atomicInteger4, atomicLong);
    }

    public int hashCode() {
        int iHashCode = this.operationMap.hashCode() * 31;
        InterfaceC1040070dAj interfaceC1040070dAj = this.prefetchTaskMonitor;
        int iHashCode2 = (iHashCode + (interfaceC1040070dAj == null ? 0 : interfaceC1040070dAj.hashCode())) * 31;
        C1533900q1E c1533900q1E = this.resourceGroup;
        return ((((((((((iHashCode2 + (c1533900q1E != null ? c1533900q1E.hashCode() : 0)) * 31) + this.cancelByStatusCount.hashCode()) * 31) + this.cancelByTypeCount.hashCode()) * 31) + this.cancelByMaxReuseCount.hashCode()) * 31) + this.cancelByDurationCount.hashCode()) * 31) + this.totalDuration.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdWebResourceModel(operationMap=");
        sbLIZ.append(this.operationMap);
        sbLIZ.append(", prefetchTaskMonitor=");
        sbLIZ.append(this.prefetchTaskMonitor);
        sbLIZ.append(", resourceGroup=");
        sbLIZ.append(this.resourceGroup);
        sbLIZ.append(", cancelByStatusCount=");
        sbLIZ.append(this.cancelByStatusCount);
        sbLIZ.append(", cancelByTypeCount=");
        sbLIZ.append(this.cancelByTypeCount);
        sbLIZ.append(", cancelByMaxReuseCount=");
        sbLIZ.append(this.cancelByMaxReuseCount);
        sbLIZ.append(", cancelByDurationCount=");
        sbLIZ.append(this.cancelByDurationCount);
        sbLIZ.append(", totalDuration=");
        sbLIZ.append(this.totalDuration);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setCancelByDurationCount(AtomicInteger atomicInteger) {
        this.cancelByDurationCount = atomicInteger;
    }

    public final void setCancelByMaxReuseCount(AtomicInteger atomicInteger) {
        this.cancelByMaxReuseCount = atomicInteger;
    }

    public final void setCancelByStatusCount(AtomicInteger atomicInteger) {
        this.cancelByStatusCount = atomicInteger;
    }

    public final void setCancelByTypeCount(AtomicInteger atomicInteger) {
        this.cancelByTypeCount = atomicInteger;
    }

    public final void setPrefetchTaskMonitor(InterfaceC1040070dAj interfaceC1040070dAj) {
        this.prefetchTaskMonitor = interfaceC1040070dAj;
    }

    public final void setResourceGroup(C1533900q1E c1533900q1E) {
        this.resourceGroup = c1533900q1E;
    }

    public final void setTotalDuration(AtomicLong atomicLong) {
        this.totalDuration = atomicLong;
    }

    public C1035900d40(ConcurrentHashMap<String, C1533910q1F> concurrentHashMap, InterfaceC1040070dAj interfaceC1040070dAj, C1533900q1E c1533900q1E, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, AtomicInteger atomicInteger3, AtomicInteger atomicInteger4, AtomicLong atomicLong) {
        this.operationMap = concurrentHashMap;
        this.prefetchTaskMonitor = interfaceC1040070dAj;
        this.resourceGroup = c1533900q1E;
        this.cancelByStatusCount = atomicInteger;
        this.cancelByTypeCount = atomicInteger2;
        this.cancelByMaxReuseCount = atomicInteger3;
        this.cancelByDurationCount = atomicInteger4;
        this.totalDuration = atomicLong;
    }
}
