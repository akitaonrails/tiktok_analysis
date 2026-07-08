package X;

/* JADX INFO: renamed from: X.0cp7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1026670cp7 {
    public static final C1026670cp7 LIZLLL = new C1026670cp7(1, "route_success");
    public static final C1026670cp7 LJ = new C1026670cp7(-1, "condition_mismatch");
    public final int LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CRouterResult(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", message='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("')");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1026670cp7(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = i == 1;
    }
}
