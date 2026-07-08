package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Tzd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C764990Tzd extends AbstractC764660Tz6 {
    public final int LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C764990Tzd)) {
            return false;
        }
        C764990Tzd c764990Tzd = (C764990Tzd) obj;
        return this.LIZ == c764990Tzd.LIZ && Intrinsics.LJFF(this.LIZIZ, c764990Tzd.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowSearchListLoading(categoryId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", keyword=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C764990Tzd(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
