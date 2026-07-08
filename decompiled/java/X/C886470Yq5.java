package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yq5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C886470Yq5 implements InterfaceC886910Yqn {
    public final List<InterfaceC887040Yr0<?>> LIZ;

    public C886470Yq5() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C886470Yq5) && Intrinsics.LJFF(this.LIZ, ((C886470Yq5) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageRequestChatListVOConfig(voAreaList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC886910Yqn
    public final List<InterfaceC887040Yr0<?>> LIZ() {
        return this.LIZ;
    }

    public C886470Yq5(Object obj) {
        this.LIZ = C1697810uHb.LJIIJJI(C886860Yqi.LIZ, C886790Yqb.LIZ, C886830Yqf.LIZ, C886820Yqe.LIZ, C886800Yqc.LIZ, C886840Yqg.LIZ, C886870Yqj.LIZ, C886640YqM.LIZ, C886880Yqk.LIZ, C886850Yqh.LIZ, C886810Yqd.LIZ, C887000Yqw.LIZ);
    }
}
