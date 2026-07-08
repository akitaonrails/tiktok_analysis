package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.AgentCommandRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Nay, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C596820Nay {
    public final AgentCommandRequest LIZ;
    public final InterfaceC596930Nb9 LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final String LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C596820Nay)) {
            return false;
        }
        C596820Nay c596820Nay = (C596820Nay) obj;
        return Intrinsics.LJFF(this.LIZ, c596820Nay.LIZ) && Intrinsics.LJFF(this.LIZIZ, c596820Nay.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c596820Nay.LIZJ) && C19990113Jj.LJII(this.LIZLLL, c596820Nay.LIZLLL) && Intrinsics.LJFF(this.LJ, c596820Nay.LJ) && Intrinsics.LJFF(this.LJFF, c596820Nay.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoAgentCommandExecuteResult(request=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", commandResult=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", result=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", executeTime=");
        sbLIZ.append((Object) C19990113Jj.LJIJJ(this.LIZLLL));
        sbLIZ.append(", fromChannel=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", subCommand=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        InterfaceC596930Nb9 interfaceC596930Nb9 = this.LIZIZ;
        int iHashCode2 = (((((((iHashCode + (interfaceC596930Nb9 == null ? 0 : interfaceC596930Nb9.hashCode())) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + this.LJ.hashCode()) * 31;
        String str = this.LJFF;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public C596820Nay(AgentCommandRequest agentCommandRequest, InterfaceC596930Nb9 interfaceC596930Nb9, String str, long j, String str2, String str3) {
        this.LIZ = agentCommandRequest;
        this.LIZIZ = interfaceC596930Nb9;
        this.LIZJ = str;
        this.LIZLLL = j;
        this.LJ = str2;
        this.LJFF = str3;
    }
}
