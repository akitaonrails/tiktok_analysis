package X;

import android.text.Spannable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fhP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1137210fhP {
    public final EnumC1137110fhF LIZ;
    public final Spannable LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1137210fhP)) {
            return false;
        }
        C1137210fhP c1137210fhP = (C1137210fhP) obj;
        return this.LIZ == c1137210fhP.LIZ && Intrinsics.LJFF(this.LIZIZ, c1137210fhP.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Spannable spannable = this.LIZIZ;
        return iHashCode + (spannable == null ? 0 : spannable.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RightTagStep(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", text=");
        sbLIZ.append((Object) this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1137210fhP(EnumC1137110fhF enumC1137110fhF, Spannable spannable) {
        this.LIZ = enumC1137110fhF;
        this.LIZIZ = spannable;
    }
}
