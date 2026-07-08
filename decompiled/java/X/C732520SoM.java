package X;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SoM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C732520SoM implements InterfaceC0148002o {
    public final boolean LL;
    public final C732600SoU LLILLJJLI;
    public final C732590SoT LLILLL;
    public final C291001Au<Boolean> LLILZ;
    public final Pair<Integer, Integer> LLILZIL;
    public final C732630SoX LLILZLL;
    public final C291001Au<Pair<EnumC733460Sps, Object>> LLIZ;

    public C732520SoM() {
        this(null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C732520SoM)) {
            return false;
        }
        C732520SoM c732520SoM = (C732520SoM) obj;
        return this.LL == c732520SoM.LL && Intrinsics.LJFF(this.LLILLJJLI, c732520SoM.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c732520SoM.LLILLL) && Intrinsics.LJFF(this.LLILZ, c732520SoM.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c732520SoM.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c732520SoM.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c732520SoM.LLIZ);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LL) * 31;
        C732600SoU c732600SoU = this.LLILLJJLI;
        int iHashCode = (iZ2 + (c732600SoU == null ? 0 : c732600SoU.hashCode())) * 31;
        C732590SoT c732590SoT = this.LLILLL;
        int iHashCode2 = (iHashCode + (c732590SoT == null ? 0 : c732590SoT.hashCode())) * 31;
        C291001Au<Boolean> c291001Au = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        Pair<Integer, Integer> pair = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (pair == null ? 0 : pair.hashCode())) * 31;
        C732630SoX c732630SoX = this.LLILZLL;
        int iHashCode5 = (iHashCode4 + (c732630SoX == null ? 0 : c732630SoX.hashCode())) * 31;
        C291001Au<Pair<EnumC733460Sps, Object>> c291001Au2 = this.LLIZ;
        return iHashCode5 + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoShareState(shareVisibility=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", shareCountState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", shareIconState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", containerAnimation=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", containerScale=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", shareContainerState=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", animationEvent=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C732520SoM(C732630SoX c732630SoX, int i) {
        this(false, null, null, null, null, (i & 32) != 0 ? null : c732630SoX, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C732520SoM(boolean z, C732600SoU c732600SoU, C732590SoT c732590SoT, C291001Au<Boolean> c291001Au, Pair<Integer, Integer> pair, C732630SoX c732630SoX, C291001Au<? extends Pair<? extends EnumC733460Sps, ? extends Object>> c291001Au2) {
        this.LL = z;
        this.LLILLJJLI = c732600SoU;
        this.LLILLL = c732590SoT;
        this.LLILZ = c291001Au;
        this.LLILZIL = pair;
        this.LLILZLL = c732630SoX;
        this.LLIZ = c291001Au2;
    }

    public static C732520SoM LIZ(C732520SoM c732520SoM, C732600SoU c732600SoU, C732590SoT c732590SoT, C291001Au c291001Au, Pair pair, C732630SoX c732630SoX, C291001Au c291001Au2, int i) {
        boolean z;
        C291001Au c291001Au3 = c291001Au2;
        C732630SoX c732630SoX2 = c732630SoX;
        Pair pair2 = pair;
        C291001Au c291001Au4 = c291001Au;
        C732590SoT c732590SoT2 = c732590SoT;
        C732600SoU c732600SoU2 = c732600SoU;
        if ((i & 1) != 0) {
            z = c732520SoM.LL;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            c732600SoU2 = c732520SoM.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c732590SoT2 = c732520SoM.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au4 = c732520SoM.LLILZ;
        }
        if ((i & 16) != 0) {
            pair2 = c732520SoM.LLILZIL;
        }
        if ((i & 32) != 0) {
            c732630SoX2 = c732520SoM.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au3 = c732520SoM.LLIZ;
        }
        c732520SoM.getClass();
        return new C732520SoM(z, c732600SoU2, c732590SoT2, c291001Au4, pair2, c732630SoX2, c291001Au3);
    }
}
