package X;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yr2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C887060Yr2 extends AbstractC887240YrK {
    public final List<InterfaceC887040Yr0<?>> LIZLLL;

    public C887060Yr2() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C887060Yr2) && Intrinsics.LJFF(this.LIZLLL, ((C887060Yr2) obj).LIZLLL);
    }

    public final int hashCode() {
        return this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupChatChatListVOConfig(customVOAreaList=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC887250YrL
    public final List<InterfaceC887040Yr0<?>> LIZJ() {
        return this.LIZLLL;
    }

    public C887060Yr2(Object obj) {
        this.LIZLLL = Collections.singletonList(C887010Yqx.LIZ);
    }
}
