package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05Tb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1357705Tb implements InterfaceC1891350zJl {
    public final List<Aweme> LL;
    public final boolean LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1357705Tb)) {
            return false;
        }
        C1357705Tb c1357705Tb = (C1357705Tb) obj;
        return Intrinsics.LJFF(this.LL, c1357705Tb.LL) && this.LLILLJJLI == c1357705Tb.LLILLJJLI;
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
        sbLIZ.append("MusicFanSpotlightBlockItem(awemeList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", canEdit=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1357705Tb) {
            C1357705Tb c1357705Tb = (C1357705Tb) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c1357705Tb.LL, this.LL) && c1357705Tb.LLILLJJLI == this.LLILLJJLI) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C1357705Tb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1357705Tb(List<? extends Aweme> list, boolean z) {
        this.LL = list;
        this.LLILLJJLI = z;
    }
}
