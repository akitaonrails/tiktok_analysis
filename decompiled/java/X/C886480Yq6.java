package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yq6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C886480Yq6 implements InterfaceC886910Yqn {
    public final List<InterfaceC887040Yr0<?>> LIZ;

    public C886480Yq6() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C886480Yq6) && Intrinsics.LJFF(this.LIZ, ((C886480Yq6) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageRequestChatListAggregationVOConfig(voAreaList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC886910Yqn
    public final List<InterfaceC887040Yr0<?>> LIZ() {
        return this.LIZ;
    }

    public C886480Yq6(Object obj) {
        this.LIZ = C1697810uHb.LJIIJJI(C886860Yqi.LIZ, C886630YqL.LIZ, C886820Yqe.LIZ, C886840Yqg.LIZ, C886870Yqj.LIZ, C886880Yqk.LIZ);
    }
}
