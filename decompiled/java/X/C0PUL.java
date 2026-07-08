package X;

import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.ClickSearchWord;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PUL, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PUL implements InterfaceC1891350zJl {
    public final ClickSearchWord LL;
    public final C653660PkS LLILLJJLI;
    public final String LLILLL;
    public final C0PUB LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0PUL)) {
            return false;
        }
        C0PUL c0pul = (C0PUL) obj;
        return Intrinsics.LJFF(this.LL, c0pul.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0pul.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0pul.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0pul.LLILZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        ClickSearchWord clickSearchWord = this.LL;
        int iHashCode = (clickSearchWord == null ? 0 : clickSearchWord.hashCode()) * 31;
        C653660PkS c653660PkS = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c653660PkS == null ? 0 : c653660PkS.hashCode())) * 31;
        String str = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        C0PUB c0pub = this.LLILZ;
        return iHashCode3 + (c0pub != null ? c0pub.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchCSItemData(csWord=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", itemMobParam=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", enterGroupId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", mobData=");
        sbLIZ.append(this.LLILZ);
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

    public C0PUL(ClickSearchWord clickSearchWord, C653660PkS c653660PkS, String str, C0PUB c0pub) {
        this.LL = clickSearchWord;
        this.LLILLJJLI = c653660PkS;
        this.LLILLL = str;
        this.LLILZ = c0pub;
    }
}
