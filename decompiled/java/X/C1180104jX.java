package X;

/* JADX INFO: renamed from: X.04jX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1180104jX {
    public final String LIZ;
    public final int LIZIZ;
    public final Boolean LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaLightenKey(uuid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", maskTypeInt=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isOnFirstScreen=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1180104jX(String str, int i, Boolean bool) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = bool;
    }
}
