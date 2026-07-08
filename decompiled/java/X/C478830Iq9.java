package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.feed.MGModuleTab;

/* JADX INFO: renamed from: X.0Iq9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C478830Iq9 implements InterfaceC0148002o {
    public final List<MGModuleTab> LL;
    public final EnumC479370Ir1 LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C478830Iq9)) {
            return false;
        }
        C478830Iq9 c478830Iq9 = (C478830Iq9) obj;
        return Intrinsics.LJFF(this.LL, c478830Iq9.LL) && this.LLILLJJLI == c478830Iq9.LLILLJJLI && this.LLILLL == c478830Iq9.LLILLL && this.LLILZ == c478830Iq9.LLILZ;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiTopLivePlayTabState(playTabs=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", switchTabEnable=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isDataExpired=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C478830Iq9(List list, EnumC479370Ir1 enumC479370Ir1) {
        this(list, enumC479370Ir1, true, false);
    }

    public C478830Iq9(List<MGModuleTab> list, EnumC479370Ir1 enumC479370Ir1, boolean z, boolean z2) {
        this.LL = list;
        this.LLILLJJLI = enumC479370Ir1;
        this.LLILLL = z;
        this.LLILZ = z2;
    }

    public static C478830Iq9 LIZ(C478830Iq9 c478830Iq9, List list, EnumC479370Ir1 enumC479370Ir1, boolean z, int i) {
        boolean z2;
        if ((i & 1) != 0) {
            list = c478830Iq9.LL;
        }
        if ((i & 2) != 0) {
            enumC479370Ir1 = c478830Iq9.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z = c478830Iq9.LLILLL;
        }
        if ((i & 8) != 0) {
            z2 = c478830Iq9.LLILZ;
        } else {
            z2 = false;
        }
        c478830Iq9.getClass();
        return new C478830Iq9(list, enumC479370Ir1, z, z2);
    }
}
