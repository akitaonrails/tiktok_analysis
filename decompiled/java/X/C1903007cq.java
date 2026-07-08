package X;

/* JADX INFO: renamed from: X.07cq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1903007cq {
    public static boolean LIZ(Number number, Number number2) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                long jLongValue = number.longValue();
                if (!(number2 instanceof Integer) && !(number2 instanceof Short) && !(number2 instanceof Byte)) {
                    if (number2 instanceof Long) {
                        if (jLongValue != number2.longValue()) {
                            return false;
                        }
                    } else if (number2 instanceof Float) {
                        if (jLongValue != number2.floatValue()) {
                            return false;
                        }
                    } else if (number2 instanceof Double) {
                        if (jLongValue != number2.doubleValue()) {
                            return false;
                        }
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(number2.getClass().getName());
                        sbLIZ.append("This type of addition operation is not supported");
                        throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else if (jLongValue != number2.intValue()) {
                    return false;
                }
                return true;
            }
            if (number instanceof Float) {
                float fFloatValue = number.floatValue();
                if (!(number2 instanceof Integer) && !(number2 instanceof Short) && !(number2 instanceof Byte)) {
                    if (number2 instanceof Long) {
                        if (fFloatValue != number2.longValue()) {
                            return false;
                        }
                    } else if (number2 instanceof Float) {
                        if (fFloatValue != number2.floatValue()) {
                            return false;
                        }
                    } else if (number2 instanceof Double) {
                        if (fFloatValue != number2.doubleValue()) {
                            return false;
                        }
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(number2.getClass().getName());
                        sbLIZ2.append("This type of addition operation is not supported");
                        throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                } else if (fFloatValue != number2.intValue()) {
                    return false;
                }
                return true;
            }
            if (number instanceof Double) {
                double dDoubleValue = number.doubleValue();
                if (!(number2 instanceof Integer) && !(number2 instanceof Short) && !(number2 instanceof Byte)) {
                    if (number2 instanceof Long) {
                        if (dDoubleValue != number2.longValue()) {
                            return false;
                        }
                    } else if (number2 instanceof Float) {
                        if (dDoubleValue != number2.floatValue()) {
                            return false;
                        }
                    } else if (number2 instanceof Double) {
                        if (dDoubleValue != number2.doubleValue()) {
                            return false;
                        }
                    } else {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(number2.getClass().getName());
                        sbLIZ3.append("This type of addition operation is not supported");
                        throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ3));
                    }
                } else if (dDoubleValue != number2.intValue()) {
                    return false;
                }
                return true;
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(number.getClass().getName());
            sbLIZ4.append("This type of addition operation is not supported");
            throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ4));
        }
        int iIntValue = number.intValue();
        if (!(number2 instanceof Integer) && !(number2 instanceof Short) && !(number2 instanceof Byte)) {
            if (number2 instanceof Long) {
                if (iIntValue != number2.longValue()) {
                    return false;
                }
            } else if (number2 instanceof Float) {
                if (iIntValue != number2.floatValue()) {
                    return false;
                }
            } else if (number2 instanceof Double) {
                if (iIntValue != number2.doubleValue()) {
                    return false;
                }
            } else {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(number2.getClass().getName());
                sbLIZ5.append("This type of addition operation is not supported");
                throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ5));
            }
        } else if (iIntValue != number2.intValue()) {
            return false;
        }
        return true;
    }
}
