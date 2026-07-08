package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.network.INetwork;
import com.ss.android.ugc.aweme.outreach.dispersion.save.OutreachRecordConfig;
import com.ss.android.ugc.aweme.outreach.dispersion.save.OutreachRecordData;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15qz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20648315qz {
    public static final C1993007rM LIZIZ;
    public static final C1993007rM LIZJ;
    public static C20647215qo LJI;
    public static boolean LJII;
    public static final C20648315qz LIZ = new C20648315qz();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C20648615r2());
    public static String LJ = LJ();
    public static String LJFF = "";

    /* JADX WARN: Type inference failed for: r1v0, types: [X.07rM] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.07rM] */
    static {
        final String str = "yyyy-MM-dd";
        LIZIZ = new ThreadLocal<SimpleDateFormat>(str) { // from class: X.07rM
            public final String LIZ;

            @Override // java.lang.ThreadLocal
            public final SimpleDateFormat initialValue() {
                return new SimpleDateFormat(this.LIZ);
            }

            {
                this.LIZ = str;
            }
        };
        final String str2 = "yyyy-MM-dd HH:mm:ss";
        LIZJ = new ThreadLocal<SimpleDateFormat>(str2) { // from class: X.07rM
            public final String LIZ;

            @Override // java.lang.ThreadLocal
            public final SimpleDateFormat initialValue() {
                return new SimpleDateFormat(this.LIZ);
            }

            {
                this.LIZ = str2;
            }
        };
    }

    public static String LJ() {
        return LIZIZ.get().format(new Date());
    }

    public static String LJFF() {
        return LIZJ.get().format(new Date(System.currentTimeMillis()));
    }

    public static long LJII() {
        return !((Boolean) C0B68.LIZ.getValue()).booleanValue() ? System.currentTimeMillis() : ((INetwork) ServiceManager.get().getService(INetwork.class)).LIZIZ();
    }

    public static String LJI(Date date) {
        return LIZIZ.get().format(date);
    }

    public static void LJIIJJI(boolean z) {
        boolean z2;
        ArrayList<String> arrayList;
        C20647215qo c20647215qo = LJI;
        if (c20647215qo == null) {
            C20571715ed.LIZ.getClass();
            return;
        }
        ArrayList<String> arrayList2 = c20647215qo.LIZIZ;
        LJ = LJ();
        if (arrayList2 != null && (!arrayList2.isEmpty())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            String str = (String) ListProtector.get(arrayList2, 0);
            if (Intrinsics.LJFF(str, LJ)) {
                C20571715ed c20571715ed = C20571715ed.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("today has saved day time: ");
                sbLIZ.append(str);
                sbLIZ.append(", ");
                sbLIZ.append(LJ);
                C2188811AlT.LIZIZ(sbLIZ);
                c20571715ed.getClass();
            } else {
                C20647215qo c20647215qo2 = LJI;
                if (c20647215qo2 != null) {
                    c20647215qo2.LIZIZ(LJ);
                }
                C20571715ed c20571715ed2 = C20571715ed.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("save today: ");
                sbLIZ2.append(LJ);
                C2188811AlT.LIZIZ(sbLIZ2);
                c20571715ed2.getClass();
            }
        } else {
            C20647215qo c20647215qo3 = LJI;
            if (c20647215qo3 != null) {
                c20647215qo3.LIZIZ(LJ);
            }
            C20571715ed c20571715ed3 = C20571715ed.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("save today: ");
            sbLIZ3.append(LJ);
            C2188811AlT.LIZIZ(sbLIZ3);
            c20571715ed3.getClass();
        }
        C20647215qo c20647215qo4 = LJI;
        if (c20647215qo4 == null || (arrayList = c20647215qo4.LIZ) == null) {
            C20571715ed.LIZ.getClass();
            C20571715ed.LIZ("saveVisitToday, sessionList is null");
            arrayList = new ArrayList<>();
            C20647215qo c20647215qo5 = LJI;
            if (c20647215qo5 != null) {
                c20647215qo5.LIZ = arrayList;
            }
        }
        if (z) {
            String strLJFF = LJFF();
            LJFF = strLJFF;
            C20647215qo c20647215qo6 = LJI;
            if (c20647215qo6 != null) {
                c20647215qo6.LIZ(strLJFF);
            }
        } else if (LJFF.length() == 0) {
            if (arrayList.isEmpty()) {
                String strLJFF2 = LJFF();
                LJFF = strLJFF2;
                C20647215qo c20647215qo7 = LJI;
                if (c20647215qo7 != null) {
                    c20647215qo7.LIZ(strLJFF2);
                }
            } else {
                LJFF = (String) ListProtector.get(arrayList, 0);
            }
        }
        C823050WQl.LJFF().submit(new Runnable() { // from class: X.14iH
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TimeWindowUtil@1064.saveVisitToday$1");
                try {
                    String json = GsonProtectorUtils.toJson(C09C2.LIZ(), C20648315qz.LJI);
                    C20648315qz.LIZ.getClass();
                    ((Keva) C20648315qz.LIZLLL.getValue()).storeString("outreach_time_cache", json);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TimeWindowUtil@1064.saveVisitToday$1");
            }
        });
    }

    public static boolean LIZ(OutreachRecordData outreachRecordData, C20648515r1 c20648515r1) {
        List<OutreachRecordData> listLJJJJLI;
        long jLongValue;
        List<OutreachRecordData> outreachRecordList;
        C20647215qo c20647215qo;
        ArrayList<String> arrayList;
        C20647215qo c20647215qo2;
        ArrayList<String> arrayList2;
        int iIntValue;
        if (C0BMG.LIZ() && !(c20648515r1.LJ instanceof C20651115rR) && C20648415r0.LIZ.containsKey(c20648515r1.LIZ)) {
            Integer num = C20648415r0.LIZ.get(c20648515r1.LIZ);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            C20571715ed c20571715ed = C20571715ed.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isQuotaAvailable. rule:");
            sbLIZ.append(c20648515r1.LIZ);
            sbLIZ.append(", limit:");
            sbLIZ.append(c20648515r1.LJI);
            sbLIZ.append(", usedQuota:");
            sbLIZ.append(iIntValue);
            C2188811AlT.LIZIZ(sbLIZ);
            c20571715ed.getClass();
            if (c20648515r1.LJI <= iIntValue) {
                outreachRecordData.setDispersalRule(c20648515r1);
                List<OutreachRecordData> list = C20648415r0.LIZIZ.get(c20648515r1.LIZ);
                if (list == null) {
                    list = C13BV.INSTANCE;
                }
                for (OutreachRecordData outreachRecordData2 : list) {
                    if (!outreachRecordData.getDispersalOutreachRecords().contains(outreachRecordData2)) {
                        outreachRecordData.getDispersalOutreachRecords().add(outreachRecordData2);
                    }
                }
            }
            if (c20648515r1.LJI > iIntValue) {
                return true;
            }
            return false;
        }
        ArrayList arrayList3 = new ArrayList();
        Long lValueOf = null;
        if (C282010B3n.LIZ()) {
            AbstractC20652915rj abstractC20652915rj = c20648515r1.LJ;
            if (abstractC20652915rj instanceof C20651015rQ) {
                C20651015rQ c20651015rQ = (C20651015rQ) abstractC20652915rj;
                if (c20651015rQ.LIZIZ > 0) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.add(5, -(c20651015rQ.LIZIZ - 1));
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    lValueOf = Long.valueOf(calendar.getTimeInMillis());
                }
            } else if (abstractC20652915rj instanceof C20651115rR) {
                C20651115rR c20651115rR = (C20651115rR) abstractC20652915rj;
                if (c20651115rR.LIZIZ > 0) {
                    lValueOf = Long.valueOf(System.currentTimeMillis() - (((long) c20651115rR.LIZIZ) * 1000));
                }
            } else if (abstractC20652915rj instanceof C20650915rP) {
                C20650915rP c20650915rP = (C20650915rP) abstractC20652915rj;
                if (c20650915rP.LIZIZ > 0 && (c20647215qo2 = LJI) != null && (arrayList2 = c20647215qo2.LIZIZ) != null && !arrayList2.isEmpty()) {
                    try {
                        Date date = LIZIZ.get().parse(arrayList2.get(Math.min(c20650915rP.LIZIZ - 1, arrayList2.size() - 1)));
                        if (date != null) {
                            lValueOf = Long.valueOf(date.getTime());
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            } else if (abstractC20652915rj instanceof C20651215rS) {
                C20651215rS c20651215rS = (C20651215rS) abstractC20652915rj;
                if (c20651215rS.LIZIZ > 0 && (c20647215qo = LJI) != null && (arrayList = c20647215qo.LIZ) != null && !arrayList.isEmpty()) {
                    try {
                        Date date2 = LIZJ.get().parse(arrayList.get(Math.min(c20651215rS.LIZIZ - 1, arrayList.size() - 1)));
                        if (date2 != null) {
                            lValueOf = Long.valueOf(date2.getTime());
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
            }
        }
        C20648715r3.LIZ.getClass();
        OutreachRecordConfig outreachRecordConfig = C20648715r3.LJI;
        if (outreachRecordConfig == null || (outreachRecordList = outreachRecordConfig.getOutreachRecordList()) == null || (listLJJJJLI = C13LP.LJJJJLI(outreachRecordList)) == null) {
            listLJJJJLI = C13BV.INSTANCE;
        }
        int i = 0;
        for (OutreachRecordData outreachRecordData3 : listLJJJJLI) {
            if (lValueOf != null) {
                Long showTimeMiles = outreachRecordData3.getShowTimeMiles();
                if (showTimeMiles != null) {
                    jLongValue = showTimeMiles.longValue();
                } else {
                    jLongValue = 0;
                }
                if (jLongValue < lValueOf.longValue()) {
                    break;
                }
            }
            C20648815r4.LIZ.getClass();
            if (C20648815r4.LJIIIZ(outreachRecordData3, c20648515r1)) {
                i++;
                if (!outreachRecordData.getDispersalOutreachRecords().contains(outreachRecordData3)) {
                    arrayList3.add(outreachRecordData3);
                }
            }
        }
        C20571715ed c20571715ed2 = C20571715ed.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("canShowInTimeWindow. rule:");
        sbLIZ2.append(c20648515r1.LIZ);
        sbLIZ2.append(", limit:");
        sbLIZ2.append(c20648515r1.LJI);
        sbLIZ2.append(", showTimes:");
        sbLIZ2.append(i);
        C2188811AlT.LIZIZ(sbLIZ2);
        c20571715ed2.getClass();
        if (c20648515r1.LJI <= i) {
            outreachRecordData.setDispersalRule(c20648515r1);
            outreachRecordData.getDispersalOutreachRecords().addAll(arrayList3);
        }
        if (c20648515r1.LJI > i) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(OutreachRecordData outreachRecordData, C20648515r1 c20648515r1) {
        ArrayList<String> arrayList;
        AbstractC20652915rj abstractC20652915rj = c20648515r1.LJ;
        C20571715ed c20571715ed = C20571715ed.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkMatchTimWindow, timeWindow: ");
        sbLIZ.append(abstractC20652915rj);
        C2188811AlT.LIZIZ(sbLIZ);
        c20571715ed.getClass();
        boolean zLJIIIIZZ = false;
        if (abstractC20652915rj instanceof C20651015rQ) {
            int i = ((C20651015rQ) abstractC20652915rj).LIZIZ;
            if (i <= 0) {
                C20571715ed.LIZ("check calendar day, error size");
                return false;
            }
            String showDate = outreachRecordData.getShowDate();
            try {
                Calendar calendar = Calendar.getInstance();
                Calendar calendar2 = Calendar.getInstance();
                calendar2.add(5, -(i - 1));
                Calendar calendar3 = Calendar.getInstance();
                Date date = LIZIZ.get().parse(showDate);
                if (date == null) {
                    C20571715ed.LIZ("isInNatureDay, targetDate is null");
                } else {
                    calendar3.setTime(date);
                    if ((calendar3.after(calendar2) || LJIIJ(calendar2, calendar3)) && (calendar3.before(calendar) || LJIIJ(calendar3, calendar))) {
                        zLJIIIIZZ = true;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20571715ed c20571715ed2 = C20571715ed.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("isInNatureDay exception: ");
                sbLIZ2.append(e);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                c20571715ed2.getClass();
                C20571715ed.LIZ(strLIZIZ);
            }
        } else if (abstractC20652915rj instanceof C20650915rP) {
            int i2 = ((C20650915rP) abstractC20652915rj).LIZIZ;
            if (i2 <= 0) {
                C20571715ed.LIZ("check active day, error size");
                return false;
            }
            String showDate2 = outreachRecordData.getShowDate();
            C20647215qo c20647215qo = LJI;
            if (c20647215qo != null && (arrayList = c20647215qo.LIZIZ) != null) {
                if (C282010B3n.LIZ()) {
                    zLJIIIIZZ = LIZLLL(i2, showDate2, arrayList);
                } else {
                    synchronized (C20648315qz.class) {
                        try {
                            LIZ.getClass();
                            zLJIIIIZZ = LIZLLL(i2, showDate2, arrayList);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                if (!zLJIIIIZZ) {
                }
            }
        } else if (abstractC20652915rj instanceof C20651215rS) {
            int i3 = ((C20651215rS) abstractC20652915rj).LIZIZ;
            if (i3 <= 0) {
                C20571715ed.LIZ("check session, error size");
                return false;
            }
            zLJIIIIZZ = LJIIIZ(i3, outreachRecordData.getSessionId());
        } else if (abstractC20652915rj instanceof C20651115rR) {
            int i4 = ((C20651115rR) abstractC20652915rj).LIZIZ;
            if (i4 <= 0) {
                C20571715ed.LIZ("check second, error size");
                return false;
            }
            zLJIIIIZZ = LJIIIIZZ(outreachRecordData, i4);
        }
        C20571715ed c20571715ed3 = C20571715ed.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("checkMatchTimWindow, matched:");
        sbLIZ3.append(zLJIIIIZZ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        c20571715ed3.getClass();
        C20571715ed.LIZ(strLIZIZ2);
        return zLJIIIIZZ;
    }

    public static boolean LJIIIIZZ(OutreachRecordData outreachRecordData, int i) {
        Long showTimeMiles = outreachRecordData.getShowTimeMiles();
        if (showTimeMiles != null) {
            long jLongValue = showTimeMiles.longValue();
            long j = LSPassThroughRecordSizeConfig.DEFAULT;
            long j2 = jLongValue / j;
            long jCurrentTimeMillis = System.currentTimeMillis() / j;
            if (jCurrentTimeMillis - ((long) i) <= j2 && j2 <= jCurrentTimeMillis) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LJIIIZ(int i, String str) {
        ArrayList<String> arrayList;
        boolean zLIZJ;
        C20647215qo c20647215qo = LJI;
        if (c20647215qo != null) {
            arrayList = c20647215qo.LIZ;
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            C20571715ed.LIZ.getClass();
            C20571715ed.LIZ("sessionList is null");
            return false;
        }
        if (i <= 0) {
            C20571715ed.LIZ.getClass();
            return false;
        }
        if (C282010B3n.LIZ()) {
            return LIZJ(i, str, arrayList);
        }
        synchronized (C20648315qz.class) {
            try {
                LIZ.getClass();
                zLIZJ = LIZJ(i, str, arrayList);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zLIZJ;
    }

    public static boolean LJIIJ(Calendar calendar, Calendar calendar2) {
        if (calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5)) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(int i, String str, List list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (Intrinsics.LJFF(str, ListProtector.get(list, i2))) {
                C20571715ed c20571715ed = C20571715ed.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("session equal, i = ");
                sbLIZ.append(i2);
                sbLIZ.append(", count = ");
                sbLIZ.append(i);
                C2188811AlT.LIZIZ(sbLIZ);
                c20571715ed.getClass();
                if (i2 >= i) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static boolean LIZLLL(int i, String str, List list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (Intrinsics.LJFF(str, ListProtector.get(list, i2))) {
                C20571715ed c20571715ed = C20571715ed.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("visit date, i = ");
                sbLIZ.append(i2);
                sbLIZ.append(", count = ");
                sbLIZ.append(i);
                C2188811AlT.LIZIZ(sbLIZ);
                c20571715ed.getClass();
                if (i2 >= i) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static void LJIIL(int i, C20648515r1 c20648515r1, boolean z) {
        List<OutreachRecordData> listLJJJJLI;
        Long showTimeMiles;
        List<OutreachRecordData> outreachRecordList;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C20652515rf c20652515rf = c20648515r1.LJFF;
        ArrayList<EnumC20654715s1> arrayList = null;
        if (c20652515rf != null) {
            arrayList = c20652515rf.LIZ;
        }
        C20648715r3.LIZ.getClass();
        OutreachRecordConfig outreachRecordConfig = C20648715r3.LJI;
        if (outreachRecordConfig == null || (outreachRecordList = outreachRecordConfig.getOutreachRecordList()) == null || (listLJJJJLI = C13LP.LJJJJLI(outreachRecordList)) == null) {
            listLJJJJLI = C13BV.INSTANCE;
        }
        int i2 = 0;
        for (OutreachRecordData outreachRecordData : listLJJJJLI) {
            if (LJIIIIZZ(outreachRecordData, i) && (showTimeMiles = outreachRecordData.getShowTimeMiles()) != null) {
                if ((jCurrentTimeMillis - showTimeMiles.longValue()) / ((long) LSPassThroughRecordSizeConfig.DEFAULT) > i) {
                    break;
                }
                if (arrayList != null && C13LP.LJJJJ(C20654615s0.LIZ(outreachRecordData.getOutreachType()), arrayList)) {
                    i2++;
                    if (z) {
                        if (i2 >= c20648515r1.LJI) {
                            c20648515r1.LJIIIIZZ.add(outreachRecordData);
                        } else {
                            outreachRecordData.setDispersalRule(c20648515r1);
                        }
                    }
                }
            }
        }
        int i3 = c20648515r1.LJI - i2;
        if (i3 >= 0) {
            c20648515r1.LJII = i3;
        } else {
            c20648515r1.LJII = 0;
        }
        C20571715ed c20571715ed = C20571715ed.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update second quota done. rule left quota:");
        sbLIZ.append(c20648515r1.LJII);
        C2188811AlT.LIZIZ(sbLIZ);
        c20571715ed.getClass();
    }
}
