package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mAN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1385810mAN extends AbstractC1385800mAM {
    public final String LL;

    public final C1385810mAN copy(String str) {
        return new C1385810mAN(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1385810mAN) && Intrinsics.LJFF(this.LL, ((C1385810mAN) obj).LL);
    }

    public int hashCode() {
        return this.LL.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MatcherCreationFailed(message=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LL;
    }

    public C1385810mAN(String str) {
        this.LL = str;
    }
}
