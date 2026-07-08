package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Uur, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C787510Uur {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C787510Uur)) {
            return false;
        }
        C787510Uur c787510Uur = (C787510Uur) obj;
        return Intrinsics.LJFF(this.LIZ, c787510Uur.LIZ) && Intrinsics.LJFF(this.LIZIZ, c787510Uur.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ViewerWishesGameMetadata(interactiveGameId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", interactiveGameName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C787510Uur(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
