package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0OTr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C620050OTr {
    public static final C620050OTr LIZ = new C620050OTr();
    public static final ConcurrentHashMap<String, C620060OTs> LIZIZ = new ConcurrentHashMap<>();

    public static void LIZ(C620050OTr c620050OTr, String str, String str2, Map map) {
        C620060OTs c620060OTs;
        c620050OTr.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinActivePageRegistry dispatchChannelModify bbId=");
        sbLIZ.append(str);
        sbLIZ.append(", modifyType=");
        sbLIZ.append(str2);
        sbLIZ.append(", success=");
        sbLIZ.append(true);
        C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (str != null && str.length() != 0 && (c620060OTs = LIZIZ.get(str)) != null) {
            Map<String, Object> mapInvoke = c620060OTs.LIZJ.invoke("content_interaction");
            if (mapInvoke == null) {
                C0OPX.LJIIIZ("BulletinActivePageRegistry dispatchChannelModify extraParams is null (no content_interaction task), still dispatch");
            }
            c620060OTs.LIZIZ.G02(str2, map, mapInvoke, true);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("BulletinActivePageRegistry dispatchChannelModify entry not found for bbId=");
        sbLIZ2.append(str);
        C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static void LIZIZ(C620050OTr c620050OTr, String str, String str2, Map map) {
        C620060OTs c620060OTs;
        c620050OTr.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinActivePageRegistry dispatchInteraction bbId=");
        sbLIZ.append(str);
        sbLIZ.append(", interactionType=");
        sbLIZ.append(str2);
        sbLIZ.append(", success=");
        sbLIZ.append(true);
        C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (str != null && str.length() != 0 && (c620060OTs = LIZIZ.get(str)) != null) {
            Map<String, Object> mapInvoke = c620060OTs.LIZJ.invoke("content_interaction");
            if (mapInvoke == null) {
                C0OPX.LJIIIZ("BulletinActivePageRegistry dispatchInteraction extraParams is null (no content_interaction task), still dispatch");
            }
            c620060OTs.LIZIZ.gQ1(str2, map, mapInvoke, true);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("BulletinActivePageRegistry dispatchInteraction entry not found for bbId=");
        sbLIZ2.append(str);
        C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
