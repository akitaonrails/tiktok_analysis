package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07p8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1979207p8 {
    public static boolean LIZIZ(Object obj) {
        if (obj == null) {
            return false;
        }
        if ((obj instanceof Boolean) && !((Boolean) obj).booleanValue()) {
            return false;
        }
        if ((obj instanceof Number) && ((Number) obj).floatValue() < 0.0f) {
            return false;
        }
        return true;
    }

    public static InterfaceC1979907pF LIZ(int i, String str, List list) {
        AbstractC1979807pE abstractC1979807pE;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (EnumC1982507pf.isSymbol(((InterfaceC1979907pF) it2.next()).LIZIZ())) {
                throw new IllegalArgumentException(str.substring(0, i));
            }
        }
        LinkedList<InterfaceC1979907pF> linkedList = new LinkedList(list);
        int i2 = 5;
        do {
            LinkedList linkedList2 = new LinkedList();
            for (InterfaceC1979907pF interfaceC1979907pF : linkedList) {
                if (linkedList2.isEmpty()) {
                    linkedList2.addLast(interfaceC1979907pF);
                } else if (EnumC1979607pC.isOperator(((InterfaceC1979907pF) linkedList2.peekLast()).LIZIZ()) && ((EnumC1979607pC) ((InterfaceC1979907pF) linkedList2.peekLast()).LIZIZ()).getPriority() == i2) {
                    InterfaceC1979907pF interfaceC1979907pF2 = (InterfaceC1979907pF) linkedList2.pollLast();
                    InterfaceC1979907pF interfaceC1979907pF3 = (InterfaceC1979907pF) linkedList2.pollLast();
                    if (!EnumC1979607pC.isOperator(interfaceC1979907pF3.LIZIZ()) && !EnumC1979607pC.isOperator(interfaceC1979907pF.LIZIZ())) {
                        switch (C1979107p7.LIZ[((EnumC1979607pC) interfaceC1979907pF2.LIZIZ()).ordinal()]) {
                            case 1:
                                abstractC1979807pE = new AbstractC1979807pE() { // from class: X.07p4
                                    {
                                        EnumC1979607pC enumC1979607pC = EnumC1979607pC.MINUS;
                                    }

                                    @Override // X.InterfaceC1979907pF
                                    public final Object LIZ(Map<String, JSONObject> map) {
                                        Object objLIZ;
                                        Object objLIZ2 = this.LIZ.LIZ(map);
                                        if (objLIZ2 == null || (objLIZ = this.LIZIZ.LIZ(map)) == null) {
                                            return null;
                                        }
                                        Number number = (Number) objLIZ2;
                                        Number number2 = (Number) objLIZ;
                                        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
                                            if (number instanceof Long) {
                                                long jLongValue = number.longValue();
                                                if (!(number2 instanceof Integer) && !(number2 instanceof Short) && !(number2 instanceof Byte)) {
                                                    if (number2 instanceof Long) {
                                                        return Long.valueOf(jLongValue - number2.longValue());
                                                    }
                                                    if (number2 instanceof Float) {
                                                        return Float.valueOf(jLongValue - number2.floatValue());
                                                    }
                                                    if (number2 instanceof Double) {
                                                        return Double.valueOf(jLongValue - number2.doubleValue());
                                                    }
                                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                    sbLIZ.append(number2.getClass().getName());
                                                    sbLIZ.append("This type of addition operation is not supported");
                                                    throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
                                                }
                                                return Long.valueOf(jLongValue - ((long) number2.intValue()));
                                            }
                                            if (number instanceof Float) {
                                                float fFloatValue = number.floatValue();
                                                if (!(number2 instanceof Integer) && !(number2 instanceof Short) && !(number2 instanceof Byte)) {
                                                    if (number2 instanceof Long) {
                                                        return Float.valueOf(fFloatValue - number2.longValue());
                                                    }
                                                    if (number2 instanceof Float) {
                                                        return Float.valueOf(fFloatValue - number2.floatValue());
                                                    }
                                                    if (number2 instanceof Double) {
                                                        return Double.valueOf(((double) fFloatValue) - number2.doubleValue());
                                                    }
                                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                    sbLIZ2.append(number2.getClass().getName());
                                                    sbLIZ2.append("This type of addition operation is not supported");
                                                    throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ2));
                                                }
                                                return Float.valueOf(fFloatValue - number2.intValue());
                                            }
                                            if (number instanceof Double) {
                                                double dDoubleValue = number.doubleValue();
                                                if (!(number2 instanceof Integer) && !(number2 instanceof Short) && !(number2 instanceof Byte)) {
                                                    if (number2 instanceof Long) {
                                                        return Double.valueOf(dDoubleValue - number2.longValue());
                                                    }
                                                    if (number2 instanceof Float) {
                                                        return Double.valueOf(dDoubleValue - ((double) number2.floatValue()));
                                                    }
                                                    if (number2 instanceof Double) {
                                                        return Double.valueOf(dDoubleValue - number2.doubleValue());
                                                    }
                                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                    sbLIZ3.append(number2.getClass().getName());
                                                    sbLIZ3.append("This type of addition operation is not supported");
                                                    throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ3));
                                                }
                                                return Double.valueOf(dDoubleValue - ((double) number2.intValue()));
                                            }
                                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                            sbLIZ4.append(number.getClass().getName());
                                            sbLIZ4.append("This type of addition operation is not supported");
                                            throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ4));
                                        }
                                        int iIntValue = number.intValue();
                                        if (!(number2 instanceof Integer) && !(number2 instanceof Short) && !(number2 instanceof Byte)) {
                                            if (number2 instanceof Long) {
                                                return Long.valueOf(((long) iIntValue) - number2.longValue());
                                            }
                                            if (number2 instanceof Float) {
                                                return Float.valueOf(iIntValue - number2.floatValue());
                                            }
                                            if (number2 instanceof Double) {
                                                return Double.valueOf(((double) iIntValue) - number2.doubleValue());
                                            }
                                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                            sbLIZ5.append(number2.getClass().getName());
                                            sbLIZ5.append("This type of addition operation is not supported");
                                            throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ5));
                                        }
                                        return Integer.valueOf(iIntValue - number2.intValue());
                                    }
                                };
                                break;
                            case 2:
                                abstractC1979807pE = new AbstractC1979807pE() { // from class: X.07pB
                                    public static final C1980207pI LIZLLL = new ThreadLocal<StringBuilder>() { // from class: X.07pI
                                        @Override // java.lang.ThreadLocal
                                        public final StringBuilder initialValue() {
                                            return new StringBuilder();
                                        }
                                    };

                                    {
                                        EnumC1979607pC enumC1979607pC = EnumC1979607pC.PLUS;
                                    }

                                    @Override // X.InterfaceC1979907pF
                                    public final Object LIZ(Map<String, JSONObject> map) {
                                        Object objLIZ;
                                        Object objLIZ2 = this.LIZ.LIZ(map);
                                        if (objLIZ2 == null || (objLIZ = this.LIZIZ.LIZ(map)) == null) {
                                            return null;
                                        }
                                        if (!(objLIZ2 instanceof String) && !(objLIZ instanceof String)) {
                                            Number number = (Number) objLIZ2;
                                            Number number2 = (Number) objLIZ;
                                            if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
                                                if (number instanceof Long) {
                                                    long jLongValue = number.longValue();
                                                    if (!(number2 instanceof Integer) && !(number2 instanceof Short) && !(number2 instanceof Byte)) {
                                                        if (number2 instanceof Long) {
                                                            return Long.valueOf(jLongValue + number2.longValue());
                                                        }
                                                        if (number2 instanceof Float) {
                                                            return Float.valueOf(jLongValue + number2.floatValue());
                                                        }
                                                        if (number2 instanceof Double) {
                                                            return Double.valueOf(jLongValue + number2.doubleValue());
                                                        }
                                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                        sbLIZ.append(number2.getClass().getName());
                                                        sbLIZ.append("This type of addition operation is not supported");
                                                        throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
                                                    }
                                                    return Long.valueOf(jLongValue + ((long) number2.intValue()));
                                                }
                                                if (number instanceof Float) {
                                                    float fFloatValue = number.floatValue();
                                                    if (!(number2 instanceof Integer) && !(number2 instanceof Short) && !(number2 instanceof Byte)) {
                                                        if (number2 instanceof Long) {
                                                            return Float.valueOf(fFloatValue + number2.longValue());
                                                        }
                                                        if (number2 instanceof Float) {
                                                            return Float.valueOf(fFloatValue + number2.floatValue());
                                                        }
                                                        if (number2 instanceof Double) {
                                                            return Double.valueOf(((double) fFloatValue) + number2.doubleValue());
                                                        }
                                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                        sbLIZ2.append(number2.getClass().getName());
                                                        sbLIZ2.append("This type of addition operation is not supported");
                                                        throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ2));
                                                    }
                                                    return Float.valueOf(fFloatValue + number2.intValue());
                                                }
                                                if (number instanceof Double) {
                                                    double dDoubleValue = number.doubleValue();
                                                    if (!(number2 instanceof Integer) && !(number2 instanceof Short) && !(number2 instanceof Byte)) {
                                                        if (number2 instanceof Long) {
                                                            return Double.valueOf(dDoubleValue + number2.longValue());
                                                        }
                                                        if (number2 instanceof Float) {
                                                            return Double.valueOf(dDoubleValue + ((double) number2.floatValue()));
                                                        }
                                                        if (number2 instanceof Double) {
                                                            return Double.valueOf(dDoubleValue + number2.doubleValue());
                                                        }
                                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                        sbLIZ3.append(number2.getClass().getName());
                                                        sbLIZ3.append("This type of addition operation is not supported");
                                                        throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ3));
                                                    }
                                                    return Double.valueOf(dDoubleValue + ((double) number2.intValue()));
                                                }
                                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                sbLIZ4.append(number.getClass().getName());
                                                sbLIZ4.append("This type of addition operation is not supported");
                                                throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ4));
                                            }
                                            int iIntValue = number.intValue();
                                            if (!(number2 instanceof Integer) && !(number2 instanceof Short) && !(number2 instanceof Byte)) {
                                                if (number2 instanceof Long) {
                                                    return Long.valueOf(((long) iIntValue) + number2.longValue());
                                                }
                                                if (number2 instanceof Float) {
                                                    return Float.valueOf(iIntValue + number2.floatValue());
                                                }
                                                if (number2 instanceof Double) {
                                                    return Double.valueOf(((double) iIntValue) + number2.doubleValue());
                                                }
                                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                                sbLIZ5.append(number2.getClass().getName());
                                                sbLIZ5.append("This type of addition operation is not supported");
                                                throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ5));
                                            }
                                            return Integer.valueOf(iIntValue + number2.intValue());
                                        }
                                        StringBuilder sb = LIZLLL.get();
                                        sb.append(objLIZ2);
                                        sb.append(objLIZ);
                                        String string = sb.toString();
                                        sb.setLength(0);
                                        return string;
                                    }
                                };
                                break;
                            case 3:
                                abstractC1979807pE = new AbstractC1979807pE() { // from class: X.07ox
                                    {
                                        EnumC1979607pC enumC1979607pC = EnumC1979607pC.DIVISION;
                                    }

                                    @Override // X.InterfaceC1979907pF
                                    public final Object LIZ(Map<String, JSONObject> map) {
                                        Object objLIZ;
                                        Object objLIZ2 = this.LIZ.LIZ(map);
                                        if (objLIZ2 == null || (objLIZ = this.LIZIZ.LIZ(map)) == null) {
                                            return null;
                                        }
                                        Number number = (Number) objLIZ2;
                                        Number number2 = (Number) objLIZ;
                                        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
                                            if (number instanceof Long) {
                                                long jLongValue = number.longValue();
                                                if (!(number2 instanceof Integer) && !(number2 instanceof Short) && !(number2 instanceof Byte)) {
                                                    if (number2 instanceof Long) {
                                                        return Long.valueOf(jLongValue / number2.longValue());
                                                    }
                                                    if (number2 instanceof Float) {
                                                        return Float.valueOf(jLongValue / number2.floatValue());
                                                    }
                                                    if (number2 instanceof Double) {
                                                        return Double.valueOf(jLongValue / number2.doubleValue());
                                                    }
                                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                    sbLIZ.append(number2.getClass().getName());
                                                    sbLIZ.append("This type of addition operation is not supported");
                                                    throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
                                                }
                                                return Long.valueOf(jLongValue / ((long) number2.intValue()));
                                            }
                                            if (number instanceof Float) {
                                                float fFloatValue = number.floatValue();
                                                if (!(number2 instanceof Integer) && !(number2 instanceof Short) && !(number2 instanceof Byte)) {
                                                    if (number2 instanceof Long) {
                                                        return Float.valueOf(fFloatValue / number2.longValue());
                                                    }
                                                    if (number2 instanceof Float) {
                                                        return Float.valueOf(fFloatValue / number2.floatValue());
                                                    }
                                                    if (number2 instanceof Double) {
                                                        return Double.valueOf(((double) fFloatValue) / number2.doubleValue());
                                                    }
                                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                    sbLIZ2.append(number2.getClass().getName());
                                                    sbLIZ2.append("This type of addition operation is not supported");
                                                    throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ2));
                                                }
                                                return Float.valueOf(fFloatValue / number2.intValue());
                                            }
                                            if (number instanceof Double) {
                                                double dDoubleValue = number.doubleValue();
                                                if (!(number2 instanceof Integer) && !(number2 instanceof Short) && !(number2 instanceof Byte)) {
                                                    if (number2 instanceof Long) {
                                                        return Double.valueOf(dDoubleValue / number2.longValue());
                                                    }
                                                    if (number2 instanceof Float) {
                                                        return Double.valueOf(dDoubleValue / ((double) number2.floatValue()));
                                                    }
                                                    if (number2 instanceof Double) {
                                                        return Double.valueOf(dDoubleValue / number2.doubleValue());
                                                    }
                                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                    sbLIZ3.append(number2.getClass().getName());
                                                    sbLIZ3.append("This type of addition operation is not supported");
                                                    throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ3));
                                                }
                                                return Double.valueOf(dDoubleValue / ((double) number2.intValue()));
                                            }
                                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                            sbLIZ4.append(number.getClass().getName());
                                            sbLIZ4.append("This type of addition operation is not supported");
                                            throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ4));
                                        }
                                        int iIntValue = number.intValue();
                                        if (!(number2 instanceof Integer) && !(number2 instanceof Short) && !(number2 instanceof Byte)) {
                                            if (number2 instanceof Long) {
                                                return Long.valueOf(((long) iIntValue) / number2.longValue());
                                            }
                                            if (number2 instanceof Float) {
                                                return Float.valueOf(iIntValue / number2.floatValue());
                                            }
                                            if (number2 instanceof Double) {
                                                return Double.valueOf(((double) iIntValue) / number2.doubleValue());
                                            }
                                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                            sbLIZ5.append(number2.getClass().getName());
                                            sbLIZ5.append("This type of addition operation is not supported");
                                            throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ5));
                                        }
                                        return Integer.valueOf(iIntValue / number2.intValue());
                                    }
                                };
                                break;
                            case 4:
                                abstractC1979807pE = new AbstractC1979807pE() { // from class: X.07p6
                                    {
                                        EnumC1979607pC enumC1979607pC = EnumC1979607pC.MULTI;
                                    }

                                    @Override // X.InterfaceC1979907pF
                                    public final Object LIZ(Map<String, JSONObject> map) {
                                        Object objLIZ;
                                        Object objLIZ2 = this.LIZ.LIZ(map);
                                        if (objLIZ2 == null || (objLIZ = this.LIZIZ.LIZ(map)) == null) {
                                            return null;
                                        }
                                        Number number = (Number) objLIZ2;
                                        Number number2 = (Number) objLIZ;
                                        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
                                            if (number instanceof Long) {
                                                long jLongValue = number.longValue();
                                                if (!(number2 instanceof Integer) && !(number2 instanceof Short) && !(number2 instanceof Byte)) {
                                                    if (number2 instanceof Long) {
                                                        return Long.valueOf(jLongValue * number2.longValue());
                                                    }
                                                    if (number2 instanceof Float) {
                                                        return Float.valueOf(jLongValue * number2.floatValue());
                                                    }
                                                    if (number2 instanceof Double) {
                                                        return Double.valueOf(jLongValue * number2.doubleValue());
                                                    }
                                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                    sbLIZ.append(number2.getClass().getName());
                                                    sbLIZ.append("This type of addition operation is not supported");
                                                    throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
                                                }
                                                return Long.valueOf(jLongValue * ((long) number2.intValue()));
                                            }
                                            if (number instanceof Float) {
                                                float fFloatValue = number.floatValue();
                                                if (!(number2 instanceof Integer) && !(number2 instanceof Short) && !(number2 instanceof Byte)) {
                                                    if (number2 instanceof Long) {
                                                        return Float.valueOf(fFloatValue * number2.longValue());
                                                    }
                                                    if (number2 instanceof Float) {
                                                        return Float.valueOf(fFloatValue * number2.floatValue());
                                                    }
                                                    if (number2 instanceof Double) {
                                                        return Double.valueOf(((double) fFloatValue) * number2.doubleValue());
                                                    }
                                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                    sbLIZ2.append(number2.getClass().getName());
                                                    sbLIZ2.append("This type of addition operation is not supported");
                                                    throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ2));
                                                }
                                                return Float.valueOf(fFloatValue * number2.intValue());
                                            }
                                            if (number instanceof Double) {
                                                double dDoubleValue = number.doubleValue();
                                                if (!(number2 instanceof Integer) && !(number2 instanceof Short) && !(number2 instanceof Byte)) {
                                                    if (number2 instanceof Long) {
                                                        return Double.valueOf(dDoubleValue * number2.longValue());
                                                    }
                                                    if (number2 instanceof Float) {
                                                        return Double.valueOf(dDoubleValue * ((double) number2.floatValue()));
                                                    }
                                                    if (number2 instanceof Double) {
                                                        return Double.valueOf(dDoubleValue * number2.doubleValue());
                                                    }
                                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                    sbLIZ3.append(number2.getClass().getName());
                                                    sbLIZ3.append("This type of addition operation is not supported");
                                                    throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ3));
                                                }
                                                return Double.valueOf(dDoubleValue * ((double) number2.intValue()));
                                            }
                                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                            sbLIZ4.append(number.getClass().getName());
                                            sbLIZ4.append("This type of addition operation is not supported");
                                            throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ4));
                                        }
                                        int iIntValue = number.intValue();
                                        if (!(number2 instanceof Integer) && !(number2 instanceof Short) && !(number2 instanceof Byte)) {
                                            if (number2 instanceof Long) {
                                                return Long.valueOf(((long) iIntValue) * number2.longValue());
                                            }
                                            if (number2 instanceof Float) {
                                                return Float.valueOf(iIntValue * number2.floatValue());
                                            }
                                            if (number2 instanceof Double) {
                                                return Double.valueOf(((double) iIntValue) * number2.doubleValue());
                                            }
                                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                            sbLIZ5.append(number2.getClass().getName());
                                            sbLIZ5.append("This type of addition operation is not supported");
                                            throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ5));
                                        }
                                        return Integer.valueOf(iIntValue * number2.intValue());
                                    }
                                };
                                break;
                            case 5:
                                abstractC1979807pE = new AbstractC1979807pE() { // from class: X.07p5
                                    {
                                        EnumC1979607pC enumC1979607pC = EnumC1979607pC.MOD;
                                    }

                                    @Override // X.InterfaceC1979907pF
                                    public final Object LIZ(Map<String, JSONObject> map) {
                                        Object objLIZ;
                                        Object objLIZ2 = this.LIZ.LIZ(map);
                                        if (objLIZ2 == null || (objLIZ = this.LIZIZ.LIZ(map)) == null) {
                                            return null;
                                        }
                                        Number number = (Number) objLIZ2;
                                        Number number2 = (Number) objLIZ;
                                        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
                                            if (number instanceof Long) {
                                                long jLongValue = number.longValue();
                                                if (!(number2 instanceof Integer) && !(number2 instanceof Short) && !(number2 instanceof Byte)) {
                                                    if (number2 instanceof Long) {
                                                        return Long.valueOf(jLongValue % number2.longValue());
                                                    }
                                                    if (number2 instanceof Float) {
                                                        return Float.valueOf(jLongValue % number2.floatValue());
                                                    }
                                                    if (number2 instanceof Double) {
                                                        return Double.valueOf(jLongValue % number2.doubleValue());
                                                    }
                                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                    sbLIZ.append(number2.getClass().getName());
                                                    sbLIZ.append("This type of addition operation is not supported");
                                                    throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
                                                }
                                                return Long.valueOf(jLongValue % ((long) number2.intValue()));
                                            }
                                            if (number instanceof Float) {
                                                float fFloatValue = number.floatValue();
                                                if (!(number2 instanceof Integer) && !(number2 instanceof Short) && !(number2 instanceof Byte)) {
                                                    if (number2 instanceof Long) {
                                                        return Float.valueOf(fFloatValue % number2.longValue());
                                                    }
                                                    if (number2 instanceof Float) {
                                                        return Float.valueOf(fFloatValue % number2.floatValue());
                                                    }
                                                    if (number2 instanceof Double) {
                                                        return Double.valueOf(((double) fFloatValue) % number2.doubleValue());
                                                    }
                                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                    sbLIZ2.append(number2.getClass().getName());
                                                    sbLIZ2.append("This type of addition operation is not supported");
                                                    throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ2));
                                                }
                                                return Float.valueOf(fFloatValue % number2.intValue());
                                            }
                                            if (number instanceof Double) {
                                                double dDoubleValue = number.doubleValue();
                                                if (!(number2 instanceof Integer) && !(number2 instanceof Short) && !(number2 instanceof Byte)) {
                                                    if (number2 instanceof Long) {
                                                        return Double.valueOf(dDoubleValue % number2.longValue());
                                                    }
                                                    if (number2 instanceof Float) {
                                                        return Double.valueOf(dDoubleValue % ((double) number2.floatValue()));
                                                    }
                                                    if (number2 instanceof Double) {
                                                        return Double.valueOf(dDoubleValue % number2.doubleValue());
                                                    }
                                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                    sbLIZ3.append(number2.getClass().getName());
                                                    sbLIZ3.append("This type of addition operation is not supported");
                                                    throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ3));
                                                }
                                                return Double.valueOf(dDoubleValue % ((double) number2.intValue()));
                                            }
                                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                            sbLIZ4.append(number.getClass().getName());
                                            sbLIZ4.append("This type of addition operation is not supported");
                                            throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ4));
                                        }
                                        int iIntValue = number.intValue();
                                        if (!(number2 instanceof Integer) && !(number2 instanceof Short) && !(number2 instanceof Byte)) {
                                            if (number2 instanceof Long) {
                                                return Long.valueOf(((long) iIntValue) % number2.longValue());
                                            }
                                            if (number2 instanceof Float) {
                                                return Float.valueOf(iIntValue % number2.floatValue());
                                            }
                                            if (number2 instanceof Double) {
                                                return Double.valueOf(((double) iIntValue) % number2.doubleValue());
                                            }
                                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                            sbLIZ5.append(number2.getClass().getName());
                                            sbLIZ5.append("This type of addition operation is not supported");
                                            throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ5));
                                        }
                                        return Integer.valueOf(iIntValue % number2.intValue());
                                    }
                                };
                                break;
                            case 6:
                                abstractC1979807pE = new AbstractC1979807pE() { // from class: X.07oy
                                    {
                                        EnumC1979607pC enumC1979607pC = EnumC1979607pC.EQ;
                                    }

                                    @Override // X.InterfaceC1979907pF
                                    public final Object LIZ(Map<String, JSONObject> map) {
                                        Object objLIZ = this.LIZ.LIZ(map);
                                        Object objLIZ2 = this.LIZIZ.LIZ(map);
                                        if (objLIZ == null) {
                                            if (objLIZ2 == null) {
                                                return Boolean.TRUE;
                                            }
                                            return Boolean.FALSE;
                                        }
                                        if (objLIZ2 == null) {
                                            return Boolean.FALSE;
                                        }
                                        if ((objLIZ instanceof Number) && (objLIZ2 instanceof Number)) {
                                            return Boolean.valueOf(C1903007cq.LIZ((Number) objLIZ, (Number) objLIZ2));
                                        }
                                        return Boolean.valueOf(objLIZ.equals(objLIZ2));
                                    }
                                };
                                break;
                            case 7:
                                abstractC1979807pE = new AbstractC1979807pE() { // from class: X.07oz
                                    {
                                        EnumC1979607pC enumC1979607pC = EnumC1979607pC.NOT_EQ;
                                    }

                                    @Override // X.InterfaceC1979907pF
                                    public final Object LIZ(Map<String, JSONObject> map) {
                                        Object objLIZ = this.LIZ.LIZ(map);
                                        Object objLIZ2 = this.LIZIZ.LIZ(map);
                                        if (objLIZ == null) {
                                            if (objLIZ2 == null) {
                                                return Boolean.FALSE;
                                            }
                                            return Boolean.TRUE;
                                        }
                                        if (objLIZ2 == null) {
                                            return Boolean.TRUE;
                                        }
                                        if ((objLIZ instanceof Number) && (objLIZ2 instanceof Number)) {
                                            return Boolean.valueOf(!C1903007cq.LIZ((Number) objLIZ, (Number) objLIZ2));
                                        }
                                        return Boolean.valueOf(!objLIZ.equals(objLIZ2));
                                    }
                                };
                                break;
                            case 8:
                                abstractC1979807pE = new AbstractC1979807pE() { // from class: X.07p3
                                    {
                                        EnumC1979607pC enumC1979607pC = EnumC1979607pC.GT;
                                    }

                                    @Override // X.InterfaceC1979907pF
                                    public final Object LIZ(Map<String, JSONObject> map) {
                                        Object objLIZ;
                                        Object objLIZ2 = this.LIZ.LIZ(map);
                                        if (objLIZ2 == null || (objLIZ = this.LIZIZ.LIZ(map)) == null) {
                                            return null;
                                        }
                                        return C1902807co.LIZIZ((Number) objLIZ, objLIZ2);
                                    }
                                };
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                abstractC1979807pE = new AbstractC1979807pE() { // from class: X.07p1
                                    {
                                        EnumC1979607pC enumC1979607pC = EnumC1979607pC.LT;
                                    }

                                    @Override // X.InterfaceC1979907pF
                                    public final Object LIZ(Map<String, JSONObject> map) {
                                        Object objLIZ;
                                        Object objLIZ2 = this.LIZ.LIZ(map);
                                        if (objLIZ2 == null || (objLIZ = this.LIZIZ.LIZ(map)) == null) {
                                            return null;
                                        }
                                        return C1902907cp.LIZIZ((Number) objLIZ, objLIZ2);
                                    }
                                };
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                abstractC1979807pE = new AbstractC1979807pE() { // from class: X.07p0
                                    {
                                        EnumC1979607pC enumC1979607pC = EnumC1979607pC.GT_EQ;
                                    }

                                    @Override // X.InterfaceC1979907pF
                                    public final Object LIZ(Map<String, JSONObject> map) {
                                        Object objLIZ;
                                        if (this.LIZ.LIZ(map) == null || (objLIZ = this.LIZIZ.LIZ(map)) == null) {
                                            return null;
                                        }
                                        return Boolean.valueOf(!((Boolean) C1902907cp.LIZIZ((Number) objLIZ, r2)).booleanValue());
                                    }
                                };
                                break;
                            case BdTuring.TYPE_EMAIL /* 11 */:
                                abstractC1979807pE = new AbstractC1979807pE() { // from class: X.07p2
                                    {
                                        EnumC1979607pC enumC1979607pC = EnumC1979607pC.LT_EQ;
                                    }

                                    @Override // X.InterfaceC1979907pF
                                    public final Object LIZ(Map<String, JSONObject> map) {
                                        Object objLIZ;
                                        if (this.LIZ.LIZ(map) == null || (objLIZ = this.LIZIZ.LIZ(map)) == null) {
                                            return null;
                                        }
                                        return Boolean.valueOf(!((Boolean) C1902807co.LIZIZ((Number) objLIZ, r2)).booleanValue());
                                    }
                                };
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                abstractC1979807pE = new AbstractC1979807pE() { // from class: X.07pA
                                    {
                                        EnumC1979607pC enumC1979607pC = EnumC1979607pC.DOUBLE_AMP;
                                    }

                                    @Override // X.AbstractC1979807pE
                                    public final String toString() {
                                        return LIZJ();
                                    }

                                    @Override // X.InterfaceC1979907pF
                                    public final Object LIZ(Map<String, JSONObject> map) {
                                        boolean z;
                                        if (C1979207p8.LIZIZ(this.LIZ.LIZ(map)) && C1979207p8.LIZIZ(this.LIZIZ.LIZ(map))) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        return Boolean.valueOf(z);
                                    }
                                };
                                break;
                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                abstractC1979807pE = new AbstractC1979807pE() { // from class: X.07pD
                                    {
                                        EnumC1979607pC enumC1979607pC = EnumC1979607pC.DOUBLE_BAR;
                                    }

                                    @Override // X.AbstractC1979807pE
                                    public final String toString() {
                                        return LIZJ();
                                    }

                                    @Override // X.InterfaceC1979907pF
                                    public final Object LIZ(Map<String, JSONObject> map) {
                                        boolean z;
                                        if (!C1979207p8.LIZIZ(this.LIZ.LIZ(map)) && !C1979207p8.LIZIZ(this.LIZIZ.LIZ(map))) {
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                        return Boolean.valueOf(z);
                                    }
                                };
                                break;
                            default:
                                throw new UnsupportedOperationException(interfaceC1979907pF2.LIZIZ().toString());
                        }
                        abstractC1979807pE.LIZ = interfaceC1979907pF3;
                        abstractC1979807pE.LIZIZ = interfaceC1979907pF;
                        linkedList2.addLast(abstractC1979807pE);
                    } else {
                        throw new IllegalArgumentException(str.substring(0, i));
                    }
                } else {
                    linkedList2.addLast(interfaceC1979907pF);
                }
            }
            i2--;
            linkedList = linkedList2;
        } while (i2 >= 1);
        LinkedList linkedList3 = new LinkedList();
        for (InterfaceC1979907pF interfaceC1979907pF4 : linkedList) {
            if (linkedList3.isEmpty()) {
                linkedList3.addLast(interfaceC1979907pF4);
            } else if (((InterfaceC1979907pF) linkedList3.peekLast()).LIZIZ() == EnumC1979607pC.COLON) {
                linkedList3.pollLast();
                InterfaceC1979907pF interfaceC1979907pF5 = (InterfaceC1979907pF) linkedList3.pollLast();
                if (((InterfaceC1979907pF) linkedList3.pollLast()).LIZIZ() == EnumC1979607pC.QUESTION) {
                    InterfaceC1979907pF interfaceC1979907pF6 = (InterfaceC1979907pF) linkedList3.pollLast();
                    C1979307p9 c1979307p9 = new C1979307p9();
                    c1979307p9.LIZ = interfaceC1979907pF6;
                    c1979307p9.LIZIZ = interfaceC1979907pF5;
                    c1979307p9.LIZJ = interfaceC1979907pF4;
                    linkedList3.addLast(c1979307p9);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                linkedList3.addLast(interfaceC1979907pF4);
            }
        }
        if (linkedList3.size() == 1) {
            return (InterfaceC1979907pF) linkedList3.getFirst();
        }
        throw new IllegalStateException();
    }
}
