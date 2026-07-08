package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yr1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C887050Yr1 extends AbstractC887240YrK {
    public final List<InterfaceC887040Yr0<?>> LIZLLL;

    public C887050Yr1() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C887050Yr1) && Intrinsics.LJFF(this.LIZLLL, ((C887050Yr1) obj).LIZLLL);
    }

    public final int hashCode() {
        return this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SingleChatChatListVOConfig(customVOAreaList=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC887250YrL
    public final List<InterfaceC887040Yr0<?>> LIZJ() {
        return this.LIZLLL;
    }

    public C887050Yr1(Object obj) {
        this.LIZLLL = C1697810uHb.LJIIJJI(C886950Yqr.LIZ, C886940Yqq.LIZ, C886680YqQ.LIZ, C887010Yqx.LIZ, C887090Yr5.LIZ, C886980Yqu.LIZ, C887100Yr6.LIZ);
    }
}
