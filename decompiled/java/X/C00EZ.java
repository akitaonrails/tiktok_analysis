package X;

import com.ss.ugc.live.sdk.message.data.IMessage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00EZ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00EZ {
    public final int LIZ;
    public final IMessage LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00EZ)) {
            return false;
        }
        C00EZ c00ez = (C00EZ) obj;
        return this.LIZ == c00ez.LIZ && Intrinsics.LJFF(this.LIZIZ, c00ez.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveShopBagMessageEvent(messageType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00EZ(int i, IMessage iMessage) {
        this.LIZ = i;
        this.LIZIZ = iMessage;
    }
}
