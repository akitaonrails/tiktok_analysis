package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06dX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1652506dX implements InterfaceC0148002o {
    public final IMUser LL;
    public final boolean LLILLJJLI;
    public final C291001Au<C05YD<Integer>> LLILLL;

    public C1652506dX() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1652506dX)) {
            return false;
        }
        C1652506dX c1652506dX = (C1652506dX) obj;
        return Intrinsics.LJFF(this.LL, c1652506dX.LL) && this.LLILLJJLI == c1652506dX.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1652506dX.LLILLL);
    }

    public final int hashCode() {
        IMUser iMUser = this.LL;
        int iHashCode = (((iMUser == null ? 0 : iMUser.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        C291001Au<C05YD<Integer>> c291001Au = this.LLILLL;
        return iHashCode + (c291001Au != null ? c291001Au.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BotTitleBarState(botInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isTyping=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", numTypingStateEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1652506dX(Object obj) {
        this.LL = null;
        this.LLILLJJLI = false;
        this.LLILLL = null;
    }
}
