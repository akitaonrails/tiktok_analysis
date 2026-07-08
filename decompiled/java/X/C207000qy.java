package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00qy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C207000qy implements InterfaceC1891350zJl {
    public final Aweme LL;
    public final Long LLILLJJLI;
    public final String LLILLL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GameCommonMixItem(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", secUserId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        Aweme aweme = this.LL;
        if (aweme != null) {
            return aweme.hashCode();
        }
        return 0;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C207000qy) {
            return Intrinsics.LJFF(this.LL, ((C207000qy) interfaceC1891350zJl).LL);
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C207000qy) {
            return Intrinsics.LJFF(this.LL, ((C207000qy) obj).LL);
        }
        return super.equals(obj);
    }

    public C207000qy(Aweme aweme, Long l, String str) {
        this.LL = aweme;
        this.LLILLJJLI = l;
        this.LLILLL = str;
    }
}
