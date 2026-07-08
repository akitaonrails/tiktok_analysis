package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rDh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1580070rDh implements InterfaceC1891350zJl {
    public final Long LL;
    public final String LLILLJJLI;
    public final UrlModel LLILLL;
    public final Integer LLILZ;
    public final List<String> LLILZIL;
    public final Long LLILZLL;
    public final Long LLIZ;
    public final Long LLIZLLLIL;
    public final Aweme LLJ;
    public final C1577330r9H LLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1580070rDh)) {
            return false;
        }
        C1580070rDh c1580070rDh = (C1580070rDh) obj;
        return Intrinsics.LJFF(this.LL, c1580070rDh.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1580070rDh.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1580070rDh.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1580070rDh.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1580070rDh.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1580070rDh.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1580070rDh.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1580070rDh.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1580070rDh.LLJ) && Intrinsics.LJFF(this.LLJI, c1580070rDh.LLJI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        Long l = this.LL;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        UrlModel urlModel = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        Integer num = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Long l2 = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.LLIZ;
        int iHashCode7 = (iHashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.LLIZLLLIL;
        int iHashCode8 = (iHashCode7 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Aweme aweme = this.LLJ;
        return ((iHashCode8 + (aweme != null ? aweme.hashCode() : 0)) * 31) + this.LLJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MiniDramaOverviewAgeUnknownPowerItem(collectionId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", cover=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", numWatched=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", themeTagList=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", startTimeInMs=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", endTimeInMs=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", videoId=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", currentAweme=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", clickHelper=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1580070rDh(Long l, String str, UrlModel urlModel, Integer num, List<String> list, Long l2, Long l3, Long l4, Aweme aweme, C1577330r9H c1577330r9H) {
        this.LL = l;
        this.LLILLJJLI = str;
        this.LLILLL = urlModel;
        this.LLILZ = num;
        this.LLILZIL = list;
        this.LLILZLL = l2;
        this.LLIZ = l3;
        this.LLIZLLLIL = l4;
        this.LLJ = aweme;
        this.LLJI = c1577330r9H;
    }
}
