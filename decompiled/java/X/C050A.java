package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.050A, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C050A implements InterfaceC1891350zJl {
    public final Aweme LL;
    public final boolean LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C050A)) {
            return false;
        }
        C050A c050a = (C050A) obj;
        return Intrinsics.LJFF(this.LL, c050a.LL) && this.LLILLJJLI == c050a.LLILLJJLI;
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
        sbLIZ.append("RepostListItem(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isFirstItem=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C050A)) {
            return false;
        }
        C050A c050a = (C050A) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.LL.getAid(), c050a.LL.getAid()) || this.LLILLJJLI != c050a.LLILLJJLI) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C050A)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL.getAid(), ((C050A) interfaceC1891350zJl).LL.getAid());
    }

    public C050A(Aweme aweme, boolean z) {
        this.LL = aweme;
        this.LLILLJJLI = z;
    }
}
