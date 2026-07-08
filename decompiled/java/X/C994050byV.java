package X;

import android.view.View;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0byV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C994050byV implements InterfaceC1891350zJl {
    public final User LL;
    public final Function2<View, User, Unit> LLILLJJLI;
    public final Function1<User, Unit> LLILLL;

    public C994050byV() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C994050byV)) {
            return false;
        }
        C994050byV c994050byV = (C994050byV) obj;
        return Intrinsics.LJFF(this.LL, c994050byV.LL) && Intrinsics.LJFF(this.LLILLJJLI, c994050byV.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c994050byV.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Function2<View, User, Unit> function2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (function2 == null ? 0 : function2.hashCode())) * 31;
        Function1<User, Unit> function1 = this.LLILLL;
        return iHashCode2 + (function1 != null ? function1.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxSearchUserFilterResultItem(user=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", avatarClickListener=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", itemClickListener=");
        sbLIZ.append(this.LLILLL);
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

    public C994050byV(User user, Function1 function1) {
        this.LL = user;
        this.LLILLJJLI = null;
        this.LLILLL = function1;
    }
}
