package X;

/* JADX INFO: renamed from: X.1EPG, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EPG {
    public static C1EPD LIZ(int i) {
        C1EPD[] c1epdArrValues = C1EPD.valuesCustom();
        int length = c1epdArrValues.length;
        int i2 = 0;
        while (i2 < length) {
            C1EPD c1epd = c1epdArrValues[i2];
            i2++;
            if (c1epd.code == i) {
                return c1epd;
            }
        }
        return C1EPD.Unknown;
    }
}
