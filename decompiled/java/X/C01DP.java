package X;

import android.text.Spannable;
import com.bytedance.android.livesdk.model.BoardItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01DP, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01DP implements InterfaceC111300bX {
    public final BoardItem LL;
    public Spannable LLILLJJLI;
    public final int LLILLL;
    public final String LLILZ;
    public final C01DR LLILZIL;
    public final String LLILZLL;
    public final int LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C01DP)) {
            return false;
        }
        C01DP c01dp = (C01DP) obj;
        return Intrinsics.LJFF(this.LL, c01dp.LL) && Intrinsics.LJFF(this.LLILLJJLI, c01dp.LLILLJJLI) && this.LLILLL == c01dp.LLILLL && Intrinsics.LJFF(this.LLILZ, c01dp.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c01dp.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c01dp.LLILZLL) && this.LLIZ == c01dp.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c01dp.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c01dp.LLJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ) * 31;
        String str = this.LLIZLLLIL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLJ;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FullCustomizedBoardHierarchyData(currentBoardItem=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", currentRichTextSpannable=");
        sbLIZ.append((Object) this.LLILLJJLI);
        sbLIZ.append(", boardType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", boardEntrance=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", editEventTracking=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", hintTextFromRecTemplateBoard=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", editorMode=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", recTemplateId=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", decorationSetId=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ() {
        return this.LLILLL == 5;
    }

    public C01DP(BoardItem boardItem, Spannable spannable, int i, String str, C01DR c01dr, String str2, int i2, String str3, String str4) {
        this.LL = boardItem;
        this.LLILLJJLI = spannable;
        this.LLILLL = i;
        this.LLILZ = str;
        this.LLILZIL = c01dr;
        this.LLILZLL = str2;
        this.LLIZ = i2;
        this.LLIZLLLIL = str3;
        this.LLJ = str4;
    }
}
