package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IAS, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0IAS implements C0IAV {
    public final CharSequence LIZ;
    public final String LIZIZ;
    public final Map<String, String> LIZJ;
    public final String LIZLLL;
    public final C0IAQ LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0IAS)) {
            return false;
        }
        C0IAS c0ias = (C0IAS) obj;
        return Intrinsics.LJFF(this.LIZ, c0ias.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0ias.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0ias.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0ias.LIZLLL) && Intrinsics.LJFF(this.LJ, c0ias.LJ) && Intrinsics.LJFF(this.LJFF, c0ias.LJFF);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, String> map = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.LIZLLL;
        int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LJ.hashCode()) * 31;
        String str3 = this.LJFF;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendMessage(msg=");
        sbLIZ.append((Object) this.LIZ);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", localExt=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", quoteType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0IAS(CharSequence charSequence, String str, Map<String, String> map, String str2, C0IAQ c0iaq, String str3) {
        this.LIZ = charSequence;
        this.LIZIZ = str;
        this.LIZJ = map;
        this.LIZLLL = str2;
        this.LJ = c0iaq;
        this.LJFF = str3;
    }
}
