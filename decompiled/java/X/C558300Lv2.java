package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lv2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C558300Lv2 implements C0DV5<C558300Lv2> {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final Function0<Unit> LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final Integer LLJ;
    public final boolean LLJI;

    public C558300Lv2() {
        this("", null, null, null, false, false, 144, 48, null, false);
    }

    @Override // X.C0DV5
    public C558300Lv2 build() {
        return this;
    }

    public final C558300Lv2 copy(String str, String str2, String str3, Function0<Unit> function0, boolean z, boolean z2, int i, int i2, Integer num, boolean z3) {
        return new C558300Lv2(str, str2, str3, function0, z, z2, i, i2, num, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C558300Lv2)) {
            return false;
        }
        C558300Lv2 c558300Lv2 = (C558300Lv2) obj;
        return Intrinsics.LJFF(this.LL, c558300Lv2.LL) && Intrinsics.LJFF(this.LLILLJJLI, c558300Lv2.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c558300Lv2.LLILLL) && Intrinsics.LJFF(this.LLILZ, c558300Lv2.LLILZ) && this.LLILZIL == c558300Lv2.LLILZIL && this.LLILZLL == c558300Lv2.LLILZLL && this.LLIZ == c558300Lv2.LLIZ && this.LLIZLLLIL == c558300Lv2.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c558300Lv2.LLJ) && this.LLJI == c558300Lv2.LLJI;
    }

    public int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Function0<Unit> function0 = this.LLILZ;
        int iHashCode4 = (((((((((iHashCode3 + (function0 == null ? 0 : function0.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + this.LLIZ) * 31) + this.LLIZLLLIL) * 31;
        Integer num = this.LLJ;
        return ((iHashCode4 + (num != null ? num.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJI);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NeonPillButtonConfig(text=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", avatarUrl=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", userName=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", visible=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", showAiBadge=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", widthDp=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", heightDp=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", iconRes=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", useNeonGlow=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0DV5
    public /* bridge */ /* synthetic */ C0DV5 build() {
        build();
        return this;
    }

    public final String getAvatarUrl() {
        return this.LLILLJJLI;
    }

    public final int getHeightDp() {
        return this.LLIZLLLIL;
    }

    public final Integer getIconRes() {
        return this.LLJ;
    }

    public final Function0<Unit> getOnClick() {
        return this.LLILZ;
    }

    public final boolean getShowAiBadge() {
        return this.LLILZLL;
    }

    public final String getText() {
        return this.LL;
    }

    public final boolean getUseNeonGlow() {
        return this.LLJI;
    }

    public final String getUserName() {
        return this.LLILLL;
    }

    public final boolean getVisible() {
        return this.LLILZIL;
    }

    public final int getWidthDp() {
        return this.LLIZ;
    }

    public C558300Lv2(String str, String str2, String str3, Function0<Unit> function0, boolean z, boolean z2, int i, int i2, Integer num, boolean z3) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = function0;
        this.LLILZIL = z;
        this.LLILZLL = z2;
        this.LLIZ = i;
        this.LLIZLLLIL = i2;
        this.LLJ = num;
        this.LLJI = z3;
    }
}
