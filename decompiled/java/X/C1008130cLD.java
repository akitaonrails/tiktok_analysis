package X;

/* JADX INFO: renamed from: X.0cLD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1008130cLD {
    public final String LIZIZ;
    public final String LIZ = "sell_points";
    public final String LIZJ = null;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIAgentPayload(event=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sellingPoint=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", summary=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1008130cLD(String str) {
        this.LIZIZ = str;
    }
}
