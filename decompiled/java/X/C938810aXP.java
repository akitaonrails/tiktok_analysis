package X;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aXP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C938810aXP implements InterfaceC0148002o {
    public Integer LL;
    public Integer LLILLJJLI;
    public String LLILLL;
    public int LLILZ;
    public Rect LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C938810aXP)) {
            return false;
        }
        C938810aXP c938810aXP = (C938810aXP) obj;
        return Intrinsics.LJFF(this.LL, c938810aXP.LL) && Intrinsics.LJFF(this.LLILLJJLI, c938810aXP.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c938810aXP.LLILLL) && this.LLILZ == c938810aXP.LLILZ && Intrinsics.LJFF(this.LLILZIL, c938810aXP.LLILZIL);
    }

    public final int hashCode() {
        Integer num = this.LL;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.LLILLL;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.LLILZ) * 31;
        Rect rect = this.LLILZIL;
        return iHashCode3 + (rect != null ? rect.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestTheme(emptyMaskBackgroundColor=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", emptyMaskPlusIconResId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", playerBgFilePath=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", dividerType=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", playerForegroundClipRect=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C938810aXP(Integer num, Integer num2, String str, int i, Rect rect) {
        this.LL = num;
        this.LLILLJJLI = num2;
        this.LLILLL = str;
        this.LLILZ = i;
        this.LLILZIL = rect;
    }
}
