package X;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Cw8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2246381Cw8 implements InterfaceC0148002o {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final Pair<Integer, Integer> LLILZ;
    public final String LLILZIL;
    public final EnumC2246361Cw6 LLILZLL;
    public final boolean LLIZ;
    public final C291001Au<Boolean> LLIZLLLIL;

    public C2246381Cw8() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2246381Cw8)) {
            return false;
        }
        C2246381Cw8 c2246381Cw8 = (C2246381Cw8) obj;
        return Intrinsics.LJFF(this.LL, c2246381Cw8.LL) && Intrinsics.LJFF(this.LLILLJJLI, c2246381Cw8.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c2246381Cw8.LLILLL) && Intrinsics.LJFF(this.LLILZ, c2246381Cw8.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c2246381Cw8.LLILZIL) && this.LLILZLL == c2246381Cw8.LLILZLL && this.LLIZ == c2246381Cw8.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c2246381Cw8.LLIZLLLIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31;
        String str = this.LLILZIL;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LLILZLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + this.LLIZLLLIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileEditBioState(originalBioContent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", lastValidBioContent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", curBioContent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", lastValidCursorPosition=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", searchKey=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", editMode=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isSaveButtonDisabled=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", shouldShowMentionLimitToast=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C2246381Cw8(int i) {
        this("", "", "", new Pair(0, 0), null, EnumC2246361Cw6.NORMAL, false, new C291001Au(Boolean.FALSE));
    }

    public C2246381Cw8(String str, String str2, String str3, Pair<Integer, Integer> pair, String str4, EnumC2246361Cw6 enumC2246361Cw6, boolean z, C291001Au<Boolean> c291001Au) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = pair;
        this.LLILZIL = str4;
        this.LLILZLL = enumC2246361Cw6;
        this.LLIZ = z;
        this.LLIZLLLIL = c291001Au;
    }

    public static C2246381Cw8 LIZ(C2246381Cw8 c2246381Cw8, String str, String str2, String str3, Pair pair, String str4, EnumC2246361Cw6 enumC2246361Cw6, boolean z, C291001Au c291001Au, int i) {
        C291001Au c291001Au2 = c291001Au;
        boolean z2 = z;
        EnumC2246361Cw6 enumC2246361Cw62 = enumC2246361Cw6;
        String str5 = str4;
        Pair pair2 = pair;
        String str6 = str3;
        String str7 = str2;
        String str8 = str;
        if ((i & 1) != 0) {
            str8 = c2246381Cw8.LL;
        }
        if ((i & 2) != 0) {
            str7 = c2246381Cw8.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            str6 = c2246381Cw8.LLILLL;
        }
        if ((i & 8) != 0) {
            pair2 = c2246381Cw8.LLILZ;
        }
        if ((i & 16) != 0) {
            str5 = c2246381Cw8.LLILZIL;
        }
        if ((i & 32) != 0) {
            enumC2246361Cw62 = c2246381Cw8.LLILZLL;
        }
        if ((i & 64) != 0) {
            z2 = c2246381Cw8.LLIZ;
        }
        if ((i & 128) != 0) {
            c291001Au2 = c2246381Cw8.LLIZLLLIL;
        }
        c2246381Cw8.getClass();
        return new C2246381Cw8(str8, str7, str6, pair2, str5, enumC2246361Cw62, z2, c291001Au2);
    }
}
