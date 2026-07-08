package X;

import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.07co, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1902807co {
    public static Object LIZ(float f, Number number) {
        boolean z = true;
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                if (f <= number.longValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            if (number instanceof Float) {
                if (f <= number.floatValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            if (number instanceof Double) {
                if (f <= number.doubleValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(number.getClass().getName());
            sbLIZ.append("This type of addition operation is not supported");
            throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (f <= number.intValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static Object LIZIZ(Number number, Object obj) {
        boolean z = false;
        if (!(obj instanceof Integer) && !(obj instanceof Short) && !(obj instanceof Byte)) {
            if (obj instanceof Long) {
                long jLongValue = ((Long) obj).longValue();
                if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
                    if (number instanceof Long) {
                        if (jLongValue > number.longValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                    if (number instanceof Float) {
                        if (jLongValue > number.floatValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                    if (number instanceof Double) {
                        if (jLongValue > number.doubleValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(number.getClass().getName());
                    sbLIZ.append("This type of addition operation is not supported");
                    throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
                }
                if (jLongValue > number.intValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            if (obj instanceof Float) {
                return LIZ(((Float) obj).floatValue(), number);
            }
            if (obj instanceof Double) {
                double dDoubleValue = ((Double) obj).doubleValue();
                if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
                    if (number instanceof Long) {
                        if (dDoubleValue > number.longValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                    if (number instanceof Float) {
                        if (dDoubleValue > number.floatValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                    if (number instanceof Double) {
                        if (dDoubleValue > number.doubleValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(number.getClass().getName());
                    sbLIZ2.append("This type of addition operation is not supported");
                    throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ2));
                }
                if (dDoubleValue > number.intValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            if (obj instanceof String) {
                try {
                    return LIZ(CastFloatProtector.parseFloat((String) obj), number);
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(obj.getClass().getName());
                    sbLIZ3.append("This type of addition operation is not supported");
                    throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(obj.getClass().getName());
            sbLIZ4.append("This type of addition operation is not supported");
            throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ4));
        }
        int iIntValue = ((Number) obj).intValue();
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                if (iIntValue > number.longValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            if (number instanceof Float) {
                if (iIntValue > number.floatValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            if (number instanceof Double) {
                if (iIntValue > number.doubleValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(number.getClass().getName());
            sbLIZ5.append("This type of addition operation is not supported");
            throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ5));
        }
        if (iIntValue > number.intValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
