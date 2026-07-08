package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Giw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423400Giw implements InterfaceC1891350zJl {
    public final String LL;
    public final Long LLILLJJLI;
    public final Long LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C423400Giw)) {
            return false;
        }
        C423400Giw c423400Giw = (C423400Giw) obj;
        return Intrinsics.LJFF(this.LL, c423400Giw.LL) && Intrinsics.LJFF(this.LLILLJJLI, c423400Giw.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c423400Giw.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.LLILLL;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EmojiSliderAverageReactionItem(emojiContent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", voteAverage=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", answerCount=");
        sbLIZ.append(this.LLILLL);
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

    public C423400Giw(String str, Long l, Long l2) {
        this.LL = str;
        this.LLILLJJLI = l;
        this.LLILLL = l2;
    }
}
