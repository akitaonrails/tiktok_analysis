package X;

import com.bytedance.android.livesdk.model.message.linkcore.InviteResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a0D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C918230a0D {
    public final EnumC918870a1F LIZ;
    public final EnumC918860a1E LIZIZ;
    public final boolean LIZJ;
    public final Integer LIZLLL;
    public final String LJ;
    public final Throwable LJFF;
    public final InviteResponse LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C918230a0D)) {
            return false;
        }
        C918230a0D c918230a0D = (C918230a0D) obj;
        return this.LIZ == c918230a0D.LIZ && this.LIZIZ == c918230a0D.LIZIZ && this.LIZJ == c918230a0D.LIZJ && Intrinsics.LJFF(this.LIZLLL, c918230a0D.LIZLLL) && Intrinsics.LJFF(this.LJ, c918230a0D.LJ) && Intrinsics.LJFF(this.LJFF, c918230a0D.LJFF) && Intrinsics.LJFF(this.LJI, c918230a0D.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        Integer num = this.LIZLLL;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.LJ;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Throwable th = this.LJFF;
        int iHashCode4 = (iHashCode3 + (th == null ? 0 : th.hashCode())) * 31;
        InviteResponse inviteResponse = this.LJI;
        return iHashCode4 + (inviteResponse != null ? inviteResponse.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InviteExecuteResult(entryType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", executedPath=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", success=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", throwable=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", inviteRsp=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C918230a0D(EnumC918870a1F enumC918870a1F, EnumC918860a1E enumC918860a1E, boolean z, Integer num, String str, Throwable th, InviteResponse inviteResponse, int i) {
        num = (i & 8) != 0 ? null : num;
        str = (i & 16) != 0 ? null : str;
        th = (i & 32) != 0 ? null : th;
        inviteResponse = (i & 64) != 0 ? null : inviteResponse;
        this.LIZ = enumC918870a1F;
        this.LIZIZ = enumC918860a1E;
        this.LIZJ = z;
        this.LIZLLL = num;
        this.LJ = str;
        this.LJFF = th;
        this.LJI = inviteResponse;
    }
}
