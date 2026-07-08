package X;

import Y.ACallableS429S0100000_24;
import Y.ARunnableS106S0100000_6;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.FutureTask;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qnj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563970qnj {
    public static C1564050qnr LIZIZ;
    public static String LIZJ;
    public static final List<C1556460qbc> LIZ = new ArrayList();
    public static final C01GW LIZLLL = C452501pT.LIZ(EnumC452301pR.NONE, AFwS213S0000000_24.get$arr$(467));
    public static final Set<String> LJ = new LinkedHashSet();
    public static final Set<String> LJFF = new LinkedHashSet();
    public static final Map<String, Function0<Unit>> LJI = new LinkedHashMap();

    public static List LIZ() {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) LIZ).iterator();
        while (it2.hasNext()) {
            C1556460qbc c1556460qbc = (C1556460qbc) it2.next();
            if (c1556460qbc.LIZ.get() != null) {
                arrayList.add(c1556460qbc);
            } else {
                it2.remove();
            }
        }
        return arrayList;
    }

    public static void LIZIZ(String str) {
        Function0 function0 = (Function0) ((LinkedHashMap) LJI).get(str);
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UsPopCardListenerManager notifyVisibilityChanged subScene=");
        sbLIZ.append(str);
        sbLIZ.append(", callback=");
        sbLIZ.append(function0);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static void LJ(Function0 function0) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            function0.invoke();
        } else {
            C786410Ut5.LJJZZIII((Handler) LIZLLL.getValue(), new ARunnableS106S0100000_6(function0, 154));
        }
    }

    public static Object LJFF(Function0 function0) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            return function0.invoke();
        }
        FutureTask futureTask = new FutureTask(new ACallableS429S0100000_24(function0, (Function0<Object>) 4));
        C786410Ut5.LJJZZIII((Handler) LIZLLL.getValue(), futureTask);
        return futureTask.get();
    }

    public static void LJI(C21202017y6 c21202017y6, String str, String str2) {
        C1564050qnr c1564050qnr = LIZIZ;
        if (c1564050qnr != null) {
            c21202017y6.j0(LIZJ, c1564050qnr, str);
            long jCurrentTimeMillis = System.currentTimeMillis();
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("jyq_debug ");
            sbLIZ.append(jCurrentTimeMillis);
            sbLIZ.append(" syncLatestData, subScene:");
            sbLIZ.append(str);
            sbLIZ.append(", trigger:");
            sbLIZ.append(str2);
            sbLIZ.append(", popCardId:");
            sbLIZ.append(c1564050qnr.LIZJ);
            sbLIZ.append(", roomId:");
            sbLIZ.append(c1564050qnr.LIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LJ(strLIZIZ);
            LIZJ(str, "sync_latest_data", str2, c21202017y6, jCurrentTimeMillis);
        }
    }

    public static void LIZJ(String str, String str2, String str3, C21202017y6 c21202017y6, long j) {
        String str4;
        C1564050qnr c1564050qnr;
        C1563990qnl c1563990qnl;
        String string;
        long jLongValue;
        String str5;
        String str6;
        Long l;
        Long l2;
        String str7 = null;
        if (Intrinsics.LJFF(str, "acting_area")) {
            if (Intrinsics.LJFF(str2, "preload_ready")) {
                str4 = "auction_acting_area_center_preload_ready";
            } else if (Intrinsics.LJFF(str2, "sync_latest_data")) {
                str4 = "auction_acting_area_center_sync_latest_data";
            } else {
                return;
            }
        } else if (Intrinsics.LJFF(str, "acting_area_bottom")) {
            if (Intrinsics.LJFF(str2, "preload_ready")) {
                str4 = "auction_acting_area_bottom_right_preload_ready";
            } else if (Intrinsics.LJFF(str2, "sync_latest_data")) {
                str4 = "auction_acting_area_bottom_right_sync_latest_data";
            } else {
                return;
            }
        } else {
            return;
        }
        if ((c21202017y6 == null || (c1564050qnr = c21202017y6.LLILZ) == null) && (c1564050qnr = LIZIZ) == null) {
            c1563990qnl = null;
        } else {
            c1563990qnl = c1564050qnr.LJI;
        }
        Pair[] pairArr = new Pair[3];
        if (c1564050qnr != null) {
            str7 = c1564050qnr.LIZ;
        }
        String str8 = "";
        if (str7 == null) {
            str7 = "";
        }
        pairArr[0] = new Pair("room_id", str7);
        if (c1564050qnr == null || (string = Integer.valueOf(c1564050qnr.LIZIZ).toString()) == null) {
            string = "";
        }
        pairArr[1] = new Pair("card_type", string);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sub_scene:");
        sbLIZ.append(str);
        sbLIZ.append(", stage:");
        sbLIZ.append(str2);
        sbLIZ.append(", trigger:");
        sbLIZ.append(str3);
        sbLIZ.append(", current_timestamp:");
        sbLIZ.append(j);
        sbLIZ.append(", pop_card_id:");
        long jLongValue2 = -1;
        if (c1564050qnr != null && (l2 = c1564050qnr.LIZJ) != null) {
            jLongValue = l2.longValue();
        } else {
            jLongValue = -1;
        }
        sbLIZ.append(jLongValue);
        sbLIZ.append(", latest_pop_card_id:");
        C1564050qnr c1564050qnr2 = LIZIZ;
        if (c1564050qnr2 != null && (l = c1564050qnr2.LIZJ) != null) {
            jLongValue2 = l.longValue();
        }
        sbLIZ.append(jLongValue2);
        sbLIZ.append(", trigger_source:");
        if (c1563990qnl == null || (str5 = c1563990qnl.LIZ) == null) {
            str5 = "";
        }
        sbLIZ.append(str5);
        sbLIZ.append(", chain_id:");
        if (c1563990qnl != null && (str6 = c1563990qnl.LIZIZ) != null) {
            str8 = str6;
        }
        sbLIZ.append(str8);
        pairArr[2] = new Pair("step_extra", C2188811AlT.LIZIZ(sbLIZ));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (c1563990qnl != null) {
            mapLJIIJ.put("trigger_source", c1563990qnl.LIZ);
            mapLJIIJ.put("chain_id", c1563990qnl.LIZIZ);
        }
        C21198117xT.LIZ.getClass();
        C21198117xT.LIZIZ(str4, mapLJIIJ);
    }

    public static void LIZLLL(long j, C1564050qnr c1564050qnr, C21202017y6 c21202017y6, String str, String str2) {
        LJ(new C1563980qnk(j, c1564050qnr, c21202017y6, str, str2));
    }
}
