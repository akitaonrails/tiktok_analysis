package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gVB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1168070gVB implements InterfaceC1891350zJl {
    public final boolean LL;
    public final String LLILLJJLI;
    public final UrlModel LLILLL;
    public final Integer LLILZ;
    public final String LLILZIL;
    public final int LLILZLL;
    public final boolean LLIZ;

    public C1168070gVB() {
        this(false, null, null, null, null, 0, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1168070gVB)) {
            return false;
        }
        C1168070gVB c1168070gVB = (C1168070gVB) obj;
        return this.LL == c1168070gVB.LL && Intrinsics.LJFF(this.LLILLJJLI, c1168070gVB.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1168070gVB.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1168070gVB.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1168070gVB.LLILZIL) && this.LLILZLL == c1168070gVB.LLILZLL && this.LLIZ == c1168070gVB.LLIZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LL) * 31;
        String str = this.LLILLJJLI;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        UrlModel urlModel = this.LLILLL;
        int iHashCode2 = (iHashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        Integer num = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.LLILZIL;
        return ((((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LLILZLL) * 31) + C786410Ut5.Z2(this.LLIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaylistChoosePanelListItem(select=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", playlistName=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", cover=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", partCount=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", playlistId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", mixLabel=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", addToPlaylistOnClick=");
        sbLIZ.append(this.LLIZ);
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

    public C1168070gVB(boolean z, String str, UrlModel urlModel, Integer num, String str2, int i, boolean z2) {
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = urlModel;
        this.LLILZ = num;
        this.LLILZIL = str2;
        this.LLILZLL = i;
        this.LLIZ = z2;
    }
}
