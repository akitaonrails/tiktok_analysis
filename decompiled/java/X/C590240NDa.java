package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import defpackage.x0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0NDa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C590240NDa {
    public static volatile FeedItemList LIZ;

    public static FeedItemList LIZ(String str) {
        boolean z;
        ArrayList arrayList;
        List listLJ;
        List listLJJJJLI;
        String str2;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        FeedItemList feedItemList = null;
        if (z) {
            return null;
        }
        try {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
            arrayList = new ArrayList();
            for (Object obj : listLJJLIIIJILLIZJL) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            C0NDV.LIZ.getClass();
            listLJ = C0NDV.LJ(arrayList);
            listLJJJJLI = C13LP.LJJJJLI(C0NDV.LIZLLL(listLJ));
            if (C797930VRv.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getCacheDBFeed resultAwemeList: ");
                sbLIZ.append(C13LP.LJJLIIIJ(listLJJJJLI, ",", null, null, 0, null, AFwS240S0000000_9.get$arr$(960), 30));
                sbLIZ.append(" ,entityList: ");
                sbLIZ.append(C13LP.LJJLIIIJ(listLJ, ",", null, null, 0, null, AFwS240S0000000_9.get$arr$(961), 30));
                C797930VRv.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
        } catch (Throwable th) {
            th = th;
        }
        if ((!((ArrayList) listLJJJJLI).isEmpty()) && C13LP.LJJJLZIJ(0, listLJJJJLI) != null) {
            C590280NDe c590280NDe = (C590280NDe) listLJ.get(0);
            if (c590280NDe == null || (str2 = c590280NDe.LJIIJJI) == null) {
                str2 = "";
            }
            FeedItemList feedItemList2 = new FeedItemList();
            if (feedItemList2.getItems() == null) {
                feedItemList2.setItems(new ArrayList());
            }
            feedItemList2.hasMore = 1;
            feedItemList2.refreshClear = 1;
            try {
                feedItemList2.getItems().addAll(listLJJJJLI);
                feedItemList2.setRequestId(str2);
                return feedItemList2;
            } catch (Throwable th2) {
                th = th2;
                feedItemList = feedItemList2;
                TryCatchGuardChecker.doCheck(th);
                if (C797930VRv.LIZ()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("getCacheDBFeed entityList e");
                    sbLIZ2.append(th);
                    C797930VRv.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    return feedItemList;
                }
                return feedItemList;
            }
        }
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = -1;
        if (C0NDV.LJIIJ()) {
            C0NDV.LJIILIIL(new AwS410S0200000_9(arrayList, c118300cf, 115));
            return null;
        }
        return feedItemList;
    }

    public static boolean LIZIZ(String str, C0NDM c0ndm) {
        boolean z;
        boolean z2;
        long jCurrentTimeMillis;
        int iIntValue;
        boolean z3;
        C01GW c01gw = C1867660yhY.LJ;
        if (((Number) c01gw.getValue()).intValue() >= 0 && c0ndm == C0NDM.COLD_CACHE) {
            z = true;
        } else {
            z = false;
        }
        C01GW c01gw2 = C1867660yhY.LJFF;
        if (((Number) c01gw2.getValue()).intValue() >= 0 && c0ndm == C0NDM.UNCONSUMED_CACHE) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z) {
            if (!z2) {
                return false;
            }
            jCurrentTimeMillis = System.currentTimeMillis();
            iIntValue = ((Number) c01gw2.getValue()).intValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
            iIntValue = ((Number) c01gw.getValue()).intValue();
        }
        long j = jCurrentTimeMillis - (((long) (iIntValue * 3600)) * 1000);
        List<String> listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
        int size = listLJJLIIIJILLIZJL.size();
        int i = 0;
        for (String str2 : listLJJLIIIJILLIZJL) {
            C0NDV.LIZ.getClass();
            C013C c013c = new C013C();
            if (!a0.LJJJIL(str2)) {
                if (!C0NDV.LJIIJ()) {
                    z3 = c013c.element;
                } else {
                    C0NDV.LJIILIIL(new C590250NDb(c013c, str2, j));
                    z3 = c013c.element;
                }
                if (z3) {
                    if (z) {
                        C590420NDs c590420NDs = C590420NDs.LIZ;
                        x0 x0Var = x0.LIZ;
                        c590420NDs.getClass();
                        String strLJIILIIL = C590420NDs.LJIILIIL();
                        x0Var.getClass();
                        C590420NDs.LJIJ(x0.LIZJ(strLJIILIIL, str2));
                    } else {
                        List<Function0<Unit>> list = C0N4C.LIZ;
                        C0N4C.LIZJ(str2, C0N4E.AWEME_EXPIRED_IN_USED);
                        C590420NDs c590420NDs2 = C590420NDs.LIZ;
                        x0 x0Var2 = x0.LIZ;
                        c590420NDs2.getClass();
                        String strLJIILJJIL = C590420NDs.LJIILJJIL();
                        x0Var2.getClass();
                        C590420NDs.LJIJI(x0.LIZJ(strLJIILJJIL, str2));
                    }
                    C590480NDy c590480NDy = C590480NDy.LIZ;
                    C0NE1 c0ne1 = C0NE1.REMOVE;
                    c590480NDy.getClass();
                    C590480NDy.LJIILL(str2, c0ne1);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("isExpiredRecord deleteExpired ");
                    sbLIZ.append(str2);
                    sbLIZ.append(", ");
                    sbLIZ.append(j);
                    C797930VRv.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                    i++;
                }
            }
        }
        if (size <= 0 || i != size) {
            return false;
        }
        return true;
    }
}
