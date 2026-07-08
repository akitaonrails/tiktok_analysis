package X;

/* JADX INFO: renamed from: X.0x26, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1803520x26 {
    public long LIZ;
    public long LIZIZ;

    public final Long LIZ() {
        if (this.LIZ != 0) {
            long jLIZ = C158B.LIZ() - this.LIZ;
            this.LIZIZ = jLIZ;
            return Long.valueOf(jLIZ);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LatencyTracking ");
        sbLIZ.append(getClass().getSimpleName());
        sbLIZ.append(" invalid. The field startTime is not initialized");
        C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        return null;
    }

    public final void LIZIZ() {
        this.LIZ = C158B.LIZ();
    }
}
