package X;

/* JADX INFO: renamed from: X.0Wue, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838340Wue {
    public long LIZ;
    public long LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TimeAnchorBean(startTime=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(",costTime=");
        long j = this.LIZIZ - this.LIZ;
        if (j < 0) {
            j = 0;
        }
        sbLIZ.append(j);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
