package X;

import com.ss.android.ugc.aweme.favorites.business.playlist.model.MixInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O6P, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O6P implements InterfaceC1891350zJl {
    public final MixInfo LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0O6P) && Intrinsics.LJFF(this.LL, ((C0O6P) obj).LL);
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
        sbLIZ.append("PlaylistCollectionItem(mixInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0O6P(MixInfo mixInfo) {
        this.LL = mixInfo;
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
