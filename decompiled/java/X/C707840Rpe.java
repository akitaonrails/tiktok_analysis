package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Rpe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C707840Rpe {
    public static List LIZLLL(Map map) {
        List listLJJLL;
        Object obj = map.get("winner");
        if (obj instanceof List) {
            listLJJLL = (List) obj;
        } else {
            if (obj instanceof Object[]) {
                listLJJLL = C13LQ.LJJLL((Object[]) obj);
            }
            return null;
        }
        if (listLJJLL != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listLJJLL) {
                if (obj2 instanceof String) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0314 A[REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0113 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019e  */
    /* JADX WARN: Type inference failed for: r31v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v18, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v19, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v20, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v5, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8, types: [X.13BV] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZ(com.ss.android.ugc.feed.funnel.api.FunnelContext r32, java.util.Map r33) {
        /*
            Method dump skipped, instruction units count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C707840Rpe.LIZ(com.ss.android.ugc.feed.funnel.api.FunnelContext, java.util.Map):java.util.Map");
    }

    public static Boolean LIZIZ(Map map, String... strArr) {
        for (String str : strArr) {
            Object obj = map.get(str);
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
        }
        return null;
    }

    public static String LIZJ(Map map, String... strArr) {
        for (String str : strArr) {
            Object obj = map.get(str);
            if ((obj instanceof String) && ((CharSequence) obj).length() > 0) {
                return (String) obj;
            }
        }
        return null;
    }
}
