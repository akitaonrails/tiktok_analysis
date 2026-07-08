package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HdZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C445550HdZ implements InterfaceC1891350zJl {
    public final String LL;
    public final UrlModel LLILLJJLI;
    public final Integer LLILLL;
    public final String LLILZ;
    public final Long LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final int LLJ;
    public final C445540HdY LLJI;

    public C445550HdZ() {
        this(null, null, null, null, null, null, null, null, 0, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C445550HdZ)) {
            return false;
        }
        C445550HdZ c445550HdZ = (C445550HdZ) obj;
        return Intrinsics.LJFF(this.LL, c445550HdZ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c445550HdZ.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c445550HdZ.LLILLL) && Intrinsics.LJFF(this.LLILZ, c445550HdZ.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c445550HdZ.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c445550HdZ.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c445550HdZ.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c445550HdZ.LLIZLLLIL) && this.LLJ == c445550HdZ.LLJ && Intrinsics.LJFF(this.LLJI, c445550HdZ.LLJI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        UrlModel urlModel = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        Integer num = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLIZ;
        return ((((((iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ) * 31) + this.LLJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ViewAllPlaylistListItem(playlistName=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", cover=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", partCount=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", playlistId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", lastUpdateTime=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", uid=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", secUid=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", mixLabel=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", showPlaylistEntranceETSwitch=");
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

    public C445550HdZ(String str, UrlModel urlModel, Integer num, String str2, Long l, String str3, String str4, String str5, int i, int i2) {
        str = (i2 & 1) != 0 ? null : str;
        urlModel = (i2 & 2) != 0 ? null : urlModel;
        num = (i2 & 4) != 0 ? null : num;
        str2 = (i2 & 8) != 0 ? null : str2;
        l = (i2 & 16) != 0 ? null : l;
        str3 = (i2 & 32) != 0 ? null : str3;
        str4 = (i2 & 64) != 0 ? null : str4;
        str5 = (i2 & 128) != 0 ? "" : str5;
        i = (i2 & 256) != 0 ? 0 : i;
        C445540HdY c445540HdY = (i2 & 512) != 0 ? new C445540HdY() : null;
        this.LL = str;
        this.LLILLJJLI = urlModel;
        this.LLILLL = num;
        this.LLILZ = str2;
        this.LLILZIL = l;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = str5;
        this.LLJ = i;
        this.LLJI = c445540HdY;
    }
}
