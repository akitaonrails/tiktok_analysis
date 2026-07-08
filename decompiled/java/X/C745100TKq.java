package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0TKq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C745100TKq {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(282));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(283));
    public static List<String> LIZJ;
    public static List<String> LIZLLL;

    public static List LIZ() {
        if (LIZLLL == null) {
            Keva kevaLJ = LJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) LIZIZ.getValue());
            sbLIZ.append("asp_show_frequency");
            String[] stringArray = kevaLJ.getStringArray(C2188811AlT.LIZIZ(sbLIZ), new String[0]);
            ArrayList arrayList = new ArrayList();
            LIZLLL = arrayList;
            C19719612Di.LJJII(arrayList, stringArray);
        }
        return LIZLLL;
    }

    public static List LIZLLL() {
        if (LIZJ == null) {
            String[] stringArray = LJ().getStringArray(LIZJ(), new String[0]);
            ArrayList arrayList = new ArrayList();
            LIZJ = arrayList;
            C19719612Di.LJJII(arrayList, stringArray);
        }
        return LIZJ;
    }

    public static Keva LJ() {
        return (Keva) LIZ.getValue();
    }

    public static String LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) LIZIZ.getValue());
        sbLIZ.append("ban_end_time");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) LIZIZ.getValue());
        sbLIZ.append("asp_close_frequency");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJFF() {
        List listLIZLLL;
        long j;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = LJ().getLong(LIZIZ(), 0L);
        if ((j2 <= 0 || jCurrentTimeMillis >= j2) && (listLIZLLL = LIZLLL()) != null) {
            ArrayList<String> arrayList = (ArrayList) listLIZLLL;
            arrayList.add(String.valueOf(jCurrentTimeMillis));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(listLIZLLL);
            for (String str : arrayList) {
                if (jCurrentTimeMillis - CastLongProtector.parseLong(str) > ((long) C745130TKt.LIZ().closeAccumulatedDays) * 86400000) {
                    arrayList2.remove(str);
                }
            }
            if (arrayList2.size() <= 2) {
                j = 86400000;
            } else {
                arrayList2.clear();
                j = ((long) C745130TKt.LIZ().close3FrequencyDays) * 86400000;
            }
            arrayList.clear();
            arrayList.addAll(arrayList2);
            LJ().storeLong(LIZIZ(), jCurrentTimeMillis + j);
            LJ().storeStringArray(LIZJ(), (String[]) arrayList.toArray(new String[0]));
        }
    }
}
