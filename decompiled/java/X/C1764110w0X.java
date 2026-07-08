package X;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0w0X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1764110w0X extends AbstractC1764660w1Q {
    public final String LIZ;
    public final String LIZIZ;
    public final Intent LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1764110w0X)) {
            return false;
        }
        C1764110w0X c1764110w0X = (C1764110w0X) obj;
        return Intrinsics.LJFF(this.LIZ, c1764110w0X.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1764110w0X.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1764110w0X.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1764110w0X.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Intent intent = this.LIZJ;
        return ((iHashCode2 + (intent != null ? intent.hashCode() : 0)) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoModel(aid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", ids=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", intent=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", nodeId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1764660w1Q
    public final String LIZ() {
        return this.LIZLLL;
    }

    public C1764110w0X(Intent intent, String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = intent;
        this.LIZLLL = str3;
    }
}
