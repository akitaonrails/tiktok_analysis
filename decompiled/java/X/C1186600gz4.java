package X;

import com.ss.android.ugc.aweme.poi.album.PoiAlbumPageApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gz4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1186600gz4 implements InterfaceC1891350zJl {
    public final PoiAlbumPageApi.CategoryTabInfo LL;
    public final boolean LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1186600gz4)) {
            return false;
        }
        C1186600gz4 c1186600gz4 = (C1186600gz4) obj;
        return Intrinsics.LJFF(this.LL, c1186600gz4.LL) && this.LLILLJJLI == c1186600gz4.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        PoiAlbumPageApi.CategoryTabInfo categoryTabInfo = this.LL;
        return ((categoryTabInfo == null ? 0 : categoryTabInfo.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiAlbumTabPowerItem(categoryTabInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isSelect=");
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
        if (interfaceC1891350zJl instanceof C1186600gz4) {
            return Intrinsics.LJFF(this.LL, ((C1186600gz4) interfaceC1891350zJl).LL);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1186600gz4(PoiAlbumPageApi.CategoryTabInfo categoryTabInfo, boolean z) {
        this.LL = categoryTabInfo;
        this.LLILLJJLI = z;
    }
}
