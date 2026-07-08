package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00rE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C208600rE implements InterfaceC1891350zJl {
    public final Aweme LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C208600rE) && Intrinsics.LJFF(this.LL, ((C208600rE) obj).LL);
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
        sbLIZ.append("FriendNewVideoItem(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C208600rE(Aweme aweme) {
        this.LL = aweme;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C208600rE c208600rE;
        Aweme aweme;
        String aid = this.LL.getAid();
        String aid2 = null;
        if ((interfaceC1891350zJl instanceof C208600rE) && (c208600rE = (C208600rE) interfaceC1891350zJl) != null && (aweme = c208600rE.LL) != null) {
            aid2 = aweme.getAid();
        }
        return Intrinsics.LJFF(aid, aid2);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C208600rE c208600rE;
        Aweme aweme;
        String aid = this.LL.getAid();
        String aid2 = null;
        if ((interfaceC1891350zJl instanceof C208600rE) && (c208600rE = (C208600rE) interfaceC1891350zJl) != null && (aweme = c208600rE.LL) != null) {
            aid2 = aweme.getAid();
        }
        return Intrinsics.LJFF(aid, aid2);
    }
}
