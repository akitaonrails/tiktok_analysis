package X;

import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07a5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1885907a5 implements InterfaceC1891350zJl {
    public final ExternalMusicInfo LL;
    public final boolean LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1885907a5)) {
            return false;
        }
        C1885907a5 c1885907a5 = (C1885907a5) obj;
        return Intrinsics.LJFF(this.LL, c1885907a5.LL) && this.LLILLJJLI == c1885907a5.LLILLJJLI;
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
        sbLIZ.append("ThirdMusicItem(musicInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isLastItem=");
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

    public C1885907a5(ExternalMusicInfo externalMusicInfo, boolean z) {
        this.LL = externalMusicInfo;
        this.LLILLJJLI = z;
    }
}
