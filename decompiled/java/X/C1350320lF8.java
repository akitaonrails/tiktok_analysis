package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lF8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1350320lF8 implements InterfaceC2753014t {
    public final Aweme LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final String LLILZIL;
    public final String LLIZ;
    public final int LLIZLLLIL;
    public final String LLJ;
    public final String LLILZLL = "title_panel";
    public final int LLJI = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1350320lF8)) {
            return false;
        }
        C1350320lF8 c1350320lF8 = (C1350320lF8) obj;
        return Intrinsics.LJFF(this.LL, c1350320lF8.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1350320lF8.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1350320lF8.LLILLL) && this.LLILZ == c1350320lF8.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1350320lF8.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1350320lF8.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1350320lF8.LLIZ) && this.LLIZLLLIL == c1350320lF8.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c1350320lF8.LLJ) && this.LLJI == c1350320lF8.LLJI;
    }

    public final int hashCode() {
        Aweme aweme = this.LL;
        return ((((((((((((((((((aweme == null ? 0 : aweme.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TitlePanelCommonParam(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", eventType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", descOnly=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", titleClickMethod=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", fcpPanelScene=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", feedPosition=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", requestId=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", pageType=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1350320lF8(Aweme aweme, String str, String str2, boolean z, String str3, String str4, int i, String str5) {
        this.LL = aweme;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = z;
        this.LLILZIL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = i;
        this.LLJ = str5;
    }
}
