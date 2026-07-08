package X;

import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZrH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C912690ZrH implements C164G {
    public final String LIZ;
    public final List<TextExtraStruct> LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;

    @Override // X.C164G
    public final boolean LIZ() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C912690ZrH)) {
            return false;
        }
        C912690ZrH c912690ZrH = (C912690ZrH) obj;
        return Intrinsics.LJFF(this.LIZ, c912690ZrH.LIZ) && Intrinsics.LJFF(this.LIZIZ, c912690ZrH.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c912690ZrH.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c912690ZrH.LIZLLL) && this.LJ == c912690ZrH.LJ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<TextExtraStruct> list = this.LIZIZ;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentData(commentText=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", commentTranslatedTextExtra=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cid=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", textLanguage=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", translated=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C912690ZrH(String str, String str2, boolean z, String str3, List list) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = z;
    }
}
