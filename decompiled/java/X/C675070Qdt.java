package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Qdt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C675070Qdt {
    public static final ConcurrentHashMap<String, C675080Qdu> LIZ = new ConcurrentHashMap<>();

    public static String LIZ(String str, InterfaceC675210Qe7 interfaceC675210Qe7) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("url_");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append('_');
        ConcurrentHashMap<String, C675080Qdu> concurrentHashMap = LIZ;
        sbLIZ.append(concurrentHashMap.size());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        concurrentHashMap.put(strLIZIZ, new C675080Qdu(str, interfaceC675210Qe7));
        return strLIZIZ;
    }
}
