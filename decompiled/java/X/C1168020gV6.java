package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gV6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1168020gV6 implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public String LLILZ;
    public int LLILZIL;
    public final UrlModel LLILZLL;
    public int LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1168020gV6)) {
            return false;
        }
        C1168020gV6 c1168020gV6 = (C1168020gV6) obj;
        return Intrinsics.LJFF(this.LL, c1168020gV6.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1168020gV6.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1168020gV6.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditPlaylistHeaderItem(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", playlistId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1168020gV6 c1168020gV6;
        if (interfaceC1891350zJl instanceof C1168020gV6) {
            c1168020gV6 = (C1168020gV6) interfaceC1891350zJl;
        } else {
            c1168020gV6 = null;
        }
        if (c1168020gV6 == null || !Intrinsics.LJFF(c1168020gV6.LLILZ, this.LLILZ) || c1168020gV6.LLILZIL != this.LLILZIL || !Intrinsics.LJFF(c1168020gV6.LLILZLL, this.LLILZLL) || c1168020gV6.LLIZ != this.LLIZ) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1168020gV6 c1168020gV6;
        if (interfaceC1891350zJl instanceof C1168020gV6) {
            c1168020gV6 = (C1168020gV6) interfaceC1891350zJl;
        } else {
            c1168020gV6 = null;
        }
        if (c1168020gV6 == null || !Intrinsics.LJFF(c1168020gV6.LLILZ, this.LLILZ) || c1168020gV6.LLILZIL != this.LLILZIL || !Intrinsics.LJFF(c1168020gV6.LLILZLL, this.LLILZLL) || c1168020gV6.LLIZ != this.LLIZ) {
            return false;
        }
        return true;
    }

    public C1168020gV6(int i, UrlModel urlModel, String str, String str2, int i2, String str3, String str4) {
        this.LL = str2;
        this.LLILLJJLI = str3;
        this.LLILLL = str4;
        this.LLILZ = str;
        this.LLILZIL = i;
        this.LLILZLL = urlModel;
        this.LLIZ = i2;
    }
}
