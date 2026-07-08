package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.frequencycontrol.api.IFrequencyControlSyncService;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0543, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0543 implements IFrequencyControlSyncService {
    public static final AnonymousClass0543 LIZ = new AnonymousClass0543();

    @Override // com.ss.android.ugc.aweme.im.frequencycontrol.api.IFrequencyControlSyncService
    public final InterfaceC12999056v LIZJ(String str) {
        return C12985056h.LJ(str);
    }

    @Override // com.ss.android.ugc.aweme.im.frequencycontrol.api.IFrequencyControlSyncService
    public final InterfaceC12999056v LIZ(String str, AnonymousClass0547 anonymousClass0547) {
        Object objPutIfAbsent;
        InterfaceC12999056v interfaceC12999056vLJ = C12985056h.LJ(str);
        if (interfaceC12999056vLJ == null) {
            return null;
        }
        String taskId = anonymousClass0547.getTaskId();
        if (taskId.length() == 0) {
            return interfaceC12999056vLJ;
        }
        C13002056y.LIZ.getClass();
        if (C13002056y.LJFF(str, taskId)) {
            return interfaceC12999056vLJ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('|');
        sbLIZ.append(taskId);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ConcurrentHashMap<String, Object> concurrentHashMap = C1092704Pd.LIZ;
        Object obj = concurrentHashMap.get(strLIZIZ);
        if (obj == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(strLIZIZ, (obj = new Object()))) != null) {
            obj = objPutIfAbsent;
        }
        synchronized (obj) {
            try {
                if (C13002056y.LJFF(str, taskId)) {
                    return interfaceC12999056vLJ;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("getSyncUnit: running migrate scene=");
                sbLIZ2.append(str);
                sbLIZ2.append(" taskId=");
                sbLIZ2.append(taskId);
                C2188811AlT.LIZIZ(sbLIZ2);
                anonymousClass0547.LIZ(interfaceC12999056vLJ);
                C13002056y.LJIIIZ(str, taskId);
                return interfaceC12999056vLJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
