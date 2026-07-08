package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;

/* JADX INFO: renamed from: X.0VqV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C810290VqV {
    public Long LIZ;
    public long LIZIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(String.valueOf(this.LIZ));
        sbLIZ.append("|");
        sbLIZ.append(String.valueOf(this.LIZIZ));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(String str) {
        String[] strArrSplit;
        if (str != null && (strArrSplit = str.split("\\|")) != null && strArrSplit.length == 2) {
            this.LIZ = CastLongProtector.valueOf(strArrSplit[0]);
            this.LIZIZ = CastLongProtector.valueOf(strArrSplit[1]).longValue();
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C810290VqV) && obj != null) {
            return this.LIZ.equals(((C810290VqV) obj).LIZ);
        }
        return super.equals(obj);
    }
}
