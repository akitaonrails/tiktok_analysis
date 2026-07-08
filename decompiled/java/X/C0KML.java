package X;

/* JADX INFO: renamed from: X.0KML, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KML {
    public final String LIZ;
    public final int LIZIZ;
    public C0KMJ LIZJ = C0KMJ.CREATED;
    public C0KMJ LIZLLL = C0KMJ.IAP_STARTED;

    public final String LIZ() {
        C0KMJ c0kmj = this.LIZLLL;
        if (c0kmj == null) {
            return "no_callback";
        }
        int i = C0KMM.LIZ[c0kmj.ordinal()];
        return i != 1 ? i == 2 ? "failed" : "no_callback" : "success";
    }

    public C0KML(int i, String str) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
