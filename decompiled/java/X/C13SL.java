package X;

/* JADX INFO: renamed from: X.13SL, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13SL implements C13SE {
    public final C13M9[] LIZ;
    public final C20008813Qo[] LIZIZ;

    @Override // X.C13SE
    public final void close() {
        for (C20008813Qo c20008813Qo : this.LIZIZ) {
            if (c20008813Qo != null) {
                C13SB.LIZIZ(c20008813Qo);
            }
        }
    }

    public C13SL(C13M9[] c13m9Arr, C20008813Qo[] c20008813QoArr) {
        this.LIZ = c13m9Arr;
        this.LIZIZ = c20008813QoArr;
    }
}
