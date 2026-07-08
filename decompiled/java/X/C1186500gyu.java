package X;

import com.ss.android.ugc.aweme.poi.album.PoiAlbumPageApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gyu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1186500gyu implements InterfaceC0148002o {
    public final AbstractC1623806Xk<PoiAlbumPageApi.PoiAlbumResponse> LL;
    public final C1186530gyx LLILLJJLI;

    public C1186500gyu() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1186500gyu)) {
            return false;
        }
        C1186500gyu c1186500gyu = (C1186500gyu) obj;
        return Intrinsics.LJFF(this.LL, c1186500gyu.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1186500gyu.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiAlbumState(albumDataResponse=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selectTab=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1186500gyu(int i) {
        this(C491101vh.LIZ, new C1186530gyx(0));
    }

    public C1186500gyu(AbstractC1623806Xk<PoiAlbumPageApi.PoiAlbumResponse> abstractC1623806Xk, C1186530gyx c1186530gyx) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = c1186530gyx;
    }

    public static C1186500gyu LIZ(C1186500gyu c1186500gyu, AbstractC1623806Xk abstractC1623806Xk, C1186530gyx c1186530gyx, int i) {
        if ((i & 1) != 0) {
            abstractC1623806Xk = c1186500gyu.LL;
        }
        if ((i & 2) != 0) {
            c1186530gyx = c1186500gyu.LLILLJJLI;
        }
        c1186500gyu.getClass();
        return new C1186500gyu(abstractC1623806Xk, c1186530gyx);
    }
}
