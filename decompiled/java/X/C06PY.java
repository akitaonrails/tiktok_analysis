package X;

import com.ss.android.ugc.aweme.im.streak.api.StreakInlineMsgInfo;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06PY, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06PY implements InterfaceC0148002o {
    public final C291001Au<C1628606Zg> LL;
    public final Map<Integer, StreakInlineMsgInfo> LLILLJJLI;
    public final Boolean LLILLL;
    public final C291001Au<List<String>> LLILZ;

    public C06PY() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C06PY)) {
            return false;
        }
        C06PY c06py = (C06PY) obj;
        return Intrinsics.LJFF(this.LL, c06py.LL) && Intrinsics.LJFF(this.LLILLJJLI, c06py.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c06py.LLILLL) && Intrinsics.LJFF(this.LLILZ, c06py.LLILZ);
    }

    public final int hashCode() {
        C291001Au<C1628606Zg> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        Map<Integer, StreakInlineMsgInfo> map = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        C291001Au<List<String>> c291001Au2 = this.LLILZ;
        return iHashCode3 + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChatRoomStreakVMState(playVideoEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", inlineMsgTypes=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isStreakRestorable=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", streakInlineExitEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C06PY(C291001Au<C1628606Zg> c291001Au, Map<Integer, StreakInlineMsgInfo> map, Boolean bool, C291001Au<? extends List<String>> c291001Au2) {
        this.LL = c291001Au;
        this.LLILLJJLI = map;
        this.LLILLL = bool;
        this.LLILZ = c291001Au2;
    }

    public static C06PY LIZ(C06PY c06py, C291001Au c291001Au, Map map, Boolean bool, C291001Au c291001Au2, int i) {
        if ((i & 1) != 0) {
            c291001Au = c06py.LL;
        }
        if ((i & 2) != 0) {
            map = c06py.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            bool = c06py.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au2 = c06py.LLILZ;
        }
        c06py.getClass();
        return new C06PY(c291001Au, map, bool, c291001Au2);
    }
}
