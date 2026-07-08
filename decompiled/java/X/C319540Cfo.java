package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cfo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C319540Cfo implements InterfaceC1891350zJl {
    public static final /* synthetic */ int LLILLL = 0;
    public final User LL;
    public final String LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C319540Cfo)) {
            return false;
        }
        C319540Cfo c319540Cfo = (C319540Cfo) obj;
        return Intrinsics.LJFF(this.LL, c319540Cfo.LL) && Intrinsics.LJFF(this.LLILLJJLI, c319540Cfo.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialThoughtLikeItem(user=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C319540Cfo c319540Cfo;
        if (interfaceC1891350zJl instanceof C319540Cfo) {
            c319540Cfo = (C319540Cfo) interfaceC1891350zJl;
        } else {
            c319540Cfo = null;
        }
        if (c319540Cfo == null || !Intrinsics.LJFF(c319540Cfo.LL.getUid(), this.LL.getUid()) || !Intrinsics.LJFF(c319540Cfo.LLILLJJLI, this.LLILLJJLI)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C319540Cfo c319540Cfo;
        if ((interfaceC1891350zJl instanceof C319540Cfo) && (c319540Cfo = (C319540Cfo) interfaceC1891350zJl) != null) {
            return Intrinsics.LJFF(c319540Cfo.LL.getUid(), this.LL.getUid());
        }
        return false;
    }

    public C319540Cfo(User user, String str) {
        this.LL = user;
        this.LLILLJJLI = str;
    }
}
