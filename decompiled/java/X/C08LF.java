package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.08LF, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08LF {
    public static final <T extends Number> double LIZ(List<T> list) {
        double dDoubleValue;
        double d = 0.0d;
        if (list.isEmpty()) {
            return 0.0d;
        }
        for (T t : list) {
            if (t instanceof Float) {
                dDoubleValue = t.doubleValue();
            } else if (t instanceof Double) {
                dDoubleValue = t.doubleValue();
            } else if (t instanceof Integer) {
                dDoubleValue = t.doubleValue();
            } else if (t instanceof Long) {
                dDoubleValue = t.doubleValue();
            }
            d += dDoubleValue;
        }
        return d / ((double) list.size());
    }

    public static final double LIZJ(List list) {
        if (list.isEmpty()) {
            return 0.0d;
        }
        Iterator it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (((Boolean) it2.next()).booleanValue()) {
                i++;
            }
        }
        return ((double) i) / ((double) list.size());
    }

    public static final long LJ(List<Long> list) {
        if (list.isEmpty()) {
            return 0L;
        }
        Iterator<Long> it2 = list.iterator();
        long j = Long.MIN_VALUE;
        while (it2.hasNext()) {
            long jLongValue = it2.next().longValue();
            if (jLongValue > j) {
                j = jLongValue;
            }
        }
        return j;
    }

    public static final long LJFF(List<Long> list) {
        if (list.isEmpty()) {
            return 0L;
        }
        Iterator<Long> it2 = list.iterator();
        long j = Long.MAX_VALUE;
        while (it2.hasNext()) {
            long jLongValue = it2.next().longValue();
            if (jLongValue < j) {
                j = jLongValue;
            }
        }
        return j;
    }

    public static final int LIZIZ(long j, List list) {
        int i = 0;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        while (i < size) {
            if (((Number) ListProtector.get(list, i)).longValue() < j) {
                i++;
            } else {
                i++;
                i2 = i;
            }
            iMax = Math.max(iMax, i - i2);
        }
        return iMax;
    }

    public static final double LIZLLL(Number number, List list) {
        if (list.isEmpty()) {
            return 0.0d;
        }
        Iterator it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            Number number2 = (Number) it2.next();
            if (number2 instanceof Float) {
                if (((Float) number2).floatValue() < ((Float) number).floatValue()) {
                    i++;
                }
            } else if (number2 instanceof Double) {
                if (((Double) number2).doubleValue() < ((Double) number).doubleValue()) {
                    i++;
                }
            } else if (number2 instanceof Integer) {
                if (((Integer) number2).intValue() < ((Integer) number).intValue()) {
                    i++;
                }
            } else if ((number2 instanceof Long) && ((Long) number2).longValue() < ((Long) number).longValue()) {
                i++;
            }
        }
        return ((double) i) / ((double) list.size());
    }
}
