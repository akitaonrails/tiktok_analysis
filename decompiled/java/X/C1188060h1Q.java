package X;

import com.ss.android.ugc.aweme.poi.activity.PoiActivityApi;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h1Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1188060h1Q implements InterfaceC1891350zJl {
    public final List<PoiActivityApi.PoiBannerInfo> LL;
    public final String LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1188060h1Q)) {
            return false;
        }
        C1188060h1Q c1188060h1Q = (C1188060h1Q) obj;
        return Intrinsics.LJFF(this.LL, c1188060h1Q.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1188060h1Q.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiMergedListBannerItem(data=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", poiId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1188060h1Q c1188060h1Q;
        List<PoiActivityApi.PoiBannerInfo> list;
        PoiActivityApi.PoiBannerInfo poiBannerInfo;
        String str = ((PoiActivityApi.PoiBannerInfo) C13LP.LJJJJZI(this.LL)).activityId;
        String str2 = null;
        if ((interfaceC1891350zJl instanceof C1188060h1Q) && (c1188060h1Q = (C1188060h1Q) interfaceC1891350zJl) != null && (list = c1188060h1Q.LL) != null && (poiBannerInfo = (PoiActivityApi.PoiBannerInfo) C13LP.LJJJJZI(list)) != null) {
            str2 = poiBannerInfo.activityId;
        }
        return Intrinsics.LJFF(str, str2);
    }

    public C1188060h1Q(List<PoiActivityApi.PoiBannerInfo> list, String str) {
        this.LL = list;
        this.LLILLJJLI = str;
    }
}
