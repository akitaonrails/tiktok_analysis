package X;

/* JADX INFO: renamed from: X.0kKI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1315080kKI {
    public final float LIZ;
    public final EnumC1315090kKJ LIZIZ;

    public C1315080kKI() {
        this.LIZIZ = EnumC1315090kKJ.UNKNOWN;
    }

    public static C1315080kKI LIZIZ(String str) {
        int length;
        if (str != null && (length = str.length()) > 1) {
            if (str.endsWith("%")) {
                return new C1315080kKI(EnumC1315090kKJ.PERCENTAGE, C1312920kGo.LIZ(str, 0.0f));
            }
            if (length > 2 && str.endsWith("px")) {
                return new C1315080kKI(EnumC1315090kKJ.DEVICE_PX, C1312920kGo.LIZ(str, 0.0f));
            }
            return null;
        }
        return null;
    }

    public final float LIZ(float f) {
        EnumC1315090kKJ enumC1315090kKJ = this.LIZIZ;
        if (enumC1315090kKJ == EnumC1315090kKJ.PERCENTAGE) {
            return this.LIZ * f;
        }
        if (enumC1315090kKJ == EnumC1315090kKJ.DEVICE_PX) {
            return this.LIZ;
        }
        return 0.0f;
    }

    public C1315080kKI(EnumC1315090kKJ enumC1315090kKJ, float f) {
        this.LIZIZ = enumC1315090kKJ;
        this.LIZ = f;
    }
}
