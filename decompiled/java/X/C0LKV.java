package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LKV, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LKV {
    public final String LIZ;
    public final Long LIZIZ;
    public final String LIZJ;

    public C0LKV() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LKV)) {
            return false;
        }
        C0LKV c0lkv = (C0LKV) obj;
        return Intrinsics.LJFF(this.LIZ, c0lkv.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0lkv.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0lkv.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.LIZIZ;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.LIZJ;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoUploadResult(vid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0LKV(String str, int i) {
        this((i & 1) != 0 ? null : str, null, null);
    }

    public C0LKV(String str, Long l, String str2) {
        this.LIZ = str;
        this.LIZIZ = l;
        this.LIZJ = str2;
    }
}
