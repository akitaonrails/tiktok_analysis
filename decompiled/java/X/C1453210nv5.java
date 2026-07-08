package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0nv5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1453210nv5 {
    public static final Map<String, Float> LIZ = new LinkedHashMap();

    public static final float LIZ(FilterBean filterBean) {
        Object objValueOf = ((LinkedHashMap) LIZ).get(filterBean.getId());
        if (objValueOf == null) {
            objValueOf = Float.valueOf(-1.0f);
        }
        return ((Number) objValueOf).floatValue();
    }

    public static final float LIZIZ(FilterBean filterBean, InterfaceC1453220nv6 interfaceC1453220nv6) {
        if (filterBean.getFilterFolder() != null) {
            Map<String, Float> map = LIZ;
            String id = filterBean.getId();
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            Object objValueOf = linkedHashMap.get(id);
            if (objValueOf == null) {
                objValueOf = Float.valueOf(interfaceC1453220nv6.LIZ(filterBean));
                linkedHashMap.put(id, objValueOf);
            }
            float fFloatValue = ((Number) objValueOf).floatValue();
            if (fFloatValue < 0.0f) {
                return 0.0f;
            }
            return fFloatValue;
        }
        return 0.8f;
    }

    public static final int LIZJ(FilterBean filterBean, float f, InterfaceC1453220nv6 interfaceC1453220nv6) {
        boolean z;
        int iLIZIZ;
        float fLIZIZ = LIZIZ(filterBean, interfaceC1453220nv6);
        if (fLIZIZ == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C419990GdR.LIZIZ(C814420VxA.LIZIZ(f * 100), 0, 100);
        }
        if (fLIZIZ <= 0.8f) {
            float f2 = f / (fLIZIZ / 80);
            if (Float.isNaN(f2)) {
                iLIZIZ = 0;
            } else {
                iLIZIZ = C814420VxA.LIZIZ(f2);
            }
            return C419990GdR.LIZIZ(iLIZIZ, 0, 100);
        }
        float f3 = 80;
        float f4 = fLIZIZ / f3;
        float f5 = (1.0f - fLIZIZ) / 20;
        if (f <= fLIZIZ) {
            return C419990GdR.LIZIZ(C814420VxA.LIZIZ(f / f4), 0, 100);
        }
        return C419990GdR.LIZIZ(C814420VxA.LIZIZ(f3 + ((f - fLIZIZ) / f5)), 0, 100);
    }

    public static final float LIZLLL(FilterBean filterBean, int i, InterfaceC1453220nv6 interfaceC1453220nv6) {
        double d;
        float fLIZIZ = LIZIZ(filterBean, interfaceC1453220nv6);
        if (fLIZIZ == 1.0f) {
            d = ((double) i) / 100.0d;
        } else if (fLIZIZ <= 0.8f) {
            d = ((double) i) * (((double) fLIZIZ) / 80.0d);
        } else {
            double d2 = fLIZIZ;
            double d3 = d2 / 80.0d;
            double d4 = (1.0d - d2) / 20.0d;
            if (i <= 80) {
                d = ((double) i) * d3;
            } else {
                d = d2 + (d4 * ((double) (i - 80)));
            }
        }
        return (float) d;
    }
}
