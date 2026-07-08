package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rHK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1582320rHK implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final UrlModel LLILLL;
    public final String LLILZ;
    public final String LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1582320rHK)) {
            return false;
        }
        C1582320rHK c1582320rHK = (C1582320rHK) obj;
        return Intrinsics.LJFF(this.LL, c1582320rHK.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1582320rHK.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1582320rHK.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1582320rHK.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1582320rHK.LLILZIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31;
        String str = this.LLILZIL;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BioMentionListItem(uid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", secUid=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", avatarUri=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", nickname=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", signature=");
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

    public C1582320rHK(String str, String str2, String str3, UrlModel urlModel, String str4) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = urlModel;
        this.LLILZ = str3;
        this.LLILZIL = str4;
    }
}
