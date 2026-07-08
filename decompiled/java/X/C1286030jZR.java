package X;

/* JADX INFO: renamed from: X.0jZR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1286030jZR {
    public final C1286060jZU[] LIZ;

    public C1286030jZR(long[] jArr) {
        if (jArr != null) {
            if (jArr.length > 1) {
                this.LIZ = new C1286060jZU[jArr.length / 2];
                for (int i = 1; i < jArr.length; i++) {
                    C1286060jZU c1286060jZU = new C1286060jZU();
                    c1286060jZU.LIZ = jArr[i - 1];
                    c1286060jZU.LIZIZ = jArr[i];
                    c1286060jZU.LIZJ = -1L;
                    this.LIZ[i / 2] = c1286060jZU;
                }
            }
        }
    }
}
