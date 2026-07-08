package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kzr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1340850kzr implements InterfaceC1891350zJl {
    public final int LL;
    public final String LLILLJJLI;
    public int LLILLL = 0;
    public final C1340860kzs LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1340850kzr)) {
            return false;
        }
        C1340850kzr c1340850kzr = (C1340850kzr) obj;
        return this.LL == c1340850kzr.LL && Intrinsics.LJFF(this.LLILLJJLI, c1340850kzr.LLILLJJLI) && this.LLILLL == c1340850kzr.LLILLL && Intrinsics.LJFF(this.LLILZ, c1340850kzr.LLILZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((this.LL * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentMoreItem(expandingCommentCount=");
        sbLIZ.append(this.LL);
        sbLIZ.append(",commentId='");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append("', buttonStatus=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", extraData=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", ");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1340850kzr)) {
            return false;
        }
        C1340850kzr c1340850kzr = (C1340850kzr) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.LLILLJJLI, c1340850kzr.LLILLJJLI) || this.LL != c1340850kzr.LL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1340850kzr)) {
            return false;
        }
        return Intrinsics.LJFF(this.LLILLJJLI, ((C1340850kzr) interfaceC1891350zJl).LLILLJJLI);
    }

    public C1340850kzr(int i, String str, C1340860kzs c1340860kzs) {
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILZ = c1340860kzs;
    }
}
