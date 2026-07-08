package X;

import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cwn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C330070Cwn implements InterfaceC0148002o {
    public final List<UserInvitee> LL;
    public final C291001Au<Unit> LLILLJJLI;
    public final C291001Au<CharSequence> LLILLL;

    public C330070Cwn() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C330070Cwn)) {
            return false;
        }
        C330070Cwn c330070Cwn = (C330070Cwn) obj;
        return Intrinsics.LJFF(this.LL, c330070Cwn.LL) && Intrinsics.LJFF(this.LLILLJJLI, c330070Cwn.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c330070Cwn.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C291001Au<Unit> c291001Au = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<CharSequence> c291001Au2 = this.LLILLL;
        return iHashCode2 + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddYoursInviteState(selectedUsers=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", onSelectDoneEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", onKeywordChange=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C330070Cwn(int i) {
        this(C13BV.INSTANCE, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C330070Cwn(List<UserInvitee> list, C291001Au<Unit> c291001Au, C291001Au<? extends CharSequence> c291001Au2) {
        this.LL = list;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c291001Au2;
    }

    public static C330070Cwn LIZ(C330070Cwn c330070Cwn, List list, C291001Au c291001Au, int i) {
        C291001Au<Unit> c291001Au2;
        if ((i & 1) != 0) {
            list = c330070Cwn.LL;
        }
        if ((i & 2) != 0) {
            c291001Au2 = c330070Cwn.LLILLJJLI;
        } else {
            c291001Au2 = null;
        }
        if ((i & 4) != 0) {
            c291001Au = c330070Cwn.LLILLL;
        }
        c330070Cwn.getClass();
        return new C330070Cwn(list, c291001Au2, c291001Au);
    }
}
