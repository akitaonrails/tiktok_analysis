package X;

/* JADX INFO: renamed from: X.0KM2, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KM2 {
    public final String LIZ;
    public final int LIZIZ;
    public C0KM4 LIZJ = C0KM4.CREATED;
    public C0KM4 LIZLLL = C0KM4.IAP_STARTED;

    public final String LIZ() {
        C0KM4 c0km4 = this.LIZLLL;
        if (c0km4 == null) {
            return "no_callback";
        }
        int i = C0KM3.LIZ[c0km4.ordinal()];
        return i != 1 ? i == 2 ? "failed" : "no_callback" : "success";
    }

    public C0KM2(int i, String str) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
