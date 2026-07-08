package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yPu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1856720yPu implements InterfaceC1891350zJl {
    public static final Map<String, Integer> LLILZ = new LinkedHashMap();
    public final InterfaceC1856750yPx LL;
    public final int LLILLJJLI;
    public final BaseImage LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1856720yPu)) {
            return false;
        }
        C1856720yPu c1856720yPu = (C1856720yPu) obj;
        return Intrinsics.LJFF(this.LL, c1856720yPu.LL) && this.LLILLJJLI == c1856720yPu.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1856720yPu.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31;
        BaseImage baseImage = this.LLILLL;
        return iHashCode + (baseImage == null ? 0 : baseImage.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoAnswerImageListItem(imageData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", rank=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", image=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        String str2;
        String str3;
        String str4;
        List<String> list;
        List<String> list2;
        List<String> list3;
        if (!(interfaceC1891350zJl instanceof C1856720yPu)) {
            return false;
        }
        C1856720yPu c1856720yPu = (C1856720yPu) interfaceC1891350zJl;
        if (c1856720yPu.LLILLJJLI != this.LLILLJJLI || !Intrinsics.LJFF(c1856720yPu.LL.LJJIJLIJ(), this.LL.LJJIJLIJ()) || c1856720yPu.LL.LJLL() != this.LL.LJLL() || c1856720yPu.LL.LL() != this.LL.LL()) {
            return false;
        }
        BaseImage baseImage = c1856720yPu.LLILLL;
        List<String> list4 = null;
        if (baseImage != null) {
            str = baseImage.imageUuid;
        } else {
            str = null;
        }
        BaseImage baseImage2 = this.LLILLL;
        if (baseImage2 != null) {
            str2 = baseImage2.imageUuid;
        } else {
            str2 = null;
        }
        if (!Intrinsics.LJFF(str, str2)) {
            return false;
        }
        BaseImage baseImage3 = c1856720yPu.LLILLL;
        if (baseImage3 != null) {
            str3 = baseImage3.imageId;
        } else {
            str3 = null;
        }
        BaseImage baseImage4 = this.LLILLL;
        if (baseImage4 != null) {
            str4 = baseImage4.imageId;
        } else {
            str4 = null;
        }
        if (!Intrinsics.LJFF(str3, str4)) {
            return false;
        }
        BaseImage baseImage5 = c1856720yPu.LLILLL;
        if (baseImage5 != null) {
            list = baseImage5.urlList;
        } else {
            list = null;
        }
        BaseImage baseImage6 = this.LLILLL;
        if (baseImage6 != null) {
            list2 = baseImage6.urlList;
        } else {
            list2 = null;
        }
        if (!Intrinsics.LJFF(list, list2)) {
            return false;
        }
        BaseImage baseImage7 = c1856720yPu.LLILLL;
        if (baseImage7 != null) {
            list3 = baseImage7.thumbnailUrlList;
        } else {
            list3 = null;
        }
        BaseImage baseImage8 = this.LLILLL;
        if (baseImage8 != null) {
            list4 = baseImage8.thumbnailUrlList;
        }
        if (!Intrinsics.LJFF(list3, list4)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1856720yPu)) {
            return false;
        }
        C1856720yPu c1856720yPu = (C1856720yPu) interfaceC1891350zJl;
        if (c1856720yPu.LLILLJJLI != this.LLILLJJLI || !Intrinsics.LJFF(c1856720yPu.LL.LJJIJLIJ(), this.LL.LJJIJLIJ())) {
            return false;
        }
        return true;
    }

    public C1856720yPu(InterfaceC1856750yPx interfaceC1856750yPx, int i, BaseImage baseImage) {
        this.LL = interfaceC1856750yPx;
        this.LLILLJJLI = i;
        this.LLILLL = baseImage;
    }
}
