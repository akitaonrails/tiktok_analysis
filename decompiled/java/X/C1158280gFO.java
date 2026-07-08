package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gFO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158280gFO implements InterfaceC1891350zJl {
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final Aweme LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1158280gFO)) {
            return false;
        }
        C1158280gFO c1158280gFO = (C1158280gFO) obj;
        return this.LL == c1158280gFO.LL && this.LLILLJJLI == c1158280gFO.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1158280gFO.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddLocationCardModel(isLocationAdded=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", addLocationError=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1158280gFO c1158280gFO;
        Aweme aweme;
        String aid = null;
        if (interfaceC1891350zJl instanceof C1158280gFO) {
            c1158280gFO = (C1158280gFO) interfaceC1891350zJl;
            if (c1158280gFO != null && (aweme = c1158280gFO.LLILLL) != null) {
                aid = aweme.getAid();
            }
        } else {
            c1158280gFO = null;
        }
        if (Intrinsics.LJFF(aid, this.LLILLL.getAid()) && c1158280gFO.LLILLJJLI == this.LLILLJJLI && c1158280gFO.LL == this.LL) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1158280gFO c1158280gFO;
        Aweme aweme;
        String aid = null;
        if ((interfaceC1891350zJl instanceof C1158280gFO) && (c1158280gFO = (C1158280gFO) interfaceC1891350zJl) != null && (aweme = c1158280gFO.LLILLL) != null) {
            aid = aweme.getAid();
        }
        return Intrinsics.LJFF(aid, this.LLILLL.getAid());
    }

    public C1158280gFO(Aweme aweme, boolean z, boolean z2) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = aweme;
    }
}
