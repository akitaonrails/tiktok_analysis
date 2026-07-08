package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Skk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C730280Skk implements InterfaceC1891350zJl {
    public final List<C730340Skq> LL;
    public final Aweme LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C730280Skk)) {
            return false;
        }
        C730280Skk c730280Skk = (C730280Skk) obj;
        return Intrinsics.LJFF(this.LL, c730280Skk.LL) && Intrinsics.LJFF(this.LLILLJJLI, c730280Skk.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Aweme aweme = this.LLILLJJLI;
        return iHashCode + (aweme == null ? 0 : aweme.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SecretReplyItems(secretReplies=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", currAweme=");
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
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C730280Skk(List<C730340Skq> list, Aweme aweme) {
        this.LL = list;
        this.LLILLJJLI = aweme;
    }
}
