package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0czj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1033250czj {
    public static final C1033250czj LIZ = new C1033250czj();
    public static final ConcurrentHashMap<String, C1033510d09> LIZIZ = new ConcurrentHashMap<>();

    public final synchronized C1033350czt LIZ(C1033320czq c1033320czq) {
        String strLIZ = c1033320czq.LIZ();
        ConcurrentHashMap<String, C1033510d09> concurrentHashMap = LIZIZ;
        C1033510d09 c1033510d09 = concurrentHashMap.get(strLIZ);
        if (c1033510d09 == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get preReqId failed cause null. key:");
            sbLIZ.append(c1033320czq);
            C2188811AlT.LIZIZ(sbLIZ);
            return new C1033350czt(false, null, null, null, 1, 14);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis > c1033510d09.LIZIZ * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("get preReqId failed cause expire. key:");
            sbLIZ2.append(c1033320czq);
            sbLIZ2.append(" currentTime:");
            sbLIZ2.append(jCurrentTimeMillis);
            sbLIZ2.append(" expireTime:");
            sbLIZ2.append(c1033510d09.LIZIZ);
            C2188811AlT.LIZIZ(sbLIZ2);
            concurrentHashMap.remove(strLIZ);
            return new C1033350czt(false, null, Long.valueOf(c1033510d09.LIZIZ), Long.valueOf(jCurrentTimeMillis), 2, 2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("get preReqId success. key:");
        sbLIZ3.append(c1033320czq);
        sbLIZ3.append(" preReqId:");
        sbLIZ3.append(c1033510d09.LIZ);
        C2188811AlT.LIZIZ(sbLIZ3);
        return new C1033350czt(true, c1033510d09.LIZ, null, null, null, 28);
    }

    public final synchronized void LIZIZ(C1033320czq c1033320czq, String str, long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("save preReqId success. key:");
        sbLIZ.append(c1033320czq);
        sbLIZ.append(" preReqId:");
        sbLIZ.append(str);
        sbLIZ.append(" expireTime:");
        sbLIZ.append(j);
        C2188811AlT.LIZIZ(sbLIZ);
        LIZIZ.put(c1033320czq.LIZ(), new C1033510d09(str, j));
    }
}
