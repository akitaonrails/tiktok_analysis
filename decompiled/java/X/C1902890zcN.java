package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell;
import com.ss.android.ugc.aweme.notice.repo.list.bean.KeyValueHolder;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zcN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1902890zcN {
    public static C1246360iXS LIZ;
    public static final Map<Integer, C1246380iXU> LIZIZ = C2097608Jq.LJIIJ(new Pair(3, new C1246380iXU() { // from class: X.0iXW
        @Override // X.C1246380iXU
        public final String LIZ() {
            return C1618770sE7.LIZJ(2131836099);
        }
    }), new Pair(13, new C1246380iXU() { // from class: X.0iXV
        @Override // X.C1246380iXU
        public final String LIZ() {
            return C1618770sE7.LIZJ(2131830310);
        }
    }));

    public static String LIZ(InboxEntranceCell inboxEntranceCell) {
        boolean z;
        List<KeyValueHolder> list = inboxEntranceCell.eventTrackingExtra;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        String str = "";
        if (!z) {
            for (KeyValueHolder keyValueHolder : list) {
                if (Intrinsics.LJFF(keyValueHolder.key, "cell_type")) {
                    str = keyValueHolder.value;
                }
            }
        }
        return str;
    }

    public static Map LIZIZ(InboxEntranceCell inboxEntranceCell) {
        KeyValueHolder next;
        String str;
        List<KeyValueHolder> list = inboxEntranceCell.eventTrackingExtra;
        Object objLIZJ = null;
        if (list != null) {
            Iterator<KeyValueHolder> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.key, "tako_chat_mob_params")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            KeyValueHolder keyValueHolder = next;
            if (keyValueHolder != null && (str = keyValueHolder.value) != null) {
                try {
                    C1227904rF c1227904rF = C1227904rF.LIZ;
                    Type type = new AbstractC1905540zge<Map<String, String>>() { // from class: X.0zcR
                    }.getType();
                    c1227904rF.getClass();
                    objLIZJ = C1227904rF.LIZJ(str, type);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getRecommendWordMobInfo: exception = ");
                    sbLIZ.append(th.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
        }
        return (Map) objLIZJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell r5) {
        /*
            java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.KeyValueHolder> r0 = r5.eventTrackingExtra
            r4 = 0
            if (r0 == 0) goto L2d
            java.util.Iterator r3 = r0.iterator()
        L9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.notice.repo.list.bean.KeyValueHolder r0 = (com.ss.android.ugc.aweme.notice.repo.list.bean.KeyValueHolder) r0
            java.lang.String r1 = r0.key
            java.lang.String r0 = "tako_push_id"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L9
        L20:
            com.ss.android.ugc.aweme.notice.repo.list.bean.KeyValueHolder r2 = (com.ss.android.ugc.aweme.notice.repo.list.bean.KeyValueHolder) r2
            if (r2 == 0) goto L2d
            java.lang.String r1 = r2.value
        L26:
            int r0 = r5.unreadCount
            if (r0 <= 0) goto L2f
            return r1
        L2b:
            r2 = r4
            goto L20
        L2d:
            r1 = r4
            goto L26
        L2f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1902890zcN.LIZJ(com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell):java.lang.String");
    }
}
