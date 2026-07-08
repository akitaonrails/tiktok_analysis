package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gz2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1186580gz2 implements InterfaceC1891350zJl {
    public final UrlModel LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final int LLILZ;
    public final Integer LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1186580gz2)) {
            return false;
        }
        C1186580gz2 c1186580gz2 = (C1186580gz2) obj;
        return Intrinsics.LJFF(this.LL, c1186580gz2.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1186580gz2.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1186580gz2.LLILLL) && this.LLILZ == c1186580gz2.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1186580gz2.LLILZIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        UrlModel urlModel = this.LL;
        int iHashCode = (urlModel == null ? 0 : urlModel.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LLILZ) * 31;
        Integer num = this.LLILZIL;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiAlbumLargeImageItem(imageUrl=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", categoryName=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", categoryCode=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", imageSize=");
        sbLIZ.append(this.LLILZIL);
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

    public C1186580gz2(UrlModel urlModel, String str, String str2, int i, Integer num) {
        this.LL = urlModel;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = i;
        this.LLILZIL = num;
    }
}
