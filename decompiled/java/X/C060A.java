package X;

import com.ss.android.ugc.aweme.im.ai.impl.bot.api.BotFeedbackReason;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.060A, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C060A implements InterfaceC0148002o {
    public final List<BotFeedbackReason> LL;
    public final Set<BotFeedbackReason> LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C060A)) {
            return false;
        }
        C060A c060a = (C060A) obj;
        return Intrinsics.LJFF(this.LL, c060a.LL) && Intrinsics.LJFF(this.LLILLJJLI, c060a.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreatorPanelState(reasons=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selectReason=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C060A() {
        this(C13BV.INSTANCE, C08CX.INSTANCE);
    }

    public C060A(List<BotFeedbackReason> list, Set<BotFeedbackReason> set) {
        this.LL = list;
        this.LLILLJJLI = set;
    }
}
