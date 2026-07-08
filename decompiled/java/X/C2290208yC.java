package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.08yC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2290208yC {
    public static void LIZ(String str, String str2) {
        C11PQ<String> c11pqPutIfAbsent;
        if (C2292008yU.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BaseAIMusicUploadFrameTask notifyZipFilePathReady.zipPath:");
            sbLIZ.append(str2);
            sbLIZ.append(" creationId:");
            sbLIZ.append(str);
            C201955140j.LJIILIIL("AIMusicConfigHelper", C2188811AlT.LIZIZ(sbLIZ));
            ConcurrentHashMap<String, C11PQ<String>> concurrentHashMap = AbstractC2289508y5.LJIL;
            if (str == null) {
                str = "";
            }
            C11PQ<String> c11pq = concurrentHashMap.get(str);
            if (c11pq == null && (c11pqPutIfAbsent = concurrentHashMap.putIfAbsent(str, (c11pq = new C11PQ<>()))) != null) {
                c11pq = c11pqPutIfAbsent;
            }
            c11pq.onNext(str2);
        }
    }
}
