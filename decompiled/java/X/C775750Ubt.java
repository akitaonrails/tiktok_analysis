package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ubt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C775750Ubt extends AbstractC775780Ubw {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C775750Ubt)) {
            return false;
        }
        C775750Ubt c775750Ubt = (C775750Ubt) obj;
        return Intrinsics.LJFF(this.LIZ, c775750Ubt.LIZ) && Intrinsics.LJFF(this.LIZIZ, c775750Ubt.LIZIZ) && this.LIZJ == c775750Ubt.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReportToastClick(uiType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", toastType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C775750Ubt(String str, String str2, int i) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
    }
}
