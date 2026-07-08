package X;

/* JADX INFO: renamed from: X.0HLm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C439560HLm {
    public static final boolean LIZIZ(float f, float f2, int i) {
        if (i != 6) {
            double d = f;
            if (d >= 0.5d && (d >= 0.8d || f2 <= 0.2d)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LIZ(float[] fArr) {
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            float f = fArr[i];
            int i3 = i2 + 1;
            switch (i2) {
                case 0:
                    if (f > C439570HLn.LIZ().angry) {
                        return false;
                    }
                    break;
                case 1:
                    if (f > C439570HLn.LIZ().disgust) {
                        return false;
                    }
                    break;
                case 2:
                    if (f > C439570HLn.LIZ().fear) {
                        return false;
                    }
                    break;
                case 3:
                    if (f > C439570HLn.LIZ().happy) {
                        return false;
                    }
                    break;
                case 4:
                    if (f > C439570HLn.LIZ().sad) {
                        return false;
                    }
                    break;
                case 5:
                    if (f > C439570HLn.LIZ().surprise) {
                        return false;
                    }
                    break;
                case 6:
                    if (f < C439570HLn.LIZ().neutral) {
                        return false;
                    }
                    break;
            }
            i++;
            i2 = i3;
        }
        return true;
    }
}
