package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS135S1100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kxc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1339460kxc {
    public final String LIZ;
    public final String LIZIZ = "comment_panel_edit";
    public final Aweme LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Function1<C0HD9, View.OnClickListener> LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1339460kxc)) {
            return false;
        }
        C1339460kxc c1339460kxc = (C1339460kxc) obj;
        return Intrinsics.LJFF(this.LIZ, c1339460kxc.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1339460kxc.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1339460kxc.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1339460kxc.LIZLLL) && Intrinsics.LJFF(this.LJ, c1339460kxc.LJ) && Intrinsics.LJFF(this.LJFF, c1339460kxc.LJFF);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Aweme aweme = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (aweme == null ? 0 : aweme.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJ;
        return ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostTagBindConfig(enterFrom=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", commentId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", commentUid=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", onNoteClickFactory=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1339460kxc(String str, Aweme aweme, String str2, String str3, AwS135S1100000_21 awS135S1100000_21) {
        this.LIZ = str;
        this.LIZJ = aweme;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = awS135S1100000_21;
    }
}
