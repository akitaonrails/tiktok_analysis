package X;

import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinDirectParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aD9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C926250aD9 {
    public final BizJoinDirectParams LIZ;

    public C926250aD9() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C926250aD9) && Intrinsics.LJFF(this.LIZ, ((C926250aD9) obj).LIZ);
    }

    public final int hashCode() {
        BizJoinDirectParams bizJoinDirectParams = this.LIZ;
        if (bizJoinDirectParams == null) {
            return 0;
        }
        return bizJoinDirectParams.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DirectJoinParam(bizJoinDirectParams=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C926250aD9(BizJoinDirectParams bizJoinDirectParams) {
        this.LIZ = bizJoinDirectParams;
    }
}
