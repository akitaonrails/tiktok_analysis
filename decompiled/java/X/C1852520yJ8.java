package X;

import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yJ8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1852520yJ8 implements InterfaceC0148002o {
    public final boolean LL;
    public final AIBotInfo LLILLJJLI;
    public final C291001Au<C1853710yL3> LLILLL;
    public final C291001Au<C1853710yL3> LLILZ;

    public C1852520yJ8() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1852520yJ8)) {
            return false;
        }
        C1852520yJ8 c1852520yJ8 = (C1852520yJ8) obj;
        return this.LL == c1852520yJ8.LL && Intrinsics.LJFF(this.LLILLJJLI, c1852520yJ8.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1852520yJ8.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1852520yJ8.LLILZ);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LL) * 31;
        AIBotInfo aIBotInfo = this.LLILLJJLI;
        int iHashCode = (iZ2 + (aIBotInfo == null ? 0 : aIBotInfo.hashCode())) * 31;
        C291001Au<C1853710yL3> c291001Au = this.LLILLL;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<C1853710yL3> c291001Au2 = this.LLILZ;
        return iHashCode2 + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoChatBotSharedState(askStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", aibBotInfo=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", returnTakoToEdit=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", returnTakoToAsk=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1852520yJ8(int i) {
        this(false, null, null, null);
    }

    public C1852520yJ8(boolean z, AIBotInfo aIBotInfo, C291001Au<C1853710yL3> c291001Au, C291001Au<C1853710yL3> c291001Au2) {
        this.LL = z;
        this.LLILLJJLI = aIBotInfo;
        this.LLILLL = c291001Au;
        this.LLILZ = c291001Au2;
    }

    public static C1852520yJ8 LIZ(C1852520yJ8 c1852520yJ8, boolean z, AIBotInfo aIBotInfo, C291001Au c291001Au, C291001Au c291001Au2, int i) {
        if ((i & 1) != 0) {
            z = c1852520yJ8.LL;
        }
        if ((i & 2) != 0) {
            aIBotInfo = c1852520yJ8.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au = c1852520yJ8.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au2 = c1852520yJ8.LLILZ;
        }
        c1852520yJ8.getClass();
        return new C1852520yJ8(z, aIBotInfo, c291001Au, c291001Au2);
    }
}
