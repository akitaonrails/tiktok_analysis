package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0YzB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C892110YzB implements Serializable {
    public final long clickPushTime;
    public final boolean isFromColdBoot;

    public final boolean isFromColdBoot() {
        return this.isFromColdBoot;
    }

    public C892110YzB(long j, boolean z) {
        this.clickPushTime = j;
        this.isFromColdBoot = z;
    }
}
