package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iEc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1234680iEc implements InterfaceC2753014t {
    public final String LL;
    public final String LLILLJJLI;
    public final long LLILLL;
    public final boolean LLILZ;
    public final String LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1234680iEc)) {
            return false;
        }
        C1234680iEc c1234680iEc = (C1234680iEc) obj;
        return Intrinsics.LJFF(this.LL, c1234680iEc.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1234680iEc.LLILLJJLI) && this.LLILLL == c1234680iEc.LLILLL && this.LLILZ == c1234680iEc.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1234680iEc.LLILZIL);
    }

    public final int hashCode() {
        return (((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Y2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UGDeeplinkInsertFeedForNewUserProperty(awemeId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", ugdpId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", insertStartTime=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", fromAf=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", sourceId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1234680iEc(long j, boolean z, String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = j;
        this.LLILZ = z;
        this.LLILZIL = str2;
    }
}
