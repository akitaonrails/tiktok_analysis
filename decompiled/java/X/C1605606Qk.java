package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Qk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1605606Qk implements InterfaceC0148002o {
    public final C291001Au<Unit> LL;
    public final boolean LLILLJJLI;
    public final C291001Au<Boolean> LLILLL;

    public C1605606Qk() {
        this(7, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1605606Qk)) {
            return false;
        }
        C1605606Qk c1605606Qk = (C1605606Qk) obj;
        return Intrinsics.LJFF(this.LL, c1605606Qk.LL) && this.LLILLJJLI == c1605606Qk.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1605606Qk.LLILLL);
    }

    public final int hashCode() {
        C291001Au<Unit> c291001Au = this.LL;
        int iHashCode = (((c291001Au == null ? 0 : c291001Au.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        C291001Au<Boolean> c291001Au2 = this.LLILLL;
        return iHashCode + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SmartReplyBotChatRoomState(updateInputState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hideActionBar=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", leaveBotChat=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1605606Qk(int i, boolean z) {
        this(null, null, (i & 2) != 0 ? false : z);
    }

    public C1605606Qk(C291001Au c291001Au, C291001Au c291001Au2, boolean z) {
        this.LL = c291001Au;
        this.LLILLJJLI = z;
        this.LLILLL = c291001Au2;
    }
}
