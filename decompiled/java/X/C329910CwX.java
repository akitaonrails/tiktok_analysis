package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.UserContent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CwX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C329910CwX implements InterfaceC1891350zJl {
    public final String LL;
    public final Aweme LLILLJJLI;
    public final UrlModel LLILLL;
    public final String LLILZ;
    public final UserContent.SourceType LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;
    public final long LLIZLLLIL;
    public final UrlModel LLJ;
    public final InterfaceC329670Cw9 LLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C329910CwX)) {
            return false;
        }
        C329910CwX c329910CwX = (C329910CwX) obj;
        return Intrinsics.LJFF(this.LL, c329910CwX.LL) && Intrinsics.LJFF(this.LLILLJJLI, c329910CwX.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c329910CwX.LLILLL) && Intrinsics.LJFF(this.LLILZ, c329910CwX.LLILZ) && this.LLILZIL == c329910CwX.LLILZIL && this.LLILZLL == c329910CwX.LLILZLL && this.LLIZ == c329910CwX.LLIZ && this.LLIZLLLIL == c329910CwX.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c329910CwX.LLJ) && Intrinsics.LJFF(this.LLJI, c329910CwX.LLJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + C786410Ut5.Y2(this.LLIZLLLIL)) * 31;
        UrlModel urlModel = this.LLJ;
        return ((iHashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31) + this.LLJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserContentPowerItem(text=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", avatar=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", userName=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", sourceType=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", showSourceText=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isDigged=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", diggCount=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", cover=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", originalData=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C329910CwX c329910CwX;
        C329910CwX c329910CwX2;
        boolean z = interfaceC1891350zJl instanceof C329910CwX;
        if (z && (c329910CwX = (C329910CwX) interfaceC1891350zJl) != null && this.LLIZ == c329910CwX.LLIZ && z && (c329910CwX2 = (C329910CwX) interfaceC1891350zJl) != null && this.LLIZLLLIL == c329910CwX2.LLIZLLLIL) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C329910CwX c329910CwX;
        String str = this.LL;
        String str2 = null;
        if ((interfaceC1891350zJl instanceof C329910CwX) && (c329910CwX = (C329910CwX) interfaceC1891350zJl) != null) {
            str2 = c329910CwX.LL;
        }
        return Intrinsics.LJFF(str, str2);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C329910CwX) || interfaceC1891350zJl == null) {
            return null;
        }
        C329910CwX c329910CwX = (C329910CwX) interfaceC1891350zJl;
        return new C329920CwY(c329910CwX.LLIZ, c329910CwX.LLIZLLLIL);
    }

    public C329910CwX(String str, Aweme aweme, UrlModel urlModel, String str2, UserContent.SourceType sourceType, boolean z, boolean z2, long j, UrlModel urlModel2, InterfaceC329670Cw9 interfaceC329670Cw9) {
        this.LL = str;
        this.LLILLJJLI = aweme;
        this.LLILLL = urlModel;
        this.LLILZ = str2;
        this.LLILZIL = sourceType;
        this.LLILZLL = z;
        this.LLIZ = z2;
        this.LLIZLLLIL = j;
        this.LLJ = urlModel2;
        this.LLJI = interfaceC329670Cw9;
    }
}
