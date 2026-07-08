package X;

import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.19Mz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21528319Mz {
    public C19N9 LIZ;
    public int LIZIZ;
    public int LJ;
    public String LJFF;
    public boolean LJII;
    public long LJIIIIZZ;
    public final int[] LIZJ = new int[10];
    public final float[][] LIZLLL = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);
    public final float[] LJI = new float[3];
    public float LJIIIZ = Float.NaN;

    public abstract boolean LIZLLL(float f, long j, View view, C1781840wT8 c1781840wT8);

    public final String toString() {
        String strLIZIZ = this.LJFF;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.LJ; i++) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(e3.e);
            sbLIZ.append(this.LIZJ[i]);
            sbLIZ.append(" , ");
            sbLIZ.append(decimalFormat.format(this.LIZLLL[i]));
            sbLIZ.append("] ");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        return strLIZIZ;
    }

    public final float LIZ(float f) {
        float fAbs;
        switch (this.LIZIZ) {
            case 1:
                return Math.signum(f * 6.2831855f);
            case 2:
                fAbs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f * 6.2831855f);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f * 6.2831855f);
        }
        return 1.0f - fAbs;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJ(int r15) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC21528319Mz.LJ(int):void");
    }

    public final float LIZIZ(float f, long j, View view, C1781840wT8 c1781840wT8) {
        this.LIZ.LIZLLL(this.LJI, f);
        float[] fArr = this.LJI;
        float f2 = fArr[1];
        if (f2 == 0.0f) {
            this.LJII = false;
            return fArr[2];
        }
        if (Float.isNaN(this.LJIIIZ)) {
            float fLIZ = c1781840wT8.LIZ(view, this.LJFF);
            this.LJIIIZ = fLIZ;
            if (Float.isNaN(fLIZ)) {
                this.LJIIIZ = 0.0f;
            }
        }
        float f3 = (float) ((((double) this.LJIIIZ) + (((j - this.LJIIIIZZ) * 1.0E-9d) * ((double) f2))) % 1.0d);
        this.LJIIIZ = f3;
        String str = this.LJFF;
        if (!c1781840wT8.LIZ.containsKey(view)) {
            HashMap<String, float[]> map = new HashMap<>();
            map.put(str, new float[]{f3});
            c1781840wT8.LIZ.put(view, map);
        } else {
            HashMap<String, float[]> map2 = c1781840wT8.LIZ.get(view);
            if (!map2.containsKey(str)) {
                map2.put(str, new float[]{f3});
                c1781840wT8.LIZ.put(view, map2);
            } else {
                float[] fArrCopyOf = map2.get(str);
                if (fArrCopyOf.length <= 0) {
                    fArrCopyOf = Arrays.copyOf(fArrCopyOf, 1);
                }
                fArrCopyOf[0] = f3;
                map2.put(str, fArrCopyOf);
            }
        }
        this.LJIIIIZZ = j;
        float f4 = this.LJI[0];
        float fLIZ2 = (LIZ(this.LJIIIZ) * f4) + this.LJI[2];
        int i = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
        this.LJII = true;
        return fLIZ2;
    }

    public void LIZJ(float f, float f2, float f3, int i, int i2) {
        int[] iArr = this.LIZJ;
        int i3 = this.LJ;
        iArr[i3] = i;
        float[] fArr = this.LIZLLL[i3];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        this.LIZIZ = Math.max(this.LIZIZ, i2);
        this.LJ++;
    }
}
