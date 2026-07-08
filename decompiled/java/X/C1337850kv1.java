package X;

import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0kv1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1337850kv1 {
    public static final boolean LIZ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            if (!(!a0.LJJJIL((CharSequence) obj)) || C1697810uHb.LJIIJJI("false", CardStruct.IStatusCode.DEFAULT).contains(a0.LJLIIIL((String) obj).toString().toLowerCase(Locale.ROOT))) {
                return false;
            }
            return true;
        }
        if (!(obj instanceof Number)) {
            return true;
        }
        double dDoubleValue = ((Number) obj).doubleValue();
        if (dDoubleValue == 0.0d || Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
            return false;
        }
        return true;
    }

    public static final List<Float> LIZJ(Object obj) {
        float fLIZIZ;
        if (obj == null || !(obj instanceof List)) {
            return null;
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(iterable, 10));
        for (Object obj2 : iterable) {
            if (obj2 instanceof Number) {
                fLIZIZ = ((Number) obj2).floatValue();
            } else if (obj2 instanceof String) {
                fLIZIZ = LIZIZ(0.0f, obj2);
            } else {
                if (!(obj2 instanceof C1337880kv4)) {
                    return null;
                }
                C1337880kv4 c1337880kv4 = (C1337880kv4) obj2;
                if (c1337880kv4.LIZIZ == 1) {
                    fLIZIZ = c1337880kv4.LIZ;
                } else {
                    fLIZIZ = 0.0f;
                }
            }
            arrayList.add(Float.valueOf(fLIZIZ));
        }
        return arrayList;
    }

    public static final Float LIZLLL(Object obj) {
        float fFloatValue;
        if (obj == null) {
            return null;
        }
        try {
            if (obj instanceof Number) {
                fFloatValue = ((Number) obj).floatValue();
            } else if (obj instanceof String) {
                fFloatValue = CastFloatProtector.parseFloat((String) obj);
            } else if (obj instanceof C1337880kv4) {
                if (((C1337880kv4) obj).LIZIZ == 1) {
                    fFloatValue = ((C1337880kv4) obj).LIZ;
                } else {
                    fFloatValue = 0.0f;
                }
            } else {
                throw new IllegalArgumentException("Unable to convert to Float: illegal parameter type");
            }
            return Float.valueOf(fFloatValue);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static final Integer LJFF(String str) {
        try {
            return C1337960kvC.LJIIIIZZ(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C1325860kbg.LJII()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("parse color error ");
                sbLIZ.append(th.getMessage());
                C1325860kbg.LJFF(th, C2188811AlT.LIZIZ(sbLIZ));
                return null;
            }
            throw th;
        }
    }

    public static final Map<String, Object> LJIIIZ(Object obj) {
        if (obj != null) {
            if (C19719512Dh.LJII(obj)) {
                return C19719512Dh.LIZJ(obj);
            }
            if (obj instanceof Map) {
                return new HashMap((Map) obj);
            }
            return null;
        }
        return null;
    }

    public static final String LJIIJ(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Double) {
            Number number = (Number) obj;
            long jDoubleValue = (long) number.doubleValue();
            if (number.doubleValue() == jDoubleValue) {
                return String.valueOf(jDoubleValue);
            }
            return String.valueOf(number.doubleValue());
        }
        if (obj instanceof Float) {
            Number number2 = (Number) obj;
            long jFloatValue = (long) number2.floatValue();
            if (number2.floatValue() == jFloatValue) {
                return String.valueOf(jFloatValue);
            }
            return String.valueOf(number2.floatValue());
        }
        if (obj instanceof Long) {
            return String.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof Integer) {
            return String.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof Short) {
            return String.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof Byte) {
            return String.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return String.valueOf(((Boolean) obj).booleanValue());
        }
        if (!(obj instanceof Character)) {
            return null;
        }
        return String.valueOf(((Character) obj).charValue());
    }

    public static final float LIZIZ(float f, Object obj) {
        if (obj == null) {
            return f;
        }
        try {
            if (obj instanceof Number) {
                return ((Number) obj).floatValue();
            }
            if (obj instanceof String) {
                return CastFloatProtector.parseFloat((String) obj);
            }
            if (obj instanceof C1337880kv4) {
                if (((C1337880kv4) obj).LIZIZ == 1) {
                    return ((C1337880kv4) obj).LIZ;
                }
                return 0.0f;
            }
            throw new IllegalArgumentException("Unable to convert to Float: illegal parameter type");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return f;
        }
    }

    public static final int LJ(int i, Object obj) {
        if (obj == null) {
            return i;
        }
        try {
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
            if (obj instanceof String) {
                return CastIntegerProtector.parseInt((String) obj);
            }
            throw new IllegalArgumentException("Unable to convert to Int: illegal parameter type");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return i;
        }
    }

    public static final int LJI(Object obj, C1168340gVc c1168340gVc) {
        if (Intrinsics.LJFF(obj, "auto")) {
            return -2;
        }
        if (!Intrinsics.LJFF(obj, "stretch")) {
            if (obj instanceof C1337880kv4) {
                C1337880kv4 c1337880kv4 = (C1337880kv4) obj;
                int i = c1337880kv4.LIZIZ;
                if (i == 0) {
                    return -2;
                }
                if (i != 1) {
                    if (i != 2 || c1337880kv4.LIZ != 100.0f) {
                        return -2;
                    }
                } else {
                    return (int) c1337880kv4.LIZ;
                }
            } else {
                if (obj instanceof Number) {
                    float fFloatValue = ((Number) obj).floatValue();
                    if (fFloatValue < 0.0f) {
                        return -2;
                    }
                    return C1337970kvD.LIZ(Float.valueOf(fFloatValue), c1168340gVc);
                }
                if (!(obj instanceof String)) {
                    return -2;
                }
                if (!Intrinsics.LJFF(obj, "100%")) {
                    Float fLIZLLL = LIZLLL(obj);
                    if (fLIZLLL == null) {
                        return -2;
                    }
                    return Math.round(C1337970kvD.LIZIZ(fLIZLLL, c1168340gVc));
                }
            }
        }
        return -1;
    }

    public static final long LJII(long j, Object obj) {
        if (obj == null) {
            return j;
        }
        try {
            if (obj instanceof Number) {
                return ((Number) obj).longValue();
            }
            if (obj instanceof String) {
                return CastLongProtector.parseLong((String) obj);
            }
            throw new IllegalArgumentException("Unable to convert to Long: illegal parameter type");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return j;
        }
    }

    public static final <VType> Map<String, VType> LJIIJJI(Map<String, ? extends VType> map, Map<String, ? extends VType> map2) {
        int size;
        int size2 = 0;
        if (map != null) {
            size = map.size();
        } else {
            size = 0;
        }
        if (map2 != null) {
            size2 = map2.size();
        }
        HashMap map3 = new HashMap((int) (((size + size2) / 0.75f) + 1.0f));
        if (map != null && (!map.isEmpty())) {
            map3.putAll(map);
        }
        if (map2 != null && (!map2.isEmpty())) {
            map3.putAll(map2);
        }
        return map3;
    }
}
