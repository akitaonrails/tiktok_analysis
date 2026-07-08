package X;

import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Pair;

/* JADX INFO: renamed from: X.06Bx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1567906Bx {
    public static final String LIZJ(StreakPetData streakPetData) {
        if (streakPetData != null) {
            if (C1571306Df.LJIIIIZZ(streakPetData)) {
                return "pet";
            }
            if (C1571306Df.LJI(streakPetData)) {
                return "egg";
            }
            return "unknown";
        }
        return "unknown";
    }

    public static final void LIZ(String str, Map map) {
        map.put("conversation_id", str);
        map.put("conversation_type", String.valueOf(C1567806Bw.LIZJ(str).getValue()));
    }

    public static final Pair LIZIZ(List list, long j, boolean z, String str) {
        if (!list.isEmpty() && str.length() != 0) {
            int iIndexOf = list.indexOf(Long.valueOf(j));
            if (iIndexOf == -1) {
                return new Pair(Boolean.FALSE, null);
            }
            ArrayList arrayList = new ArrayList();
            if (z) {
                Iterator it2 = list.subList(iIndexOf, list.size()).iterator();
                while (it2.hasNext()) {
                    long jLongValue = ((Number) it2.next()).longValue();
                    arrayList.add(Long.valueOf(j));
                    if (j != jLongValue) {
                        return new Pair(Boolean.FALSE, arrayList);
                    }
                    j += (long) 120;
                }
                return new Pair(Boolean.TRUE, arrayList);
            }
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(str));
            long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
            calendar.setTimeInMillis(j * j2);
            Iterator it3 = list.subList(iIndexOf, list.size()).iterator();
            while (it3.hasNext()) {
                long jLongValue2 = ((Number) it3.next()).longValue();
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                long timeInMillis = calendar.getTimeInMillis() / j2;
                arrayList.add(Long.valueOf(timeInMillis));
                if (timeInMillis != jLongValue2) {
                    return new Pair(Boolean.FALSE, arrayList);
                }
                calendar.add(5, 1);
            }
            return new Pair(Boolean.TRUE, arrayList);
        }
        return new Pair(Boolean.FALSE, null);
    }
}
