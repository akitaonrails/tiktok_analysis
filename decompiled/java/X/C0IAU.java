package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IAU, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0IAU implements C0IAV {
    public final CharSequence LIZ;
    public final Aweme LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0IAU)) {
            return false;
        }
        C0IAU c0iau = (C0IAU) obj;
        return Intrinsics.LJFF(this.LIZ, c0iau.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0iau.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0iau.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0iau.LIZLLL) && Intrinsics.LJFF(this.LJ, c0iau.LJ) && this.LJFF == c0iau.LJFF;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJ;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedDMReply(msg=");
        sbLIZ.append((Object) this.LIZ);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", authorUid=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", authorSecUid=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isQuickReplyEmoji=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0IAU(CharSequence charSequence, Aweme aweme, String str, String str2, String str3, boolean z) {
        this.LIZ = charSequence;
        this.LIZIZ = aweme;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = z;
    }
}
