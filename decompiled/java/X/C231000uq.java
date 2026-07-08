package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00uq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C231000uq implements InterfaceC0148002o {
    public final C291001Au<User> LL;
    public final C291001Au<C00CU> LLILLJJLI;

    public C231000uq() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C231000uq)) {
            return false;
        }
        C231000uq c231000uq = (C231000uq) obj;
        return Intrinsics.LJFF(this.LL, c231000uq.LL) && Intrinsics.LJFF(this.LLILLJJLI, c231000uq.LLILLJJLI);
    }

    public final int hashCode() {
        C291001Au<User> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<C00CU> c291001Au2 = this.LLILLJJLI;
        return iHashCode + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TaggedState(taggedUsers=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", event=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C231000uq(C291001Au<? extends User> c291001Au, C291001Au<? extends C00CU> c291001Au2) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
    }
}
