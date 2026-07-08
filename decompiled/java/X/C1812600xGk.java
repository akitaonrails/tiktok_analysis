package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xGk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1812600xGk extends AbstractC1812590xGj {
    public final List<C1812850xH9> LLILLJJLI;
    public final EnumC1812620xGm LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1812600xGk)) {
            return false;
        }
        C1812600xGk c1812600xGk = (C1812600xGk) obj;
        return Intrinsics.LJFF(this.LLILLJJLI, c1812600xGk.LLILLJJLI) && this.LLILLL == c1812600xGk.LLILLL;
    }

    public final int hashCode() {
        return (this.LLILLJJLI.hashCode() * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AiSummaryTextCellItem(items=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", loadingState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1812600xGk(List<C1812850xH9> list, EnumC1812620xGm enumC1812620xGm) {
        super(list);
        this.LLILLJJLI = list;
        this.LLILLL = enumC1812620xGm;
    }
}
