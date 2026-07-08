package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: renamed from: X.01VY, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01VY {
    public static final C01GW LIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(3));
    public static volatile long LIZIZ;

    public static void LIZ(long j) {
        long jLongValue;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - LIZIZ < 30000) {
            return;
        }
        LIZIZ = jCurrentTimeMillis;
        String[] stringArray = ((Keva) LIZ.getValue()).getStringArray("session_manager_active_days", new String[0]);
        ArrayList arrayList = new ArrayList(stringArray.length);
        for (String str : stringArray) {
            arrayList.add(C2095008Iq.LJIILIIL(str));
        }
        ArrayList arrayList2 = new ArrayList(C13LP.LJJJJLI(arrayList));
        Long l = (Long) C13LP.LJJLIIIJL(arrayList2);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jLongValue);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        if (calendar2.getTimeInMillis() > calendar.getTimeInMillis()) {
            while (arrayList2.size() >= 30) {
                ListProtector.remove(arrayList2, 0);
            }
            arrayList2.add(Long.valueOf(j));
            Keva keva = (Keva) LIZ.getValue();
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(String.valueOf(((Number) it2.next()).longValue()));
            }
            keva.storeStringArray("session_manager_active_days", (String[]) arrayList3.toArray(new String[0]));
        }
    }
}
