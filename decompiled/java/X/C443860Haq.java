package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Haq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C443860Haq implements InterfaceC0148002o {
    public final boolean LL;
    public final int LLILLJJLI;
    public final List<InterfaceC444050Hb9> LLILLL;
    public final C291001Au<Boolean> LLILZ;
    public final C291001Au<Boolean> LLILZIL;
    public final C291001Au<EnumC441890HUl> LLILZLL;

    public C443860Haq() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C443860Haq)) {
            return false;
        }
        C443860Haq c443860Haq = (C443860Haq) obj;
        return this.LL == c443860Haq.LL && this.LLILLJJLI == c443860Haq.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c443860Haq.LLILLL) && Intrinsics.LJFF(this.LLILZ, c443860Haq.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c443860Haq.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c443860Haq.LLILZLL);
    }

    public final int hashCode() {
        int iZ2 = ((((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode()) * 31;
        C291001Au<Boolean> c291001Au = this.LLILZ;
        int iHashCode = (iZ2 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<Boolean> c291001Au2 = this.LLILZIL;
        int iHashCode2 = (iHashCode + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<EnumC441890HUl> c291001Au3 = this.LLILZLL;
        return iHashCode2 + (c291001Au3 != null ? c291001Au3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerPanelState(isSideWaySwipeEnabled=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", currentPageIndex=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", emojiTypesList=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", redirectStickerStore=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", reportEnterPanelEvent=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", showInputIconRedDot=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C443860Haq(int i) {
        this(true, 0, C13BV.INSTANCE, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C443860Haq(boolean z, int i, List<? extends InterfaceC444050Hb9> list, C291001Au<Boolean> c291001Au, C291001Au<Boolean> c291001Au2, C291001Au<? extends EnumC441890HUl> c291001Au3) {
        this.LL = z;
        this.LLILLJJLI = i;
        this.LLILLL = list;
        this.LLILZ = c291001Au;
        this.LLILZIL = c291001Au2;
        this.LLILZLL = c291001Au3;
    }

    public static C443860Haq LIZ(C443860Haq c443860Haq, boolean z, int i, List list, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, int i2) {
        C291001Au c291001Au4 = c291001Au3;
        C291001Au c291001Au5 = c291001Au2;
        C291001Au c291001Au6 = c291001Au;
        List list2 = list;
        int i3 = i;
        boolean z2 = z;
        if ((i2 & 1) != 0) {
            z2 = c443860Haq.LL;
        }
        if ((i2 & 2) != 0) {
            i3 = c443860Haq.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            list2 = c443860Haq.LLILLL;
        }
        if ((i2 & 8) != 0) {
            c291001Au6 = c443860Haq.LLILZ;
        }
        if ((i2 & 16) != 0) {
            c291001Au5 = c443860Haq.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            c291001Au4 = c443860Haq.LLILZLL;
        }
        c443860Haq.getClass();
        return new C443860Haq(z2, i3, list2, c291001Au6, c291001Au5, c291001Au4);
    }
}
