package X;

/* JADX INFO: renamed from: X.0jRL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1281010jRL {
    public int LIZ;
    public long LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{\"scenario\":");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(",\"update_time_ms\":");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(",\"network_quality\":");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(",\"bandwidth_kbps\":");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(",\"rtt_ms\":");
        sbLIZ.append(this.LJ);
        sbLIZ.append(",\"loss_rate_percent\":");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(",\"jitter_ms\":");
        sbLIZ.append(this.LJI);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
