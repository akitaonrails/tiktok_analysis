package X;

import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCreateChannelParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bBl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C963830bBl {
    public final int LIZ;
    public final String LIZIZ;
    public final BizCreateChannelParams LIZJ;
    public final Long LIZLLL;
    public final EnumC965730bEp LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C963830bBl)) {
            return false;
        }
        C963830bBl c963830bBl = (C963830bBl) obj;
        return this.LIZ == c963830bBl.LIZ && Intrinsics.LJFF(this.LIZIZ, c963830bBl.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c963830bBl.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c963830bBl.LIZLLL) && this.LJ == c963830bBl.LJ;
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        BizCreateChannelParams bizCreateChannelParams = this.LIZJ;
        int iHashCode2 = (iHashCode + (bizCreateChannelParams == null ? 0 : bizCreateChannelParams.hashCode())) * 31;
        Long l = this.LIZLLL;
        return ((iHashCode2 + (l != null ? l.hashCode() : 0)) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateChannelParam(maxPosition=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", layoutId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bizCreateChannelParams=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", liveRoomMode=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", linkArchType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C963830bBl(int i, String str, BizCreateChannelParams bizCreateChannelParams, Long l, EnumC965730bEp enumC965730bEp) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = bizCreateChannelParams;
        this.LIZLLL = l;
        this.LJ = enumC965730bEp;
    }
}
