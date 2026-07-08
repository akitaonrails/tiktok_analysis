package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IAT, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0IAT implements C0IAV {
    public final CharSequence LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Map<String, String> LIZLLL;
    public final String LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0IAT)) {
            return false;
        }
        C0IAT c0iat = (C0IAT) obj;
        return Intrinsics.LJFF(this.LIZ, c0iat.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0iat.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0iat.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0iat.LIZLLL) && Intrinsics.LJFF(this.LJ, c0iat.LJ) && Intrinsics.LJFF(this.LJFF, c0iat.LJFF);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        String str3 = this.LJ;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJFF;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckIndexBeforeSend(msg=");
        sbLIZ.append((Object) this.LIZ);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", messageIndex=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", localExt=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0IAT(CharSequence charSequence, String str, String str2, Map<String, String> map, String str3, String str4) {
        this.LIZ = charSequence;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = map;
        this.LJ = str3;
        this.LJFF = str4;
    }
}
