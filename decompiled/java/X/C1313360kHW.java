package X;

import android.graphics.Color;
import com.lynx.react.bridge.ReadableArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0kHW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313360kHW {
    public int LIZ;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public float LJ;
    public float LJFF;
    public int LJI;

    public final boolean LIZ() {
        return this.LJI == 1;
    }

    public final int hashCode() {
        int i = ((this.LJI * 31) + this.LIZ) * 31;
        float f = this.LIZIZ;
        int iFloatToIntBits = (i + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.LIZJ;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        float f3 = this.LIZLLL;
        int iFloatToIntBits3 = (iFloatToIntBits2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
        float f4 = this.LJ;
        int iFloatToIntBits4 = (iFloatToIntBits3 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
        float f5 = this.LJFF;
        return iFloatToIntBits4 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShadowData: Color: red ");
        sbLIZ.append(Color.red(this.LIZ));
        sbLIZ.append(" green: ");
        sbLIZ.append(Color.green(this.LIZ));
        sbLIZ.append(" blue: ");
        sbLIZ.append(Color.blue(Color.blue(this.LIZ)));
        sbLIZ.append(" OffsetX: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(" offsetY: ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(" blurRadius: ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(" spreadRadius: ");
        sbLIZ.append(this.LJ);
        sbLIZ.append("option: ");
        sbLIZ.append(this.LJI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static List<C1313360kHW> LIZIZ(ReadableArray readableArray) {
        if (readableArray != null && readableArray.size() != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < readableArray.size(); i++) {
                ReadableArray array = readableArray.getArray(i);
                C1313360kHW c1313360kHW = new C1313360kHW();
                c1313360kHW.LIZIZ = (float) array.getDouble(0);
                c1313360kHW.LIZJ = (float) array.getDouble(1);
                float f = (float) array.getDouble(2);
                c1313360kHW.LIZLLL = f;
                c1313360kHW.LJFF = f * 1.25f;
                c1313360kHW.LJ = (float) array.getDouble(3);
                c1313360kHW.LJI = array.getInt(4);
                int i2 = (int) array.getLong(5);
                c1313360kHW.LIZ = i2;
                if ((c1313360kHW.LIZIZ != 0.0f || c1313360kHW.LIZJ != 0.0f || c1313360kHW.LIZLLL != 0.0f || c1313360kHW.LJ != 0.0f) && Color.alpha(i2) != 0 && c1313360kHW.LIZLLL >= 0.0f) {
                    arrayList.add(c1313360kHW);
                }
            }
            return arrayList;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1313360kHW.class != obj.getClass()) {
            return false;
        }
        C1313360kHW c1313360kHW = (C1313360kHW) obj;
        if (this.LIZ == c1313360kHW.LIZ && Float.compare(c1313360kHW.LIZIZ, this.LIZIZ) == 0 && Float.compare(c1313360kHW.LIZJ, this.LIZJ) == 0 && Float.compare(c1313360kHW.LIZLLL, this.LIZLLL) == 0 && Float.compare(c1313360kHW.LJ, this.LJ) == 0 && Float.compare(c1313360kHW.LJFF, this.LJFF) == 0 && this.LJI == c1313360kHW.LJI) {
            return true;
        }
        return false;
    }
}
