package X;

import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04zt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1281504zt implements InterfaceC1256804vu {
    public final int LIZ;
    public final boolean LIZIZ;
    public final IMAIBotInfo LIZJ;
    public final List<String> LIZLLL;
    public final String LJ;

    public C1281504zt() {
        this(false, null, null, null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1281504zt)) {
            return false;
        }
        C1281504zt c1281504zt = (C1281504zt) obj;
        return this.LIZ == c1281504zt.LIZ && this.LIZIZ == c1281504zt.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1281504zt.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1281504zt.LIZLLL) && Intrinsics.LJFF(this.LJ, c1281504zt.LJ);
    }

    public final int hashCode() {
        int iZ2 = ((this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        IMAIBotInfo iMAIBotInfo = this.LIZJ;
        int iHashCode = (iZ2 + (iMAIBotInfo == null ? 0 : iMAIBotInfo.hashCode())) * 31;
        List<String> list = this.LIZLLL;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.LJ;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HttpSuccess(statusCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isSuccess=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", smartReplyBot=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", highlightText=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", rejectReason=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1281504zt(boolean z, IMAIBotInfo iMAIBotInfo, List list, String str, int i) {
        z = (i & 2) != 0 ? true : z;
        iMAIBotInfo = (i & 4) != 0 ? null : iMAIBotInfo;
        list = (i & 8) != 0 ? null : list;
        str = (i & 16) != 0 ? null : str;
        this.LIZ = 0;
        this.LIZIZ = z;
        this.LIZJ = iMAIBotInfo;
        this.LIZLLL = list;
        this.LJ = str;
    }
}
