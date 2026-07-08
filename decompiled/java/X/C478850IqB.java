package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.feed.MGModuleInteraction;
import webcast.api.feed.MGModuleTab;

/* JADX INFO: renamed from: X.0IqB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C478850IqB implements InterfaceC0148002o {
    public final List<MGModuleInteraction> LL;
    public final List<MGModuleTab> LLILLJJLI;
    public final EnumC479370Ir1 LLILLL;
    public final C291001Au<Unit> LLILZ;
    public final boolean LLILZIL;
    public final String LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C478850IqB)) {
            return false;
        }
        C478850IqB c478850IqB = (C478850IqB) obj;
        return Intrinsics.LJFF(this.LL, c478850IqB.LL) && Intrinsics.LJFF(this.LLILLJJLI, c478850IqB.LLILLJJLI) && this.LLILLL == c478850IqB.LLILLL && Intrinsics.LJFF(this.LLILZ, c478850IqB.LLILZ) && this.LLILZIL == c478850IqB.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c478850IqB.LLILZLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        C291001Au<Unit> c291001Au = this.LLILZ;
        return ((((iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiTopLiveInteractModuleState(interactModuleItems=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", playTabs=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", updateRandomChat=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isDataExpired=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C478850IqB(List list, List list2, EnumC479370Ir1 enumC479370Ir1, String str) {
        this(list, list2, enumC479370Ir1, null, false, str);
    }

    public C478850IqB(List<MGModuleInteraction> list, List<MGModuleTab> list2, EnumC479370Ir1 enumC479370Ir1, C291001Au<Unit> c291001Au, boolean z, String str) {
        this.LL = list;
        this.LLILLJJLI = list2;
        this.LLILLL = enumC479370Ir1;
        this.LLILZ = c291001Au;
        this.LLILZIL = z;
        this.LLILZLL = str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init MultiTopLiveInteractModuleState source=");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("legolas_show", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static C478850IqB LIZ(C478850IqB c478850IqB, List list, List list2, EnumC479370Ir1 enumC479370Ir1, C291001Au c291001Au, boolean z, String str, int i) {
        String str2 = str;
        boolean z2 = z;
        C291001Au c291001Au2 = c291001Au;
        EnumC479370Ir1 enumC479370Ir12 = enumC479370Ir1;
        List list3 = list2;
        List list4 = list;
        if ((i & 1) != 0) {
            list4 = c478850IqB.LL;
        }
        if ((i & 2) != 0) {
            list3 = c478850IqB.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            enumC479370Ir12 = c478850IqB.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au2 = c478850IqB.LLILZ;
        }
        if ((i & 16) != 0) {
            z2 = c478850IqB.LLILZIL;
        }
        if ((i & 32) != 0) {
            str2 = c478850IqB.LLILZLL;
        }
        c478850IqB.getClass();
        return new C478850IqB(list4, list3, enumC479370Ir12, c291001Au2, z2, str2);
    }
}
