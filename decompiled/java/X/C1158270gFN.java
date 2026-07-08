package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gFN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158270gFN implements InterfaceC1891350zJl {
    public final String LL;
    public String LLILLJJLI = null;
    public final Aweme LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1158270gFN)) {
            return false;
        }
        C1158270gFN c1158270gFN = (C1158270gFN) obj;
        return Intrinsics.LJFF(this.LL, c1158270gFN.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1158270gFN.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1158270gFN.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Aweme aweme = this.LLILLL;
        return iHashCode2 + (aweme != null ? aweme.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AiChatImageItem(url=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", localPath=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", aweme=");
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

    public C1158270gFN(Aweme aweme, String str) {
        this.LL = str;
        this.LLILLL = aweme;
    }
}
