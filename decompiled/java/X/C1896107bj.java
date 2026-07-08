package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserArchiveSettings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07bj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1896107bj implements InterfaceC1891350zJl {
    public final IMUserArchiveSettings LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1896107bj) && Intrinsics.LJFF(this.LL, ((C1896107bj) obj).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DmAutoArchiveGuideBannerItem(archiveSettings=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1896107bj(IMUserArchiveSettings iMUserArchiveSettings) {
        this.LL = iMUserArchiveSettings;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
