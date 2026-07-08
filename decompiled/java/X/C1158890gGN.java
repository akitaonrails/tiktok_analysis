package X;

import com.ss.android.ugc.aweme.models.RssArticle;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gGN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158890gGN implements InterfaceC0148002o {
    public final AbstractC1623806Xk<List<RssArticle>> LL;
    public final AbstractC1623806Xk<List<String>> LLILLJJLI;
    public final Boolean LLILLL;
    public final boolean LLILZ;
    public final Integer LLILZIL;

    public C1158890gGN() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1158890gGN)) {
            return false;
        }
        C1158890gGN c1158890gGN = (C1158890gGN) obj;
        return Intrinsics.LJFF(this.LL, c1158890gGN.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1158890gGN.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1158890gGN.LLILLL) && this.LLILZ == c1158890gGN.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1158890gGN.LLILZIL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        Boolean bool = this.LLILLL;
        int iHashCode2 = (((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        Integer num = this.LLILZIL;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RssFeedState(rssFeedResult=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", fetchImagesResult=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isRssFeedEmpty=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isInteractionEnabled=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", selectedArticleId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1158890gGN(int i) {
        C491101vh c491101vh = C491101vh.LIZ;
        this(c491101vh, c491101vh, null, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1158890gGN(AbstractC1623806Xk<? extends List<RssArticle>> abstractC1623806Xk, AbstractC1623806Xk<? extends List<String>> abstractC1623806Xk2, Boolean bool, boolean z, Integer num) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = abstractC1623806Xk2;
        this.LLILLL = bool;
        this.LLILZ = z;
        this.LLILZIL = num;
    }

    public static C1158890gGN LIZ(C1158890gGN c1158890gGN, AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk abstractC1623806Xk2, Boolean bool, boolean z, Integer num, int i) {
        Integer num2 = num;
        boolean z2 = z;
        Boolean bool2 = bool;
        AbstractC1623806Xk abstractC1623806Xk3 = abstractC1623806Xk2;
        AbstractC1623806Xk abstractC1623806Xk4 = abstractC1623806Xk;
        if ((i & 1) != 0) {
            abstractC1623806Xk4 = c1158890gGN.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk3 = c1158890gGN.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            bool2 = c1158890gGN.LLILLL;
        }
        if ((i & 8) != 0) {
            z2 = c1158890gGN.LLILZ;
        }
        if ((i & 16) != 0) {
            num2 = c1158890gGN.LLILZIL;
        }
        c1158890gGN.getClass();
        return new C1158890gGN(abstractC1623806Xk4, abstractC1623806Xk3, bool2, z2, num2);
    }
}
