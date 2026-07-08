package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.series.feed.profile.viewmodel.ISeriesProfileAppDiffProtocol;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r22, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1572840r22 implements InterfaceC1891350zJl {
    public final long LL;
    public final String LLILLJJLI;
    public final UrlModel LLILLL;
    public final long LLILZ;
    public final long LLILZIL;
    public final int LLILZLL;
    public final Boolean LLIZ;
    public final SeriesCategory LLIZLLLIL;
    public final List<String> LLJ;
    public final List<C1572800r1y> LLJI;
    public final Boolean LLJIJIL;
    public final long LLJILJIL;

    public C1572840r22() {
        throw null;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final String toString() {
        return "SeriesProfileTabItem(collectionId=" + this.LL + ", collectionName=" + this.LLILLJJLI + ", collectionCover=" + this.LLILLL + ", collectionVideoNum=" + this.LLILZ + ", numWatched=" + this.LLILZIL + ", lastWatched=" + this.LLILZLL + ", isLimitedFree=" + this.LLIZ + ", category=" + this.LLIZLLLIL + ", videoIdList=" + this.LLJ + ", videoModelList=" + this.LLJI + ", hasTrailer=" + this.LLJIJIL + ", firstUnlockVideoId=" + this.LLJILJIL + ')';
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String uri;
        if (interfaceC1891350zJl instanceof C1572840r22) {
            C1572840r22 c1572840r22 = (C1572840r22) interfaceC1891350zJl;
            if (c1572840r22.LL == this.LL && Intrinsics.LJFF(c1572840r22.LLILLJJLI, this.LLILLJJLI) && c1572840r22.LLILZ == this.LLILZ) {
                UrlModel urlModel = c1572840r22.LLILLL;
                String uri2 = null;
                if (urlModel != null) {
                    uri = urlModel.getUri();
                } else {
                    uri = null;
                }
                UrlModel urlModel2 = this.LLILLL;
                if (urlModel2 != null) {
                    uri2 = urlModel2.getUri();
                }
                if (Intrinsics.LJFF(uri, uri2) && c1572840r22.LLILZIL == this.LLILZIL) {
                    ISeriesProfileAppDiffProtocol.LIZ.getClass();
                    C1572850r23.LIZIZ.getValue().LIZ();
                    if (Intrinsics.LJFF(c1572840r22.LLIZ, this.LLIZ) && c1572840r22.LLIZLLLIL == this.LLIZLLLIL && Intrinsics.LJFF(c1572840r22.LLJ, this.LLJ) && Intrinsics.LJFF(c1572840r22.LLJI, this.LLJI) && Intrinsics.LJFF(c1572840r22.LLJIJIL, this.LLJIJIL) && c1572840r22.LLJILJIL == this.LLJILJIL) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1572840r22) {
            if (((C1572840r22) interfaceC1891350zJl).LL == this.LL) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1572840r22) {
            if (((C1572840r22) obj).LL == this.LL) {
                return true;
            }
            return false;
        }
        return super.equals(obj);
    }

    public C1572840r22(long j, String str, UrlModel urlModel, long j2, long j3, int i, List list, List list2, Boolean bool, long j4) {
        Boolean bool2 = Boolean.FALSE;
        SeriesCategory seriesCategory = SeriesCategory.DEFAULT;
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = urlModel;
        this.LLILZ = j2;
        this.LLILZIL = j3;
        this.LLILZLL = i;
        this.LLIZ = bool2;
        this.LLIZLLLIL = seriesCategory;
        this.LLJ = list;
        this.LLJI = list2;
        this.LLJIJIL = bool;
        this.LLJILJIL = j4;
    }
}
