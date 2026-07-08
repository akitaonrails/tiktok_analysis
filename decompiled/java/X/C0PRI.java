package X;

import com.ss.android.ugc.aweme.discover.model.FeedbackContents;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PRI, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PRI implements C0PWT {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final List<FeedbackContents> LLILZIL;
    public final HashMap<String, Object> LLILZLL;
    public final int LLIZ;
    public final String LLIZLLLIL;
    public final boolean LLJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0PRI)) {
            return false;
        }
        C0PRI c0pri = (C0PRI) obj;
        return Intrinsics.LJFF(this.LL, c0pri.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0pri.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0pri.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0pri.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0pri.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0pri.LLILZLL) && this.LLIZ == c0pri.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c0pri.LLIZLLLIL) && this.LLJ == c0pri.LLJ;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31;
        List<FeedbackContents> list = this.LLILZIL;
        return ((((((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ) * 31) + this.LLIZLLLIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NewSearchRequestAction(searchKeyword=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", searchId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", tnsBanType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", useScenario=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", feedbackSurvey=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", feelGoodToken=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", maskOriginType=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", searchType=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", enableRecordSearchLifeCycle=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Ph1().LIZIZ(C13LE.LIZ(C0PRI.class), AFwS293S0000000_10.get$arr$(120));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C0PRI(String str, String str2, String str3, String str4, List<FeedbackContents> list, HashMap<String, Object> map, int i, String str5, boolean z) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = list;
        this.LLILZLL = map;
        this.LLIZ = i;
        this.LLIZLLLIL = str5;
        this.LLJ = z;
    }

    public C0PRI(String str, String str2, String str3, String str4, List list, HashMap map, int i, String str5, boolean z, int i2) {
        this(str, str2, (i2 & 4) != 0 ? "normal" : str3, (i2 & 8) == 0 ? str4 : "normal", (i2 & 16) != 0 ? C13BV.INSTANCE : list, (i2 & 32) != 0 ? new HashMap() : map, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? "" : str5, (i2 & 256) != 0 ? true : z);
    }
}
