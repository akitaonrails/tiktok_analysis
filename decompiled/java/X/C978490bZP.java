package X;

import com.bytedance.android.live.liveinteract.multihost.biz.lynx.LynxCommonData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bZP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C978490bZP {
    public final LynxCommonData.LinkedUser LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C978490bZP)) {
            return false;
        }
        C978490bZP c978490bZP = (C978490bZP) obj;
        return Intrinsics.LJFF(this.LIZ, c978490bZP.LIZ) && Intrinsics.LJFF(this.LIZIZ, c978490bZP.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxUserDeltaPayload(user=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C978490bZP(LynxCommonData.LinkedUser linkedUser, String str) {
        this.LIZ = linkedUser;
        this.LIZIZ = str;
    }
}
