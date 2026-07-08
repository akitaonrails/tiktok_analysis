package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.050S, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C050S implements InterfaceC1891350zJl {
    public final Aweme LL;
    public final boolean LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C050S)) {
            return false;
        }
        C050S c050s = (C050S) obj;
        return Intrinsics.LJFF(this.LL, c050s.LL) && this.LLILLJJLI == c050s.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FanSpotlightBlockVideoItem(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", canEdit=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C050S) {
            C050S c050s = (C050S) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c050s.LL.getAid(), this.LL.getAid()) && c050s.LLILLJJLI == this.LLILLJJLI) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C050S) && Intrinsics.LJFF(((C050S) interfaceC1891350zJl).LL.getAid(), this.LL.getAid())) {
            return true;
        }
        return false;
    }

    public C050S(Aweme aweme, boolean z) {
        this.LL = aweme;
        this.LLILLJJLI = z;
    }
}
