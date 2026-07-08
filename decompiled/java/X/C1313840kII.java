package X;

import com.lynx.react.bridge.ReadableArray;

/* JADX INFO: renamed from: X.0kII, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313840kII {
    public final int LIZ;
    public final float LIZIZ;
    public final ReadableArray LIZJ;

    public final float LIZ() {
        if (this.LIZ == 0) {
            return this.LIZIZ;
        }
        return 0.0f;
    }

    public C1313840kII(float f) {
        this.LIZIZ = f;
        this.LIZ = 0;
    }

    public final float LIZIZ(float f) {
        return LIZJ(this.LIZJ, this.LIZIZ, this.LIZ, f);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        C1313840kII c1313840kII = (C1313840kII) obj;
        int i = this.LIZ;
        if (i != c1313840kII.LIZ) {
            return false;
        }
        if (i != 2) {
            return C1314000kIY.LIZ(this.LIZIZ, c1313840kII.LIZIZ);
        }
        return this.LIZJ.asArrayList().equals(c1313840kII.LIZJ.asArrayList());
    }

    public C1313840kII(InterfaceC1298070jsr interfaceC1298070jsr, int i) {
        if (i == 2) {
            this.LIZJ = interfaceC1298070jsr.asArray();
        } else if (i == 0 || i == 1) {
            this.LIZIZ = (float) interfaceC1298070jsr.asDouble();
        }
        this.LIZ = i;
    }

    public static float LIZJ(ReadableArray readableArray, float f, int i, float f2) {
        ReadableArray array;
        float f3;
        if (i == 1) {
            return f * f2;
        }
        if (i == 0) {
            return f;
        }
        if (i != 2) {
            return 0.0f;
        }
        float fLIZJ = 0.0f;
        for (int i2 = 0; i2 < readableArray.size(); i2 += 2) {
            int i3 = readableArray.getInt(i2 + 1);
            if (i3 == 2) {
                array = readableArray.getArray(i2);
            } else {
                array = null;
                if (i3 == 0 || i3 == 1) {
                    f3 = (float) readableArray.getDouble(i2);
                }
                fLIZJ += LIZJ(array, f3, i3, f2);
            }
            f3 = 0.0f;
            fLIZJ += LIZJ(array, f3, i3, f2);
        }
        return fLIZJ;
    }
}
