package X;

/* JADX INFO: renamed from: X.0KT0, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public class C0KT0 {
    public final C0KT2 LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public C0KT0(C0KT2 c0kt2, String str, int i) {
        String str2;
        this.LIZ = c0kt2;
        this.LIZIZ = str;
        this.LIZJ = i;
        int i2 = C0KT3.LIZ[c0kt2.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    str2 = "others";
                } else {
                    str2 = "super_fan_privilege";
                }
            } else {
                str2 = "super_fan_goal";
            }
        } else {
            str2 = "super_fan_purchase";
        }
        this.LIZLLL = str2;
        this.LJ = c0kt2 == C0KT2.SUPER_FAN_GOAL ? c0kt2.getValue() : str;
    }
}
