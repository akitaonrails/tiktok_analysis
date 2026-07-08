package X;

import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinChannelParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aC2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925560aC2 {
    public final BizJoinChannelParams LIZ;

    public C925560aC2() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C925560aC2) && Intrinsics.LJFF(this.LIZ, ((C925560aC2) obj).LIZ);
    }

    public final int hashCode() {
        BizJoinChannelParams bizJoinChannelParams = this.LIZ;
        if (bizJoinChannelParams == null) {
            return 0;
        }
        return bizJoinChannelParams.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JoinChannelParam(bizJoinChannelParams=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C925560aC2(BizJoinChannelParams bizJoinChannelParams) {
        this.LIZ = bizJoinChannelParams;
    }
}
