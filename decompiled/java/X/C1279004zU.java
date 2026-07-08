package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.04zU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1279004zU implements Serializable {
    public final long creatorUid;
    public final boolean isMainState;
    public final boolean isMyProfile;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1279004zU)) {
            return false;
        }
        C1279004zU c1279004zU = (C1279004zU) obj;
        return this.creatorUid == c1279004zU.creatorUid && this.isMyProfile == c1279004zU.isMyProfile && this.isMainState == c1279004zU.isMainState;
    }

    public int hashCode() {
        return (((C786410Ut5.Y2(this.creatorUid) * 31) + C786410Ut5.Z2(this.isMyProfile)) * 31) + C786410Ut5.Z2(this.isMainState);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DramaProfileHistoryTabArgs(creatorUid=");
        sbLIZ.append(this.creatorUid);
        sbLIZ.append(", isMyProfile=");
        sbLIZ.append(this.isMyProfile);
        sbLIZ.append(", isMainState=");
        sbLIZ.append(this.isMainState);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isMainState() {
        return this.isMainState;
    }

    public final boolean isMyProfile() {
        return this.isMyProfile;
    }

    public C1279004zU(long j, boolean z, boolean z2) {
        this.creatorUid = j;
        this.isMyProfile = z;
        this.isMainState = z2;
    }
}
