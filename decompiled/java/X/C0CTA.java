package X;

/* JADX INFO: renamed from: X.0CTA, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CTA {
    public final int LIZIZ;
    public final long LIZLLL;
    public final boolean LIZ = true;
    public final boolean LIZJ = false;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinSDKOption(enableWal=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", loadPageSize=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enableDbOptimize=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", delayTime=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0CTA(long j, int i) {
        this.LIZIZ = i;
        this.LIZLLL = j;
    }
}
