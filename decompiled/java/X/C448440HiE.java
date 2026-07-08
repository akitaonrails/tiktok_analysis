package X;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HiE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C448440HiE implements InterfaceC0148002o {
    public final C291001Au<C448430HiD> LL;
    public final Set<Long> LLILLJJLI;

    public C448440HiE() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C448440HiE)) {
            return false;
        }
        C448440HiE c448440HiE = (C448440HiE) obj;
        return Intrinsics.LJFF(this.LL, c448440HiE.LL) && Intrinsics.LJFF(this.LLILLJJLI, c448440HiE.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GameChallengeChatroomState(removeLoadingHUDState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", displayedMsgList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C448440HiE(int i) {
        this(new C291001Au(new C448430HiD(false, 3)), C08CX.INSTANCE);
    }

    public C448440HiE(C291001Au<C448430HiD> c291001Au, Set<Long> set) {
        this.LL = c291001Au;
        this.LLILLJJLI = set;
    }

    public static C448440HiE LIZ(C448440HiE c448440HiE, C291001Au c291001Au, Set set, int i) {
        if ((i & 1) != 0) {
            c291001Au = c448440HiE.LL;
        }
        if ((i & 2) != 0) {
            set = c448440HiE.LLILLJJLI;
        }
        c448440HiE.getClass();
        return new C448440HiE(c291001Au, set);
    }
}
