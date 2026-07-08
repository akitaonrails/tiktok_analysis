package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.1DYo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2257761DYo {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(533));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(534));

    public abstract void LIZ(C12KZ c12kz);

    public abstract void LIZIZ(int i, int i2, long j, long j2, long j3);

    public abstract long LJII(int i, long j, long j2, long j3);

    public long LJIIIIZZ(long j) {
        return j;
    }

    public abstract void LJIIJJI(C2257781DYq c2257781DYq);

    public abstract long LJIILIIL(int i, long j, Object obj);

    public final Calendar LJIIIZ() {
        return (Calendar) this.LIZ.getValue();
    }

    public final Calendar LJIIJ() {
        return (Calendar) this.LIZIZ.getValue();
    }

    public static void LIZJ(List list, List list2) {
        String pattern = ((SimpleDateFormat) DateFormat.getDateTimeInstance(3, 3, Locale.getDefault())).toPattern();
        ArrayList arrayList = new ArrayList(list);
        for (int i = 0; i < pattern.length(); i++) {
            char cCharAt = pattern.charAt(i);
            Iterator it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    if (((Boolean) ((Function1) pair.getFirst()).invoke(Character.valueOf(cCharAt))).booleanValue()) {
                        ((Function1) pair.getSecond()).invoke(ListProtector.remove(arrayList, 0));
                        it2.remove();
                        break;
                    }
                }
            }
            list2.isEmpty();
        }
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            Pair pair2 = (Pair) it3.next();
            ((Function1) pair2.getSecond()).invoke(ListProtector.remove(arrayList, 0));
        }
    }

    public static Pair LJ(int i, int i2, int i3, int i4) {
        int i5 = (((i + i4) - 1) / i4) * i4;
        int i6 = (i2 / i4) * i4;
        if (i6 < i5) {
            i6 = i5;
        }
        int i7 = (i3 / i4) * i4;
        if (i7 < i5) {
            i7 = i5;
        }
        if (i7 > i6) {
            i7 = i6;
        }
        return new Pair(C13LZ.LJIILIIL(new IntRange(i5, i6), i4), Integer.valueOf(i7));
    }

    public static Pair LJIIL(int i, int i2, int i3, int i4) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return new Pair(new IntRange(i2, i3), Integer.valueOf(i4));
                }
                return LJ(i2, i3, i4, 10);
            }
            return LJ(i2, i3, i4, 5);
        }
        return new Pair(new IntRange(i2, i3), Integer.valueOf(i4));
    }

    public static long LIZLLL(Calendar calendar, long j, long j2, long j3, int i) {
        if (i != 1) {
            if (i != 2) {
                return j3;
            }
            return LJFF(calendar, j, j2, j3, 10);
        }
        return LJFF(calendar, j, j2, j3, 5);
    }

    public static long LJFF(Calendar calendar, long j, long j2, long j3, int i) {
        calendar.setTimeInMillis(j3);
        int i2 = calendar.get(12);
        if (i2 % i != 0) {
            calendar.set(12, (i2 / i) * i);
            j3 = calendar.getTimeInMillis();
            if (j > j3 || j3 > j2) {
                calendar.add(12, i);
                return calendar.getTimeInMillis();
            }
        }
        return j3;
    }

    public static long LJI(int i, int i2, long j, long j2, long j3) {
        int i3;
        if (i2 != 1 && i2 == 2) {
            i3 = 10;
        } else {
            i3 = 5;
        }
        long j4 = i;
        long j5 = j3 / j4;
        long j6 = 60;
        int i4 = (int) (j5 % j6);
        long j7 = j5 / j6;
        if (i4 % i3 != 0) {
            long j8 = (j7 * j6) + ((long) ((i4 / i3) * i3));
            j3 = j8 * j4;
            if (j > j3 || j3 > j2) {
                return (j8 + ((long) i3)) * j4;
            }
        }
        return j3;
    }
}
