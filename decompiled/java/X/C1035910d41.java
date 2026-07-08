package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0d41, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1035910d41 implements Serializable {
    public static final C1035950d45 Companion = new Object() { // from class: X.0d45
    };
    public long loadDuration;
    public int loadingStatus;
    public boolean stopLoading;
    public long totalDuration;

    public C1035910d41() {
        this(0L, 0L, -1, false);
    }

    public final C1035910d41 copy(long j, long j2, int i, boolean z) {
        return new C1035910d41(j, j2, i, z);
    }

    public int hashCode() {
        return (((((C786410Ut5.Y2(this.totalDuration) * 31) + C786410Ut5.Y2(this.loadDuration)) * 31) + this.loadingStatus) * 31) + C786410Ut5.Z2(this.stopLoading);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdWebLoadStatusModel(totalDuration=");
        sbLIZ.append(this.totalDuration);
        sbLIZ.append(", loadDuration=");
        sbLIZ.append(this.loadDuration);
        sbLIZ.append(", loadingStatus=");
        sbLIZ.append(this.loadingStatus);
        sbLIZ.append(", stopLoading=");
        sbLIZ.append(this.stopLoading);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setLoadDuration(long j) {
        this.loadDuration = j;
    }

    public final void setLoadingStatus(int i) {
        this.loadingStatus = i;
    }

    public final void setStopLoading(boolean z) {
        this.stopLoading = z;
    }

    public final void setTotalDuration(long j) {
        this.totalDuration = j;
    }

    public C1035910d41(long j, long j2, int i, boolean z) {
        this.totalDuration = j;
        this.loadDuration = j2;
        this.loadingStatus = i;
        this.stopLoading = z;
    }
}
