package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PAg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C640480PAg implements InterfaceC1618170sD9<C640480PAg> {
    public final String LL;
    public final long LLILLJJLI;
    public final boolean LLILLL;
    public final long LLILZ;
    public final long LLILZIL;

    public C640480PAg() {
        this(0);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C640480PAg)) {
            return false;
        }
        C640480PAg c640480PAg = (C640480PAg) obj;
        return Intrinsics.LJFF(this.LL, c640480PAg.LL) && this.LLILLJJLI == c640480PAg.LLILLJJLI && this.LLILLL == c640480PAg.LLILLL && this.LLILZ == c640480PAg.LLILZ && this.LLILZIL == c640480PAg.LLILZIL;
    }

    public final int hashCode() {
        return (((((((this.LL.hashCode() * 31) + C786410Ut5.Y2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Y2(this.LLILZ)) * 31) + C786410Ut5.Y2(this.LLILZIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchVisualSearchSessionState(enterSearchMethod=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", videoPlayTime=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", hasResultClicked=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", resultPageStayDuration=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", aiCardStayDuration=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        return keyParams();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        return C2097608Jq.LJ();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        return C2097608Jq.LJ();
    }

    public /* synthetic */ C640480PAg(int i) {
        this(0L, 0L, "", 0L, false);
    }

    public C640480PAg(long j, long j2, String str, long j3, boolean z) {
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = z;
        this.LLILZ = j2;
        this.LLILZIL = j3;
        C0P8T.LIZ();
    }

    public static C640480PAg LIZ(C640480PAg c640480PAg, String str, long j, boolean z, long j2, long j3, int i) {
        long j4 = j2;
        boolean z2 = z;
        long j5 = j3;
        long j6 = j;
        String str2 = str;
        if ((i & 1) != 0) {
            str2 = c640480PAg.LL;
        }
        if ((i & 2) != 0) {
            j6 = c640480PAg.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z2 = c640480PAg.LLILLL;
        }
        if ((i & 8) != 0) {
            j4 = c640480PAg.LLILZ;
        }
        if ((i & 16) != 0) {
            j5 = c640480PAg.LLILZIL;
        }
        c640480PAg.getClass();
        return new C640480PAg(j6, j4, str2, j5, z2);
    }
}
