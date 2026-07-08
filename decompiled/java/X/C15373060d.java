package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.060d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15373060d implements InterfaceC0148002o {
    public final long LL;
    public final Map<C060Z, C15372060c> LLILLJJLI;

    public C15373060d() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15373060d)) {
            return false;
        }
        C15373060d c15373060d = (C15373060d) obj;
        return this.LL == c15373060d.LL && Intrinsics.LJFF(this.LLILLJJLI, c15373060d.LLILLJJLI);
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LL) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SmartReplyInstructionState(botId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", map=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C15373060d(int i) {
        this(-1L, C2097608Jq.LJ());
    }

    public C15373060d(long j, Map<C060Z, C15372060c> map) {
        this.LL = j;
        this.LLILLJJLI = map;
    }
}
