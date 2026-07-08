package X;

import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: X.0W4V, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0W4V extends Exception {
    public final Status LL;

    public Status getStatus() {
        return this.LL;
    }

    public int getStatusCode() {
        return this.LL.zzd;
    }

    public String getStatusMessage() {
        return this.LL.zze;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0W4V(Status status) {
        int i = status.zzd;
        String str = status.zze;
        super(i + ": " + (str == null ? "" : str));
        this.LL = status;
    }
}
