package X;

import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0toe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1679860toe implements InterfaceC0148002o {
    public final List<TakoContentPreviewItem> LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final List<String> LLILZIL;
    public final Map<String, String> LLILZLL;
    public final String LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;

    public C1679860toe() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1679860toe)) {
            return false;
        }
        C1679860toe c1679860toe = (C1679860toe) obj;
        return Intrinsics.LJFF(this.LL, c1679860toe.LL) && this.LLILLJJLI == c1679860toe.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1679860toe.LLILLL) && this.LLILZ == c1679860toe.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1679860toe.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1679860toe.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1679860toe.LLIZ) && this.LLIZLLLIL == c1679860toe.LLIZLLLIL && this.LLJ == c1679860toe.LLJ;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31;
        String str = this.LLILLL;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        List<String> list = this.LLILZIL;
        return ((((((((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + C786410Ut5.Z2(this.LLJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("State(previewData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", openIndex=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", msgId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isAIGC=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", hashTags=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", commonParams=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", situation=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", bypassImg2Video=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", skipEnterAnimation=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1679860toe(int i) {
        this(C13BV.INSTANCE, 0, null, false, null, C2097608Jq.LJ(), "ai_drawing", false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1679860toe(List<? extends TakoContentPreviewItem> list, int i, String str, boolean z, List<String> list2, Map<String, String> map, String str2, boolean z2, boolean z3) {
        this.LL = list;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = list2;
        this.LLILZLL = map;
        this.LLIZ = str2;
        this.LLIZLLLIL = z2;
        this.LLJ = z3;
    }
}
