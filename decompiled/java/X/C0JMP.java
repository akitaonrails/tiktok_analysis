package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JMP, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JMP implements InterfaceC0148002o {
    public final C06J1 LL;
    public final int LLILLJJLI;
    public final List<C0JMR> LLILLL;
    public final List<Long> LLILZ;
    public final int LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;

    public C0JMP() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0JMP)) {
            return false;
        }
        C0JMP c0jmp = (C0JMP) obj;
        return this.LL == c0jmp.LL && this.LLILLJJLI == c0jmp.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c0jmp.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0jmp.LLILZ) && this.LLILZIL == c0jmp.LLILZIL && this.LLILZLL == c0jmp.LLILZLL && this.LLIZ == c0jmp.LLIZ;
    }

    public final int hashCode() {
        return (((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + C786410Ut5.Z2(this.LLIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PcsCourseVideoPlayerState(pageStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", orientation=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", videoList=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", videoIdList=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", currentPosition=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", allowPagerScrollUp=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", allowPagerScrollDown=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0JMP(int i) {
        C06J1 c06j1 = C06J1.IDLE;
        C13BV c13bv = C13BV.INSTANCE;
        this(c06j1, 1, c13bv, c13bv, 0, true, true);
    }

    public C0JMP(C06J1 c06j1, int i, List<C0JMR> list, List<Long> list2, int i2, boolean z, boolean z2) {
        this.LL = c06j1;
        this.LLILLJJLI = i;
        this.LLILLL = list;
        this.LLILZ = list2;
        this.LLILZIL = i2;
        this.LLILZLL = z;
        this.LLIZ = z2;
    }

    public static C0JMP LIZ(C0JMP c0jmp, C06J1 c06j1, int i, List list, List list2, int i2, boolean z, boolean z2, int i3) {
        boolean z3 = z2;
        boolean z4 = z;
        int i4 = i2;
        List list3 = list2;
        List list4 = list;
        int i5 = i;
        C06J1 c06j12 = c06j1;
        if ((i3 & 1) != 0) {
            c06j12 = c0jmp.LL;
        }
        if ((i3 & 2) != 0) {
            i5 = c0jmp.LLILLJJLI;
        }
        if ((i3 & 4) != 0) {
            list4 = c0jmp.LLILLL;
        }
        if ((i3 & 8) != 0) {
            list3 = c0jmp.LLILZ;
        }
        if ((i3 & 16) != 0) {
            i4 = c0jmp.LLILZIL;
        }
        if ((i3 & 32) != 0) {
            z4 = c0jmp.LLILZLL;
        }
        if ((i3 & 64) != 0) {
            z3 = c0jmp.LLIZ;
        }
        c0jmp.getClass();
        return new C0JMP(c06j12, i5, list4, list3, i4, z4, z3);
    }
}
