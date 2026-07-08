package X;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OWL, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OWL implements InterfaceC111300bX {
    public final long LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final Pair<String, String> LLJ;
    public final Integer LLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OWL)) {
            return false;
        }
        C0OWL c0owl = (C0OWL) obj;
        return this.LL == c0owl.LL && Intrinsics.LJFF(this.LLILLJJLI, c0owl.LLILLJJLI) && this.LLILLL == c0owl.LLILLL && Intrinsics.LJFF(this.LLILZ, c0owl.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0owl.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0owl.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c0owl.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c0owl.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c0owl.LLJ) && Intrinsics.LJFF(this.LLJI, c0owl.LLJI);
    }

    public final int hashCode() {
        int iY2 = ((((C786410Ut5.Y2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        String str = this.LLILZ;
        int iHashCode = (iY2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILZIL;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZLL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLIZ;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LLIZLLLIL;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Pair<String, String> pair = this.LLJ;
        int iHashCode6 = (iHashCode5 + (pair == null ? 0 : pair.hashCode())) * 31;
        Integer num = this.LLJI;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinBoardEditParam(bulletinBoardId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", previousPage=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", needPollEntrance=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", templateText=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", inspirationalContent=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", interactiveMethod=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", templateType=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", topicPair=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", enableActivityEvent=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0OWL(long j, String str, boolean z, String str2, String str3, String str4, String str5, String str6, Pair<String, String> pair, Integer num) {
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = str5;
        this.LLIZLLLIL = str6;
        this.LLJ = pair;
        this.LLJI = num;
    }
}
