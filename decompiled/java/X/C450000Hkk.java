package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hkk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C450000Hkk {
    public final String LIZ;
    public final SessionInfo LIZIZ;
    public final boolean LIZJ;
    public final Long LIZLLL;
    public final Long LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C450000Hkk)) {
            return false;
        }
        C450000Hkk c450000Hkk = (C450000Hkk) obj;
        return Intrinsics.LJFF(this.LIZ, c450000Hkk.LIZ) && Intrinsics.LJFF(this.LIZIZ, c450000Hkk.LIZIZ) && this.LIZJ == c450000Hkk.LIZJ && Intrinsics.LJFF(this.LIZLLL, c450000Hkk.LIZLLL) && Intrinsics.LJFF(this.LJ, c450000Hkk.LJ) && Intrinsics.LJFF(this.LJFF, c450000Hkk.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        Long l = this.LIZLLL;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.LJ;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.LJFF;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UnifiedStickerMessageContext(messageId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sessionInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isSentBySelf=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", creatorUid=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", stickerSetId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", socialAvatarExpression=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C450000Hkk(String str, SessionInfo sessionInfo, boolean z, Long l, Long l2, String str2) {
        this.LIZ = str;
        this.LIZIZ = sessionInfo;
        this.LIZJ = z;
        this.LIZLLL = l;
        this.LJ = l2;
        this.LJFF = str2;
    }
}
