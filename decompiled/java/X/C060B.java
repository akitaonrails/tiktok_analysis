package X;

import com.ss.android.ugc.aweme.im.ai.impl.bot.api.BotFeedbackReason;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.060B, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C060B implements InterfaceC0148002o {
    public final String LL;
    public final List<BotFeedbackReason> LLILLJJLI;
    public final Set<BotFeedbackReason> LLILLL;

    public C060B() {
        this((List) null, (C08CX) null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C060B)) {
            return false;
        }
        C060B c060b = (C060B) obj;
        return Intrinsics.LJFF(this.LL, c060b.LL) && Intrinsics.LJFF(this.LLILLJJLI, c060b.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c060b.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserPanelState(text=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", reasons=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", selectReason=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C060B(List list, C08CX c08cx, int i) {
        String str;
        if ((i & 1) != 0) {
            str = "";
        } else {
            str = null;
        }
        this(str, (List<BotFeedbackReason>) ((i & 2) != 0 ? C13BV.INSTANCE : list), (i & 4) != 0 ? C08CX.INSTANCE : c08cx);
    }

    public C060B(String str, List<BotFeedbackReason> list, Set<BotFeedbackReason> set) {
        this.LL = str;
        this.LLILLJJLI = list;
        this.LLILLL = set;
    }

    public static C060B LIZ(C060B c060b, String str, Set set, int i) {
        List<BotFeedbackReason> list;
        if ((i & 1) != 0) {
            str = c060b.LL;
        }
        if ((i & 2) != 0) {
            list = c060b.LLILLJJLI;
        } else {
            list = null;
        }
        if ((i & 4) != 0) {
            set = c060b.LLILLL;
        }
        c060b.getClass();
        return new C060B(str, list, (Set<BotFeedbackReason>) set);
    }
}
