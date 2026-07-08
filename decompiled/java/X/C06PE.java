package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06PE, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06PE implements InterfaceC0148002o {
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final Boolean LLILZ;
    public final boolean LLILZIL;
    public final List<C869590Y9l> LLILZLL;
    public final List<InterfaceC1891350zJl> LLIZ;
    public final boolean LLIZLLLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C06PE)) {
            return false;
        }
        C06PE c06pe = (C06PE) obj;
        return this.LL == c06pe.LL && this.LLILLJJLI == c06pe.LLILLJJLI && this.LLILLL == c06pe.LLILLL && Intrinsics.LJFF(this.LLILZ, c06pe.LLILZ) && this.LLILZIL == c06pe.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c06pe.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c06pe.LLIZ) && this.LLIZLLLIL == c06pe.LLIZLLLIL;
    }

    public final int hashCode() {
        int iZ2 = ((((C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        Boolean bool = this.LLILZ;
        return ((((((((iZ2 + (bool == null ? 0 : bool.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLIZLLLIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageListVmState(isHighRiskConversation=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isMediaMessageMasking=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isAbleToInput=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isMessageStackFromBottom=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", hasMoreMessages=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", messageListDisplayed=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", messageItemsDisplayed=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", shouldSkipAppearingAnim=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C06PE(boolean z, boolean z2, boolean z3, Boolean bool, boolean z4, List<? extends C869590Y9l> list, List<? extends InterfaceC1891350zJl> list2, boolean z5) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = z3;
        this.LLILZ = bool;
        this.LLILZIL = z4;
        this.LLILZLL = list;
        this.LLIZ = list2;
        this.LLIZLLLIL = z5;
    }

    public static C06PE LIZ(C06PE c06pe, boolean z, boolean z2, boolean z3, boolean z4, List list, List list2, int i) {
        Boolean bool;
        boolean z5;
        List list3 = list2;
        boolean z6 = z4;
        boolean z7 = z3;
        boolean z8 = z2;
        List list4 = list;
        boolean z9 = z;
        if ((i & 1) != 0) {
            z9 = c06pe.LL;
        }
        if ((i & 2) != 0) {
            z8 = c06pe.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z7 = c06pe.LLILLL;
        }
        if ((i & 8) != 0) {
            bool = c06pe.LLILZ;
        } else {
            bool = null;
        }
        if ((i & 16) != 0) {
            z6 = c06pe.LLILZIL;
        }
        if ((i & 32) != 0) {
            list4 = c06pe.LLILZLL;
        }
        if ((i & 64) != 0) {
            list3 = c06pe.LLIZ;
        }
        if ((i & 128) != 0) {
            z5 = c06pe.LLIZLLLIL;
        } else {
            z5 = false;
        }
        c06pe.getClass();
        return new C06PE(z9, z8, z7, bool, z6, list4, list3, z5);
    }
}
