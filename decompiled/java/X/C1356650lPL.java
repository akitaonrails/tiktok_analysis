package X;

import com.ss.android.ugc.aweme.upvote.detail.input.RepostInputFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lPL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1356650lPL implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final Integer LLILZ;
    public final boolean LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public final String LLIZLLLIL;
    public final int LLJ;
    public final Function0<Unit> LLJI;

    public C1356650lPL() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1356650lPL)) {
            return false;
        }
        C1356650lPL c1356650lPL = (C1356650lPL) obj;
        return Intrinsics.LJFF(this.LL, c1356650lPL.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1356650lPL.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1356650lPL.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1356650lPL.LLILZ) && this.LLILZIL == c1356650lPL.LLILZIL && this.LLILZLL == c1356650lPL.LLILZLL && this.LLIZ == c1356650lPL.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c1356650lPL.LLIZLLLIL) && this.LLJ == c1356650lPL.LLJ && Intrinsics.LJFF(this.LLJI, c1356650lPL.LLJI);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.LLILZ;
        int iHashCode4 = (((((((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + this.LLILZLL) * 31) + this.LLIZ) * 31;
        String str4 = this.LLIZLLLIL;
        int iHashCode5 = (((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.LLJ) * 31;
        Function0<Unit> function0 = this.LLJI;
        return iHashCode5 + (function0 != null ? function0.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostMentionData(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", aid=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", authorId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", followStatus=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", forceHorizontal=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", editTextId=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", mentionContainerId=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", mobScene=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", maxLength=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", showMaxLengthToast=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1356650lPL(String str, String str2, String str3, Integer num, boolean z, int i, int i2, String str4, int i3, Function0 function0, int i4) {
        str2 = (i4 & 2) != 0 ? null : str2;
        str3 = (i4 & 4) != 0 ? null : str3;
        num = (i4 & 8) != 0 ? null : num;
        z = (i4 & 16) != 0 ? false : z;
        i = (i4 & 32) != 0 ? R.id.ta4 : i;
        i2 = (i4 & 64) != 0 ? 0 : i2;
        str4 = (i4 & 128) != 0 ? null : str4;
        if ((i4 & 256) != 0) {
            String str5 = RepostInputFragment._pnsPageId;
            i3 = ((Number) C0B0R.LIZ.getValue()).intValue();
        }
        function0 = (i4 & 512) != 0 ? null : function0;
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = num;
        this.LLILZIL = z;
        this.LLILZLL = i;
        this.LLIZ = i2;
        this.LLIZLLLIL = str4;
        this.LLJ = i3;
        this.LLJI = function0;
    }
}
