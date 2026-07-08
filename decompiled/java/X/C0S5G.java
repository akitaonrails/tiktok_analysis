package X;

import com.ss.android.ugc.aweme.feed.model.IAdTranslationData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S5G, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S5G implements InterfaceC0148002o {
    public final C0S5P LL;
    public final C0S5R LLILLJJLI;
    public final C207047160f LLILLL;
    public final C0S5S LLILZ;
    public final C0S5N LLILZIL;
    public final boolean LLILZLL;
    public final C291001Au<Function1<InterfaceC665370Q7z, Unit>> LLIZ;
    public final C0S64 LLIZLLLIL;
    public final IAdTranslationData LLJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0S5G)) {
            return false;
        }
        C0S5G c0s5g = (C0S5G) obj;
        return Intrinsics.LJFF(this.LL, c0s5g.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0s5g.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0s5g.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0s5g.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0s5g.LLILZIL) && this.LLILZLL == c0s5g.LLILZLL && Intrinsics.LJFF(this.LLIZ, c0s5g.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c0s5g.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c0s5g.LLJ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C0S5R c0s5r = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c0s5r == null ? 0 : c0s5r.hashCode())) * 31;
        C207047160f c207047160f = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c207047160f == null ? 0 : c207047160f.hashCode())) * 31;
        C0S5S c0s5s = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (c0s5s == null ? 0 : c0s5s.hashCode())) * 31;
        C0S5N c0s5n = this.LLILZIL;
        int iHashCode5 = (((iHashCode4 + (c0s5n == null ? 0 : c0s5n.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31;
        C291001Au<Function1<InterfaceC665370Q7z, Unit>> c291001Au = this.LLIZ;
        int iHashCode6 = (iHashCode5 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C0S64 c0s64 = this.LLIZLLLIL;
        int iHashCode7 = (iHashCode6 + (c0s64 == null ? 0 : c0s64.hashCode())) * 31;
        IAdTranslationData iAdTranslationData = this.LLJ;
        return iHashCode7 + (iAdTranslationData != null ? iAdTranslationData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TranslationUiState(state=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", descriptionData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", captionData=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", photoTitleTranslData=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", photoTextTranslData=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", translationStateForceHidden=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", etEvent=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", descriptionAndTitleData=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", commerceTranslationData=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0S5G(C0S5P c0s5p, C0S5R c0s5r, C207047160f c207047160f, C0S5S c0s5s, C0S5N c0s5n, boolean z, C291001Au<? extends Function1<? super InterfaceC665370Q7z, Unit>> c291001Au, C0S64 c0s64, IAdTranslationData iAdTranslationData) {
        this.LL = c0s5p;
        this.LLILLJJLI = c0s5r;
        this.LLILLL = c207047160f;
        this.LLILZ = c0s5s;
        this.LLILZIL = c0s5n;
        this.LLILZLL = z;
        this.LLIZ = c291001Au;
        this.LLIZLLLIL = c0s64;
        this.LLJ = iAdTranslationData;
    }

    public static C0S5G LIZ(C0S5G c0s5g, C0S5P c0s5p, C0S5R c0s5r, C207047160f c207047160f, C0S5S c0s5s, C0S5N c0s5n, boolean z, C291001Au c291001Au, C0S64 c0s64, IAdTranslationData iAdTranslationData, int i) {
        IAdTranslationData iAdTranslationData2 = iAdTranslationData;
        C0S64 c0s642 = c0s64;
        C291001Au c291001Au2 = c291001Au;
        boolean z2 = z;
        C0S5N c0s5n2 = c0s5n;
        C0S5S c0s5s2 = c0s5s;
        C207047160f c207047160f2 = c207047160f;
        C0S5R c0s5r2 = c0s5r;
        C0S5P c0s5p2 = c0s5p;
        if ((i & 1) != 0) {
            c0s5p2 = c0s5g.LL;
        }
        if ((i & 2) != 0) {
            c0s5r2 = c0s5g.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c207047160f2 = c0s5g.LLILLL;
        }
        if ((i & 8) != 0) {
            c0s5s2 = c0s5g.LLILZ;
        }
        if ((i & 16) != 0) {
            c0s5n2 = c0s5g.LLILZIL;
        }
        if ((i & 32) != 0) {
            z2 = c0s5g.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au2 = c0s5g.LLIZ;
        }
        if ((i & 128) != 0) {
            c0s642 = c0s5g.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            iAdTranslationData2 = c0s5g.LLJ;
        }
        c0s5g.getClass();
        return new C0S5G(c0s5p2, c0s5r2, c207047160f2, c0s5s2, c0s5n2, z2, c291001Au2, c0s642, iAdTranslationData2);
    }
}
