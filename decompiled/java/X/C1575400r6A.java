package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r6A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1575400r6A {
    public static final /* synthetic */ int LIZ = 0;

    public static Object LIZ(String str, EnumC2215431BnJ enumC2215431BnJ) {
        int i = C2215411BnH.LIZIZ[enumC2215431BnJ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new C1954807lC();
                    }
                    return str;
                }
                try {
                    return Double.valueOf(CastDoubleProtector.parseDouble(str));
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else {
                try {
                    return Long.valueOf(CastLongProtector.parseLong(str));
                } catch (NumberFormatException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        } else {
            try {
                return Integer.valueOf(CastIntegerProtector.parseInt(str));
            } catch (NumberFormatException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    public static boolean LIZJ(AbstractC1556890qcJ abstractC1556890qcJ, Map map) {
        Object objLIZ;
        ?? LIZ2;
        String str;
        String str2;
        Object objLJIIJJI;
        if (abstractC1556890qcJ instanceof C1556880qcI) {
            C1556880qcI c1556880qcI = (C1556880qcI) abstractC1556890qcJ;
            if (!c1556880qcI.LIZIZ.isEmpty()) {
                int i = C2215411BnH.LIZ[c1556880qcI.LIZ.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        Iterator<AbstractC1556890qcJ> it2 = c1556880qcI.LIZIZ.iterator();
                        while (it2.hasNext()) {
                            if (LIZJ(it2.next(), map)) {
                            }
                        }
                        return false;
                    }
                    throw new C1954807lC();
                }
                Iterator<AbstractC1556890qcJ> it3 = c1556880qcI.LIZIZ.iterator();
                while (it3.hasNext()) {
                    if (!LIZJ(it3.next(), map)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        if (abstractC1556890qcJ instanceof C1557900qdw) {
            C1557900qdw c1557900qdw = (C1557900qdw) abstractC1556890qcJ;
            String str3 = (String) map.get(c1557900qdw.LIZ);
            if (str3 != null && (objLIZ = LIZ(str3, c1557900qdw.LIZLLL)) != null) {
                if (C1697810uHb.LJIIJJI(EnumC2215401BnG.IN, EnumC2215401BnG.NOT_IN).contains(c1557900qdw.LIZJ)) {
                    Object obj = c1557900qdw.LIZIZ;
                    EnumC2215431BnJ enumC2215431BnJ = c1557900qdw.LIZLLL;
                    if (obj instanceof List) {
                        List list = (List) obj;
                        if (!list.isEmpty()) {
                            LIZ2 = new ArrayList();
                            for (Object obj2 : list) {
                                int i2 = C2215411BnH.LIZIZ[enumC2215431BnJ.ordinal()];
                                if (i2 != 1) {
                                    if (i2 != 2) {
                                        if (i2 != 3) {
                                            if (i2 == 4) {
                                                if (obj2 != null) {
                                                    objLJIIJJI = obj2.toString();
                                                } else {
                                                    return false;
                                                }
                                            } else {
                                                throw new C1954807lC();
                                            }
                                        } else if (obj2 instanceof Number) {
                                            objLJIIJJI = Double.valueOf(((Number) obj2).doubleValue());
                                        } else if (obj2 instanceof String) {
                                            objLJIIJJI = C2327809Ae.LJII((String) obj2);
                                        } else {
                                            return false;
                                        }
                                    } else if (obj2 instanceof Number) {
                                        objLJIIJJI = Long.valueOf(((Number) obj2).longValue());
                                    } else if (obj2 instanceof String) {
                                        objLJIIJJI = C2095008Iq.LJIILIIL((String) obj2);
                                    } else {
                                        return false;
                                    }
                                } else if (obj2 instanceof Number) {
                                    objLJIIJJI = Integer.valueOf(((Number) obj2).intValue());
                                } else if (obj2 instanceof String) {
                                    objLJIIJJI = C2095008Iq.LJIIJJI((String) obj2);
                                } else {
                                    return false;
                                }
                                if (objLJIIJJI != null) {
                                    LIZ2.add(objLJIIJJI);
                                } else {
                                    return false;
                                }
                            }
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    LIZ2 = LIZ(c1557900qdw.LIZIZ.toString(), c1557900qdw.LIZLLL);
                    if (LIZ2 == 0) {
                        return false;
                    }
                }
                EnumC2215401BnG enumC2215401BnG = c1557900qdw.LIZJ;
                EnumC2215431BnJ enumC2215431BnJ2 = c1557900qdw.LIZLLL;
                try {
                    switch (C2215411BnH.LIZJ[enumC2215401BnG.ordinal()]) {
                        case 1:
                            return Intrinsics.LJFF(objLIZ, LIZ2);
                        case 2:
                            if (!Intrinsics.LJFF(objLIZ, LIZ2)) {
                                return true;
                            }
                            return false;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            int i3 = C2215411BnH.LIZIZ[enumC2215431BnJ2.ordinal()];
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    if (i3 != 3) {
                                        if (i3 != 4) {
                                            throw new C1954807lC();
                                        }
                                        return false;
                                    }
                                    return LIZIZ((Double) objLIZ, (Double) LIZ2, enumC2215401BnG);
                                }
                                return LIZIZ((Long) objLIZ, (Long) LIZ2, enumC2215401BnG);
                            }
                            return LIZIZ((Integer) objLIZ, (Integer) LIZ2, enumC2215401BnG);
                        case 7:
                        case 8:
                            if (LIZ2 instanceof List) {
                                boolean zContains = ((List) LIZ2).contains(objLIZ);
                                if (enumC2215401BnG != EnumC2215401BnG.IN) {
                                    if (!zContains) {
                                        return true;
                                    }
                                    return false;
                                }
                                return zContains;
                            }
                            return false;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            if (C2215411BnH.LIZIZ[enumC2215431BnJ2.ordinal()] == 4 && (LIZ2 instanceof String) && (str = (String) LIZ2) != null && (objLIZ instanceof String) && (str2 = (String) objLIZ) != null) {
                                return PatternProtector.compile(str).matcher(str2).matches();
                            }
                            return false;
                        default:
                            throw new C1954807lC();
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("FilterEvaluator comparison failed: ");
                    sbLIZ.append(e.getMessage());
                    C201955140j.LJIIZILJ(C2188811AlT.LIZIZ(sbLIZ));
                    return false;
                }
            }
            return false;
        }
        throw new C1954807lC();
    }

    public static boolean LIZIZ(Number number, Number number2, EnumC2215401BnG enumC2215401BnG) {
        int i = C2215411BnH.LIZJ[enumC2215401BnG.ordinal()];
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6 && number.doubleValue() <= number2.doubleValue()) {
                        return true;
                    }
                    return false;
                }
                if (number.doubleValue() >= number2.doubleValue()) {
                    return true;
                }
                return false;
            }
            if (number.doubleValue() < number2.doubleValue()) {
                return true;
            }
            return false;
        }
        if (number.doubleValue() > number2.doubleValue()) {
            return true;
        }
        return false;
    }
}
