package X;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0VId, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C795410VId {
    public final Map<String, Object> LIZ = new HashMap();

    public final C795380VIa LIZ() throws IOException {
        C795380VIa c795380VIa = new C795380VIa((Map<String, ?>) this.LIZ);
        C795380VIa.LIZLLL(c795380VIa);
        return c795380VIa;
    }

    public final void LIZJ(Map map) {
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            LIZIZ(entry.getValue(), (String) entry.getKey());
        }
    }

    public final void LIZIZ(Object obj, String str) {
        if (obj == null) {
            ((HashMap) this.LIZ).put(str, null);
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls != Boolean.class && cls != Byte.class && cls != Integer.class && cls != Long.class && cls != Float.class && cls != Double.class && cls != String.class && cls != Boolean[].class && cls != Byte[].class && cls != Integer[].class && cls != Long[].class && cls != Float[].class && cls != Double[].class && cls != String[].class) {
            int i = 0;
            if (cls == boolean[].class) {
                Map<String, Object> map = this.LIZ;
                boolean[] zArr = (boolean[]) obj;
                C795380VIa c795380VIa = C795380VIa.LIZIZ;
                Boolean[] boolArr = new Boolean[zArr.length];
                while (i < zArr.length) {
                    boolArr[i] = Boolean.valueOf(zArr[i]);
                    i++;
                }
                ((HashMap) map).put(str, boolArr);
                return;
            }
            if (cls == byte[].class) {
                Map<String, Object> map2 = this.LIZ;
                byte[] bArr = (byte[]) obj;
                C795380VIa c795380VIa2 = C795380VIa.LIZIZ;
                Byte[] bArr2 = new Byte[bArr.length];
                while (i < bArr.length) {
                    bArr2[i] = Byte.valueOf(bArr[i]);
                    i++;
                }
                ((HashMap) map2).put(str, bArr2);
                return;
            }
            if (cls == int[].class) {
                Map<String, Object> map3 = this.LIZ;
                int[] iArr = (int[]) obj;
                C795380VIa c795380VIa3 = C795380VIa.LIZIZ;
                Integer[] numArr = new Integer[iArr.length];
                while (i < iArr.length) {
                    numArr[i] = Integer.valueOf(iArr[i]);
                    i++;
                }
                ((HashMap) map3).put(str, numArr);
                return;
            }
            if (cls == long[].class) {
                Map<String, Object> map4 = this.LIZ;
                long[] jArr = (long[]) obj;
                C795380VIa c795380VIa4 = C795380VIa.LIZIZ;
                Long[] lArr = new Long[jArr.length];
                while (i < jArr.length) {
                    lArr[i] = Long.valueOf(jArr[i]);
                    i++;
                }
                ((HashMap) map4).put(str, lArr);
                return;
            }
            if (cls == float[].class) {
                Map<String, Object> map5 = this.LIZ;
                float[] fArr = (float[]) obj;
                C795380VIa c795380VIa5 = C795380VIa.LIZIZ;
                Float[] fArr2 = new Float[fArr.length];
                while (i < fArr.length) {
                    fArr2[i] = Float.valueOf(fArr[i]);
                    i++;
                }
                ((HashMap) map5).put(str, fArr2);
                return;
            }
            if (cls == double[].class) {
                Map<String, Object> map6 = this.LIZ;
                double[] dArr = (double[]) obj;
                C795380VIa c795380VIa6 = C795380VIa.LIZIZ;
                Double[] dArr2 = new Double[dArr.length];
                while (i < dArr.length) {
                    dArr2[i] = Double.valueOf(dArr[i]);
                    i++;
                }
                ((HashMap) map6).put(str, dArr2);
                return;
            }
            throw new IllegalArgumentException(C786410Ut5.j4("Key %s has invalid type %s", new Object[]{str, cls}));
        }
        ((HashMap) this.LIZ).put(str, obj);
    }

    public final void LIZLLL(String str, String str2) {
        ((HashMap) this.LIZ).put(str, str2);
    }
}
