package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0oyv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1494030oyv implements Serializable, Comparable<C1494030oyv> {
    public final String LL;
    public final boolean LLILLJJLI;
    public final long LLILLL = System.currentTimeMillis();
    public InterfaceC1494050oyx mHttpDnsCallback;

    public String getHost() {
        return this.LL;
    }

    public boolean isLocalDnsExpired() {
        return this.LLILLJJLI;
    }

    @Override // java.lang.Comparable
    public int compareTo(C1494030oyv c1494030oyv) {
        long j = c1494030oyv.LLILLL;
        long j2 = this.LLILLL;
        if (j == j2) {
            return 0;
        }
        if (j < j2) {
            return -1;
        }
        return 1;
    }

    public C1494030oyv(String str, InterfaceC1494050oyx interfaceC1494050oyx, boolean z) {
        this.LL = str;
        this.LLILLJJLI = z;
    }
}
