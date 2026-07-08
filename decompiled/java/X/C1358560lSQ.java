package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lSQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1358560lSQ implements InterfaceC111300bX {
    public final String LL;
    public final boolean LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final boolean LLIZLLLIL;
    public final InterfaceC1360060lUq LLJ;

    public C1358560lSQ() {
        this(null, false, null, null, null, null, null, false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1358560lSQ)) {
            return false;
        }
        C1358560lSQ c1358560lSQ = (C1358560lSQ) obj;
        return Intrinsics.LJFF(this.LL, c1358560lSQ.LL) && this.LLILLJJLI == c1358560lSQ.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1358560lSQ.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1358560lSQ.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1358560lSQ.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1358560lSQ.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1358560lSQ.LLIZ) && this.LLIZLLLIL == c1358560lSQ.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c1358560lSQ.LLJ);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        String str2 = this.LLILLL;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LLILZLL;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LLIZ;
        int iHashCode6 = (((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31;
        InterfaceC1360060lUq interfaceC1360060lUq = this.LLJ;
        return iHashCode6 + (interfaceC1360060lUq != null ? interfaceC1360060lUq.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpvoteBubbleParam(upvoteId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", openRepostPanel=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", highlightUids=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", highlightReplyIds=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", insertRepostUid=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", insertReplyIds=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", eventType=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", openRepostNoteInputAfterLoad=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", monitor=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1358560lSQ(String str, boolean z, String str2, String str3, String str4, String str5, String str6, boolean z2, InterfaceC1360060lUq interfaceC1360060lUq) {
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = str6;
        this.LLIZLLLIL = z2;
        this.LLJ = interfaceC1360060lUq;
    }
}
