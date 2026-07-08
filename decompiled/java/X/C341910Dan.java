package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dan, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C341910Dan implements InterfaceC1891350zJl {
    public final Aweme LL;
    public boolean LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C341910Dan)) {
            return false;
        }
        C341910Dan c341910Dan = (C341910Dan) obj;
        return Intrinsics.LJFF(this.LL, c341910Dan.LL) && this.LLILLJJLI == c341910Dan.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        Aweme aweme = this.LL;
        return ((aweme == null ? 0 : aweme.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LandscapeProfileListItem(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selected=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C341910Dan) {
            if (((C341910Dan) interfaceC1891350zJl).LLILLJJLI == this.LLILLJJLI) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String aid;
        if (interfaceC1891350zJl instanceof C341910Dan) {
            Aweme aweme = ((C341910Dan) interfaceC1891350zJl).LL;
            String aid2 = null;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            Aweme aweme2 = this.LL;
            if (aweme2 != null) {
                aid2 = aweme2.getAid();
            }
            return Intrinsics.LJFF(aid, aid2);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C341910Dan(Aweme aweme, boolean z) {
        this.LL = aweme;
        this.LLILLJJLI = z;
    }
}
